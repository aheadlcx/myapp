package bili4.kotlinx.serialization.json;

import bl.jds;
import bl.jfm;
import kotlin.jvm.internal.Lambda;

@jds(a = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, b = {"<anonymous>", "", "invoke"})
/* compiled from: BL */
final class JSON$Parser$nextString$2 extends Lambda implements jfm<String> {
    final /* synthetic */ c this$0;

    JSON$Parser$nextString$2(c cVar) {
        this.this$0 = cVar;
        super(0);
    }

    public /* synthetic */ Object a() {
        return b();
    }

    public final String b() {
        return "Invalid escaped char '" + ((char) this.this$0.a()) + '\'';
    }
}
