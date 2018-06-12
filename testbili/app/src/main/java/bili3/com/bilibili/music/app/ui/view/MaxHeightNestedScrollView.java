package bili3.com.bilibili.music.app.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;

/* compiled from: BL */
public class MaxHeightNestedScrollView extends NestedScrollView {
    static int[] a = new int[]{16843040};
    private int b;

    public MaxHeightNestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public MaxHeightNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        a(context, attributeSet);
    }

    public MaxHeightNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        obtainStyledAttributes.recycle();
    }

    protected void onMeasure(int i, int i2) {
        if (this.b >= 0) {
            i2 = MeasureSpec.makeMeasureSpec(this.b, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
