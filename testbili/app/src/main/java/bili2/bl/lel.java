package bili2.bl;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.fd_service.FreeDataManager;
import com.bilibili.fd_service.FreeDataResult;
import com.bilibili.fd_service.FreeDataResult.ResultType;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class lel implements fit<String> {
    private static final String a = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113});
    private static final String b = hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
    private static final String c = hae.a(new byte[]{(byte) 113, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
    private static final String d = hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96});

    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public String a(fjg bl_fjg) {
        Bundle bundle = bl_fjg.b;
        JSONObject jSONObject = new JSONObject();
        if (bl_fjg.c == null || bundle == null) {
            BLog.e(hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 65, (byte) 100, (byte) 113, (byte) 100, (byte) 80, (byte) 119, (byte) 105, (byte) 81, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 37, (byte) 63, (byte) 37, (byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 118, (byte) 37, (byte) 56, (byte) 37}) + bl_fjg.b + hae.a(new byte[]{(byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113, (byte) 37, (byte) 56, (byte) 37}) + bl_fjg.c);
            a(jSONObject, -1, gmy.d, gmy.d, hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 37, (byte) 106, (byte) 119, (byte) 37, (byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 118, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105}));
        } else {
            Object string = bundle.getString(hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105}));
            if (TextUtils.isEmpty(string)) {
                BLog.e(hae.a(new byte[]{(byte) 37, (byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 65, (byte) 100, (byte) 113, (byte) 100, (byte) 80, (byte) 119, (byte) 105, (byte) 81, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 37, (byte) 63, (byte) 37, (byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 36}));
                a(jSONObject, 4, gmy.d, gmy.d, hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124}));
            } else {
                a(a(bl_fjg.c), jSONObject, bundle, string);
            }
        }
        return jSONObject.a();
    }

    private void a(JSONObject jSONObject, int i, String str, String str2, String str3) {
        jSONObject.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), Integer.valueOf(i));
        jSONObject.a(hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), str);
        jSONObject.a(hae.a(new byte[]{(byte) 113, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), str2);
        jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), str3);
    }

    private int a(FreeDataResult freeDataResult) {
        if (freeDataResult.c == ResultType.SUCCESS) {
            return 1;
        }
        if (freeDataResult.c == ResultType.FAILED) {
            return 2;
        }
        if (freeDataResult.c == ResultType.IP_INVALIDE) {
            return 3;
        }
        return 4;
    }

    private void a(Context context, JSONObject jSONObject, Bundle bundle, String str) {
        String string = bundle.getString(hae.a(new byte[]{(byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 110, (byte) 96, (byte) 124, (byte) 43, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 43, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113}));
        if (hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102}).equalsIgnoreCase(string)) {
            a(context, jSONObject, str);
        } else if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 114, (byte) 100, (byte) 113, (byte) 102, (byte) 109}).equalsIgnoreCase(string)) {
            b(context, jSONObject, str);
        } else if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 117, (byte) 112, (byte) 118, (byte) 109}).equalsIgnoreCase(string)) {
            c(context, jSONObject, str);
        } else if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97}).equalsIgnoreCase(string)) {
            d(context, jSONObject, str);
        } else if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 102, (byte) 105, (byte) 108, (byte) 117, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106}).equalsIgnoreCase(string)) {
            e(context, jSONObject, str);
        } else if (hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107}).equalsIgnoreCase(string)) {
            f(context, jSONObject, str);
        } else {
            a(jSONObject, -1, str, gmy.d, hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 37, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 37, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 104, (byte) 100, (byte) 113, (byte) 102, (byte) 109, (byte) 96, (byte) 97, (byte) 36}));
        }
    }

    private void a(Context context, JSONObject jSONObject, String str) {
        FreeDataResult c = FreeDataManager.a().c(context, str);
        a(jSONObject, a(c), c.b, c.a, c.b());
    }

    private void b(Context context, JSONObject jSONObject, String str) {
        FreeDataResult b = FreeDataManager.a().b(context, str);
        a(jSONObject, a(b), b.b, b.a, b.b());
    }

    private void c(Context context, JSONObject jSONObject, String str) {
        FreeDataResult a = FreeDataManager.a().a(context, str);
        a(jSONObject, a(a), a.b, a.a, a.b());
    }

    private void d(Context context, JSONObject jSONObject, String str) {
        FreeDataResult b = FreeDataManager.a().b(context, str);
        a(jSONObject, a(b), b.b, b.a, b.b());
    }

    private void e(Context context, JSONObject jSONObject, String str) {
        FreeDataResult b = FreeDataManager.a().b(context, str);
        a(jSONObject, a(b), b.b, b.a, b.b());
    }

    private void f(Context context, JSONObject jSONObject, String str) {
        FreeDataResult a = FreeDataManager.a().a(context, str, false);
        a(jSONObject, a(a), a.b, a.a, a.b());
    }

    static Context a(Context context) {
        return ((context instanceof Application) || (context instanceof Service)) ? context : context.getApplicationContext();
    }
}
