package bili3.com.facebook.soloader;

/* compiled from: BL */
public final class SoLoader$WrongAbiError extends UnsatisfiedLinkError {
    SoLoader$WrongAbiError(Throwable th) {
        super("APK was built for a different platform");
        initCause(th);
    }
}
