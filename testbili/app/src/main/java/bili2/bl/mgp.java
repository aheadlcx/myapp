package bili2.bl;

import android.os.Bundle;
import android.text.TextUtils;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;

/* compiled from: BL */
public class mgp {
    public static mgo a(int i, Bundle bundle, MediaResource mediaResource) {
        if (mediaResource != null) {
            PlayIndex d = mediaResource.d();
            if (!(d == null || TextUtils.isEmpty(d.K))) {
                return new mgn(mediaResource);
            }
        }
        return null;
    }
}
