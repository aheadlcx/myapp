package bili.bl;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.bilibili.okretro.GeneralResponse;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class bsn {
    private static final String a = hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});

    public static void a() {
        a(-1, 2, b(), hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 83, (byte) 55, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}));
    }

    public static void a(int i, String str, String str2) {
        a(i, 6, a(i, str), str2);
    }

    public static void a(int i, int i2, String str, String str2) {
        bmj.a(i, i2, str, str2, new gnb<GeneralResponse<List<Void>>>() {
            public void a(GeneralResponse<List<Void>> generalResponse) {
                BLog.d(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118}));
            }

            public void a(Throwable th) {
                BLog.d(hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}));
            }
        });
    }

    private static String b() {
        return hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 117, (byte) 108, (byte) 43, (byte) 115, (byte) 102, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 102, (byte) 105, (byte) 108, (byte) 117, (byte) 42, (byte) 115, (byte) 52, (byte) 42, (byte) 42, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 42, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 83, (byte) 55, (byte) 58}) + c();
    }

    private static String a(int i, String str) {
        return hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 117, (byte) 108, (byte) 43, (byte) 115, (byte) 102, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 102, (byte) 105, (byte) 108, (byte) 117, (byte) 42, (byte) 115, (byte) 52, (byte) 42, (byte) 42, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 42, (byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 70, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 83, (byte) 55, (byte) 58}).concat(c()).concat(hae.a(new byte[]{(byte) 35, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 108, (byte) 97, (byte) 56})).concat(String.valueOf(i)).concat(hae.a(new byte[]{(byte) 35, (byte) 112, (byte) 117, (byte) 106, (byte) 118, (byte) 90, (byte) 112, (byte) 119, (byte) 108, (byte) 56})).concat(str);
    }

    private static String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hae.a(new byte[]{(byte) 90, (byte) 97, (byte) 96, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 56, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}));
        if (blg.a() != null) {
            Object d = blr.d(blg.a());
            if (!TextUtils.isEmpty(d)) {
                stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 90, (byte) 109, (byte) 114, (byte) 108, (byte) 97, (byte) 56})).append(d);
            }
        }
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 56})).append(eva.a(blg.a()).j());
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 100, (byte) 117, (byte) 117, (byte) 110, (byte) 96, (byte) 124, (byte) 56})).append(ams.a());
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 103, (byte) 112, (byte) 108, (byte) 105, (byte) 97, (byte) 56})).append(ams.c());
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 104, (byte) 106, (byte) 103, (byte) 108, (byte) 90, (byte) 100, (byte) 117, (byte) 117})).append(ams.e());
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 117, (byte) 105, (byte) 100, (byte) 113, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 56, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}));
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 118, (byte) 119, (byte) 102, (byte) 56})).append(ams.d());
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 113, (byte) 119, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 97, (byte) 56})).append(new SimpleDateFormat(hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 72, (byte) 72, (byte) 97, (byte) 97, (byte) 77, (byte) 77, (byte) 104, (byte) 104, (byte) 118, (byte) 118, (byte) 118, (byte) 118, (byte) 118}), Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())));
        stringBuilder.append("&ts=").append(String.valueOf((System.currentTimeMillis() / 1000) * 1000));
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 56, (byte) 52}));
        stringBuilder.append(hae.a(new byte[]{(byte) 35, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107, (byte) 56})).append(a(blg.a())).append(".").append(ams.c());
        return stringBuilder.toString();
    }

    private static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            return hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});
        }
    }
}
