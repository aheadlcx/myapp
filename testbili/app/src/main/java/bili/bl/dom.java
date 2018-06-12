package bili.bl;

import android.support.graphics.drawable.animated.BuildConfig;
import java.math.BigDecimal;

/* compiled from: BL */
public class dom {
    public static double a(double d) {
        return new BigDecimal(Double.toString(d)).divide(new BigDecimal("1"), 1, 4).doubleValue();
    }

    public static String a(String str) {
        if (str.indexOf(".") > 0) {
            return str.replaceAll("0+?$", BuildConfig.VERSION_NAME).replaceAll("[.]$", BuildConfig.VERSION_NAME);
        }
        return str;
    }

    public static String b(double d) {
        return a(String.valueOf(a(d)));
    }
}
