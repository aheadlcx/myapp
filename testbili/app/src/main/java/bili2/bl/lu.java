package bili2.bl;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@RequiresApi(14)
@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: BL */
public class lu extends lm<fh> implements MenuItem {
    private Method c;

    /* compiled from: BL */
    class a extends hi {
        final ActionProvider a;
        final /* synthetic */ lu b;

        public a(lu luVar, Context context, ActionProvider actionProvider) {
            this.b = luVar;
            super(context);
            this.a = actionProvider;
        }

        public View a() {
            return this.a.onCreateActionView();
        }

        public boolean d() {
            return this.a.onPerformDefaultAction();
        }

        public boolean e() {
            return this.a.hasSubMenu();
        }

        public void a(SubMenu subMenu) {
            this.a.onPrepareSubMenu(this.b.a(subMenu));
        }
    }

    /* compiled from: BL */
    static class b extends FrameLayout implements ld {
        final CollapsibleActionView a;

        b(View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView) view;
            addView(view);
        }

        public void a() {
            this.a.onActionViewExpanded();
        }

        public void b() {
            this.a.onActionViewCollapsed();
        }

        View c() {
            return (View) this.a;
        }
    }

    /* compiled from: BL */
    class c extends ln<OnActionExpandListener> implements OnActionExpandListener {
        final /* synthetic */ lu a;

        c(lu luVar, OnActionExpandListener onActionExpandListener) {
            this.a = luVar;
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionExpand(this.a.a(menuItem));
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionCollapse(this.a.a(menuItem));
        }
    }

    /* compiled from: BL */
    class d extends ln<OnMenuItemClickListener> implements OnMenuItemClickListener {
        final /* synthetic */ lu a;

        d(lu luVar, OnMenuItemClickListener onMenuItemClickListener) {
            this.a = luVar;
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.b).onMenuItemClick(this.a.a(menuItem));
        }
    }

    lu(Context context, fh fhVar) {
        super(context, fhVar);
    }

    public int getItemId() {
        return ((fh) this.b).getItemId();
    }

    public int getGroupId() {
        return ((fh) this.b).getGroupId();
    }

    public int getOrder() {
        return ((fh) this.b).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((fh) this.b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((fh) this.b).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((fh) this.b).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((fh) this.b).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((fh) this.b).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((fh) this.b).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((fh) this.b).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((fh) this.b).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((fh) this.b).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((fh) this.b).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((fh) this.b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        ((fh) this.b).setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((fh) this.b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        ((fh) this.b).setNumericShortcut(c, i);
        return this;
    }

    public char getNumericShortcut() {
        return ((fh) this.b).getNumericShortcut();
    }

    public int getNumericModifiers() {
        return ((fh) this.b).getNumericModifiers();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((fh) this.b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        ((fh) this.b).setAlphabeticShortcut(c, i);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((fh) this.b).getAlphabeticShortcut();
    }

    public int getAlphabeticModifiers() {
        return ((fh) this.b).getAlphabeticModifiers();
    }

    public MenuItem setCheckable(boolean z) {
        ((fh) this.b).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((fh) this.b).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((fh) this.b).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((fh) this.b).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((fh) this.b).setVisible(z);
    }

    public boolean isVisible() {
        return ((fh) this.b).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((fh) this.b).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((fh) this.b).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((fh) this.b).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return a(((fh) this.b).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((fh) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((fh) this.b).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((fh) this.b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((fh) this.b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((fh) this.b).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((fh) this.b).setActionView(i);
        View actionView = ((fh) this.b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((fh) this.b).setActionView(new b(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((fh) this.b).getActionView();
        if (actionView instanceof b) {
            return ((b) actionView).c();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((fh) this.b).a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        hi a = ((fh) this.b).a();
        if (a instanceof a) {
            return ((a) a).a;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((fh) this.b).expandActionView();
    }

    public boolean collapseActionView() {
        return ((fh) this.b).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((fh) this.b).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((fh) this.b).setOnActionExpandListener(onActionExpandListener != null ? new c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        ((fh) this.b).a(charSequence);
        return this;
    }

    public CharSequence getContentDescription() {
        return ((fh) this.b).getContentDescription();
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        ((fh) this.b).b(charSequence);
        return this;
    }

    public CharSequence getTooltipText() {
        return ((fh) this.b).getTooltipText();
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        ((fh) this.b).setIconTintList(colorStateList);
        return this;
    }

    public ColorStateList getIconTintList() {
        return ((fh) this.b).getIconTintList();
    }

    public MenuItem setIconTintMode(Mode mode) {
        ((fh) this.b).setIconTintMode(mode);
        return this;
    }

    public Mode getIconTintMode() {
        return ((fh) this.b).getIconTintMode();
    }

    public void a(boolean z) {
        try {
            if (this.c == null) {
                this.c = ((fh) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.c.invoke(this.b, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    a a(ActionProvider actionProvider) {
        return new a(this, this.a, actionProvider);
    }
}
