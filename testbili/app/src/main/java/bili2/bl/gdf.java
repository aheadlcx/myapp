package bili2.bl;

import com.bilibili.music.app.domain.member.FollowResult;
import rx.functions.Action1;

final /* synthetic */ class gdf implements Action1 {
    private final gcp a;
    private final boolean b;

    gdf(gcp bl_gcp, boolean z) {
        this.a = bl_gcp;
        this.b = z;
    }

    public void call(Object obj) {
        this.a.b(this.b, (FollowResult) obj);
    }
}
