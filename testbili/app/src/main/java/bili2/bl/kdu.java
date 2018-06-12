package bili2.bl;

import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.decapitalizeSmart.1;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt.decapitalizeSmart.2;

/* compiled from: BL */
public final class kdu {
    public static final String a(String str, boolean z) {
        jgp.b(str, "$receiver");
        1 1 = new 1(str, z);
        if ((((CharSequence) str).length() == 0 ? 1 : 0) != 0 || !1.a(0)) {
            return str;
        }
        if (str.length() == 1 || !1.a(1)) {
            return z ? b(str) : kgp.f(str);
        } else {
            int i;
            Object obj;
            2 2 = new 2(z);
            for (Object next : kgq.b(str)) {
                if (1.a(((Number) next).intValue())) {
                    i = 0;
                    continue;
                } else {
                    i = 1;
                    continue;
                }
                if (i != 0) {
                    obj = next;
                    break;
                }
            }
            obj = null;
            Integer num = (Integer) obj;
            if (num == null) {
                return 2.a(str);
            }
            i = num.intValue() - 1;
            StringBuilder stringBuilder = new StringBuilder();
            String substring = str.substring(0, i);
            jgp.a(substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            stringBuilder = stringBuilder.append(2.a(substring));
            String substring2 = str.substring(i);
            jgp.a(substring2, "(this as java.lang.String).substring(startIndex)");
            return stringBuilder.append(substring2).toString();
        }
    }

    public static final String a(String str) {
        int i;
        jgp.b(str, "$receiver");
        if (str.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' > charAt || 'z' < charAt) {
            return str;
        }
        charAt = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        jgp.a(substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(charAt) + substring;
    }

    public static final String b(String str) {
        int i;
        jgp.b(str, "$receiver");
        if (str.length() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' > charAt || 'Z' < charAt) {
            return str;
        }
        charAt = Character.toLowerCase(charAt);
        String substring = str.substring(1);
        jgp.a(substring, "(this as java.lang.String).substring(startIndex)");
        return String.valueOf(charAt) + substring;
    }

    public static final String c(String str) {
        jgp.b(str, "$receiver");
        StringBuilder stringBuilder = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            StringBuilder stringBuilder2;
            char charAt = str.charAt(i);
            if ('A' <= charAt && 'Z' >= charAt) {
                charAt = Character.toLowerCase(charAt);
                stringBuilder2 = stringBuilder;
            } else {
                stringBuilder2 = stringBuilder;
            }
            stringBuilder2.append(charAt);
        }
        String stringBuilder3 = stringBuilder.toString();
        jgp.a(stringBuilder3, "builder.toString()");
        return stringBuilder3;
    }
}
