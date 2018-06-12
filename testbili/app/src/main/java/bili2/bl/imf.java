package bili2.bl;

import android.app.Activity;
import android.view.ViewGroup;
import bl.imc.a;
import com.mall.domain.search.sugBean.SearchSugBean;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class imf extends iof {
    private List<SearchSugBean> a = new ArrayList();
    private a b;
    private Activity c;
    private int d;

    public imf(Activity activity, int i) {
        this.c = activity;
        this.d = i;
    }

    public void a(List<SearchSugBean> list, a aVar) {
        this.a = list;
        this.b = aVar;
    }

    public iog a(ViewGroup viewGroup, int i) {
        if (this.c != null) {
            return new img(this.c.getLayoutInflater().inflate(2131429287, viewGroup, false), this.b, this.d);
        }
        return null;
    }

    protected boolean c() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public void i() {
    }

    public int b() {
        return this.a == null ? 0 : this.a.size();
    }

    public void a(iog bl_iog, int i) {
        if (bl_iog instanceof img) {
            img bl_img = (img) bl_iog;
            bl_img.a((SearchSugBean) this.a.get(i), i);
            if (i == this.a.size() - 1) {
                bl_img.a();
            } else {
                bl_img.b();
            }
        }
    }
}
