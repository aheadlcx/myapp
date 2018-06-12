package bili4.rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.Scheduler.Worker;
import rx.Subscription;
import rx.functions.Action0;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: BL */
public final class SchedulePeriodicHelper {
    public static final long CLOCK_DRIFT_TOLERANCE_NANOS = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: BL */
    public interface NowNanoSupplier {
        long nowNanos();
    }

    public static Subscription schedulePeriodically(Worker worker, Action0 action0, long j, long j2, TimeUnit timeUnit, NowNanoSupplier nowNanoSupplier) {
        final long toNanos = timeUnit.toNanos(j2);
        final long nowNanos = nowNanoSupplier != null ? nowNanoSupplier.nowNanos() : TimeUnit.MILLISECONDS.toNanos(worker.now());
        final long toNanos2 = nowNanos + timeUnit.toNanos(j);
        Object sequentialSubscription = new SequentialSubscription();
        final Subscription sequentialSubscription2 = new SequentialSubscription(sequentialSubscription);
        final Action0 action02 = action0;
        final NowNanoSupplier nowNanoSupplier2 = nowNanoSupplier;
        final Worker worker2 = worker;
        sequentialSubscription.replace(worker.schedule(new Action0() {
            long count;
            long lastNowNanos = nowNanos;
            long startInNanos = toNanos2;

            public void call() {
                action02.call();
                if (!sequentialSubscription2.isUnsubscribed()) {
                    long nowNanos;
                    long j;
                    if (nowNanoSupplier2 != null) {
                        nowNanos = nowNanoSupplier2.nowNanos();
                    } else {
                        nowNanos = TimeUnit.MILLISECONDS.toNanos(worker2.now());
                    }
                    long j2;
                    if (SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS + nowNanos < this.lastNowNanos || nowNanos >= (this.lastNowNanos + toNanos) + SchedulePeriodicHelper.CLOCK_DRIFT_TOLERANCE_NANOS) {
                        j = toNanos + nowNanos;
                        j2 = toNanos;
                        long j3 = this.count + 1;
                        this.count = j3;
                        this.startInNanos = j - (j2 * j3);
                    } else {
                        j = this.startInNanos;
                        j2 = this.count + 1;
                        this.count = j2;
                        j += j2 * toNanos;
                    }
                    this.lastNowNanos = nowNanos;
                    sequentialSubscription2.replace(worker2.schedule(this, j - nowNanos, TimeUnit.NANOSECONDS));
                }
            }
        }, j, timeUnit));
        return sequentialSubscription2;
    }
}
