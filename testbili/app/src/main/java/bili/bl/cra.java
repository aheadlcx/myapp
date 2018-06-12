package bili.bl;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* compiled from: BL */
public class cra {
    private static final String a = hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 113, (byte) 96, (byte) 104, (byte) 117});

    public static File a(Context context) {
        return new File(context.getExternalCacheDir(), hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 113, (byte) 96, (byte) 104, (byte) 117}));
    }

    public static boolean a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return true;
            }
            if (!file.delete()) {
                return false;
            }
        }
        return file.mkdirs();
    }

    public static File b(File file) {
        return new File(file, UUID.randomUUID().toString() + ".mp4");
    }
}
