package bili2.bl;

import java.util.ServiceLoader;

/* compiled from: BL */
public interface jjy {
    public static final a a = a.a;

    /* compiled from: BL */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final jjy b;

        static {
            ServiceLoader load = ServiceLoader.load(jjy.class, jjy.class.getClassLoader());
            jgp.a(load, "ServiceLoader.load(Built\u2026::class.java.classLoader)");
            Object b = jem.b((Iterable) load);
            jgp.a(b, "ServiceLoader.load(Built\u2026java.classLoader).first()");
            b = (jjy) b;
        }

        private a() {
        }

        public final jjy a() {
            return b;
        }
    }

    jll a(kai bl_kai, jlh bl_jlh, Iterable<? extends jmx> iterable, jmy bl_jmy, jmw bl_jmw);
}
