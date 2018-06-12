package bili3.com.bilibili.magicasakura.widgets;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bl.fnf;
import bl.fni;
import bl.fnm;
import bl.fnu;

/* compiled from: BL */
public class TintFrameLayout extends FrameLayout implements fnu {
    private fni mBackgroundHelper;
    private fnm mForegroundHelper;

    public TintFrameLayout(Context context) {
        this(context, null);
    }

    public TintFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TintFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            fnf a = fnf.a(context);
            this.mBackgroundHelper = new fni(this, a);
            this.mBackgroundHelper.a(attributeSet, i);
            this.mForegroundHelper = new fnm(this, a);
            this.mForegroundHelper.a(attributeSet, i);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (getBackground() != null) {
            invalidateDrawable(getBackground());
        }
    }

    public void setForeground(Drawable drawable) {
        super.setForeground(drawable);
        if (this.mForegroundHelper != null) {
            this.mForegroundHelper.a(drawable);
        }
    }

    public void setForegroundResource(int i) {
        if (this.mForegroundHelper != null) {
            this.mForegroundHelper.a(i);
        }
    }

    public void setForegroundTintList(int i) {
        if (this.mForegroundHelper != null) {
            this.mForegroundHelper.a(i, null);
        }
    }

    public void setForegroundTintList(int i, Mode mode) {
        if (this.mForegroundHelper != null) {
            this.mForegroundHelper.a(i, mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.mBackgroundHelper != null) {
            this.mBackgroundHelper.a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        if (this.mBackgroundHelper != null) {
            this.mBackgroundHelper.b(i);
        } else {
            super.setBackgroundResource(i);
        }
    }

    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        if (this.mBackgroundHelper != null) {
            this.mBackgroundHelper.a(i);
        }
    }

    public void setBackgroundTintList(int i) {
        if (this.mBackgroundHelper != null) {
            this.mBackgroundHelper.a(i, null);
        }
    }

    public void setBackgroundTintList(int i, Mode mode) {
        if (this.mBackgroundHelper != null) {
            this.mBackgroundHelper.a(i, mode);
        }
    }

    public void tint() {
        if (this.mBackgroundHelper != null) {
            this.mBackgroundHelper.a();
        }
        if (this.mForegroundHelper != null) {
            this.mForegroundHelper.a();
        }
    }
}
