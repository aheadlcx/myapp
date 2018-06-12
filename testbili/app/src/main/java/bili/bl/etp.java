package bili.bl;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.bilibili.fd_service.FreeDataCondition.OrderType;
import com.bilibili.fd_service.FreeDataResult;
import com.bilibili.fd_service.FreeDataResult.ResultType;

/* compiled from: BL */
public class etp {
    public static FreeDataResult a(Context context, String str) {
        if (e(context) && etc.e().a()) {
            return ets.d(context, str);
        }
        return eun.a(context, str);
    }

    @WorkerThread
    public static FreeDataResult b(Context context, String str) {
        if (e(context) && etc.e().a()) {
            return ets.a(context, str);
        }
        return eun.b(context, str);
    }

    @WorkerThread
    public static FreeDataResult c(Context context, String str) {
        if (!e(context)) {
            FreeDataResult freeDataResult = new FreeDataResult();
            freeDataResult.b = str;
            freeDataResult.c = ResultType.FAILED;
            return freeDataResult;
        } else if (etc.e().a()) {
            return ets.b(context, str);
        } else {
            return eun.c(context, str);
        }
    }

    @WorkerThread
    public static FreeDataResult a(Context context, String str, boolean z) {
        if (!e(context)) {
            FreeDataResult freeDataResult = new FreeDataResult();
            freeDataResult.b = str;
            freeDataResult.c = ResultType.FAILED;
            return freeDataResult;
        } else if (!z) {
            FreeDataResult freeDataResult2 = new FreeDataResult();
            freeDataResult2.b = str;
            freeDataResult2.a = ets.a(str);
            freeDataResult2.c = TextUtils.equals(freeDataResult2.b, freeDataResult2.a) ? ResultType.FAILED : ResultType.SUCCESS;
            return freeDataResult2;
        } else if (etc.e().a()) {
            return ets.c(context, str);
        } else {
            return eun.d(context, str);
        }
    }

    @WorkerThread
    public static FreeDataResult d(Context context, String str) {
        if (e(context)) {
            return ets.e(context, str);
        }
        return eun.e(context, str);
    }

    public static boolean a(Context context) {
        return euo.f(context);
    }

    public static String b(Context context) {
        return eun.a(context);
    }

    public static boolean e(Context context, String str) {
        return eun.f(context, str) || ets.b(str);
    }

    public static boolean a(Context context, boolean z) {
        return eun.a(context, z);
    }

    public static String c(Context context) {
        return eun.b(context);
    }

    public static boolean d(Context context) {
        return euo.b(context);
    }

    public static boolean f(Context context, String str) {
        return eto.a(context, hae.a(new byte[]{(byte) 90, (byte) 102, (byte) 100, (byte) 119, (byte) 97, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), str);
    }

    public static synchronized boolean e(Context context) {
        boolean z;
        synchronized (etp.class) {
            OrderType a = ete.a(context);
            z = a == OrderType.U_CARD_22 || a == OrderType.U_CARD_33 || a == OrderType.U_CARD_66;
        }
        return z;
    }

    public static synchronized boolean a() {
        boolean d;
        synchronized (etp.class) {
            d = euo.d();
        }
        return d;
    }
}
