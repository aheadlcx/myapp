package bili.bl;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

/* compiled from: BL */
public class cor {
    @Deprecated
    public static void a(Activity activity, @ColorInt int i) {
        a(activity.getWindow(), i, false);
    }

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
            View findViewById = viewGroup.findViewById(2131296631);
            if (findViewById == null) {
                findViewById = new View(window.getContext());
                findViewById.setId(2131296631);
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

    public static int a(Context context) {
        int identifier = context.getResources().getIdentifier(hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 112, (byte) 118, (byte) 90, (byte) 103, (byte) 100, (byte) 119, (byte) 90, (byte) 109, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113}), hae.a(new byte[]{(byte) 97, (byte) 108, (byte) 104, (byte) 96, (byte) 107}), hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}));
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
