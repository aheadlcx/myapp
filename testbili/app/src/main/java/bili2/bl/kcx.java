package bili2.bl;

/* compiled from: BL */
public final class kcx {
    public static final kcx a = new kcx();

    private kcx() {
    }

    public final boolean a(kch bl_kch, kch bl_kch2) {
        jgp.b(bl_kch, "a");
        jgp.b(bl_kch2, "b");
        if (bl_kch == bl_kch2) {
            return true;
        }
        if ((bl_kch instanceof kbm) && (bl_kch2 instanceof kbm)) {
            return a((kbm) bl_kch, (kbm) bl_kch2);
        }
        if (!(bl_kch instanceof kaz) || !(bl_kch2 instanceof kaz)) {
            return false;
        }
        boolean z = a(((kaz) bl_kch).f(), ((kaz) bl_kch2).f()) && a(((kaz) bl_kch).h(), ((kaz) bl_kch2).h());
        return z;
    }

    public final boolean a(kbm bl_kbm, kbm bl_kbm2) {
        jgp.b(bl_kbm, "a");
        jgp.b(bl_kbm2, "b");
        if (bl_kbm.c() != bl_kbm2.c() || kbp.c(bl_kbm) != kbp.c(bl_kbm2) || (jgp.a(bl_kbm.g(), bl_kbm2.g()) ^ 1) != 0 || bl_kbm.a().size() != bl_kbm2.a().size()) {
            return false;
        }
        if (bl_kbm.a() == bl_kbm2.a()) {
            return true;
        }
        int size = bl_kbm.a().size();
        for (int i = 0; i < size; i++) {
            kbz bl_kbz = (kbz) bl_kbm.a().get(i);
            kbz bl_kbz2 = (kbz) bl_kbm2.a().get(i);
            if (bl_kbz.a() != bl_kbz2.a()) {
                return false;
            }
            if (!bl_kbz.a()) {
                if (bl_kbz.b() != bl_kbz2.b()) {
                    return false;
                }
                if (!a(bl_kbz.c().l(), bl_kbz2.c().l())) {
                    return false;
                }
            }
        }
        return true;
    }
}
