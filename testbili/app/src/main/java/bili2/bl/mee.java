package bili2.bl;

import android.support.v7.widget.RecyclerView.u;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public abstract class mee<VH extends a> extends android.support.v7.widget.RecyclerView.a<VH> {
    private List<mei> a = new ArrayList();
    private hf<mei> b = new hf();

    /* compiled from: BL */
    public static abstract class a extends u {
        public abstract void b(Object obj);

        public a(View view) {
            super(view);
        }
    }

    public void a(VH vh, int i) {
        mei h = h(i);
        if (h != null) {
            vh.b(h.a(i));
        }
    }

    public long f_(int i) {
        if (d()) {
            mei h = h(i);
            if (h != null) {
                return h.c_(i);
            }
        }
        return super.f_(i);
    }

    public final int a() {
        return this.b.b();
    }

    public int b(int i) {
        mei h = h(i);
        if (h == null) {
            return 0;
        }
        return h.b(i);
    }

    public final mei h(int i) {
        return (mei) this.b.a(i);
    }

    protected final int r() {
        return this.a.size();
    }

    protected final mei i(int i) {
        if (i >= this.a.size() || i < 0) {
            return null;
        }
        return (mei) this.a.get(i);
    }

    protected final int a(mei bl_mei) {
        if (bl_mei == null) {
            return -1;
        }
        return this.a.indexOf(bl_mei);
    }

    protected final void a(int i, mei bl_mei) {
        this.a.add(i, bl_mei);
    }

    protected final void b(mei bl_mei) {
        this.a.add(bl_mei);
    }

    protected final void c(mei bl_mei) {
        this.a.remove(bl_mei);
    }

    public final void c(List<? extends mei> list) {
        this.a.clear();
        this.b.c();
        this.a.addAll(list);
        s();
    }

    protected final void s() {
        d(true);
    }

    protected final void d(boolean z) {
        this.b.c();
        int i = 0;
        for (mei bl_mei : this.a) {
            bl_mei.e(i);
            int a = bl_mei.a();
            for (int i2 = 0; i2 < a; i2++) {
                this.b.b(i + i2, bl_mei);
            }
            i += a;
        }
        if (z) {
            f();
        }
    }

    public void aL_() {
        t();
    }

    public final void t() {
        this.b.c();
        this.a.clear();
    }

    protected void finalize() throws Throwable {
        if (this.b.b() > 0 || this.a.size() > 0) {
            aL_();
        }
        super.finalize();
    }

    public void a(boolean z) {
    }
}
