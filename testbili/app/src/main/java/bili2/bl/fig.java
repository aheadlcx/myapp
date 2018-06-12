package bili2.bl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bilibili.lib.push.BPushPassThroughMessage;

/* compiled from: BL */
public final class fig {
    private static final String a = hae.a(new byte[]{(byte) 71, (byte) 85, (byte) 112, (byte) 118, (byte) 109, (byte) 72, (byte) 100, (byte) 107, (byte) 100, (byte) 98, (byte) 96, (byte) 119});
    private final Context b;
    private final fid c;
    private fil d;
    private int e = -1;

    fig(Context context, @NonNull fid bl_fid) {
        this.b = context;
        this.c = bl_fid;
    }

    synchronized boolean a() {
        return this.d != null;
    }

    synchronized void b() {
        if (this.e == -1 || this.d == null) {
            if (fis.a() && this.c.c()) {
                this.e = 3;
            } else if (fis.b() && this.c.a() != null) {
                this.e = 2;
            } else if (hma.a(this.b) && this.c.b() != null && this.c.b().c()) {
                this.e = 5;
            } else {
                this.e = this.c.g();
            }
            this.d = a(this.e);
        }
        if (this.e != 2) {
            fim.a(this.b, false);
        }
        if (this.d != null) {
            this.d.a(this.b);
        }
    }

    synchronized void c() {
        if (this.d != null && eva.a(this.b).a()) {
            this.d.c(this.b);
        }
    }

    synchronized void d() {
        if (this.d != null) {
            this.d.d(this.b);
        }
    }

    synchronized void e() {
        int g = this.c.g();
        if (g != this.e) {
            if (this.d != null) {
                this.d.b(this.b);
            }
            this.e = g;
            this.d = a(g);
            if (this.d != null) {
                this.d.a(this.b);
            }
        }
    }

    public synchronized fil f() {
        if (this.d == null) {
            b();
        }
        return this.d;
    }

    private fil a(int i) {
        if (i == 2) {
            return new fim(this, this.c.a());
        }
        if (i == 3) {
            return new fij(this);
        }
        if (i == 5) {
            return new fip(this, this.c.b());
        }
        return null;
    }

    public boolean a(Context context, BPushPassThroughMessage bPushPassThroughMessage) {
        return (bPushPassThroughMessage == null || bPushPassThroughMessage.a() || !this.c.d().a(context, bPushPassThroughMessage)) ? false : true;
    }

    public void a(Context context, fih bl_fih) {
        if (bl_fih != null && !TextUtils.isEmpty(bl_fih.b())) {
            this.c.d().a(context, bl_fih);
        }
    }
}
