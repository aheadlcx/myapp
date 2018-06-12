package bili2.bl;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: BL */
public abstract class ith {
    protected Context a = null;
    private View b = null;

    public abstract View a();

    public abstract void b();

    public abstract String d();

    public ith(Context context) {
        this.a = context;
        this.b = a();
        this.b.setTag(d());
    }

    public View c() {
        return this.b;
    }

    public int a(String str) {
        return irq.a(this.a, "id", str);
    }

    public int b(String str) {
        return irq.a(this.a, "layout", str);
    }

    public int c(String str) {
        return irq.a(this.a, "drawable", str);
    }

    public void a(Bundle bundle) {
    }
}
