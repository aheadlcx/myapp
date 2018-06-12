package bili2.bl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bilibili.upper.activity.ManuscriptsListActivity;
import com.bilibili.upper.api.bean.VideoItem;
import java.util.List;

/* compiled from: BL */
public class hbi extends mef {
    public List<VideoItem> a;
    private int b;

    /* compiled from: BL */
    public static class a extends bl.mee.a implements OnClickListener {
        private LinearLayout n;

        public a(View view) {
            super(view);
            this.n = (LinearLayout) view.findViewById(2131298628);
            this.n.setOnClickListener(this);
        }

        public static a a(ViewGroup viewGroup) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131428391, viewGroup, false));
        }

        public void b(Object obj) {
        }

        public void onClick(View view) {
            hfp.i();
            fnw.a(view.getContext(), hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), "name", "\u5168\u90e8");
            view.getContext().startActivity(ManuscriptsListActivity.a(view.getContext()));
        }
    }

    private hbi(int i) {
        this.b = i;
    }

    public static hbi c(int i) {
        return new hbi(i);
    }

    public Object a(int i) {
        return null;
    }

    public int a() {
        return (this.a == null || this.a.size() == 0) ? 0 : 1;
    }

    public int b(int i) {
        return this.b;
    }

    public bl.mee.a a(ViewGroup viewGroup, int i) {
        if (i == this.b) {
            return a.a(viewGroup);
        }
        return null;
    }
}
