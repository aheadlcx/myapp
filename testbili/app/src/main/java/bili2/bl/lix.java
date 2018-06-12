package bili2.bl;

/* compiled from: BL */
public class lix {
    private liy a;
    private lja b;

    public lix(lja bl_lja, liy bl_liy) {
        this.b = bl_lja;
        this.a = bl_liy;
    }

    private void a(ljb bl_ljb) {
        this.b.b[bl_ljb.a] = false;
        if (this.a != null) {
            this.a.b_(this.b.a(bl_ljb) + 1, ((liz) this.b.a.get(bl_ljb.a)).getItemCount());
        }
    }

    private void b(ljb bl_ljb) {
        this.b.b[bl_ljb.a] = true;
        if (this.a != null) {
            this.a.a_(this.b.a(bl_ljb) + 1, ((liz) this.b.a.get(bl_ljb.a)).getItemCount());
        }
    }

    public boolean a(liz bl_liz) {
        return this.b.b[this.b.a.indexOf(bl_liz)];
    }

    public boolean a(int i) {
        return this.b.b[this.b.a(i).a];
    }

    public boolean b(int i) {
        ljb a = this.b.a(i);
        boolean z = this.b.b[a.a];
        if (z) {
            a(a);
        } else {
            b(a);
        }
        return z;
    }
}
