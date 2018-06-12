package bili.bl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewDebug.IntToString;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: BL */
public class ege extends ViewGroup {
    protected List<b> a;
    private int b;
    private float c;
    private int d;
    private int e;
    private boolean f;
    private int g;

    /* compiled from: BL */
    public static class a extends MarginLayoutParams {
        public boolean a = false;
        @ExportedProperty(mapping = {@IntToString(from = 0, to = "NONE"), @IntToString(from = 48, to = "TOP"), @IntToString(from = 80, to = "BOTTOM"), @IntToString(from = 3, to = "LEFT"), @IntToString(from = 5, to = "RIGHT"), @IntToString(from = 16, to = "CENTER_VERTICAL"), @IntToString(from = 112, to = "FILL_VERTICAL"), @IntToString(from = 1, to = "CENTER_HORIZONTAL"), @IntToString(from = 7, to = "FILL_HORIZONTAL"), @IntToString(from = 17, to = "CENTER"), @IntToString(from = 119, to = "FILL")})
        public int b = 0;
        public float c = -1.0f;
        public int d;
        public int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            a(context, attributeSet);
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public boolean a() {
            return this.b != 0;
        }

        public boolean b() {
            return this.c >= 0.0f;
        }

        private void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.a.ag);
            try {
                this.a = obtainStyledAttributes.getBoolean(1, false);
                this.b = obtainStyledAttributes.getInt(0, 0);
                this.c = obtainStyledAttributes.getFloat(2, -1.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        void a(int i, int i2) {
            this.d = i;
            this.e = i2;
        }

        int c() {
            return this.h;
        }

        public void a(int i) {
            this.h = i;
        }

        public int d() {
            return this.i;
        }

        void b(int i) {
            this.i = i;
        }

        public int e() {
            return this.j;
        }

        public void c(int i) {
            this.j = i;
        }

        int f() {
            return this.k;
        }

        void d(int i) {
            this.k = i;
        }

        public int g() {
            return this.f;
        }

        public int h() {
            return this.g;
        }

        void e(int i) {
            if (i == 0) {
                this.f = this.leftMargin + this.rightMargin;
                this.g = this.topMargin + this.bottomMargin;
                return;
            }
            this.f = this.topMargin + this.bottomMargin;
            this.g = this.leftMargin + this.rightMargin;
        }
    }

    /* compiled from: BL */
    public class b {
        public View[] a = new View[4];
        public int b;
        protected int c;
        protected int d;
        protected int e;
        protected int f;
        int g = 0;
        int h = 0;
        public int i = 0;
        final /* synthetic */ ege j;

        public b(ege bl_ege) {
            this.j = bl_ege;
        }

        void a(View view) {
            a(this.i, view);
        }

        public void a(int i, View view) {
            a aVar = (a) view.getLayoutParams();
            b(i, view);
            this.c = this.e + aVar.d();
            this.e = (this.c + aVar.g()) + this.j.getSpacing();
            this.f = Math.max(this.f, aVar.e() + aVar.h());
            this.d = Math.max(this.d, aVar.e());
        }

        protected void b(int i, View view) {
            View[] viewArr = this.a;
            int i2 = this.i;
            int length = viewArr.length;
            if (i == i2) {
                if (length == i2) {
                    this.a = new View[(length + 4)];
                    System.arraycopy(viewArr, 0, this.a, 0, length);
                    viewArr = this.a;
                }
                i2 = this.i;
                this.i = i2 + 1;
                viewArr[i2] = view;
            } else if (i < i2) {
                if (length == i2) {
                    this.a = new View[(length + 4)];
                    System.arraycopy(viewArr, 0, this.a, 0, i);
                    System.arraycopy(viewArr, i, this.a, i + 1, i2 - i);
                    viewArr = this.a;
                } else {
                    System.arraycopy(viewArr, i, viewArr, i + 1, i2 - i);
                }
                viewArr[i] = view;
                this.i++;
            } else {
                throw new IndexOutOfBoundsException(hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 56}) + i + hae.a(new byte[]{(byte) 37, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 56}) + i2);
            }
        }

        public boolean b(View view) {
            int measuredWidth;
            if (this.j.getOrientation() == 0) {
                measuredWidth = view.getMeasuredWidth();
            } else {
                measuredWidth = view.getMeasuredHeight();
            }
            return measuredWidth + this.e <= this.b;
        }

        int a() {
            return this.g;
        }

        int b() {
            return this.f;
        }

        int c() {
            return this.c;
        }

        int d() {
            return this.h;
        }

        public void e() {
            this.i = 0;
            Arrays.fill(this.a, null);
            this.e = 0;
            this.c = 0;
            this.f = 0;
            this.d = 0;
            this.h = 0;
            this.g = 0;
        }

        void a(int i) {
            int i2 = this.f - this.d;
            this.f = i;
            this.d = i - i2;
        }

        void b(int i) {
            int i2 = this.e - this.c;
            this.c = i;
            this.e = i2 + i;
        }

        void c(int i) {
            this.g += i;
        }

        void d(int i) {
            this.h += i;
        }

        public void f() {
            int i = 0;
            for (int i2 = 0; i2 < this.i; i2++) {
                a aVar = (a) this.a[i2].getLayoutParams();
                aVar.a(i);
                i += (aVar.g() + aVar.d()) + this.j.getSpacing();
            }
        }
    }

    protected /* synthetic */ LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    public /* synthetic */ LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return a(attributeSet);
    }

    protected /* synthetic */ LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public ege(Context context) {
        this(context, null);
    }

    public ege(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ege(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        this.c = 0.0f;
        this.d = 119;
        this.a = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.a.bG);
        try {
            this.b = obtainStyledAttributes.getInteger(1, this.b);
            this.c = obtainStyledAttributes.getFloat(5, this.c);
            this.d = obtainStyledAttributes.getInteger(0, this.d);
            this.e = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f = obtainStyledAttributes.getBoolean(3, false);
            if (this.f) {
                this.g = 1;
            } else {
                this.g = obtainStyledAttributes.getInteger(2, Integer.MAX_VALUE);
            }
            if (this.f && this.b != 0) {
                this.b = 0;
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
        }
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        b bVar;
        int size = (MeasureSpec.getSize(i) - getPaddingRight()) - getPaddingLeft();
        int size2 = (MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int i5 = getOrientation() == 0 ? size : size2;
        if (getOrientation() != 0) {
            size2 = size;
        }
        if (getOrientation() == 0) {
            i3 = mode;
        } else {
            i3 = mode2;
        }
        if (getOrientation() != 0) {
            mode2 = mode;
        }
        int i6 = 0;
        b a = a(0, i5);
        int childCount = getChildCount();
        for (i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), aVar.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), aVar.height));
                aVar.e(getOrientation());
                if (getOrientation() == 0) {
                    aVar.b(childAt.getMeasuredWidth());
                    aVar.c(childAt.getMeasuredHeight());
                } else {
                    aVar.b(childAt.getMeasuredHeight());
                    aVar.c(childAt.getMeasuredWidth());
                }
                Object obj = (aVar.a || !(i3 == 0 || a.b(childAt))) ? 1 : null;
                if (obj == null) {
                    bVar = a;
                    mode = i6;
                } else if (i6 == this.g - 1) {
                    break;
                } else {
                    mode = i6 + 1;
                    bVar = a(mode, i5);
                }
                bVar.a(childAt);
                i6 = mode;
                a = bVar;
            }
        }
        while (i6 < this.a.size() - 1) {
            this.a.remove(this.a.size() - 1);
        }
        a(this.a);
        childCount = this.a.size();
        i4 = 0;
        for (i6 = 0; i6 < childCount; i6++) {
            i4 = Math.max(i4, ((b) this.a.get(i6)).c());
        }
        i6 = a.b() + a.a();
        a(this.a, a(i3, i5, i4), a(mode2, size2, i6));
        for (i5 = 0; i5 < childCount; i5++) {
            bVar = (b) this.a.get(i5);
            if (a != bVar) {
                b(bVar);
            }
            a(bVar);
        }
        size = getPaddingLeft() + getPaddingRight();
        size2 = getPaddingTop() + getPaddingBottom();
        if (getOrientation() == 0) {
            i5 = size + i4;
            size = size2 + i6;
        } else {
            i5 = size + i6;
            size = size2 + i4;
        }
        setMeasuredDimension(resolveSize(i5, i), resolveSize(size, i2));
    }

    public b a(int i, int i2) {
        b bVar;
        if (i < this.a.size()) {
            bVar = (b) this.a.get(i);
            bVar.e();
        } else {
            bVar = new b(this);
            this.a.add(bVar);
        }
        bVar.b = i2;
        return bVar;
    }

    protected int a(int i, int i2, int i3) {
        switch (i) {
            case Integer.MIN_VALUE:
                return Math.min(i3, i2);
            case 1073741824:
                return i2;
            default:
                return i3;
        }
    }

    protected void a(List<b> list) {
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) list.get(i2);
            bVar.c(i);
            i += bVar.b() + getSpacing();
            bVar.f();
        }
    }

    protected void a(b bVar) {
        for (int i = 0; i < bVar.i; i++) {
            View view = bVar.a[i];
            a aVar = (a) view.getLayoutParams();
            if (getOrientation() == 0) {
                aVar.a((getPaddingLeft() + bVar.d()) + aVar.c(), (getPaddingTop() + bVar.a()) + aVar.f());
                view.measure(MeasureSpec.makeMeasureSpec(aVar.d(), 1073741824), MeasureSpec.makeMeasureSpec(aVar.e(), 1073741824));
            } else {
                aVar.a((getPaddingLeft() + bVar.a()) + aVar.f(), (getPaddingTop() + bVar.d()) + aVar.c());
                view.measure(MeasureSpec.makeMeasureSpec(aVar.e(), 1073741824), MeasureSpec.makeMeasureSpec(aVar.d(), 1073741824));
            }
        }
    }

    protected void a(List<b> list, int i, int i2) {
        int size = list.size();
        if (size > 0) {
            b bVar = (b) list.get(size - 1);
            int a = i2 - (bVar.a() + bVar.b());
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                bVar = (b) list.get(i4);
                int gravity = getGravity();
                int round = Math.round((float) ((1 * a) / size));
                int c = bVar.c();
                int b = bVar.b();
                Rect rect = new Rect();
                rect.top = i3;
                rect.left = 0;
                rect.right = i;
                rect.bottom = (b + round) + i3;
                Rect rect2 = new Rect();
                Gravity.apply(gravity, c, b, rect, rect2);
                i3 += round;
                bVar.d(rect2.left);
                bVar.c(rect2.top);
                bVar.b(rect2.width());
                bVar.a(rect2.height());
            }
        }
    }

    protected void b(b bVar) {
        int i = bVar.i;
        if (i > 0) {
            int i2 = 0;
            float f = 0.0f;
            while (i2 < i) {
                float b = f + b((a) bVar.a[i2].getLayoutParams());
                i2++;
                f = b;
            }
            a aVar = (a) bVar.a[i - 1].getLayoutParams();
            int c = bVar.c() - (aVar.c() + aVar.d());
            int i3 = 0;
            for (i2 = 0; i2 < i; i2++) {
                aVar = (a) bVar.a[i2].getLayoutParams();
                float b2 = b(aVar);
                int a = a(aVar);
                int round = Math.round((b2 * ((float) c)) / f);
                int d = aVar.d() + aVar.g();
                int e = aVar.e() + aVar.h();
                Rect rect = new Rect();
                rect.top = 0;
                rect.left = i3;
                rect.right = (d + round) + i3;
                rect.bottom = bVar.b();
                Rect rect2 = new Rect();
                Gravity.apply(a, d, e, rect, rect2);
                i3 += round;
                aVar.a(rect2.left + aVar.c());
                aVar.d(rect2.top);
                aVar.b(rect2.width() - aVar.g());
                aVar.c(rect2.height() - aVar.h());
            }
        }
    }

    private int a(a aVar) {
        return aVar.a() ? aVar.b : getGravity();
    }

    private float b(a aVar) {
        return aVar.b() ? aVar.c : getWeightDefault();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            childAt.layout(aVar.d + aVar.leftMargin, aVar.e + aVar.topMargin, (aVar.d + aVar.leftMargin) + childAt.getMeasuredWidth(), (aVar.topMargin + aVar.e) + childAt.getMeasuredHeight());
        }
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    protected a a() {
        return b(-2, -2);
    }

    protected a b(int i, int i2) {
        return new a(i, i2);
    }

    public a a(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    protected a a(LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getOrientation() {
        return this.b;
    }

    public void setOrientation(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
            invalidate();
        }
    }

    public float getWeightDefault() {
        return this.c;
    }

    public void setWeightDefault(float f) {
        this.c = f;
        requestLayout();
        invalidate();
    }

    public int getGravity() {
        return this.d;
    }

    public void setGravity(int i) {
        this.d = i;
        requestLayout();
        invalidate();
    }

    public int getSpacing() {
        return this.e;
    }

    public void setSpacing(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
            invalidate();
        }
    }

    public void setMaxLines(int i) {
        this.g = i;
        requestLayout();
        invalidate();
    }

    public int getMaxLines() {
        return this.g;
    }
}
