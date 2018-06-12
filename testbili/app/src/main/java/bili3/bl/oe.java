package bili3.bl;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: BL */
public class oe {
    final lx a;
    b b;
    a c;
    private final Context d;
    private final lr e;
    private final View f;

    /* compiled from: BL */
    public interface a {
        void a(oe oeVar);
    }

    /* compiled from: BL */
    public interface b {
        boolean a(MenuItem menuItem);
    }

    public oe(@NonNull Context context, @NonNull View view) {
        this(context, view, 0);
    }

    public oe(@NonNull Context context, @NonNull View view, int i) {
        this(context, view, i, 2130969124, 0);
    }

    public oe(@NonNull Context context, @NonNull View view, int i, @AttrRes int i2, @StyleRes int i3) {
        this.d = context;
        this.f = view;
        this.e = new lr(context);
        this.e.setCallback(new bl.lr.a(this) {
            final /* synthetic */ oe a;

            {
                this.a = r1;
            }

            public boolean a(lr lrVar, MenuItem menuItem) {
                if (this.a.b != null) {
                    return this.a.b.a(menuItem);
                }
                return false;
            }

            public void a(lr lrVar) {
            }
        });
        this.a = new lx(context, this.e, view, false, i2, i3);
        this.a.a(i);
        this.a.a(new OnDismissListener(this) {
            final /* synthetic */ oe a;

            {
                this.a = r1;
            }

            public void onDismiss() {
                if (this.a.c != null) {
                    this.a.c.a(this.a);
                }
            }
        });
    }

    @NonNull
    public Menu a() {
        return this.e;
    }

    @NonNull
    public MenuInflater b() {
        return new lh(this.d);
    }

    public void a(@MenuRes int i) {
        b().inflate(i, this.e);
    }

    public void c() {
        this.a.a();
    }

    public void d() {
        this.a.d();
    }

    public void a(@Nullable b bVar) {
        this.b = bVar;
    }
}
