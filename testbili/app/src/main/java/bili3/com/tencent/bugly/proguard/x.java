package bili3.com.tencent.bugly.proguard;

import android.util.Log;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.Locale;

/* compiled from: BL */
public final class x {
    public static String a = "CrashReport";
    public static boolean b = false;
    private static String c = "CrashReportInfo";

    private static boolean a(int i, String str, Object... objArr) {
        if (!b) {
            return false;
        }
        if (str == null) {
            str = "null";
        } else if (!(objArr == null || objArr.length == 0)) {
            str = String.format(Locale.US, str, objArr);
        }
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                Log.i(a, str);
                return true;
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                Log.d(a, str);
                return true;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                Log.w(a, str);
                return true;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                Log.e(a, str);
                return true;
            case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                Log.i(c, str);
                return true;
            default:
                return false;
        }
    }

    public static boolean a(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        return a(0, String.format(Locale.US, "[%s] %s", new Object[]{cls.getSimpleName(), str}), objArr);
    }

    public static boolean b(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean c(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean b(Class cls, String str, Object... objArr) {
        return a(1, String.format(Locale.US, "[%s] %s", new Object[]{cls.getSimpleName(), str}), objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    public static boolean a(Throwable th) {
        return !b ? false : a(2, z.a(th), new Object[0]);
    }

    public static boolean e(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public static boolean b(Throwable th) {
        return !b ? false : a(3, z.a(th), new Object[0]);
    }
}
