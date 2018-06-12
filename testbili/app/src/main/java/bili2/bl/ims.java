package bili2.bl;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import bl.imq.a;
import com.bilibili.lib.image.ScalableImageView;
import com.mall.domain.shop.discovery.bean.VideoItemBean;

/* compiled from: BL */
public class ims extends iog {
    private a n;
    private View o;
    private View p;
    private ScalableImageView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;

    public ims(View view, a aVar) {
        super(view);
        this.n = aVar;
        this.o = view.findViewById(2131301183);
        this.q = (ScalableImageView) view.findViewById(2131301179);
        this.r = (TextView) view.findViewById(2131301210);
        this.s = (TextView) view.findViewById(2131301174);
        this.t = (TextView) view.findViewById(2131301214);
        this.u = (TextView) view.findViewById(2131301163);
        this.p = view.findViewById(2131301185);
    }

    public void a(final VideoItemBean videoItemBean) {
        int i = 8;
        if (videoItemBean != null) {
            CharSequence charSequence;
            idu.a(videoItemBean.pic, this.q);
            this.r.setText(iop.c(videoItemBean.title));
            this.s.setText(iop.g(videoItemBean.duration));
            this.t.setVisibility(videoItemBean.stats == null ? 8 : 0);
            TextView textView = this.t;
            if (videoItemBean.stats == null) {
                charSequence = gmy.d;
            } else {
                charSequence = iop.f(videoItemBean.stats.viewCount);
            }
            textView.setText(charSequence);
            TextView textView2 = this.u;
            if (videoItemBean.stats != null) {
                i = 0;
            }
            textView2.setVisibility(i);
            TextView textView3 = this.u;
            if (videoItemBean.stats == null) {
                charSequence = gmy.d;
            } else {
                charSequence = iop.f(videoItemBean.stats.damakuCount);
            }
            textView3.setText(charSequence);
            this.a.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ ims b;

                public void onClick(View view) {
                    this.b.n.a(videoItemBean.jumpUrl);
                    ien.j(2131693173, null);
                }
            });
            if (flg.b(ieb.a().h())) {
                this.o.setBackgroundDrawable(ieb.a().h().getResources().getDrawable(2131234444));
                this.p.setVisibility(0);
                this.r.setTextColor(ioo.c(2131100236));
            }
        }
    }
}
