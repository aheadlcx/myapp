package bili.bl;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Handler;
import android.view.View.OnSystemUiVisibilityChangeListener;
import bl.ekb.a;
import java.lang.ref.WeakReference;

@TargetApi(11)
/* compiled from: BL */
public class ekc extends ekb {
    private WeakReference<Activity> a;
    private boolean b;
    private a c;
    private Handler d = new Handler();
    private boolean e;
    private boolean f;
    private Runnable g = new Runnable(this) {
        final /* synthetic */ ekc a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.f();
        }
    };
    private Runnable h = new Runnable(this) {
        final /* synthetic */ ekc a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.e) {
                this.a.f = true;
            }
        }
    };
    private OnSystemUiVisibilityChangeListener i = new OnSystemUiVisibilityChangeListener(this) {
        final /* synthetic */ ekc a;

        {
            this.a = r1;
        }

        public void onSystemUiVisibilityChange(int i) {
            if (this.a.b && this.a.c != null) {
                this.a.c.a(i);
            }
        }
    };

    public ekc(Activity activity) {
        super(activity);
        this.a = new WeakReference(activity);
    }

    public void a(boolean z) {
        this.b = z;
    }

    public boolean a() {
        return this.b;
    }

    public boolean b() {
        return this.e;
    }

    public void c() {
        this.e = false;
        if (this.b) {
            Activity activity = (Activity) this.a.get();
            if (activity != null) {
                this.d.removeCallbacks(this.g);
                this.d.removeCallbacks(this.h);
                this.d.postDelayed(this.h, 5000);
                eka.b(activity);
            }
        }
    }

    public void d() {
        this.e = true;
        if (this.b && ((Activity) this.a.get()) != null) {
            this.d.removeCallbacks(this.g);
            this.d.postDelayed(this.h, 100);
        }
    }

    public void e() {
        this.d.removeCallbacks(this.g);
        this.d.removeCallbacks(this.g);
        this.e = true;
        this.f = true;
        f();
    }

    private void f() {
        if (this.e && this.b) {
            Activity activity = (Activity) this.a.get();
            if (activity == null) {
                return;
            }
            if (this.f) {
                this.d.removeCallbacks(this.g);
                eka.a(activity);
                return;
            }
            this.d.removeCallbacks(this.g);
            this.d.postDelayed(this.g, 1000);
        }
    }

    public void a(a aVar) {
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            this.c = aVar;
            eka.a(activity, this.i);
        }
    }
}
