package bili.bl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.support.annotation.NonNull;
import android.support.graphics.drawable.animated.BuildConfig;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bl.bca.e;
import tv.danmaku.biliplayer.event.DemandPlayerEvent.DemandPopupWindows;
import tv.danmaku.biliplayer.event.DemandPlayerEvent.a;
import tv.danmaku.biliplayer.features.toast.PlayerToast;
import tv.danmaku.biliplayer.view.PlayerCompletionPayLayout;
import tv.danmaku.biliplayer.view.PlayerCompletionPayLayout.b;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;

/* compiled from: BL */
public class bfe extends mfd {
    private static final String a = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 100, (byte) 124, (byte) 90, (byte) 103, (byte) 108, (byte) 98});
    private static final String b = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 100, (byte) 124});
    private PlayerCompletionPayLayout c;
    private long d = 0;
    private PlayerToast e;
    private boolean f = false;

    public void j_() {
        super.j_();
        a(this, new String[]{hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 119, (byte) 106, (byte) 98, (byte) 119, (byte) 96, (byte) 118, (byte) 118, (byte) 86, (byte) 96, (byte) 96, (byte) 110, (byte) 108, (byte) 107, (byte) 98}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 118, (byte) 77, (byte) 108, (byte) 98, (byte) 109, (byte) 96, (byte) 119, (byte) 85, (byte) 106, (byte) 117, (byte) 112, (byte) 117, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 107})});
    }

    public void onPrepared(IMediaPlayer iMediaPlayer) {
        boolean z;
        boolean z2 = true;
        super.onPrepared(iMediaPlayer);
        PlayerParams au = au();
        if (!(au == null || au.c == null || at() == null)) {
            boolean z3;
            ResolveResourceParams g = au.c.g();
            int H = H();
            boolean z4 = H == 5 || H == 7;
            boolean z5;
            if (H == 9) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z6;
            if (H == 6) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z7;
            if (H == 8) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z8;
            if (H == 12) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (H == 13) {
                z = true;
            } else {
                z = false;
            }
            mst I = I();
            if ("1".equals(I.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 90, (byte) 103, (byte) 112, (byte) 124, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 112, (byte) 118}), BuildConfig.VERSION_NAME)) || "1".equals(I.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 90, (byte) 117, (byte) 100, (byte) 124, (byte) 90, (byte) 117, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 100, (byte) 108, (byte) 97}), BuildConfig.VERSION_NAME))) {
                z3 = true;
            } else {
                z3 = false;
            }
            Context as = as();
            if (z3 || !(z4 || r7 || r6 || r5 || r4 || r0)) {
                this.f = false;
            } else if ((z4 || r6 || r0) && eva.a(as).d()) {
                this.f = false;
            } else {
                z = ((Boolean) g.mExtraParams.a(hae.a(new byte[]{(byte) 109, (byte) 100, (byte) 118, (byte) 90, (byte) 51, (byte) 104, (byte) 108, (byte) 107, (byte) 90, (byte) 117, (byte) 119, (byte) 96, (byte) 115, (byte) 108, (byte) 96, (byte) 114}), Boolean.valueOf(false))).booleanValue() && !at().b;
                this.f = z;
            }
            g.mExtraParams.a(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 106, (byte) 99, (byte) 99, (byte) 105, (byte) 108, (byte) 107, (byte) 96}), Boolean.valueOf(this.f));
        }
        r();
        D();
        C();
        msb aq = aq();
        if (!(aq == null || au == null)) {
            if (this.f) {
                z = false;
            } else {
                z = true;
            }
            aq.a(z);
        }
        String a = hae.a(new byte[]{(byte) 85, (byte) 98, (byte) 102, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 64, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 64, (byte) 107, (byte) 97, (byte) 85, (byte) 100, (byte) 98, (byte) 96});
        Object[] objArr = new Object[1];
        if (this.f) {
            z2 = false;
        }
        objArr[0] = Boolean.valueOf(z2);
        b(a, objArr);
    }

    private void r() {
        PlayerParams au = au();
        if (au != null && this.f) {
            au.c.j = 1;
        }
    }

    public void a(Configuration configuration) {
        ViewGroup aF = aF();
        if (this.c != null && this.c.c()) {
            this.c.b();
            if (!(aF == null || aF.indexOfChild(this.c) == -1)) {
                aF.removeView(this.c);
            }
            this.c = null;
            F();
        }
        super.a(configuration);
    }

    public void onEvent(String str, Object... objArr) {
        if (str.equals(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 119, (byte) 106, (byte) 98, (byte) 119, (byte) 96, (byte) 118, (byte) 118, (byte) 86, (byte) 96, (byte) 96, (byte) 110, (byte) 108, (byte) 107, (byte) 98}))) {
            if (!this.f) {
                return;
            }
            if (objArr != null && objArr.length >= 1 && (objArr[0] instanceof Integer)) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((au() == null || au().g() <= ((long) intValue)) && au().g() != 0) {
                    b(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 119, (byte) 106, (byte) 98, (byte) 119, (byte) 96, (byte) 118, (byte) 118, (byte) 86, (byte) 96, (byte) 96, (byte) 110, (byte) 96, (byte) 97}), new Object[0]);
                    F();
                }
            }
        } else if (str.equals(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 118, (byte) 77, (byte) 108, (byte) 98, (byte) 109, (byte) 96, (byte) 119, (byte) 85, (byte) 106, (byte) 117, (byte) 112, (byte) 117, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 107}))) {
            if (this.c != null && this.c.c()) {
                if (objArr.length > 1 && (objArr[0] instanceof DemandPopupWindows) && (objArr[1] instanceof a)) {
                    ((a) objArr[1]).a.add(Boolean.valueOf(((DemandPopupWindows) objArr[0]).priority < DemandPopupWindows.Pay_Episode.priority));
                }
            } else {
                return;
            }
        }
        super.onEvent(str, objArr);
    }

    public void onCompletion(IMediaPlayer iMediaPlayer) {
        r();
        super.onCompletion(iMediaPlayer);
        if (!y()) {
            F();
        }
    }

    protected void c() {
        super.c();
        if (this.c != null && this.c.c() && ac()) {
            ak();
        }
    }

    private void a(Context context, ViewGroup viewGroup) {
        if (au() != null) {
            this.c = PlayerCompletionPayLayout.a(context, viewGroup).a(2131689643).e(2131235390).a(0, (String) I().a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 104, (byte) 106, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 103, (byte) 100, (byte) 97, (byte) 98, (byte) 96}), BuildConfig.VERSION_NAME)).g(2131689519).a(new b(this) {
                final /* synthetic */ bfe a;

                {
                    this.a = r1;
                }

                public void a() {
                    this.a.aH();
                }

                public void b() {
                    this.a.A();
                }

                public void c() {
                    this.a.z();
                }
            });
            this.c.b();
            viewGroup.addView(this.c, -1, -1);
        }
    }

    private void a(Context context, ViewGroup viewGroup, final boolean z, boolean z2, int i, int i2, mst bl_mst) {
        String string;
        if (z) {
            string = context.getString(2131689523, new Object[]{I().a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 90, (byte) 103, (byte) 112, (byte) 124, (byte) 90, (byte) 117, (byte) 119, (byte) 108, (byte) 102, (byte) 96}), BuildConfig.VERSION_NAME)});
        } else {
            string = context.getString(2131689524, new Object[]{I().a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 90, (byte) 103, (byte) 112, (byte) 124, (byte) 90, (byte) 117, (byte) 119, (byte) 108, (byte) 102, (byte) 96}), BuildConfig.VERSION_NAME)});
        }
        this.c = PlayerCompletionPayLayout.a(context, viewGroup).a(string).g(2131689516).c(i).b(i2, (String) bl_mst.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 104, (byte) 106, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 103, (byte) 100, (byte) 97, (byte) 98, (byte) 96}), BuildConfig.VERSION_NAME)).a(new b(this) {
            final /* synthetic */ bfe b;

            public void a() {
                this.b.b(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 85, (byte) 106, (byte) 119, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98}), new Object[0]);
            }

            public void b() {
                PlayerParams c = this.b.au();
                Activity d = this.b.ao();
                if (c != null && d != null) {
                    this.b.a(false, hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 100, (byte) 124}));
                    this.b.B();
                }
            }

            public void c() {
                if (z) {
                    this.b.z();
                }
            }

            public void a(View view) {
                this.b.a(false, hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 100, (byte) 124, (byte) 90, (byte) 103, (byte) 108, (byte) 98}));
                this.b.A();
            }
        });
        if (i == 8) {
            this.c.e(2131235478);
        }
        this.c.b();
        viewGroup.addView(this.c, -1, -1);
    }

    private void z() {
        if (eva.a(as()).a()) {
            Context ao = ao();
            if (ao != null) {
                bcc.f(ao, 0);
                return;
            }
            return;
        }
        b(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 73, (byte) 106, (byte) 98, (byte) 108, (byte) 107}), new Object[0]);
    }

    private void A() {
        if (eva.a(as()).a()) {
            Context ao = ao();
            if (ao != null) {
                bcc.a(ao, 2360, "1", G());
                return;
            }
            return;
        }
        b(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 73, (byte) 106, (byte) 98, (byte) 108, (byte) 107}), new Object[0]);
    }

    private void B() {
        if (System.currentTimeMillis() - this.d > 1000) {
            this.d = System.currentTimeMillis();
            if (ao() != null) {
                b(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 85, (byte) 106, (byte) 119, (byte) 113, (byte) 119, (byte) 100, (byte) 108, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98}), new Object[0]);
                c(30001, new Object[0]);
            }
        }
    }

    private void C() {
        PlayerParams au = au();
        if (au != null && au.c.f() != null && au.c.f().d() != null && this.f) {
            b(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 100, (byte) 110, (byte) 96, (byte) 67, (byte) 100, (byte) 110, (byte) 96, (byte) 65, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new Object[]{Integer.valueOf((int) au.c.f().d().e())});
        }
    }

    private void D() {
        Activity ao = ao();
        ViewGroup aF = aF();
        if (ao != null && (aF instanceof FrameLayout) && ao() != null) {
            if (this.c != null && this.c.c()) {
                this.c.b();
            }
            if (au() == null || !this.f) {
                if (this.e != null) {
                    mny.a(this, this.e);
                    this.e = null;
                }
            } else if (this.e == null) {
                c(50002, new Object[0]);
                if (H() == 13) {
                    this.e = mny.a(this, ao().getString(2131689642), ao().getString(2131689644), 2131235390, ao().getResources().getColor(2131100457), new PlayerToast.a(this) {
                        final /* synthetic */ bfe a;

                        {
                            this.a = r1;
                        }

                        public void a() {
                        }

                        public void b() {
                            this.a.f();
                            this.a.A();
                        }
                    });
                } else {
                    this.e = mny.b(this, 2131689514, 2131689515, new PlayerToast.a(this) {
                        final /* synthetic */ bfe a;

                        {
                            this.a = r1;
                        }

                        public void a() {
                        }

                        public void b() {
                            this.a.f();
                            this.a.a(true, hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 100, (byte) 124}));
                            this.a.B();
                        }
                    });
                }
            }
        }
    }

    private void F() {
        Context as = as();
        ViewGroup aF = aF();
        if (as != null && aF != null) {
            if (this.e != null) {
                mny.a(this, this.e);
                this.e = null;
            }
            mst I = I();
            if (this.f) {
                int H = H();
                boolean z = (H == 7 || H == 6) && !eva.a(as).d();
                if (this.c == null) {
                    if (H == 13) {
                        a(as, aF);
                    } else {
                        boolean z2;
                        int i = H == 6 ? 0 : 8;
                        if (aD()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        a(as, aF, z, z2, i, i, I);
                    }
                }
                this.c.a();
                ak();
                if (Z()) {
                    f();
                }
                b(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 108, (byte) 118, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 87, (byte) 96, (byte) 118, (byte) 112, (byte) 104, (byte) 96}), new Object[0]);
            }
        }
    }

    private void a(boolean z, String str) {
        String str2;
        int i = 1;
        String str3 = BuildConfig.VERSION_NAME;
        String str4 = BuildConfig.VERSION_NAME;
        PlayerParams au = au();
        if (au == null || au.c == null) {
            str2 = str3;
            str3 = str4;
        } else {
            str3 = au.c.g().mSeasonId;
            mst a = mst.a(au);
            str4 = (String) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), BuildConfig.VERSION_NAME);
            i = ((Integer) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 118, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), Integer.valueOf(1))).intValue();
            str2 = str3;
            str3 = str4;
        }
        str4 = z ? ac() ? "2" : "1" : ac() ? "4" : "3";
        bca.a a2 = new e.a().a(hae.a(new byte[]{(byte) 117, (byte) 98, (byte) 102, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124})).b(str).c(str2).f(str3).g(str4).j(String.valueOf(i)).a();
        fcz.a().b(false, a2.b(), a2.a());
    }

    private String G() {
        PlayerParams au = au();
        if (au == null || au.c == null) {
            return BuildConfig.VERSION_NAME;
        }
        ResolveResourceParams g = au.c.g();
        return g.mSeasonId + "-" + g.mEpisodeId;
    }

    private int H() {
        PlayerParams au = au();
        if (au == null || au.c == null) {
            return 2;
        }
        return ((Integer) au.c.g().mExtraParams.a(hae.a(new byte[]{(byte) 96, (byte) 117, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 112, (byte) 118}), Integer.valueOf(2))).intValue();
    }

    @NonNull
    private mst I() {
        return mst.a(au());
    }
}
