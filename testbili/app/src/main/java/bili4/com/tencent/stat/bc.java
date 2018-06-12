package bili4.com.tencent.stat;

import java.util.List;

class bc implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bb e;

    bc(bb bbVar, List list, int i, boolean z, boolean z2) {
        this.e = bbVar;
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public void run() {
        this.e.a(this.a, this.b, this.c);
        if (this.d) {
            this.a.clear();
        }
    }
}
