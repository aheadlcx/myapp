package bili2.bl;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import bl.hc.c;
import com.facebook.common.memory.PooledByteBuffer;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* compiled from: BL */
public class hvz {
    private static hvz a = null;
    private final hzw b;
    private final hvx c;
    private hut<hns, hwq> d;
    private hvd<hns, hwq> e;
    private hut<hns, PooledByteBuffer> f;
    private hvd<hns, PooledByteBuffer> g;
    private huq h;
    private hog i;
    private hwi j;
    private hvw k;
    private hwb l;
    private hwc m;
    private huq n;
    private hog o;
    private hvb p;
    private huk q;
    private hxz r;
    private htw s;

    public static hvz a() {
        return (hvz) hpd.a(a, (Object) "ImagePipelineFactory was not initialized!");
    }

    public static void a(Context context) {
        a(hvx.a(context).a());
    }

    public static void a(hvx bl_hvx) {
        a = new hvz(bl_hvx);
    }

    public static void b() {
        if (a != null) {
            a.d().a(how.a());
            a.f().a(how.a());
            a = null;
        }
    }

    public hvz(hvx bl_hvx) {
        this.c = (hvx) hpd.a((Object) bl_hvx);
        this.b = new hzw(bl_hvx.j().e());
    }

    @Nullable
    private htw n() {
        if (this.s == null) {
            this.s = htx.a(j(), this.c.j(), c());
        }
        return this.s;
    }

    @Nullable
    public hwn b(Context context) {
        htw n = n();
        return n == null ? null : n.getAnimatedDrawableFactory(context);
    }

    public hut<hns, hwq> c() {
        if (this.d == null) {
            this.d = hum.a(this.c.b(), this.c.o(), j(), this.c.w().a(), this.c.c());
        }
        return this.d;
    }

    public hvd<hns, hwq> d() {
        if (this.e == null) {
            this.e = hun.a(c(), this.c.k());
        }
        return this.e;
    }

    public hut<hns, PooledByteBuffer> e() {
        if (this.f == null) {
            this.f = hux.a(this.c.i(), this.c.o(), j());
        }
        return this.f;
    }

    public hvd<hns, PooledByteBuffer> f() {
        if (this.g == null) {
            this.g = huy.a(e(), this.c.k());
        }
        return this.g;
    }

    private hwi o() {
        hwi bl_hwi = null;
        if (this.j == null) {
            if (this.c.l() != null) {
                this.j = this.c.l();
            } else {
                hwi gifDecoder;
                htw n = n();
                if (n != null) {
                    gifDecoder = n.getGifDecoder(this.c.a());
                    bl_hwi = n.getWebPDecoder(this.c.a());
                } else {
                    gifDecoder = null;
                }
                if (this.c.v() == null) {
                    this.j = new hwh(gifDecoder, bl_hwi, k());
                } else {
                    this.j = new hwh(gifDecoder, bl_hwi, k(), this.c.v().a());
                    htp.a().a(this.c.v().b());
                }
            }
        }
        return this.j;
    }

    public huq g() {
        if (this.h == null) {
            this.h = new huq(h(), this.c.q().e(), this.c.q().f(), this.c.j().a(), this.c.j().b(), this.c.k());
        }
        return this.h;
    }

    public hog h() {
        if (this.i == null) {
            this.i = this.c.g().a(this.c.n());
        }
        return this.i;
    }

    public hvw i() {
        if (this.k == null) {
            this.k = new hvw(q(), this.c.s(), this.c.m(), d(), f(), g(), r(), this.c.d(), this.b, hpg.a(Boolean.valueOf(false)));
        }
        return this.k;
    }

    public static huk a(hxo bl_hxo, hxz bl_hxz) {
        if (VERSION.SDK_INT >= 21) {
            return new huf(bl_hxo.a());
        }
        if (VERSION.SDK_INT >= 11) {
            return new huj(new hug(bl_hxo.e()), bl_hxz);
        }
        return new huh();
    }

    public huk j() {
        if (this.q == null) {
            this.q = a(this.c.q(), k());
        }
        return this.q;
    }

    public static hxz a(hxo bl_hxo, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            int c = bl_hxo.c();
            return new hxv(bl_hxo.a(), c, new c(c));
        } else if (!z || VERSION.SDK_INT >= 19) {
            return new hxy(bl_hxo.b());
        } else {
            return new hxx();
        }
    }

    public hxz k() {
        if (this.r == null) {
            this.r = a(this.c.q(), this.c.w().d());
        }
        return this.r;
    }

    private hwb p() {
        if (this.l == null) {
            this.l = this.c.w().m().a(this.c.e(), this.c.q().g(), o(), this.c.r(), this.c.h(), this.c.t(), this.c.w().e(), this.c.w().l(), this.c.j(), this.c.q().e(), d(), f(), g(), r(), m(), this.c.d(), j(), this.c.w().i(), this.c.w().j(), this.c.w().n());
        }
        return this.l;
    }

    private hwc q() {
        boolean z = VERSION.SDK_INT >= 24 && this.c.w().h();
        if (this.m == null) {
            this.m = new hwc(this.c.e().getApplicationContext().getContentResolver(), p(), this.c.p(), this.c.t(), this.c.w().d(), this.b, this.c.w().c(), z, this.c.w().k());
        }
        return this.m;
    }

    public hog l() {
        if (this.o == null) {
            this.o = this.c.g().a(this.c.u());
        }
        return this.o;
    }

    private huq r() {
        if (this.n == null) {
            this.n = new huq(l(), this.c.q().e(), this.c.q().f(), this.c.j().a(), this.c.j().b(), this.c.k());
        }
        return this.n;
    }

    public hvb m() {
        if (this.p == null) {
            this.p = this.c.w().b() ? new hvc(this.c.e(), this.c.j().a(), this.c.j().b(), hqd.b()) : new hvi();
        }
        return this.p;
    }
}
