package bili2.bl;

import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class fbm implements fbe {
    private static final String a = hae.a(new byte[]{(byte) 81, (byte) 100, (byte) 103, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 86, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 124});
    private View b;
    private View c;
    private ViewGroup d;
    private OnLayoutChangeListener e = new fbn(this);

    final /* synthetic */ void a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i5 != i || i6 != i2 || i7 != i3 || i8 != i4) {
            a();
        }
    }

    public void a(View view, View view2, ViewGroup viewGroup) {
        if (view == null) {
            throw new IllegalStateException(hae.a(new byte[]{(byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 100, (byte) 107, (byte) 102, (byte) 109, (byte) 106, (byte) 119, (byte) 37, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 37, (byte) 104, (byte) 112, (byte) 118, (byte) 113, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 75, (byte) 106, (byte) 75, (byte) 112, (byte) 105, (byte) 105}));
        }
        ViewParent parent = view2.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(view2);
        }
        this.b = view;
        this.c = view2;
        this.d = viewGroup;
        this.b.addOnLayoutChangeListener(this.e);
        this.d.addOnLayoutChangeListener(this.e);
        if (this.b != null) {
            view2.setLayoutParams(new LayoutParams(-2, -2));
            view2.setVisibility(4);
            viewGroup.addView(view2);
            a();
        }
    }

    public void a() {
        if (this.b != null) {
            this.b.post(new fbo(this));
        }
    }

    final /* synthetic */ void e() {
        if (this.c != null && this.b != null && this.d != null) {
            if (this.c.getParent() instanceof ViewGroup) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                int i = (int) (this.c.getResources().getDisplayMetrics().density * 6.0f);
                this.b.getLocationInWindow(iArr);
                this.d.getLocationInWindow(iArr2);
                int width = ((iArr[0] - iArr2[0]) + this.b.getWidth()) - i;
                int max = Math.max((iArr[1] - iArr2[1]) - i, 5);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.c.getLayoutParams();
                marginLayoutParams.leftMargin = Math.max(width, 0);
                marginLayoutParams.topMargin = max;
                BLog.dfmt(hae.a(new byte[]{(byte) 81, (byte) 100, (byte) 103, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 86, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 124}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 96, (byte) 113, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 37, (byte) 105, (byte) 96, (byte) 99, (byte) 113, (byte) 45, (byte) 32, (byte) 118, (byte) 44, (byte) 41, (byte) 37, (byte) 113, (byte) 106, (byte) 117, (byte) 45, (byte) 32, (byte) 118, (byte) 44, (byte) 41, (byte) 37, (byte) 114, (byte) 108, (byte) 97, (byte) 113, (byte) 109, (byte) 45, (byte) 32, (byte) 118, (byte) 44, (byte) 41, (byte) 37, (byte) 109, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113, (byte) 45, (byte) 32, (byte) 118, (byte) 44}), new Object[]{Integer.valueOf(width), Integer.valueOf(max), Integer.valueOf(this.c.getMeasuredWidth()), Integer.valueOf(this.c.getMeasuredHeight())});
                this.c.requestLayout();
                this.c.setVisibility(0);
                return;
            }
            BLog.d(hae.a(new byte[]{(byte) 81, (byte) 100, (byte) 103, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 86, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 124}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 96, (byte) 113, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 37, (byte) 109, (byte) 100, (byte) 118, (byte) 37, (byte) 107, (byte) 106, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 96, (byte) 107, (byte) 113}));
        }
    }

    public void b() {
        if (this.b != null) {
            this.b.removeOnLayoutChangeListener(this.e);
        }
        if (this.d != null) {
            this.d.removeOnLayoutChangeListener(this.e);
        }
    }

    public void c() {
        if (this.c != null) {
            ViewParent parent = this.c.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.c);
                BLog.d(hae.a(new byte[]{(byte) 81, (byte) 100, (byte) 103, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 86, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 124}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 104, (byte) 106, (byte) 115, (byte) 96, (byte) 37, (byte) 118, (byte) 112, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118}));
            }
            this.c = null;
        }
        if (this.b != null) {
            this.b.removeOnLayoutChangeListener(this.e);
        }
        if (this.d != null) {
            this.d.removeOnLayoutChangeListener(this.e);
        }
    }

    public int d() {
        return 0;
    }
}
