package bili3.bl;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bilibili.bilibililive.im.entity.Notification;
import com.bilibili.music.app.base.download.DLSong;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class mvf {
    public static final gx<Integer> a = new gx();
    public static long b = 0;
    public static float c;
    public static float d = 3.0f;
    public static float e = 3.0f;
    public static float f = 1.0f;
    public static float g = 1.0f;
    public static int h = Notification.TYPE_GROUP_ADMIN_FIRED;
    public static int i = 0;
    public static int j = 0;
    private static final String k = hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98});

    public static void a(Context context) {
        BLog.ifmt(hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98}), hae.a(new byte[]{(byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56}), new Object[0]);
        b = (long) muo.a(context, 2131361811, 6000);
        BLog.ifmt(hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98}), hae.a(new byte[]{(byte) 56, (byte) 37, (byte) 99, (byte) 105, (byte) 124, (byte) 37, (byte) 97, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 37, (byte) 32, (byte) 97}), new Object[]{Long.valueOf(b)});
        int a = muo.a(context, 2131361812, 10);
        BLog.ifmt(hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98}), hae.a(new byte[]{(byte) 56, (byte) 37, (byte) 32, (byte) 97, (byte) 37, (byte) 105, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 37, (byte) 102, (byte) 109, (byte) 100, (byte) 119, (byte) 100, (byte) 102, (byte) 113, (byte) 96, (byte) 119, (byte) 45, (byte) 107, (byte) 112, (byte) 104, (byte) 103, (byte) 96, (byte) 119, (byte) 37, (byte) 54, (byte) 51, (byte) 44, (byte) 37, (byte) 117, (byte) 96, (byte) 119, (byte) 37, (byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107}), new Object[]{Integer.valueOf(a)});
        c = (1.0f / ((float) a)) / 38.0f;
        Resources resources = context.getResources();
        if (resources != null) {
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.widthPixels;
                j = displayMetrics.heightPixels;
                d = displayMetrics.density * 1.5f;
                if (displayMetrics.densityDpi >= DLSong.DOWNLOAD_STATE_DOWNLOADED) {
                    g = 2.0f;
                    f = 2.0f;
                } else {
                    g = 1.0f;
                    f = 1.0f;
                }
            }
        }
        h = Notification.TYPE_GROUP_ADMIN_FIRED;
        BLog.ifmt(hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98}), hae.a(new byte[]{(byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56, (byte) 56}), new Object[0]);
    }
}
