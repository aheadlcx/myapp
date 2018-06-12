package bili2.bl;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import com.bilibili.music.app.ui.view.PinnedBottomBehavior;
import com.bilibili.music.app.ui.view.PinnedBottomBehavior.a;

/* compiled from: BL */
public class gly extends a {
    private PinnedBottomBehavior a;
    private int b;
    private String c;
    private ViewGroup d;

    public gly(Context context, ViewGroup viewGroup) {
        this.c = context.getString(2131693630);
        this.d = viewGroup;
    }

    public void b() {
        a(this.d);
    }

    private void a(View view) {
        if (view.getId() != 16908290) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof View)) {
                    a((View) parent);
                    return;
                }
                return;
            }
            Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior != null && (behavior instanceof PinnedBottomBehavior)) {
                this.a = (PinnedBottomBehavior) behavior;
                this.a.addDependentViewChangedListener(this);
            }
        }
    }

    public void a(boolean z, int i, int i2, int i3, int i4) {
    }

    private View b(View view) {
        if (this.c.equals(view.getTag())) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
            View b = b(((ViewGroup) view).getChildAt(i));
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    public void c() {
        if (this.a != null) {
            this.a.removeDependentViewChangedListener(this);
        }
        this.d = null;
    }

    public void a(int i, int i2, int i3) {
        super.a(i, i2, i3);
        this.b = i;
        View b = b(this.d);
        if (b != null) {
            View view = (View) b.getParent();
            if (view != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) b.getLayoutParams();
                b.offsetTopAndBottom(i3);
                int height = (view.getHeight() - (i2 + i3)) - marginLayoutParams.bottomMargin;
                b.layout(b.getLeft(), (height - b.getHeight()) - marginLayoutParams.topMargin, b.getRight(), height);
            }
        }
    }
}
