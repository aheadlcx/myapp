package bili2.bl;

import com.bilibili.music.app.ui.menus.detail.MenuDetailFragment;
import rx.functions.Action1;

public final /* synthetic */ class gho implements Action1 {
    private final MenuDetailFragment a;

    public gho(MenuDetailFragment menuDetailFragment) {
        this.a = menuDetailFragment;
    }

    public void call(Object obj) {
        this.a.a((Boolean) obj);
    }
}
