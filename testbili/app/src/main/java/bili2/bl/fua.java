package bili2.bl;

import com.bilibili.music.app.domain.mine.UserInfo;
import rx.functions.Action1;

final /* synthetic */ class fua implements Action1 {
    private final ftz a;

    fua(ftz bl_ftz) {
        this.a = bl_ftz;
    }

    public void call(Object obj) {
        this.a.a((UserInfo) obj);
    }
}
