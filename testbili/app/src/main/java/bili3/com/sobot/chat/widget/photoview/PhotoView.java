package bili3.com.sobot.chat.widget.photoview;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import bl.itt;
import bl.itt.c;
import bl.itt.d;
import bl.itt.e;

/* compiled from: BL */
public class PhotoView extends ImageView {
    private final itt a;
    private ScaleType b;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ScaleType.MATRIX);
        this.a = new itt(this);
        if (this.b != null) {
            setScaleType(this.b);
            this.b = null;
        }
    }

    public RectF getDisplayRect() {
        return this.a.b();
    }

    public float getMinScale() {
        return this.a.d();
    }

    public float getMidScale() {
        return this.a.e();
    }

    public float getMaxScale() {
        return this.a.f();
    }

    public float getScale() {
        return this.a.g();
    }

    public ScaleType getScaleType() {
        return this.a.h();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.a.a(z);
    }

    public void setMinScale(float f) {
        this.a.a(f);
    }

    public void setMidScale(float f) {
        this.a.b(f);
    }

    public void setMaxScale(float f) {
        this.a.c(f);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.a != null) {
            this.a.i();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.a != null) {
            this.a.i();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.a != null) {
            this.a.i();
        }
    }

    public void setOnMatrixChangeListener(c cVar) {
        this.a.a(cVar);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.a.a(onLongClickListener);
    }

    public void setOnPhotoTapListener(d dVar) {
        this.a.a(dVar);
    }

    public void setOnViewTapListener(e eVar) {
        this.a.a(eVar);
    }

    public void setScaleType(ScaleType scaleType) {
        if (this.a != null) {
            this.a.a(scaleType);
        } else {
            this.b = scaleType;
        }
    }

    public void setZoomable(boolean z) {
        this.a.b(z);
    }

    protected void onDetachedFromWindow() {
        this.a.a();
        super.onDetachedFromWindow();
    }
}
