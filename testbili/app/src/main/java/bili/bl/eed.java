package bili.bl;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.RecyclerView.u;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bilibili.bilibililive.uibase.widget.MeasurableMinWidthTextView;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveOperationRank;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveOperationRank.BiliLiveOperation;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: BL */
public class eed extends edx implements bl.dyd.a {
    private static final String h = hae.a(new byte[]{(byte) 74, (byte) 117, (byte) 96, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 81, (byte) 124, (byte) 117, (byte) 96});
    private c i;
    private BiliLiveOperationRank j;
    private String k;
    private int l;
    private gnc<BiliLiveOperationRank> m = new gnc<BiliLiveOperationRank>(this) {
        final /* synthetic */ eed a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(Object obj) {
            a((BiliLiveOperationRank) obj);
        }

        public void a(Throwable th) {
            this.a.z();
            this.a.e();
            if (this.a.j == null) {
                this.a.d();
            }
        }

        public void a(BiliLiveOperationRank biliLiveOperationRank) {
            this.a.z();
            this.a.e();
            if (biliLiveOperationRank != null) {
                this.a.j = biliLiveOperationRank;
                if (this.a.l()) {
                    this.a.a(this.a.j);
                }
                this.a.i.a(this.a.j, this.a.l());
                if (this.a.j() && this.a.h() != null) {
                    this.a.h().setVisibility(8);
                }
                if (this.a.j.mList == null || this.a.j.mList.size() == 0) {
                    this.a.f();
                }
            }
        }

        public boolean a() {
            return this.a.getActivity() == null || this.a.isDetached();
        }
    };

    /* compiled from: BL */
    static class a extends u {
        ImageView n;
        TextView o;
        MeasurableMinWidthTextView p;
        ImageView q;
        TextView r;

        public a(View view) {
            super(view);
            this.n = (ImageView) view.findViewById(2131298111);
            this.o = (TextView) view.findViewById(2131299536);
            this.p = (MeasurableMinWidthTextView) view.findViewById(2131299013);
            this.q = (ImageView) view.findViewById(2131298112);
            this.r = (TextView) view.findViewById(2131298903);
        }
    }

    /* compiled from: BL */
    static class b extends a {
        public b(View view) {
            super(view);
        }

        static b a(ViewGroup viewGroup) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(2131428349, viewGroup, false));
        }

        public void a(BiliLiveOperation biliLiveOperation, boolean z, String str, boolean z2) {
            if (biliLiveOperation != null) {
                if (z2) {
                    this.n.setVisibility(8);
                    this.o.setVisibility(0);
                    this.o.setTextColor(-1);
                    this.o.setText(String.format(Locale.getDefault(), "%s", new Object[]{Integer.valueOf(biliLiveOperation.mRank)}));
                } else {
                    this.a.setPadding(blg.a().getResources().getDimensionPixelSize(2131165508), blg.a().getResources().getDimensionPixelSize(2131165563), blg.a().getResources().getDimensionPixelSize(2131165500), blg.a().getResources().getDimensionPixelSize(2131165563));
                    this.n.setVisibility(0);
                    this.o.setVisibility(4);
                    this.n.setImageDrawable(null);
                }
                if (biliLiveOperation.mImg1 != null) {
                    fci.g().a(biliLiveOperation.mImg1.mSrc, this.n);
                }
                this.r.setText(biliLiveOperation.mUname);
                if (z2) {
                    this.r.setTextColor(-1);
                }
                this.q.setImageDrawable(null);
                if (biliLiveOperation.mImg2 != null) {
                    fci.g().a(biliLiveOperation.mImg2.mSrc, this.q);
                }
                this.p.setText(String.valueOf(biliLiveOperation.mScore));
                this.p.setStaffStr(str);
                if (z2) {
                    Drawable colorDrawable;
                    this.p.setTextColor(-1);
                    View view = this.a;
                    if (z) {
                        colorDrawable = new ColorDrawable(blg.a().getResources().getColor(2131100039));
                    } else {
                        colorDrawable = c.b;
                    }
                    view.setBackgroundDrawable(colorDrawable);
                    return;
                }
                this.a.setBackgroundDrawable(z ? c.c : c.b);
            }
        }
    }

    /* compiled from: BL */
    static class c extends edw {
        private List<BiliLiveOperation> f = new ArrayList();
        private BiliLiveOperationRank g;
        private String h = BuildConfig.VERSION_NAME;
        private boolean i;

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public c(Context context, boolean z) {
            super(context);
            this.i = z;
        }

        public a a(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return b.a(viewGroup);
            }
            if (i == 1) {
                return d.a(viewGroup);
            }
            return null;
        }

        public void a(u uVar, int i) {
            if (uVar instanceof b) {
                ((b) uVar).a(c(i), b() + -1 == i, this.h, this.i);
            } else if (uVar instanceof d) {
                ((d) uVar).a(c(i), b(), this.h, this.i);
            }
        }

        public int b(int i) {
            if (i < this.f.size()) {
                return 0;
            }
            return 1;
        }

        private BiliLiveOperation c(int i) {
            if (i < this.f.size()) {
                return (BiliLiveOperation) this.f.get(i);
            }
            return c();
        }

        public int a() {
            return (b() > this.f.size() ? 1 : 0) + this.f.size();
        }

        public void a(BiliLiveOperationRank biliLiveOperationRank, boolean z) {
            this.g = biliLiveOperationRank;
            this.f.clear();
            if (!(this.g == null || this.g.mList == null)) {
                if (!z) {
                    this.f.addAll(this.g.mList);
                } else if (this.g.mList.size() > 3) {
                    this.f.addAll(this.g.mList.subList(3, this.g.mList.size()));
                }
            }
            this.h = BuildConfig.VERSION_NAME;
            int a = a();
            for (int i = 0; i < a; i++) {
                BiliLiveOperation c = c(i);
                if (String.valueOf(c.mScore).length() > this.h.length()) {
                    this.h = String.valueOf(c.mScore);
                }
            }
            this.h += "fk";
            f();
        }

        private int b() {
            return this.g == null ? 0 : this.g.mRank;
        }

        private BiliLiveOperation c() {
            if (this.g == null) {
                return null;
            }
            BiliLiveOperation biliLiveOperation = new BiliLiveOperation();
            biliLiveOperation.mUname = this.g.mUname;
            biliLiveOperation.mScore = this.g.mScore;
            biliLiveOperation.mImg2 = ((BiliLiveOperation) this.g.mList.get(this.g.mList.size() - 1)).mImg2;
            return biliLiveOperation;
        }
    }

    /* compiled from: BL */
    static class d extends a {
        public d(View view) {
            super(view);
        }

        static d a(ViewGroup viewGroup) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(2131428349, viewGroup, false));
        }

        public void a(BiliLiveOperation biliLiveOperation, int i, String str, boolean z) {
            if (biliLiveOperation != null) {
                this.n.setVisibility(4);
                this.o.setVisibility(0);
                this.o.setText(i > 100000 ? blg.a().getString(2131692523) : String.valueOf(i));
                this.r.setTextColor(edw.d);
                this.r.setText(biliLiveOperation.mUname);
                this.q.setImageDrawable(null);
                if (biliLiveOperation.mImg2 != null) {
                    fci.g().a(biliLiveOperation.mImg2.mSrc, this.q);
                }
                this.p.setText(String.valueOf(biliLiveOperation.mScore));
                this.p.setStaffStr(str);
            }
        }
    }

    public static eed a(String str, int i) {
        eed bl_eed = new eed();
        Bundle bundle = new Bundle();
        bundle.putString(hae.a(new byte[]{(byte) 74, (byte) 117, (byte) 96, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 81, (byte) 124, (byte) 117, (byte) 96}), str);
        bundle.putInt(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 63, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 63, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 97}), i);
        bl_eed.setArguments(bundle);
        return bl_eed;
    }

    public static eed a(String str, int i, boolean z, boolean z2) {
        eed bl_eed = new eed();
        Bundle bundle = new Bundle();
        bundle.putString(hae.a(new byte[]{(byte) 74, (byte) 117, (byte) 96, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 81, (byte) 124, (byte) 117, (byte) 96}), str);
        bundle.putInt(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 63, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 63, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 97}), i);
        bundle.putBoolean(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 63, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 63, (byte) 108, (byte) 118, (byte) 76, (byte) 107, (byte) 65, (byte) 108, (byte) 100, (byte) 105, (byte) 106, (byte) 98}), z);
        bundle.putBoolean(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 63, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 63, (byte) 108, (byte) 118, (byte) 73, (byte) 100, (byte) 107, (byte) 97}), z2);
        bl_eed.setArguments(bundle);
        return bl_eed;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.k = arguments.getString(hae.a(new byte[]{(byte) 74, (byte) 117, (byte) 96, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 81, (byte) 124, (byte) 117, (byte) 96}));
            this.l = arguments.getInt(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 63, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 63, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 108, (byte) 97}));
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.i = new c(getActivity(), l());
        this.e.setAdapter(this.i);
    }

    protected CharSequence c() {
        CharSequence append = new SpannableStringBuilder().append(getString(2131692537));
        append.setSpan(g(), 3, 7, 33);
        return append;
    }

    public void ab_() {
        if (isAdded()) {
            c(false);
            b(false);
            return;
        }
        c(true);
    }

    protected void b(boolean z) {
        doc.a().a(this.l, this.k, doc.a(getApplicationContext()), this.m);
    }

    private void a(BiliLiveOperationRank biliLiveOperationRank) {
        LayoutParams layoutParams;
        this.g.removeAllViews();
        LayoutParams layoutParams2;
        if (m()) {
            layoutParams2 = new LinearLayout.LayoutParams(getContext().getResources().getDimensionPixelSize(2131165561), -2);
            layoutParams2.gravity = 1;
            layoutParams = layoutParams2;
        } else {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 1;
            layoutParams = layoutParams2;
        }
        if (biliLiveOperationRank.mList != null && biliLiveOperationRank.mList.size() > 0) {
            List subList = biliLiveOperationRank.mList.size() > 3 ? biliLiveOperationRank.mList.subList(0, 3) : biliLiveOperationRank.mList;
            for (int i = 0; i < subList.size(); i++) {
                View bl_egl = new egl(getContext());
                ((BiliLiveOperation) subList.get(i)).mRank = i + 1;
                bl_egl.setTopRankView((BiliLiveOperation) subList.get(i));
                bl_egl.setLayoutParams(layoutParams);
                if (i == 1) {
                    this.g.addView(bl_egl, 0);
                } else {
                    this.g.addView(bl_egl);
                }
            }
        }
        this.g.requestLayout();
    }
}
