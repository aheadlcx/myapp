package bili2.bl;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.c;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.RecyclerView.u;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.category.CategoryMeta;
import tv.danmaku.bili.ui.category.VideoHolder;
import tv.danmaku.bili.ui.category.api.BiliVideoV2;
import tv.danmaku.bili.ui.category.api.CategoryIndex;
import tv.danmaku.bili.ui.category.api.CategoryIndex.Type;
import tv.danmaku.bili.ui.category.api.RegionApiManager;
import tv.danmaku.bili.ui.category.api.RegionRecommendVideo;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.e;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.f;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.g;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.j;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.l;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.m;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.n;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.o;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.q;
import tv.danmaku.bili.widget.RecyclerView;
import tv.danmaku.bili.widget.RoundCardFrameLayout;

/* compiled from: BL */
public class lcs extends BaseCategorySectionFragment {
    private CategoryMeta d;
    private int e;
    private long f = 0;
    private long g = 0;
    private boolean h;
    private boolean i;
    private RegionRecommendVideo j;
    private a k;
    private ViewGroup l;
    private gnc<RegionRecommendVideo> m = new gnc<RegionRecommendVideo>(this) {
        final /* synthetic */ lcs a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(Object obj) {
            a((RegionRecommendVideo) obj);
        }

        public boolean a() {
            return this.a.activityDie();
        }

        public void a(Throwable th) {
            this.a.z();
            this.a.f_();
        }

        public void a(RegionRecommendVideo regionRecommendVideo) {
            long j = 0;
            this.a.z();
            this.a.d();
            if (regionRecommendVideo == null) {
                gyq.c(this.a.getActivity(), 2131692121);
                return;
            }
            this.a.j = regionRecommendVideo;
            this.a.i = true;
            this.a.f = regionRecommendVideo.cTop > 0 ? regionRecommendVideo.cTop : 0;
            lcs bl_lcs = this.a;
            if (regionRecommendVideo.cBottom > 0) {
                j = regionRecommendVideo.cBottom;
            }
            bl_lcs.g = j;
            this.a.k.a(regionRecommendVideo);
            if (regionRecommendVideo.cards != null && !regionRecommendVideo.cards.isEmpty()) {
                for (CategoryIndex categoryIndex : regionRecommendVideo.cards) {
                    lhn.a(this.a.d.mTypeName, categoryIndex.title, categoryIndex.type, categoryIndex.cardId);
                }
            }
        }
    };
    private gnc<RegionRecommendVideo> n = new gnc<RegionRecommendVideo>(this) {
        final /* synthetic */ lcs a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(@Nullable Object obj) {
            a((RegionRecommendVideo) obj);
        }

        public boolean a() {
            return this.a.activityDie();
        }

        public void a(@Nullable RegionRecommendVideo regionRecommendVideo) {
            this.a.z();
            this.a.h = false;
            if (regionRecommendVideo == null || regionRecommendVideo.newVideo == null || regionRecommendVideo.newVideo.isEmpty()) {
                gyq.c(this.a.getActivity(), 2131693751);
                return;
            }
            if (regionRecommendVideo.cTop > 0) {
                this.a.f = regionRecommendVideo.cTop;
            }
            this.a.k.a(regionRecommendVideo, true);
        }

        public void a(Throwable th) {
            this.a.z();
            this.a.h = false;
            gyq.c(this.a.getActivity(), 2131692121);
        }
    };
    private gnc<RegionRecommendVideo> o = new gnc<RegionRecommendVideo>(this) {
        final /* synthetic */ lcs a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(@Nullable Object obj) {
            a((RegionRecommendVideo) obj);
        }

        public boolean a() {
            return this.a.activityDie();
        }

        public void a(@Nullable RegionRecommendVideo regionRecommendVideo) {
            this.a.l();
            this.a.h = false;
            if (regionRecommendVideo == null || regionRecommendVideo.newVideo == null || regionRecommendVideo.newVideo.isEmpty()) {
                this.a.i = false;
                this.a.n();
                return;
            }
            if (regionRecommendVideo.cBottom > 0) {
                this.a.g = regionRecommendVideo.cBottom;
            }
            if ((this.a.k.b() + regionRecommendVideo.newVideo.size()) % 2 != 0) {
                regionRecommendVideo.newVideo.remove(regionRecommendVideo.newVideo.size() - 1);
            }
            this.a.k.a(regionRecommendVideo, false);
        }

        public void a(Throwable th) {
            this.a.o();
            this.a.h = false;
        }
    };

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        static {
            try {
                a[Type.TOPIC_NEW.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[Type.ACTIVITY_NEW.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Type.RANK.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[Type.DAILY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[Type.CARD.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[Type.VIDEO_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[Type.SPECIAL_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[Type.TAG_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* compiled from: BL */
    static class a extends mee<q> {
        boolean a = true;
        b b;
        private CategoryMeta c;

        public /* synthetic */ void a(u uVar) {
            c((q) uVar);
        }

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public /* synthetic */ void c(u uVar) {
            a((q) uVar);
        }

        public /* synthetic */ void d(u uVar) {
            b((q) uVar);
        }

        a(CategoryMeta categoryMeta) {
            this.c = categoryMeta;
        }

        public q a(ViewGroup viewGroup, int i) {
            q a = lct.a(viewGroup, i, this.c.mTypeName);
            if (a instanceof VideoHolder) {
                ((VideoHolder) a).a(this.c);
            } else if (a instanceof lco) {
                this.b = (lco) a;
                ((lco) a).n = this.c.mTid;
            } else if (a instanceof lcw) {
                a.b(this.c);
            } else if (a instanceof m) {
                ((m) a).a(this.c);
            }
            return a;
        }

        public void a(q qVar, int i) {
            if (qVar instanceof lco) {
                this.b = (lco) qVar;
            }
            super.a((bl.mee.a) qVar, i);
        }

        public void a(q qVar) {
            super.c(qVar);
            if (qVar instanceof b) {
                if (this.b == null) {
                    this.b = (b) qVar;
                }
                if (this.a) {
                    a(this.b);
                    this.a = false;
                }
                this.b.B();
            }
        }

        public void b(q qVar) {
            super.d(qVar);
            if (qVar instanceof b) {
                ((b) qVar).D();
                this.b = null;
            }
        }

        public void c(q qVar) {
            super.a(qVar);
            if (qVar instanceof b) {
                ((b) qVar).D();
            }
        }

        private void a(b bVar) {
            if (bVar == null) {
                return;
            }
            if (bVar.A() == 1) {
                bVar.a(10000);
            } else if (bVar.A() > 1) {
                bVar.a(bVar.A() * 10);
            }
        }

        void a(RegionRecommendVideo regionRecommendVideo) {
            List list;
            if (regionRecommendVideo != null) {
                List arrayList = new ArrayList();
                arrayList.add(new lcp(regionRecommendVideo.getBannerList()));
                if (!(regionRecommendVideo.cards == null || regionRecommendVideo.cards.isEmpty())) {
                    a(arrayList, regionRecommendVideo.cards);
                }
                List arrayList2 = new ArrayList();
                if (!(regionRecommendVideo.recommend == null || regionRecommendVideo.recommend.isEmpty())) {
                    for (BiliVideoV2 biliVideoV2 : regionRecommendVideo.recommend) {
                        biliVideoV2.hotRecommend = true;
                        arrayList2.add(biliVideoV2);
                    }
                }
                if (!(regionRecommendVideo.newVideo == null || regionRecommendVideo.newVideo.isEmpty())) {
                    arrayList2.addAll(regionRecommendVideo.newVideo);
                }
                arrayList.add(new lcx(this.c, arrayList2));
                list = arrayList;
            } else {
                list = new ArrayList();
                list.add(new lcp(new ArrayList(0)));
            }
            c(list);
        }

        void a(List<mei> list, List<CategoryIndex> list2) {
            for (CategoryIndex categoryIndex : list2) {
                mei a = a(categoryIndex, Type.find(categoryIndex.type));
                if (a != null) {
                    list.add(a);
                }
            }
        }

        mei a(CategoryIndex categoryIndex, Type type) {
            switch (AnonymousClass8.a[type.ordinal()]) {
                case 1:
                    return new o(categoryIndex);
                case 2:
                    return new tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.a(categoryIndex);
                case 3:
                    return new g(categoryIndex);
                case 4:
                    return new e(categoryIndex);
                case 5:
                    return new f(categoryIndex);
                case 6:
                    return new j(categoryIndex);
                case 7:
                    return new l(categoryIndex);
                case 8:
                    return new n(categoryIndex);
                default:
                    return null;
            }
        }

        void a(@NonNull RegionRecommendVideo regionRecommendVideo, boolean z) {
            mei i = i(r() - 1);
            if (!(i instanceof lcx)) {
                lcx bl_lcx = new lcx(this.c, regionRecommendVideo.newVideo);
                b((mei) bl_lcx);
                d(false);
                a(bl_lcx.e(), bl_lcx.a());
            } else if (z) {
                ((lcx) i).b.addAll(0, regionRecommendVideo.newVideo);
                s();
            } else {
                int e = i.e() + i.a();
                ((lcx) i).b.addAll(regionRecommendVideo.newVideo);
                d(false);
                c(e, regionRecommendVideo.newVideo.size());
            }
        }

        int b() {
            mei i = i(r() - 1);
            if (i instanceof lcx) {
                return ((lcx) i).b == null ? 0 : ((lcx) i).b.size();
            } else {
                return 0;
            }
        }

        public void a(boolean z) {
            if (this.b != null) {
                if (z) {
                    this.b.B();
                } else {
                    this.b.D();
                }
            }
        }

        public void aL_() {
            super.aL_();
            if (this.b != null) {
                this.b.D();
                this.b = null;
            }
        }
    }

    public static lcs a(CategoryMeta categoryMeta) {
        lcs bl_lcs = new lcs();
        bl_lcs.setArguments(b(categoryMeta));
        return bl_lcs;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = getArguments().getInt(hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 113, (byte) 108, (byte) 97}), -1);
        this.d = (CategoryMeta) getArguments().getParcelable(hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 104, (byte) 96, (byte) 113, (byte) 100}));
        erv.a(this.e != -1);
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), c);
        gridLayoutManager.a(new c(this) {
            final /* synthetic */ lcs b;

            {
                this.b = r1;
            }

            public int a(int i) {
                int b = this.b.k.b(i);
                if (b == 4 || b == 11) {
                    return 1;
                }
                return lcs.c;
            }
        });
        gridLayoutManager.d(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        final int a = RoundCardFrameLayout.a(getContext());
        final int i = applyDimension;
        recyclerView.addItemDecoration(new mds(this, applyDimension, c) {
            final /* synthetic */ lcs c;

            public void a(Rect rect, View view, android.support.v7.widget.RecyclerView recyclerView, r rVar) {
                if (view != this.c.l) {
                    super.a(rect, view, recyclerView, rVar);
                    int j = recyclerView.getChildViewHolder(view).j();
                    if (j == 4 || j == 11) {
                        if (rect.left > 0) {
                            rect.left -= a;
                        }
                        if (rect.right > 0) {
                            rect.right -= a;
                        }
                        rect.bottom = i - a;
                        rect.top = -a;
                    } else if (j == 0) {
                        rect.bottom = 0;
                        rect.top = 0;
                        rect.right = 0;
                        rect.left = 0;
                    } else if (j == 3) {
                        j = (i / 4) * 5;
                        rect.top = j;
                        rect.right = j;
                        rect.left = j;
                        rect.bottom = i / 2;
                    } else if (j == 12) {
                        j = i;
                        rect.bottom = j;
                        rect.top = j;
                        rect.right = j;
                        rect.left = j;
                    } else {
                        if (rect.left > 0) {
                            rect.left -= a;
                        }
                        if (rect.right > 0) {
                            rect.right -= a;
                        }
                        rect.top /= 2;
                        rect.bottom /= 2;
                    }
                }
            }
        });
        recyclerView.addOnScrollListener(new android.support.v7.widget.RecyclerView.l(this) {
            final /* synthetic */ lcs a;

            {
                this.a = r1;
            }

            public void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
                int childCount = recyclerView.getChildCount();
                if (childCount > 0 && this.a.g()) {
                    if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) == recyclerView.getAdapter().a() - 1) {
                        this.a.k();
                    }
                }
            }
        });
        if (this.k == null) {
            this.k = new a((CategoryMeta) getArguments().getParcelable(hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 104, (byte) 96, (byte) 113, (byte) 100})));
        }
        this.l = (ViewGroup) LayoutInflater.from(recyclerView.getContext()).inflate(2131428097, recyclerView, false);
        men bl_men = new men(this.k);
        bl_men.b(this.l);
        recyclerView.setAdapter(bl_men);
        l();
    }

    private boolean g() {
        return !this.h && this.i;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        h();
        lhi.a(2, this.e, 1);
    }

    private void h() {
        d();
        l();
        A();
        RegionApiManager.b(this.e, this.m);
        lhn.e(this.d.mTypeName);
    }

    public void e() {
        if (this.j == null) {
            h();
        } else {
            j();
        }
        lhi.a(2, this.e, 2);
    }

    private void j() {
        if (!this.h) {
            A();
            this.h = true;
            l();
            RegionApiManager.a(this.e, true, this.f, this.n);
        }
        lhn.e(this.d.mTypeName);
    }

    private void k() {
        if (!this.h) {
            this.h = true;
            m();
            RegionApiManager.a(this.e, false, this.g, this.o);
        }
        lhn.e(this.d.mTypeName);
    }

    public void setUserVisibleCompat(boolean z) {
        if (this.k != null && this.k.a() > 0) {
            this.k.a(z);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.k.aL_();
    }

    private void l() {
        if (this.l != null) {
            this.l.setVisibility(8);
        }
    }

    private void m() {
        if (this.l != null) {
            this.l.setOnClickListener(null);
            this.l.setVisibility(0);
            this.l.findViewById(2131298656).setVisibility(0);
            ((TextView) this.l.findViewById(2131300554)).setText(2131692764);
        }
    }

    private void n() {
        if (this.l != null) {
            this.l.setOnClickListener(null);
            this.l.setVisibility(0);
            this.l.findViewById(2131298656).setVisibility(8);
            ((TextView) this.l.findViewById(2131300554)).setText(2131693749);
        }
    }

    private void o() {
        if (this.l != null) {
            this.l.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ lcs a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    this.a.k();
                }
            });
            this.l.setVisibility(0);
            this.l.findViewById(2131298656).setVisibility(8);
            ((TextView) this.l.findViewById(2131300554)).setText(2131692762);
        }
    }
}
