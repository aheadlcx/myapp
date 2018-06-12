package bili2.bl;

import bl.jqy.a;
import java.util.Collection;
import java.util.List;

/* compiled from: BL */
public abstract class jra extends jqy {
    public jra(jqi bl_jqi) {
        jgp.b(bl_jqi, "c");
        super(bl_jqi);
    }

    public /* synthetic */ jlu f() {
        return (jlu) g();
    }

    protected Void g() {
        return null;
    }

    protected a a(jsa bl_jsa, List<? extends jmb> list, kbf bl_kbf, List<? extends jme> list2) {
        jgp.b(bl_jsa, "method");
        jgp.b(list, "methodTypeParameters");
        jgp.b(bl_kbf, "returnType");
        jgp.b(list2, "valueParameters");
        return new a(bl_kbf, null, list2, list, false, jeh.a());
    }

    protected void a(jup bl_jup, Collection<jlr> collection) {
        jgp.b(bl_jup, "name");
        jgp.b(collection, "result");
    }
}
