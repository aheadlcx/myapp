package bili3.com.bilibili.column.ui.detail;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.ColorRes;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl.ank;
import bl.aog;
import bl.aos;
import bl.aou;
import bl.blk;
import bl.enb;
import bl.enm;
import bl.enn;
import bl.enr;
import bl.ens;
import bl.env;
import bl.eny;
import bl.enz;
import bl.eog;
import bl.eoi;
import bl.epf;
import bl.epg;
import bl.eqb;
import bl.eqe;
import bl.eqf;
import bl.eqj;
import bl.eql;
import bl.esu;
import bl.eva;
import bl.fky;
import bl.flh;
import bl.fml;
import bl.fmm;
import bl.fmp;
import bl.fnd;
import bl.gzc;
import bl.hae;
import bl.ibn;
import bl.lc;
import bl.oe;
import bl.oe.b;
import com.bilibili.app.comm.comment.api.BiliComment;
import com.bilibili.column.image.ColumnImageParcelable;
import com.bilibili.column.image.ColumnImageViewerActivity;
import com.bilibili.column.ui.articlelist.ColumnArticleListFragment;
import com.bilibili.column.widget.ColumnLoadErrorPage;
import com.bilibili.column.widget.FollowPopView;
import com.bilibili.column.widget.FullScreenDrawerLayout;
import com.bilibili.column.widget.FullScreenDrawerLayout.f;
import com.bilibili.column.widget.SectionedSeekBar;
import com.bilibili.magicasakura.widgets.TintImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.music.app.ui.menus.detail.MenuDetailPager;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class ColumnDetailActivity extends fky implements OnClickListener, b, SectionedSeekBar.b {
    private static int T = 0;
    private static int U = 0;
    public static final String a = hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124});
    public static final String b = hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42});
    private TextView A;
    private FrameLayout B;
    private ColumnLoadErrorPage C;
    private enb D;
    private aos E;
    private eql F;
    private View G;
    private oe H;
    private float I;
    private float J;
    private FollowPopView K;
    private FrameLayout L;
    private Button M;
    private FrameLayout N;
    private TextView O;
    private int P;
    private FullScreenDrawerLayout Q;
    private ColumnArticleListFragment R;
    @IntRange(from = 0, to = 255)
    private int S = 0;
    private int V = -1;
    private int W = 0;
    private int X = -1;
    private epg Y;
    private eqf.b Z;
    private int aa = 0;
    private boolean ab = true;
    private final a ac = new a(this);
    private int c;
    private long d;
    private String e;
    private String f;
    private long g;
    private int h;
    private long i;
    private long j;
    private long k;
    private String l;
    private AppBarLayout m;
    private ProgressBar n;
    private eqf o;
    private ViewGroup p;
    private LinearLayout q;
    private LinearLayout r;
    private LinearLayout s;
    private TintImageView t;
    private ProgressBar v;
    private TintImageView w;
    private TintTextView x;
    private TextView y;
    private TextView z;

    /* compiled from: BL */
    static class a extends Handler {
        private final WeakReference<ColumnDetailActivity> a;

        public a(ColumnDetailActivity columnDetailActivity) {
            this.a = new WeakReference(columnDetailActivity);
        }

        public void handleMessage(Message message) {
            ColumnDetailActivity columnDetailActivity = (ColumnDetailActivity) this.a.get();
            if (columnDetailActivity != null) {
                columnDetailActivity.z();
            }
        }
    }

    private void z() {
        this.aa++;
        this.n.setProgress(this.aa);
        if (this.aa >= 99) {
            this.n.setVisibility(8);
        }
    }

    protected void onCreate(Bundle bundle) {
        A();
        super.onCreate(bundle);
        setContentView(2131428548);
        L();
        b(false);
    }

    public static Intent a(Context context, String str, Uri uri) {
        long parseLong;
        int parseInt;
        long parseLong2;
        long parseLong3;
        Intent intent = new Intent(context, ColumnDetailActivity.class);
        String queryParameter = uri.getQueryParameter(MenuDetailPager.FROM);
        String queryParameter2 = uri.getQueryParameter(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}));
        String queryParameter3 = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124}));
        try {
            parseLong = Long.parseLong(str);
        } catch (NumberFormatException e) {
            parseLong = 0;
        }
        try {
            parseInt = Integer.parseInt(queryParameter3);
        } catch (NumberFormatException e2) {
            parseInt = 0;
        }
        try {
            parseLong2 = Long.parseLong(uri.getQueryParameter(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 105, (byte) 124, (byte) 90, (byte) 108, (byte) 97})));
        } catch (NumberFormatException e3) {
            parseLong2 = 0;
        }
        try {
            parseLong3 = Long.parseLong(uri.getQueryParameter(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 97})));
        } catch (NumberFormatException e4) {
            parseLong3 = 0;
        }
        intent.putExtra("cvId", parseLong);
        intent.putExtra(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124}), parseInt);
        intent.putExtra(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 105, (byte) 124, (byte) 90, (byte) 108, (byte) 97}), parseLong2);
        intent.putExtra(MenuDetailPager.FROM, queryParameter);
        intent.putExtra(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}), queryParameter2);
        intent.putExtra(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 97}), parseLong3);
        intent.putExtra(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), System.currentTimeMillis());
        intent.setData(uri);
        return intent;
    }

    private void A() {
        fmp.a(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}));
        if (N()) {
            J();
        } else {
            finish();
        }
    }

    private void B() {
        D();
        g();
        a(C().getNavigationIcon(), 2131100837);
        a(C().getOverflowIcon(), 2131100837);
        a(null);
    }

    private void b(boolean z) {
        s();
        if (M()) {
            if (z) {
                H();
                this.C.postDelayed(new Runnable(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.c(true);
                    }
                }, 250);
            } else {
                this.C.postDelayed(new Runnable(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.c(false);
                    }
                }, 50);
            }
            if (this.o.getShareContentDelegate() != null) {
                this.o.getShareContentDelegate().a(new bl.epf.a(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void a(final String str) {
                        if (!this.a.isFinishing() && !TextUtils.isEmpty(str)) {
                            this.a.o.postDelayed(new Runnable(this) {
                                final /* synthetic */ AnonymousClass16 b;

                                public void run() {
                                    if (!this.b.a.isFinishing()) {
                                        if (str.length() > 524288) {
                                            esu.b(this.b.a.getApplicationContext(), hae.a(new byte[]{(byte) -25, (byte) -71, (byte) -118, (byte) -25, (byte) -80, (byte) -120, (byte) -22, (byte) -121, (byte) -119, (byte) -21, (byte) -75, (byte) -92, (byte) -22, (byte) -119, (byte) -118, (byte) -22, (byte) -95, (byte) -74, (byte) -23, (byte) -109, (byte) -113, (byte) -22, (byte) -85, (byte) -88, (byte) -26, (byte) -102, (byte) -80, (byte) -22, (byte) -75, (byte) -87}));
                                            return;
                                        }
                                        String str = Constants.STR_EMPTY;
                                        String str2 = Constants.STR_EMPTY;
                                        if (!(this.b.a.Y == null || this.b.a.Y.c() == null)) {
                                            str = this.b.a.Y.c().getAuthorName();
                                            str2 = this.b.a.Y.c().getShareUrl();
                                        }
                                        this.b.a.o.clearMatches();
                                        this.b.a.o.clearFocus();
                                        this.b.a.e(false);
                                        this.b.a.startActivity(ColumnGenerateShareActivity.a(this.b.a, this.b.a.d, str, this.b.a.f, str2, str));
                                    }
                                }
                            }, 100);
                        }
                    }

                    public void b(String str) {
                        if (!this.a.isFinishing() && !TextUtils.isEmpty(str) && this.a.L != null) {
                            this.a.e(true);
                            this.a.L.bringToFront();
                        }
                    }
                });
            }
            if (env.e()) {
                this.o.setOnCreateContextMenuListener(new OnCreateContextMenuListener(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
                        if (VERSION.SDK_INT >= 19) {
                            this.a.b(view);
                        } else {
                            this.a.a(view);
                        }
                    }
                });
                return;
            }
            return;
        }
        finish();
    }

    private void E() {
        fmm webProxy = this.o.getWebProxy();
        webProxy.a(F());
        webProxy.a(this);
    }

    private fml F() {
        if (this.Y == null) {
            this.Y = epg.a(this, this.o);
            this.Y.a(this.d);
            this.Y.b(this.g);
        }
        return this.Y;
    }

    private void c(boolean z) {
        boolean z2 = false;
        if (!isFinishing()) {
            if (!G()) {
                l();
            } else if (this.o != null) {
                if (!this.o.e() || this.o.d()) {
                    this.o.d(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42}) + this.d);
                }
                this.o.setPreload(false);
                E();
                String a = eny.a(this.l, this.h);
                epg bl_epg = this.Y;
                if (!z) {
                    z2 = true;
                }
                bl_epg.a(a, z2);
            }
        }
    }

    private boolean G() {
        return blk.a().g();
    }

    public void j() {
        h(ColumnLoadErrorPage.b);
    }

    public void k() {
        h(ColumnLoadErrorPage.c);
    }

    public void l() {
        h(ColumnLoadErrorPage.a);
    }

    private void H() {
        this.m.setVisibility(0);
        this.B.setVisibility(0);
        this.p.setVisibility(0);
        this.n.setVisibility(0);
        this.C.setVisibility(8);
        C().setTitle(Constants.STR_EMPTY);
    }

    private void h(int i) {
        this.m.setVisibility(8);
        this.B.setVisibility(8);
        this.p.setVisibility(8);
        this.n.setVisibility(8);
        try {
            int measuredHeight = C().getChildAt(0).getMeasuredHeight();
            this.C.a(C().getChildAt(0).getMeasuredWidth(), measuredHeight, flh.a(this));
        } catch (Throwable e) {
            ibn.a(e);
        } finally {
            this.C.a(i);
        }
    }

    private void a(Drawable drawable, @ColorRes int i) {
        if (drawable != null) {
            drawable.setColorFilter(enr.a(this, i), Mode.SRC_ATOP);
        }
    }

    private void I() {
        if (TextUtils.isEmpty(this.e)) {
            a(C().getOverflowIcon(), 2131100837);
            a(C().getNavigationIcon(), 2131100837);
            return;
        }
        a(C().getOverflowIcon(), 2131101023);
        a(C().getNavigationIcon(), 2131101023);
    }

    private void J() {
        eny.a(this.d, this.l, this.h);
    }

    private void K() {
        int i = 0;
        this.aa = 0;
        while (i < 85) {
            this.ac.sendMessageDelayed(this.ac.obtainMessage(), (long) (i * 30));
            i++;
        }
    }

    private void L() {
        B();
        this.B = (FrameLayout) findViewById(2131301301);
        this.m = (AppBarLayout) findViewById(2131296428);
        this.p = (ViewGroup) findViewById(2131298272);
        this.q = (LinearLayout) findViewById(2131297617);
        this.s = (LinearLayout) findViewById(2131297627);
        this.r = (LinearLayout) findViewById(2131297622);
        this.t = (TintImageView) findViewById(2131297625);
        this.v = (ProgressBar) findViewById(2131297628);
        this.w = (TintImageView) findViewById(2131297620);
        this.x = (TintTextView) findViewById(2131297618);
        this.y = (TextView) findViewById(2131297616);
        this.z = (TextView) findViewById(2131297626);
        this.A = (TextView) findViewById(2131297621);
        this.G = findViewById(2131300017);
        this.K = (FollowPopView) findViewById(2131299385);
        this.n = (ProgressBar) findViewById(2131299179);
        this.C = (ColumnLoadErrorPage) findViewById(2131299178);
        this.L = (FrameLayout) findViewById(2131296833);
        this.M = (Button) findViewById(2131296832);
        this.N = (FrameLayout) findViewById(2131299176);
        this.O = (TextView) findViewById(2131297970);
        this.L.setVisibility(8);
        this.p.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.x.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.Q = (FullScreenDrawerLayout) findViewById(2131297457);
        this.Q.setDrawerLockMode(1);
        this.Q.setFocusableInTouchMode(false);
        this.Q.a(new f(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void a(View view, float f) {
            }

            public void a(View view) {
                if (this.a.R != null) {
                    this.a.R.h();
                    this.a.R.j();
                }
            }

            public void b(View view) {
                if (this.a.R != null) {
                    this.a.a(this.a.R.b());
                }
            }

            public void a(int i) {
            }
        });
        this.R = (ColumnArticleListFragment) getSupportFragmentManager().findFragmentById(2131296458);
        this.O.setOnClickListener(this);
        if (this.m.getBackground() != null) {
            this.m.getBackground().mutate().setAlpha(0);
        }
        if (C().getBackground() != null) {
            C().getBackground().mutate().setAlpha(0);
        }
        C().setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                ens.a(this.a.o);
            }
        });
        if (this.C != null) {
            this.C.setCallback(new com.bilibili.column.widget.ColumnLoadErrorPage.a(this) {
                final /* synthetic */ ColumnDetailActivity a;

                {
                    this.a = r1;
                }

                public void g() {
                    this.a.finish();
                }

                public void h() {
                    this.a.b(true);
                }
            });
            this.c = ens.a(getApplicationContext(), 144);
        }
    }

    public void a(long j) {
        if (j != this.d) {
            long parseLong;
            this.d = j;
            if (this.Y != null) {
                this.Y.a(this.d);
                this.Y.b(this.g);
                this.R.b(this.d);
            }
            try {
                parseLong = Long.parseLong(this.R.i());
            } catch (NumberFormatException e) {
                parseLong = 0;
            }
            if (parseLong != 0) {
                this.k = parseLong;
            }
            if (this.k != 0) {
                this.l = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90}) + this.k;
            }
            b(true);
        }
    }

    public void m() {
        if (!isFinishing()) {
            if (!(this.Z == null || this.Z.c() == null || !this.Z.c().isShowing())) {
                this.Z.c().dismiss();
            }
            e(false);
        }
    }

    public void n() {
        if (this.Q != null) {
            this.Q.f(5);
        }
    }

    public long o() {
        return this.d;
    }

    private boolean M() {
        if (this.o != null) {
            return true;
        }
        ank interceptor;
        aog a;
        WebView a2 = gzc.a().a(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42}) + this.d);
        if (a2 != null) {
            try {
                if (a2 instanceof eqf) {
                    this.o = (eqf) a2;
                    if (this.o != null) {
                        return false;
                    }
                    LayoutParams layoutParams = new LayoutParams(-1, -1);
                    interceptor = this.o.getInterceptor();
                    if (interceptor != null) {
                        a = interceptor.a();
                        if (a instanceof eqb) {
                            eqb bl_eqb = (eqb) a;
                            bl_eqb.a(this.i);
                            bl_eqb.b(this.l);
                        }
                    }
                    this.B.addView(this.o, layoutParams);
                    this.o.setOnScrollChangedListener(this.Z);
                    return true;
                }
            } catch (Exception e) {
                this.o = null;
            }
        }
        this.o = new eqf(getApplicationContext());
        this.o.ae_();
        if (this.o != null) {
            return false;
        }
        LayoutParams layoutParams2 = new LayoutParams(-1, -1);
        interceptor = this.o.getInterceptor();
        if (interceptor != null) {
            a = interceptor.a();
            if (a instanceof eqb) {
                eqb bl_eqb2 = (eqb) a;
                bl_eqb2.a(this.i);
                bl_eqb2.b(this.l);
            }
        }
        this.B.addView(this.o, layoutParams2);
        this.o.setOnScrollChangedListener(this.Z);
        return true;
    }

    private boolean N() {
        O();
        return this.d > 0;
    }

    private void O() {
        Intent intent = getIntent();
        if (intent == null) {
            this.d = 0;
            return;
        }
        c(intent);
        this.P = enn.a(getApplicationContext()).e();
    }

    private void c(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Object obj = extras.get("cvId");
            if (obj instanceof String) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str) && str.startsWith("cv")) {
                    try {
                        this.d = Long.parseLong(str.substring(2, str.length()));
                    } catch (Exception e) {
                        this.d = 0;
                    }
                }
            } else if (obj instanceof Long) {
                this.d = ((Long) obj).longValue();
            } else if (obj instanceof Integer) {
                this.d = ((Integer) obj).longValue();
            }
            this.h = extras.getInt(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124}), 0);
            obj = extras.get(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}));
            if (obj instanceof String) {
                this.l = intent.getStringExtra(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}));
            } else if (obj instanceof Integer) {
                this.l = String.valueOf(obj);
            }
            obj = extras.get(MenuDetailPager.FROM);
            if (obj instanceof String) {
                this.l = intent.getStringExtra(MenuDetailPager.FROM);
            } else if (obj instanceof Integer) {
                this.l = String.valueOf(obj);
            }
            this.i = extras.getLong(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), 0);
            this.k = extras.getLong(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 97}), 0);
            this.j = extras.getLong(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 105, (byte) 124, (byte) 90, (byte) 108, (byte) 97}), 0);
            if (this.j > 0) {
                this.j = -2;
            }
            Uri data = intent.getData();
            if (data != null) {
                CharSequence uri = data.toString();
                if (!TextUtils.isEmpty(uri)) {
                    Matcher matcher = Pattern.compile(hae.a(new byte[]{(byte) 38, (byte) 119, (byte) 96, (byte) 117, (byte) 105, (byte) 124, (byte) 45, (byte) 89, (byte) 97, (byte) 46, (byte) 44}), 2).matcher(uri);
                    if (matcher.find()) {
                        try {
                            this.j = Long.parseLong(matcher.group(1));
                        } catch (NumberFormatException e2) {
                            this.j = 0;
                        }
                    }
                }
            }
        }
    }

    public void p() {
        this.Z = new bl.eqf.a().a(this.m).a();
        if (TextUtils.isEmpty(this.e)) {
            this.Z.b(this.u.getHeight());
            this.Z.a(false);
        } else {
            this.Z.b((int) (((float) getResources().getDisplayMetrics().heightPixels) * 0.3f));
            this.Z.a(true);
        }
        this.Z.a(this.f);
        if (this.o != null) {
            this.o.setOnScrollChangedListener(this.Z);
        }
        T = getResources().getDisplayMetrics().heightPixels;
        U = this.q.getHeight();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        C().setTitle(null);
        ad();
        C().requestLayout();
    }

    protected void h() {
        Window window = getWindow();
        if (VERSION.SDK_INT >= 19) {
            if (VERSION.SDK_INT >= 21) {
                window.addFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
                window.getDecorView().setSystemUiVisibility((window.getDecorView().getSystemUiVisibility() | 1024) | 256);
            } else {
                window.addFlags(67108864);
            }
            if (!enr.a(this)) {
                flh.b(this);
            }
            flh.a(this, C());
        }
    }

    public Resources getResources() {
        return fnd.a(super.getResources(), enr.a(getApplicationContext()));
    }

    public void onBackPressed() {
        e(false);
        if (this.E == null || !this.E.c()) {
            if (!(this.Y == null || this.Y.c() == null || !this.Y.c().optBySelf)) {
                Intent intent = new Intent();
                intent.putExtra(eog.a, this.d);
                intent.putExtra(eog.b, this.Y.c().getLikeCount());
                setResult(-1, intent);
            }
            if (this.Q == null || !this.Q.g(5)) {
                super.onBackPressed();
            } else {
                this.Q.f(5);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131492870, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(2131298802);
        if (findItem != null) {
            findItem.setChecked(enr.a(getApplicationContext()));
            findItem.setVisible(false);
        }
        eny.a(eny.b.i);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131298793) {
            enz bl_enz = null;
            if (this.Y != null) {
                String str;
                enz bl_enz2 = new enz();
                bl_enz2.a = this.f;
                bl_enz2.c = this.Y.c() == null ? Constants.STR_EMPTY : this.Y.c().getShareUrl();
                bl_enz2.e = this.g;
                if (this.Y.c() == null) {
                    str = Constants.STR_EMPTY;
                } else {
                    str = this.Y.c().getAuthorName();
                }
                bl_enz2.f = str;
                bl_enz2.d = this.d;
                bl_enz2.b = Constants.STR_EMPTY;
                bl_enz = bl_enz2;
            }
            if (this.D == null) {
                this.D = new enb(this, new bl.enb.a(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                    }

                    public void a(String str) {
                        if (this.a.Y != null) {
                            this.a.Y.g();
                        }
                    }
                }, eny.b.j);
            }
            this.D.a(bl_enz);
            return true;
        }
        if (itemId != 2131298802) {
            if (itemId == 2131298801) {
                eny.a(eny.b.l);
                eqj bl_eqj = new eqj(this);
                bl_eqj.a(this);
                bl_eqj.a(this.P);
                bl_eqj.show();
                return true;
            } else if (itemId == 2131298764) {
                eny.a(eny.b.m);
                if (this.Y != null && this.Y.f()) {
                    eog.a(this, this.d);
                }
                return true;
            } else if (itemId == 2131298768) {
                eny.a(eny.b.z);
                eog.a(this, 0, hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 113, (byte) 108, (byte) 102, (byte) 105, (byte) 96, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105}));
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    protected void onResume() {
        super.onResume();
        if (C() != null && this.S > 0) {
            C().getBackground().mutate().setAlpha(this.S);
        }
    }

    protected void onPause() {
        super.onPause();
        if (this.Z != null) {
            enm.a(this).c(String.valueOf(this.d), ens.b(getApplicationContext(), (float) this.Z.a()));
            this.S = this.Z.b();
        }
    }

    protected void onDestroy() {
        fmp.b(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}));
        super.onDestroy();
        if (this.Y != null) {
            this.Y.r();
        }
        if (this.o != null) {
            ViewParent parent = this.o.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.o);
            }
            this.o.removeAllViews();
            this.o.destroy();
            this.o = null;
        }
    }

    public void q() {
        enz bl_enz = null;
        try {
            if (this.Y != null) {
                String str;
                bl_enz = new enz();
                bl_enz.a = this.f;
                bl_enz.c = this.Y.c() == null ? Constants.STR_EMPTY : this.Y.c().getShareUrl();
                bl_enz.e = this.g;
                if (this.Y.c() == null) {
                    str = Constants.STR_EMPTY;
                } else {
                    str = this.Y.c().getAuthorName();
                }
                bl_enz.f = str;
                bl_enz.d = this.d;
                bl_enz.b = Constants.STR_EMPTY;
            }
            if (this.D == null) {
                this.D = new enb(this, new bl.enb.a(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                    }

                    public void a(String str) {
                        if (this.a.Y != null) {
                            this.a.Y.g();
                        }
                    }
                }, eny.b.e);
            }
            this.D.a(bl_enz);
        } catch (Exception e) {
            BLog.e(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}), e.getMessage());
        }
    }

    public void a(int i) {
        if (this.Z != null) {
            this.Z.a(ens.a(this, i));
        }
    }

    public void a(BiliComment biliComment) {
        if (this.H == null) {
            this.H = new oe(this, this.G);
            this.H.a(2131492882);
            this.H.a((b) this);
        }
        if (biliComment != null) {
            for (int i = 0; i < this.H.a().size(); i++) {
                this.H.a().getItem(i).setVisible(false);
            }
            if (eva.a(getApplicationContext()).a()) {
                if (eva.a(getApplicationContext()).i() == biliComment.mMid) {
                    this.H.a().findItem(2131298773).setVisible(true);
                } else {
                    this.H.a().findItem(2131298767).setVisible(true);
                    this.H.a().findItem(2131298792).setVisible(true);
                }
                if (P()) {
                    this.H.a().findItem(2131298797).setVisible(true);
                    this.H.a().findItem(2131298773).setVisible(true);
                }
                if (biliComment.checkCommentBlock()) {
                    this.H.a().findItem(2131298767).setTitle(2131690489);
                } else {
                    this.H.a().findItem(2131298767).setTitle(2131690488);
                }
                if (biliComment.isUpperTop()) {
                    this.H.a().findItem(2131298797).setTitle(2131691006);
                } else {
                    this.H.a().findItem(2131298797).setTitle(2131691005);
                }
            } else {
                this.H.a().findItem(2131298767).setVisible(true);
                this.H.a().findItem(2131298792).setVisible(true);
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.G.getLayoutParams();
            layoutParams.leftMargin = (int) this.I;
            layoutParams.topMargin = (int) this.J;
            this.G.setLayoutParams(layoutParams);
            this.G.post(new Runnable(this) {
                final /* synthetic */ ColumnDetailActivity a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.H.c();
                }
            });
        }
    }

    public void a(List<ColumnImageParcelable> list, int i) {
        for (ColumnImageParcelable columnImageParcelable : list) {
            if (columnImageParcelable != null) {
                columnImageParcelable.a(getApplicationContext());
            }
        }
        startActivity(ColumnImageViewerActivity.a((Context) this, (ArrayList) list, i));
    }

    private boolean P() {
        return eva.a(getApplicationContext()).c().a == this.g;
    }

    public void a(boolean z) {
        if (this.t == null) {
            return;
        }
        if (z) {
            this.v.setVisibility(8);
            this.t.setVisibility(0);
            this.t.destroyDrawingCache();
            this.t.setImageResource(2131232901);
            a(this.t.getDrawable(), 2131100837);
            this.z.setTextColor(enr.a(this, 2131100837));
            return;
        }
        this.v.setVisibility(8);
        this.t.setVisibility(0);
        this.t.destroyDrawingCache();
        this.t.setImageResource(2131232903);
        this.z.setTextColor(getResources().getColor(2131099699));
    }

    public void r() {
        if (eva.a(this).a()) {
            this.v.setVisibility(0);
            this.t.setVisibility(8);
        }
    }

    public void b(int i) {
        if (i <= 0) {
            this.y.setText("\u8bc4\u8bba");
        } else if (i <= 10000000 || i >= 100000000) {
            this.y.setText(aou.a(i));
        } else {
            this.y.setText((i / 10000) + "\u4e07");
        }
    }

    public void c(int i) {
        if (i <= 0) {
            this.z.setText("\u6536\u85cf");
        } else if (i <= 10000000 || i >= 100000000) {
            this.z.setText(aou.a(i));
        } else {
            this.z.setText((i / 10000) + "\u4e07");
        }
    }

    public void d(int i) {
        if (i <= 0) {
            this.A.setText("\u559c\u6b22");
        } else if (i <= 10000000 || i >= 100000000) {
            this.A.setText(aou.a(i));
        } else {
            this.A.setText((i / 10000) + "\u4e07");
        }
    }

    public void a(String str) {
        this.f = str;
    }

    public void b(long j) {
        this.g = j;
    }

    public void b(String str) {
        this.e = str;
        I();
    }

    public void e(int i) {
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                d(true);
                return;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                d(false);
                return;
            default:
                d(false);
                return;
        }
    }

    private void d(boolean z) {
        if (this.w == null) {
            return;
        }
        if (z) {
            this.w.destroyDrawingCache();
            this.w.setImageResource(2131232900);
            a(this.w.getDrawable(), 2131100837);
            this.A.setTextColor(enr.a(this, 2131100837));
            eoi.a(this.w);
            return;
        }
        this.w.destroyDrawingCache();
        this.w.setImageResource(2131232902);
        this.A.setTextColor(getResources().getColor(2131099699));
    }

    public void s() {
        if (this.n != null) {
            this.n.setVisibility(0);
            K();
        }
    }

    public void t() {
        for (int i = this.aa; i < 100; i++) {
            this.ac.sendMessageDelayed(this.ac.obtainMessage(), (long) ((i - 85) * 30));
        }
    }

    public void u() {
        T();
        if (this.Y != null) {
            this.Y.h();
        }
    }

    public void f(int i) {
        if (this.Y != null && this.Y.e() != eva.a(this).i()) {
            this.K.a(this.p.getHeight(), i);
            this.K.setCallback(new FollowPopView.b(this) {
                final /* synthetic */ ColumnDetailActivity a;

                {
                    this.a = r1;
                }

                public void a() {
                    eny.a(eny.b.q);
                    this.a.Y.k();
                }
            });
        }
    }

    public void v() {
        this.Y.k();
    }

    public void w() {
        if (this.Y != null) {
            this.K.b();
        }
        if (this.R != null) {
            this.R.b(true);
        }
    }

    public void x() {
        if (this.R != null) {
            this.R.b(false);
            esu.a(this, "\u5173\u6ce8\u6210\u529f", 0);
        }
    }

    public void y() {
        if (!isFinishing() && this.o != null) {
            R();
            Q();
        }
    }

    private void Q() {
        if (this.Z != null) {
            this.Z.a(this.u, false);
        }
        eqe.a(this.o, this.P);
        if (this.ab) {
            if (this.j == -1) {
                eqe.a(this.o, null);
                if (this.F != null) {
                    this.F.show();
                    this.F.a();
                }
                this.ab = false;
            } else if (this.j == -2) {
                eqe.a(this.o, null);
                this.ab = false;
            } else if (this.j == 0) {
                enm.a(getApplicationContext()).a(String.valueOf(this.d), new bl.enm.a(this) {
                    final /* synthetic */ ColumnDetailActivity a;

                    {
                        this.a = r1;
                    }

                    public void a(int i) {
                        if (i > 0) {
                            eqe.b(this.a.o, i);
                            this.a.ab = false;
                        }
                    }
                });
            } else if (this.j > 0) {
                eqe.a(this.o, String.valueOf(this.j));
                this.ab = false;
            }
        }
        eqe.a(this.o);
        this.o.postDelayed(new Runnable(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void run() {
                eqe.a(this.a.o);
            }
        }, 300);
    }

    private void R() {
        epf.a(this.o, hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 63, (byte) 37, (byte) 115, (byte) 100, (byte) 119, (byte) 37, (byte) 118, (byte) 37, (byte) 56, (byte) 37, (byte) 97, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 64, (byte) 105, (byte) 96, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 45, (byte) 37, (byte) 34, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 34, (byte) 37, (byte) 44, (byte) 62, (byte) 118, (byte) 43, (byte) 118, (byte) 96, (byte) 113, (byte) 68, (byte) 113, (byte) 113, (byte) 119, (byte) 108, (byte) 103, (byte) 112, (byte) 113, (byte) 96, (byte) 45, (byte) 37, (byte) 34, (byte) 118, (byte) 119, (byte) 102, (byte) 34, (byte) 41, (byte) 37, (byte) 34}) + hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118, (byte) 63, (byte) 42, (byte) 42, (byte) 118, (byte) 52, (byte) 43, (byte) 109, (byte) 97, (byte) 118, (byte) 105, (byte) 103, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 103, (byte) 99, (byte) 118, (byte) 42, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 102, (byte) 42, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 42, (byte) 104, (byte) 108, (byte) 118, (byte) 102, (byte) 42, (byte) 100, (byte) 117, (byte) 117, (byte) 42, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 100, (byte) 117, (byte) 117, (byte) 40, (byte) 108, (byte) 107, (byte) 111, (byte) 96, (byte) 102, (byte) 113, (byte) 40, (byte) 103, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 108, (byte) 107, (byte) 98, (byte) 43, (byte) 111, (byte) 118}) + hae.a(new byte[]{(byte) 34, (byte) 37, (byte) 44, (byte) 62, (byte) 118, (byte) 43, (byte) 106, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 56, (byte) 37, (byte) 99, (byte) 112, (byte) 107, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 45, (byte) 44, (byte) 126, (byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 43, (byte) 108, (byte) 107, (byte) 111, (byte) 96, (byte) 102, (byte) 113, (byte) 70, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 37, (byte) 35, (byte) 35, (byte) 37, (byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 43, (byte) 108, (byte) 107, (byte) 111, (byte) 96, (byte) 102, (byte) 113, (byte) 70, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 96, (byte) 45, (byte) 44, (byte) 120, (byte) 62, (byte) 97, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 103, (byte) 106, (byte) 97, (byte) 124, (byte) 43, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 107, (byte) 97, (byte) 70, (byte) 109, (byte) 108, (byte) 105, (byte) 97, (byte) 45, (byte) 37, (byte) 118, (byte) 37, (byte) 44, (byte) 62}));
    }

    public void onClick(View view) {
        if (view == this.s) {
            if (this.Y != null) {
                this.Y.i();
            }
        } else if (view == this.r) {
            if (this.Y != null) {
                this.Y.j();
            }
        } else if (view == this.x) {
            if (this.Y != null && this.Y.f() && this.F != null) {
                this.F.show();
                this.F.a();
            }
        } else if (view == this.q) {
            if (this.o != null && this.Y != null) {
                S();
            }
        } else if (view == this.M) {
            eny.a(eny.b.p);
            if (this.o != null && this.o.getShareContentDelegate() != null) {
                this.o.clearFocus();
                this.o.getShareContentDelegate().c(this.o);
            }
        } else if (view == this.O) {
            this.N.setVisibility(8);
        }
    }

    private void S() {
        int i = this.Y.d;
        if (i > 0) {
            i = (ens.a(getApplicationContext(), i) - T) + U;
            if (i != this.V) {
                this.V = i;
                this.X = this.V;
                this.W = ens.a(getApplicationContext(), enm.a(getApplicationContext()).b(String.valueOf(this.d)));
                if (this.W >= this.V - T) {
                    this.W = this.V - T;
                }
            }
        } else {
            this.V = -1;
        }
        if (this.V > this.c && this.Z != null) {
            i = this.Z.a();
            if (i >= this.V - this.c) {
                if (i < this.V) {
                    i = this.V;
                }
                this.X = i;
                a(this.X, this.W);
                return;
            }
            this.W = i;
            if (this.W >= this.V - T) {
                this.W = this.V - T;
            }
            a(i, this.X);
        } else if (this.o != null) {
            eqe.a(this.o, null);
        }
    }

    private void a(int i, int i2) {
        if (this.o != null) {
            eqe.b(this.o, ens.b(getApplicationContext(), (float) i2));
        }
    }

    public void g(int i) {
        this.P = i;
        eqe.a(this.o, i);
        enn.a(getApplicationContext()).a(i);
        this.V = -1;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.I = motionEvent.getX();
            this.J = motionEvent.getY();
        }
        a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    private void a(@NonNull MotionEvent motionEvent) {
        if (this.K != null && this.K.isShown() && motionEvent.getY() < this.K.getY() && this.p != null) {
            this.K.a(this.p.getHeight());
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 65281) {
            long j = (this.Y == null || this.Y.p() == null) ? 0 : this.Y.p().mRpId;
            if (j > 0) {
                eqe.a(this.o, j);
            }
        } else if (i == 100 && i2 == -1 && !isFinishing()) {
            b(true);
        }
    }

    private void T() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.E = aos.a(supportFragmentManager);
        if (this.E == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            this.E = aos.a((int) this.d, 12, -1);
            this.E.a(new aos.b(this) {
                final /* synthetic */ ColumnDetailActivity a;

                {
                    this.a = r1;
                }

                public void a(BiliComment biliComment, long j) {
                    if (this.a.F.isShowing()) {
                        this.a.F.dismiss();
                    }
                    if (biliComment != null) {
                        if (!(this.a.Y == null || this.a.Y.c() == null)) {
                            this.a.b(this.a.Y.c().increaseReplyCount());
                        }
                        eqe.a(this.a.o, biliComment);
                    }
                }
            });
            beginTransaction.add(this.E, aos.a()).commitNowAllowingStateLoss();
        }
        this.F = new eql(this, this.E, this.p);
    }

    public boolean a(MenuItem menuItem) {
        if (this.Y == null || !this.Y.f()) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 2131298792) {
            this.Y.l();
            return true;
        } else if (itemId == 2131298773) {
            U();
            return true;
        } else if (itemId == 2131298797) {
            this.Y.m();
            return true;
        } else if (itemId != 2131298767) {
            return false;
        } else {
            if (!this.Y.n()) {
                V();
            }
            return true;
        }
    }

    private void U() {
        if (this.Y != null && this.Y.p() != null) {
            new bl.jp.a(this).a(getString(2131690959)).b(getString(this.Y.p().mActualReplyCount == 0 ? 2131690961 : 2131690962)).b(2131690540, new DialogInterface.OnClickListener(this) {
                final /* synthetic */ ColumnDetailActivity a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).a(2131691020, new DialogInterface.OnClickListener(this) {
                final /* synthetic */ ColumnDetailActivity a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    this.a.Y.o();
                }
            }).c().setCanceledOnTouchOutside(false);
        }
    }

    private void V() {
        new bl.jp.a(this).a(getString(2131690482)).b(2131690480).b(2131690478, new DialogInterface.OnClickListener(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).a(2131690479, new DialogInterface.OnClickListener(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.Y.q();
            }
        }).c().setCanceledOnTouchOutside(false);
    }

    private void a(View view) {
        view.postDelayed(new Runnable(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.o != null && this.a.o.getShareContentDelegate() != null) {
                    this.a.o.getShareContentDelegate().d(this.a.o);
                }
            }
        }, 150);
        try {
            Thread.sleep(300);
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    private void b(View view) {
        view.postDelayed(new Runnable(this) {
            final /* synthetic */ ColumnDetailActivity a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.o != null && this.a.o.getShareContentDelegate() != null) {
                    this.a.o.getShareContentDelegate().d(this.a.o);
                }
            }
        }, 300);
    }

    private void e(boolean z) {
        if (this.L != null) {
            this.L.setVisibility(z ? 0 : 8);
        }
    }

    public void onActionModeFinished(ActionMode actionMode) {
        e(false);
        super.onActionModeFinished(actionMode);
    }

    public void onSupportActionModeFinished(@NonNull lc lcVar) {
        e(false);
        super.onSupportActionModeFinished(lcVar);
    }

    public void c(String str) {
        this.R.a(str);
        this.R.b(this.d);
        this.Q.e(5);
    }
}
