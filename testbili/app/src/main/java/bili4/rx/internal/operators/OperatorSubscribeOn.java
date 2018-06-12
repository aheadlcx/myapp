package bili4.rx.internal.operators;

import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Producer;
import rx.Scheduler;
import rx.Scheduler.Worker;
import rx.Subscriber;
import rx.functions.Action0;

/* compiled from: BL */
public final class OperatorSubscribeOn<T> implements OnSubscribe<T> {
    final boolean requestOn;
    final Scheduler scheduler;
    final Observable<T> source;

    /* compiled from: BL */
    static final class SubscribeOnSubscriber<T> extends Subscriber<T> implements Action0 {
        final Subscriber<? super T> actual;
        final boolean requestOn;
        Observable<T> source;
        Thread t;
        final Worker worker;

        SubscribeOnSubscriber(Subscriber<? super T> subscriber, boolean z, Worker worker, Observable<T> observable) {
            this.actual = subscriber;
            this.requestOn = z;
            this.worker = worker;
            this.source = observable;
        }

        public void onNext(T t) {
            this.actual.onNext(t);
        }

        public void onError(Throwable th) {
            try {
                this.actual.onError(th);
            } finally {
                this.worker.unsubscribe();
            }
        }

        public void onCompleted() {
            try {
                this.actual.onCompleted();
            } finally {
                this.worker.unsubscribe();
            }
        }

        public void call() {
            Observable observable = this.source;
            this.source = null;
            this.t = Thread.currentThread();
            observable.unsafeSubscribe(this);
        }

        public void setProducer(final Producer producer) {
            this.actual.setProducer(new Producer() {
                public void request(final long j) {
                    if (SubscribeOnSubscriber.this.t == Thread.currentThread() || !SubscribeOnSubscriber.this.requestOn) {
                        producer.request(j);
                    } else {
                        SubscribeOnSubscriber.this.worker.schedule(new Action0() {
                            public void call() {
                                producer.request(j);
                            }
                        });
                    }
                }
            });
        }
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler, boolean z) {
        this.scheduler = scheduler;
        this.source = observable;
        this.requestOn = z;
    }

    public void call(Subscriber<? super T> subscriber) {
        Object createWorker = this.scheduler.createWorker();
        Object subscribeOnSubscriber = new SubscribeOnSubscriber(subscriber, this.requestOn, createWorker, this.source);
        subscriber.add(subscribeOnSubscriber);
        subscriber.add(createWorker);
        createWorker.schedule(subscribeOnSubscriber);
    }
}
