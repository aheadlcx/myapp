package bili3.com.bilibili.bangumi.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.r;
import android.util.AttributeSet;

/* compiled from: BL */
public class FixedGridLayoutManager extends GridLayoutManager {
    public FixedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public FixedGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public FixedGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    public boolean d() {
        return false;
    }

    public void c(Recycler recycler, r rVar) {
        try {
            super.c(recycler, rVar);
        } catch (Exception e) {
        }
    }
}
