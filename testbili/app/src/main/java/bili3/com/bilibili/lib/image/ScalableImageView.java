package bili3.com.bilibili.lib.image;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import bl.hpc;
import bl.hsd;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.StaticImageView;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;

/* compiled from: BL */
public class ScalableImageView extends StaticImageView {
    public static final String a = ScalableImageView.class.getName();
    public int b;
    public int c;
    public int d;
    private double l;

    public ScalableImageView(Context context) {
        super(context);
    }

    public ScalableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969259);
    }

    public ScalableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setScaleViewType(int i) {
        this.b = i;
    }

    public void setHeightRatio(double d) {
        if (d != this.l) {
            this.l = d;
            setAspectRatio(1.0f / ((float) this.l));
        }
    }

    public void setRoundRadius(int i) {
        if (i > 0) {
            RoundingParams roundingParams;
            RoundingParams c = ((hsd) getHierarchy()).c();
            if (c == null) {
                roundingParams = new RoundingParams();
            } else {
                roundingParams = c;
            }
            roundingParams.a(TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics()));
            ((hsd) getHierarchy()).a(roundingParams);
        }
    }

    public double getHeightRatio() {
        return this.l;
    }

    protected void onMeasure(int i, int i2) {
        int intrinsicHeight;
        if (this.l <= 0.0d || !(this.b == 1 || this.b == 0)) {
            super.onMeasure(i, i2);
            Drawable drawable = getDrawable();
            if (this.b != 0 && drawable != null) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (measuredWidth > paddingRight && measuredHeight > paddingBottom) {
                    double d;
                    int intrinsicWidth;
                    if (this.c != 0 && this.d != 0) {
                        d = ((double) this.c) / ((double) this.d);
                    } else if (this.l > 0.0d) {
                        d = 1.0d / this.l;
                    } else {
                        intrinsicWidth = drawable.getIntrinsicWidth();
                        intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicHeight != 0 && intrinsicWidth != 0) {
                            d = ((double) intrinsicWidth) / ((double) intrinsicHeight);
                        } else {
                            return;
                        }
                    }
                    switch (this.b) {
                        case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                            intrinsicHeight = (int) Math.floor((((double) (measuredWidth - paddingRight)) / d) + ((double) paddingBottom));
                            intrinsicWidth = measuredWidth;
                            break;
                        case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                            intrinsicWidth = (int) Math.floor((d * ((double) (measuredHeight - paddingBottom))) + ((double) paddingRight));
                            intrinsicHeight = measuredHeight;
                            break;
                        default:
                            intrinsicHeight = measuredHeight;
                            intrinsicWidth = measuredWidth;
                            break;
                    }
                    setMeasuredDimension(intrinsicWidth, intrinsicHeight);
                    return;
                }
                return;
            }
            return;
        }
        intrinsicHeight = MeasureSpec.getSize(i);
        setMeasuredDimension(intrinsicHeight, (int) (((double) intrinsicHeight) * this.l));
    }

    public void a(AttributeSet attributeSet, int i, int i2) {
        super.a(attributeSet, i, i2);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, a.bM);
            if (obtainStyledAttributes != null) {
                this.b = obtainStyledAttributes.getInt(2, this.b);
                this.c = obtainStyledAttributes.getInt(1, this.c);
                this.d = obtainStyledAttributes.getInt(0, this.d);
                if (this.c > 0 && this.d > 0) {
                    this.l = (double) (((float) this.d) / ((float) this.c));
                    this.b = 1;
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    public String toString() {
        return hpc.a(this).a("height radio", this.l).toString();
    }
}
