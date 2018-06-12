package bili2.bl;

import java.util.concurrent.Callable;
import rx.Observable;
import rx.functions.Func1;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public final class frz {
    private static final String a = hae.a(new byte[]{(byte) 87, (byte) 125, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119});

    public static <T extends foe> Observable<T> a(final fof bl_fof, final String str, final Class<T> cls) {
        return Observable.fromCallable(new Callable<T>() {
            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public T a() throws Exception {
                T a = bl_fof.a(str, cls);
                BLog.d(hae.a(new byte[]{(byte) 87, (byte) 125, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96}));
                return a;
            }
        }).filter(new Func1<T, Boolean>() {
            public /* synthetic */ Object call(Object obj) {
                return a((foe) obj);
            }

            public Boolean a(T t) {
                return Boolean.valueOf(t != null);
            }
        });
    }
}
