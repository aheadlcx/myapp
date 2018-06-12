package bili.bl;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: BL */
public class egz {
    private static float a = (VERSION.SDK_INT >= 21 ? 0.2f : 0.0f);

    @Deprecated
    public static void a(Window window, @ColorInt int i, boolean z) {
        a(window, i, z, false);
    }

    @Deprecated
    public static void a(Window window, @ColorInt int i, boolean z, boolean z2) {
        if (VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
            a(window, z2);
            int a = a(window.getContext());
            View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                if (z) {
                    ib.b(childAt, false);
                } else {
                    ib.b(childAt, true);
                }
            }
            ViewGroup viewGroup = (ViewGroup) window.getDecorView();
            View findViewById = viewGroup.findViewById(2131296627);
            if (findViewById == null) {
                findViewById = new View(window.getContext());
                findViewById.setId(2131296627);
                viewGroup.addView(findViewById, new LayoutParams(-1, a));
                childAt = findViewById;
            } else {
                childAt = findViewById;
            }
            childAt.setBackgroundColor(i);
            childAt.setVisibility(z ? 8 : 0);
        }
    }

    @TargetApi(21)
    private static void a(Window window, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            window.addFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            if (VERSION.SDK_INT >= 23 && z) {
                window.getDecorView().setSystemUiVisibility(FragmentTransaction.TRANSIT_EXIT_MASK);
                window.clearFlags(67108864);
                window.setStatusBarColor(0);
            }
        }
    }

    public static void a(Window window) {
        if (VERSION.SDK_INT >= 19) {
            Resources resources = window.getContext().getResources();
            if (cok.a() || col.a()) {
                int color = resources.getColor(2131100869);
                if (cnn.g()) {
                    a(window, color, false);
                    return;
                }
                if (col.a()) {
                    c(window);
                } else if (cok.a()) {
                    b(window);
                }
                a(window, color, false);
            } else if (cnn.g()) {
                a(window, resources.getColor(2131100397), false);
            } else if (VERSION.SDK_INT >= 23) {
                a(window, resources.getColor(2131100869), false, true);
            } else {
                a(window, resources.getColor(2131100013), false);
            }
        }
    }

    public static void a(Activity activity, Window window) {
        if (!(activity instanceof efv)) {
            a(window, 0, false);
        } else if (VERSION.SDK_INT >= 19) {
            Resources resources = window.getContext().getResources();
            if (cok.a() || col.a()) {
                int color = resources.getColor(2131100869);
                if (cnn.g()) {
                    a(window, color, false);
                    return;
                }
                if (col.a()) {
                    c(window);
                } else if (cok.a()) {
                    b(window);
                }
                a(window, color, false);
            } else if (VERSION.SDK_INT >= 23) {
                a(window, 0, false, true);
            } else {
                a(window, 0, false);
            }
        }
    }

    private static void b(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        int a = cok.a(attributes.getClass());
        int a2 = cok.a(attributes);
        if (!(a == -1 || a2 == -1)) {
            cok.a(attributes, a | a2);
        }
        window.setAttributes(attributes);
    }

    private static void c(Window window) {
        Class cls = window.getClass();
        try {
            Class cls2 = Class.forName(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 43, (byte) 72, (byte) 108, (byte) 112, (byte) 108, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 72, (byte) 100, (byte) 107, (byte) 100, (byte) 98, (byte) 96, (byte) 119, (byte) 33, (byte) 73, (byte) 100, (byte) 124, (byte) 106, (byte) 112, (byte) 113, (byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118}));
            int i = cls2.getField(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 67, (byte) 73, (byte) 68, (byte) 66, (byte) 90, (byte) 86, (byte) 81, (byte) 68, (byte) 81, (byte) 80, (byte) 86, (byte) 90, (byte) 71, (byte) 68, (byte) 87, (byte) 90, (byte) 65, (byte) 68, (byte) 87, (byte) 78, (byte) 90, (byte) 72, (byte) 74, (byte) 65, (byte) 64})).getInt(cls2);
            cls.getMethod(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 113, (byte) 64, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 67, (byte) 105, (byte) 100, (byte) 98, (byte) 118}), new Class[]{Integer.TYPE, Integer.TYPE}).invoke(window, new Object[]{Integer.valueOf(i), Integer.valueOf(i)});
        } catch (Throwable th) {
            ibn.a(th);
        }
    }

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier(hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 112, (byte) 118, (byte) 90, (byte) 103, (byte) 100, (byte) 119, (byte) 90, (byte) 109, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113}), hae.a(new byte[]{(byte) 97, (byte) 108, (byte) 104, (byte) 96, (byte) 107}), hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}));
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
