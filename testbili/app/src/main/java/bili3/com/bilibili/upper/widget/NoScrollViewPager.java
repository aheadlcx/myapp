package bili3.com.bilibili.upper.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/* compiled from: BL */
public class NoScrollViewPager extends ViewPager {
    private boolean d = false;

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public void setScrollble(boolean z) {
        this.d = z;
    }
}
