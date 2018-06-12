package bili.bl;

import android.view.View;
import android.view.View.OnClickListener;
import com.bilibili.bilibililive.bililivefollowing.detail.FollowingDetailActivity.a;

public final /* synthetic */ class bog implements OnClickListener {
    private final a a;
    private final int b;
    private final long c;

    public bog(a aVar, int i, long j) {
        this.a = aVar;
        this.b = i;
        this.c = j;
    }

    public void onClick(View view) {
        this.a.a(this.b, this.c, view);
    }
}
