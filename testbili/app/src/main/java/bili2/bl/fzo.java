package bili2.bl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bilibili.music.app.ui.detail.SongDetailFragment;

public final /* synthetic */ class fzo implements OnClickListener {
    private final SongDetailFragment a;

    public fzo(SongDetailFragment songDetailFragment) {
        this.a = songDetailFragment;
    }

    public void onClick(View view) {
        this.a.c(view);
    }
}
