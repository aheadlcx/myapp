package bili2.bl;

import bl.iki.a;
import bl.iki.b;
import com.mall.domain.home.FeedsItem;
import com.mall.domain.home.article.bean.ArticleListDataBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: BL */
public class ikk extends idm implements a {
    private b b;
    private String c;
    private int d;
    private boolean e = false;
    private int f = 1;
    private Map<String, gne> g = new HashMap();
    private ifx h;
    private List<FeedsItem> i = new ArrayList();
    private boolean j = false;

    public ikk(b bVar) {
        super(bVar);
        this.b = bVar;
        this.b.a(this);
        this.h = new ifx();
    }

    private void c(String str) {
        if (this.g.get(str) != null && ((gne) this.g.get(str)).c()) {
            ((gne) this.g.get(str)).f();
        }
    }

    public void aS_() {
        a(this.c, 1, false);
        super.aS_();
    }

    public void aT_() {
        super.aT_();
        for (Entry value : this.g.entrySet()) {
            gne bl_gne = (gne) value.getValue();
            if (bl_gne != null) {
                bl_gne.f();
            }
        }
    }

    public void b(String str) {
        this.c = str;
    }

    public void a(String str, int i) {
        this.f = i;
        a(str, i, true);
    }

    public void d() {
        if (!this.e) {
            this.f++;
            a(this.c, this.f, false);
        }
    }

    public void a(String str) {
        this.b.a(str);
    }

    public boolean e() {
        return this.d > 0;
    }

    public boolean f() {
        return this.j;
    }

    private void a(String str, final int i, boolean z) {
        this.e = true;
        if (i == 1 && !z) {
            this.b.b();
        }
        c("requestHomeInfo");
        this.g.put("requestHomeInfo", this.h.a(new idv<ArticleListDataBean>(this, this) {
            final /* synthetic */ ikk b;

            public /* synthetic */ void b(Object obj) {
                a((ArticleListDataBean) obj);
            }

            public void a(ArticleListDataBean articleListDataBean) {
                this.b.e = false;
                this.b.j = false;
                if (articleListDataBean != null && articleListDataBean.articleDataVo != null && articleListDataBean.articleDataVo.count != 0) {
                    this.b.d = articleListDataBean.articleDataVo.count;
                    if (articleListDataBean.codeType != 1) {
                        if (i == 1) {
                            this.b.i.clear();
                            this.b.b.d();
                        } else {
                            this.b.b.b(articleListDataBean.codeMsg);
                        }
                        this.b.f = this.b.f - 1;
                        return;
                    }
                    this.b.b.f();
                    if (i == 1) {
                        this.b.i.clear();
                    }
                    this.b.i.addAll(articleListDataBean.articleDataVo.articleList);
                    this.b.b.a(this.b.i);
                } else if (i <= 1) {
                    this.b.b.c();
                    this.b.i.clear();
                    this.b.d = 0;
                    this.b.b.a(this.b.i);
                }
            }

            public void b(Throwable th) {
                this.b.j = true;
                this.b.e = false;
                if (i <= 1) {
                    this.b.b.a();
                    if (this.b.i.size() == 0) {
                        this.b.j = false;
                        this.b.b.d();
                    }
                }
                if (i >= 1) {
                    this.b.f = this.b.f - 1;
                }
                if (this.b.j) {
                    this.b.b.aM_();
                }
            }
        }, str, i, 10));
    }
}
