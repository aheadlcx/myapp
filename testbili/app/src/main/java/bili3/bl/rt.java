package bili3.bl;

public final class rt implements ra, rr {
    private static rt a = new rt();
    private rr b;
    private ra c;
    private boolean d = false;

    private rt() {
    }

    public static rt c() {
        return a;
    }

    public final void a() {
        this.b.a();
    }

    public final void a(int i) {
        this.b.a(i);
    }

    public final void a(ra raVar) {
        this.c = raVar;
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void a(String str, String str2) {
        this.c.a(str, str2);
    }

    public final void a(String str, byte[] bArr, String str2) {
        this.c.a(str, bArr, str2);
    }

    public final void a_() {
        this.b.a_();
    }

    public final void b() {
        this.c.b();
    }

    public final synchronized void e() {
        if (!this.d) {
            this.b = rl.c();
            if (this.b != null) {
                this.b.a(this);
                this.b.e();
            }
            this.d = true;
        }
    }
}
