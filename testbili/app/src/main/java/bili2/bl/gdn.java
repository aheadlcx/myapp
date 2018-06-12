package bili2.bl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bilibili.music.app.ui.download.DownloadPageFragment;

public final /* synthetic */ class gdn implements OnClickListener {
    private final DownloadPageFragment a;

    public gdn(DownloadPageFragment downloadPageFragment) {
        this.a = downloadPageFragment;
    }

    public void onClick(View view) {
        this.a.e(view);
    }
}
