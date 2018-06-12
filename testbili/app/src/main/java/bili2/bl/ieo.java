package bili2.bl;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

/* compiled from: BL */
public class ieo {
    private static ieo a;

    private ieo() {
        CookieSyncManager.createInstance(ieb.a().h());
    }

    public static ieo a() {
        if (a == null) {
            synchronized (ieo.class) {
                if (a == null) {
                    a = new ieo();
                }
            }
        }
        return a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            b();
            return;
        }
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.setCookie("mall.bilibili.com", "access_key=" + str + ";path=/;domain=" + "mall.bilibili.com");
        c();
    }

    public void b() {
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        instance.setCookie("mall.bilibili.com", "access_key=;path=/;max-age=0;domain=mall.bilibili.com");
        c();
    }

    private void c() {
        if (VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.createInstance(ieb.a().h()).sync();
        }
    }
}
