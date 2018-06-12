package bili4.tv.danmaku.bili.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;

/* compiled from: BL */
public class MaxHeightScrollView extends NestedScrollView {
    static int[] a = new int[]{16843040};
    private int b;

    public MaxHeightScrollView(Context context) {
        this(context, null);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        a(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        obtainStyledAttributes.recycle();
    }

    @SuppressLint({"Range"})
    protected void onMeasure(int i, int i2) {
        if (this.b >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
