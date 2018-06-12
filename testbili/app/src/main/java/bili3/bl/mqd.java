package bili3.bl;

import android.app.Activity;
import android.os.Build.VERSION;

/* compiled from: BL */
public class mqd {

    /* compiled from: BL */
    public interface a {
        void a(int i);
    }

    public static mqd a(Activity activity) {
        if (VERSION.SDK_INT >= 15) {
            return new mqe(activity);
        }
        return new mqd(activity);
    }

    public mqd(Activity activity) {
    }

    public void a(boolean z) {
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public void d() {
    }

    public void e() {
    }

    public void a(a aVar) {
    }
}
