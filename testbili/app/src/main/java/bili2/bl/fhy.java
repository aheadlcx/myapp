package bili2.bl;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: BL */
public class fhy implements fit<Void> {
    private static final String a = hae.a(new byte[]{(byte) 114, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 113, (byte) 90});
    private static final String b = hae.a(new byte[]{(byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118});
    private static final String c = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 113, (byte) 119, (byte) 124, (byte) 81, (byte) 108, (byte) 104, (byte) 96, (byte) 118});
    private static final String d = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113});

    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public Void a(fjg bl_fjg) {
        Context context = bl_fjg.c;
        if (context != null) {
            int i = bl_fjg.b.getInt(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 43, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), -1);
            CharSequence string = bl_fjg.b.getString(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 43, (byte) 119, (byte) 96, (byte) 113, (byte) 119, (byte) 124, (byte) 43, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118}), gmy.d);
            CharSequence string2 = bl_fjg.b.getString(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 43, (byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), gmy.d);
            String a = a(i);
            if (!(TextUtils.isEmpty(a) || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2))) {
                fnw.a(context, a, hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 113, (byte) 119, (byte) 124, (byte) 81, (byte) 108, (byte) 104, (byte) 96, (byte) 118}), string, hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), string2);
            }
        }
        return null;
    }

    private String a(int i) {
        switch (i) {
            case 257:
                return hae.a(new byte[]{(byte) 114, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 113, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 109, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 90, (byte) 103, (byte) 112, (byte) 118, (byte) 108, (byte) 107, (byte) 96, (byte) 118, (byte) 118, (byte) 74, (byte) 119, (byte) 97, (byte) 96, (byte) 119, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118});
            case 258:
                return hae.a(new byte[]{(byte) 114, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 113, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 109, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 124, (byte) 74, (byte) 119, (byte) 97, (byte) 96, (byte) 119, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118});
            case 259:
                return hae.a(new byte[]{(byte) 114, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 113, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 109, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 90, (byte) 113, (byte) 119, (byte) 124, (byte) 81, (byte) 106, (byte) 85, (byte) 100, (byte) 124, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118});
            case 260:
                return hae.a(new byte[]{(byte) 114, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 113, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 109, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 90, (byte) 102, (byte) 109, (byte) 96, (byte) 102, (byte) 110, (byte) 74, (byte) 119, (byte) 97, (byte) 96, (byte) 119, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118});
            default:
                return null;
        }
    }
}
