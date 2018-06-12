package bili3.bl;

import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* compiled from: BL */
public class mpt {
    public static boolean a() {
        return VERSION.SDK_INT >= 24 && b();
    }

    public static boolean b() {
        Object obj = Build.MANUFACTURER;
        CharSequence charSequence = Build.MODEL;
        if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(charSequence)) {
            return false;
        }
        hae.a(new byte[]{(byte) 118, (byte) 100, (byte) 104, (byte) 118, (byte) 112, (byte) 107, (byte) 98});
        return obj.equalsIgnoreCase(hae.a(new byte[]{(byte) 118, (byte) 100, (byte) 104, (byte) 118, (byte) 112, (byte) 107, (byte) 98}));
    }

    public static String a(File file) {
        Throwable e;
        if (!file.canRead()) {
            return Constants.STR_EMPTY;
        }
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    readLine = Constants.STR_EMPTY;
                    if (bufferedReader == null) {
                        return readLine;
                    }
                    try {
                        bufferedReader.close();
                        return readLine;
                    } catch (IOException e2) {
                        return readLine;
                    }
                }
                readLine = readLine.trim();
                if (bufferedReader == null) {
                    return readLine;
                }
                try {
                    bufferedReader.close();
                    return readLine;
                } catch (IOException e3) {
                    return readLine;
                }
            } catch (IOException e4) {
                e = e4;
                try {
                    ibn.a(e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e5) {
                        }
                    }
                    return Constants.STR_EMPTY;
                } catch (Throwable th) {
                    e = th;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw e;
                }
            }
        } catch (IOException e7) {
            e = e7;
            bufferedReader = null;
            ibn.a(e);
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            return Constants.STR_EMPTY;
        } catch (Throwable th2) {
            e = th2;
            bufferedReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw e;
        }
    }
}
