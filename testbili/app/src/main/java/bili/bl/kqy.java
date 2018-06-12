package bili.bl;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: BL */
class kqy implements krb {
    private static final String a = hae.a(new byte[]{(byte) 64, (byte) 72, (byte) 85, (byte) 81, (byte) 92, (byte) 42, (byte) 75, (byte) 80, (byte) 73, (byte) 73});
    private final int b;

    kqy(kre bl_kre) {
        this.b = bl_kre.a();
    }

    public void a(int i, String str, String str2) {
        if (this.b <= i) {
            if (TextUtils.isEmpty(str2)) {
                c(i, str, hae.a(new byte[]{(byte) 64, (byte) 72, (byte) 85, (byte) 81, (byte) 92, (byte) 42, (byte) 75, (byte) 80, (byte) 73, (byte) 73}));
            } else {
                b(i, str, str2);
            }
        }
    }

    public void a(String str, String str2) {
        if (str == null) {
            Log.i(hae.a(new byte[]{(byte) 71, (byte) 73, (byte) 74, (byte) 66, (byte) 40, (byte) 64, (byte) 83, (byte) 64, (byte) 75, (byte) 81}), str2);
        } else {
            Log.d(hae.a(new byte[]{(byte) 71, (byte) 73, (byte) 74, (byte) 66, (byte) 40, (byte) 64, (byte) 83, (byte) 64, (byte) 75, (byte) 81, (byte) 40}) + str, str2);
        }
    }

    public void a() {
    }

    public void b() {
    }

    private void b(int i, String str, String str2) {
        byte[] bytes = str2.getBytes();
        int length = bytes.length;
        if (length <= 4000) {
            c(i, str, str2);
            return;
        }
        for (int i2 = 0; i2 < length; i2 += 4000) {
            c(i, str, new String(bytes, i2, Math.min(length - i2, 4000)));
        }
    }

    private void c(int i, String str, String str2) {
        for (String str3 : str2.split(System.getProperty(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 107, (byte) 96, (byte) 43, (byte) 118, (byte) 96, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 113, (byte) 106, (byte) 119})))) {
            d(i, str, "[" + Thread.currentThread().getName() + "]  " + str3);
        }
    }

    private void d(int i, String str, String str2) {
        Log.println(i, str, str2);
    }
}
