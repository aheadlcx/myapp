package bili2.bl;

import com.bilibili.music.app.domain.favorite.FavoriteFolder;
import rx.functions.Action1;

final /* synthetic */ class fvy implements Action1 {
    private final fvv a;

    fvy(fvv bl_fvv) {
        this.a = bl_fvv;
    }

    public void call(Object obj) {
        this.a.a((FavoriteFolder) obj);
    }
}
