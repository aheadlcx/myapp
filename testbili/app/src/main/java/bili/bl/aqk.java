package bili.bl;

import android.net.Uri;

/* compiled from: BL */
public final class aqk {
    public static final String a = hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 48});

    /* compiled from: BL */
    public static final class a {
        public String a;
        public String b;

        public static a a(String str) {
            a aVar = new a();
            aVar.a = str;
            aVar.b = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
            return aVar;
        }

        public String[] a() {
            return new String[]{Uri.encode(this.a), Uri.encode(this.b)};
        }
    }

    public static void a(a aVar) {
        fcz.a().b(false, hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 48}), aVar.a());
    }
}
