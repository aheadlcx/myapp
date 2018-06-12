package bili2.bl;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: BL */
public final class jwj extends kbm implements kbs {
    private final kbz a;
    private final jwk b;
    private final boolean c;
    private final jmq d;

    public /* synthetic */ kbm a(boolean z) {
        return c(z);
    }

    public /* synthetic */ kch b(jmq bl_jmq) {
        return a(bl_jmq);
    }

    public /* synthetic */ kch b(boolean z) {
        return c(z);
    }

    public /* synthetic */ kbm c(jmq bl_jmq) {
        return a(bl_jmq);
    }

    public /* synthetic */ kbv g() {
        return f();
    }

    public /* synthetic */ jwj(kbz bl_kbz, jwk bl_jwk, boolean z, jmq bl_jmq, int i, jgo bl_jgo) {
        if ((i & 2) != 0) {
            bl_jwk = new jwk(bl_kbz);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            bl_jmq = jmq.a.a();
        }
        this(bl_kbz, bl_jwk, z, bl_jmq);
    }

    public jwk f() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public jmq w() {
        return this.d;
    }

    public jwj(kbz bl_kbz, jwk bl_jwk, boolean z, jmq bl_jmq) {
        jgp.b(bl_kbz, "typeProjection");
        jgp.b(bl_jwk, "constructor");
        jgp.b(bl_jmq, "annotations");
        this.a = bl_kbz;
        this.b = bl_jwk;
        this.c = z;
        this.d = bl_jmq;
    }

    public List<kbz> a() {
        return jeh.a();
    }

    public jxp b() {
        jxp a = kay.a("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        jgp.a(a, "ErrorUtils.createErrorSc\u2026system resolution\", true)");
        return a;
    }

    public kbf d() {
        Variance variance = Variance.OUT_VARIANCE;
        kbm t = kdd.a((kbf) this).t();
        jgp.a(t, "builtIns.nullableAnyType");
        kbf a = a(variance, t);
        jgp.a(a, "representative(OUT_VARIA\u2026builtIns.nullableAnyType)");
        return a;
    }

    public kbf e() {
        Variance variance = Variance.IN_VARIANCE;
        kbm q = kdd.a((kbf) this).q();
        jgp.a(q, "builtIns.nothingType");
        kbf a = a(variance, q);
        jgp.a(a, "representative(IN_VARIANCE, builtIns.nothingType)");
        return a;
    }

    private final kbf a(Variance variance, kbf bl_kbf) {
        return this.a.b() == variance ? this.a.c() : bl_kbf;
    }

    public boolean a(kbf bl_kbf) {
        jgp.b(bl_kbf, "type");
        return f() == bl_kbf.g();
    }

    public String toString() {
        return "Captured(" + this.a + ')' + (c() ? "?" : gmy.d);
    }

    public jwj c(boolean z) {
        return z == c() ? this : new jwj(this.a, f(), z, w());
    }

    public jwj a(jmq bl_jmq) {
        jgp.b(bl_jmq, "newAnnotations");
        return new jwj(this.a, f(), c(), bl_jmq);
    }
}
