package bili2.bl;

import bl.fzf.a;

public final /* synthetic */ class fzn implements Runnable {
    private final a a;

    private fzn(a aVar) {
        this.a = aVar;
    }

    public static Runnable a(a aVar) {
        return new fzn(aVar);
    }

    public void run() {
        this.a.c();
    }
}
