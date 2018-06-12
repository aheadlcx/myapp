package bili3.bl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* compiled from: BL */
public class mn extends Button implements hz, iv {
    private final mm b;
    private final nb c;

    public mn(Context context) {
        this(context, null);
    }

    public mn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968690);
    }

    public mn(Context context, AttributeSet attributeSet, int i) {
        super(or.a(context), attributeSet, i);
        this.b = new mm(this);
        this.b.a(attributeSet, i);
        this.c = nb.a((TextView) this);
        this.c.a(attributeSet, i);
        this.c.a();
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (this.b != null) {
            this.b.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.b != null) {
            this.b.a(drawable);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.b != null) {
            this.b.a(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return this.b != null ? this.b.a() : null;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable Mode mode) {
        if (this.b != null) {
            this.b.a(mode);
        }
    }

    @Nullable
    @RestrictTo({Scope.LIBRARY_GROUP})
    public Mode getSupportBackgroundTintMode() {
        return this.b != null ? this.b.b() : null;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.b != null) {
            this.b.c();
        }
        if (this.c != null) {
            this.c.a();
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @RequiresApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.c != null) {
            this.c.a(z, i, i2, i3, i4);
        }
    }

    public void setTextSize(int i, float f) {
        if (a) {
            super.setTextSize(i, f);
        } else if (this.c != null) {
            this.c.a(i, f);
        }
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c != null && !a && this.c.c()) {
            this.c.b();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a) {
            super.setAutoSizeTextTypeWithDefaults(i);
        } else if (this.c != null) {
            this.c.a(i);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        } else if (this.c != null) {
            this.c.a(i, i2, i3, i4);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        } else if (this.c != null) {
            this.c.a(iArr, i);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getAutoSizeTextType() {
        if (!a) {
            return this.c != null ? this.c.d() : 0;
        } else {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.c != null) {
            return this.c.e();
        }
        return -1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.c != null) {
            return this.c.f();
        }
        return -1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.c != null) {
            return this.c.g();
        }
        return -1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.c != null) {
            return this.c.h();
        }
        return new int[0];
    }

    public void setSupportAllCaps(boolean z) {
        if (this.c != null) {
            this.c.a(z);
        }
    }
}
