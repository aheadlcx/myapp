package bili2.bl;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class gxk implements Callable {
    private final gxj a;
    private final Context b;

    gxk(gxj bl_gxj, Context context) {
        this.a = bl_gxj;
        this.b = context;
    }

    public Object call() {
        return this.a.f(this.b);
    }
}
