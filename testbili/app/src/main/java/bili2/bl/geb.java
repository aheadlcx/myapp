package bili2.bl;

import bl.gdm.b;
import rx.functions.Action0;

final /* synthetic */ class geb implements Action0 {
    private final b a;

    private geb(b bVar) {
        this.a = bVar;
    }

    static Action0 a(b bVar) {
        return new geb(bVar);
    }

    public void call() {
        this.a.a();
    }
}
