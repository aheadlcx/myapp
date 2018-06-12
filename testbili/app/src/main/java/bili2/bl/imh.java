package bili2.bl;

import bl.imc.a;
import bl.imc.b;
import com.mall.domain.search.sugBean.SearchSugBean;
import com.mall.domain.search.sugBean.SearchSugListBean;
import com.mall.ui.search.SearchFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: BL */
public class imh extends idm implements a {
    private b b;
    private int c;
    private Map<String, gne> d = new HashMap();
    private igm e;
    private List<SearchSugBean> f = new ArrayList();
    private igl g;
    private List<SearchSugBean> h = new ArrayList();
    private long i;

    public imh(b bVar) {
        super(bVar);
        this.b = bVar;
        this.b.a(this);
        this.e = new igm();
        this.g = new igl();
    }

    private void c(String str) {
        if (this.d.get(str) != null && ((gne) this.d.get(str)).c()) {
            ((gne) this.d.get(str)).f();
        }
    }

    public void aT_() {
        super.aT_();
        for (Entry value : this.d.entrySet()) {
            gne bl_gne = (gne) value.getValue();
            if (bl_gne != null) {
                bl_gne.f();
            }
        }
    }

    public void a(int i) {
        this.c = i;
    }

    public int h() {
        return this.c;
    }

    public void a(String str) {
        c("requestSearchSug");
        this.d.put("requestSearchSug", this.e.a(new idv<SearchSugListBean>(this, this) {
            final /* synthetic */ imh a;

            public /* synthetic */ void b(Object obj) {
                a((SearchSugListBean) obj);
            }

            public void a(SearchSugListBean searchSugListBean) {
                if (searchSugListBean == null || searchSugListBean.sugList == null || searchSugListBean.sugList.size() == 0) {
                    this.a.b.c();
                    this.a.f.clear();
                    return;
                }
                if (this.a.b instanceof SearchFragment) {
                    ((SearchFragment) this.a.b).S();
                }
                this.a.f.clear();
                this.a.f.addAll(searchSugListBean.sugList);
                this.a.b.a(this.a.f);
            }

            public void b(Throwable th) {
                this.a.b.c();
                this.a.f.clear();
            }
        }, str, this.c));
    }

    public void a(String str, SearchSugBean searchSugBean) {
        this.b.a(str, searchSugBean);
    }

    public void d() {
        this.h = this.g.a(this.c);
        this.b.b(this.h);
    }

    public void e() {
        if (this.g != null) {
            this.g.c(this.c);
            this.g.b(this.c);
        }
        d();
    }

    public void a(SearchSugBean searchSugBean) {
        if (this.g != null) {
            this.g.a(this.c, searchSugBean);
            this.g.b(this.c);
        }
        d();
    }

    public void b(SearchSugBean searchSugBean) {
        if (this.g != null) {
            this.g.b(this.c, searchSugBean);
            this.g.b(this.c);
        }
        d();
    }

    public void a(long j) {
        this.i = j;
    }

    public void b(String str) {
        c("requestSearchSugInShop");
        Map hashMap = new HashMap();
        hashMap.put("shopId", iop.a(this.i));
        this.d.put("requestSearchSug", this.e.a(new idv<SearchSugListBean>(this, this) {
            final /* synthetic */ imh a;

            public /* synthetic */ void b(Object obj) {
                a((SearchSugListBean) obj);
            }

            public void a(SearchSugListBean searchSugListBean) {
                if (searchSugListBean == null || searchSugListBean.sugList == null || searchSugListBean.sugList.size() == 0) {
                    this.a.b.c();
                    this.a.f.clear();
                    return;
                }
                if (this.a.b instanceof SearchFragment) {
                    ((SearchFragment) this.a.b).S();
                }
                this.a.f.clear();
                this.a.f.addAll(searchSugListBean.sugList);
                this.a.b.a(this.a.f);
            }

            public void b(Throwable th) {
                this.a.b.c();
                this.a.f.clear();
            }
        }, str, this.c, hashMap));
    }

    public void f() {
        this.h = this.g.a(this.i);
        this.b.b(this.h);
    }

    public void g() {
        if (this.g != null) {
            this.g.c(this.i);
            this.g.b(this.i);
        }
        f();
    }

    public void c(SearchSugBean searchSugBean) {
        if (this.g != null) {
            this.g.a(this.i, searchSugBean);
            this.g.b(this.i);
        }
        f();
    }
}
