package bili2.bl;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bilibili.opd.app.bizcommon.ui.CircleImageView;
import com.mall.domain.home.HomeUgc;

/* compiled from: BL */
public class iko extends iog {
    private Drawable n;
    private CircleImageView o;
    private TextView p;

    public iko(View view) {
        super(view);
        this.n = view.getBackground();
        this.o = (CircleImageView) view.findViewById(2131301128);
        this.p = (TextView) view.findViewById(2131301115);
    }

    public void a(HomeUgc homeUgc) {
        if (!(homeUgc == null || TextUtils.isEmpty(homeUgc.text))) {
            this.p.setText(homeUgc.text);
            this.p.requestLayout();
        }
        if (homeUgc != null && !TextUtils.isEmpty(homeUgc.avatar)) {
            idu.a(homeUgc.avatar, this.o);
        }
    }

    public void a(float f) {
        this.n.setAlpha((int) (255.0f * f));
        this.p.setAlpha(f);
        this.o.setAlpha(f);
    }
}
