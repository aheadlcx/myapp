package bili2.bl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import bl.haa.a;
import com.bilibili.socialize.share.core.error.ShareException;
import java.io.File;

/* compiled from: BL */
public abstract class gzx implements haa {
    private static final String a = hae.a(new byte[]{(byte) 71, (byte) 86, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 43, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 43, (byte) 97, (byte) 105});

    protected abstract void a(String str, String str2, a aVar);

    public final void a(Context context, String str, String str2, a aVar) throws ShareException {
        if (TextUtils.isEmpty(str)) {
            Log.d(hae.a(new byte[]{(byte) 71, (byte) 86, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 43, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 43, (byte) 97, (byte) 105}), hae.a(new byte[]{(byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 37, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 112, (byte) 119, (byte) 105}));
            if (aVar != null) {
                aVar.b(str);
                return;
            }
            return;
        }
        String a = a(context, str, str2);
        if (TextUtils.isEmpty(a)) {
            Log.e(hae.a(new byte[]{(byte) 71, (byte) 86, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 43, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 43, (byte) 97, (byte) 105}), hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}));
            if (aVar != null) {
                aVar.b(str);
                return;
            }
            return;
        }
        File file = new File(a);
        if (file.exists()) {
            Log.d(hae.a(new byte[]{(byte) 71, (byte) 86, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 43, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 43, (byte) 97, (byte) 105}), hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124, (byte) 37, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}));
            if (aVar != null) {
                aVar.a(file.getAbsolutePath());
                return;
            }
            return;
        }
        a(str, a, aVar);
    }

    protected String a(Context context, String str, String str2) throws ShareException {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        File file = new File(str2);
        File file2 = new File(file, String.valueOf(str.hashCode()));
        if (file2.exists()) {
            return file2.getAbsolutePath();
        }
        if (file.exists() || file.mkdirs()) {
            return file2.getAbsolutePath();
        }
        return null;
    }
}
