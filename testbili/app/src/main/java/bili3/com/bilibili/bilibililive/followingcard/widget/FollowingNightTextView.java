package bili3.com.bilibili.bilibililive.followingcard.widget;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.ColorRes;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import bl.cnn;
import bl.ej;
import bl.es;
import bl.fnd;
import bl.fnu;

/* compiled from: BL */
public class FollowingNightTextView extends AppCompatTextView implements fnu {
    private int b;
    private int c;
    private int d;

    public FollowingNightTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public FollowingNightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.cr, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.b = ej.c(context, resourceId);
        }
        resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.c = ej.c(context, resourceId);
        }
        obtainStyledAttributes.recycle();
        a();
    }

    public void tint() {
        a();
    }

    private void a() {
        int i = this.b;
        if (cnn.g() && Color.alpha(i) == 255) {
            i = es.b(i, 179);
        }
        setBackgroundDrawable(fnd.a(getBackground(), i));
        if (this.d != 0) {
            setTextColor(fnd.a(getContext(), this.d));
        } else if (this.c != -1) {
            i = this.c;
            if (cnn.g() && Color.alpha(i) == 255) {
                i = es.b(i, 179);
            }
            setTextColor(i);
        }
    }

    public void setTintBackgroundColor(int i) {
        this.b = i;
        a();
    }

    public void setTextColorId(@ColorRes int i) {
        this.d = i;
        a();
    }
}
