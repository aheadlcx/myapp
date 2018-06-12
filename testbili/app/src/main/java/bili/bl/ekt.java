package bili.bl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.bilibili.boxing.model.config.CropConfig;

/* compiled from: BL */
public class ekt {
    private static final ekt a = new ekt();
    private ekv b;

    private ekt() {
    }

    public static ekt a() {
        return a;
    }

    public void a(@NonNull ekv bl_ekv) {
        this.b = bl_ekv;
    }

    public void a(Activity activity, Fragment fragment, @NonNull CropConfig cropConfig, @NonNull String str, int i) {
        if (c()) {
            throw new IllegalStateException(hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 108, (byte) 113, (byte) 37, (byte) 104, (byte) 96, (byte) 113, (byte) 109, (byte) 106, (byte) 97, (byte) 37, (byte) 118, (byte) 109, (byte) 106, (byte) 112, (byte) 105, (byte) 97, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113}));
        } else if (cropConfig == null) {
            throw new NullPointerException(hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 106, (byte) 117, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 43}));
        } else {
            this.b.a(activity, fragment, cropConfig, str, i);
        }
    }

    public Uri a(int i, Intent intent) {
        if (!c()) {
            return this.b.a(i, intent);
        }
        throw new IllegalStateException(hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 108, (byte) 113, (byte) 37, (byte) 104, (byte) 96, (byte) 113, (byte) 109, (byte) 106, (byte) 97, (byte) 37, (byte) 118, (byte) 109, (byte) 106, (byte) 112, (byte) 105, (byte) 97, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113}));
    }

    public ekv b() {
        return this.b;
    }

    private boolean c() {
        return this.b == null;
    }
}
