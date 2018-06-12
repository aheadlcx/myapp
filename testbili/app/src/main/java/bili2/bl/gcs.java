package bili2.bl;

import java.util.List;
import rx.functions.Action1;

final /* synthetic */ class gcs implements Action1 {
    private final gcp a;
    private final boolean b;
    private final List c;

    gcs(gcp bl_gcp, boolean z, List list) {
        this.a = bl_gcp;
        this.b = z;
        this.c = list;
    }

    public void call(Object obj) {
        this.a.a(this.b, this.c, (Throwable) obj);
    }
}
