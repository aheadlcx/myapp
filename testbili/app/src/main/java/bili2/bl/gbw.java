package bili2.bl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bilibili.music.app.ui.detail.info.SongInfoFragment;

public final /* synthetic */ class gbw implements OnClickListener {
    private final SongInfoFragment a;

    public gbw(SongInfoFragment songInfoFragment) {
        this.a = songInfoFragment;
    }

    public void onClick(View view) {
        this.a.g(view);
    }
}
