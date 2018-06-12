package bili.bl;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.bangumi.api.BangumiRecommend;

/* compiled from: BL */
public class bdx extends meq {
    TextView n;
    TextView o;
    ImageView p;
    public View q;

    public bdx(View view, mel bl_mel) {
        super(view, bl_mel);
        this.n = (TextView) bbx.a(view, 2131300682);
        this.o = (TextView) bbx.a(view, 2131297097);
        this.p = (ImageView) bbx.a(view, 2131297178);
        this.q = bbx.a(view, 2131296549);
    }

    public bdx(ViewGroup viewGroup, mel bl_mel) {
        this(LayoutInflater.from(viewGroup.getContext()).inflate(2131427475, viewGroup, false), bl_mel);
    }

    public void a(BangumiRecommend bangumiRecommend) {
        int i = 8;
        if (bangumiRecommend != null) {
            int i2;
            bbx.d(this.a.getContext(), this.p, bangumiRecommend.cover);
            this.q.setVisibility(bangumiRecommend.isNew ? 0 : 4);
            this.n.setText(bangumiRecommend.title);
            TextView textView = this.n;
            if (TextUtils.isEmpty(bangumiRecommend.title)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView.setVisibility(i2);
            this.o.setText(bangumiRecommend.desc);
            TextView textView2 = this.o;
            if (!TextUtils.isEmpty(bangumiRecommend.desc)) {
                i = 0;
            }
            textView2.setVisibility(i);
            this.a.setTag(bangumiRecommend);
        }
    }
}
