package bili.bl;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: BL */
public class bau {
    public static final char[] a = hae.a(new byte[]{(byte) -23, (byte) -104, (byte) -86, (byte) -21, (byte) -73, (byte) -113, (byte) -21, (byte) -75, (byte) -125, (byte) -21, (byte) -73, (byte) -122, (byte) -22, (byte) -108, (byte) -108, (byte) -21, (byte) -75, (byte) -101, (byte) -22, (byte) -118, (byte) -94}).toCharArray();
    public static SimpleDateFormat b = new SimpleDateFormat(hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 40, (byte) 72, (byte) 72, (byte) 40, (byte) 97, (byte) 97}), Locale.getDefault());
    public static SimpleDateFormat c = new SimpleDateFormat(hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) -22, (byte) -74, (byte) -69, (byte) 72, (byte) 72, (byte) -23, (byte) -109, (byte) -121}), Locale.getDefault());
    private static final String d = hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 40, (byte) 72, (byte) 72, (byte) 40, (byte) 97, (byte) 97, (byte) 37, (byte) 110, (byte) 110, (byte) 63, (byte) 104, (byte) 104});
    private static final String e = hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 40, (byte) 72, (byte) 72, (byte) 40, (byte) 97, (byte) 97});

    public static String a(Context context, long j) {
        return a(context, j, System.currentTimeMillis());
    }

    public static String a(Context context, long j, long j2) {
        long j3 = j2 - j;
        long toDays = TimeUnit.MILLISECONDS.toDays(j3);
        long j4 = (toDays / 30) + 1;
        long toHours = TimeUnit.MILLISECONDS.toHours(j3);
        j3 = TimeUnit.MILLISECONDS.toMinutes(j3);
        if (j4 > 12) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            int i = instance.get(1);
            instance.setTimeInMillis(j);
            return context.getString(2131696183, new Object[]{Integer.valueOf(i - instance.get(1))});
        } else if (j4 > 0 && toDays > 30) {
            return context.getString(2131693285, new Object[]{Long.valueOf(j4)});
        } else if (toDays > 0 && toHours > 24) {
            return context.getString(2131691092, new Object[]{Long.valueOf(toDays)});
        } else if (toHours >= 1) {
            return context.getString(2131691904, new Object[]{Long.valueOf(toHours)});
        } else if (toHours >= 1 || j3 <= 1 || j3 > 60) {
            return context.getString(2131692138);
        } else {
            return context.getString(2131693277, new Object[]{Long.valueOf(j3)});
        }
    }
}
