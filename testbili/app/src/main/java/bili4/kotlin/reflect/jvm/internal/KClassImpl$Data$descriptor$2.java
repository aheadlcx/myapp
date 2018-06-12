package bili4.kotlin.reflect.jvm.internal;

import bl.jds;
import bl.jfm;
import bl.jil;
import bl.jil.a;
import bl.jjt;
import bl.jkq;
import bl.jld;
import bl.juk;
import kotlin.jvm.internal.Lambda;

@jds(a = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n\u00a2\u0006\u0002\b\u0004"}, b = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "T", "", "invoke"})
/* compiled from: BL */
public final class KClassImpl$Data$descriptor$2 extends Lambda implements jfm<jkq> {
    final /* synthetic */ a this$0;

    public KClassImpl$Data$descriptor$2(a aVar) {
        this.this$0 = aVar;
        super(0);
    }

    public /* synthetic */ Object a() {
        return b();
    }

    public final jkq b() {
        jkq a;
        juk a2 = jil.a(this.this$0.b);
        jjt i = ((a) this.this$0.b.c().a()).i();
        if (a2.d()) {
            a = i.b().a(a2);
        } else {
            a = jld.a(i.a(), a2);
        }
        if (a != null) {
            return a;
        }
        jil.b(this.this$0.b);
        throw null;
    }
}
