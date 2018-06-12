package bili4.rx.internal.util;

import java.util.Queue;
import rx.Subscription;
import rx.exceptions.MissingBackpressureException;
import rx.internal.operators.NotificationLite;
import rx.internal.util.atomic.SpscAtomicArrayQueue;
import rx.internal.util.unsafe.SpmcArrayQueue;
import rx.internal.util.unsafe.SpscArrayQueue;
import rx.internal.util.unsafe.UnsafeAccess;
import u.aly.j;

/* compiled from: BL */
public class RxRingBuffer implements Subscription {
    public static final int SIZE;
    private Queue<Object> queue;
    private final int size;
    public volatile Object terminalState;

    static {
        int i = j.h;
        if (PlatformDependent.isAndroid()) {
            i = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                System.err.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        SIZE = i;
    }

    public static RxRingBuffer getSpscInstance() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            return new RxRingBuffer(false, SIZE);
        }
        return new RxRingBuffer();
    }

    public static RxRingBuffer getSpmcInstance() {
        if (UnsafeAccess.isUnsafeAvailable()) {
            return new RxRingBuffer(true, SIZE);
        }
        return new RxRingBuffer();
    }

    private RxRingBuffer(Queue<Object> queue, int i) {
        this.queue = queue;
        this.size = i;
    }

    private RxRingBuffer(boolean z, int i) {
        this.queue = z ? new SpmcArrayQueue(i) : new SpscArrayQueue(i);
        this.size = i;
    }

    public synchronized void release() {
    }

    public void unsubscribe() {
        release();
    }

    RxRingBuffer() {
        this(new SpscAtomicArrayQueue(SIZE), SIZE);
    }

    public void onNext(Object obj) throws MissingBackpressureException {
        Object obj2 = 1;
        Object obj3 = null;
        synchronized (this) {
            Queue queue = this.queue;
            if (queue == null) {
                int i = 1;
                obj2 = null;
            } else if (queue.offer(NotificationLite.next(obj))) {
                obj2 = null;
            }
        }
        if (obj3 != null) {
            throw new IllegalStateException("This instance has been unsubscribed and the queue is no longer usable.");
        } else if (obj2 != null) {
            throw new MissingBackpressureException();
        }
    }

    public void onCompleted() {
        if (this.terminalState == null) {
            this.terminalState = NotificationLite.completed();
        }
    }

    public boolean isEmpty() {
        Queue queue = this.queue;
        return queue == null || queue.isEmpty();
    }

    public Object poll() {
        Object obj = null;
        synchronized (this) {
            Queue queue = this.queue;
            if (queue == null) {
            } else {
                Object poll = queue.poll();
                obj = this.terminalState;
                if (poll == null && obj != null && queue.peek() == null) {
                    this.terminalState = null;
                } else {
                    obj = poll;
                }
            }
        }
        return obj;
    }

    public Object peek() {
        Object obj;
        synchronized (this) {
            Queue queue = this.queue;
            if (queue == null) {
                obj = null;
            } else {
                Object peek = queue.peek();
                obj = this.terminalState;
                if (!(peek == null && obj != null && queue.peek() == null)) {
                    obj = peek;
                }
            }
        }
        return obj;
    }

    public boolean isCompleted(Object obj) {
        return NotificationLite.isCompleted(obj);
    }

    public Object getValue(Object obj) {
        return NotificationLite.getValue(obj);
    }

    public boolean isUnsubscribed() {
        return this.queue == null;
    }
}
