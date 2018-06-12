package bili2.bl;

import android.content.Context;
import bl.fdp.a;
import com.bilibili.lib.media.resolver.exception.ResolveException;
import com.bilibili.lib.media.resolver.params.ResolveResourceExtra;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;

/* compiled from: BL */
public class kxo implements hkv {
    private Context a;

    public kxo(Context context) {
        this.a = context;
    }

    public fdp a(VideoDownloadEntry videoDownloadEntry, hki bl_hki) {
        a aVar = new a(new msa());
        aVar.a(new kxl()).a(a(bl_hki)).a(a());
        if (videoDownloadEntry instanceof VideoDownloadSeasonEpEntry) {
            aVar.a(new mrz()).a(new kxk(videoDownloadEntry));
        }
        aVar.a(new kxm(this.a, videoDownloadEntry));
        return aVar.a();
    }

    private kxn a(final hki bl_hki) {
        return new kxn(3, 1000, new PlayIndex.a(this) {
            final /* synthetic */ kxo b;

            public void a() throws InterruptedException {
                if (bl_hki != null) {
                    bl_hki.a();
                }
            }
        });
    }

    private fdz a() {
        return kxp.a;
    }

    static final /* synthetic */ MediaResource a(fdz.a aVar) throws ResolveException, InterruptedException {
        ResolveResourceExtra d = aVar.d();
        boolean z = kya.a() && kya.b() && kya.a(aVar.a());
        d.a(z);
        return aVar.a(aVar.b(), aVar.c(), d);
    }
}
