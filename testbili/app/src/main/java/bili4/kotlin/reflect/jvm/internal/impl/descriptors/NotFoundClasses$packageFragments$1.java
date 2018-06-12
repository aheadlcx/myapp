package bili4.kotlin.reflect.jvm.internal.impl.descriptors;

import bl.jfn;
import bl.jgp;
import bl.jlj;
import bl.jnm;
import bl.jul;
import kotlin.jvm.internal.Lambda;

/* compiled from: BL */
public final class NotFoundClasses$packageFragments$1 extends Lambda implements jfn<jul, jnm> {
    final /* synthetic */ jlj this$0;

    public NotFoundClasses$packageFragments$1(jlj bl_jlj) {
        this.this$0 = bl_jlj;
        super(1);
    }

    public final jnm a(jul bl_jul) {
        jgp.b(bl_jul, "fqName");
        return new jnm(jlj.a(this.this$0), bl_jul);
    }
}
