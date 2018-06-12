package bili2.bl;

import bl.gft.b;
import rx.functions.Action0;

final /* synthetic */ class gge implements Action0 {
    private final b a;

    private gge(b bVar) {
        this.a = bVar;
    }

    static Action0 a(b bVar) {
        return new gge(bVar);
    }

    public void call() {
        this.a.f();
    }
}
