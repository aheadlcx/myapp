package bili3.com.bilibili.app.comm.comment2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: BL */
public class FixedPopupAnchor extends FrameLayout {
    public FixedPopupAnchor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FixedPopupAnchor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FixedPopupAnchor(Context context) {
        super(context);
    }

    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }
}
