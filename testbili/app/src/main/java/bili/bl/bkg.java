package bili.bl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: BL */
public class bkg extends mel {
    private ArrayList<com.bilibili.bangumi.ui.seasonlist.BangumiSeasonListActivity.a> a = new ArrayList();

    /* compiled from: BL */
    static class a extends meq {
        TextView n;

        public a(View view, bkg bl_bkg) {
            super(view, bl_bkg);
            this.n = (TextView) bbx.a(view, 2131301351);
        }

        public static a a(ViewGroup viewGroup, bkg bl_bkg) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131427536, viewGroup, false), bl_bkg);
        }
    }

    public bkg(ArrayList<com.bilibili.bangumi.ui.seasonlist.BangumiSeasonListActivity.a> arrayList) {
        this.a = arrayList;
    }

    public void a(meq bl_meq, int i, View view) {
        if (bl_meq instanceof a) {
            com.bilibili.bangumi.ui.seasonlist.BangumiSeasonListActivity.a aVar = (com.bilibili.bangumi.ui.seasonlist.BangumiSeasonListActivity.a) this.a.get(bl_meq.g());
            ((a) bl_meq).n.setText(String.valueOf(aVar.a));
            ((a) bl_meq).n.setSelected(aVar.c);
        }
    }

    public meq a(ViewGroup viewGroup, int i) {
        return a.a(viewGroup, this);
    }

    public int a() {
        return this.a.size();
    }
}
