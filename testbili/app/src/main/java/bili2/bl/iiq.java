package bili2.bl;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl.iia.a;
import com.mall.domain.create.presale.PreSaleShowContent;
import java.util.List;

/* compiled from: BL */
public class iiq extends iij {
    private LinearLayout a;
    private Context b;
    private View c;
    private List<PreSaleShowContent> d;
    private a e;

    public iiq(View view) {
        this.b = view.getContext();
        a(view);
        a("TYPE_PRESALE_STAGE");
        a();
    }

    public iiq(a aVar, View view) {
        this.b = view.getContext();
        this.e = aVar;
        a(view);
        a("TYPE_PRESALE_STAGE");
        a();
        this.e.a((ihz) this);
    }

    private void a(View view) {
        this.a = (LinearLayout) view.findViewById(2131297201);
        this.c = view.findViewById(2131297202);
    }

    public void a(int i) {
        if (this.d != null && this.d.size() >= 1) {
            if (this.c != null) {
                this.c.setVisibility(i);
            }
            if (this.a != null) {
                this.a.setVisibility(i);
            }
        }
    }

    public void a(List<PreSaleShowContent> list) {
        if (list == null || list.size() < 1) {
            a(8);
            if (this.c != null) {
                this.c.setVisibility(8);
                return;
            }
            return;
        }
        this.d = list;
        a(0);
        this.a.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            int i2;
            boolean z;
            View inflate = LayoutInflater.from(this.b).inflate(2131429282, null, false);
            TextView textView = (TextView) inflate.findViewById(2131300291);
            ImageView imageView = (ImageView) inflate.findViewById(2131299416);
            TextView textView2 = (TextView) inflate.findViewById(2131300294);
            View findViewById = inflate.findViewById(2131296659);
            if (i == list.size() - 1) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            if (!TextUtils.isEmpty(((PreSaleShowContent) list.get(i)).subTitle)) {
                boolean z2;
                textView2.setText(((PreSaleShowContent) list.get(i)).subTitle);
                if (((PreSaleShowContent) list.get(i)).isHighlight == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                textView2.setEnabled(z2);
            }
            textView.setText(((PreSaleShowContent) list.get(i)).title);
            if (((PreSaleShowContent) list.get(i)).isHighlight == 1) {
                z = true;
            } else {
                z = false;
            }
            textView.setEnabled(z);
            imageView.setImageResource(((PreSaleShowContent) list.get(i)).isHighlight == 1 ? 2131234653 : 2131234654);
            this.a.addView(inflate);
        }
        if (this.c != null) {
            this.c.setVisibility(0);
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void d() {
    }
}
