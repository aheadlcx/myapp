package bili2.bl;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: BL */
public class lg extends ActionMode {
    final Context a;
    final lc b;

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* compiled from: BL */
    public static class a implements bl.lc.a {
        final Callback a;
        final Context b;
        final ArrayList<lg> c = new ArrayList();
        final he<Menu, Menu> d = new he();

        public a(Context context, Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public boolean a(lc lcVar, Menu menu) {
            return this.a.onCreateActionMode(b(lcVar), a(menu));
        }

        public boolean b(lc lcVar, Menu menu) {
            return this.a.onPrepareActionMode(b(lcVar), a(menu));
        }

        public boolean a(lc lcVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(b(lcVar), ma.a(this.b, (fh) menuItem));
        }

        public void a(lc lcVar) {
            this.a.onDestroyActionMode(b(lcVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = ma.a(this.b, (fg) menu);
            this.d.put(menu, menu2);
            return menu2;
        }

        public ActionMode b(lc lcVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                lg lgVar = (lg) this.c.get(i);
                if (lgVar != null && lgVar.b == lcVar) {
                    return lgVar;
                }
            }
            ActionMode lgVar2 = new lg(this.b, lcVar);
            this.c.add(lgVar2);
            return lgVar2;
        }
    }

    public lg(Context context, lc lcVar) {
        this.a = context;
        this.b = lcVar;
    }

    public Object getTag() {
        return this.b.j();
    }

    public void setTag(Object obj) {
        this.b.a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public void invalidate() {
        this.b.d();
    }

    public void finish() {
        this.b.c();
    }

    public Menu getMenu() {
        return ma.a(this.a, (fg) this.b.b());
    }

    public CharSequence getTitle() {
        return this.b.f();
    }

    public void setTitle(int i) {
        this.b.a(i);
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public void setSubtitle(int i) {
        this.b.b(i);
    }

    public View getCustomView() {
        return this.b.i();
    }

    public void setCustomView(View view) {
        this.b.a(view);
    }

    public MenuInflater getMenuInflater() {
        return this.b.a();
    }

    public boolean getTitleOptionalHint() {
        return this.b.k();
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    public boolean isTitleOptional() {
        return this.b.h();
    }
}
