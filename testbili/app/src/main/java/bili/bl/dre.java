package bili.bl;

import android.text.TextUtils;

/* compiled from: BL */
public class dre implements fit {
    public static final String a = hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 107, (byte) 100, (byte) 113, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 105, (byte) 108, (byte) 107, (byte) 110});

    public Object b(fjg bl_fjg) {
        if (!(bl_fjg == null || bl_fjg.c == null || bl_fjg.b == null)) {
            String string = bl_fjg.b.getString(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 107, (byte) 100, (byte) 113, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 105, (byte) 108, (byte) 107, (byte) 110}));
            if (TextUtils.isEmpty(string) || !a(string)) {
                drb.b(bl_fjg.c, string);
            } else if (b(string) && !eva.a(bl_fjg.c).a()) {
                drb.d(bl_fjg.c, 0);
            } else if (TextUtils.equals(string, hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 104, (byte) 124, (byte) 113, (byte) 100, (byte) 98, (byte) 42}))) {
                fji.a().a(bl_fjg.c).a(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 100, (byte) 103, (byte) 96, (byte) 105, (byte) 90, (byte) 117, (byte) 100, (byte) 98, (byte) 96}), true).a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 100, (byte) 119, (byte) 96, (byte) 100, (byte) 40, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 40, (byte) 105, (byte) 108, (byte) 118, (byte) 113}));
            } else if (TextUtils.equals(string, hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 104, (byte) 124, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 42}))) {
                bl_fjg.c.startActivity(dvc.b(bl_fjg.c));
            } else {
                fji.a().a(bl_fjg.c).a(string);
            }
        }
        return null;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 104, (byte) 124, (byte) 113, (byte) 100, (byte) 98, (byte) 42})) || str.startsWith(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 100, (byte) 105, (byte) 105, (byte) 40, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 42})) || str.startsWith(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 104, (byte) 124, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 42})) || str.startsWith(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 100, (byte) 119, (byte) 96, (byte) 100, (byte) 58}))) {
            return true;
        }
        return false;
    }

    private boolean b(String str) {
        if (str.startsWith(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 104, (byte) 124, (byte) 113, (byte) 100, (byte) 98, (byte) 42})) || str.startsWith(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 104, (byte) 124, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 42}))) {
            return true;
        }
        return false;
    }
}
