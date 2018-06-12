package bili2.bl;

import bl.gkb.a;

public final /* synthetic */ class gkc implements Runnable {
    private final a a;

    private gkc(a aVar) {
        this.a = aVar;
    }

    public static Runnable a(a aVar) {
        return new gkc(aVar);
    }

    public void run() {
        this.a.a();
    }
}
