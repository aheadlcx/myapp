package bili.bl;

import bl.jcc.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: BL */
public class cqe {
    public static jcc a(String str, boolean z, int i) {
        int i2;
        int i3 = 1280;
        a b = new a(str, 25, 1).c(i).a(a()).b(hae.a(new byte[]{(byte) 68, (byte) 37, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 37, (byte) 102, (byte) 105, (byte) 108, (byte) 117, (byte) 36})).a(1536000).b(48000).a(false).b(false);
        if (z) {
            i2 = 720;
        } else {
            i2 = 1280;
        }
        if (!z) {
            i3 = 720;
        }
        return b.a(i2, i3).a();
    }

    private static String a() {
        return new SimpleDateFormat(hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 72, (byte) 72, (byte) 97, (byte) 97, (byte) 109, (byte) 109, (byte) 104, (byte) 104, (byte) 118, (byte) 118}), Locale.US).format(new Date());
    }
}
