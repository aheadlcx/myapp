package bili4.kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import bl.jeg;
import bl.jfm;
import bl.jup;
import java.util.Set;
import kotlin.jvm.internal.Lambda;

/* compiled from: BL */
public final class DeserializedMemberScope$classNames$2 extends Lambda implements jfm<Set<? extends jup>> {
    final /* synthetic */ jfm $classNames;

    public DeserializedMemberScope$classNames$2(jfm bl_jfm) {
        this.$classNames = bl_jfm;
        super(0);
    }

    public /* synthetic */ Object a() {
        return b();
    }

    public final Set<jup> b() {
        return jeg.n((Iterable) this.$classNames.a());
    }
}
