package bili.bl;

import java.io.File;

/* compiled from: BL */
public class blt {
    private static String a = null;

    private static boolean a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (charAt != str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized String a() {
        String str;
        synchronized (blt.class) {
            if (a != null) {
                str = a;
            } else {
                String a = blu.a(new File(hae.a(new byte[]{(byte) 42, (byte) 118, (byte) 124, (byte) 118, (byte) 42, (byte) 102, (byte) 105, (byte) 100, (byte) 118, (byte) 118, (byte) 42, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 90, (byte) 112, (byte) 118, (byte) 103, (byte) 42, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 53, (byte) 42, (byte) 108, (byte) 86, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105})));
                if (a(a)) {
                    a = a;
                    str = a;
                } else {
                    for (String a2 : new String[]{hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 107, (byte) 106}), hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 43, (byte) 103, (byte) 106, (byte) 106, (byte) 113, (byte) 43, (byte) 118, (byte) 96, (byte) 119, (byte) 108, (byte) 100, (byte) 105, (byte) 107, (byte) 106}), hae.a(new byte[]{(byte) 98, (byte) 118, (byte) 104, (byte) 43, (byte) 97, (byte) 96, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 118, (byte) 107}), hae.a(new byte[]{(byte) 98, (byte) 118, (byte) 104, (byte) 43, (byte) 103, (byte) 100, (byte) 118, (byte) 96, (byte) 103, (byte) 100, (byte) 107, (byte) 97, (byte) 43, (byte) 108, (byte) 104, (byte) 96, (byte) 108}), hae.a(new byte[]{(byte) 98, (byte) 118, (byte) 104, (byte) 43, (byte) 118, (byte) 108, (byte) 104, (byte) 43, (byte) 108, (byte) 104, (byte) 96, (byte) 108}), hae.a(new byte[]{(byte) 117, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 118, (byte) 113, (byte) 43, (byte) 119, (byte) 100, (byte) 97, (byte) 108, (byte) 106, (byte) 43, (byte) 97, (byte) 96, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 43, (byte) 108, (byte) 104, (byte) 96, (byte) 108}), hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 43, (byte) 100, (byte) 105, (byte) 108, (byte) 124, (byte) 112, (byte) 107, (byte) 43, (byte) 102, (byte) 105, (byte) 106, (byte) 112, (byte) 97, (byte) 112, (byte) 112, (byte) 108, (byte) 97}), hae.a(new byte[]{(byte) 119, (byte) 108, (byte) 105, (byte) 43, (byte) 103, (byte) 100, (byte) 119, (byte) 102, (byte) 106, (byte) 97, (byte) 96})}) {
                        String a22 = est.a(a22);
                        if (!(a22 == null || a22.length() == 0)) {
                            a22 = a22.trim();
                            if (a(a22)) {
                                a = a22;
                                str = a;
                                break;
                            }
                        }
                    }
                    str = null;
                }
            }
        }
        return str;
    }
}
