package bili.bl;

import android.app.Activity;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: BL */
public final class cvw {
    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor(new a());
    private final Activity b;
    private ScheduledFuture<?> c = null;

    /* compiled from: BL */
    static final class a implements ThreadFactory {
        private a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: BL */
    static final class b implements Runnable {
        private final Activity a;

        public b(Activity activity) {
            this.a = activity;
        }

        public void run() {
            this.a.finish();
        }
    }

    public cvw(Activity activity) {
        this.b = activity;
        a();
    }

    public void a() {
        c();
        this.c = this.a.schedule(new b(this.b), 300, TimeUnit.SECONDS);
    }

    private void c() {
        if (this.c != null) {
            this.c.cancel(true);
            this.c = null;
        }
    }

    public void b() {
        c();
        this.a.shutdown();
    }
}
