package bili2.bl;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: BL */
public class hga {
    public static hge a(final Activity activity, final hgb bl_hgb) {
        if (activity == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 63, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 37, (byte) 104, (byte) 112, (byte) 118, (byte) 113, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105}));
        }
        int i = activity.getWindow().getAttributes().softInputMode;
        if (16 != i && i != 0) {
            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 63, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 37, (byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 37, (byte) 86, (byte) 106, (byte) 99, (byte) 113, (byte) 76, (byte) 107, (byte) 117, (byte) 112, (byte) 113, (byte) 72, (byte) 96, (byte) 113, (byte) 109, (byte) 106, (byte) 97, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 68, (byte) 65, (byte) 79, (byte) 80, (byte) 86, (byte) 81, (byte) 90, (byte) 87, (byte) 64, (byte) 86, (byte) 76, (byte) 95, (byte) 64}));
        } else if (bl_hgb == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 63, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 96, (byte) 107, (byte) 96, (byte) 119, (byte) 37, (byte) 104, (byte) 112, (byte) 118, (byte) 113, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105}));
        } else {
            final View a = a(activity);
            OnGlobalLayoutListener anonymousClass1 = new OnGlobalLayoutListener() {
                private final Rect d = new Rect();
                private final int e = Math.round(hgd.a(activity, 100.0f));
                private boolean f = false;

                public void onGlobalLayout() {
                    a.getWindowVisibleDisplayFrame(this.d);
                    boolean z = a.getRootView().getHeight() - this.d.height() > this.e;
                    if (z != this.f) {
                        this.f = z;
                        bl_hgb.a(z);
                    }
                }
            };
            a.getViewTreeObserver().addOnGlobalLayoutListener(anonymousClass1);
            return new hgc(activity, anonymousClass1);
        }
    }

    static View a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }
}
