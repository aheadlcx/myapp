package bili2.bl;

import bl.meh.a;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail;
import tv.danmaku.bili.ui.video.section.RelatedVideoSection.c;

public final /* synthetic */ class lxl implements a {
    private final c a;
    private final BiliVideoDetail b;

    public lxl(c cVar, BiliVideoDetail biliVideoDetail) {
        this.a = cVar;
        this.b = biliVideoDetail;
    }

    public void onEvent(String str, Object[] objArr) {
        this.a.a(this.b, str, objArr);
    }
}
