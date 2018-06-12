package bili2.bl;

import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.upper.api.bean.VideoEpisode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class haq extends android.support.v7.widget.RecyclerView.a<a> {
    public final List<VideoEpisode> a = new ArrayList();
    public final OnClickListener b;
    public long c;
    public boolean d;
    public a e;

    /* compiled from: BL */
    public static class a extends u {
        public TextView n;
        public LinearLayout o;

        public a(View view, boolean z) {
            super(view);
            this.n = (TextView) view.findViewById(2131298249);
            this.o = (LinearLayout) view.findViewById(2131300708);
        }

        public static a a(ViewGroup viewGroup, boolean z) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131428398, viewGroup, false), z);
        }
    }

    public /* synthetic */ u b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }

    public haq(OnClickListener onClickListener) {
        this.b = onClickListener;
        b(true);
    }

    public VideoEpisode c(int i) {
        return (VideoEpisode) this.a.get(i);
    }

    public a a(ViewGroup viewGroup, int i) {
        a a = a.a(viewGroup, this.d);
        a.a.setOnClickListener(this.b);
        return a;
    }

    public void a(a aVar, int i) {
        VideoEpisode c = c(i);
        aVar.a.setTag(c);
        if (ert.a(c.title)) {
            aVar.n.setText("P-" + (i + 1));
        } else {
            aVar.n.setText(c.title);
        }
        boolean z = c.cid == this.c;
        if (z) {
            this.e = aVar;
        }
        if (z) {
            aVar.n.setTextColor(fnd.a(aVar.a.getContext(), 2131100837));
        } else {
            aVar.n.setTextColor(fnd.a(aVar.a.getContext(), 2131100037));
        }
        aVar.a.setSelected(z);
    }

    public long f_(int i) {
        return c(i).cid;
    }

    public int a() {
        return this.a.size();
    }

    public int b() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (((VideoEpisode) this.a.get(i)).cid == this.c) {
                return i;
            }
        }
        return -1;
    }

    public haq a(long j) {
        this.c = j;
        return this;
    }
}
