package bili2.bl;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: BL */
public class lgb implements fit<Void> {
    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public Void a(fjg bl_fjg) {
        Object string = bl_fjg.b.getString("url");
        if (!TextUtils.isEmpty(string)) {
            kyq.b(bl_fjg.c, Uri.parse(string));
        }
        return null;
    }
}
