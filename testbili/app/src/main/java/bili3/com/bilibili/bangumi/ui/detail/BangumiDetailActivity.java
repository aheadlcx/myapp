package bili3.com.bilibili.bangumi.ui.detail;

import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl.bbi;
import bl.bbr;
import bl.bbx;
import bl.bcc;
import bl.bcd;
import bl.bcm;
import bl.bda;
import bl.bgc;
import bl.bge;
import bl.bgo;
import bl.bgq;
import bl.bgt;
import bl.bgy;
import bl.esu;
import bl.fci;
import bl.fjv.a;
import bl.fjv.b;
import bl.fkf;
import bl.flh;
import bl.gnd;
import bl.gne;
import bl.gx;
import bl.hae;
import com.bilibili.bangumi.api.uniform.BangumiUniformApiService;
import com.bilibili.bangumi.api.uniform.BangumiUniformApiService.UniformSeasonParamsMap;
import com.bilibili.bangumi.api.uniform.BangumiUniformEpisode;
import com.bilibili.bangumi.api.uniform.BangumiUniformSeason;
import com.bilibili.lib.account.subscribe.Topic;
import com.bilibili.videodownloader.model.VideoDownloadEntry;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* compiled from: BL */
public class BangumiDetailActivity extends bgq implements bgt {
    private static final String C = hae.a(new byte[]{(byte) 117, (byte) 98, (byte) 102, (byte) 90, (byte) 103, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 115, (byte) 102, (byte) 90, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 112, (byte) 104, (byte) 96});
    private static final String v = hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124});
    private BangumiUniformSeason A;
    private int B;
    private bcm D;
    private bge E;
    private bgo F;
    private bbi<BangumiUniformSeason> G = new bbi<BangumiUniformSeason>(this) {
        final /* synthetic */ BangumiDetailActivity a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(Object obj) {
            a((BangumiUniformSeason) obj);
        }

        public void a(BangumiUniformSeason bangumiUniformSeason) {
            this.a.A = bangumiUniformSeason;
            this.a.a(this.a.A != null ? this.a.A.cover : Constants.STR_EMPTY);
            if (this.a.E != null) {
                if (this.a.A != null) {
                    this.a.d.setText(this.a.A.title);
                }
                this.a.E.a(bangumiUniformSeason);
                this.a.E.a(this.a.q);
            }
            if (bgy.I(this.a.A)) {
                this.a.a(0);
            }
            if (this.a.D != null) {
                this.a.D.a(true);
            }
            this.a.setVolumeControlStream(3);
        }

        public void a(Throwable th) {
            if (this.a.E != null) {
                this.a.E.a(th);
            }
            bbx.a(this.a.h, 2131230864);
            this.a.j.setVisibility(8);
            this.a.i.setVisibility(8);
            if (this.a.D != null) {
                this.a.D.a(false);
            }
        }

        public boolean a() {
            return this.a.c_();
        }
    };
    private a H = new b(this) {
        final /* synthetic */ BangumiDetailActivity a;

        {
            this.a = r1;
        }

        public Bundle a(String str) {
            File b;
            String string;
            String string2;
            String str2 = null;
            String str3 = this.a.A.shareUrl;
            String str4 = this.a.A.cover;
            try {
                b = fci.g().b(str4);
            } catch (Exception e) {
                b = null;
            }
            if (TextUtils.equals(str, "SINA")) {
                string = this.a.getString(2131690161);
                string2 = this.a.getResources().getString(2131690159, new Object[]{this.a.A.title, Integer.valueOf(this.a.B)});
                string2 = String.format(Locale.US, hae.a(new byte[]{(byte) 32, (byte) 118, (byte) 37, (byte) 32, (byte) 118}), new Object[]{string2, hae.a(new byte[]{(byte) 38, (byte) -22, (byte) -100, (byte) -101, (byte) -22, (byte) -100, (byte) -90, (byte) -22, (byte) -100, (byte) -101, (byte) -22, (byte) -100, (byte) -90, (byte) 38})});
            } else {
                string = this.a.getString(2131690160, new Object[]{this.a.A.title});
                string2 = this.a.getString(2131690158, new Object[]{this.a.A.title, Integer.valueOf(this.a.B)});
                if (TextUtils.equals(str, hae.a(new byte[]{(byte) 66, (byte) 64, (byte) 75, (byte) 64, (byte) 87, (byte) 76, (byte) 70}))) {
                    string2 = string2 + ", " + str3;
                } else if (TextUtils.equals(str, "COPY")) {
                    string2 = str3;
                }
            }
            fkf c = new fkf().a(string).b(string2).c(str3);
            if (b != null && b.exists()) {
                str2 = b.getAbsolutePath();
            }
            return c.e(str2).d(str4).f(hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 114, (byte) 96, (byte) 103})).a();
        }
    };
    private BangumiUniformApiService I;
    private LinearLayout w;
    private TextView x;
    private String y;
    private String z;

    public final /* synthetic */ void a(View view) {
        b(view);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bcc.r(this);
        this.w = (LinearLayout) bbx.a(this, 2131299448);
        this.x = (TextView) bbx.a(this, 2131299449);
        bbx.a(this, 2131299446).setOnClickListener(this);
        bbx.a(this, 2131299447).setOnClickListener(this);
        if (F()) {
            FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
            this.E = new bge();
            this.E.a(this);
            getSupportFragmentManager().beginTransaction().replace(2131297831, this.E).commit();
            beginTransaction.commitAllowingStateLoss();
            this.D = new bcm(this, 1, hae.a(new byte[]{(byte) 117, (byte) 98, (byte) 102, (byte) 90, (byte) 103, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 115, (byte) 102, (byte) 90, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 118, (byte) 112, (byte) 104, (byte) 96}));
            findViewById(2131298759).setOnClickListener(new bgc(this));
            return;
        }
        finish();
    }

    private void b(View view) {
        this.E.a(view);
    }

    protected int t_() {
        return 37006;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        E();
    }

    public void onBackPressed() {
        if (this.E == null || !this.E.g()) {
            super.onBackPressed();
        }
    }

    private void E() {
        e(false);
    }

    private void e(boolean z) {
        bgo bl_bgo = null;
        this.D.a();
        this.A = null;
        this.d.setVisibility(0);
        this.e.setVisibility(8);
        this.g.setVisibility(0);
        this.w.setVisibility(8);
        if (this.p != null) {
            this.p.g();
            this.p = null;
        }
        if (this.q != null) {
            this.q.d();
        }
        v();
        if (this.E != null) {
            bge bl_bge = this.E;
            if (!z) {
                bl_bgo = this.F;
            }
            bl_bge.a(bl_bgo);
        }
        int a = bgy.a(getIntent());
        gne viewSeason;
        if (!TextUtils.isEmpty(this.y)) {
            viewSeason = t().getViewSeason(new UniformSeasonParamsMap(bbx.b(this), this.y, 0, a));
            viewSeason.a(new bbr(this));
            viewSeason.a(this.G);
        } else if (!TextUtils.isEmpty(this.z)) {
            viewSeason = t().getViewSeason(new UniformSeasonParamsMap(bbx.b(this), this.z, 2, a));
            viewSeason.a(new bbr(this));
            viewSeason.a(this.G);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.E != null) {
            this.E.onActivityResult(i, i2, intent);
        }
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 90, (byte) 108, (byte) 97}));
        CharSequence stringExtra2 = intent.getStringExtra(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}));
        if (TextUtils.isEmpty(stringExtra)) {
            Log.w(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}), hae.a(new byte[]{(byte) 86, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 76, (byte) 97, (byte) 37, (byte) 118, (byte) 109, (byte) 106, (byte) 112, (byte) 105, (byte) 97, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 36}));
        } else if (TextUtils.equals(stringExtra, this.y)) {
            Log.w(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}), hae.a(new byte[]{(byte) 82, (byte) 100, (byte) 107, (byte) 113, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 119, (byte) 96, (byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 37, (byte) 113, (byte) 109, (byte) 96, (byte) 37, (byte) 118, (byte) 100, (byte) 104, (byte) 96, (byte) 37, (byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 37, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 41, (byte) 37, (byte) 108, (byte) 98, (byte) 107, (byte) 106, (byte) 119, (byte) 96, (byte) 97, (byte) 36}));
        } else {
            setIntent(intent);
            this.y = stringExtra;
            A();
            this.d.setText(stringExtra2);
            if (this.E != null) {
                this.E.a(stringExtra);
            }
            bda.e(this.A);
            e(true);
        }
    }

    public boolean j() {
        return bbx.a(this.A) || bgy.Y(this.A) || k() || bgy.X(this.A);
    }

    public boolean a(BangumiUniformEpisode bangumiUniformEpisode) {
        return bgy.a(this, this.A, bangumiUniformEpisode);
    }

    public boolean k() {
        return bgy.W(this.A);
    }

    public void l() {
        if (this.E != null) {
            this.E.l();
        }
    }

    public void m() {
        if (this.E != null) {
            this.E.m();
        }
    }

    public void n() {
        if (this.E != null) {
            this.E.n();
        }
    }

    public void o() {
        if (this.E != null) {
            this.E.o();
        }
    }

    public void a(View view, String str) {
        this.w.setVisibility(8);
        if (this.E != null) {
            this.E.a(view, str);
        }
    }

    public void p() {
        if (this.E != null) {
            this.E.p();
        }
    }

    public void q() {
        if (this.E != null) {
            this.E.q();
        }
    }

    public void showGuideMask(View view) {
        if (this.E != null) {
            this.E.showGuideMask(view);
        }
    }

    protected void r() {
        super.r();
        if (this.E != null) {
            this.E.a();
        }
    }

    public void a(Topic topic) {
        super.a(topic);
        if (this.E != null) {
            this.E.a(topic, this.q);
        }
    }

    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (id == 2131299446) {
            this.w.setVisibility(8);
        } else if (id == 2131299447) {
            this.w.setVisibility(8);
            if (this.E != null) {
                this.E.a(this.p);
            }
        }
    }

    public void a(boolean z) {
        if (bgy.I(this.A)) {
            this.w.setVisibility(8);
        } else if (bgy.ad(this.A)) {
            CharSequence format;
            String str = Constants.STR_EMPTY;
            String aa = bgy.aa(this.A);
            boolean c = bbx.c(aa);
            if (bgy.ae(this.A)) {
                format = String.format(c ? hae.a(new byte[]{(byte) -22, (byte) -72, (byte) -67, (byte) -24, (byte) -109, (byte) -124, (byte) -22, (byte) -95, (byte) -125, (byte) -24, (byte) -93, (byte) -93, (byte) 32, (byte) 118, (byte) -25, (byte) -96, (byte) -110}) : hae.a(new byte[]{(byte) -22, (byte) -72, (byte) -67, (byte) -24, (byte) -109, (byte) -124, (byte) -22, (byte) -95, (byte) -125, (byte) 32, (byte) 118}), new Object[]{aa});
                this.w.setVisibility(8);
            } else {
                long j;
                String str2;
                long ac = bgy.ac(this.A);
                if (ac > 0) {
                    j = ac / 60;
                    ac %= 60;
                } else {
                    ac = 0;
                    j = 0;
                }
                if (c) {
                    str2 = "\u7b2c" + aa + "\u8bdd ";
                } else {
                    str2 = aa;
                }
                if (j > 0 || ac > 0) {
                    StringBuilder append = new StringBuilder().append("\u4e0a\u6b21\u770b\u5230");
                    if (z) {
                        str2 = Constants.STR_EMPTY;
                    }
                    format = append.append(str2).append(" ").append(c(String.valueOf(j))).append(":").append(c(String.valueOf(ac))).toString();
                    this.w.setVisibility(8);
                } else {
                    this.w.setVisibility(8);
                    Object obj = str;
                }
            }
            this.x.setText(format);
        } else {
            this.w.setVisibility(8);
        }
    }

    private String c(String str) {
        if (1 == str.length()) {
            return Constants.VIA_RESULT_SUCCESS + str;
        }
        return str;
    }

    public void b(boolean z) {
        this.j.setVisibility(8);
        this.i.setVisibility(8);
        if (bgy.c(this.A)) {
            if (bgy.f(this.A)) {
                this.j.setVisibility(0);
                bbx.a(this.k, 2131230870);
                this.l.setText(2131690343);
            } else if (bgy.H(this.A)) {
                this.j.setVisibility(0);
                bbx.a(this.k, 2131230871);
                CharSequence string = getString(2131690344, new Object[]{bgy.l(this.A)});
                if (z) {
                    this.l.setText(string);
                } else if (bgy.F(this.A)) {
                    this.l.setText(bcd.a(getString(2131690345, new Object[]{bgy.l(this.A)})));
                } else {
                    this.l.setText(string);
                }
            } else {
                this.i.setVisibility(0);
            }
            if (VERSION.SDK_INT >= 19) {
                this.j.setPadding(this.j.getPaddingLeft(), flh.a(this), this.j.getPaddingRight(), this.j.getPaddingBottom());
            }
        } else {
            this.i.setVisibility(0);
        }
        if (bgy.I(this.A)) {
            this.i.setVisibility(8);
        }
    }

    private boolean F() {
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            this.y = intent.getStringExtra(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 90, (byte) 108, (byte) 97}));
            this.z = intent.getStringExtra("epid");
            G();
        } else {
            List pathSegments = data.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                return false;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(pathSegments.size() - 1);
            if (hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107}).equalsIgnoreCase(str)) {
                this.y = data.getLastPathSegment();
            }
        }
        if (TextUtils.isEmpty(this.y) && TextUtils.isEmpty(this.z)) {
            return false;
        }
        return true;
    }

    private void G() {
        Object stringExtra = getIntent().getStringExtra("uri");
        if (!TextUtils.isEmpty(stringExtra)) {
            Uri parse = Uri.parse(stringExtra);
            if (parse != null) {
                this.F = bgo.a(parse);
                if (this.F != null) {
                    a(this.F.a);
                    this.d.setText(this.F.b);
                }
            }
        }
    }

    public int a(int i, int i2) {
        if (this.E != null) {
            return this.E.b(i, i2);
        }
        return -1;
    }

    public int a(List<BangumiUniformEpisode> list, int i, int i2) {
        if (this.E != null) {
            return this.E.a(list, i, i2);
        }
        return -1;
    }

    public boolean b(BangumiUniformEpisode bangumiUniformEpisode) {
        boolean a = bgy.a(this, this.A, bangumiUniformEpisode);
        if (!a) {
            esu.b(this, hae.a(new byte[]{(byte) -23, (byte) -107, (byte) -115, (byte) -23, (byte) -104, (byte) -81, (byte) -23, (byte) -110, (byte) -116, (byte) -26, (byte) -106, (byte) -97, (byte) -24, (byte) -77, (byte) -100, (byte) -22, (byte) -94, (byte) -105, (byte) -21, (byte) -76, (byte) -105, (byte) -25, (byte) -69, (byte) -74, (byte) -22, (byte) -119, (byte) -118, (byte) -22, (byte) -95, (byte) -74, (byte) -22, (byte) -100, (byte) -87, (byte) -32, (byte) -78, (byte) -111}));
        }
        return a;
    }

    public gx<VideoDownloadEntry> s() {
        if (this.E != null) {
            return this.E.f();
        }
        return null;
    }

    public BangumiUniformApiService t() {
        if (this.I == null) {
            this.I = (BangumiUniformApiService) gnd.a(BangumiUniformApiService.class);
        }
        return this.I;
    }

    public void onEvent(int i, Object... objArr) {
        super.onEvent(i, objArr);
        switch (i) {
            case 10004:
                d(false);
                return;
            case 10005:
                d(true);
                return;
            case 30001:
                if (this.E != null) {
                    setRequestedOrientation(1);
                    this.E.b(3);
                    return;
                }
                return;
            case 30002:
                if (this.E != null) {
                    setRequestedOrientation(1);
                    this.E.q();
                    return;
                }
                return;
            case 50001:
                m();
                return;
            case 50002:
                this.w.setVisibility(8);
                return;
            default:
                return;
        }
    }

    protected void u() {
        super.u();
        if (this.w.getVisibility() == 0) {
            this.w.postDelayed(new Runnable(this) {
                final /* synthetic */ BangumiDetailActivity a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.w.setVisibility(8);
                }
            }, 3500);
        }
    }

    protected void b(int i, int i2) {
        super.b(i, i2);
        int J = bgy.J(this.A);
        if (J > 0 && i2 <= J - 1) {
            BangumiUniformEpisode a = bgy.a(this.A, i2);
            if (a != null) {
                a(this.A, a);
                boolean z = bgy.h(this.A) || bgy.a(this, this.A, a);
                if (this.p == null || this.p.e()) {
                    c(z);
                } else {
                    d(z);
                }
                if (this.E != null) {
                    this.E.b(a);
                }
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            bbx.a(this.h, 2131230864);
        } else {
            bbx.a(str, this.h, 2, 25);
        }
    }
}
