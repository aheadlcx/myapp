package bili3.bl;

import a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: BL */
public class mm {
    private final View a;
    private final mq b;
    private int c = -1;
    private os d;
    private os e;
    private os f;

    public mm(View view) {
        this.a = view;
        this.b = mq.a();
    }

    public void a(AttributeSet attributeSet, int i) {
        ou a = ou.a(this.a.getContext(), attributeSet, a.bs, i, 0);
        try {
            if (a.g(0)) {
                this.c = a.g(0, -1);
                ColorStateList b = this.b.b(this.a.getContext(), this.c);
                if (b != null) {
                    b(b);
                }
            }
            if (a.g(1)) {
                ib.a(this.a, a.e(1));
            }
            if (a.g(2)) {
                ib.a(this.a, no.a(a.a(2, -1), null));
            }
            a.a();
        } catch (Throwable th) {
            a.a();
        }
    }

    public void a(int i) {
        this.c = i;
        b(this.b != null ? this.b.b(this.a.getContext(), i) : null);
        c();
    }

    public void a(Drawable drawable) {
        this.c = -1;
        b(null);
        c();
    }

    public void a(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new os();
        }
        this.e.a = colorStateList;
        this.e.d = true;
        c();
    }

    public ColorStateList a() {
        return this.e != null ? this.e.a : null;
    }

    public void a(Mode mode) {
        if (this.e == null) {
            this.e = new os();
        }
        this.e.b = mode;
        this.e.c = true;
        c();
    }

    public Mode b() {
        return this.e != null ? this.e.b : null;
    }

    public void c() {
        Drawable background = this.a.getBackground();
        if (background == null) {
            return;
        }
        if (!d() || !b(background)) {
            if (this.e != null) {
                mq.a(background, this.e, this.a.getDrawableState());
            } else if (this.d != null) {
                mq.a(background, this.d, this.a.getDrawableState());
            }
        }
    }

    void b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new os();
            }
            this.d.a = colorStateList;
            this.d.d = true;
        } else {
            this.d = null;
        }
        c();
    }

    private boolean d() {
        int i = VERSION.SDK_INT;
        if (i > 21) {
            if (this.d != null) {
                return true;
            }
            return false;
        } else if (i != 21) {
            return false;
        } else {
            return true;
        }
    }

    private boolean b(@NonNull Drawable drawable) {
        if (this.f == null) {
            this.f = new os();
        }
        os osVar = this.f;
        osVar.a();
        ColorStateList z = ib.z(this.a);
        if (z != null) {
            osVar.d = true;
            osVar.a = z;
        }
        Mode A = ib.A(this.a);
        if (A != null) {
            osVar.c = true;
            osVar.b = A;
        }
        if (!osVar.d && !osVar.c) {
            return false;
        }
        mq.a(drawable, osVar, this.a.getDrawableState());
        return true;
    }
}
