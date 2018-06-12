package bili2.bl;

import java.util.concurrent.Callable;

final /* synthetic */ class flp implements Callable {
    static final Callable a = new flp();

    private flp() {
    }

    public Object call() {
        return flm.a();
    }
}
