package bili.bl;

import android.content.Context;
import android.os.Build.VERSION;
import com.bilibili.lib.multidex.BiliMultiDexException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: BL */
public class fgk {
    public static int a = 201;
    public static final boolean b = a();
    public static final boolean c = a(System.getProperty(hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 43, (byte) 115, (byte) 104, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107})));
    static final String d = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 100, (byte) 118, (byte) 118, (byte) 96, (byte) 118});
    static final String e = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 100, (byte) 118, (byte) 118, (byte) 96, (byte) 118});
    static final String f = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 100, (byte) 118, (byte) 118, (byte) 96, (byte) 118, (byte) 43, (byte) 97, (byte) 96, (byte) 125});
    static final String g = hae.a(new byte[]{(byte) 72, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 65, (byte) 96, (byte) 125, (byte) 43, (byte) 105, (byte) 106, (byte) 102, (byte) 110});
    static final String h = hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 43, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 43, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96});
    static final String i = hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96});
    static final String j = hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 43, (byte) 104, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107});
    static final String k = hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 43, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 43, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96});
    static final String l = hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 110, (byte) 43, (byte) 102, (byte) 119, (byte) 102});
    static final String m = hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 110, (byte) 43, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118, (byte) 113, (byte) 100, (byte) 104, (byte) 117});
    static final String n = hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 110, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107});
    static final String o = hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 107, (byte) 112, (byte) 104, (byte) 103, (byte) 96, (byte) 119});
    static final String p = hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 102, (byte) 119, (byte) 102});
    static final String q = hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118, (byte) 113, (byte) 100, (byte) 104, (byte) 117});
    static final String r = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96});
    static final String s = hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107});
    static final String t = hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 102, (byte) 106, (byte) 107, (byte) 97, (byte) 100, (byte) 119, (byte) 124, (byte) 40, (byte) 97, (byte) 96, (byte) 125, (byte) 96, (byte) 118});
    static final String u = hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118, (byte) 113, (byte) 100, (byte) 104, (byte) 117});
    static final String v = hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 107, (byte) 112, (byte) 104, (byte) 103, (byte) 96, (byte) 119});
    static final String w = hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96});
    static final String x = hae.a(new byte[]{(byte) 117, (byte) 106, (byte) 118, (byte) 113, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 108, (byte) 99, (byte) 108, (byte) 96, (byte) 97, (byte) 43, (byte) 119, (byte) 102, (byte) 119});
    static final String y = hae.a(new byte[]{(byte) 117, (byte) 106, (byte) 118, (byte) 113, (byte) 43, (byte) 104, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 97, (byte) 96, (byte) 125, (byte) 43, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107});

    public static void a(Context context, String str) throws BiliMultiDexException {
        fgm.a(context, str);
    }

    public static void a(Context context) throws BiliMultiDexException {
        fgn.a(context);
    }

    public static void b(Context context) throws BiliMultiDexException {
        fgp.a(context);
    }

    public static boolean a(Context context, boolean z) {
        return fgo.a(context, a, z);
    }

    public static void b(Context context, boolean z) {
        fgo.a(context, z);
    }

    public static void c(Context context) {
        fgl.a(context);
    }

    private static boolean a() {
        if (VERSION.SDK_INT <= 19 && !c && VERSION.SDK_INT >= 14) {
            return true;
        }
        return false;
    }

    private static boolean a(String str) {
        if (str == null) {
            return false;
        }
        Matcher matcher = Pattern.compile(hae.a(new byte[]{(byte) 45, (byte) 89, (byte) 97, (byte) 46, (byte) 44, (byte) 89, (byte) 43, (byte) 45, (byte) 89, (byte) 97, (byte) 46, (byte) 44, (byte) 45, (byte) 89, (byte) 43, (byte) 89, (byte) 97, (byte) 46, (byte) 44, (byte) 58})).matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1));
            int parseInt2 = Integer.parseInt(matcher.group(2));
            if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
