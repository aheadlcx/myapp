package bili4.kotlin.reflect.jvm.internal.impl.builtins.functions;

import bl.jdv;
import bl.jeg;
import bl.jfy;
import bl.jgp;
import bl.jkq;
import bl.jks;
import bl.jlk;
import bl.jmb;
import bl.jmq;
import bl.jom;
import bl.jup;
import bl.kbf;
import bl.kbg;
import bl.kbv;
import bl.kcb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;

/* compiled from: BL */
final class FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1 extends Lambda implements jfy<jlk, jup, jdv> {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ a this$0;

    FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1(a aVar, ArrayList arrayList) {
        this.this$0 = aVar;
        this.$result = arrayList;
        super(2);
    }

    public final void a(jlk bl_jlk, jup bl_jup) {
        jgp.b(bl_jlk, "packageFragment");
        jgp.b(bl_jup, "name");
        jks c = bl_jlk.a().c(bl_jup, (jom) NoLookupLocation.FROM_BUILTINS);
        if (!(c instanceof jkq)) {
            c = null;
        }
        jkq bl_jkq = (jkq) c;
        if (bl_jkq != null) {
            kbv e = bl_jkq.e();
            List b = this.this$0.b();
            jgp.a(e, "typeConstructor");
            Iterable<jmb> e2 = jeg.e(b, e.b().size());
            Collection arrayList = new ArrayList(jeg.a(e2, 10));
            for (jmb bb_ : e2) {
                arrayList.add(new kcb((kbf) bb_.bb_()));
            }
            this.$result.add(kbg.a(jmq.a.a(), bl_jkq, (List) arrayList));
            return;
        }
        throw new IllegalStateException(("Class " + bl_jup + " not found in " + bl_jlk).toString());
    }
}
