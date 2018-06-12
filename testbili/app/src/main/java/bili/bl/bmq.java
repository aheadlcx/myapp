package bili.bl;

import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bilibili.bilibililive.bililivefollowing.api.entity.AttentionInfo;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.facebook.drawee.view.StaticImageView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class bmq extends android.support.v7.widget.RecyclerView.a<a> {
    private List<AttentionInfo> a = new ArrayList();
    private OnClickListener b;

    /* compiled from: BL */
    static class a extends u {
        public TintTextView n;
        public StaticImageView o;

        a(View view) {
            super(view);
            this.n = (TintTextView) view.findViewById(2131298957);
            this.o = (StaticImageView) view.findViewById(2131296519);
        }
    }

    public /* synthetic */ u b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }

    public a a(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131428935, viewGroup, false));
    }

    public void a(a aVar, int i) {
        AttentionInfo attentionInfo = (AttentionInfo) this.a.get(i);
        aVar.n.setText(attentionInfo.uname);
        fci.g().a(attentionInfo.face, aVar.o);
        aVar.a.setTag(attentionInfo);
        if (this.b != null) {
            aVar.a.setOnClickListener(this.b);
        }
    }

    public int b(int i) {
        return ((AttentionInfo) this.a.get(i)).group;
    }

    public int a() {
        return this.a.size();
    }

    public void a(int i, List<AttentionInfo> list) {
        this.a.addAll(list);
        c(a() + i, list.size());
    }

    public void a(List<AttentionInfo> list) {
        this.a.clear();
        if (list != null) {
            this.a.addAll(list);
        }
        f();
    }

    public void a(OnClickListener onClickListener) {
        this.b = onClickListener;
    }
}
