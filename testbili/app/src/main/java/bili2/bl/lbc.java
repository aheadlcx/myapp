package bili2.bl;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.RecyclerView.u;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bilibili.lib.image.ScalableImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tv.danmaku.bili.ui.author.FavoriteBoxVideosActivity;
import tv.danmaku.bili.ui.author.api.BiliSpaceFavoriteBox;
import tv.danmaku.bili.ui.favorite.api.BiliFavoriteBox;
import tv.danmaku.bili.ui.favorite.api.BiliFavoriteBox.Video;
import tv.danmaku.bili.ui.favorite.api.BiliFavoriteVideoApiService;

/* compiled from: BL */
public class lbc extends kyh implements lbk {
    private static final String f = hae.a(new byte[]{(byte) 68, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 67, (byte) 100, (byte) 115, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 96, (byte) 71, (byte) 106, (byte) 125, (byte) 73, (byte) 108, (byte) 118, (byte) 113, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    gnc<List<BiliFavoriteBox>> e = new gnc<List<BiliFavoriteBox>>(this) {
        final /* synthetic */ lbc a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(Object obj) {
            a((List) obj);
        }

        public boolean a() {
            return this.a.getActivity() == null || this.a.m() == null;
        }

        public void a(Throwable th) {
            FragmentActivity activity = this.a.getActivity();
            if (!mbc.a(th) || activity == null) {
                this.a.l = false;
                this.a.g();
                if (this.a.h == null) {
                    return;
                }
                if (this.a.h.a.size() > 0) {
                    this.a.e();
                    return;
                } else {
                    this.a.n();
                    return;
                }
            }
            mbc.a(activity, false);
            activity.onBackPressed();
        }

        public void a(List<BiliFavoriteBox> list) {
            this.a.g();
            this.a.l = false;
            if (this.a.h != null && this.a.h.a != null) {
                this.a.h.a.clear();
                if (list == null || list.isEmpty()) {
                    this.a.d();
                    return;
                }
                this.a.h.a.addAll(list);
                this.a.h.f();
            }
        }
    };
    private long g;
    private b h;
    private BiliFavoriteVideoApiService i;
    private lap<BiliSpaceFavoriteBox> j;
    private Handler k;
    private boolean l = false;

    /* compiled from: BL */
    public static class a implements fit<bl.mep.a> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public bl.mep.a a(fjg bl_fjg) {
            return lbc.a(bl_fjg.b.getLong("mid"));
        }
    }

    /* compiled from: BL */
    static class b extends android.support.v7.widget.RecyclerView.a<u> {
        private List<BiliFavoriteBox> a = new ArrayList();
        private OnClickListener b;

        b() {
        }

        public u b(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131428272, viewGroup, false);
            inflate.setOnClickListener(this.b);
            return new c(inflate);
        }

        public void a(u uVar, int i) {
            a((c) uVar, i);
        }

        private void a(c cVar, int i) {
            BiliFavoriteBox biliFavoriteBox = (BiliFavoriteBox) this.a.get(i);
            if (biliFavoriteBox != null) {
                cVar.o.setText(biliFavoriteBox.mName);
                cVar.p.setText(biliFavoriteBox.isPublic() ? 2131691561 : 2131691560);
                cVar.q.setText(String.valueOf(biliFavoriteBox.mCount));
                if (biliFavoriteBox.mCount == 0) {
                    fci.g().a(2131233062, cVar.n);
                } else if (biliFavoriteBox.getCovers() != null && biliFavoriteBox.getCovers().size() > 0) {
                    fci.g().a(((Video) biliFavoriteBox.getCovers().get(0)).cover, cVar.n);
                }
            }
            cVar.a.setTag(biliFavoriteBox);
            cVar.a.setTag(2131298251, Integer.valueOf(i));
        }

        public int a() {
            return this.a == null ? 0 : this.a.size();
        }
    }

    /* compiled from: BL */
    static class c extends u {
        ScalableImageView n;
        TextView o;
        TextView p;
        TextView q;

        c(View view) {
            super(view);
            this.n = (ScalableImageView) view.findViewById(2131298111);
            this.o = (TextView) view.findViewById(2131300682);
            this.p = (TextView) view.findViewById(2131299428);
            this.q = (TextView) view.findViewById(2131301159);
        }
    }

    public static lbc a(long j) {
        lbc bl_lbc = new lbc();
        Bundle bundle = new Bundle();
        bundle.putLong("mid", j);
        bl_lbc.setArguments(bundle);
        return bl_lbc;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.k = new Handler(Looper.getMainLooper());
        if (getArguments() != null) {
            this.g = getArguments().getLong("mid");
        }
        this.i = (BiliFavoriteVideoApiService) gnd.a(BiliFavoriteVideoApiService.class);
        this.h = new b();
        this.h.b = new OnClickListener(this) {
            final /* synthetic */ lbc a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Object tag = view.getTag();
                if (tag instanceof BiliFavoriteBox) {
                    BiliFavoriteBox biliFavoriteBox = (BiliFavoriteBox) tag;
                    hal.a(this.a.getApplicationContext(), hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 90, Byte.MAX_VALUE, (byte) 106, (byte) 107, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 115, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125}), String.valueOf(view.getTag(2131298251)));
                    this.a.startActivity(FavoriteBoxVideosActivity.a(this.a.getActivity(), biliFavoriteBox, 1));
                    lat.a(view.getContext(), this.a.g, hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 115, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 115, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                    law.a(bl.law.a.a("5", null, null, String.valueOf(biliFavoriteBox.mId)));
                }
            }
        };
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131165508);
        gridLayoutManager.d(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.h);
        recyclerView.addItemDecoration(new mds(this, dimensionPixelSize, 2) {
            final /* synthetic */ lbc a;

            public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
                if (view != this.a.a) {
                    super.a(rect, view, recyclerView, rVar);
                }
            }
        });
        LayoutParams layoutParams = (LayoutParams) this.b.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.topMargin = (int) TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics());
        this.b.requestLayout();
    }

    public void h() {
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        p().setEnabled(false);
        if (getActivity() instanceof lao) {
            this.j = ((lao) getActivity()).r();
        }
        if (this.j == null) {
            f();
        }
        if (this.j != null) {
            a(this.j);
        }
    }

    private void l() {
        if (!this.l) {
            f();
            this.l = true;
            this.i.getStatedBoxList(eva.a(getContext()).j(), this.g, 0).a(this.e);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            lat.a(getActivity(), this.g, hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 115, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114}));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.k.removeCallbacksAndMessages(null);
    }

    public void i() {
        super.i();
        l();
    }

    public Fragment a() {
        return this;
    }

    public void a(lao bl_lao) {
        if (bl_lao != null) {
            a(bl_lao.r());
        }
    }

    public void a(lap<BiliSpaceFavoriteBox> bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox) {
        this.j = bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox;
        if (getView() != null && bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox != null) {
            BiliSpaceFavoriteBox biliSpaceFavoriteBox = (BiliSpaceFavoriteBox) bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox.a;
            g();
            if (eva.a(getContext()).i() == this.g) {
                if (bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox.d) {
                    n();
                } else if (bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox.c || biliSpaceFavoriteBox == null) {
                    o();
                } else {
                    a(biliSpaceFavoriteBox);
                }
            } else if (!bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox.b) {
                if (!this.b.isShown()) {
                    this.b.setVisibility(0);
                }
                this.b.setImageResource(2131234261);
                this.b.a(2131694991);
            } else if (bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox.d) {
                n();
            } else if (bl_lap_tv_danmaku_bili_ui_author_api_BiliSpaceFavoriteBox.c || biliSpaceFavoriteBox == null) {
                o();
            } else {
                a(biliSpaceFavoriteBox);
            }
        }
    }

    private void a(BiliSpaceFavoriteBox biliSpaceFavoriteBox) {
        Collection collection = biliSpaceFavoriteBox.boxes;
        this.h.a.clear();
        this.h.a.addAll(collection);
        this.h.f();
    }

    public void o() {
        super.o();
        this.b.setImageResource(2131234236);
        this.b.a(2131693749);
    }
}
