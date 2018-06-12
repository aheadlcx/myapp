package bili2.bl;

import com.bilibili.music.app.domain.member.FollowResult;
import rx.functions.Action1;

final /* synthetic */ class gcz implements Action1 {
    private final gcp a;
    private final boolean b;

    gcz(gcp bl_gcp, boolean z) {
        this.a = bl_gcp;
        this.b = z;
    }

    public void call(Object obj) {
        this.a.a(this.b, (FollowResult) obj);
    }
}
