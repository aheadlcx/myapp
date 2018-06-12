package bili2.bl;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* compiled from: BL */
abstract class lw implements OnItemClickListener, ly, mc {
    private Rect a;

    public abstract void a(int i);

    public abstract void a(View view);

    public abstract void a(OnDismissListener onDismissListener);

    public abstract void a(lr lrVar);

    public abstract void a(boolean z);

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(int i);

    lw() {
    }

    public void a(Rect rect) {
        this.a = rect;
    }

    public Rect f() {
        return this.a;
    }

    public void initForMenu(@NonNull Context context, @Nullable lr lrVar) {
    }

    public boolean expandItemActionView(lr lrVar, lt ltVar) {
        return false;
    }

    public boolean collapseItemActionView(lr lrVar, lt ltVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        a(listAdapter).b.performItemAction((MenuItem) listAdapter.getItem(i), this, e() ? 0 : 4);
    }

    protected static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            ViewGroup frameLayout;
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            if (viewGroup2 == null) {
                frameLayout = new FrameLayout(context);
            } else {
                frameLayout = viewGroup2;
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    protected static lq a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (lq) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (lq) listAdapter;
    }

    protected static boolean b(lr lrVar) {
        int size = lrVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lrVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected boolean e() {
        return true;
    }
}
