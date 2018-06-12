package bili2.bl;

import java.util.List;

/* compiled from: BL */
public final class jsr {
    private final jsy a;
    private final List<jsy> b;

    public jsr() {
        this(null, null, 3, null);
    }

    public jsr(jsy bl_jsy, List<jsy> list) {
        jgp.b(list, "parametersInfo");
        this.a = bl_jsy;
        this.b = list;
    }

    public /* synthetic */ jsr(jsy bl_jsy, List list, int i, jgo bl_jgo) {
        jsy bl_jsy2;
        if ((i & 1) != 0) {
            bl_jsy2 = (jsy) null;
        } else {
            bl_jsy2 = bl_jsy;
        }
        if ((i & 2) != 0) {
            list = jeh.a();
        }
        this(bl_jsy2, list);
    }

    public final jsy a() {
        return this.a;
    }

    public final List<jsy> b() {
        return this.b;
    }
}
