package bili2.bl;

import android.content.Context;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.upper.contribute.up.api.ArchiveApiService;
import com.bilibili.upper.contribute.up.entity.preview.PreviewData;

/* compiled from: BL */
public class hcn implements fit<String> {
    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public String a(fjg bl_fjg) {
        return a(bl_fjg.c);
    }

    public String a(Context context) {
        try {
            kqs g = ((ArchiveApiService) gnd.a(ArchiveApiService.class)).getPreviewData(eva.a(context).j()).g();
            if (g.e()) {
                GeneralResponse generalResponse = (GeneralResponse) g.f();
                if (generalResponse != null) {
                    PreviewData previewData = (PreviewData) generalResponse.data;
                    if (previewData != null) {
                        return zy.a(previewData);
                    }
                }
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
