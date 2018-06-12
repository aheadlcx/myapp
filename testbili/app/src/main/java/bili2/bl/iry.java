package bili2.bl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.sobot.chat.activity.SobotChatActivity;
import com.sobot.chat.api.model.ZhiChiMessageBase;

/* compiled from: BL */
public class iry extends isf {
    TextView a;
    TextView b;
    ImageView c;
    Button d;
    TextView e;

    public iry(Context context, View view) {
        super(context, view);
        this.d = (Button) view.findViewById(irq.a(context, "id", "sobot_goods_sendBtn"));
        this.c = (ImageView) view.findViewById(irq.a(context, "id", "sobot_goods_pic"));
        this.a = (TextView) view.findViewById(irq.a(context, "id", "sobot_goods_title"));
        this.b = (TextView) view.findViewById(irq.a(context, "id", "sobot_goods_describe"));
        this.e = (TextView) view.findViewById(irq.a(context, "id", "sobot_goods_label"));
    }

    public void a(final Context context, ZhiChiMessageBase zhiChiMessageBase) {
        CharSequence k = zhiChiMessageBase.k();
        String c = zhiChiMessageBase.c();
        final String s = zhiChiMessageBase.s();
        CharSequence A = zhiChiMessageBase.A();
        CharSequence m = zhiChiMessageBase.m();
        if (TextUtils.isEmpty(c)) {
            this.c.setVisibility(8);
            this.c.setImageResource(irq.a(context, "drawable", "sobot_icon_consulting_default_pic"));
        } else {
            this.c.setVisibility(0);
            Drawable drawable = context.getResources().getDrawable(irq.a(context, "drawable", "sobot_icon_consulting_default_pic"));
            irf.a(context, irh.b(c), this.c, drawable, drawable);
        }
        this.a.setText(k);
        if (!TextUtils.isEmpty(A)) {
            this.e.setVisibility(0);
            this.e.setText(A);
        } else if (TextUtils.isEmpty(c)) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(4);
        }
        if (TextUtils.isEmpty(m)) {
            this.b.setVisibility(8);
        } else {
            this.b.setVisibility(0);
            this.b.setText(m);
        }
        this.d.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ iry c;

            public void onClick(View view) {
                irn.c("\u53d1\u9001\u8fde\u63a5---->" + s);
                ((SobotChatActivity) context).h();
            }
        });
    }
}
