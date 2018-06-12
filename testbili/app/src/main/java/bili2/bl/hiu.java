package bili2.bl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.r;
import android.view.View;

/* compiled from: BL */
public class hiu extends g {
    private static final int[] e = new int[]{16843284};
    private Paint a;
    private Drawable b;
    private int c;
    private int d;
    private Rect f;

    public hiu(Context context, int i) {
        this.c = 1;
        this.f = new Rect();
        if (i == 1 || i == 0) {
            this.d = i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e);
            this.b = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException(hae.a(new byte[]{(byte) -25, (byte) -96, (byte) -72, (byte) -25, (byte) -79, (byte) -100, (byte) -22, (byte) -118, (byte) -86, (byte) -23, (byte) -94, (byte) -84, (byte) -24, (byte) -82, (byte) -95, (byte) -24, (byte) -107, (byte) -117, (byte) -22, Byte.MIN_VALUE, (byte) -115, (byte) -23, (byte) -102, (byte) -65, (byte) -32, (byte) -77, (byte) -114}));
    }

    public hiu(Context context, int i, int i2, int i3) {
        this(context, i);
        this.c = i2;
        this.a = new Paint(1);
        this.a.setColor(i3);
        this.a.setStyle(Style.FILL);
    }

    public void a(int i, int i2, int i3, int i4) {
        this.f.set(i, i2, i3, i4);
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
        super.a(rect, view, recyclerView, rVar);
        rect.set(0, 0, 0, this.c);
    }

    public void b(Canvas canvas, RecyclerView recyclerView, r rVar) {
        super.b(canvas, recyclerView, rVar);
        if (this.d == 1) {
            d(canvas, recyclerView);
        } else {
            c(canvas, recyclerView);
        }
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int measuredWidth = recyclerView.getMeasuredWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            h hVar = (h) childAt.getLayoutParams();
            int bottom = hVar.bottomMargin + childAt.getBottom();
            int i2 = bottom + this.c;
            if (this.b != null) {
                this.b.setBounds(this.f.left + paddingLeft, this.f.top + bottom, measuredWidth - this.f.right, i2 - this.f.bottom);
                this.b.draw(canvas);
            }
            if (this.a != null) {
                canvas.drawRect((float) (this.f.left + paddingLeft), (float) (bottom + this.f.top), (float) (measuredWidth - this.f.right), (float) (i2 - this.f.bottom), this.a);
            }
        }
    }

    private void d(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int measuredHeight = recyclerView.getMeasuredHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            h hVar = (h) childAt.getLayoutParams();
            int right = hVar.rightMargin + childAt.getRight();
            int i2 = right + this.c;
            if (this.b != null) {
                this.b.setBounds(this.f.left + right, this.f.top + paddingTop, i2 - this.f.right, measuredHeight - this.f.bottom);
                this.b.draw(canvas);
            }
            if (this.a != null) {
                canvas.drawRect((float) (right + this.f.left), (float) (this.f.top + paddingTop), (float) (i2 - this.f.right), (float) (measuredHeight - this.f.bottom), this.a);
            }
        }
    }
}
