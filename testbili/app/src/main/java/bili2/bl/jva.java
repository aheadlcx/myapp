package bili2.bl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e;

/* compiled from: BL */
public class jva {
    private static volatile boolean a = false;
    private static final jva c = new jva(true);
    private final Map<a, e<?, ?>> b;

    /* compiled from: BL */
    static final class a {
        private final Object a;
        private final int b;

        a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }
    }

    public static jva a() {
        return new jva();
    }

    public static jva b() {
        return c;
    }

    public <ContainingType extends jvi> e<ContainingType, ?> a(ContainingType containingType, int i) {
        return (e) this.b.get(new a(containingType, i));
    }

    public final void a(e<?, ?> eVar) {
        this.b.put(new a(eVar.a(), eVar.b()), eVar);
    }

    jva() {
        this.b = new HashMap();
    }

    private jva(boolean z) {
        this.b = Collections.emptyMap();
    }
}
