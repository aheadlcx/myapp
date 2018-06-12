package bili.bl;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.l;
import android.support.v7.widget.RecyclerView.u;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMasterSearchResult;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMasterSearchResult.LiveRoomResult;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.widget.RoundCardFrameLayout;

/* compiled from: BL */
public class efp extends fkt {
    public static final String a = hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 114, (byte) 106, (byte) 119, (byte) 97});
    public static final String b = hae.a(new byte[]{(byte) 113, (byte) 106, (byte) 113, (byte) 100, (byte) 105});
    private static int c = FragmentTransaction.TRANSIT_ENTER_MASK;
    private RecyclerView d;
    private View e;
    private ImageView f;
    private c g;
    private int h;
    private String i;
    private boolean j = false;
    private int k = 1;
    private boolean l = true;
    private boolean m = false;
    private boolean n = false;

    /* compiled from: BL */
    public static class a implements fit<Fragment> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Fragment a(fjg bl_fjg) {
            efp bl_efp = new efp();
            bl_efp.setArguments(bl_fjg.b);
            return bl_efp;
        }
    }

    /* compiled from: BL */
    class b extends u {
        final /* synthetic */ efp n;

        public b(efp bl_efp, ViewGroup viewGroup) {
            this.n = bl_efp;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(2131428097, viewGroup, false));
        }

        public void a(boolean z, boolean z2, boolean z3) {
            if (!z) {
                A();
            } else if (z2) {
                B();
            } else if (z3) {
                a();
            } else {
                b();
            }
        }

        private void a() {
            if (this.a != null) {
                this.a.setOnClickListener(null);
                this.a.setVisibility(0);
                this.a.findViewById(2131298656).setVisibility(0);
                ((TextView) this.a.findViewById(2131300554)).setText(2131692764);
            }
        }

        private void b() {
            if (this.a != null) {
                this.a.setVisibility(8);
            }
        }

        private void A() {
            if (this.a != null) {
                this.a.setOnClickListener(null);
                this.a.setVisibility(0);
                this.a.findViewById(2131298656).setVisibility(8);
                ((TextView) this.a.findViewById(2131300554)).setText(2131693749);
            }
        }

        private void B() {
            if (this.a != null) {
                this.a.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.n.i();
                    }
                });
                this.a.setVisibility(0);
                this.a.findViewById(2131298656).setVisibility(8);
                ((TextView) this.a.findViewById(2131300554)).setText(2131692762);
            }
        }
    }

    /* compiled from: BL */
    class c extends android.support.v7.widget.RecyclerView.a<u> {
        List<LiveRoomResult> a = new ArrayList();
        final /* synthetic */ efp b;

        public c(efp bl_efp) {
            this.b = bl_efp;
        }

        public u b(ViewGroup viewGroup, int i) {
            if (i == efp.c) {
                return new b(this.b, viewGroup);
            }
            return new d(this.b, viewGroup);
        }

        public void a(u uVar, int i) {
            if (uVar instanceof d) {
                ((d) uVar).a((LiveRoomResult) this.a.get(i));
            } else if (uVar instanceof b) {
                ((b) uVar).a(this.b.l, this.b.n, this.b.m);
            }
        }

        public int a() {
            return this.a.isEmpty() ? 0 : this.a.size() + 1;
        }

        public int b(int i) {
            if (this.a.isEmpty() || i != this.a.size()) {
                return super.b(i);
            }
            return efp.c;
        }

        public long f_(int i) {
            if (i < this.a.size()) {
                return ((LiveRoomResult) this.a.get(i)).roomId;
            }
            return -1;
        }
    }

    /* compiled from: BL */
    class d extends u {
        ImageView n = ((ImageView) ButterKnife.a(this.a, 2131297178));
        TextView o = ((TextView) ButterKnife.a(this.a, 2131300682));
        TextView p = ((TextView) ButterKnife.a(this.a, 2131300448));
        TextView q = ((TextView) ButterKnife.a(this.a, 2131301037));
        TextView r = ((TextView) ButterKnife.a(this.a, 2131298262));
        TintImageView s = ((TintImageView) ButterKnife.a(this.a, 2131298861));
        OnClickListener t = new OnClickListener(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Object tag = view.getTag();
                if (tag instanceof LiveRoomResult) {
                    Context a = fnd.a(view.getContext());
                    if (a != null) {
                        LiveRoomResult liveRoomResult = (LiveRoomResult) tag;
                        BiliLiveRoomInfo biliLiveRoomInfo = new BiliLiveRoomInfo();
                        biliLiveRoomInfo.mRoomId = (int) liveRoomResult.roomId;
                        biliLiveRoomInfo.mAttention = liveRoomResult.online;
                        biliLiveRoomInfo.mFace = liveRoomResult.cover;
                        biliLiveRoomInfo.mUname = liveRoomResult.name;
                        if (view.getTag(2131298587) == null || !((Boolean) view.getTag(2131298587)).booleanValue()) {
                            a.startActivity(drb.a(a, biliLiveRoomInfo, 23008));
                        } else {
                            a.startActivity(drb.a(a, biliLiveRoomInfo, 23007));
                        }
                    }
                }
            }
        };
        final /* synthetic */ efp u;

        public d(efp bl_efp, ViewGroup viewGroup) {
            this.u = bl_efp;
            super(LayoutInflater.from(viewGroup.getContext()).inflate(2131428666, viewGroup, false));
        }

        public void a(LiveRoomResult liveRoomResult) {
            if (liveRoomResult != null) {
                boolean z;
                ForegroundColorSpan foregroundColorSpan;
                CharSequence spannableStringBuilder;
                fci.g().a(liveRoomResult.cover, this.n);
                this.o.setText(liveRoomResult.title);
                if (liveRoomResult.name != null) {
                    this.q.setText(liveRoomResult.name);
                } else {
                    this.q.setText("...");
                }
                if (this.u.j) {
                    try {
                        int parseInt = Integer.parseInt(this.u.i);
                        if (((long) parseInt) == liveRoomResult.roomId || parseInt == liveRoomResult.shortId) {
                            z = true;
                            if (z) {
                                foregroundColorSpan = new ForegroundColorSpan(this.u.getResources().getColor(2131100837));
                                spannableStringBuilder = new SpannableStringBuilder("\u623f\u95f4\u53f7\uff1a" + this.u.i);
                                spannableStringBuilder.setSpan(foregroundColorSpan, 0, spannableStringBuilder.length(), 18);
                                this.p.setText(spannableStringBuilder);
                            } else if (liveRoomResult.areaName == null) {
                                this.p.setText(liveRoomResult.areaName);
                            } else {
                                this.p.setText(this.a.getResources().getString(2131692512));
                            }
                            this.r.setText(com.a(liveRoomResult.online, "0"));
                            this.a.setTag(liveRoomResult);
                            this.a.setTag(2131298587, Boolean.valueOf(z));
                        }
                    } catch (Exception e) {
                        z = false;
                    }
                }
                z = false;
                if (z) {
                    foregroundColorSpan = new ForegroundColorSpan(this.u.getResources().getColor(2131100837));
                    spannableStringBuilder = new SpannableStringBuilder("\u623f\u95f4\u53f7\uff1a" + this.u.i);
                    spannableStringBuilder.setSpan(foregroundColorSpan, 0, spannableStringBuilder.length(), 18);
                    this.p.setText(spannableStringBuilder);
                } else if (liveRoomResult.areaName == null) {
                    this.p.setText(this.a.getResources().getString(2131692512));
                } else {
                    this.p.setText(liveRoomResult.areaName);
                }
                this.r.setText(com.a(liveRoomResult.online, "0"));
                this.a.setTag(liveRoomResult);
                this.a.setTag(2131298587, Boolean.valueOf(z));
            } else {
                this.a.setTag(null);
            }
            this.a.setOnClickListener(this.t);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.i = arguments.getString(hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 114, (byte) 106, (byte) 119, (byte) 97}));
            this.h = arguments.getInt(hae.a(new byte[]{(byte) 113, (byte) 106, (byte) 113, (byte) 100, (byte) 105}), 0);
            this.j = a(this.i);
        }
        this.k = 1;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(2131428627, viewGroup, false);
        this.d = (RecyclerView) inflate.findViewById(2131299639);
        this.e = inflate.findViewById(2131298656);
        this.f = (ImageView) inflate.findViewById(2131298159);
        LayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.d(true);
        gridLayoutManager.a(new android.support.v7.widget.GridLayoutManager.c(this) {
            final /* synthetic */ efp b;

            {
                this.b = r1;
            }

            public int a(int i) {
                if (this.b.g.b(i) == efp.c) {
                    return 2;
                }
                return 1;
            }
        });
        this.d.setLayoutManager(gridLayoutManager);
        this.d.addItemDecoration(new mds(getResources().getDimensionPixelSize(2131165508) - RoundCardFrameLayout.a(getContext()), 2));
        this.g = new c(this);
        this.g.b(true);
        this.d.setAdapter(this.g);
        this.d.addOnScrollListener(new l(this) {
            final /* synthetic */ efp a;

            {
                this.a = r1;
            }

            public void a(RecyclerView recyclerView, int i, int i2) {
                int childCount = recyclerView.getChildCount();
                if (childCount > 0 && this.a.l && !this.a.m) {
                    if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) == recyclerView.getAdapter().a() - 1 && !this.a.m) {
                        this.a.i();
                    }
                }
            }
        });
        return inflate;
    }

    protected void setUserVisibleCompat(boolean z) {
        if (z) {
            g();
            if (this.h <= 0) {
                d();
            } else if (this.k == 1 && this.g.a() == 0) {
                b();
                h();
            }
        }
    }

    private void g() {
        dqo.a(new bl.dqv.a().a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114})).a());
    }

    private void h() {
        this.k = 1;
        this.l = true;
        this.n = false;
        a();
    }

    private void i() {
        this.k++;
        this.n = false;
        a();
    }

    protected void a() {
        if (!this.m && this.l) {
            this.m = true;
            if (this.g.a() != 0) {
                this.g.f();
            }
            doc.a().a(4, this.i, this.k, 20, new gnc<BiliLiveMasterSearchResult>(this) {
                final /* synthetic */ efp a;

                {
                    this.a = r1;
                }

                public /* synthetic */ void b(@Nullable Object obj) {
                    a((BiliLiveMasterSearchResult) obj);
                }

                public void a(@Nullable BiliLiveMasterSearchResult biliLiveMasterSearchResult) {
                    this.a.m = false;
                    this.a.n = false;
                    if (biliLiveMasterSearchResult != null && biliLiveMasterSearchResult.items != null && !biliLiveMasterSearchResult.items.isEmpty()) {
                        this.a.a(biliLiveMasterSearchResult);
                    } else if (this.a.k == 1) {
                        this.a.l = false;
                        this.a.d();
                    } else {
                        this.a.l = false;
                        this.a.c();
                        this.a.g.f();
                    }
                }

                public void a(Throwable th) {
                    this.a.m = false;
                    if (this.a.k != 1) {
                        this.a.c();
                        this.a.n = true;
                        this.a.g.f();
                        return;
                    }
                    this.a.e();
                }

                public boolean a() {
                    return this.a.getContext() == null || this.a.getActivity() == null;
                }
            });
        }
    }

    private void a(BiliLiveMasterSearchResult biliLiveMasterSearchResult) {
        c();
        this.l = biliLiveMasterSearchResult.items.size() >= 20;
        if (this.k == 1) {
            this.g.a.clear();
        }
        this.g.a.addAll(biliLiveMasterSearchResult.items);
        this.g.f();
    }

    private boolean a(String str) {
        if (str == null || BuildConfig.VERSION_NAME.equals(str.trim())) {
            return false;
        }
        return str.matches(hae.a(new byte[]{(byte) 91, (byte) 94, (byte) 53, (byte) 40, (byte) 60, (byte) 88, (byte) 47, (byte) 33}));
    }

    void b() {
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        this.f.setImageResource(2131230832);
        ((AnimationDrawable) this.f.getDrawable()).start();
    }

    void c() {
        j();
        this.e.setVisibility(8);
        this.d.setVisibility(0);
    }

    void d() {
        j();
        this.e.setVisibility(0);
        this.f.setImageResource(2131234245);
        this.d.setVisibility(8);
    }

    void e() {
        j();
        this.e.setVisibility(0);
        this.d.setVisibility(8);
        this.f.setImageResource(2131234242);
    }

    private void j() {
        Drawable drawable = this.f.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
    }
}
