package bili4.kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bl.jeg;
import bl.jfn;
import bl.jgp;
import bl.jlr;
import bl.jqp;
import bl.jqy;
import bl.jrx;
import bl.jup;
import bl.jwc;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: BL */
public final class LazyJavaScope$properties$1 extends Lambda implements jfn<jup, List<? extends jlr>> {
    final /* synthetic */ jqy this$0;

    public LazyJavaScope$properties$1(jqy bl_jqy) {
        this.this$0 = bl_jqy;
        super(1);
    }

    public final List<jlr> a(jup bl_jup) {
        jgp.b(bl_jup, "name");
        ArrayList arrayList = new ArrayList();
        jrx b = ((jqp) this.this$0.i().a()).b(bl_jup);
        if (!(b == null || b.c())) {
            arrayList.add(jqy.a(this.this$0, b));
        }
        this.this$0.a(bl_jup, arrayList);
        if (jwc.n(this.this$0.h())) {
            return jeg.l(arrayList);
        }
        return jeg.l(this.this$0.j().e().q().a(this.this$0.j(), arrayList));
    }
}
