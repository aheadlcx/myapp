package bili.bl;

import java.util.concurrent.Callable;

final /* synthetic */ class bkv implements Callable {
    private final bku a;

    bkv(bku bl_bku) {
        this.a = bl_bku;
    }

    public Object call() {
        return this.a.f();
    }
}
