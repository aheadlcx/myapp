package bili2.bl;

import java.util.concurrent.Callable;
import tv.danmaku.bili.ui.attention.api.AttentionService;

final /* synthetic */ class lab implements Callable {
    private final String a;
    private final long b;
    private final int c;
    private final int d;

    lab(String str, long j, int i, int i2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public Object call() {
        return ((Void) gnt.b(((AttentionService) gnd.a(AttentionService.class)).changeRelation(this.a, this.b, this.c, this.d).g()));
    }
}
