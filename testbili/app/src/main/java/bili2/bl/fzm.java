package bili2.bl;

import android.os.MessageQueue.IdleHandler;
import com.bilibili.music.app.ui.detail.SongDetailFragment;

public final /* synthetic */ class fzm implements IdleHandler {
    private final SongDetailFragment a;

    public fzm(SongDetailFragment songDetailFragment) {
        this.a = songDetailFragment;
    }

    public boolean queueIdle() {
        return this.a.m();
    }
}
