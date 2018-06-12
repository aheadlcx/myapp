package bili2.bl;

import android.util.SparseArray;

/* compiled from: BL */
public abstract class kjh {
    public String A;
    public boolean B;
    protected kjj C;
    protected int D = kjg.a;
    public int E = 0;
    public int F = -1;
    public kjn G = null;
    public int H = 0;
    public int I = -1;
    private long J;
    private int K = 0;
    private SparseArray<Object> L = new SparseArray();
    public long a;
    public CharSequence b;
    public String[] c;
    public Object d;
    public Object e;
    public int f;
    public float g;
    public float h;
    public int i;
    public int j = 0;
    public float k = -1.0f;
    public int l = 0;
    public int m = 0;
    public byte n = (byte) 0;
    public float o = -1.0f;
    public float p = -1.0f;
    public kjk q;
    public int r;
    public int s;
    public int t = 0;
    public int u = 0;
    public int v = -1;
    public kjr<?> w;
    public boolean x;
    public boolean y;
    public int z = 0;

    public abstract void a(kjq bl_kjq, float f, float f2);

    public abstract float[] a(kjq bl_kjq, long j);

    public abstract float k();

    public abstract float l();

    public abstract float m();

    public abstract float n();

    public abstract int o();

    public long a() {
        return this.q.a;
    }

    public int a(kjq bl_kjq) {
        return bl_kjq.a(this);
    }

    public boolean b() {
        return this.o > -1.0f && this.p > -1.0f && this.t == this.G.a;
    }

    public void a(kjq bl_kjq, boolean z) {
        bl_kjq.b(this, z);
        this.t = this.G.a;
    }

    public boolean c() {
        return this.v == this.G.f;
    }

    public void b(kjq bl_kjq, boolean z) {
        bl_kjq.a(this, z);
        this.v = this.G.f;
    }

    public kjr<?> d() {
        return this.w;
    }

    public boolean e() {
        return this.s == 1 && this.K == this.G.b;
    }

    public boolean f() {
        return this.C == null || a(this.C.a);
    }

    public boolean a(long j) {
        return j - s() >= this.q.a;
    }

    public boolean g() {
        return this.C == null || b(this.C.a);
    }

    public boolean b(long j) {
        long s = j - s();
        return s <= 0 || s >= this.q.a;
    }

    public boolean h() {
        return this.C == null || this.C.a < s();
    }

    public boolean i() {
        if (this.F == this.G.c) {
            return true;
        }
        this.E = 0;
        return false;
    }

    public boolean j() {
        return this.F == this.G.c && this.E != 0;
    }

    public void a(boolean z) {
        if (z) {
            this.K = this.G.b;
            this.s = 1;
            return;
        }
        this.s = 0;
    }

    public kjj p() {
        return this.C;
    }

    public void a(kjj bl_kjj) {
        this.C = bl_kjj;
    }

    public int q() {
        return this.D;
    }

    public void a(Object obj) {
        this.e = obj;
    }

    public void a(int i, Object obj) {
        this.L.put(i, obj);
    }

    public Object a(int i) {
        if (this.L == null) {
            return null;
        }
        return this.L.get(i);
    }

    public void c(long j) {
        this.a = j;
        this.u = this.G.e;
    }

    public void d(long j) {
        this.J = j;
        this.a = 0;
    }

    public long r() {
        return this.J;
    }

    public long s() {
        if (this.G != null && this.G.e == this.u) {
            return this.J + this.a;
        }
        this.a = 0;
        return this.J;
    }

    public boolean t() {
        if (this.G == null || this.G.e != this.u) {
            this.a = 0;
            return false;
        } else if (this.a != 0) {
            return true;
        } else {
            return false;
        }
    }
}
