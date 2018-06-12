package bili4.kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bl.jfn;
import bl.jgp;
import bl.jrz;
import kotlin.jvm.internal.Lambda;

/* compiled from: BL */
public final class LazyJavaStaticClassScope$computeMemberIndex$1 extends Lambda implements jfn<jrz, Boolean> {
    public static final LazyJavaStaticClassScope$computeMemberIndex$1 INSTANCE = new LazyJavaStaticClassScope$computeMemberIndex$1();

    LazyJavaStaticClassScope$computeMemberIndex$1() {
        super(1);
    }

    public /* synthetic */ Object a(Object obj) {
        return Boolean.valueOf(a((jrz) obj));
    }

    public final boolean a(jrz bl_jrz) {
        jgp.b(bl_jrz, "it");
        return bl_jrz.o();
    }
}
