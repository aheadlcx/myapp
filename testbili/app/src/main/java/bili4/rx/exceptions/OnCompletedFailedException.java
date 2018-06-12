package bili4.rx.exceptions;

/* compiled from: BL */
public final class OnCompletedFailedException extends RuntimeException {
    public OnCompletedFailedException(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }
}
