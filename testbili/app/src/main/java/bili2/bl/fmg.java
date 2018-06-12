package bili2.bl;

import bl.flu.e;

final /* synthetic */ class fmg implements Runnable {
    private final e a;
    private final String b;

    fmg(e eVar, String str) {
        this.a = eVar;
        this.b = str;
    }

    public void run() {
        this.a.b(this.b);
    }
}
