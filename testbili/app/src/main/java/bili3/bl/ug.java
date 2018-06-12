package bili3.bl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;

public final class ug {
    public static String a = "null";
    public static String b = Constants.STR_EMPTY;
    public static String c = Constants.STR_EMPTY;
    public static String d = Constants.STR_EMPTY;
    public static boolean e = true;
    public static boolean f;
    private static Context g = null;
    private static String h;
    private static long i;
    private static int j = 0;
    private static boolean k = false;
    private static String l = Constants.STR_EMPTY;
    private static String m = "3.4.0.7";
    private static String n = Constants.STR_EMPTY;
    private static boolean o = false;
    private static String p = Constants.STR_EMPTY;
    private static Handler q;
    private static volatile boolean r = false;

    public static Context a() {
        return g;
    }

    public static void a(int i, boolean z, Context context, String str, String str2, String str3) {
        i = SystemClock.elapsedRealtime();
        g = context.getApplicationContext();
        l = context.getPackageName();
        j = i;
        k = z;
        if (sd.a(str)) {
            str = Constants.STR_EMPTY;
        }
        c = str;
        if (sd.a(str2)) {
            str2 = Constants.STR_EMPTY;
        }
        d = str2;
        m = "3.4.0.7";
        Handler handler = new Handler(g.getMainLooper());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            a = packageInfo.versionName;
            int i2 = packageInfo.versionCode;
            b = packageInfo.applicationInfo.loadLabel(context.getPackageManager()).toString();
        } catch (Throwable th) {
        }
        n = str3;
        o = l.equals(n);
        h = sd.d();
        HandlerThread handlerThread = new HandlerThread("HalleyTempTaskThread");
        handlerThread.start();
        q = new Handler(handlerThread.getLooper());
        uj.a();
    }

    public static int b() {
        return j;
    }

    public static String c() {
        return h;
    }

    public static int d() {
        return (int) (SystemClock.elapsedRealtime() - i);
    }

    public static String e() {
        return l;
    }

    public static boolean f() {
        return k;
    }

    public static String g() {
        return m;
    }

    public static boolean h() {
        return o;
    }

    public static String i() {
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        if (TextUtils.isEmpty(n) || !n.contains(":")) {
            return Constants.STR_EMPTY;
        }
        return n.substring(n.indexOf(":") + 1);
    }

    public static Handler j() {
        return q;
    }
}
