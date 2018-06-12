package bili2.bl;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bilibili.music.app.ui.detail.SongDetailFragment.c;

public final /* synthetic */ class fzs implements OnClickListener {
    private final c a;
    private final ViewGroup b;

    public fzs(c cVar, ViewGroup viewGroup) {
        this.a = cVar;
        this.b = viewGroup;
    }

    public void onClick(View view) {
        this.a.a(this.b, view);
    }
}
