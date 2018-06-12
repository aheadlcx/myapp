package bili.bl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import com.bilibili.bilibililive.im.entity.ChatMessage;
import java.io.File;

/* compiled from: BL */
public class coz {
    public static final String a = hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 117, (byte) 109, (byte) 106, (byte) 113, (byte) 106, (byte) 43, (byte) 111, (byte) 117, (byte) 98});

    public static void a(Activity activity) {
        Intent intent = new Intent(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 85, (byte) 76, (byte) 70, (byte) 78}));
        intent.setType(hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 42, (byte) 47}));
        activity.startActivityForResult(intent, 202);
    }

    public static void b(Activity activity) {
        Intent intent = new Intent(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 104, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 76, (byte) 72, (byte) 68, (byte) 66, (byte) 64, (byte) 90, (byte) 70, (byte) 68, (byte) 85, (byte) 81, (byte) 80, (byte) 87, (byte) 64}));
        if (b()) {
            try {
                intent.putExtra(hae.a(new byte[]{(byte) 106, (byte) 112, (byte) 113, (byte) 117, (byte) 112, (byte) 113}), Uri.fromFile(new File(Environment.getExternalStorageDirectory(), hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 117, (byte) 109, (byte) 106, (byte) 113, (byte) 106, (byte) 43, (byte) 111, (byte) 117, (byte) 98}))));
            } catch (Throwable e) {
                ibn.a(e);
            }
        }
        activity.startActivityForResult(intent, ChatMessage.TYPE_MEMBER_JOINED);
    }

    public static File a() {
        if (b()) {
            return new File(Environment.getExternalStorageDirectory(), hae.a(new byte[]{(byte) 113, (byte) 96, (byte) 104, (byte) 117, (byte) 90, (byte) 117, (byte) 109, (byte) 106, (byte) 113, (byte) 106, (byte) 43, (byte) 111, (byte) 117, (byte) 98}));
        }
        return null;
    }

    public static boolean b() {
        if (Environment.getExternalStorageState().equals(hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 96, (byte) 97}))) {
            return true;
        }
        return false;
    }
}
