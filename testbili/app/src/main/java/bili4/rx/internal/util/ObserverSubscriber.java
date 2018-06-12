package bili4.rx.internal.util;

import rx.Observer;
import rx.Subscriber;

/* compiled from: BL */
public final class ObserverSubscriber<T> extends Subscriber<T> {
    final Observer<? super T> observer;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.observer = observer;
    }

    public void onNext(T t) {
        this.observer.onNext(t);
    }

    public void onError(Throwable th) {
        this.observer.onError(th);
    }

    public void onCompleted() {
        this.observer.onCompleted();
    }
}
