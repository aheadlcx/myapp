package bili2.bl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.sobot.chat.api.model.ZhiChiUploadAppFileModelResult;
import com.sobot.chat.widget.photoview.PhotoView;
import java.util.ArrayList;

/* compiled from: BL */
public class ipd extends ipc<ZhiChiUploadAppFileModelResult> {
    public ipd(Context context, ArrayList<ZhiChiUploadAppFileModelResult> arrayList) {
        super(context, arrayList);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ImageView photoView = new PhotoView(this.b);
        irf.a(this.b, ((ZhiChiUploadAppFileModelResult) this.a.get(i)).b(), photoView);
        viewGroup.addView(photoView);
        return photoView;
    }
}
