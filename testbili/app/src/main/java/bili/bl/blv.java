package bili.bl;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: BL */
public class blv extends gnl {
    public static final int UNKNOWN_VERSION_CODE = 1;
    public static final String UNKNOWN_VERSION_NAME = hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});
    protected static a a;
    private static StringBuilder b;
    private SimpleDateFormat c = new SimpleDateFormat(hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 72, (byte) 72, (byte) 97, (byte) 97, (byte) 77, (byte) 77, (byte) 104, (byte) 104, (byte) 118, (byte) 118, (byte) 118, (byte) 118, (byte) 118}), Locale.getDefault());

    /* compiled from: BL */
    public interface a {
        String a();
    }

    protected void a(HttpUrl httpUrl, klz bl_klz, bl.kly.a aVar) {
        if (httpUrl.i() == null || !httpUrl.i().contains(hae.a(new byte[]{(byte) 42, (byte) 105, (byte) 108, (byte) 107, (byte) 110, (byte) 90, (byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109, (byte) 42, (byte) 115, (byte) 52, (byte) 42, (byte) 105, (byte) 108, (byte) 107, (byte) 110, (byte) 90, (byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109, (byte) 42, (byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109}))) {
            super.a(httpUrl, bl_klz, aVar);
        } else {
            super.a(httpUrl, aVar);
        }
    }

    protected void a(Map<String, String> map) {
        super.a(map);
        map.put(hae.a(new byte[]{(byte) 90, (byte) 97, (byte) 96, (byte) 115, (byte) 108, (byte) 102, (byte) 96}), hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}));
        map.put(hae.a(new byte[]{(byte) 90, (byte) 109, (byte) 114, (byte) 108, (byte) 97}), a());
        b((Map) map);
        map.put("src", ams.d());
        map.put(hae.a(new byte[]{(byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107}), b());
        map.put(hae.a(new byte[]{(byte) 113, (byte) 119, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 97}), this.c.format(Long.valueOf(System.currentTimeMillis())));
    }

    private String b() {
        if (b == null) {
            b = new StringBuilder();
            if (blg.a().getApplicationContext() != null) {
                b.append(a(blg.a().getApplicationContext())).append(".").append(b(blg.a().getApplicationContext()));
            }
        }
        return b.toString();
    }

    String a() {
        return blr.d(blg.a());
    }

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            return hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            return UNKNOWN_VERSION_CODE;
        }
    }

    protected void b(Map<String, String> map) {
        if (a == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 104, (byte) 68, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 78, (byte) 96, (byte) 124, (byte) 66, (byte) 96, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 118, (byte) 96, (byte) 113}));
        }
        CharSequence a = a.a();
        if (!TextUtils.isEmpty(a)) {
            map.put(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 90, (byte) 110, (byte) 96, (byte) 124}), a);
        }
    }

    public static void a(a aVar) {
        a = aVar;
    }
}
