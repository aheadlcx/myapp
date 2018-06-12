package bili4.kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import bl.jfn;
import bl.jsf;
import bl.jsj;
import kotlin.jvm.internal.Lambda;

/* compiled from: BL */
public final class JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 extends Lambda implements jfn<jsf, Boolean> {
    public static final JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1 INSTANCE = new JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1();

    JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1() {
        super(1);
    }

    public /* synthetic */ Object a(Object obj) {
        return Boolean.valueOf(a((jsf) obj));
    }

    public final boolean a(jsf bl_jsf) {
        jsj bl_jsj = (jsj) (!(bl_jsf instanceof jsj) ? null : bl_jsf);
        if (bl_jsj != null) {
            return (bl_jsj.a() == null || bl_jsj.b()) ? false : true;
        } else {
            return false;
        }
    }
}
