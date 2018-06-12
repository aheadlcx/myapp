package bili.bl;

import android.content.Intent;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import bl.edh.b;
import bl.edh.c;
import bl.eec.d;
import butterknife.ButterKnife;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAppSmallTVData;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAreaRank;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveChestLotteryWinnerList;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGovernorAvatarBox;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGovernorAvatarBox.Governor;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMobileRoomInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMobileRoomInfo.ActivityInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMobileRoomInfo.LotteryInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMobileRoomInfo.RankInfo.RankActivity;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveProp;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommend;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommend.Recommend;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomAnchorInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomBasicInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomMobileAct;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveSendGift;
import com.bilibili.bililive.videoliveplayer.player.core.danmaku.minitv.MiniTvEndItem;
import com.bilibili.bililive.videoliveplayer.ui.live.room.LiveDanmuCommand;
import com.bilibili.bililive.videoliveplayer.ui.live.room.widgets.LiveBeatsView;
import com.bilibili.bililive.videoliveplayer.ui.live.room.widgets.SmallTvTimeCountView;
import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.wishbottle.WishBottleWidget;
import com.bilibili.bililive.videoliveplayer.ui.widget.banner.AvatarBanner;
import com.bilibili.bililive.videoliveplayer.ui.widget.banner.AvatarBanner.a;
import com.bilibili.lib.image.ScalableImageView;
import com.facebook.drawee.view.StaticImageView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;
import tv.danmaku.videoplayer.basic.adapter.PlayerScreenMode;
import tv.danmaku.videoplayer.basic.context.PlayerParams;

/* compiled from: BL */
public class dyx implements OnClickListener, c {
    private static final String b = hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 107, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 113, (byte) 109, (byte) 112, (byte) 104, (byte) 103, (byte) 90, (byte) 109, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113});
    private SmallTvTimeCountView A;
    private ScalableImageView B;
    private LiveBeatsView C;
    private dyp D;
    private ViewGroup E;
    private dyj F;
    private AvatarBanner G;
    private FrameLayout H;
    private FrameLayout I;
    private dpo J;
    private efh K;
    private b L;
    private PlayerScreenMode M = PlayerScreenMode.VERTICAL_THUMB;
    private int N;
    private int O;
    private int P;
    private fks Q;
    private ViewGroup R;
    private TextView S;
    private View T;
    private View U;
    private View V;
    private ImageView W;
    private FragmentManager X;
    private DisplayMetrics Y;
    private d Z = new dyy(this);
    AvatarBanner.d a = new AvatarBanner.d(this) {
        final /* synthetic */ dyx a;

        {
            this.a = r1;
        }

        public void onClick(a aVar) {
            this.a.L.a(aVar);
        }
    };
    private ebu aa = new ebu(this) {
        final /* synthetic */ dyx a;

        {
            this.a = r1;
        }

        public void a() {
            this.a.L.c(PlayerScreenMode.VERTICAL_THUMB);
        }

        public void b() {
            this.a.L.b(PlayerScreenMode.VERTICAL_THUMB);
        }
    };
    private efh.a ab = new efh.a(this) {
        final /* synthetic */ dyx a;

        {
            this.a = r1;
        }

        public void a(boolean z) {
            this.a.L.b(z);
        }
    };
    private ViewGroup c;
    private ViewGroup d;
    private ViewGroup e;
    private ViewGroup f;
    private View g;
    private PagerSlidingTabStrip h;
    private ViewPager i;
    private ScalableImageView j;
    private ViewStub k;
    private View l;
    private ViewStub m;
    private ImageView n;
    private StaticImageView o;
    private ImageView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private dyv x;
    private ViewGroup y;
    private WishBottleWidget z;

    public dyx(fks bl_fks) {
        this.Q = bl_fks;
        this.X = bl_fks.getSupportFragmentManager();
    }

    public void a(b bVar) {
        this.L = bVar;
    }

    public void a() {
        if (this.Q != null) {
            if (this.F != null) {
                this.F.dismiss();
            }
            if (this.J != null) {
                this.Q.getSupportFragmentManager().beginTransaction().remove(this.J);
                this.J = null;
            }
            if (this.A != null) {
                this.A.a();
            }
            if (this.K != null) {
                this.K.f();
            }
            if (this.D != null) {
                this.D.d();
            }
            this.Q = null;
        }
    }

    public boolean b() {
        if (this.J == null || !this.J.b()) {
            return false;
        }
        return true;
    }

    public boolean c() {
        if (this.J == null || !this.J.c()) {
            return false;
        }
        return true;
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
        if (this.L != null) {
            this.L.d(PlayerScreenMode.VERTICAL_THUMB);
        }
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            this.N = bundle.getInt(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 107, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 113, (byte) 109, (byte) 112, (byte) 104, (byte) 103, (byte) 90, (byte) 109, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113}), 0);
        }
    }

    public void b(Bundle bundle) {
        if (bundle != null) {
            bundle.putInt(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 107, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 113, (byte) 109, (byte) 112, (byte) 104, (byte) 103, (byte) 90, (byte) 109, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113}), this.N);
        }
    }

    public void h() {
        if (this.v != null && this.M != PlayerScreenMode.LANDSCAPE) {
            this.F = new dyj(this.Q, 8000, true);
            this.F.a(this.v);
        }
    }

    public void i() {
    }

    public void a(PlayerScreenMode playerScreenMode) {
        d(playerScreenMode);
    }

    public void a(String str) {
        if (this.q != null) {
            this.q.setText(str);
            this.q.setVisibility(0);
        }
    }

    public void a(BiliLiveGovernorAvatarBox biliLiveGovernorAvatarBox) {
        this.G.setBannerItems(ecw.a(biliLiveGovernorAvatarBox.mList, dyz.a));
        this.G.setOnBannerClickListener(this.a);
        this.G.setVisibility(0);
        this.G.c();
    }

    static final /* synthetic */ void e(View view) {
    }

    public void a(long j) {
        this.G.a(j);
        if (this.G.e()) {
            this.G.setVisibility(8);
            this.G.d();
        }
    }

    public void a(Governor governor) {
        this.G.a(new ecw(governor));
        this.L.a(governor);
        if (!this.G.e()) {
            this.G.setOnBannerClickListener(this.a);
            this.G.setVisibility(0);
            this.G.c();
        }
    }

    public void a(edc.a aVar) {
        this.x.setmIOnAnimationEventListener(aVar);
    }

    public void a(boolean z) {
        int i = 0;
        if (this.y == null) {
            return;
        }
        if (this.M == PlayerScreenMode.LANDSCAPE) {
            ViewGroup viewGroup = this.y;
            if (!z) {
                i = 4;
            }
            viewGroup.setVisibility(i);
            return;
        }
        this.y.setVisibility(0);
    }

    public void j() {
        this.Y = new DisplayMetrics();
        this.Q.getWindowManager().getDefaultDisplay().getMetrics(this.Y);
        this.O = this.Y.widthPixels;
        this.P = this.Y.heightPixels;
        this.d = (ViewGroup) ButterKnife.a(this.Q, 2131299346);
        this.f = (ViewGroup) ButterKnife.a(this.d, 2131299350);
        this.j = (ScalableImageView) ButterKnife.a(this.d, 2131297178);
        this.k = (ViewStub) ButterKnife.a(this.d, 2131299611);
        this.m = (ViewStub) ButterKnife.a(this.d, 2131297569);
        this.N = O();
        this.f.getLayoutParams().height = this.N;
        this.f.requestLayout();
        f(this.d);
        this.c = (ViewGroup) ButterKnife.a(this.Q, 2131297103);
        this.n = (ImageView) ButterKnife.a(this.c, 2131296504);
        this.o = (StaticImageView) ButterKnife.a(this.Q, 2131296516);
        this.p = (ImageView) ButterKnife.a(this.c, 2131296528);
        this.q = (TextView) ButterKnife.a(this.c, 2131298611);
        this.r = (TextView) ButterKnife.a(this.c, 2131296489);
        this.s = (TextView) ButterKnife.a(this.c, 2131298524);
        this.u = (TextView) ButterKnife.a(this.c, 2131299786);
        this.t = (TextView) ButterKnife.a(this.c, 2131298262);
        this.w = (TextView) ButterKnife.a(this.c, 2131296485);
        this.v = (TextView) ButterKnife.a(this.c, 2131296361);
        this.h = (PagerSlidingTabStrip) ButterKnife.a(this.c, 2131300497);
        this.i = (ViewPager) ButterKnife.a(this.c, 2131299183);
        this.e = (ViewGroup) ButterKnife.a(this.Q, 2131296532);
        this.y = (ViewGroup) ButterKnife.a(this.Q, 2131300038);
        this.z = (WishBottleWidget) ButterKnife.a(this.e, 2131298243);
        this.A = (SmallTvTimeCountView) ButterKnife.a(this.e, 2131300061);
        this.B = (ScalableImageView) ButterKnife.a(this.e, 2131299764);
        this.G = (AvatarBanner) ButterKnife.a(this.e, 2131296509);
        this.H = (FrameLayout) ButterKnife.a(this.e, 2131297731);
        this.I = (FrameLayout) ButterKnife.a(this.e, 2131297735);
        this.x = new dyv(this.Q);
        this.E = (ViewGroup) ButterKnife.a(this.Q, 2131299776);
        this.x.a(this.E);
        this.C = (LiveBeatsView) ButterKnife.a(this.Q, 2131298607);
        this.g = ButterKnife.a(this.Q, 2131297561);
        this.v.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.z.setOnClickListener(this);
        this.B.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.H.setOnClickListener(this);
        this.I.setOnClickListener(this);
        d(PlayerScreenMode.VERTICAL_THUMB);
        c(PlayerScreenMode.VERTICAL_THUMB);
        this.L.a(this.f);
        this.L.a(this.c, PlayerScreenMode.VERTICAL_THUMB);
    }

    public void k() {
        if (this.Q != null && this.J != null) {
            if (this.R != null) {
                this.R.setVisibility(4);
            }
            if (VERSION.SDK_INT >= 21) {
                d(4);
            }
        }
    }

    public void l() {
        if (this.M == PlayerScreenMode.VERTICAL_THUMB) {
            if (this.R != null) {
                this.R.setVisibility(0);
            }
            if (VERSION.SDK_INT >= 21) {
                d(0);
            }
        }
    }

    public boolean m() {
        if (this.J == null || (this.M != PlayerScreenMode.VERTICAL_FULLSCREEN && this.M != PlayerScreenMode.LANDSCAPE)) {
            return false;
        }
        this.J.g();
        return true;
    }

    public void n() {
    }

    public void b(boolean z) {
    }

    public void a(int i, int i2, Intent intent) {
        this.L.a(i, i2, intent);
        if (i == 2336 && i2 == -1 && this.K != null) {
            this.K.e();
        }
    }

    public void o() {
        if (this.Q != null && !this.Q.isFinishing()) {
            if (this.D == null) {
                this.D = new dyp.a().a(50).a(new dza(this)).a(this.v);
            }
            this.D.b(false);
        }
    }

    final /* synthetic */ void f(boolean z) {
        this.L.a(z);
    }

    public void p() {
        if (this.D != null) {
            this.D.c();
        }
    }

    public void a(int i) {
        if (this.t != null) {
            CharSequence charSequence = "--";
            if (this.t == null || !this.L.g()) {
                this.t.setText(charSequence);
            } else {
                charSequence = com.a(i, "0");
                this.t.setText(charSequence);
            }
            a(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 80, (byte) 117, (byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 74, (byte) 107, (byte) 105, (byte) 108, (byte) 107, (byte) 96, (byte) 75, (byte) 112, (byte) 104, (byte) 103, (byte) 96, (byte) 119}), charSequence);
        }
    }

    public void a(String str, mvs bl_mvs) {
        if (bl_mvs != null && !bl_mvs.B) {
            a(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 68, (byte) 117, (byte) 117, (byte) 96, (byte) 107, (byte) 97, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112}), bl_mvs);
        }
    }

    public void a(mvs bl_mvs) {
        if (bl_mvs != null && bl_mvs.B) {
            a(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 68, (byte) 117, (byte) 117, (byte) 96, (byte) 107, (byte) 97, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112}), bl_mvs);
        }
    }

    public void b(String str) {
        esu.a(this.Q, str);
    }

    public void q() {
        if (this.J != null) {
            d(PlayerScreenMode.VERTICAL_THUMB);
            this.J.a(1);
            this.J.a(null);
            this.J.e();
            this.X.beginTransaction().remove(this.J).commitNowAllowingStateLoss();
            this.J = null;
        }
    }

    public boolean r() {
        return this.M == PlayerScreenMode.VERTICAL_THUMB;
    }

    public int s() {
        return this.K.c();
    }

    public void a(ArrayList<ech> arrayList, boolean z) {
        this.K.a(arrayList, z);
    }

    public void a(List<ecl> list) {
        this.K.a((List) list);
    }

    public void a(Handler handler, int i, long j) {
        this.K.a(handler);
    }

    public void t() {
        this.K.h();
    }

    public void u() {
        if (this.K != null) {
            this.K.g();
        }
    }

    public void a(LiveDanmuCommand liveDanmuCommand) {
        if (this.K != null) {
            this.K.a(liveDanmuCommand);
        }
    }

    public void a(BiliLiveChestLotteryWinnerList biliLiveChestLotteryWinnerList, int i, int i2, boolean z) {
        if (dxy.a(this.X) == null) {
            dxy a = dxy.a(biliLiveChestLotteryWinnerList, i, i2, z);
            a.a(new dzb(this));
            a.show(this.X, hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 73, (byte) 112, (byte) 102, (byte) 110, (byte) 124, (byte) 73, (byte) 108, (byte) 118, (byte) 113, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113}));
        }
    }

    final /* synthetic */ void a(int i, int i2) {
        this.L.a(i, i2);
    }

    public void v() {
        DialogFragment dialogFragment = (DialogFragment) this.X.findFragmentByTag(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 73, (byte) 112, (byte) 102, (byte) 110, (byte) 124, (byte) 73, (byte) 108, (byte) 118, (byte) 113, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113}));
        if (dialogFragment != null) {
            dialogFragment.dismissAllowingStateLoss();
        }
    }

    public void a(String str, Object... objArr) {
        if (this.J != null) {
            this.J.a(str, objArr);
        }
    }

    public void a(BiliLiveRoomAnchorInfo biliLiveRoomAnchorInfo) {
        if (!(biliLiveRoomAnchorInfo.mInfo == null || TextUtils.isEmpty(biliLiveRoomAnchorInfo.mInfo.mFace))) {
            fci.g().a(biliLiveRoomAnchorInfo.mInfo.mFace, this.n);
        }
        this.p.setVisibility(8);
        if (biliLiveRoomAnchorInfo.mInfo != null) {
            this.r.setText(biliLiveRoomAnchorInfo.mInfo.mUname);
        }
        if (biliLiveRoomAnchorInfo.mLevel != null && biliLiveRoomAnchorInfo.mLevel.mMasterLevel != null) {
            b(biliLiveRoomAnchorInfo.mLevel.mMasterLevel.mLevelColor, biliLiveRoomAnchorInfo.mLevel.mMasterLevel.mLevel);
        }
    }

    private void d(int i) {
        this.Q.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    private void f(View view) {
        this.R = (ViewGroup) view.findViewById(2131298612);
        this.U = this.R.findViewById(2131298594);
        this.U.setOnClickListener(new dzc(this));
        this.S = (TextView) this.R.findViewById(2131300756);
        this.V = this.R.findViewById(2131298595);
        this.V.setOnClickListener(new dzd(this));
        this.T = this.R.findViewById(2131298574);
        this.T.setOnClickListener(new dze(this));
        this.W = (ImageView) this.R.findViewById(2131296702);
        this.W.setOnClickListener(new dzf(this));
        if (VERSION.SDK_INT >= 21) {
            this.R.setPadding(0, flh.a(this.Q), 0, 0);
        }
    }

    final /* synthetic */ void d(View view) {
        if (this.L != null) {
            this.L.n();
        }
    }

    final /* synthetic */ void c(View view) {
        g();
    }

    final /* synthetic */ void b(View view) {
        this.Q.onBackPressed();
    }

    final /* synthetic */ void a(View view) {
        this.L.r();
    }

    public void a(boolean z, boolean z2) {
        if (z) {
            this.W.setImageLevel(0);
        } else {
            this.W.setImageLevel(1);
        }
        if (z2) {
            esu.b(D(), z ? 2131694774 : 2131694773);
            a(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 81, (byte) 106, (byte) 98, (byte) 98, (byte) 105, (byte) 96, (byte) 66, (byte) 108, (byte) 99, (byte) 113, (byte) 83, (byte) 108, (byte) 118, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 113, (byte) 124}), Boolean.valueOf(z));
        }
    }

    private int O() {
        Point d = flh.d(blg.a());
        double d2 = 0.0d;
        if (d.x > 0 && d.y > 0) {
            float min = ((float) Math.min(d.x, d.y)) / ((float) Math.max(d.x, d.y));
            d2 = min <= 0.6251f ? (double) min : 0.625d;
        }
        return (int) (d2 * ((double) Math.min(d.x, d.y)));
    }

    public void a(PlayerParams playerParams, msy bl_msy) {
        this.J = new dpo();
        this.J.a(playerParams);
        this.J.a(bl_msy);
        this.X.beginTransaction().replace(2131299350, this.J).commitNowAllowingStateLoss();
    }

    public void a(BiliLiveRoomBasicInfo biliLiveRoomBasicInfo) {
        this.t.setVisibility(0);
        this.t.setText(com.a(biliLiveRoomBasicInfo.mOnline, "0"));
        this.w.setVisibility(0);
        this.w.setText(com.a(biliLiveRoomBasicInfo.mAttention, "0"));
        this.v.setVisibility(0);
        if (!(biliLiveRoomBasicInfo.mNewPendant == null || biliLiveRoomBasicInfo.mNewPendant.mMobileFrame == null || TextUtils.isEmpty(biliLiveRoomBasicInfo.mNewPendant.mMobileFrame.mVaule))) {
            fci.g().a(biliLiveRoomBasicInfo.mNewPendant.mMobileFrame.mVaule, this.o);
        }
        this.K.a(biliLiveRoomBasicInfo);
    }

    public void a(BiliLiveMobileRoomInfo biliLiveMobileRoomInfo) {
        if (biliLiveMobileRoomInfo.mLotteryInfos != null && biliLiveMobileRoomInfo.mLotteryInfos.size() > 0) {
            b(biliLiveMobileRoomInfo.mLotteryInfos);
        }
        if (!(biliLiveMobileRoomInfo.mRankInfo == null || biliLiveMobileRoomInfo.mRankInfo.mActivity == null || biliLiveMobileRoomInfo.mRankInfo.mActivity.size() <= 0)) {
            RankActivity rankActivity = (RankActivity) biliLiveMobileRoomInfo.mRankInfo.mActivity.get(0);
        }
        if (biliLiveMobileRoomInfo.mActivityInfo != null) {
            a(biliLiveMobileRoomInfo.mActivityInfo);
        }
        this.K.a(biliLiveMobileRoomInfo.mRankInfo);
    }

    public void a(BiliLiveAreaRank biliLiveAreaRank) {
    }

    public void c(boolean z) {
        if (z) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
    }

    public void b(int i) {
        this.z.a(i);
    }

    public void w() {
        this.z.a();
    }

    public void x() {
        this.z.a();
    }

    public void c(String str) {
        if (this.j != null) {
            if (this.J == null) {
                this.j.setVisibility(0);
            } else {
                this.j.setVisibility(8);
            }
            if (!TextUtils.isEmpty(str)) {
            }
        }
    }

    public void a(String str, int i, String str2) {
        this.C.setVisibility(0);
        this.C.a(str2, i);
    }

    public void y() {
        this.C.setVisibility(8);
        this.C.a();
    }

    public void z() {
        if (this.j != null) {
            this.j.setVisibility(8);
        }
    }

    public void A() {
    }

    public void B() {
    }

    public void d(boolean z) {
        if (this.K != null) {
            this.K.a(z);
        }
    }

    public void a(int i, long j) {
        this.K = new efh(this.Q, i, j, this.i, this.h);
        this.K.a(this.aa);
        this.K.a(this.ab);
        this.K.a(this.Z);
    }

    final /* synthetic */ void N() {
        int i = egd.i(this.Q);
        if (this.L != null) {
            this.L.b(i);
        }
    }

    public boolean C() {
        return this.Q == null || this.Q.isFinishing();
    }

    public void a(BiliLiveRoomMobileAct biliLiveRoomMobileAct) {
    }

    public void a(ActivityInfo activityInfo) {
        if (activityInfo.mActivity != null && activityInfo.mActivity.shouldShow()) {
            ImageView imageView = (ScalableImageView) this.Q.findViewById(2131298220);
            imageView.setVisibility(0);
            imageView.setOnClickListener(this);
            imageView.setTag(activityInfo.mActivity.mJumpMobile);
            fci.g().a(activityInfo.mActivity.mIconMobiel, imageView);
        }
        if (activityInfo.mTask != null && activityInfo.mTask.shouldShow()) {
            imageView = (ScalableImageView) this.Q.findViewById(2131298240);
            imageView.setVisibility(0);
            imageView.setOnClickListener(this);
            imageView.setTag(activityInfo.mTask.mJumpMobile);
            fci.g().a(activityInfo.mTask.mIconMobiel, imageView);
        }
    }

    public FragmentActivity D() {
        return this.Q;
    }

    public void E() {
    }

    public void F() {
        if (this.l != null) {
            this.l.setVisibility(8);
        }
        if (this.S != null) {
            this.S.setVisibility(8);
        }
    }

    public void a(BiliLiveRecommend biliLiveRecommend) {
        if (biliLiveRecommend != null) {
            if (this.l == null) {
                this.l = this.k.inflate();
                if (VERSION.SDK_INT >= 21) {
                    this.l.setPadding(0, flh.a(this.Q) + this.l.getPaddingTop(), 0, 0);
                }
                this.l.findViewById(2131299612).setVisibility(0);
            } else {
                this.l.setVisibility(0);
            }
            l();
            this.S.setVisibility(0);
            if (TextUtils.isEmpty(biliLiveRecommend.mTips)) {
                this.S.setText(2131692618);
            } else {
                this.S.setText(biliLiveRecommend.mTips);
            }
            if (biliLiveRecommend.mRecommendList != null && !biliLiveRecommend.mRecommendList.isEmpty()) {
                if (biliLiveRecommend.mRecommendList.size() > 0) {
                    a(this.l.findViewById(2131298336), (Recommend) biliLiveRecommend.mRecommendList.get(0));
                }
                if (biliLiveRecommend.mRecommendList.size() > 1) {
                    a(this.l.findViewById(2131298338), (Recommend) biliLiveRecommend.mRecommendList.get(1));
                }
            }
        }
    }

    private void a(View view, Recommend recommend) {
        ImageView imageView = (ImageView) ButterKnife.a(view, 2131297179);
        TextView textView = (TextView) ButterKnife.a(view, 2131300683);
        TextView textView2 = (TextView) ButterKnife.a(view, 2131298263);
        if (recommend.mPic != null) {
            fci.g().a(recommend.mPic, imageView);
        }
        textView.setText(recommend.mTitle);
        textView2.setText(com.a(recommend.mOnline, "0"));
        view.setOnClickListener(new dzg(this, recommend));
    }

    final /* synthetic */ void a(Recommend recommend, View view) {
        this.L.a(recommend.mRoomId, recommend.mAnchorId);
    }

    public void e(boolean z) {
        if (!C()) {
            if (z) {
                this.v.setBackgroundResource(2131235321);
                this.v.setText(2131689937);
                this.v.setTextColor(this.Q.getResources().getColor(2131100846));
            } else {
                this.v.setBackgroundResource(2131235320);
                this.v.setTextColor(fnd.a(this.Q, 2131100837));
                this.v.setText(2131689960);
            }
            a(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 80, (byte) 117, (byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 68, (byte) 113, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), Boolean.valueOf(z));
        }
    }

    private void b(int i, int i2) {
        if (i2 >= 0) {
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            int a = egu.a(i);
            int i3 = ecc.f;
            int i4 = ecc.e;
            spannableStringBuilder.append("UP" + dxi.a(i2));
            dty.a aVar = new dty.a(a, a);
            aVar.a(i4, i3, i4, i3);
            spannableStringBuilder.setSpan(new dty(aVar), 0, spannableStringBuilder.length(), 33);
            this.s.setText(spannableStringBuilder);
            this.s.setVisibility(0);
            return;
        }
        this.s.setVisibility(8);
    }

    public void onClick(View view) {
        if (this.v == view) {
            this.L.a(PlayerScreenMode.VERTICAL_THUMB);
        } else if (this.B == view) {
            this.L.f();
        } else if (this.z == view) {
            this.L.h();
        } else if (this.n == view) {
            this.L.i();
        } else if (this.q == view) {
            this.L.j();
        } else if (this.C == view) {
            this.L.k();
        } else if (view.getId() == 2131298240) {
            r0 = view.getTag();
            if (r0 != null) {
                this.L.b((String) r0);
            }
        } else if (view.getId() == 2131298220) {
            r0 = view.getTag();
            if (r0 != null) {
                this.L.c((String) r0);
            }
        } else if (this.I == view) {
            this.L.p();
        } else if (this.H == view) {
            this.L.q();
        }
    }

    public void b(PlayerScreenMode playerScreenMode) {
        if (this.M != playerScreenMode) {
            this.M = playerScreenMode;
            k();
            d(playerScreenMode);
            if (this.D != null) {
                this.D.a();
            }
            if (this.F != null) {
                this.F.dismiss();
            }
            this.L.a(playerScreenMode == PlayerScreenMode.VERTICAL_THUMB ? this.c : this.f, playerScreenMode);
        }
    }

    private void c(PlayerScreenMode playerScreenMode) {
        LayoutParams layoutParams;
        if (playerScreenMode == PlayerScreenMode.LANDSCAPE) {
            if (this.e != null && (this.e.getLayoutParams() instanceof LayoutParams)) {
                layoutParams = (LayoutParams) this.e.getLayoutParams();
                layoutParams.gravity = 21;
                layoutParams.bottomMargin = 0;
                this.e.setLayoutParams(layoutParams);
                this.e.setVisibility(0);
            }
        } else if (this.e != null && (this.e.getLayoutParams() instanceof LayoutParams)) {
            layoutParams = (LayoutParams) this.e.getLayoutParams();
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = egx.a(blg.a(), 100.0f);
            this.e.setPadding(0, 0, 0, 0);
            this.e.setLayoutParams(layoutParams);
            this.e.setVisibility(0);
            this.y.setVisibility(0);
        }
    }

    private void d(PlayerScreenMode playerScreenMode) {
        int i = -1;
        int i2 = this.N;
        if (playerScreenMode == PlayerScreenMode.VERTICAL_THUMB) {
            i2 = this.N;
        } else if (playerScreenMode == PlayerScreenMode.LANDSCAPE) {
            i2 = this.O;
        } else if (playerScreenMode == PlayerScreenMode.VERTICAL_FULLSCREEN) {
            i = this.O;
            i2 = -1;
        }
        this.d.getLayoutParams().width = i;
        this.d.getLayoutParams().height = i2;
        this.M = playerScreenMode;
        c(playerScreenMode);
        this.d.requestLayout();
    }

    public void b(List<LotteryInfo> list) {
        if (!C() && this.A != null && list != null && this.B != null) {
            if (dxz.a().d()) {
                this.A.setVisibility(8);
                if (list.size() > 0) {
                    this.B.setVisibility(0);
                    fci.g().a(((LotteryInfo) list.get(0)).mEventImg, this.B);
                } else {
                    this.B.setVisibility(8);
                }
                this.A.setVisibility(8);
                return;
            }
            this.A.setVisibility(0);
            this.B.setVisibility(8);
            BiliLiveAppSmallTVData e = dxz.a().e();
            this.A.setTVNums(dxz.a().b());
            if (e != null && this.A.getCurrentTvId() != e.mId) {
                this.A.setTVId(e.mId);
                this.A.a(e.getCountDownTime());
            }
        }
    }

    public void a(Boolean bool) {
        this.B.setEnabled(bool.booleanValue());
    }

    public void a(ArrayList<LotteryInfo> arrayList) {
        if (!C()) {
            if (!dxz.a().d() || arrayList.size() <= 0) {
                this.B.setVisibility(8);
                return;
            }
            this.B.setVisibility(0);
            fci.g().a(((LotteryInfo) arrayList.get(0)).mEventImg, this.B);
        }
    }

    public void G() {
        this.x.a();
    }

    public void a(MiniTvEndItem miniTvEndItem) {
        if (this.A != null) {
            this.A.b();
        }
    }

    public void d(String str) {
        this.L.a(str);
    }

    public void a(BiliLiveSendGift biliLiveSendGift) {
        this.L.a(biliLiveSendGift);
        if (this.K != null && this.K.d() != null) {
            this.K.d().b();
        }
    }

    public void H() {
        if (this.J != null) {
            this.J.d();
        }
    }

    public void I() {
        if (this.J != null) {
            this.J.f();
        }
    }

    public void a(BiliLiveProp biliLiveProp, long j, String str, int i) {
        if (this.J != null) {
            this.L.a(biliLiveProp, j, str, i);
        } else {
            esu.b(this.Q, 2131692272);
        }
    }

    public void c(int i) {
        if (this.L != null) {
            this.L.a(i);
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        if (this.M == PlayerScreenMode.LANDSCAPE && this.e != null && (this.e.getLayoutParams() instanceof LayoutParams)) {
            LayoutParams layoutParams = (LayoutParams) this.e.getLayoutParams();
            layoutParams.gravity = 21;
            layoutParams.bottomMargin = 0;
            this.e.setLayoutParams(layoutParams);
            this.e.setPadding(i2, i3, i4, i5);
            this.e.setVisibility(0);
        }
    }

    public void J() {
        this.H.setVisibility(0);
        this.G.setAlpha(0.0f);
    }

    public void K() {
        this.H.setVisibility(8);
        this.G.setAlpha(1.0f);
    }

    public void L() {
        this.I.setVisibility(0);
        this.A.setAlpha(0.0f);
    }

    public void M() {
        this.I.setVisibility(8);
        this.A.setAlpha(1.0f);
    }
}
