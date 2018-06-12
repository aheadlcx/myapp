package bili3.bl;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bilibili.lib.media.resource.PlayerCodecConfig;
import com.bilibili.lib.media.resource.PlayerCodecConfig.Player;
import tv.danmaku.android.log.BLog;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.videoplayer.basic.context.PlayerParams;

/* compiled from: BL */
public class mjw extends mfd implements OnClickListener {
    protected static final Object a = new Object();
    private static final String h = hae.a(new byte[]{(byte) 75, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119});
    protected boolean b = false;
    protected boolean c;
    protected int d = 0;
    @Deprecated
    protected boolean e = true;
    protected int f = 0;
    protected boolean g = false;
    private int i;
    private boolean j = true;
    private a k;
    private Runnable l = new Runnable(this) {
        final /* synthetic */ mjw a;

        {
            this.a = r1;
        }

        public void run() {
            if (!this.a.az() && !this.a.C() && this.a.O()) {
                boolean L = this.a.L();
                if (!this.a.c || L) {
                    if (this.a.F()) {
                        int d = this.a.x();
                        if (d > 0) {
                            this.a.d = d;
                        }
                        this.a.f();
                    } else {
                        this.a.f();
                    }
                    this.a.o();
                    return;
                }
                this.a.g();
                mny.a(this.a, 2131695588);
            }
        }
    };

    /* compiled from: BL */
    public class a extends BroadcastReceiver {
        final /* synthetic */ mjw a;
        private boolean b;
        private int c = -1;

        public a(mjw bl_mjw) {
            this.a = bl_mjw;
        }

        public void onReceive(Context context, Intent intent) {
            Object obj = 1;
            if (this.a.j) {
                boolean O = this.a.O();
                Object obj2 = this.b != O ? 1 : null;
                int c = blk.a().c();
                if (this.c == c) {
                    obj = null;
                }
                BLog.i(hae.a(new byte[]{(byte) 75, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 37, (byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 41, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37}) + this.b + " to " + O + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37}) + this.c + " to " + c);
                if (c != 3) {
                    this.b = O;
                    this.c = c;
                    if (obj2 != null || r1 != null) {
                        if (O) {
                            this.a.M();
                        } else {
                            this.a.N();
                        }
                    }
                }
            }
        }
    }

    protected boolean L() {
        PlayerCodecConfig aw = aw();
        return aw != null && Player.IJK_PLAYER.equals(aw.a);
    }

    protected boolean F() {
        return !L();
    }

    public void j_() {
        super.j_();
        a(this, new String[]{hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 86, (byte) 96, (byte) 96, (byte) 110}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 108, (byte) 107, (byte) 98, (byte) 84, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124})});
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        this.b = !O();
    }

    protected void M() {
        z();
        if (this.f != 1) {
            b(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 96, (byte) 97, (byte) 75, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 74, (byte) 107}), new Object[0]);
        }
    }

    public void s() {
        boolean z = false;
        super.s();
        this.c = false;
        if (this.k == null) {
            if (ao() == null || X() != 0) {
                z = true;
            }
            this.j = z;
            G();
            a(new mjx(this), 100);
        } else if (O()) {
            mvb ar = ar();
            if (ar != null && !ar.w() && !aa() && this.f != 1) {
                z();
            }
        }
    }

    final /* synthetic */ void U() {
        this.j = true;
    }

    public void O_() {
        super.O_();
        this.c = true;
    }

    protected void N() {
        B();
        b(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 96, (byte) 97, (byte) 75, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 74, (byte) 99, (byte) 99}), new Object[0]);
    }

    public void V_() {
        super.V_();
        Q();
    }

    public void onPrepared(IMediaPlayer iMediaPlayer) {
        super.onPrepared(iMediaPlayer);
        if (this.f == -1) {
            f();
        }
    }

    public boolean a(Message message) {
        boolean a = super.a(message);
        if (!az() && message.what == 10001) {
            if (this.f == 2) {
                this.f = 0;
            }
            if (O()) {
                z();
            }
        }
        return a;
    }

    public boolean a(int i, Bundle bundle) {
        super.a(i, bundle);
        if ((i != 131075 && i != 131077) || az() || !O() || this.f == 1) {
            return false;
        }
        z();
        this.g = true;
        synchronized (a) {
            try {
                a.wait();
            } catch (Throwable e) {
                BLog.e(hae.a(new byte[]{(byte) 75, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119}), e);
            }
        }
        this.g = false;
        return true;
    }

    public void a(int i, Object... objArr) {
        super.a(i, objArr);
        if (i == 65568) {
            Q();
        }
    }

    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        Q();
        return super.onError(iMediaPlayer, i, i2);
    }

    protected boolean O() {
        Context ao = ao();
        if (ao == null) {
            ao = blg.a();
        }
        return ao != null && kqw.e(ao);
    }

    protected void z() {
        A();
    }

    protected void B() {
    }

    protected void A() {
        if (this.f == 0) {
            b(this.l);
            a(this.l, 0);
        } else if (this.f != -1) {
            r();
        }
    }

    protected void r() {
        Q();
        Activity ao = ao();
        if (ao != null && !ao.isFinishing()) {
            if (this.f == 2) {
                if (this.b) {
                    int x = x();
                    if (x > 10000) {
                        this.i = x;
                    }
                    g();
                    b(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 64, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 81, (byte) 108, (byte) 117, (byte) 118}), new Object[0]);
                    return;
                }
                ao.finish();
            } else if (this.f != 1) {
            } else {
                if (R()) {
                    a(new mjy(this), 1000);
                } else {
                    P();
                }
            }
        }
    }

    final /* synthetic */ void T() {
        if (aG()) {
            P();
        }
    }

    protected final void P() {
        M_();
        if (this.i > 0) {
            int i = this.i;
            this.i = 0;
            BLog.i(hae.a(new byte[]{(byte) 75, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 37, (byte) 114, (byte) 109, (byte) 96, (byte) 107, (byte) 37, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 104, (byte) 96, (byte) 37, (byte) 108, (byte) 107, (byte) 37, (byte) 104, (byte) 96, (byte) 113, (byte) 96, (byte) 119, (byte) 96, (byte) 97, (byte) 37, (byte) 107, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110, (byte) 37}) + i);
            a(i);
        }
    }

    protected final void Q() {
        synchronized (a) {
            a.notifyAll();
        }
    }

    protected final boolean R() {
        mvb ar = ar();
        return ar != null && ar.z();
    }

    private boolean C() {
        int x = x();
        int W_ = W_();
        return x > 0 && W_ > 0 && x + 3000 >= W_;
    }

    private boolean D() {
        mvb ar = ar();
        return ar != null && ((Long) ar.a(hae.a(new byte[]{(byte) 66, (byte) 96, (byte) 113, (byte) 70, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 97, (byte) 65, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), Long.valueOf(0))).longValue() > 500;
    }

    protected void o() {
        Context ao = ao();
        if (ao != null && !ao.isFinishing() && this.f != -1) {
            DialogInterface.OnClickListener anonymousClass2 = new DialogInterface.OnClickListener(this) {
                final /* synthetic */ mjw a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    this.a.f = i == -1 ? 1 : 2;
                    this.a.r();
                }
            };
            new bl.jp.a(ao, 2131755025).b(2131689614).a(false).a(2131696184, anonymousClass2).b(2131693744, anonymousClass2).b().show();
            this.f = -1;
        }
    }

    private void G() {
        if (ao() != null && !S() && this.k == null) {
            this.k = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 107, (byte) 96, (byte) 113, (byte) 43, (byte) 102, (byte) 106, (byte) 107, (byte) 107, (byte) 43, (byte) 70, (byte) 74, (byte) 75, (byte) 75, (byte) 64, (byte) 70, (byte) 81, (byte) 76, (byte) 83, (byte) 76, (byte) 81, (byte) 92, (byte) 90, (byte) 70, (byte) 77, (byte) 68, (byte) 75, (byte) 66, (byte) 64}));
            ao().registerReceiver(this.k, intentFilter);
        }
    }

    private void H() {
        if (ao() != null && this.k != null) {
            try {
                ao().unregisterReceiver(this.k);
            } catch (Exception e) {
            }
            this.k = null;
        }
    }

    protected boolean S() {
        PlayerParams au = au();
        return az() || (au != null && TextUtils.equals(au.c.g().mFrom, hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97})));
    }

    public void p_() {
        H();
        super.p_();
    }

    public void onClick(View view) {
        if (ao() != null) {
            ao().finish();
        }
    }

    public void onEvent(String str, Object... objArr) {
        super.onEvent(str, objArr);
        if (str.equals(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 86, (byte) 96, (byte) 96, (byte) 110}))) {
            if (O() && D() && this.f != 1) {
                A();
            }
        } else if (str.equals(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 108, (byte) 107, (byte) 98, (byte) 84, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124})) || str.equals(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}))) {
            Q();
            this.f = 0;
        }
    }
}
