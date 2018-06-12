package bili.bl;

import android.content.Context;

/* compiled from: BL */
public class cna {
    private static cmz a;

    public static void a(Context context, String str) {
        if (a != null) {
            a.a(context, str);
        }
    }

    public static void b(Context context, String str) {
        if (a != null) {
            a.b(context, str);
        }
    }

    public static void a(Context context) {
        if (a != null) {
            a.a(context);
        }
    }

    public static void b(Context context) {
        if (a != null) {
            a.b(context);
        }
    }
}
