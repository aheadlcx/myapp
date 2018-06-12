package bili.bl;

import android.content.Context;
import android.os.Build.VERSION;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import bl.evh.a;
import com.bilibili.commons.time.FastDateFormat;
import java.util.Date;
import java.util.Locale;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class evd {
    private static final String a = hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 110, (byte) 108, (byte) 113, (byte) 70, (byte) 106, (byte) 106, (byte) 110, (byte) 108, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119});

    public static void a(final Context context) {
        if (eva.a(context).a()) {
            etb.a(2, new Runnable() {
                public void run() {
                    evd.b(context);
                }
            });
        }
    }

    public static void b(Context context) {
        evh n = eva.a(context).n();
        CookieManager instance = CookieManager.getInstance();
        if (!(n == null || n.a.size() <= 0 || ern.c(n.b))) {
            instance.setAcceptCookie(true);
            for (a aVar : n.a) {
                for (String str : n.b) {
                    instance.setCookie(str, a(aVar, str));
                }
            }
        }
        if (VERSION.SDK_INT >= 21) {
            instance.flush();
            return;
        }
        CookieSyncManager d = d(context);
        if (d != null) {
            d.sync();
        }
    }

    private static String a(a aVar, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date();
        date.setTime(aVar.d * 1000);
        stringBuilder.append(aVar.a).append("=").append(aVar.b).append(hae.a(new byte[]{(byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56})).append(str).append(hae.a(new byte[]{(byte) 62, (byte) 37, (byte) 64, (byte) 125, (byte) 117, (byte) 108, (byte) 119, (byte) 96, (byte) 118, (byte) 56})).append(hae.a(new byte[]{(byte) 64, (byte) 125, (byte) 117, (byte) 108, (byte) 119, (byte) 96, (byte) 118, (byte) 56}) + FastDateFormat.a(hae.a(new byte[]{(byte) 64, (byte) 64, (byte) 64, (byte) 41, (byte) 37, (byte) 97, (byte) 97, (byte) 37, (byte) 72, (byte) 72, (byte) 72, (byte) 37, (byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 37, (byte) 77, (byte) 77, (byte) 63, (byte) 104, (byte) 104, (byte) 63, (byte) 118, (byte) 118, (byte) 37, Byte.MAX_VALUE, Byte.MAX_VALUE, Byte.MAX_VALUE}), Locale.ENGLISH).a(date));
        if (aVar.c == 1) {
            stringBuilder.append(hae.a(new byte[]{(byte) 62, (byte) 37, (byte) 77, (byte) 113, (byte) 113, (byte) 117, (byte) 74, (byte) 107, (byte) 105, (byte) 124}));
        }
        return stringBuilder.toString();
    }

    public static void c(Context context) {
        eva.a(context).o();
        try {
            CookieManager instance = CookieManager.getInstance();
            if (instance == null) {
                return;
            }
            if (VERSION.SDK_INT >= 21) {
                instance.setAcceptCookie(true);
                instance.removeAllCookies(null);
                instance.removeSessionCookies(null);
                instance.flush();
                if (instance.hasCookies()) {
                    instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 97, (byte) 96, (byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 76, (byte) 65, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
                    instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 97, (byte) 96, (byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 76, (byte) 65, (byte) 90, (byte) 90, (byte) 102, (byte) 110, (byte) 72, (byte) 97, (byte) 48, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
                    instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 86, (byte) 64, (byte) 86, (byte) 86, (byte) 65, (byte) 68, (byte) 81, (byte) 68, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
                    instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 115, (byte) 108, (byte) 117, (byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 97, (byte) 96, (byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 76, (byte) 65, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
                    instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 115, (byte) 108, (byte) 117, (byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 97, (byte) 96, (byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 76, (byte) 65, (byte) 90, (byte) 90, (byte) 102, (byte) 110, (byte) 72, (byte) 97, (byte) 48, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
                    instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 115, (byte) 108, (byte) 117, (byte) 98, (byte) 108, (byte) 99, (byte) 113, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 86, (byte) 64, (byte) 86, (byte) 86, (byte) 65, (byte) 68, (byte) 81, (byte) 68, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 98, (byte) 100, (byte) 104, (byte) 96, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
                    instance.flush();
                    return;
                }
                return;
            }
            CookieSyncManager d = d(context);
            instance.removeAllCookie();
            instance.removeSessionCookie();
            if (d != null) {
                d.sync();
            }
            if (instance.hasCookies()) {
                instance.setCookie(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}), hae.a(new byte[]{(byte) 86, (byte) 64, (byte) 86, (byte) 86, (byte) 65, (byte) 68, (byte) 81, (byte) 68, (byte) 56, (byte) 62, (byte) 37, (byte) 65, (byte) 106, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 56, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}));
            }
        } catch (Throwable e) {
            BLog.w(hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 110, (byte) 108, (byte) 113, (byte) 70, (byte) 106, (byte) 106, (byte) 110, (byte) 108, (byte) 96, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 70, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 37, (byte) 102, (byte) 106, (byte) 106, (byte) 110, (byte) 108, (byte) 96, (byte) 118, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 36}), e);
        }
    }

    private static CookieSyncManager d(Context context) {
        try {
            return CookieSyncManager.getInstance();
        } catch (IllegalStateException e) {
            return CookieSyncManager.createInstance(context.getApplicationContext());
        }
    }
}
