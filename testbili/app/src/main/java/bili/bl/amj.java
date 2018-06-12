package bili.bl;

import android.content.Context;

/* compiled from: BL */
public class amj {
    private static int a;

    public static int a(Context context, float f) {
        return (int) ((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static int a(Context context) {
        if (a > 0) {
            return a;
        }
        int i = context.getResources().getDisplayMetrics().widthPixels;
        a = i;
        return i;
    }

    public static int a(Context context, int i) {
        return (int) ((((float) context.getResources().getDisplayMetrics().densityDpi) / 320.0f) * ((float) i));
    }
}
