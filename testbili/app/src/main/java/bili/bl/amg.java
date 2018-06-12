package bili.bl;

import android.content.Context;
import bl.klt.a;
import java.io.IOException;

/* compiled from: BL */
class amg implements klt {
    private static String b;
    private Context a;

    public amg(Context context) {
        this.a = context;
    }

    public kma a(a aVar) throws IOException {
        kly a = aVar.a();
        if (b == null) {
            b = amo.g(this.a);
        }
        String str = b;
        if (str != null) {
            a = a.e().a(hae.a(new byte[]{(byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 40, (byte) 68, (byte) 98, (byte) 96, (byte) 107, (byte) 113}), str).c();
        }
        return aVar.a(a);
    }
}
