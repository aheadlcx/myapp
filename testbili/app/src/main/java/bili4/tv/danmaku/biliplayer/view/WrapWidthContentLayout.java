package bili4.tv.danmaku.biliplayer.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;
import bl.blg;
import bl.esx;
import bl.mpq;

/* compiled from: BL */
public class WrapWidthContentLayout extends NestedScrollView {
    private boolean a = true;

    public WrapWidthContentLayout(Context context) {
        super(context);
    }

    public WrapWidthContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        int a = getResources().getConfiguration().orientation == 2 ? (int) mpq.a(blg.a(), 320.0f) : esx.d(getContext());
        if (this.a) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = ((RelativeLayout) getChildAt(i4)).getChildAt(2);
                childAt.measure(MeasureSpec.makeMeasureSpec(a, 0), i2);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            if (this.a) {
                if (i3 >= a) {
                    a = i3;
                }
                i = MeasureSpec.makeMeasureSpec(a, 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setWrapWidth(boolean z) {
        this.a = z;
    }

    protected int a(Rect rect) {
        return 0;
    }
}
