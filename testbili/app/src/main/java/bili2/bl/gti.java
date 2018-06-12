package bili2.bl;

import com.bilibili.api.BiliApiException;

/* compiled from: BL */
class gti {
    static boolean a(Throwable th) {
        if ((th instanceof BiliApiException) && (((BiliApiException) th).mCode == -2 || ((BiliApiException) th).mCode == -101)) {
            return true;
        }
        return false;
    }
}
