package bili3.bl;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class rl implements rr, Runnable {
    private static rl a = new rl();
    private ra b;
    private Handler c;
    private Map<String, rh> d = new ConcurrentHashMap();
    private Runnable e = new ro(this);
    private Runnable f = new rq(this);
    private Map<String, a> g = new HashMap();

    class a {
        public long a;
        public int b;

        private a() {
        }
    }

    private rl() {
    }

    static /* synthetic */ a a(rl rlVar, String str) {
        a aVar = (a) rlVar.g.get(str);
        if (aVar != null) {
            return aVar;
        }
        aVar = new a();
        rlVar.g.put(str, aVar);
        return aVar;
    }

    static /* synthetic */ int b(int i) {
        String str = i == 0 ? "http_platform_update_interval_succ" : (i == -4 || i == -3) ? "http_platform_update_interval_nonet" : "http_platform_update_interval_fail";
        int i2 = i == 0 ? 1800000 : (i == -4 || i == -3) ? 60000 : 300000;
        return up.a(str, 60000, 3600000, i2);
    }

    public static rl c() {
        return a;
    }

    public final void a() {
        ((rh) this.d.get("accessscheduler")).a();
    }

    public final void a(int i) {
        if (i == 1 || i == 2) {
            this.c.removeCallbacks(this.e);
            this.c.post(this.e);
        }
    }

    public final void a(ra raVar) {
        this.b = raVar;
        rh rpVar = new rp();
        this.d.put(rpVar.c(), rpVar);
        rpVar = new rj();
        this.d.put(rpVar.c(), rpVar);
        rpVar = new rm();
        this.d.put(rpVar.c(), rpVar);
    }

    public final void a(String str) {
    }

    public final void a_() {
        ((rh) this.d.get("settings")).a_();
    }

    public final ra d() {
        return this.b;
    }

    public final void e() {
        HandlerThread handlerThread = new HandlerThread("HttpPlatformConnection");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        this.c.post(this);
        this.b.b();
    }

    public final void run() {
        if (up.a("http_platform_start_update_on", 0, 1, 1) == 1) {
            this.c.post(this.f);
        }
    }
}
