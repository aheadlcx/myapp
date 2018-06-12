package bili.bl;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.bangumi.api.BangumiModule.Item;

/* compiled from: BL */
public class bej extends meq implements OnClickListener {
    public TextView n;
    public TextView o;
    public ImageView p;
    public TextView q;

    public bej(View view, mel bl_mel) {
        super(view, bl_mel);
        this.n = (TextView) bbx.a(view, 2131300682);
        this.o = (TextView) bbx.a(view, 2131300372);
        this.p = (ImageView) bbx.a(view, 2131297178);
        this.q = (TextView) bbx.a(view, 2131296549);
        view.setOnClickListener(this);
    }

    public bej(ViewGroup viewGroup, mel bl_mel) {
        this(LayoutInflater.from(viewGroup.getContext()).inflate(2131427507, viewGroup, false), bl_mel);
    }

    public void a(String str, int i, Item item) {
        int i2 = 8;
        if (item != null) {
            item.pageName = str;
            this.n.setText(item.title);
            this.n.setVisibility(TextUtils.isEmpty(item.title) ? 8 : 0);
            this.o.setText(item.desc);
            TextView textView = this.o;
            if (!TextUtils.isEmpty(item.desc)) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            bby.a(this.q, item);
            fci.g().a(item.cover, this.p);
            this.a.setTag(2131300519, item);
            this.a.setTag(2131300522, Integer.valueOf(i));
        }
    }

    public void onClick(View view) {
        if ((view.getTag(2131300519) instanceof Item) && (view.getTag(2131300522) instanceof Integer)) {
            int intValue = ((Integer) view.getTag(2131300522)).intValue();
            Item item = (Item) view.getTag(2131300519);
            bcc.a(view.getContext(), item.link);
            bcz.b(item, intValue);
        }
    }
}
