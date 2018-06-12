package bili2.bl;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* compiled from: BL */
public final class knf implements kmv {
    final klw a;
    final kms b;
    final koi c;
    final koh d;
    int e = 0;
    private long f = 262144;

    /* compiled from: BL */
    abstract class a implements kov {
        protected final kol a;
        protected boolean b;
        protected long c;
        final /* synthetic */ knf d;

        private a(knf bl_knf) {
            this.d = bl_knf;
            this.a = new kol(this.d.c.a());
            this.c = 0;
        }

        public kow a() {
            return this.a;
        }

        public long a(kog bl_kog, long j) throws IOException {
            try {
                long a = this.d.c.a(bl_kog, j);
                if (a > 0) {
                    this.c += a;
                }
                return a;
            } catch (IOException e) {
                a(false, e);
                throw e;
            }
        }

        protected final void a(boolean z, IOException iOException) throws IOException {
            if (this.d.e != 6) {
                if (this.d.e != 5) {
                    throw new IllegalStateException("state: " + this.d.e);
                }
                this.d.a(this.a);
                this.d.e = 6;
                if (this.d.b != null) {
                    this.d.b.a(!z, this.d, this.c, iOException);
                }
            }
        }
    }

    /* compiled from: BL */
    final class b implements kou {
        final /* synthetic */ knf a;
        private final kol b = new kol(this.a.d.a());
        private boolean c;

        b(knf bl_knf) {
            this.a = bl_knf;
        }

        public kow a() {
            return this.b;
        }

        public void a_(kog bl_kog, long j) throws IOException {
            if (this.c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                this.a.d.n(j);
                this.a.d.b("\r\n");
                this.a.d.a_(bl_kog, j);
                this.a.d.b("\r\n");
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.c) {
                this.a.d.flush();
            }
        }

        public synchronized void close() throws IOException {
            if (!this.c) {
                this.c = true;
                this.a.d.b("0\r\n\r\n");
                this.a.a(this.b);
                this.a.e = 3;
            }
        }
    }

    /* compiled from: BL */
    class c extends a {
        final /* synthetic */ knf e;
        private final HttpUrl f;
        private long g = -1;
        private boolean h = true;

        c(knf bl_knf, HttpUrl httpUrl) {
            this.e = bl_knf;
            super();
            this.f = httpUrl;
        }

        public long a(kog bl_kog, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.h) {
                return -1;
            } else {
                if (this.g == 0 || this.g == -1) {
                    b();
                    if (!this.h) {
                        return -1;
                    }
                }
                long a = super.a(bl_kog, Math.min(j, this.g));
                if (a == -1) {
                    IOException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                this.g -= a;
                return a;
            }
        }

        private void b() throws IOException {
            if (this.g != -1) {
                this.e.c.t();
            }
            try {
                this.g = this.e.c.q();
                String trim = this.e.c.t().trim();
                if (this.g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.g + trim + "\"");
                } else if (this.g == 0) {
                    this.h = false;
                    kmx.a(this.e.a.f(), this.f, this.e.d());
                    a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (this.h && !kmf.a((kov) this, 100, TimeUnit.MILLISECONDS)) {
                    a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* compiled from: BL */
    final class d implements kou {
        final /* synthetic */ knf a;
        private final kol b = new kol(this.a.d.a());
        private boolean c;
        private long d;

        d(knf bl_knf, long j) {
            this.a = bl_knf;
            this.d = j;
        }

        public kow a() {
            return this.b;
        }

        public void a_(kog bl_kog, long j) throws IOException {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            kmf.a(bl_kog.b(), 0, j);
            if (j > this.d) {
                throw new ProtocolException("expected " + this.d + " bytes but received " + j);
            }
            this.a.d.a_(bl_kog, j);
            this.d -= j;
        }

        public void flush() throws IOException {
            if (!this.c) {
                this.a.d.flush();
            }
        }

        public void close() throws IOException {
            if (!this.c) {
                this.c = true;
                if (this.d > 0) {
                    throw new ProtocolException("unexpected end of stream");
                }
                this.a.a(this.b);
                this.a.e = 3;
            }
        }
    }

    /* compiled from: BL */
    class e extends a {
        final /* synthetic */ knf e;
        private long f;

        e(knf bl_knf, long j) throws IOException {
            this.e = bl_knf;
            super();
            this.f = j;
            if (this.f == 0) {
                a(true, null);
            }
        }

        public long a(kog bl_kog, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f == 0) {
                return -1;
            } else {
                long a = super.a(bl_kog, Math.min(this.f, j));
                if (a == -1) {
                    IOException protocolException = new ProtocolException("unexpected end of stream");
                    a(false, protocolException);
                    throw protocolException;
                }
                this.f -= a;
                if (this.f == 0) {
                    a(true, null);
                }
                return a;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!(this.f == 0 || kmf.a((kov) this, 100, TimeUnit.MILLISECONDS))) {
                    a(false, null);
                }
                this.b = true;
            }
        }
    }

    /* compiled from: BL */
    class f extends a {
        final /* synthetic */ knf e;
        private boolean f;

        f(knf bl_knf) {
            this.e = bl_knf;
            super();
        }

        public long a(kog bl_kog, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.f) {
                return -1;
            } else {
                long a = super.a(bl_kog, j);
                if (a != -1) {
                    return a;
                }
                this.f = true;
                a(true, null);
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!this.f) {
                    a(false, null);
                }
                this.b = true;
            }
        }
    }

    public knf(klw bl_klw, kms bl_kms, koi bl_koi, koh bl_koh) {
        this.a = bl_klw;
        this.b = bl_kms;
        this.c = bl_koi;
        this.d = bl_koh;
    }

    public kou a(kly bl_kly, long j) {
        if ("chunked".equalsIgnoreCase(bl_kly.a("Transfer-Encoding"))) {
            return e();
        }
        if (j != -1) {
            return a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void c() {
        kmp b = this.b.b();
        if (b != null) {
            b.d();
        }
    }

    public void a(kly bl_kly) throws IOException {
        a(bl_kly.c(), knb.a(bl_kly, this.b.b().a().b().type()));
    }

    public kmb a(kma bl_kma) throws IOException {
        this.b.c.f(this.b.b);
        String a = bl_kma.a("Content-Type");
        if (!kmx.b(bl_kma)) {
            return new kna(a, 0, koo.a(b(0)));
        }
        if ("chunked".equalsIgnoreCase(bl_kma.a("Transfer-Encoding"))) {
            return new kna(a, -1, koo.a(a(bl_kma.a().a())));
        }
        long a2 = kmx.a(bl_kma);
        if (a2 != -1) {
            return new kna(a, a2, koo.a(b(a2)));
        }
        return new kna(a, -1, koo.a(f()));
    }

    public void a() throws IOException {
        this.d.flush();
    }

    public void b() throws IOException {
        this.d.flush();
    }

    public void a(kls bl_kls, String str) throws IOException {
        if (this.e != 0) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.d.b(str).b("\r\n");
        int a = bl_kls.a();
        for (int i = 0; i < a; i++) {
            this.d.b(bl_kls.a(i)).b(": ").b(bl_kls.b(i)).b("\r\n");
        }
        this.d.b("\r\n");
        this.e = 1;
    }

    public bl.kma.a a(boolean z) throws IOException {
        if (this.e == 1 || this.e == 3) {
            try {
                knd a = knd.a(g());
                bl.kma.a a2 = new bl.kma.a().a(a.a).a(a.b).a(a.c).a(d());
                if (z && a.b == 100) {
                    return null;
                }
                this.e = 4;
                return a2;
            } catch (Throwable e) {
                IOException iOException = new IOException("unexpected end of stream on " + this.b);
                iOException.initCause(e);
                throw iOException;
            }
        }
        throw new IllegalStateException("state: " + this.e);
    }

    private String g() throws IOException {
        String f = this.c.f(this.f);
        this.f -= (long) f.length();
        return f;
    }

    public kls d() throws IOException {
        bl.kls.a aVar = new bl.kls.a();
        while (true) {
            String g = g();
            if (g.length() == 0) {
                return aVar.a();
            }
            kmd.a.a(aVar, g);
        }
    }

    public kou e() {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new b(this);
    }

    public kou a(long j) {
        if (this.e != 1) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 2;
        return new d(this, j);
    }

    public kov b(long j) throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new e(this, j);
    }

    public kov a(HttpUrl httpUrl) throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        }
        this.e = 5;
        return new c(this, httpUrl);
    }

    public kov f() throws IOException {
        if (this.e != 4) {
            throw new IllegalStateException("state: " + this.e);
        } else if (this.b == null) {
            throw new IllegalStateException("streamAllocation == null");
        } else {
            this.e = 5;
            this.b.d();
            return new f(this);
        }
    }

    void a(kol bl_kol) {
        kow a = bl_kol.a();
        bl_kol.a(kow.c);
        a.f();
        a.bo_();
    }
}
