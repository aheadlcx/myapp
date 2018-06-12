package bili2.bl;

import android.os.Bundle;
import android.os.MessageQueue.IdleHandler;
import com.bilibili.music.app.ui.menus.detail.MenuCommentsDetailFragment;

public final /* synthetic */ class ghe implements IdleHandler {
    private final MenuCommentsDetailFragment a;
    private final Bundle b;

    public ghe(MenuCommentsDetailFragment menuCommentsDetailFragment, Bundle bundle) {
        this.a = menuCommentsDetailFragment;
        this.b = bundle;
    }

    public boolean queueIdle() {
        return this.a.a(this.b);
    }
}
