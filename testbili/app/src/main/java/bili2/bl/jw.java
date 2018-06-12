package bili2.bl;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.VisibleForTesting;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

@RequiresApi(14)
/* compiled from: BL */
class jw extends jv {
    private int t = -100;
    private boolean u;
    private boolean v = true;
    private b w;

    /* compiled from: BL */
    class a extends b {
        final /* synthetic */ jw c;

        a(jw jwVar, Callback callback) {
            this.c = jwVar;
            super(jwVar, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (this.c.p()) {
                return a(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        final ActionMode a(ActionMode.Callback callback) {
            Object aVar = new bl.lg.a(this.c.a, callback);
            lc a = this.c.a(aVar);
            if (a != null) {
                return aVar.b(a);
            }
            return null;
        }
    }

    @VisibleForTesting
    /* compiled from: BL */
    final class b {
        final /* synthetic */ jw a;
        private ke b;
        private boolean c;
        private BroadcastReceiver d;
        private IntentFilter e;

        b(jw jwVar, @NonNull ke keVar) {
            this.a = jwVar;
            this.b = keVar;
            this.c = keVar.a();
        }

        final int a() {
            this.c = this.b.a();
            return this.c ? 2 : 1;
        }

        final void b() {
            boolean a = this.b.a();
            if (a != this.c) {
                this.c = a;
                this.a.j();
            }
        }

        final void c() {
            d();
            if (this.d == null) {
                this.d = new BroadcastReceiver(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void onReceive(Context context, Intent intent) {
                        this.a.b();
                    }
                };
            }
            if (this.e == null) {
                this.e = new IntentFilter();
                this.e.addAction("android.intent.action.TIME_SET");
                this.e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.e.addAction("android.intent.action.TIME_TICK");
            }
            this.a.a.registerReceiver(this.d, this.e);
        }

        final void d() {
            if (this.d != null) {
                this.a.a.unregisterReceiver(this.d);
                this.d = null;
            }
        }
    }

    jw(Context context, Window window, jr jrVar) {
        super(context, window, jrVar);
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        if (bundle != null && this.t == -100) {
            this.t = bundle.getInt("appcompat:local_night_mode", -100);
        }
    }

    Callback a(Callback callback) {
        return new a(this, callback);
    }

    public boolean p() {
        return this.v;
    }

    public boolean j() {
        boolean z = false;
        int x = x();
        int d = d(x);
        if (d != -1) {
            z = h(d);
        }
        if (x == 0) {
            y();
            this.w.c();
        }
        this.u = true;
        return z;
    }

    public void c() {
        super.c();
        j();
    }

    public void d() {
        super.d();
        if (this.w != null) {
            this.w.d();
        }
    }

    int d(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                y();
                return this.w.a();
            default:
                return i;
        }
    }

    private int x() {
        return this.t != -100 ? this.t : k();
    }

    public void c(Bundle bundle) {
        super.c(bundle);
        if (this.t != -100) {
            bundle.putInt("appcompat:local_night_mode", this.t);
        }
    }

    public void g() {
        super.g();
        if (this.w != null) {
            this.w.d();
        }
    }

    private boolean h(int i) {
        Resources resources = this.a.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (z()) {
            ((Activity) this.a).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            if (VERSION.SDK_INT < 26) {
                kb.a(resources);
            }
        }
        return true;
    }

    private void y() {
        if (this.w == null) {
            this.w = new b(this, ke.a(this.a));
        }
    }

    private boolean z() {
        if (!this.u || !(this.a instanceof Activity)) {
            return false;
        }
        try {
            if ((this.a.getPackageManager().getActivityInfo(new ComponentName(this.a, this.a.getClass()), 0).configChanges & 512) == 0) {
                return true;
            }
            return false;
        } catch (Throwable e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }
}
