package bili2.bl;

import com.bilibili.music.app.domain.privilege.ValidationResult;
import rx.functions.Action1;

final /* synthetic */ class gac implements Action1 {
    private final fzt a;

    gac(fzt bl_fzt) {
        this.a = bl_fzt;
    }

    public void call(Object obj) {
        this.a.a((ValidationResult) obj);
    }
}
