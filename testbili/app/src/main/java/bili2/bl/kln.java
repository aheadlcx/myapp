package bili2.bl;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: BL */
public final class kln {
    private int a = 64;
    private int b = 5;
    @Nullable
    private Runnable c;
    @Nullable
    private ExecutorService d;
    private final Deque<a> e = new ArrayDeque();
    private final Deque<a> f = new ArrayDeque();
    private final Deque<klx> g = new ArrayDeque();

    public kln(ExecutorService executorService) {
        this.d = executorService;
    }

    public synchronized ExecutorService a() {
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), kmf.a("OkHttp Dispatcher", false));
        }
        return this.d;
    }

    synchronized void a(a aVar) {
        if (this.f.size() >= this.a || c(aVar) >= this.b) {
            this.e.add(aVar);
        } else {
            this.f.add(aVar);
            a().execute(aVar);
        }
    }

    public synchronized void b() {
        for (a b : this.e) {
            b.b().c();
        }
        for (a b2 : this.f) {
            b2.b().c();
        }
        for (klx c : this.g) {
            c.c();
        }
    }

    private void d() {
        if (this.f.size() < this.a && !this.e.isEmpty()) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (c(aVar) < this.b) {
                    it.remove();
                    this.f.add(aVar);
                    a().execute(aVar);
                }
                if (this.f.size() >= this.a) {
                    return;
                }
            }
        }
    }

    private int c(a aVar) {
        int i = 0;
        for (a a : this.f) {
            int i2;
            if (a.a().equals(aVar.a())) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            i = i2;
        }
        return i;
    }

    synchronized void a(klx bl_klx) {
        this.g.add(bl_klx);
    }

    void b(a aVar) {
        a(this.f, aVar, true);
    }

    void b(klx bl_klx) {
        a(this.g, bl_klx, false);
    }

    private <T> void a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    d();
                }
                int c = c();
                Runnable runnable = this.c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (c == 0 && runnable != null) {
            runnable.run();
        }
    }

    public synchronized int c() {
        return this.f.size() + this.g.size();
    }
}
