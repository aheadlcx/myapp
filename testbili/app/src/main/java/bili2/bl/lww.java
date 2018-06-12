package bili2.bl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.l;
import android.support.v7.widget.RecyclerView.u;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import bl.ktc.c;
import butterknife.ButterKnife;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail.Page;
import tv.danmaku.bili.ui.watchlater.api.WatchLaterItem;
import tv.danmaku.bili.ui.watchlater.api.WatchLaterList;
import tv.danmaku.bili.widget.LoadingImageView;

/* compiled from: BL */
public final class lww {
    private WatchLaterItem A;
    private int[] B = new int[]{2131233476, 2131233477, 2131233478};
    private int[] C = new int[]{2131696152, 2131696153, 2131696154};
    private l D = new l(this) {
        final /* synthetic */ lww a;

        {
            this.a = r1;
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
            super.a(recyclerView, i, i2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int n = linearLayoutManager.n();
            int p = linearLayoutManager.p();
            if (n != -1 && p != -1) {
                Object obj;
                int i3;
                u uVar;
                int i4;
                int i5;
                int b = this.a.h.b(n);
                if (i2 < 0) {
                    if (b == 2) {
                        obj = null;
                        for (i3 = n - 1; i3 >= 0; i3--) {
                            if (this.a.h.h(i3) instanceof WatchLaterItem) {
                                obj = this.a.h.h(i3);
                                break;
                            }
                        }
                        uVar = null;
                        for (i4 = n + 1; i4 <= p; i4++) {
                            if (this.a.h.h(i4) instanceof WatchLaterItem) {
                                uVar = recyclerView.findViewHolderForAdapterPosition(i4);
                                break;
                            }
                        }
                        if (!(uVar == null || this.a.k == null || ((double) uVar.a.getTop()) <= ((double) this.a.k.getMeasuredHeight()) * 2.5d)) {
                            this.a.u();
                            this.a.a((WatchLaterItem) obj);
                        }
                    } else if (b == 1) {
                        i5 = this.a.h.i();
                        if (i5 == -1) {
                            i5 = 0;
                        }
                        u findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i5);
                        if (!(findViewHolderForAdapterPosition == null || this.a.k == null || this.a.k.getMeasuredHeight() - findViewHolderForAdapterPosition.a.getBottom() >= 20)) {
                            this.a.k.setVisibility(8);
                        }
                    }
                }
                obj = b == 2 ? 1 : null;
                Object obj2 = 1;
                for (i4 = n + 1; i4 <= p; i4++) {
                    if (!(this.a.h.h(i4) instanceof Page)) {
                        obj2 = null;
                    }
                }
                if (obj != null && r1 != null && i2 > 0) {
                    this.a.u();
                    for (i3 = n - 1; i3 >= 0; i3--) {
                        obj = this.a.h.h(i3);
                        if (obj instanceof WatchLaterItem) {
                            this.a.a((WatchLaterItem) obj);
                            break;
                        }
                    }
                }
                if (this.a.k != null && this.a.k.isShown() && i2 > 0) {
                    for (i5 = n + 1; i5 <= p; i5++) {
                        if (this.a.h.h(i5) instanceof WatchLaterItem) {
                            uVar = recyclerView.findViewHolderForAdapterPosition(i5);
                            if (uVar != null && uVar.a.getTop() <= this.a.k.getMeasuredHeight()) {
                                this.a.v();
                                return;
                            }
                        }
                    }
                }
            }
        }
    };
    private OnClickListener E = new OnClickListener(this) {
        final /* synthetic */ lww a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            if (this.a.A != null) {
                this.a.v();
                this.a.h.a(this.a.h.a(this.a.A), this.a.A.pages);
                this.a.b();
            }
        }
    };
    private OnClickListener F = new OnClickListener(this) {
        final /* synthetic */ lww a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            lwx.a().b();
            this.a.a(lwx.a().e(), true);
        }
    };
    private bl.lwy.a G = new bl.lwy.a(this) {
        final /* synthetic */ lww a;

        {
            this.a = r1;
        }

        public void a(Page page) {
            if (this.a.i != null) {
                this.a.i.a(page);
            }
        }

        public void a(WatchLaterItem watchLaterItem) {
            this.a.w = this.a.h.a((Object) watchLaterItem);
            if (this.a.b != null) {
                this.a.b.setText(this.a.w + "/" + this.a.x);
            }
            if (this.a.i != null) {
                this.a.i.a(watchLaterItem);
            }
            this.a.v();
        }
    };
    private Context a;
    private TextView b;
    private ImageView c;
    private View d;
    private ViewGroup e;
    private RecyclerView f;
    private LoadingImageView g;
    private lwy h;
    private a i;
    private View j;
    private View k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private View q;
    private ImageView r;
    private View s;
    private View t;
    private TintImageView u;
    private TextView v;
    private int w;
    private int x;
    private List<gne> y = new ArrayList();
    private Runnable z;

    /* compiled from: BL */
    public interface a {
        int a();

        void a(Page page);

        void a(WatchLaterItem watchLaterItem);
    }

    public lww(@NonNull Context context, @NonNull a aVar) {
        this.a = context;
        this.i = aVar;
    }

    public void a(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    public void a(ViewGroup viewGroup) {
        this.b = (TextView) ButterKnife.a(viewGroup, 2131298250);
        this.c = (ImageView) ButterKnife.a(viewGroup, 2131296453);
        this.b.setText((this.w + 1) + "/" + this.x);
        viewGroup.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ lww a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.o();
            }
        });
    }

    private void o() {
        if (this.e.isShown()) {
            p();
        } else {
            r();
        }
    }

    public boolean a() {
        return this.e == null ? false : this.e.isShown();
    }

    public void a(BiliVideoDetail biliVideoDetail) {
        if (this.h != null) {
            this.h.a(biliVideoDetail);
            this.f.postDelayed(new Runnable(this) {
                final /* synthetic */ lww a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.h != null) {
                        this.a.h.b();
                    }
                }
            }, 500);
        }
    }

    private void p() {
        d(0);
        if (this.e != null) {
            this.e.animate().translationY((float) (-this.d.getHeight())).setDuration(200).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ lww a;

                {
                    this.a = r1;
                }

                public void onAnimationEnd(Animator animator) {
                    this.a.e.setVisibility(8);
                    this.a.f.setVisibility(8);
                    this.a.g.setVisibility(8);
                }
            }).start();
        }
        gxv.f(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 106, (byte) 118, (byte) 96}));
        fnw.a(blg.a(), hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 114, (byte) 100, (byte) 113, (byte) 102, (byte) 109, (byte) 108, (byte) 113, (byte) 105, (byte) 100, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113}), hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}), hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 106, (byte) 118, (byte) 96}));
    }

    private void q() {
        if (this.f != null) {
            this.f.setAdapter(null);
        }
        if (this.h != null) {
            this.h = null;
        }
    }

    public void a(boolean z) {
        if (this.h != null) {
            this.h.a(z);
        }
    }

    public void a(View view, ViewGroup viewGroup) {
        this.d = view;
        this.e = viewGroup;
        this.g = (LoadingImageView) ButterKnife.a(viewGroup, 2131298667);
        this.j = ButterKnife.a(viewGroup, 2131299641);
        this.k = ButterKnife.a(this.j, 2131300334);
        this.f = (RecyclerView) ButterKnife.a(this.j, 2131299639);
        this.s = ButterKnife.a(viewGroup, 2131299322);
        if (this.k != null) {
            this.l = (ImageView) ButterKnife.a(this.k, 2131297178);
            this.m = (TextView) ButterKnife.a(this.k, 2131300554);
            this.n = (TextView) ButterKnife.a(this.k, 2131300682);
            this.o = (TextView) ButterKnife.a(this.k, 2131299433);
            this.p = (TextView) ButterKnife.a(this.k, 2131301159);
            this.q = ButterKnife.a(this.k, 2131299956);
            this.r = (ImageView) ButterKnife.a(this.k, 2131296453);
            this.r.setOnClickListener(this.E);
        }
        if (this.f != null) {
            this.f.setItemAnimator(null);
            this.f.setLayoutManager(new LinearLayoutManager(this.a));
        }
    }

    public void a(Runnable runnable, final boolean z) {
        if (runnable != null) {
            this.z = runnable;
        }
        if (!this.e.isShown()) {
            this.e.setTranslationY((float) (-this.d.getHeight()));
            if (z) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(8);
            }
            this.e.animate().translationY(0.0f).setDuration(200).setInterpolator(new AccelerateInterpolator()).setListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ lww b;

                public void onAnimationEnd(Animator animator) {
                    this.b.e.setTranslationY(0.0f);
                    this.b.l();
                    if (z) {
                        this.b.d(-180);
                    }
                    this.b.s();
                }
            }).start();
            gxv.f("open");
            fnw.a(blg.a(), hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 114, (byte) 100, (byte) 113, (byte) 102, (byte) 109, (byte) 108, (byte) 113, (byte) 105, (byte) 100, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113}), hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}), "open");
        } else if (this.z != null) {
            this.f.post(this.z);
        }
    }

    private void d(int i) {
        if (this.c != null) {
            this.c.animate().rotation((float) i).setDuration(200).start();
        }
    }

    private void r() {
        a(null, true);
    }

    private void s() {
        this.y.add(mah.a(eva.a(this.a).j(), new gnc<WatchLaterList>(this) {
            final /* synthetic */ lww a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(Object obj) {
                a((WatchLaterList) obj);
            }

            public void a(WatchLaterList watchLaterList) {
                if (this.a.a != null) {
                    this.a.m();
                    if (watchLaterList == null || watchLaterList.watchLaterItems == null || watchLaterList.watchLaterItems.isEmpty()) {
                        esu.a(this.a.a, "\u6ca1\u6709\u6570\u636e", 0);
                        this.a.n();
                        return;
                    }
                    this.a.a(watchLaterList);
                    this.a.a(this.a.h.g());
                    if (this.a.z != null) {
                        this.a.f.postDelayed(this.a.z, 100);
                    }
                    this.a.b();
                }
            }

            public void a(Throwable th) {
                this.a.n();
                esu.a(this.a.a, "\u52a0\u8f7d\u5931\u8d25", 0);
            }
        }));
    }

    private void a(WatchLaterList watchLaterList) {
        if (this.h == null) {
            this.h = new lwy(this.i.a());
            this.h.a(this.G);
            this.f.setAdapter(this.h);
            this.f.setItemAnimator(new nm());
            this.f.addOnScrollListener(this.D);
            a(true);
            a(this.s, this.f);
        }
        this.f.setVisibility(0);
        this.h.a(watchLaterList.watchLaterItems);
    }

    private void a(View view, RecyclerView recyclerView) {
        if (recyclerView != null && view != null) {
            this.h = (lwy) recyclerView.getAdapter();
            this.t = view;
            lwx.a().a(this.h);
            t();
        }
    }

    private void t() {
        this.v = (TextView) ButterKnife.a(this.t, 2131300661);
        this.u = (TintImageView) ButterKnife.a(this.t, 2131298126);
        if (this.u != null) {
            this.u.setOnClickListener(this.F);
        }
        if (this.v != null) {
            this.v.setOnClickListener(this.F);
        }
        a(lwx.a().e(), false);
    }

    private void a(int i, boolean z) {
        if (this.u == null) {
            this.u = (TintImageView) ButterKnife.a(this.t, 2131298126);
        }
        if (this.v == null) {
            this.v = (TextView) ButterKnife.a(this.t, 2131300661);
        }
        this.u.setImageDrawable(this.u.getContext().getResources().getDrawable(this.B[i]));
        this.v.setText(this.v.getContext().getResources().getString(this.C[i]));
        if (z) {
            esu.a(this.t.getContext(), this.v.getContext().getResources().getString(this.C[i]), 0);
        }
    }

    public void b() {
        if (this.f != null && this.h != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f.getLayoutManager();
            int max = Math.max(this.h.h(), this.h.i());
            if (this.h.a() - max > 5) {
                linearLayoutManager.b(max - 1, 0);
            } else {
                linearLayoutManager.e(this.h.a() - 1);
            }
        }
    }

    public void a(int i) {
        if (this.h != null) {
            Object i2 = this.h.i(i);
            if (i2 != null) {
                this.w = this.h.a(i2);
                if (this.h.c() != 0) {
                    this.x = this.h.c();
                }
                this.b.setText(this.w + "/" + this.x);
                v();
            }
        }
    }

    public void a(View view) {
        if (view != null) {
            this.j = view;
            if (this.e != null && this.e.indexOfChild(this.j) == -1) {
                this.e.addView(this.j);
            }
        }
    }

    public void a(Page page) {
        if (this.h != null) {
            a(this.h.a(page));
        }
    }

    public View c() {
        if (this.j != null) {
            ViewParent parent = this.j.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.j);
            }
        }
        return this.j;
    }

    public boolean d() {
        return this.f != null && this.f.isShown();
    }

    public void e() {
        p();
    }

    public void f() {
        for (gne bl_gne : this.y) {
            if (bl_gne != null) {
                bl_gne.f();
            }
        }
    }

    public void g() {
        q();
    }

    public void h() {
        if (this.h != null) {
            this.h.f();
        }
    }

    public boolean a(int i, String str) {
        lxr.a().a(String.valueOf(i), this.a, str);
        return true;
    }

    public Object i() {
        return lwx.a().d();
    }

    public Object j() {
        return lwx.a().c();
    }

    public void a(mai bl_mai) {
        lwx.a().a(bl_mai);
    }

    public void a(Object obj) {
        if (this.h != null) {
            int i = this.h.i();
            Object h = this.h.h(i);
            if ((obj instanceof WatchLaterItem) && (h instanceof WatchLaterItem)) {
                this.h.a(i + 1, ((WatchLaterItem) h).pages);
            }
        }
    }

    public int k() {
        return lwx.a().e();
    }

    public void l() {
        if (this.g != null) {
            this.g.setVisibility(0);
            this.g.a();
        }
    }

    public void m() {
        if (this.g != null) {
            this.g.b();
            this.g.setVisibility(8);
        }
    }

    public void n() {
        if (this.g != null) {
            if (!this.g.isShown()) {
                this.g.setVisibility(0);
            }
            this.g.c();
        }
    }

    private void a(WatchLaterItem watchLaterItem) {
        if (watchLaterItem == null) {
            this.k.setVisibility(8);
            return;
        }
        int i = (!this.h.j() || c.a(blg.a())) ? 0 : 1;
        if (i != 0) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
        }
        this.A = watchLaterItem;
        fci.g().a(watchLaterItem.cover, this.l);
        this.n.setText(watchLaterItem.title);
        if (watchLaterItem.isInvalidVideo()) {
            this.m.setVisibility(0);
        } else {
            this.m.setVisibility(8);
        }
        if (watchLaterItem.isPageVideo()) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
        this.q.setVisibility(0);
        this.k.setBackgroundResource(2131100051);
        this.l.setAlpha(1.0f);
        this.n.setTextColor(ej.c(this.a, 2131101038));
        this.o.setTextColor(ej.c(this.k.getContext(), 2131101029));
        this.p.setText(this.A.count < 999 ? this.A.count + "P" : "999+");
        if (!watchLaterItem.isPageVideo() || watchLaterItem.page == null) {
            this.o.setText("\u6b63\u5728\u64ad\u653e");
        } else {
            this.o.setText(this.k.getContext().getString(2131696151, new Object[]{Integer.valueOf(watchLaterItem.page.pageNumber)}) + hae.a(new byte[]{(byte) 37, (byte) -23, (byte) -94, (byte) -84, (byte) -22, (byte) -109, (byte) -89, (byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79}));
        }
    }

    private void u() {
        if (!this.k.isShown()) {
            this.k.setVisibility(0);
            this.h.a(this.r, -180);
        }
    }

    private void v() {
        if (this.k.isShown()) {
            this.k.setVisibility(8);
        }
    }

    public boolean b(Object obj) {
        if (this.h != null) {
            return this.h.b(obj);
        }
        return true;
    }

    public void b(int i) {
        if (this.h != null) {
            this.h.c(i);
        }
    }

    public void c(int i) {
        if (this.h != null) {
            this.h.g(i);
        }
    }
}
