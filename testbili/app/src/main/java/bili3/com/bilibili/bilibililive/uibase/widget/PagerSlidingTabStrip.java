package bili3.com.bilibili.bilibililive.uibase.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import bl.cnn;
import bl.hae;
import java.util.Locale;

/* compiled from: BL */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final int[] b = new int[]{16842901, 16842904};
    private int A;
    private int B;
    private int C;
    private Typeface D;
    private int E;
    private int F;
    private int G;
    private Locale H;
    public f a;
    private LayoutParams c;
    private LayoutParams d;
    private final c e;
    private LinearLayout f;
    private ViewPager g;
    private int h;
    private int i;
    private int j;
    private float k;
    private Paint l;
    private Paint m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: BL */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }

            public SavedState a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                return new SavedState[i];
            }
        };
        int a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }

    /* compiled from: BL */
    public interface a {
    }

    /* compiled from: BL */
    public interface b {
        int a(int i);
    }

    /* compiled from: BL */
    class c implements f {
        final /* synthetic */ PagerSlidingTabStrip a;

        private c(PagerSlidingTabStrip pagerSlidingTabStrip) {
            this.a = pagerSlidingTabStrip;
        }

        public void onPageScrolled(int i, float f, int i2) {
            this.a.i = i;
            this.a.k = f;
            this.a.b(i, (int) (((float) this.a.f.getChildAt(i).getWidth()) * f));
            this.a.invalidate();
            if (this.a.a != null) {
                this.a.a.onPageScrolled(i, f, i2);
            }
        }

        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.a.b(this.a.g.getCurrentItem(), 0);
            }
            if (this.a.a != null) {
                this.a.a.onPageScrollStateChanged(i);
            }
        }

        public void onPageSelected(int i) {
            this.a.j = i;
            this.a.b();
            if (this.a.a != null) {
                this.a.a.onPageSelected(i);
            }
        }
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new c();
        this.i = 0;
        this.j = 0;
        this.k = 0.0f;
        this.n = -10066330;
        this.o = 436207616;
        this.p = 436207616;
        this.q = false;
        this.r = true;
        this.s = 52;
        this.t = 8;
        this.u = 2;
        this.v = 12;
        this.w = 24;
        this.x = 1;
        this.y = 0;
        this.A = 12;
        this.B = -1;
        this.C = -10066330;
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 2131230843;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f = new LinearLayout(context);
        this.f.setOrientation(0);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.s = (int) TypedValue.applyDimension(1, (float) this.s, displayMetrics);
        this.t = (int) TypedValue.applyDimension(1, (float) this.t, displayMetrics);
        this.u = (int) TypedValue.applyDimension(1, (float) this.u, displayMetrics);
        this.v = (int) TypedValue.applyDimension(1, (float) this.v, displayMetrics);
        this.w = (int) TypedValue.applyDimension(1, (float) this.w, displayMetrics);
        this.x = (int) TypedValue.applyDimension(1, (float) this.x, displayMetrics);
        this.A = (int) TypedValue.applyDimension(2, (float) this.A, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b);
        this.A = obtainStyledAttributes.getDimensionPixelSize(0, this.A);
        this.B = obtainStyledAttributes.getColor(1, this.B);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d);
        this.n = cnn.c();
        this.o = obtainStyledAttributes.getColor(15, this.o);
        this.C = cnn.c();
        this.p = obtainStyledAttributes.getColor(1, this.p);
        this.t = obtainStyledAttributes.getDimensionPixelSize(4, this.t);
        this.u = obtainStyledAttributes.getDimensionPixelSize(16, this.u);
        this.v = obtainStyledAttributes.getDimensionPixelSize(2, this.v);
        this.w = obtainStyledAttributes.getDimensionPixelSize(13, this.w);
        this.G = obtainStyledAttributes.getResourceId(10, this.G);
        this.q = obtainStyledAttributes.getBoolean(9, this.q);
        this.s = obtainStyledAttributes.getDimensionPixelSize(8, this.s);
        this.r = obtainStyledAttributes.getBoolean(14, this.r);
        this.z = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.A = obtainStyledAttributes.getDimensionPixelSize(18, a(context, 16.0f));
        this.y = obtainStyledAttributes.getDimensionPixelSize(19, this.y);
        obtainStyledAttributes.recycle();
        this.l = new Paint();
        this.l.setAntiAlias(true);
        this.l.setStyle(Style.FILL);
        this.m = new Paint();
        this.m.setAntiAlias(true);
        this.m.setStrokeWidth((float) this.x);
        this.c = new LayoutParams(-2, -1);
        this.d = new LayoutParams(0, -1, 1.0f);
        if (this.H == null) {
            this.H = getResources().getConfiguration().locale;
        }
    }

    public static int a(Context context, float f) {
        return (int) (((((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f) + 0.5f);
    }

    public void setViewPager(ViewPager viewPager) {
        this.g = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 119, (byte) 37, (byte) 97, (byte) 106, (byte) 96, (byte) 118, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 109, (byte) 100, (byte) 115, (byte) 96, (byte) 37, (byte) 100, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119, (byte) 37, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 43}));
        }
        viewPager.setOnPageChangeListener(this.e);
        a();
    }

    public void setOnPageChangeListener(f fVar) {
        this.a = fVar;
    }

    public void a() {
        this.f.removeAllViews();
        this.h = this.g.getAdapter().getCount();
        for (int i = 0; i < this.h; i++) {
            if (this.g.getAdapter() instanceof b) {
                a(i, ((b) this.g.getAdapter()).a(i));
            } else if (this.g.getAdapter() instanceof a) {
                b(i, this.g.getAdapter().getPageTitle(i).toString());
            } else {
                a(i, this.g.getAdapter().getPageTitle(i).toString());
            }
        }
        b();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
            final /* synthetic */ PagerSlidingTabStrip a;

            {
                this.a = r1;
            }

            public void onGlobalLayout() {
                this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                this.a.i = this.a.g.getCurrentItem();
                this.a.b(this.a.i, 0);
            }
        });
    }

    private void a(int i, String str) {
        View textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        a(i, textView);
    }

    private void a(int i, int i2) {
        View imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        a(i, imageButton);
    }

    private void b(int i, String str) {
        View inflate = LayoutInflater.from(getContext()).inflate(2131429126, null);
        ((TextView) inflate.findViewById(2131300495)).setText(str);
        a(i, inflate);
    }

    private void a(final int i, View view) {
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ PagerSlidingTabStrip b;

            public void onClick(View view) {
                this.b.g.a(i, false);
            }
        });
        view.setPadding(this.w, 0, this.w, 0);
        this.f.addView(view, i, this.q ? this.d : this.c);
    }

    private void b() {
        for (int i = 0; i < this.h; i++) {
            View childAt = this.f.getChildAt(i);
            childAt.setBackgroundResource(this.G);
            TextView textView;
            if (childAt instanceof TextView) {
                textView = (TextView) childAt;
                textView.setTextSize(0, (float) this.A);
                textView.setTypeface(this.D, this.E);
                textView.setTextColor(this.B);
                if (this.r) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.H));
                    }
                }
                if (i == this.j) {
                    textView.setTextColor(this.C);
                }
            } else if ((childAt instanceof View) && (this.g.getAdapter() instanceof a)) {
                textView = (TextView) childAt.findViewById(2131300495);
                textView.setTextSize(0, (float) this.A);
                textView.setTypeface(this.D, this.E);
                textView.setTextColor(this.B);
                if (this.r) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.H));
                    }
                }
                if (i == this.j) {
                    textView.setTextColor(this.C);
                }
            }
        }
    }

    private void b(int i, int i2) {
        if (this.h != 0) {
            int left = this.f.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.s;
            }
            if (left != this.F) {
                this.F = left;
                scrollTo(left, 0);
            }
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.h != 0) {
            float f;
            int height = getHeight();
            this.l.setColor(this.o);
            canvas.drawRect(0.0f, (float) (height - this.u), (float) this.f.getWidth(), (float) height, this.l);
            this.l.setColor(this.n);
            View childAt = this.f.getChildAt(this.i);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.k <= 0.0f || this.i >= this.h - 1) {
                f = left;
            } else {
                View childAt2 = this.f.getChildAt(this.i + 1);
                float right2 = (float) childAt2.getRight();
                float left2 = (this.k * ((float) childAt2.getLeft())) + (left * (1.0f - this.k));
                right = (right * (1.0f - this.k)) + (this.k * right2);
                f = left2;
            }
            if (this.z == 0 || right - f <= ((float) this.z)) {
                canvas.drawRect(f, (float) ((height - this.t) - this.y), right - ((float) this.y), (float) height, this.l);
            } else {
                canvas.drawRect((((right - f) - ((float) this.z)) / 2.0f) + f, (float) ((height - this.t) - this.y), right - (((right - f) - ((float) this.z)) / 2.0f), (float) (height - this.y), this.l);
            }
            this.m.setColor(this.p);
            for (int i = 0; i < this.h - 1; i++) {
                childAt = this.f.getChildAt(i);
                canvas.drawLine((float) childAt.getRight(), (float) this.v, (float) childAt.getRight(), (float) (height - this.v), this.m);
            }
        }
    }

    public void setIndicatorColor(int i) {
        this.n = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.n = getResources().getColor(i);
        invalidate();
    }

    public int getIndicatorColor() {
        return this.n;
    }

    public void setIndicatorHeight(int i) {
        this.t = i;
        invalidate();
    }

    public int getIndicatorHeight() {
        return this.t;
    }

    public void setUnderlineColor(int i) {
        this.o = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.o = getResources().getColor(i);
        invalidate();
    }

    public int getUnderlineColor() {
        return this.o;
    }

    public void setDividerColor(int i) {
        this.p = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.p = getResources().getColor(i);
        invalidate();
    }

    public int getDividerColor() {
        return this.p;
    }

    public void setUnderlineHeight(int i) {
        this.u = i;
        invalidate();
    }

    public int getUnderlineHeight() {
        return this.u;
    }

    public void setDividerPadding(int i) {
        this.v = i;
        invalidate();
    }

    public int getDividerPadding() {
        return this.v;
    }

    public void setScrollOffset(int i) {
        this.s = i;
        invalidate();
    }

    public int getScrollOffset() {
        return this.s;
    }

    public void setShouldExpand(boolean z) {
        this.q = z;
        a();
    }

    public boolean getShouldExpand() {
        return this.q;
    }

    public void setAllCaps(boolean z) {
        this.r = z;
    }

    public void setTextSize(int i) {
        this.A = i;
        b();
    }

    public int getTextSize() {
        return this.A;
    }

    public void setTextColor(int i) {
        this.B = i;
        b();
    }

    public void setTextColorResource(int i) {
        this.B = getResources().getColor(i);
        b();
    }

    public int getTextColor() {
        return this.B;
    }

    public void setSelectedTextColor(int i) {
        this.C = i;
        b();
    }

    public void setSelectedTextColorResource(int i) {
        this.C = getResources().getColor(i);
        b();
    }

    public int getSelectedTextColor() {
        return this.C;
    }

    public void setTabBackground(int i) {
        this.G = i;
        b();
    }

    public int getTabBackground() {
        return this.G;
    }

    public void setTabPaddingLeftRight(int i) {
        this.w = i;
        b();
    }

    public int getTabPaddingLeftRight() {
        return this.w;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.a;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        return savedState;
    }
}
