package bili.bl;

import java.nio.charset.Charset;

/* compiled from: BL */
public class evu implements gno {
    public kly a(kly bl_kly) {
        bl_kly.e();
        bl_kly.c();
        bl_kly.d();
        return null;
    }

    public static klz a(klu bl_klu, String str) {
        Charset charset = kmf.e;
        if (bl_klu != null) {
            charset = bl_klu.b();
            if (charset == null) {
                charset = kmf.e;
                bl_klu = klu.a(bl_klu + hae.a(new byte[]{(byte) 62, (byte) 37, (byte) 102, (byte) 109, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 113, (byte) 56, (byte) 112, (byte) 113, (byte) 99, (byte) 40, (byte) 61}));
            }
        }
        return klz.a(bl_klu, str.getBytes(charset));
    }
}
