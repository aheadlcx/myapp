package bili2.bl;

import java.util.List;

/* compiled from: BL */
public class kax extends kbm {
    private final kbv a;
    private final jxp b;
    private final List<kbz> c;
    private final boolean d;

    public kax(kbv bl_kbv, jxp bl_jxp) {
        this(bl_kbv, bl_jxp, null, false, 12, null);
    }

    public /* synthetic */ kch b(jmq bl_jmq) {
        return c(bl_jmq);
    }

    public /* synthetic */ kch b(boolean z) {
        return a(z);
    }

    public kbv g() {
        return this.a;
    }

    public jxp b() {
        return this.b;
    }

    public /* synthetic */ kax(kbv bl_kbv, jxp bl_jxp, List list, boolean z, int i, jgo bl_jgo) {
        if ((i & 4) != 0) {
            list = jeh.a();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        this(bl_kbv, bl_jxp, list, z);
    }

    public List<kbz> a() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public kax(kbv bl_kbv, jxp bl_jxp, List<? extends kbz> list, boolean z) {
        jgp.b(bl_kbv, "constructor");
        jgp.b(bl_jxp, "memberScope");
        jgp.b(list, "arguments");
        this.a = bl_kbv;
        this.b = bl_jxp;
        this.c = list;
        this.d = z;
    }

    public jmq w() {
        return jmq.a.a();
    }

    public String toString() {
        return g().toString() + (a().isEmpty() ? gmy.d : jem.a(a(), ", ", "<", ">", -1, "...", null));
    }

    public kbm c(jmq bl_jmq) {
        jgp.b(bl_jmq, "newAnnotations");
        return this;
    }

    public kbm a(boolean z) {
        return new kax(g(), b(), a(), z);
    }
}
