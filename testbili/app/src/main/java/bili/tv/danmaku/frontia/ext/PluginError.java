package bili.tv.danmaku.frontia.ext;

/* compiled from: BL */
public abstract class PluginError extends Exception {
    private final int mCode;

    /* compiled from: BL */
    public static final class LoadError extends PluginError {
        public LoadError(String str, int i) {
            super(str, i);
        }

        public LoadError(Throwable th, int i) {
            super(th, i);
        }
    }

    public PluginError(String str, int i) {
        super(str);
        this.mCode = i;
    }

    public PluginError(Throwable th, int i) {
        super(th);
        this.mCode = i;
    }

    public int a() {
        return this.mCode;
    }

    public String toString() {
        return "PluginError{code=" + this.mCode + ", msg = " + super.toString() + '}';
    }
}
