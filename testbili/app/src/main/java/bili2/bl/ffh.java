package bili2.bl;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: BL */
public class ffh {
    public static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes(Charset.forName("UTF-8")));
            return a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            return hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53});
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }
}
