package bili3.bl;

import android.util.SparseArray;
import com.tencent.connect.common.Constants;

/* compiled from: BL */
public class mmi {
    private static mmi a = new mmi();
    private int b;
    private boolean c;
    private int d;
    private int e;
    private String f = Constants.STR_EMPTY;
    private int g;
    private long h;
    private long i;
    private long j;
    private String k = Constants.STR_EMPTY;
    private int l;
    private int m = 0;
    private boolean n;
    private SparseArray<a> o = new SparseArray();

    /* compiled from: BL */
    public interface a {
        void a(int i, int i2, int i3, int i4, String str, int i5, long j, String str2, int i6, int i7, int i8);

        void a(int i, int i2, boolean z);
    }

    private mmi() {
    }

    public static mmi a() {
        return a;
    }

    public void a(int i) {
        this.b = i;
    }

    public void b() {
        this.c = true;
        this.d = 0;
        this.e = 0;
        this.f = Constants.STR_EMPTY;
    }

    public void c() {
        this.c = false;
    }

    public void b(int i) {
        this.d = i;
    }

    public void a(String str) {
        this.f = str;
    }

    public void a(int i, int i2, String str) {
        this.d = i;
        this.e = i2;
        this.f = str;
    }

    public void a(int i, int i2, String str, String str2) {
        a(i, i2, str);
        this.k = str2;
    }

    public void a(long j) {
        this.i = j;
    }

    public void b(long j) {
        this.h = j;
    }

    public void c(int i) {
        this.g = i;
    }

    public void d(int i) {
        this.l = i;
    }

    public void e(int i) {
        this.m = i;
    }

    public void c(long j) {
        this.j = j;
    }

    public void b(String str) {
        this.k = str;
    }

    public void a(boolean z) {
        this.n = z;
    }

    public void f(int i) {
        if (this.o != null) {
            a aVar = (a) this.o.get(i);
            if (aVar != null) {
                aVar.a(this.b, this.c ? 1 : 0, this.d, this.e, this.f, (int) this.i, this.j, this.k, (int) this.h, this.g, (int) (this.i + this.h));
            }
        }
    }

    public void d() {
        if (this.o != null) {
            int size = this.o.size();
            for (int i = 0; i < size; i++) {
                ((a) this.o.valueAt(i)).a(this.b, this.c ? 1 : 0, this.d, this.e, this.f, (int) this.i, this.j, this.k, (int) this.h, this.g, (int) (this.i + this.h));
            }
        }
    }

    public void g(int i) {
        if (this.o != null) {
            a aVar = (a) this.o.get(i);
            if (aVar != null) {
                aVar.a(this.m, this.l, this.n);
            }
        }
    }

    public void e() {
        this.b = 0;
        this.c = false;
        this.d = 0;
        this.e = 0;
        this.f = Constants.STR_EMPTY;
        this.i = 0;
        this.j = 0;
        this.k = Constants.STR_EMPTY;
        this.g = 0;
        this.h = 0;
    }

    public void a(int i, a aVar) {
        this.o.put(i, aVar);
    }

    public void h(int i) {
        this.o.remove(i);
    }

    public int f() {
        return this.d;
    }
}
