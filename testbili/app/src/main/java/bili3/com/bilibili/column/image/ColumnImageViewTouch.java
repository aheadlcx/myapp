package bili3.com.bilibili.column.image;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewConfiguration;
import bl.hae;
import com.tencent.map.geolocation.TencentLocationRequest;

/* compiled from: BL */
public class ColumnImageViewTouch extends ColumnImageViewTouchBase {
    private float K;
    private b L;
    private c M;
    protected ScaleGestureDetector a;
    protected GestureDetector b;
    protected int c;
    protected int d;
    protected OnGestureListener e;
    protected OnScaleGestureListener f;
    protected boolean g = true;
    protected boolean h = true;
    protected boolean i = true;
    long j;

    /* compiled from: BL */
    public class a extends SimpleOnGestureListener {
        final /* synthetic */ ColumnImageViewTouch a;

        public a(ColumnImageViewTouch columnImageViewTouch) {
            this.a = columnImageViewTouch;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (this.a.M != null) {
                this.a.M.a();
            }
            return this.a.a(motionEvent);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ColumnImageViewTouchBase.l) {
                Log.i(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 65, (byte) 106, (byte) 112, (byte) 103, (byte) 105, (byte) 96, (byte) 81, (byte) 100, (byte) 117, (byte) 43, (byte) 37, (byte) 97, (byte) 106, (byte) 112, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 113, (byte) 100, (byte) 117, (byte) 37, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 97, (byte) 58, (byte) 37}) + this.a.g);
            }
            if (this.a.g) {
                if (VERSION.SDK_INT >= 19 && this.a.a.isQuickScaleEnabled()) {
                    return true;
                }
                this.a.q = true;
                this.a.a(Math.min(this.a.getMaxScale(), Math.max(this.a.a(this.a.getScale(), this.a.getMaxScale(), this.a.getMinScale()), this.a.getMinScale())), motionEvent.getX(), motionEvent.getY(), (long) this.a.A);
            }
            if (this.a.L != null) {
                this.a.L.a();
            }
            return super.onDoubleTap(motionEvent);
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.a.isLongClickable() && !this.a.a.isInProgress()) {
                this.a.setPressed(true);
                this.a.performLongClick();
            }
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.a.i && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !this.a.a.isInProgress()) {
                return this.a.a(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (this.a.i && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !this.a.a.isInProgress() && SystemClock.uptimeMillis() - this.a.j > 150) {
                return this.a.b(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return this.a.d(motionEvent);
        }

        public boolean onDown(MotionEvent motionEvent) {
            if (ColumnImageViewTouchBase.l) {
                Log.i(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 65, (byte) 106, (byte) 114, (byte) 107}));
            }
            this.a.e();
            return this.a.b(motionEvent);
        }
    }

    /* compiled from: BL */
    public interface b {
        void a();
    }

    /* compiled from: BL */
    public interface c {
        void a();
    }

    /* compiled from: BL */
    public class d extends SimpleOnScaleGestureListener {
        protected boolean a = false;
        final /* synthetic */ ColumnImageViewTouch b;

        public d(ColumnImageViewTouch columnImageViewTouch) {
            this.b = columnImageViewTouch;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = this.b.getScale() * scaleGestureDetector.getScaleFactor();
            if (this.b.h) {
                if (this.a && currentSpan != 0.0f) {
                    this.b.q = true;
                    this.b.c(Math.min(this.b.getMaxScale(), Math.max(scale, this.b.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    this.b.d = 1;
                    this.b.invalidate();
                } else if (!this.a) {
                    this.a = true;
                }
            }
            return true;
        }
    }

    public ColumnImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColumnImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void a(Context context, AttributeSet attributeSet, int i) {
        super.a(context, attributeSet, i);
        this.c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.e = getGestureListener();
        this.f = getScaleListener();
        this.a = new ScaleGestureDetector(getContext(), this.f);
        this.b = new GestureDetector(getContext(), this.e, null, true);
        this.d = 1;
        setQuickScaleEnabled(false);
    }

    @TargetApi(19)
    public void setQuickScaleEnabled(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.a.setQuickScaleEnabled(z);
        }
    }

    @TargetApi(19)
    public boolean getQuickScaleEnabled() {
        if (VERSION.SDK_INT >= 19) {
            return this.a.isQuickScaleEnabled();
        }
        return false;
    }

    public float getScaleFactor() {
        return this.K;
    }

    public void setDoubleTapListener(b bVar) {
        this.L = bVar;
    }

    public void setSingleTapListener(c cVar) {
        this.M = cVar;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.g = z;
    }

    public void setScaleEnabled(boolean z) {
        this.h = z;
    }

    public void setScrollEnabled(boolean z) {
        this.i = z;
    }

    public boolean getDoubleTapEnabled() {
        return this.g;
    }

    protected OnGestureListener getGestureListener() {
        return new a(this);
    }

    protected OnScaleGestureListener getScaleListener() {
        return new d(this);
    }

    protected void a(int i, int i2, int i3, int i4) {
        super.a(i, i2, i3, i4);
        Log.v(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 104, (byte) 108, (byte) 107, (byte) 63, (byte) 37}) + getMinScale() + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 104, (byte) 100, (byte) 125, (byte) 63, (byte) 37}) + getMaxScale() + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 63, (byte) 37}) + ((getMaxScale() - getMinScale()) / 2.0f));
        this.K = ((getMaxScale() - getMinScale()) / 2.0f) + 0.5f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6) {
            this.j = motionEvent.getEventTime();
        }
        this.a.onTouchEvent(motionEvent);
        if (!this.a.isInProgress()) {
            this.b.onTouchEvent(motionEvent);
        }
        switch (actionMasked) {
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                return c(motionEvent);
            default:
                return true;
        }
    }

    protected float a(float f, float f2, float f3) {
        if (this.K + f <= f2) {
            return f + this.K;
        }
        return f3;
    }

    public boolean a(MotionEvent motionEvent) {
        return true;
    }

    public boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!a()) {
            return false;
        }
        this.q = true;
        b(-f, -f2);
        invalidate();
        return true;
    }

    public boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!a()) {
            return false;
        }
        if (l) {
            Log.i(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 67, (byte) 105, (byte) 108, (byte) 107, (byte) 98}));
        }
        if (Math.abs(f) <= ((float) (this.B * 4)) && Math.abs(f2) <= ((float) (this.B * 4))) {
            return false;
        }
        if (l) {
            Log.v(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 115, (byte) 96, (byte) 105, (byte) 106, (byte) 102, (byte) 108, (byte) 113, (byte) 124, (byte) 63, (byte) 37}) + f2);
            Log.v(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 97, (byte) 108, (byte) 99, (byte) 99, (byte) 63, (byte) 37}) + (motionEvent2.getY() - motionEvent.getY()));
        }
        float min = Math.min(Math.max(2.0f, getScale() / 2.0f), 3.0f);
        float width = (f / ((float) this.C)) * (((float) getWidth()) * min);
        float height = (f2 / ((float) this.C)) * (((float) getHeight()) * min);
        if (l) {
            Log.v(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 63, (byte) 37}) + getScale() + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 90, (byte) 99, (byte) 108, (byte) 107, (byte) 100, (byte) 105, (byte) 63, (byte) 37}) + min);
            Log.v(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 97, (byte) 65, (byte) 108, (byte) 118, (byte) 113, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 93, (byte) 63, (byte) 37}) + width);
            Log.v(hae.a(new byte[]{(byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 81, (byte) 106, (byte) 112, (byte) 102, (byte) 109, (byte) 71, (byte) 100, (byte) 118, (byte) 96}), hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 97, (byte) 65, (byte) 108, (byte) 118, (byte) 113, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 92, (byte) 63, (byte) 37}) + height);
        }
        this.q = true;
        a(width, height, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow((double) width, 2.0d) + Math.pow((double) height, 2.0d)) / 5.0d), 800.0d));
        postInvalidate();
        return true;
    }

    public boolean b(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        return true;
    }

    public boolean c(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale() < getMinScale()) {
            a(getMinScale(), 50);
        }
        return true;
    }

    public boolean d(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        return true;
    }

    public boolean a() {
        if (getScale() > 1.0f) {
            return true;
        }
        if (this.I.contains(getBitmapRect())) {
            return false;
        }
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        RectF bitmapRect = getBitmapRect();
        return (i < 0 && bitmapRect.left < this.I.left) || (i > 0 && bitmapRect.right > this.I.right);
    }
}
