package bili2.bl;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: BL */
public final class gq {
    private static final Locale a = new Locale(gmy.d, gmy.d);

    public static int a(@Nullable Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (!(locale == null || locale.equals(a))) {
            String a = gn.a(locale);
            if (a == null) {
                return b(locale);
            }
            if (a.equalsIgnoreCase("Arab") || a.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }

    private static int b(@NonNull Locale locale) {
        switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
            case (byte) 1:
            case (byte) 2:
                return 1;
            default:
                return 0;
        }
    }
}
