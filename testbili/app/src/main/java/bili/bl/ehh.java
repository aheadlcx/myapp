package bili.bl;

import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: BL */
public abstract class ehh {
    WeakReference<ehg> a;

    /* compiled from: BL */
    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    /* compiled from: BL */
    public static abstract class b implements a {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(Interpolator interpolator);

    public abstract void a(a aVar);

    public ehh(ehg bl_ehg) {
        this.a = new WeakReference(bl_ehg);
    }
}
