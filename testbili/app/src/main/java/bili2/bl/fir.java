package bili2.bl;

import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: BL */
class fir {
    static void a(String str, int i, int i2) {
        if (!TextUtils.isEmpty(str)) {
            Map hashMap = new HashMap(8);
            hashMap.put(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 108, (byte) 97}), fie.b());
            hashMap.put(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 115, (byte) 108, (byte) 97}), fie.a());
            CharSequence j = eva.a(blg.a()).j();
            if (!TextUtils.isEmpty(j)) {
                hashMap.put(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 90, (byte) 110, (byte) 96, (byte) 124}), j);
            }
            hashMap.put(hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 90, (byte) 113, (byte) 106, (byte) 110, (byte) 96, (byte) 107}), str);
            hashMap.put(hae.a(new byte[]{(byte) 117, (byte) 112, (byte) 118, (byte) 109, (byte) 90, (byte) 118, (byte) 97, (byte) 110}), String.valueOf(i2));
            hashMap.put(hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 90, Byte.MAX_VALUE, (byte) 106, (byte) 107, (byte) 96}), String.valueOf((TimeZone.getDefault().getRawOffset() / 3600) / 1000));
            hashMap.put(hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 113, (byte) 108, (byte) 99, (byte) 124, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109}), dz.a(blg.a()).b() ? "1" : "0");
            hashMap.put("type", String.valueOf(i));
            hashMap.put(hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 103, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 119, (byte) 100, (byte) 107, (byte) 97}), Uri.encode(Build.BRAND));
            hashMap.put(hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 103, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 105}), Uri.encode(Build.MODEL));
            hashMap.put(hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 103, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107}), Uri.encode(VERSION.RELEASE));
            Log.e(hae.a(new byte[]{(byte) 85, (byte) 112, (byte) 118, (byte) 109, (byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 68, (byte) 117, (byte) 108, (byte) 72, (byte) 100, (byte) 107, (byte) 100, (byte) 98, (byte) 96, (byte) 119}), Build.BRAND + ", " + Build.MODEL + ", " + VERSION.RELEASE);
            ((fiq) gnd.a(fiq.class)).report(hashMap).b();
        }
    }
}
