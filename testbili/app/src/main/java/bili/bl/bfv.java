package bili.bl;

import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.RecyclerView.u;
import android.view.View;
import android.view.ViewGroup;
import bl.bds.a;
import bl.mem.b;
import com.bilibili.bangumi.api.BangumiCinemaFall;
import com.bilibili.bangumi.api.BangumiCinemaTab;
import com.bilibili.bangumi.api.BangumiModule;
import com.bilibili.bangumi.api.BangumiModule.Item;
import com.bilibili.bangumi.api.BangumiModuleBanner;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class bfv extends meo {
    beb a;
    private List<BangumiModuleBanner> b = new ArrayList();
    private List<BangumiModule> c = new ArrayList();
    private List<Item> d = new ArrayList();
    private BangumiCinemaFall g;
    private int h;

    public /* synthetic */ void a(u uVar) {
        d((meq) uVar);
    }

    public /* synthetic */ void c(u uVar) {
        b((meq) uVar);
    }

    public /* synthetic */ void d(u uVar) {
        c((meq) uVar);
    }

    public void a(BangumiCinemaTab bangumiCinemaTab) {
        this.b.clear();
        if (!(bangumiCinemaTab == null || bangumiCinemaTab.banners == null || bangumiCinemaTab.banners.isEmpty())) {
            this.b.addAll(bangumiCinemaTab.banners);
        }
        this.c.clear();
        if (bangumiCinemaTab != null && bangumiCinemaTab.modules != null && !bangumiCinemaTab.modules.isEmpty()) {
            for (BangumiModule bangumiModule : bangumiCinemaTab.modules) {
                if (!(bangumiModule == null || bangumiModule.items == null || bangumiModule.items.isEmpty())) {
                    this.c.add(bangumiModule);
                }
            }
        }
    }

    public void a(boolean z, BangumiCinemaFall bangumiCinemaFall) {
        if (!z) {
            this.d.clear();
        }
        this.g = bangumiCinemaFall;
        if (this.g != null && this.g.list != null && !this.g.list.isEmpty()) {
            this.d.addAll(this.g.list);
        }
    }

    protected void a(b bVar) {
        this.h = 0;
        if (!this.b.isEmpty()) {
            this.h++;
            bVar.a(1, 100);
        }
        bby.a(bVar, this.c);
        int size = this.d.size();
        bVar.a(size, 101, size > 0 ? 102 : -1);
    }

    public meq a_(ViewGroup viewGroup, int i) {
        if (i == 100) {
            return beb.a(viewGroup, (mel) this);
        }
        if (i == 101) {
            return new bej(viewGroup, (mel) this);
        }
        if (i == 102) {
            return new bek(viewGroup, (mel) this);
        }
        return bby.a((mel) this, viewGroup, i);
    }

    public void a_(meq bl_meq, int i, View view) {
        if (bl_meq instanceof beb) {
            ((beb) bl_meq).a(this.b);
        } else if (bl_meq instanceof bej) {
            r1 = k(i);
            ((bej) bl_meq).a(hae.a(new byte[]{(byte) 117, (byte) 98, (byte) 102, (byte) 90, (byte) 102, (byte) 108, (byte) 107, (byte) 96, (byte) 104, (byte) 100, (byte) 90, (byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 117, (byte) 100, (byte) 98, (byte) 96}), r1, (Item) this.d.get(r1));
        } else if (bl_meq instanceof bek) {
            ((bek) bl_meq).a(this.g == null ? BuildConfig.VERSION_NAME : this.g.title, this.g == null ? BuildConfig.VERSION_NAME : this.g.icon);
        } else {
            r1 = i(i);
            bby.a(bl_meq, hae.a(new byte[]{(byte) 117, (byte) 98, (byte) 102, (byte) 90, (byte) 102, (byte) 108, (byte) 107, (byte) 96, (byte) 104, (byte) 100, (byte) 90, (byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 117, (byte) 100, (byte) 98, (byte) 96}), k(i), (BangumiModule) this.c.get(r1 - this.h), r1 - this.h != 0);
        }
    }

    public void a(meq bl_meq) {
        if (bl_meq instanceof beb) {
            ((beb) bl_meq).a(new bds.b<BangumiModuleBanner>(this) {
                final /* synthetic */ bfv a;

                {
                    this.a = r1;
                }

                public void a(List<a<BangumiModuleBanner>> list, a<BangumiModuleBanner> aVar) {
                    if (list != null && !list.isEmpty() && aVar != null && aVar.a != null) {
                        int indexOf = list.indexOf(aVar);
                        if (indexOf >= 0) {
                            bcz.a(hae.a(new byte[]{(byte) 117, (byte) 98, (byte) 102, (byte) 90, (byte) 102, (byte) 108, (byte) 107, (byte) 96, (byte) 104, (byte) 100, (byte) 90, (byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 117, (byte) 100, (byte) 98, (byte) 96}), ((BangumiModuleBanner) aVar.a).title, indexOf);
                        }
                    }
                }
            });
        }
    }

    public void b(meq bl_meq) {
        super.c(bl_meq);
        if (bl_meq instanceof beb) {
            if (this.a == null) {
                this.a = (beb) bl_meq;
            }
            this.a.a();
        }
    }

    public void c(meq bl_meq) {
        super.d(bl_meq);
        if (bl_meq instanceof beb) {
            ((beb) bl_meq).b();
            this.a = null;
        }
    }

    public void d(meq bl_meq) {
        super.a(bl_meq);
        if (bl_meq instanceof beb) {
            ((beb) bl_meq).b();
        }
    }

    public void b() {
        if (this.a != null) {
            this.a.b();
            this.a = null;
        }
    }
}
