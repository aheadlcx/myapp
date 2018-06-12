package bili3.com.bilibili.avatar;

import bl.bbf;
import bl.ibn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BL */
public class Avatar {
    private static final Map<Class<? extends bbf>, WeakReference<bbf>> a = new HashMap();

    /* compiled from: BL */
    public static final class AvatarError extends Exception {
        private final int mCode;

        public AvatarError(String str, int i) {
            super(str);
            this.mCode = i;
        }

        public AvatarError(String str, Throwable th, int i) {
            super(str, th);
            this.mCode = i;
        }

        public AvatarError(Throwable th, int i) {
            super(th);
            this.mCode = i;
        }
    }

    public static bbf a(Class<? extends bbf> cls) {
        if (cls == null) {
            throw new NullPointerException("IApkChannel is null");
        }
        bbf bl_bbf;
        WeakReference weakReference = (WeakReference) a.get(cls);
        if (weakReference != null) {
            bl_bbf = (bbf) weakReference.get();
            if (bl_bbf != null) {
                return bl_bbf;
            }
        }
        bl_bbf = b(cls);
        a.put(cls, new WeakReference(bl_bbf));
        return bl_bbf;
    }

    private static bbf b(Class<? extends bbf> cls) {
        try {
            return (bbf) cls.newInstance();
        } catch (Throwable e) {
            ibn.a(e);
            throw new RuntimeException(e);
        }
    }
}
