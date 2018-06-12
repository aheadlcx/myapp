package bili2.bl;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mall.domain.order.detail.bean.OrderExpressDetail;

/* compiled from: BL */
public class ila extends ihc {
    private static float t;
    View n;
    View o;
    TextView p;
    TextView q;
    ImageView r;
    private Context s;

    public ila(Context context, View view) {
        super(view);
        this.s = context;
        this.n = view.findViewById(2131300750);
        this.o = view.findViewById(2131296659);
        this.p = (TextView) view.findViewById(2131300839);
        this.q = (TextView) view.findViewById(2131300965);
        this.r = (ImageView) view.findViewById(2131297441);
        t = context.getResources().getDisplayMetrics().density;
    }

    public void a(OrderExpressDetail orderExpressDetail, int i, int i2) {
        int i3 = 0;
        if (orderExpressDetail != null) {
            this.p.setText(iop.c(orderExpressDetail.context));
            this.q.setText(iop.c(orderExpressDetail.time));
            if (i == 0) {
                this.n.setVisibility(4);
                View view = this.o;
                if (i2 <= 1) {
                    i3 = 4;
                }
                view.setVisibility(i3);
                this.p.setTextColor(ioo.c(2131099963));
                this.r.setImageResource(2131234653);
                this.q.setTextColor(ioo.c(2131099963));
            } else if (i == i2 - 1) {
                this.n.setVisibility(0);
                this.o.setVisibility(4);
                this.p.setTextColor(ioo.c(2131100035));
                this.r.setImageResource(2131234654);
                this.q.setTextColor(ioo.c(2131100035));
            } else {
                this.n.setVisibility(0);
                this.o.setVisibility(0);
                this.p.setTextColor(ioo.c(2131100035));
                this.r.setImageResource(2131234654);
                this.q.setTextColor(ioo.c(2131100035));
            }
        }
    }
}
