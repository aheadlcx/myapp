package bili2.bl;

import android.net.Uri;
import android.support.annotation.VisibleForTesting;

/* compiled from: BL */
class fiz extends fjd {
    protected final Object a;

    @VisibleForTesting
    /* compiled from: BL */
    static class a extends fiz {
        public a(Uri uri) {
            super(uri, null);
        }

        public void b() {
            if (this.m != null) {
                this.m.a(this.l, f(), this.i);
            } else {
                fjb.a("Unsupported default route for uri " + f());
            }
        }
    }

    public fiz(Uri uri, Object obj) {
        super(uri);
        this.a = obj;
    }

    public <T> T a() {
        return this.a;
    }

    @Deprecated
    public void b() {
    }

    public <T> T c() {
        return this.a;
    }

    static fiz a(Uri uri) {
        return new a(uri);
    }
}
