package bili3.com.sobot.chat.core.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import bl.ibn;
import bl.ipv;
import bl.ipw;
import bl.ipx;
import bl.ipy;
import bl.ipz;
import bl.iqa;
import bl.iqb;
import bl.iqc;
import bl.iqd;
import com.sobot.chat.core.a.a.i;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: BL */
public class a {
    public static final String b = a.class.getSimpleName();
    private Timer A;
    private TimerTask B;
    final a a;
    private ipv c;
    private String d;
    private i e;
    private iqa f;
    private Socket g;
    private iqb h;
    private ipz i;
    private e j;
    private boolean k;
    private LinkedBlockingQueue<iqc> l;
    private long m;
    private long n;
    private long o;
    private iqc p;
    private iqd q;
    private long r;
    private a s;
    private b t;
    private d u;
    private c v;
    private ArrayList<ipw> w;
    private ArrayList<ipy> x;
    private ArrayList<ipx> y;
    private f z;

    /* compiled from: BL */
    class a extends Thread {
        final /* synthetic */ a a;

        private a(a aVar) {
            this.a = aVar;
        }

        public void run() {
            super.run();
            try {
                ipv b = this.a.a.m().b();
                if (!Thread.interrupted()) {
                    this.a.a.k().setTcpNoDelay(true);
                    this.a.a.k().setKeepAlive(true);
                    this.a.a.k().setSoTimeout(50000);
                    this.a.a.k().connect(b.d(), b.g());
                    if (!Thread.interrupted()) {
                        this.a.a.a(e.Connected);
                        this.a.a.a(System.currentTimeMillis());
                        this.a.a.b(System.currentTimeMillis());
                        this.a.a.c(-1);
                        this.a.a.b(null);
                        this.a.a.a(null);
                        this.a.a.a(null);
                        this.a.a.C();
                    }
                }
            } catch (Throwable e) {
                ibn.a(e);
                this.a.a.b();
            }
        }
    }

    /* compiled from: BL */
    class b extends Thread {
        final /* synthetic */ a a;

        private b(a aVar) {
            this.a = aVar;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r3 = this;
            r2 = 0;
            super.run();
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.s;
            if (r0 == 0) goto L_0x0020;
        L_0x000e:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.t();
            r0.interrupt();
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
        L_0x0020:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.k();
            r0 = r0.isClosed();
            if (r0 == 0) goto L_0x0038;
        L_0x002e:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.e();
            if (r0 == 0) goto L_0x0068;
        L_0x0038:
            r0 = r3.a;	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r0.a;	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r0.k();	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r0.getOutputStream();	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0.close();	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r3.a;	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r0.a;	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r0.k();	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r0.getInputStream();	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0.close();	 Catch:{ Exception -> 0x00ea, all -> 0x0104 }
            r0 = r3.a;	 Catch:{ Exception -> 0x00e4 }
            r0 = r0.a;	 Catch:{ Exception -> 0x00e4 }
            r0 = r0.k();	 Catch:{ Exception -> 0x00e4 }
            r0.close();	 Catch:{ Exception -> 0x00e4 }
        L_0x0061:
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
        L_0x0068:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.u;
            if (r0 == 0) goto L_0x0084;
        L_0x0072:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.v();
            r0.interrupt();
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
        L_0x0084:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.v;
            if (r0 == 0) goto L_0x00a0;
        L_0x008e:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.w();
            r0.interrupt();
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
        L_0x00a0:
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
            r0 = r3.a;
            r0.E();
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.q();
            if (r0 == 0) goto L_0x00cc;
        L_0x00b6:
            r0 = r3.a;
            r0 = r0.a;
            r1 = r3.a;
            r1 = r1.a;
            r1 = r1.q();
            r0.f(r1);
            r0 = r3.a;
            r0 = r0.a;
            r0.b(r2);
        L_0x00cc:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.p();
            r0 = r0.poll();
            r0 = (bl.iqc) r0;
            if (r0 == 0) goto L_0x011d;
        L_0x00dc:
            r1 = r3.a;
            r1 = r1.a;
            r1.f(r0);
            goto L_0x00cc;
        L_0x00e4:
            r0 = move-exception;
            bl.ibn.a(r0);
            goto L_0x0061;
        L_0x00ea:
            r0 = move-exception;
            r0 = r3.a;	 Catch:{ Exception -> 0x00ff }
            r0 = r0.a;	 Catch:{ Exception -> 0x00ff }
            r0 = r0.k();	 Catch:{ Exception -> 0x00ff }
            r0.close();	 Catch:{ Exception -> 0x00ff }
        L_0x00f6:
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
            goto L_0x0068;
        L_0x00ff:
            r0 = move-exception;
            bl.ibn.a(r0);
            goto L_0x00f6;
        L_0x0104:
            r0 = move-exception;
            r1 = r3.a;	 Catch:{ Exception -> 0x0118 }
            r1 = r1.a;	 Catch:{ Exception -> 0x0118 }
            r1 = r1.k();	 Catch:{ Exception -> 0x0118 }
            r1.close();	 Catch:{ Exception -> 0x0118 }
        L_0x0110:
            r1 = r3.a;
            r1 = r1.a;
            r1.a(r2);
            throw r0;
        L_0x0118:
            r1 = move-exception;
            bl.ibn.a(r1);
            goto L_0x0110;
        L_0x011d:
            r0 = r3.a;
            r0 = r0.a;
            r0 = r0.r();
            if (r0 == 0) goto L_0x013d;
        L_0x0127:
            r0 = r3.a;
            r0 = r0.a;
            r1 = r3.a;
            r1 = r1.a;
            r1 = r1.r();
            r0.e(r1);
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
        L_0x013d:
            r0 = r3.a;
            r0 = r0.a;
            r0.a(r2);
            r0 = r3.a;
            r0 = r0.a;
            r1 = 0;
            r0.a(r1);
            r0 = r3.a;
            r0 = r0.a;
            r1 = com.sobot.chat.core.a.a.e.Disconnected;
            r0.a(r1);
            r0 = r3.a;
            r0 = r0.a;
            r0.F();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sobot.chat.core.a.a.b.run():void");
        }
    }

    /* compiled from: BL */
    class c extends Thread {
        final /* synthetic */ a a;

        private c(a aVar) {
            this.a = aVar;
        }

        public void run() {
            super.run();
            try {
                if (this.a.a.m().c().k() != com.sobot.chat.core.a.a.i.a.Manually) {
                    while (this.a.a.c() && this.a.a.l() != null && !Thread.interrupted()) {
                        iqd bl_iqd = new iqd();
                        this.a.a.a(bl_iqd);
                        byte[] l = this.a.a.m().c().l();
                        int length = l == null ? 0 : l.length;
                        byte[] o = this.a.a.m().c().o();
                        int length2 = o == null ? 0 : o.length;
                        int m = this.a.a.m().c().m();
                        int i = 0;
                        this.a.a.c(bl_iqd);
                        if (length > 0) {
                            l = this.a.a.l().a(l, true);
                            this.a.a.b(System.currentTimeMillis());
                            bl_iqd.c(l);
                            i = 0 + length;
                        }
                        if (this.a.a.m().c().k() == com.sobot.chat.core.a.a.i.a.AutoReadByLength) {
                            if (m < 0) {
                                this.a.a.e(bl_iqd);
                                this.a.a.a(null);
                            } else if (m == 0) {
                                this.a.a.d(bl_iqd);
                                this.a.a.a(null);
                            }
                            o = this.a.a.l().a(m);
                            this.a.a.b(System.currentTimeMillis());
                            bl_iqd.d(o);
                            int i2 = i + m;
                            int a = this.a.a.m().c().a(o) - length2;
                            if (a > 0) {
                                int min;
                                i = this.a.a.k().getReceiveBufferSize();
                                if (this.a.a.m().c().q()) {
                                    min = Math.min(i, this.a.a.m().c().p());
                                } else {
                                    min = i;
                                }
                                i = i2;
                                i2 = 0;
                                while (i2 < a) {
                                    int min2 = Math.min(i2 + min, a);
                                    Object a2 = this.a.a.l().a(min2 - i2);
                                    this.a.a.b(System.currentTimeMillis());
                                    if (bl_iqd.a() == null) {
                                        bl_iqd.b(a2);
                                    } else {
                                        Object obj = new byte[(bl_iqd.a().length + a2.length)];
                                        System.arraycopy(bl_iqd.a(), 0, obj, 0, bl_iqd.a().length);
                                        System.arraycopy(a2, 0, obj, bl_iqd.a().length, a2.length);
                                        bl_iqd.b(obj);
                                    }
                                    i2 = (min2 - i2) + i;
                                    this.a.a.a(bl_iqd, i2, length, m, a, length2);
                                    i = i2;
                                    i2 = min2;
                                }
                            } else {
                                if (a < 0) {
                                    this.a.a.e(bl_iqd);
                                    this.a.a.a(null);
                                }
                                i = i2;
                            }
                            if (length2 > 0) {
                                l = this.a.a.l().a(length2);
                                this.a.a.b(System.currentTimeMillis());
                                bl_iqd.e(l);
                                this.a.a.a(bl_iqd, i + length2, length, m, a, length2);
                            }
                        } else if (this.a.a.m().c().k() == com.sobot.chat.core.a.a.i.a.AutoReadToTrailer) {
                            if (length2 > 0) {
                                l = this.a.a.l().a(o, false);
                                this.a.a.b(System.currentTimeMillis());
                                bl_iqd.b(l);
                                bl_iqd.e(o);
                                i += l.length;
                            } else {
                                this.a.a.e(bl_iqd);
                                this.a.a.a(null);
                            }
                        }
                        bl_iqd.a(this.a.a.m().d().a(bl_iqd));
                        if (this.a.a.m().a() != null) {
                            bl_iqd.a(this.a.a.m().a());
                        }
                        this.a.a.d(bl_iqd);
                        this.a.a.b(bl_iqd);
                        this.a.a.a(null);
                    }
                }
            } catch (Exception e) {
                this.a.a.b();
                if (this.a.a.r() != null) {
                    this.a.a.e(this.a.a.r());
                    this.a.a.a(null);
                }
            }
        }
    }

    /* compiled from: BL */
    class d extends Thread {
        final /* synthetic */ a a;

        public d(a aVar) {
            this.a = aVar;
        }

        public void run() {
            super.run();
            while (this.a.a.c() && !Thread.interrupted()) {
                try {
                    iqc bl_iqc = (iqc) this.a.a.p().take();
                    if (bl_iqc != null) {
                        this.a.a.b(bl_iqc);
                        this.a.a.c(System.currentTimeMillis());
                        if (bl_iqc.a() == null && bl_iqc.b() != null) {
                            if (this.a.a.m().a() == null) {
                                throw new IllegalArgumentException("we need string charset to send string type message");
                            }
                            bl_iqc.a(this.a.a.m().a());
                        }
                        if (bl_iqc.a() == null) {
                            this.a.a.f(bl_iqc);
                            this.a.a.b(null);
                        } else {
                            byte[] d = this.a.a.m().c().d();
                            int length = d == null ? 0 : d.length;
                            byte[] f = this.a.a.m().c().f();
                            int length2 = f == null ? 0 : f.length;
                            byte[] a = this.a.a.m().c().a(bl_iqc.a().length + length2);
                            int length3 = a == null ? 0 : a.length;
                            bl_iqc.a(d);
                            bl_iqc.c(f);
                            bl_iqc.b(a);
                            if (((length + length3) + bl_iqc.a().length) + length2 <= 0) {
                                this.a.a.f(bl_iqc);
                                this.a.a.b(null);
                            } else {
                                int i;
                                int sendBufferSize;
                                this.a.a.d(bl_iqc);
                                this.a.a.a(bl_iqc, 0, length, length3, bl_iqc.a().length, length2);
                                if (length > 0) {
                                    try {
                                        this.a.a.k().getOutputStream().write(d);
                                        this.a.a.k().getOutputStream().flush();
                                        this.a.a.c(System.currentTimeMillis());
                                        i = 0 + length;
                                        this.a.a.a(bl_iqc, i, length, length3, bl_iqc.a().length, length2);
                                    } catch (Throwable e) {
                                        ibn.a(e);
                                        if (this.a.a.q() != null) {
                                            this.a.a.f(this.a.a.q());
                                            this.a.a.b(null);
                                        }
                                    }
                                } else {
                                    i = 0;
                                }
                                if (length3 > 0) {
                                    this.a.a.k().getOutputStream().write(a);
                                    this.a.a.k().getOutputStream().flush();
                                    this.a.a.c(System.currentTimeMillis());
                                    i += length3;
                                    this.a.a.a(bl_iqc, i, length, length3, bl_iqc.a().length, length2);
                                }
                                if (bl_iqc.a().length > 0) {
                                    int min;
                                    sendBufferSize = this.a.a.k().getSendBufferSize();
                                    if (this.a.a.m().c().h()) {
                                        min = Math.min(sendBufferSize, this.a.a.m().c().g());
                                    } else {
                                        min = sendBufferSize;
                                    }
                                    sendBufferSize = i;
                                    i = 0;
                                    while (i < bl_iqc.a().length) {
                                        int min2 = Math.min(i + min, bl_iqc.a().length);
                                        this.a.a.k().getOutputStream().write(bl_iqc.a(), i, min2 - i);
                                        this.a.a.k().getOutputStream().flush();
                                        this.a.a.c(System.currentTimeMillis());
                                        i = (min2 - i) + sendBufferSize;
                                        this.a.a.a(bl_iqc, i, length, length3, bl_iqc.a().length, length2);
                                        sendBufferSize = i;
                                        i = min2;
                                    }
                                } else {
                                    sendBufferSize = i;
                                }
                                if (length2 > 0) {
                                    this.a.a.k().getOutputStream().write(f);
                                    this.a.a.k().getOutputStream().flush();
                                    this.a.a.c(System.currentTimeMillis());
                                    this.a.a.a(bl_iqc, sendBufferSize + length2, length, length3, bl_iqc.a().length, length2);
                                }
                                this.a.a.e(bl_iqc);
                                this.a.a.b(null);
                                this.a.a.c(-1);
                            }
                        }
                    } else {
                        return;
                    }
                } catch (InterruptedException e2) {
                    if (this.a.a.q() != null) {
                        this.a.a.f(this.a.a.q());
                        this.a.a.b(null);
                        return;
                    }
                    return;
                } catch (IllegalMonitorStateException e3) {
                    this.a.l = null;
                    this.a.a.b();
                    if (this.a.a.q() != null) {
                        this.a.a.f(this.a.a.q());
                        this.a.a.b(null);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* compiled from: BL */
    public enum e {
        Disconnected,
        Connecting,
        Connected
    }

    /* compiled from: BL */
    static class f extends Handler {
        private WeakReference<a> a;

        public f(@NonNull a aVar) {
            super(Looper.getMainLooper());
            this.a = new WeakReference(aVar);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
        }
    }

    public a() {
        this(new ipv());
    }

    public a(ipv bl_ipv) {
        this.a = this;
        this.o = -1;
        this.A = null;
        this.B = null;
        this.c = bl_ipv;
    }

    public synchronized void a() {
        if (d()) {
            if (g() == null) {
                throw new IllegalArgumentException("we need a SocketClientAddress to connect");
            }
            g().b();
            i().b();
            m().a(h()).a(g()).a(j()).a(i());
            a(e.Connecting);
            t().start();
        }
    }

    public void b() {
        if (!d() && !o()) {
            a(true);
            u().start();
        }
    }

    public boolean c() {
        return n() == e.Connected;
    }

    public boolean d() {
        return n() == e.Disconnected;
    }

    public boolean e() {
        return n() == e.Connecting;
    }

    public ipv f() {
        return m().b();
    }

    public iqc a(byte[] bArr) {
        if (!c()) {
            return null;
        }
        iqc bl_iqc = new iqc(bArr);
        a(bl_iqc);
        return bl_iqc;
    }

    public iqc a(final iqc bl_iqc) {
        if (!c()) {
            return null;
        }
        if (bl_iqc == null) {
            return null;
        }
        new Thread(new Runnable(this) {
            final /* synthetic */ a b;

            public void run() {
                this.b.a.c(bl_iqc);
            }
        }).start();
        return bl_iqc;
    }

    public a a(ipw bl_ipw) {
        if (!x().contains(bl_ipw)) {
            x().add(bl_ipw);
        }
        return this;
    }

    public ipv g() {
        if (this.c == null) {
            this.c = new ipv();
        }
        return this.c;
    }

    public a a(String str) {
        this.d = str;
        return this;
    }

    public String h() {
        return this.d;
    }

    public i i() {
        if (this.e == null) {
            this.e = new i();
        }
        return this.e;
    }

    public iqa j() {
        if (this.f == null) {
            this.f = new iqa();
        }
        return this.f;
    }

    public Socket k() {
        if (this.g == null) {
            this.g = new Socket();
        }
        return this.g;
    }

    protected a a(Socket socket) {
        this.g = socket;
        return this;
    }

    protected a a(iqb bl_iqb) {
        this.h = bl_iqb;
        return this;
    }

    protected iqb l() throws IOException {
        if (this.h == null) {
            this.h = new iqb(k().getInputStream());
        }
        return this.h;
    }

    protected ipz m() {
        if (this.i == null) {
            this.i = new ipz();
        }
        return this.i;
    }

    protected a a(e eVar) {
        this.j = eVar;
        return this;
    }

    public e n() {
        if (this.j == null) {
            return e.Disconnected;
        }
        return this.j;
    }

    protected a a(boolean z) {
        this.k = z;
        return this;
    }

    public boolean o() {
        return this.k;
    }

    protected LinkedBlockingQueue<iqc> p() {
        if (this.l == null) {
            this.l = new LinkedBlockingQueue();
        }
        return this.l;
    }

    protected a a(long j) {
        this.m = j;
        return this;
    }

    protected a b(long j) {
        this.n = j;
        return this;
    }

    protected a c(long j) {
        this.o = j;
        return this;
    }

    protected a b(iqc bl_iqc) {
        this.p = bl_iqc;
        return this;
    }

    protected iqc q() {
        return this.p;
    }

    protected a a(iqd bl_iqd) {
        this.q = bl_iqd;
        return this;
    }

    protected iqd r() {
        return this.q;
    }

    protected a d(long j) {
        this.r = j;
        return this;
    }

    protected long s() {
        return this.r;
    }

    protected a a(a aVar) {
        this.s = aVar;
        return this;
    }

    protected a t() {
        if (this.s == null) {
            this.s = new a();
        }
        return this.s;
    }

    protected a a(b bVar) {
        this.t = bVar;
        return this;
    }

    protected b u() {
        if (this.t == null) {
            this.t = new b();
        }
        return this.t;
    }

    protected a a(d dVar) {
        this.u = dVar;
        return this;
    }

    protected d v() {
        if (this.u == null) {
            this.u = new d(this);
        }
        return this.u;
    }

    protected a a(c cVar) {
        this.v = cVar;
        return this;
    }

    protected c w() {
        if (this.v == null) {
            this.v = new c();
        }
        return this.v;
    }

    protected ArrayList<ipw> x() {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        return this.w;
    }

    protected ArrayList<ipy> y() {
        if (this.x == null) {
            this.x = new ArrayList();
        }
        return this.x;
    }

    protected ArrayList<ipx> z() {
        if (this.y == null) {
            this.y = new ArrayList();
        }
        return this.y;
    }

    protected f A() {
        if (this.z == null) {
            this.z = new f(this);
        }
        return this.z;
    }

    private void c(iqc bl_iqc) {
        if (c()) {
            synchronized (p()) {
                try {
                    p().put(bl_iqc);
                } catch (Throwable e) {
                    ibn.a(e);
                }
            }
        }
    }

    private void B() {
        if (c() && m() != null && m().d() != null && m().d().i()) {
            final iqc bl_iqc = new iqc(m().d().b(), true);
            new Thread(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.c(bl_iqc);
                }
            }).start();
        }
    }

    private void C() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.C();
                }
            });
            return;
        }
        ArrayList arrayList = (ArrayList) x().clone();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ipw) arrayList.get(i)).a(this);
        }
        try {
            v().start();
            w().start();
            D();
        } catch (Exception e) {
            this.a.b();
        }
    }

    private void D() {
        E();
        this.A = new Timer();
        this.B = new TimerTask(this) {
            final /* synthetic */ a a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.G();
            }
        };
        this.A.schedule(this.B, 10000, 10000);
    }

    private void E() {
        if (this.A != null) {
            this.A.cancel();
            this.A = null;
        }
        if (this.B != null) {
            this.B.cancel();
            this.B = null;
        }
    }

    private void F() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.F();
                }
            });
            return;
        }
        ArrayList arrayList = (ArrayList) x().clone();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ipw) arrayList.get(i)).b(this);
        }
    }

    private void b(@NonNull final iqd bl_iqd) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.b(bl_iqd);
                }
            });
            return;
        }
        b(System.currentTimeMillis());
        if (x().size() > 0) {
            ArrayList arrayList = (ArrayList) x().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipw) arrayList.get(i)).a(this, bl_iqd);
            }
        }
    }

    private void d(final iqc bl_iqc) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.d(bl_iqc);
                }
            });
        } else if (x().size() > 0) {
            ArrayList arrayList = (ArrayList) y().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipy) arrayList.get(i)).a(this, bl_iqc);
            }
        }
    }

    private void e(final iqc bl_iqc) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.e(bl_iqc);
                }
            });
        } else if (x().size() > 0) {
            ArrayList arrayList = (ArrayList) y().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipy) arrayList.get(i)).b(this, bl_iqc);
            }
        }
    }

    private void f(final iqc bl_iqc) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.f(bl_iqc);
                }
            });
        } else if (x().size() > 0) {
            ArrayList arrayList = (ArrayList) y().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipy) arrayList.get(i)).c(this, bl_iqc);
            }
        }
    }

    private void a(iqc bl_iqc, int i, int i2, int i3, int i4, int i5) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            final iqc bl_iqc2 = bl_iqc;
            final int i6 = i;
            final int i7 = i2;
            final int i8 = i3;
            final int i9 = i4;
            final int i10 = i5;
            A().post(new Runnable(this) {
                final /* synthetic */ a g;

                public void run() {
                    this.g.a.a(bl_iqc2, i6, i7, i8, i9, i10);
                }
            });
            return;
        }
        float f = ((float) i) / ((float) (((i2 + i3) + i4) + i5));
        if (x().size() > 0) {
            ArrayList arrayList = (ArrayList) y().clone();
            i7 = arrayList.size();
            for (int i11 = 0; i11 < i7; i11++) {
                ((ipy) arrayList.get(i11)).a(this, bl_iqc, f, i);
            }
        }
    }

    private void c(final iqd bl_iqd) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.c(bl_iqd);
                }
            });
        } else if (z().size() > 0) {
            ArrayList arrayList = (ArrayList) z().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipx) arrayList.get(i)).a(this, bl_iqd);
            }
        }
    }

    private void d(final iqd bl_iqd) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.d(bl_iqd);
                }
            });
        } else if (z().size() > 0) {
            ArrayList arrayList = (ArrayList) z().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipx) arrayList.get(i)).b(this, bl_iqd);
            }
        }
    }

    private void e(final iqd bl_iqd) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            A().post(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.e(bl_iqd);
                }
            });
        } else if (z().size() > 0) {
            ArrayList arrayList = (ArrayList) z().clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ipx) arrayList.get(i)).c(this, bl_iqd);
            }
        }
    }

    private void a(iqd bl_iqd, int i, int i2, int i3, int i4, int i5) {
        if (System.currentTimeMillis() - s() >= 41) {
            final int i6;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                final iqd bl_iqd2 = bl_iqd;
                final int i7 = i;
                i6 = i2;
                final int i8 = i3;
                final int i9 = i4;
                final int i10 = i5;
                A().post(new Runnable(this) {
                    final /* synthetic */ a g;

                    public void run() {
                        this.g.a.a(bl_iqd2, i7, i6, i8, i9, i10);
                    }
                });
                return;
            }
            float f = ((float) i) / ((float) (((i2 + i3) + i4) + i5));
            if (z().size() > 0) {
                ArrayList arrayList = (ArrayList) z().clone();
                i6 = arrayList.size();
                for (int i11 = 0; i11 < i6; i11++) {
                    ((ipx) arrayList.get(i11)).a(this, bl_iqd, f, i);
                }
            }
            d(System.currentTimeMillis());
        }
    }

    private void G() {
        if (c()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (m().d().i()) {
                    B();
                    a(currentTimeMillis);
                }
            } catch (Exception e) {
                b();
            }
        }
    }
}
