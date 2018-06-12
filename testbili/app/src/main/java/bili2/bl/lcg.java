package bili2.bl;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bilibili.bangumi.api.uniform.BangumiUniformEpisode;
import com.bilibili.bangumi.ui.detail.BangumiDetailActivity;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.bilibili.videodownloader.model.VideoDownloadSeasonEpEntry;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: BL */
public class lcg extends a<bgs> {
    protected static final Comparator<BangumiUniformEpisode> a = new Comparator<BangumiUniformEpisode>() {
        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((BangumiUniformEpisode) obj, (BangumiUniformEpisode) obj2);
        }

        public int a(BangumiUniformEpisode bangumiUniformEpisode, BangumiUniformEpisode bangumiUniformEpisode2) {
            if (bangumiUniformEpisode == null || bangumiUniformEpisode2 == null) {
                return 1;
            }
            long a = VideoDownloadSeasonEpEntry.a(bangumiUniformEpisode2.index) - VideoDownloadSeasonEpEntry.a(bangumiUniformEpisode.index);
            if (a == 0) {
                return bangumiUniformEpisode.hashCode() - bangumiUniformEpisode2.hashCode();
            }
            if (a >= 0) {
                return -1;
            }
            return 1;
        }
    };
    private List<BangumiUniformEpisode> b = new ArrayList();
    private lch.a c = null;
    private List<BangumiUniformEpisode> d = new ArrayList();
    private boolean e = false;
    private LayoutInflater f;
    private WeakReference<lch> g;
    private OnClickListener h = new OnClickListener(this) {
        final /* synthetic */ lcg a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            Object tag = view.getTag();
            if (tag instanceof BangumiUniformEpisode) {
                BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) tag;
                BangumiDetailActivity bangumiDetailActivity = (BangumiDetailActivity) fnd.a(view.getContext());
                if (bangumiDetailActivity.b(bangumiUniformEpisode)) {
                    VideoDownloadEntry videoDownloadEntry = (VideoDownloadEntry) bangumiDetailActivity.s().a(bangumiUniformEpisode.epid);
                    if (videoDownloadEntry == null || videoDownloadEntry.C()) {
                        boolean z;
                        TextView textView = (TextView) ButterKnife.a(view, 2131300682);
                        lcg bl_lcg = this.a;
                        Context context = view.getContext();
                        if (view.isSelected()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        bl_lcg.a(context, z, bangumiUniformEpisode.alreadyPlayed, view, textView);
                        if (this.a.c != null) {
                            this.a.c.a(this.a.a(bangumiUniformEpisode), this.a.e);
                        }
                        String a = hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                        String[] strArr = new String[2];
                        strArr[0] = "type";
                        strArr[1] = textView.isSelected() ? "2" : "1";
                        fcz.a(a, strArr);
                        return;
                    }
                    lyj bl_lyj = new lyj();
                    bl_lyj.a(videoDownloadEntry);
                    bl_lyj.show(bangumiDetailActivity.getSupportFragmentManager(), hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 85, (byte) 119, (byte) 106, (byte) 104, (byte) 117, (byte) 113, (byte) 65, (byte) 108, (byte) 100, (byte) 105, (byte) 106, (byte) 98}));
                    String str = videoDownloadEntry.z() ? "4" : !videoDownloadEntry.u() ? "3" : "5";
                    fcz.a(hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[]{"type", str});
                }
            }
        }
    };

    public /* synthetic */ u b(ViewGroup viewGroup, int i) {
        return a(viewGroup, i);
    }

    public lcg(lch bl_lch) {
        b(true);
        this.g = new WeakReference(bl_lch);
    }

    public bgs a(ViewGroup viewGroup, int i) {
        if (this.f == null) {
            this.f = LayoutInflater.from(viewGroup.getContext());
        }
        return bgs.a(viewGroup);
    }

    public void a(bgs bl_bgs, int i) {
        int i2;
        int i3;
        boolean z;
        BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) this.b.get(i);
        bl_bgs.n.setText(bangumiUniformEpisode.index);
        bl_bgs.a.setTag(bangumiUniformEpisode);
        bl_bgs.a.setOnClickListener(this.h);
        BangumiDetailActivity bangumiDetailActivity = (BangumiDetailActivity) fnd.a(bl_bgs.a.getContext());
        VideoDownloadEntry videoDownloadEntry = (VideoDownloadEntry) bangumiDetailActivity.s().a(bangumiUniformEpisode.epid);
        if (videoDownloadEntry == null || videoDownloadEntry.C()) {
            i2 = -1;
            i3 = -1;
        } else if (videoDownloadEntry.z()) {
            i2 = 2131230844;
            i3 = 2131100078;
        } else if (videoDownloadEntry.u()) {
            i2 = 2131230845;
            i3 = 2131100837;
        } else if (videoDownloadEntry.B()) {
            i3 = 2131100035;
            i2 = 2131230846;
        } else {
            i2 = 2131230846;
            i3 = 2131100837;
        }
        if (i2 == -1) {
            bl_bgs.p.setVisibility(8);
        } else {
            bl_bgs.p.setImageDrawable(fnd.a(bl_bgs.p.getResources().getDrawable(i2), bl_bgs.p.getResources().getColor(i3)));
            bl_bgs.p.setVisibility(0);
        }
        if (bbu.a(bl_bgs.r, bangumiUniformEpisode)) {
            bl_bgs.q.setVisibility(8);
        }
        if (i2 != -1) {
            z = true;
        } else {
            z = false;
        }
        a(bangumiDetailActivity, a(z, bangumiUniformEpisode), bangumiUniformEpisode.alreadyPlayed, bl_bgs.a, bl_bgs.n);
    }

    public void a(bgs bl_bgs) {
        super.a(bl_bgs);
        bl_bgs.a.setOnClickListener(null);
    }

    public int a() {
        return this.b.size();
    }

    public long f_(int i) {
        return ((BangumiUniformEpisode) this.b.get(i)).epid;
    }

    public void a(List<BangumiUniformEpisode> list, lch.a aVar) {
        this.b = list;
        this.c = aVar;
    }

    public List<BangumiUniformEpisode> b() {
        return this.b;
    }

    private void a(Context context, boolean z, boolean z2, View view, TextView textView) {
        if (z) {
            view.setSelected(true);
            textView.setTextColor(fnd.a(context, 2131100837));
        } else if (z2) {
            view.setSelected(false);
            textView.setTextColor(fnd.c(context, 16843282));
        } else {
            view.setSelected(false);
            textView.setTextColor(context.getResources().getColor(2131100856));
        }
    }

    private boolean a(boolean z, BangumiUniformEpisode bangumiUniformEpisode) {
        if (!bgy.a(bangumiUniformEpisode)) {
            View view = (View) this.g.get();
            if (view != null) {
                BangumiDetailActivity bangumiDetailActivity = (BangumiDetailActivity) fnd.a(view.getContext());
                if (!(bangumiDetailActivity == null || bangumiDetailActivity.a(bangumiUniformEpisode))) {
                    return false;
                }
            }
        }
        boolean z2 = !z && (this.e || (!this.d.isEmpty() && this.d.contains(bangumiUniformEpisode)));
        return z2;
    }

    private boolean a(BangumiUniformEpisode bangumiUniformEpisode) {
        if (bangumiUniformEpisode != null) {
            if (this.d.contains(bangumiUniformEpisode)) {
                this.d.remove(bangumiUniformEpisode);
            } else {
                this.d.add(bangumiUniformEpisode);
            }
            this.e = false;
        }
        if (this.d.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean c() {
        return this.e;
    }

    public List<BangumiUniformEpisode> g() {
        List<BangumiUniformEpisode> arrayList = new ArrayList(this.d);
        Collections.sort(arrayList, a);
        return arrayList;
    }

    public int h() {
        return this.d.size();
    }

    public void i() {
        this.d.clear();
    }

    public void a(Object obj) {
        if (!(obj instanceof BangumiUniformEpisode)) {
            this.d.clear();
        } else if (this.d.contains(obj)) {
            this.d.remove(obj);
        }
        if (this.c != null) {
            this.c.a(this.d.size() > 0, this.e);
        }
    }

    public boolean a(Activity activity) {
        if (this.g.get() != null) {
            boolean z;
            if (this.e) {
                z = false;
            } else {
                z = true;
            }
            this.e = z;
            this.d.clear();
            if (this.e && (activity instanceof BangumiDetailActivity)) {
                for (int i = 0; i < this.b.size(); i++) {
                    BangumiUniformEpisode bangumiUniformEpisode = (BangumiUniformEpisode) this.b.get(i);
                    if (bangumiUniformEpisode != null) {
                        BangumiDetailActivity bangumiDetailActivity = (BangumiDetailActivity) activity;
                        VideoDownloadEntry videoDownloadEntry = (VideoDownloadEntry) bangumiDetailActivity.s().a(bangumiUniformEpisode.epid);
                        if ((videoDownloadEntry == null || videoDownloadEntry.C()) && bangumiDetailActivity.a(bangumiUniformEpisode)) {
                            this.d.add(bangumiUniformEpisode);
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < a(); i2++) {
                u findViewHolderForAdapterPosition = ((lch) this.g.get()).getRecyclerView().findViewHolderForAdapterPosition(i2);
                if (findViewHolderForAdapterPosition instanceof bgs) {
                    int f = findViewHolderForAdapterPosition.f();
                    if (f > -1) {
                        a((bgs) findViewHolderForAdapterPosition, f);
                    }
                } else if (i2 < ((lch) this.g.get()).getRecyclerView().getChildCount()) {
                    d(i2);
                }
            }
        }
        if (this.d.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean j() {
        return false;
    }
}
