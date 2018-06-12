package bili2.bl;

import bl.lha.a;
import java.util.HashMap;

final /* synthetic */ class lhb implements Runnable {
    private final a a;
    private final HashMap b;

    lhb(a aVar, HashMap hashMap) {
        this.a = aVar;
        this.b = hashMap;
    }

    public void run() {
        this.a.a(this.b);
    }
}
