package bili3.com.bilibili.nativelibrary;

import android.text.TextUtils;
import bl.hae;
import com.tencent.connect.common.Constants;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: BL */
public final class SignedQuery {
    private static final char[] c = hae.a(new byte[]{(byte) 53, (byte) 52, (byte) 55, (byte) 54, (byte) 49, (byte) 48, (byte) 51, (byte) 50, (byte) 61, (byte) 60, (byte) 68, (byte) 71, (byte) 70, (byte) 65, (byte) 64, (byte) 67}).toCharArray();
    public final String a;
    public final String b;

    public SignedQuery(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        if (this.a == null) {
            return Constants.STR_EMPTY;
        }
        if (this.b == null) {
            return this.a;
        }
        return this.a + hae.a(new byte[]{(byte) 35, (byte) 118, (byte) 108, (byte) 98, (byte) 107, (byte) 56}) + this.b;
    }

    static String r(Map<String, String> map) {
        if (!(map instanceof SortedMap)) {
            map = new TreeMap(map);
        }
        StringBuilder stringBuilder = new StringBuilder(256);
        for (Entry entry : r5.entrySet()) {
            String str = (String) entry.getKey();
            if (!TextUtils.isEmpty(str)) {
                stringBuilder.append(a(str));
                stringBuilder.append("=");
                String str2 = (String) entry.getValue();
                stringBuilder.append(str2 == null ? Constants.STR_EMPTY : a(str2));
                stringBuilder.append("&");
            }
        }
        int length = stringBuilder.length();
        if (length > 0) {
            stringBuilder.deleteCharAt(length - 1);
        }
        return length == 0 ? null : stringBuilder.toString();
    }

    static String a(String str) {
        return a(str, null);
    }

    static String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        StringBuilder stringBuilder = null;
        while (i < length) {
            int i2 = i;
            while (i2 < length && a(str.charAt(i2), str2)) {
                i2++;
            }
            if (i2 != length) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                if (i2 > i) {
                    stringBuilder.append(str, i, i2);
                }
                i = i2 + 1;
                while (i < length && !a(str.charAt(i), str2)) {
                    i++;
                }
                try {
                    byte[] bytes = str.substring(i2, i).getBytes("UTF-8");
                    int length2 = bytes.length;
                    for (i2 = 0; i2 < length2; i2++) {
                        stringBuilder.append('%');
                        stringBuilder.append(c[(bytes[i2] & 240) >> 4]);
                        stringBuilder.append(c[bytes[i2] & 15]);
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            } else if (i == 0) {
                return str;
            } else {
                stringBuilder.append(str, i, length);
                return stringBuilder.toString();
            }
        }
        return stringBuilder != null ? stringBuilder.toString() : str;
    }

    private static boolean a(char c, String str) {
        return (c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || !((c < '0' || c > '9') && "-_.~".indexOf(c) == -1 && (str == null || str.indexOf(c) == -1)));
    }
}
