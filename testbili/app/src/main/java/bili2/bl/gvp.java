package bili2.bl;

import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.pegasus.api.model.BasicIndexItem;

/* compiled from: BL */
public class gvp extends gvi<a> {
    private BasicIndexItem a;

    /* compiled from: BL */
    static class a extends u {
        TintTextView n;
        TintTextView o;

        a(View view) {
            super(view);
            this.n = (TintTextView) gyb.a(view, 2131300682);
            this.o = (TintTextView) gyb.a(view, 2131298251);
        }

        void a(BasicIndexItem basicIndexItem) {
            if (!TextUtils.isEmpty(basicIndexItem.title)) {
                this.n.setText(basicIndexItem.title);
            }
            this.o.setVisibility(0);
            this.o.setOnClickListener(new gvq(basicIndexItem));
        }
    }

    public int a() {
        return 22;
    }

    public void a(a aVar, int i) {
        super.a((u) aVar, i);
        aVar.a(this.a);
    }

    public void a(Object obj, int i) {
        super.a(obj, i);
        this.a = (BasicIndexItem) obj;
    }

    public static a a(ViewGroup viewGroup) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131428357, viewGroup, false));
    }
}
