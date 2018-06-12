package bili2.bl;

import bl.gls.a;

public final /* synthetic */ class glt implements Runnable {
    private final a a;

    private glt(a aVar) {
        this.a = aVar;
    }

    public static Runnable a(a aVar) {
        return new glt(aVar);
    }

    public void run() {
        this.a.a();
    }
}
