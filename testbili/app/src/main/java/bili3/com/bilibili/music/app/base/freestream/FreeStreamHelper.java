package bili3.com.bilibili.music.app.base.freestream;

import android.content.Context;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import bl.fji;
import bl.fsp;
import bl.fss;
import bl.fto;
import bl.hae;
import bl.ibn;
import com.bilibili.opd.app.bizcommon.mediaplayer.MediaSource;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public final class FreeStreamHelper {
    private static final String a = hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 86, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119});
    private static final String b = hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
    private static final String c = hae.a(new byte[]{(byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 110, (byte) 96, (byte) 124, (byte) 43, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 43, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113});
    private static final String d = hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102});

    /* compiled from: BL */
    public static class FreeDataFailException extends Exception {
        public final String failUrl;

        public FreeDataFailException(String str) {
            this.failUrl = str;
        }
    }

    public static boolean a() {
        Object b = fji.a().a(hae.a(new byte[]{(byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 110, (byte) 96, (byte) 124, (byte) 43, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 43, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113}), hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102})).b(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 40, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 40, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 42, (byte) 102, (byte) 106, (byte) 107, (byte) 97, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 42, (byte) 102, (byte) 109, (byte) 96, (byte) 102, (byte) 110}));
        return b != null && (b instanceof Boolean) && ((Boolean) b).booleanValue();
    }

    @WorkerThread
    public static String a(long j, String str) throws FreeDataFailException {
        if (!fsp.a().b() || !a()) {
            BLog.d(hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 86, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 108, (byte) 107, (byte) 37, (byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 37, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 41, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 63, (byte) 37}) + str);
            return null;
        } else if (fss.a() && j % 2 == 0) {
            throw new FreeDataFailException(str);
        } else {
            String str2 = (String) fji.a().a(hae.a(new byte[]{(byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), str).a(hae.a(new byte[]{(byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 110, (byte) 96, (byte) 124, (byte) 43, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 43, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113}), hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102})).c(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 40, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 40, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96, (byte) 42, (byte) 104, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 42, (byte) 112, (byte) 119, (byte) 105, (byte) 42, (byte) 113, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 99, (byte) 106, (byte) 119, (byte) 104})).a();
            BLog.d(hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 86, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 115, (byte) 96, (byte) 119, (byte) 113, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 63, (byte) 37}) + str + hae.a(new byte[]{(byte) 37, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 63, (byte) 37, (byte) 37}) + str2);
            try {
                if (!TextUtils.isEmpty(str2)) {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject.getInt(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113})) == 1) {
                        return jSONObject.getString(hae.a(new byte[]{(byte) 113, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 90, (byte) 112, (byte) 119, (byte) 105}));
                    }
                }
            } catch (Throwable e) {
                ibn.a(e);
            }
            throw new FreeDataFailException(str);
        }
    }

    public static void a(MediaSource mediaSource, Context context) {
        fto.b(context, 2131693384);
    }
}
