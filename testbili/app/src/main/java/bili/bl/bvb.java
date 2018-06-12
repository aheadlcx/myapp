package bili.bl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.annotation.ColorInt;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* compiled from: BL */
public class bvb extends g {
    private Paint a = new Paint(1);
    private Paint b;
    private int c;
    private int d;

    public bvb(int i, @ColorInt int i2, int i3, @ColorInt int i4) {
        this.c = i;
        this.d = i3;
        this.a.setColor(i2);
        this.a.setStyle(Style.FILL);
        this.b = new Paint(1);
        this.b.setColor(i4);
        this.b.setStyle(Style.FILL);
    }

    public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
        super.a(rect, view, recyclerView, rVar);
        int f = ((h) view.getLayoutParams()).f();
        int a = a(recyclerView);
        boolean a2 = a(recyclerView, f, a, recyclerView.getAdapter().a());
        int i = ((a - 1) * this.c) / a;
        a = (f % a) * (this.c - i);
        i -= a;
        f = this.c;
        if (a2) {
            f = 0;
        }
        rect.set(a, 0, i, f);
    }

    public void b(Canvas canvas, RecyclerView recyclerView, r rVar) {
        super.b(canvas, recyclerView, rVar);
        c(canvas, recyclerView);
    }

    private void c(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition <= this.d - 1) {
                h hVar = (h) childAt.getLayoutParams();
                int left = childAt.getLeft();
                int right = childAt.getRight();
                int bottom = hVar.bottomMargin + childAt.getBottom();
                int i2 = bottom + this.c;
                if (!(this.a == null || this.b == null)) {
                    canvas.drawRect((float) left, (float) bottom, (float) right, (float) i2, childAdapterPosition < this.d ? this.b : this.a);
                }
                left = childAt.getTop();
                i2 = childAt.getBottom() + this.c;
                int right2 = childAt.getRight() + hVar.rightMargin;
                right = right2 + this.c;
                if (!(this.a == null || this.b == null)) {
                    Paint paint;
                    float f = (float) right2;
                    float f2 = (float) left;
                    float f3 = (float) right;
                    float f4 = (float) i2;
                    if (childAdapterPosition < this.d) {
                        paint = this.b;
                    } else {
                        paint = this.a;
                    }
                    canvas.drawRect(f, f2, f3, f4, paint);
                }
            }
        }
    }

    private boolean a(RecyclerView recyclerView, int i, int i2, int i3) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            boolean z;
            if ((i3 % i2 == 0 ? i3 / i2 : (i3 / i2) + 1) == (i / i2) + 1) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).q() == 1) {
                if (i >= i3 - (i3 % i2)) {
                    return true;
                }
            } else if ((i + 1) % i2 == 0) {
                return true;
            }
        }
        return false;
    }

    private int a(RecyclerView recyclerView) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).c();
        }
        return layoutManager instanceof StaggeredGridLayoutManager ? ((StaggeredGridLayoutManager) layoutManager).h() : -1;
    }
}
