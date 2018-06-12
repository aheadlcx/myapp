package bili3.bl;

import java.util.regex.Pattern;

/* compiled from: BL */
public class mpw {
    public static boolean a(String str) {
        return Pattern.compile(hae.a(new byte[]{(byte) 40, (byte) 58, (byte) 89, (byte) 97, (byte) 46, (byte) 45, (byte) 89, (byte) 43, (byte) 89, (byte) 97, (byte) 46, (byte) 44, (byte) 58})).matcher(str).matches();
    }
}
