package bili4.tv.danmaku.bili.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bl.mco;
import bl.mco.d;

/* compiled from: BL */
public class RevealFrameLayout extends FrameLayout implements mco {
    private Path b;
    private final Rect c;
    private d d;
    private boolean e;
    private float f;

    public RevealFrameLayout(Context context) {
        this(context, null);
    }

    public RevealFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RevealFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.b = new Path();
    }

    public void a() {
        this.e = true;
    }

    public void b() {
        this.e = false;
        invalidate(this.c);
    }

    public void c() {
        b();
    }

    public void setRevealRadius(float f) {
        this.f = f;
        this.d.a().getHitRect(this.c);
        invalidate(this.c);
    }

    public float getRevealRadius() {
        return this.f;
    }

    public void a(d dVar) {
        this.d = dVar;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.e || view != this.d.a()) {
            return super.drawChild(canvas, view, j);
        }
        int save = canvas.save();
        this.b.reset();
        this.b.addCircle((float) this.d.a, (float) this.d.b, this.f, Direction.CW);
        canvas.clipPath(this.b);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }
}
