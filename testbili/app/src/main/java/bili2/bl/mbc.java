package bili2.bl;

import android.app.Activity;
import android.content.Context;
import com.bilibili.api.BiliApiException;

/* compiled from: BL */
public class mbc {

    /* compiled from: BL */
    public static class a implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg.c instanceof Activity) {
                Context context = (Activity) bl_fjg.c;
                mbc.a(context);
                context.onBackPressed();
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class b {
        public static b a() {
            return new b();
        }
    }

    public static boolean a(Throwable th) {
        if ((th instanceof BiliApiException) && (((BiliApiException) th).mCode == -2 || ((BiliApiException) th).mCode == -101)) {
            return true;
        }
        return false;
    }

    public static void a(Context context) {
        a(context, true);
    }

    public static void a(Context context, boolean z) {
        if (context != null) {
            mcz.c(context);
            if (z) {
                esu.a(context, 2131689974);
            }
        }
    }
}
