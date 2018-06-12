package bili2.bl;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* compiled from: BL */
class ib$j {
    static Field b;
    static boolean c = false;
    private static Field d;
    private static boolean e;
    private static Field f;
    private static boolean g;
    private static WeakHashMap<View, String> h;
    private static Method i;
    WeakHashMap<View, if> a = null;

    ib$j() {
    }

    public void a(View view, @Nullable hh hhVar) {
        view.setAccessibilityDelegate(hhVar == null ? null : hhVar.a());
    }

    public boolean B(View view) {
        boolean z = true;
        if (c) {
            return false;
        }
        if (b == null) {
            try {
                b = View.class.getDeclaredField("mAccessibilityDelegate");
                b.setAccessible(true);
            } catch (Throwable th) {
                c = true;
                return false;
            }
        }
        try {
            if (b.get(view) == null) {
                z = false;
            }
            return z;
        } catch (Throwable th2) {
            c = true;
            return false;
        }
    }

    public boolean b(View view) {
        return false;
    }

    public void a(View view, boolean z) {
    }

    public void c(View view) {
        view.postInvalidate();
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    public void a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, a() + j);
    }

    long a() {
        return ValueAnimator.getFrameDelay();
    }

    public int d(View view) {
        return 0;
    }

    public void a(View view, int i) {
    }

    public void a(View view, Paint paint) {
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    public int k(View view) {
        return 0;
    }

    public ViewParent e(View view) {
        return view.getParent();
    }

    public void b(View view, int i) {
    }

    public int l(View view) {
        return view.getPaddingLeft();
    }

    public int m(View view) {
        return view.getPaddingRight();
    }

    public void b(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    public boolean j(View view) {
        return true;
    }

    public int f(View view) {
        if (!e) {
            try {
                d = View.class.getDeclaredField("mMinWidth");
                d.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            e = true;
        }
        if (d != null) {
            try {
                return ((Integer) d.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public int g(View view) {
        if (!g) {
            try {
                f = View.class.getDeclaredField("mMinHeight");
                f.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            g = true;
        }
        if (f != null) {
            try {
                return ((Integer) f.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    public if C(View view) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        if ifVar = (if) this.a.get(view);
        if (ifVar != null) {
            return ifVar;
        }
        ifVar = new if(view);
        this.a.put(view, ifVar);
        return ifVar;
    }

    public void a(View view, String str) {
        if (h == null) {
            h = new WeakHashMap();
        }
        h.put(view, str);
    }

    public String t(View view) {
        if (h == null) {
            return null;
        }
        return (String) h.get(view);
    }

    public int n(View view) {
        return 0;
    }

    public void h(View view) {
    }

    public void a(View view, float f) {
    }

    public float u(View view) {
        return 0.0f;
    }

    public float v(View view) {
        return 0.0f;
    }

    public void a(View view, Rect rect) {
    }

    public Rect q(View view) {
        return null;
    }

    public void a(ViewGroup viewGroup, boolean z) {
        if (i == null) {
            try {
                i = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (Throwable e) {
                Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", e);
            }
            i.setAccessible(true);
        }
        try {
            i.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e2);
        } catch (Throwable e22) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e22);
        } catch (Throwable e222) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", e222);
        }
    }

    public boolean i(View view) {
        return false;
    }

    public void a(View view, hv hvVar) {
    }

    public ij a(View view, ij ijVar) {
        return ijVar;
    }

    public ij b(View view, ij ijVar) {
        return ijVar;
    }

    public boolean o(View view) {
        return false;
    }

    public boolean w(View view) {
        if (view instanceof hp) {
            return ((hp) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public void a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    public ColorStateList y(View view) {
        return view instanceof hz ? ((hz) view).getSupportBackgroundTintList() : null;
    }

    public void a(View view, ColorStateList colorStateList) {
        if (view instanceof hz) {
            ((hz) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public void a(View view, Mode mode) {
        if (view instanceof hz) {
            ((hz) view).setSupportBackgroundTintMode(mode);
        }
    }

    public Mode z(View view) {
        return view instanceof hz ? ((hz) view).getSupportBackgroundTintMode() : null;
    }

    public void x(View view) {
        if (view instanceof hp) {
            ((hp) view).stopNestedScroll();
        }
    }

    public boolean r(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public float A(View view) {
        return v(view) + u(view);
    }

    public boolean s(View view) {
        return view.getWindowToken() != null;
    }

    public boolean a(View view) {
        return false;
    }

    public void a(View view, int i, int i2) {
    }

    public void c(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            D(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                D((View) parent);
            }
        }
    }

    public void d(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            D(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                D((View) parent);
            }
        }
    }

    private static void D(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public void a(View view, hx hxVar) {
    }

    public Display p(View view) {
        if (s(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }
}
