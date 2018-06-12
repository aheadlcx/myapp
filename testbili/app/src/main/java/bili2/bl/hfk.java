package bili2.bl;

import android.content.Context;
import android.content.SharedPreferences.Editor;

/* compiled from: BL */
public class hfk {
    public static long a(Context context, String str) {
        return context.getSharedPreferences(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 112, (byte) 104, (byte) 103}), 0).getLong(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 90}) + str, 0);
    }

    public static void a(Context context, String str, long j) {
        Editor edit = context.getSharedPreferences(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 112, (byte) 104, (byte) 103}), 0).edit();
        edit.putLong(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 90}) + str, j);
        edit.commit();
    }

    public static int b(Context context, String str) {
        return context.getSharedPreferences(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 112, (byte) 104, (byte) 103}), 0).getInt(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 93, (byte) 90}) + str, 0);
    }

    public static void a(Context context, String str, int i) {
        Editor edit = context.getSharedPreferences(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 112, (byte) 104, (byte) 103}), 0).edit();
        edit.putInt(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 93, (byte) 90}) + str, i);
        edit.commit();
    }

    public static boolean c(Context context, String str) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 112, (byte) 104, (byte) 103}), 0).getBoolean(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 90}) + str, false);
    }
}
