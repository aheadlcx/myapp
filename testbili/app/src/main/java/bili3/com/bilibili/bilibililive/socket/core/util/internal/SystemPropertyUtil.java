package bili3.com.bilibili.bilibililive.socket.core.util.internal;

import bl.hae;
import java.util.regex.Pattern;

/* compiled from: BL */
public class SystemPropertyUtil {
    public static String get(String str) {
        try {
            return System.getProperty(str);
        } catch (Exception e) {
            return null;
        }
    }

    public static String get(String str, String str2) {
        String str3 = get(str);
        return str3 == null ? str2 : str3;
    }

    public static int get(String str, int i) {
        Object obj = get(str);
        if (obj != null && Pattern.matches(hae.a(new byte[]{(byte) 40, (byte) 58, (byte) 94, (byte) 53, (byte) 40, (byte) 60, (byte) 88, (byte) 46}), obj)) {
            return Integer.parseInt(obj);
        }
        return i;
    }

    private SystemPropertyUtil() {
    }
}
