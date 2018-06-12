package bili3.com.bilibili.bangumi.ui.category.index;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.c;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.RecyclerView.u;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import bl.bbi;
import bl.bbw.b;
import bl.bbx;
import bl.bcc;
import bl.bea;
import bl.bfm;
import bl.bfn;
import bl.bfo;
import bl.bfp;
import bl.bfq;
import bl.bfr;
import bl.bfs;
import bl.fky;
import bl.flh;
import bl.fnd;
import bl.gnd;
import bl.hae;
import bl.jn;
import bl.mds;
import bl.mdz;
import bl.mel.a;
import bl.meq;
import com.bilibili.bangumi.api.BangumiApiService;
import com.bilibili.bangumi.api.BangumiApiService.CategoryIndexParamsMap;
import com.bilibili.bangumi.api.BangumiCategoryIndex;
import com.bilibili.bangumi.api.BangumiCategoryIndex.Bangumi;
import com.bilibili.bangumi.api.BangumiCategoryIndexFilter;
import com.bilibili.bangumi.api.BangumiCategoryIndexFilter.Category;
import com.bilibili.bangumi.widget.BangumiFilterLayout;
import com.bilibili.bilibililive.im.entity.DataChangeNotify;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.upper.api.bean.VideoItem;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuContent;
import tv.danmaku.bili.widget.dropdownmenu.DropDownMenuHead;

/* compiled from: BL */
public class BangumiCategoryIndexActivity extends fky implements OnClickListener, a {
    private static final String[] a = new String[]{"\u8ffd\u756a\u4eba\u6570", "\u66f4\u65b0\u65f6\u95f4", "\u5f00\u64ad\u65e5\u671f"};
    private mdz A;
    private mdz B;
    private mdz C;
    private boolean D;
    private BangumiApiService E;
    private boolean b;
    private IndexFilterParam c;
    private IndexFilterParam d;
    private DrawerLayout e;
    private LinearLayout f;
    private RecyclerView g;
    private BangumiFilterLayout h;
    private AppBarLayout i;
    private DropDownMenuHead j;
    private DropDownMenuContent k;
    private TintTextView l;
    private LoadingImageView m;
    private TintTextView n;
    private RecyclerView o;
    private bfm p;
    private GridLayoutManager q;
    private bfn r;
    private int s;
    private int t;
    private int v = 1;
    private boolean w;
    private boolean x;
    private bfp y;
    private bfs z;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427431);
        this.b = getIntent().getBooleanExtra(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 90, (byte) 119, (byte) 100, (byte) 107, (byte) 110}), false);
        this.s = getIntent().getIntExtra(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 118, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), 1);
        this.c = (IndexFilterParam) getIntent().getParcelableExtra(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 113, (byte) 96, (byte) 119}));
        if (this.c == null) {
            this.c = new IndexFilterParam();
        }
        this.d = new IndexFilterParam();
        g();
        D();
        setTitle(this.b ? 2131690097 : 2131690088);
        this.g = (RecyclerView) bbx.a(this, 2131299639);
        this.e = (DrawerLayout) bbx.a(this, 2131297456);
        this.f = (LinearLayout) bbx.a(this, 2131297458);
        this.m = (LoadingImageView) bbx.a(this, 2131298656);
        this.i = (AppBarLayout) bbx.a(this, 2131296427);
        this.h = (BangumiFilterLayout) bbx.a(this, 2131297701);
        this.j = (DropDownMenuHead) bbx.a(this, 2131297463);
        this.k = (DropDownMenuContent) bbx.a(this, 2131297462);
        this.l = (TintTextView) bbx.a(this, 2131297699);
        this.n = (TintTextView) bbx.a(this, 2131299702);
        this.o = (RecyclerView) bbx.a(this, 2131299634);
        ((LinearLayout) bbx.a(this, 2131297706)).setVisibility(this.b ? 8 : 0);
        bbx.a(this, 2131297582).setOnClickListener(this);
        bbx.a(this, 2131299700).setOnClickListener(this);
        bbx.a(this, 2131297087).setOnClickListener(this);
        bbx.a(this, 2131297700).setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.e.setEnabled(false);
        this.e.a(new jn(this, this, this.e, 0, 0) {
            final /* synthetic */ BangumiCategoryIndexActivity c;

            public void onDrawerOpened(View view) {
                super.onDrawerOpened(view);
                if (this.c.j != null && this.c.j.c()) {
                    this.c.j.b();
                }
                this.c.D = false;
                this.c.u();
            }

            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                if (!this.c.D) {
                    this.c.v();
                }
            }
        });
        k();
        l();
        if (this.b) {
            b.g();
        } else {
            b.f();
        }
    }

    protected void h() {
        flh.a(this, this.e, fnd.c(this, 2130968719));
        flh.b(this, this.f);
    }

    private void k() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165508);
        final int a = dimensionPixelSize - bbx.a(this, 2.0f);
        this.g.addItemDecoration(new mds(this, dimensionPixelSize, 3) {
            final /* synthetic */ BangumiCategoryIndexActivity b;

            public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
                super.a(rect, view, recyclerView, rVar);
                u childViewHolder = recyclerView.getChildViewHolder(view);
                int j = childViewHolder.j();
                int a = ((GridLayoutManager) recyclerView.getLayoutManager()).b().a(childViewHolder.g(), 3);
                if (j == 100) {
                    if (a == 0) {
                        rect.left = a;
                        rect.right = 0;
                    } else if (a == 2) {
                        rect.left = 0;
                        rect.right = a;
                    } else {
                        rect.left = a / 2;
                        rect.right = a / 2;
                    }
                }
                if (j == bfm.f) {
                    rect.bottom = 0;
                    rect.top = 0;
                }
            }
        });
        this.q = new GridLayoutManager(this, 3);
        this.q.a(new c(this) {
            final /* synthetic */ BangumiCategoryIndexActivity b;

            {
                this.b = r1;
            }

            public int a(int i) {
                if (this.b.p.b(i) == 100) {
                    return 1;
                }
                return 3;
            }
        });
        this.p = new bfm();
        this.g.setLayoutManager(this.q);
        this.g.setAdapter(this.p);
        this.p.a(this);
        this.g.addOnScrollListener(new bea(this) {
            final /* synthetic */ BangumiCategoryIndexActivity a;

            {
                this.a = r1;
            }

            protected void a() {
                if (this.a.p.a() > 1) {
                    this.a.n();
                }
            }
        });
    }

    private void l() {
        y();
        i().getCategoryIndexFilter().a(new bbi<BangumiCategoryIndexFilter>(this) {
            final /* synthetic */ BangumiCategoryIndexActivity a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(Object obj) {
                a((BangumiCategoryIndexFilter) obj);
            }

            public void a(BangumiCategoryIndexFilter bangumiCategoryIndexFilter) {
                if (bangumiCategoryIndexFilter != null && bangumiCategoryIndexFilter.category != null && bangumiCategoryIndexFilter.years != null) {
                    this.a.a(bangumiCategoryIndexFilter);
                    this.a.o();
                    this.a.q();
                    this.a.r();
                    this.a.m();
                }
            }

            public void a(Throwable th) {
                this.a.A();
            }

            public boolean a() {
                return this.a.c_();
            }
        });
    }

    private void m() {
        this.x = false;
        a(false);
    }

    private void n() {
        a(true);
    }

    private void a(final boolean z) {
        if (!this.w && !this.x) {
            this.w = true;
            if (z) {
                this.v++;
                this.p.p();
            } else {
                this.p.b();
                y();
                this.v = 1;
            }
            i().getCategoryIndex(new CategoryIndexParamsMap(this.v, this.s, this.t, this.z.a.a, this.z.b.a, this.z.c.a, this.z.d.a, this.z.e.a, this.z.f.a)).a(new bbi<BangumiCategoryIndex>(this) {
                final /* synthetic */ BangumiCategoryIndexActivity b;

                public /* synthetic */ void b(Object obj) {
                    a((BangumiCategoryIndex) obj);
                }

                public void a(BangumiCategoryIndex bangumiCategoryIndex) {
                    boolean z = true;
                    this.b.w = false;
                    if (bangumiCategoryIndex == null) {
                        this.b.A();
                        return;
                    }
                    if (this.b.v >= bangumiCategoryIndex.pages || bangumiCategoryIndex.list == null || bangumiCategoryIndex.list.isEmpty()) {
                        this.b.x = true;
                    }
                    bfm e = this.b.p;
                    List list = bangumiCategoryIndex.list;
                    if (z) {
                        z = false;
                    }
                    e.a(list, z, this.b.s, this.b.b);
                    if (this.b.x) {
                        this.b.p.u_();
                    }
                    this.b.p.k();
                    if (z || this.b.p.c() != 0) {
                        this.b.z();
                        return;
                    }
                    this.b.p.o();
                    this.b.B();
                }

                public void a(Throwable th) {
                    this.b.w = false;
                    if (z) {
                        this.b.v = this.b.v - 1;
                        this.b.p.n();
                        return;
                    }
                    this.b.A();
                }

                public boolean a() {
                    this.b.w = false;
                    return this.b.c_();
                }
            });
        }
    }

    private void a(BangumiCategoryIndexFilter bangumiCategoryIndexFilter) {
        int i = 0;
        this.y = new bfp();
        this.y.a = bfr.a();
        this.y.b = new ArrayList();
        this.y.b.add(new bfq(Constants.STR_EMPTY, "\u5168\u90e8", 0));
        for (int i2 = 0; i2 < bangumiCategoryIndexFilter.category.size(); i2++) {
            Category category = (Category) bangumiCategoryIndexFilter.category.get(i2);
            this.y.b.add(new bfq(category.tagId, category.tagName, i2 + 1));
        }
        this.y.c = bfr.b();
        this.y.d = bfr.c();
        this.y.e = new ArrayList();
        this.y.e.add(new bfq(Constants.STR_EMPTY, "\u5168\u90e8", 0));
        Collections.reverse(bangumiCategoryIndexFilter.years);
        while (i < bangumiCategoryIndexFilter.years.size()) {
            String str = (String) bangumiCategoryIndexFilter.years.get(i);
            this.y.e.add(new bfq(str, str, i + 1));
            i++;
        }
        this.y.f = bfr.d();
        a(this.c);
    }

    private void o() {
        ArrayList arrayList = new ArrayList();
        int p = p();
        for (int i = 0; i < a.length; i++) {
            boolean z;
            BangumiFilterLayout.a aVar = new BangumiFilterLayout.a();
            aVar.a = a[i];
            if (i == p) {
                z = true;
            } else {
                z = false;
            }
            aVar.c = z;
            if (i == p) {
                z = true;
            } else {
                z = false;
            }
            aVar.b = z;
            arrayList.add(aVar);
        }
        this.h.setFilterData(arrayList);
        this.h.setOnFilterItemClickListener(new BangumiFilterLayout.b(this) {
            final /* synthetic */ BangumiCategoryIndexActivity a;

            {
                this.a = r1;
            }

            public void a(int i, boolean z) {
                int i2 = 1;
                if (!this.a.w) {
                    if (i == 0) {
                        this.a.s = 1;
                        b.o();
                    } else if (i == 1) {
                        this.a.s = 0;
                        b.p();
                    } else {
                        this.a.s = 2;
                        b.q();
                    }
                    BangumiCategoryIndexActivity bangumiCategoryIndexActivity = this.a;
                    if (z) {
                        i2 = 0;
                    }
                    bangumiCategoryIndexActivity.t = i2;
                    b.a(BangumiCategoryIndexActivity.a[i], this.a.t);
                    this.a.q.b(0, 0);
                    this.a.m();
                }
            }
        });
    }

    private int p() {
        if (this.s == 1) {
            return 0;
        }
        if (this.s == 0) {
            return 1;
        }
        if (this.s == 2) {
            return 2;
        }
        return 0;
    }

    private void q() {
        int i;
        int i2 = 0;
        this.e.setEnabled(true);
        this.i.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        this.A = new mdz();
        this.A.b = "\u7c7b\u578b";
        arrayList.add(this.A);
        this.A.d = new ArrayList();
        for (i = 0; i < this.y.a.size(); i++) {
            mdz bl_mdz = new mdz();
            bl_mdz.b = ((bfq) this.y.a.get(i)).b;
            bl_mdz.c = ((bfq) this.y.a.get(i)).d;
            this.A.d.add(bl_mdz);
        }
        this.B = new mdz();
        this.B.b = "\u98ce\u683c";
        arrayList.add(this.B);
        this.B.d = new ArrayList();
        for (i = 0; i < this.y.b.size(); i++) {
            bl_mdz = new mdz();
            bl_mdz.b = ((bfq) this.y.b.get(i)).b;
            bl_mdz.c = ((bfq) this.y.b.get(i)).d;
            this.B.d.add(bl_mdz);
        }
        this.C = new mdz();
        this.C.b = "\u72b6\u6001";
        arrayList.add(this.C);
        this.C.d = new ArrayList();
        for (i = 0; i < this.y.c.size(); i++) {
            bl_mdz = new mdz();
            bl_mdz.b = ((bfq) this.y.c.get(i)).b;
            bl_mdz.c = ((bfq) this.y.c.get(i)).d;
            this.C.d.add(bl_mdz);
        }
        this.k.setSpanCount(5);
        this.k.setItemDecoration(new mds(this, getResources().getDimensionPixelSize(2131165508), 5) {
            final /* synthetic */ BangumiCategoryIndexActivity a;

            public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
                super.a(rect, view, recyclerView, rVar);
                rect.right = 0;
                rect.left = 0;
            }
        });
        this.k.getRecyclerView().setNestedScrollingEnabled(false);
        LayoutParams layoutParams = (LayoutParams) this.k.getRecyclerView().getLayoutParams();
        layoutParams.bottomMargin = bbx.a(this, 100.0f);
        this.k.getRecyclerView().setLayoutParams(layoutParams);
        this.j.a(this.k, arrayList, new bfo());
        this.j.setOnSubMenuItemClickListener(new DropDownMenuHead.c(this) {
            final /* synthetic */ BangumiCategoryIndexActivity a;

            {
                this.a = r1;
            }

            public void a(int i, int i2) {
                if (!this.a.w) {
                    int i3;
                    bfq bl_bfq;
                    boolean z;
                    if (i == 0) {
                        for (i3 = 0; i3 < this.a.y.a.size(); i3++) {
                            bl_bfq = (bfq) this.a.y.a.get(i3);
                            if (i3 == i2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bl_bfq.d = z;
                        }
                        this.a.z.a = (bfq) this.a.y.a.get(i2);
                        b.a("\u7c7b\u578b", this.a.z.a.b);
                        if (this.a.b) {
                            b.k();
                        } else {
                            b.r();
                        }
                    } else if (i == 1) {
                        for (i3 = 0; i3 < this.a.y.b.size(); i3++) {
                            bl_bfq = (bfq) this.a.y.b.get(i3);
                            if (i3 == i2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bl_bfq.d = z;
                        }
                        this.a.z.b = (bfq) this.a.y.b.get(i2);
                        b.a("\u98ce\u683c", this.a.z.b.b);
                        if (this.a.b) {
                            b.l();
                        } else {
                            b.s();
                        }
                    } else if (i == 2) {
                        for (i3 = 0; i3 < this.a.y.c.size(); i3++) {
                            bl_bfq = (bfq) this.a.y.c.get(i3);
                            if (i3 == i2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            bl_bfq.d = z;
                        }
                        this.a.z.c = (bfq) this.a.y.c.get(i2);
                        b.a("\u72b6\u6001", this.a.z.c.b);
                        if (this.a.b) {
                            b.m();
                        } else {
                            b.t();
                        }
                    }
                    TextView textView = (TextView) ((LinearLayout) bbx.a(this.a.j, 2131298771)).getChildAt(i).findViewById(2131298759);
                    if (i2 == 0) {
                        if (i == 0) {
                            textView.setText("\u7c7b\u578b");
                        } else if (i == 1) {
                            textView.setText("\u98ce\u683c");
                        } else if (i == 2) {
                            textView.setText("\u72b6\u6001");
                        }
                    }
                    this.a.r.k();
                    this.a.q.b(0, 0);
                    this.a.m();
                }
            }
        });
        while (i2 < arrayList.size()) {
            ((TextView) ((LinearLayout) bbx.a(this.j, 2131298771)).getChildAt(i2).findViewById(2131298759)).setTextColor(fnd.j(this, 2131099710));
            i2++;
        }
        t();
        x();
    }

    private void r() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165508) - bbx.a(this, 2.0f);
        this.o.addItemDecoration(new mds(this, getResources().getDimensionPixelSize(2131165508), 5) {
            final /* synthetic */ BangumiCategoryIndexActivity a;

            public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
                super.a(rect, view, recyclerView, rVar);
                int j = recyclerView.getChildViewHolder(view).j();
                rect.right = 0;
                rect.left = 0;
                if (j == 100) {
                    rect.top = 0;
                }
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 5);
        gridLayoutManager.a(new c(this) {
            final /* synthetic */ BangumiCategoryIndexActivity b;

            {
                this.b = r1;
            }

            public int a(int i) {
                int b = this.b.r.b(i);
                if (b == VideoItem.STATE_UPLOAD_FAIL || b == VideoItem.STATE_SUBMIT_FAIL || b == 105 || b == 107 || b == DataChangeNotify.TYPE_NEW_AT_RECEIVED || b == DataChangeNotify.TYPE_NEW_REPLY_RECIEVED) {
                    return 1;
                }
                return 5;
            }
        });
        this.r = new bfn(this.y, this.z);
        this.o.setLayoutManager(gridLayoutManager);
        this.o.setAdapter(this.r);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == 2131297700) {
            b.a();
            if (this.b) {
                b.n();
            } else {
                b.u();
            }
            this.e.e(8388613);
        } else if (id == 2131297582) {
            this.e.f(8388613);
        } else if (id == 2131299700) {
            b.b();
            this.r.b();
        } else if (id == 2131297087) {
            s();
        } else if (id == 2131299702) {
            b.d();
            this.r.b();
            s();
        }
    }

    private void s() {
        this.D = true;
        this.e.f(8388613);
        t();
        x();
        b.a(this.z);
        m();
    }

    private void t() {
        for (mdz bl_mdz : this.A.d) {
            bl_mdz.c = bl_mdz.b.equals(this.z.a.b);
        }
        a(0, this.z.a.b);
        for (mdz bl_mdz2 : this.B.d) {
            bl_mdz2.c = bl_mdz2.b.equals(this.z.b.b);
        }
        a(1, this.z.b.b);
        for (mdz bl_mdz22 : this.C.d) {
            bl_mdz22.c = bl_mdz22.b.equals(this.z.c.b);
        }
        a(2, this.z.c.b);
    }

    private void a(int i, String str) {
        TextView textView = (TextView) ((LinearLayout) bbx.a(this.j, 2131298771)).getChildAt(i).findViewById(2131298759);
        if (str.equals("\u5168\u90e8")) {
            if (i == 0) {
                textView.setText("\u7c7b\u578b");
            } else if (i == 1) {
                textView.setText("\u98ce\u683c");
            } else if (i == 2) {
                textView.setText("\u72b6\u6001");
            }
            textView.setSelected(false);
            return;
        }
        textView.setText(str);
        textView.setSelected(true);
    }

    private void u() {
        this.d.a = this.z.a.a;
        this.d.b = this.z.b.a;
        this.d.c = this.z.c.a;
        this.d.d = this.z.d.a;
        this.d.e = this.z.e.a;
        this.d.f = this.z.f.a;
    }

    private void v() {
        a(this.d);
        this.r.k();
    }

    private void a(IndexFilterParam indexFilterParam) {
        for (bfq bl_bfq : this.y.a) {
            bl_bfq.d = bl_bfq.a.equals(indexFilterParam.a);
        }
        for (bfq bl_bfq2 : this.y.b) {
            bl_bfq2.d = bl_bfq2.a.equals(indexFilterParam.b);
        }
        for (bfq bl_bfq22 : this.y.c) {
            bl_bfq22.d = bl_bfq22.a.equals(indexFilterParam.c);
        }
        for (bfq bl_bfq222 : this.y.d) {
            bl_bfq222.d = bl_bfq222.a.equals(indexFilterParam.d);
        }
        for (bfq bl_bfq2222 : this.y.e) {
            bl_bfq2222.d = bl_bfq2222.a.equals(indexFilterParam.e);
        }
        for (bfq bl_bfq22222 : this.y.f) {
            bl_bfq22222.d = bl_bfq22222.a.equals(indexFilterParam.f);
        }
        w();
    }

    private void w() {
        if (this.z == null) {
            this.z = new bfs();
        }
        for (bfq bl_bfq : this.y.a) {
            if (bl_bfq.d) {
                this.z.a = bl_bfq;
                break;
            }
        }
        for (bfq bl_bfq2 : this.y.b) {
            if (bl_bfq2.d) {
                this.z.b = bl_bfq2;
                break;
            }
        }
        for (bfq bl_bfq22 : this.y.c) {
            if (bl_bfq22.d) {
                this.z.c = bl_bfq22;
                break;
            }
        }
        for (bfq bl_bfq222 : this.y.d) {
            if (bl_bfq222.d) {
                this.z.d = bl_bfq222;
                break;
            }
        }
        for (bfq bl_bfq2222 : this.y.e) {
            if (bl_bfq2222.d) {
                this.z.e = bl_bfq2222;
                break;
            }
        }
        for (bfq bl_bfq22222 : this.y.f) {
            if (bl_bfq22222.d) {
                this.z.f = bl_bfq22222;
                return;
            }
        }
    }

    private void x() {
        if (this.z.d.a.equals(Constants.VIA_RESULT_SUCCESS) && this.z.e.a.equals(Constants.STR_EMPTY) && this.z.f.a.equals(Constants.VIA_RESULT_SUCCESS)) {
            this.l.setTextColor(getResources().getColor(2131100856));
            this.l.a(0, 0, 2131100856, 0);
            return;
        }
        this.l.setTextColor(fnd.a(this, 2131100837));
        this.l.a(0, 0, 2131100837, 0);
    }

    public void a(final meq bl_meq) {
        if (bl_meq instanceof bfm.a) {
            ((bfm.a) bl_meq).a.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ BangumiCategoryIndexActivity b;

                public void onClick(View view) {
                    if (view.getTag() instanceof Bangumi) {
                        Bangumi bangumi = (Bangumi) view.getTag();
                        b.a(bangumi, bl_meq.g(), BangumiCategoryIndexActivity.a[this.b.p()], this.b.t, this.b.z);
                        if (this.b.b) {
                            b.a(bangumi);
                        } else {
                            b.b(bangumi);
                        }
                        bcc.c(view.getContext(), bangumi.seasonId, 3);
                    }
                }
            });
        }
    }

    private void y() {
        if (this.m != null) {
            this.m.setVisibility(0);
            this.m.a();
            this.n.setVisibility(8);
        }
    }

    private void z() {
        if (this.m != null) {
            this.m.b();
            this.m.setVisibility(4);
            this.n.setVisibility(8);
        }
    }

    private void A() {
        if (this.m != null) {
            this.m.setVisibility(0);
            this.m.c();
            this.n.setVisibility(8);
        }
    }

    private void B() {
        b.c();
        if (this.m != null) {
            this.m.b();
            this.m.setVisibility(0);
            this.m.setImageResource(2131234237);
            this.m.a(2131690090);
            this.n.setVisibility(0);
        }
    }

    public BangumiApiService i() {
        if (this.E == null) {
            this.E = (BangumiApiService) gnd.a(BangumiApiService.class);
        }
        return this.E;
    }
}
