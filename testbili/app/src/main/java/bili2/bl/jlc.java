package bili2.bl;

/* compiled from: BL */
public final class jlc {
    public static final jkq a(jlh bl_jlh, jul bl_jul, jom bl_jom) {
        jgp.b(bl_jlh, "$receiver");
        jgp.b(bl_jul, "fqName");
        jgp.b(bl_jom, "lookupLocation");
        if (bl_jul.c()) {
            return null;
        }
        jul d = bl_jul.d();
        jgp.a(d, "fqName.parent()");
        jxp c = bl_jlh.a(d).c();
        jup e = bl_jul.e();
        jgp.a(e, "fqName.shortName()");
        jks c2 = c.c(e, bl_jom);
        if (!(c2 instanceof jkq)) {
            c2 = null;
        }
        jkq bl_jkq = (jkq) c2;
        if (bl_jkq != null) {
            return bl_jkq;
        }
        d = bl_jul.d();
        jgp.a(d, "fqName.parent()");
        bl_jkq = a(bl_jlh, d, bl_jom);
        if (bl_jkq != null) {
            c = bl_jkq.B();
            if (c != null) {
                e = bl_jul.e();
                jgp.a(e, "fqName.shortName()");
                c2 = c.c(e, bl_jom);
                if (!(c2 instanceof jkq)) {
                    c2 = null;
                }
                return (jkq) c2;
            }
        }
        c2 = null;
        if (c2 instanceof jkq) {
            c2 = null;
        }
        return (jkq) c2;
    }
}
