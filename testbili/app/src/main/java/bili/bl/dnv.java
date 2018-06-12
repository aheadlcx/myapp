package bili.bl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.TextUtils;
import android.view.View;
import com.bilibili.upper.videoup.model.TaskStep;
import tv.danmaku.android.log.BLog;
import tv.danmaku.frontia.SyncPluginManager.Mode;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.videoplayer.basic.context.PlayerParams;

/* compiled from: BL */
public class dnv extends eho {
    private static final String a = hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98});
    private int A;
    private long B;
    private int C;
    private String D;
    private String E;
    private mtw F;
    private Runnable G = new Runnable(this) {
        final /* synthetic */ dnv a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.b) {
                this.a.y();
                if (this.a.m != null) {
                    this.a.m.postDelayed(this, 15000);
                    return;
                }
                return;
            }
            this.a.h = true;
            if (this.a.e == 0) {
                this.a.e = this.a.c - this.a.d;
            } else {
                this.a.e = this.a.e - (this.a.d - this.a.c);
            }
        }
    };
    private boolean b;
    private long c;
    private long d;
    private long e;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private String k;
    private boolean l;
    private Handler m = etb.a(2);
    private int n;
    private int o;
    private String p;
    private String u;
    private String v;
    private int w;
    private int x;
    private int y = 0;
    private long z;

    /* compiled from: BL */
    static class a implements mua {
        private a() {
        }

        public void a(@NonNull mtx bl_mtx) {
        }

        public boolean a(Context context, PlayerParams playerParams, long j) {
            return eit.c(context) && eit.a(context, playerParams, j);
        }
    }

    dnv() {
        a(blg.a());
    }

    private void a(Context context) {
        if (this.F == null) {
            this.F = new mtw(context, new a());
        }
    }

    public void j_() {
        super.j_();
        a(this, new String[]{hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 85, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 81, (byte) 106, (byte) 98, (byte) 98, (byte) 105, (byte) 96}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 86, (byte) 113, (byte) 106, (byte) 117, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 107, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 82, (byte) 108, (byte) 105, (byte) 105, (byte) 85, (byte) 105, (byte) 100, (byte) 124})});
    }

    public void p_() {
        super.p_();
        this.F.a();
        if (this.m != null) {
            this.m.removeCallbacks(this.G);
            this.m = null;
        }
    }

    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
    }

    public void onEvent(String str, Object... objArr) {
        if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 85, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 81, (byte) 106, (byte) 98, (byte) 98, (byte) 105, (byte) 96}).equals(str)) {
            if (objArr != null && objArr.length >= 1 && objArr[0] != null && (objArr[0] instanceof Boolean)) {
                boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
                this.b = booleanValue;
                if (booleanValue) {
                    a(this.e);
                    this.c = SystemClock.elapsedRealtime();
                } else {
                    this.d = SystemClock.elapsedRealtime();
                    b(0);
                }
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 110, (byte) 112, (byte) 70, (byte) 106, (byte) 107, (byte) 107, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}).equals(str)) {
            if (objArr != null && objArr.length != 0 && (objArr[0] instanceof Integer)) {
                int intValue = ((Integer) objArr[0]).intValue();
                String str2 = null;
                if (objArr.length > 1 && (objArr[1] instanceof String)) {
                    str2 = (String) objArr[1];
                }
                a(intValue, str2);
            } else {
                return;
            }
        }
        super.onEvent(str, objArr);
    }

    public void onPrepared(IMediaPlayer iMediaPlayer) {
        super.onPrepared(iMediaPlayer);
        this.h = false;
        this.F.a(at(), iMediaPlayer, this.D);
        if (bl.ejo.a.a()) {
            b(0);
        }
        this.y = ((Integer) a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 90, (byte) 97, (byte) 96, (byte) 105, (byte) 113, (byte) 100, (byte) 118}), (Object) Integer.valueOf(0))).intValue();
    }

    public boolean a(int i, Bundle bundle) {
        long j = 0;
        mvb ar;
        switch (i) {
            case Mode.UPDATE /*1*/:
                try {
                    this.i = SystemClock.elapsedRealtime();
                    this.p = bundle.getString("url", null);
                    ar = ar();
                    if (ar != null) {
                        j = (long) ar.s();
                    }
                    this.F.a(at(), j, this.p);
                    break;
                } catch (Exception e) {
                    BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 36}));
                    break;
                }
            case TaskStep.TASK_STEP_TWO /*2*/:
                try {
                    int i2 = bundle.getInt(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), 0);
                    int i3 = bundle.getInt(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96}), 0);
                    this.j = SystemClock.elapsedRealtime();
                    ar = ar();
                    if (ar != null) {
                        j = (long) ar.s();
                    }
                    this.F.a(at(), j, this.p, i3, this.D, i2);
                    break;
                } catch (Exception e2) {
                    BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 36}));
                    break;
                }
            case 131074:
                try {
                    this.D = bundle.getString("ip", null);
                    break;
                } catch (Exception e3) {
                    BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 108, (byte) 117, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 36}));
                    break;
                }
        }
        return super.a(i, bundle);
    }

    public void Q_() {
        super.Q_();
    }

    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        switch (i) {
            case TaskStep.TASK_STEP_THREE /*3*/:
                this.F.b(at(), iMediaPlayer, this.D);
                z();
                break;
            case 701:
                if (i2 != -1) {
                    this.F.d(at(), iMediaPlayer, this.D);
                    break;
                }
                break;
            case 702:
                this.F.e(at(), iMediaPlayer, this.D);
                break;
            case 10002:
                this.F.c(at(), iMediaPlayer, this.D);
                A();
                break;
            case 10003:
                this.F.h(at(), iMediaPlayer, this.D);
                break;
            case 10004:
                this.F.i(at(), iMediaPlayer, this.D);
                break;
            case 10005:
                this.F.j(at(), iMediaPlayer, this.D);
                break;
            case 10006:
                this.F.k(at(), iMediaPlayer, this.D);
                break;
            case 10007:
                this.F.l(at(), iMediaPlayer, this.D);
                break;
        }
        return super.onInfo(iMediaPlayer, i, i2);
    }

    public void a(int i, Object... objArr) {
        super.a(i, objArr);
        switch (i) {
            case 65568:
                this.y = 0;
                this.b = false;
                if (this.m != null) {
                    this.m.removeCallbacks(this.G);
                    return;
                }
                return;
            case 65569:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof IMediaPlayer)) {
                    this.g = SystemClock.elapsedRealtime();
                    this.y = TextUtils.isEmpty(this.k) ? 0 : 15;
                    this.F.a(at(), (IMediaPlayer) objArr[0]);
                    String str = (String) a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 90, (byte) 98, (byte) 112, (byte) 108, (byte) 97}), null);
                    if (TextUtils.isEmpty(str)) {
                        str = this.F.i;
                    }
                    this.v = str;
                    this.k = this.v;
                    return;
                }
                return;
            case 65570:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof IMediaPlayer)) {
                    this.F.f(at(), (IMediaPlayer) objArr[0], this.D);
                    return;
                }
                return;
            case 65571:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof IMediaPlayer)) {
                    this.F.g(at(), (IMediaPlayer) objArr[0], this.D);
                    return;
                }
                return;
            default:
                return;
        }
    }

    private void a(long j) {
        if (this.h) {
            this.h = false;
            if (bl.ejo.a.a()) {
                b(j);
            }
        }
    }

    private void b(long j) {
        if (this.m != null) {
            this.m.removeCallbacks(this.G);
            this.m.postDelayed(this.G, j);
        }
    }

    private boolean r() {
        if (this.n != 0 && !TextUtils.isEmpty(this.v)) {
            return true;
        }
        B();
        if (this.n == 0 || TextUtils.isEmpty(this.v)) {
            return false;
        }
        return true;
    }

    private void y() {
        if (r()) {
            BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 37, (byte) 100, (byte) 37, (byte) 103, (byte) 96, (byte) 100, (byte) 113, (byte) 41, (byte) 37, (byte) 97, (byte) 96, (byte) 105, (byte) 113, (byte) 100, (byte) 90, (byte) 118, (byte) 37, (byte) 56, (byte) 37}) + this.y);
            dqo.a(new bl.dqt.a().a(this.n).a(this.B).b(this.C).c(this.x).d(this.A).e(this.w).a(this.v).f(this.o).b(this.p).g(this.y).b(System.currentTimeMillis()).c(BuildConfig.VERSION_NAME).d(BuildConfig.VERSION_NAME).e(this.E).a());
            this.y += 15;
            this.c += 15000;
            this.e = 0;
        }
    }

    private void z() {
        if (r()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
            BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 37, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 37, (byte) 99, (byte) 119, (byte) 100, (byte) 104, (byte) 96, (byte) 37, (byte) 102, (byte) 106, (byte) 118, (byte) 113, (byte) 37}) + elapsedRealtime);
            dqo.a(new bl.dqx.a().a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 118, (byte) 112, (byte) 102, (byte) 102})).b("305").a(this.n).b(this.o).c(this.p).d(this.u).e(this.v).c(this.w).a(elapsedRealtime).a());
        }
    }

    private void A() {
        if (r()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
            BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 100, (byte) 112, (byte) 97, (byte) 108, (byte) 106, (byte) 37, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 37, (byte) 99, (byte) 119, (byte) 100, (byte) 104, (byte) 96, (byte) 37, (byte) 102, (byte) 106, (byte) 118, (byte) 113, (byte) 37}) + elapsedRealtime);
            dqo.a(new bl.dqx.a().a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 100, (byte) 112, (byte) 97, (byte) 108, (byte) 106, (byte) 90, (byte) 118, (byte) 112, (byte) 102, (byte) 102})).b("306").a(this.n).b(this.o).c(this.p).d(this.u).e(this.v).c(this.w).a(elapsedRealtime).a());
        }
    }

    private void a(int i, @Nullable String str) {
        if (r() && !this.l) {
            BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97, (byte) 37}) + SystemClock.elapsedRealtime());
            dqo.a(new bl.dqx.a().a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 99, (byte) 100, (byte) 108, (byte) 105})).b("303").a(this.n).b(this.o).d(this.u).c(this.w).d(i).f(str).a());
            this.l = true;
        }
    }

    private void B() {
        if (this.n == 0) {
            try {
                mst a = mst.a(au());
                this.x = ((Integer) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 118, (byte) 112, (byte) 103, (byte) 90, (byte) 100, (byte) 119, (byte) 96, (byte) 100, (byte) 90, (byte) 108, (byte) 97}), Integer.valueOf(0))).intValue();
                this.A = ((Integer) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 100, (byte) 119, (byte) 96, (byte) 100, (byte) 90, (byte) 108, (byte) 97}), Integer.valueOf(0))).intValue();
                this.w = ((Integer) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 111, (byte) 112, (byte) 104, (byte) 117, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}), Integer.valueOf(0))).intValue();
                this.B = ((Long) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 90, (byte) 108, (byte) 97}), Long.valueOf(0))).longValue();
                this.C = ((Integer) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 90, (byte) 105, (byte) 96, (byte) 115, (byte) 96, (byte) 105}), Integer.valueOf(0))).intValue();
                this.o = 2;
                this.z = eva.a(blg.a()).i();
                this.n = ((Integer) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 108, (byte) 97}), Integer.valueOf(0))).intValue();
                this.u = ams.b();
            } catch (Exception e) {
                BLog.d(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 98}), hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 112, (byte) 98, (byte) 109, (byte) 113, (byte) 37, (byte) 96, (byte) 125, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107}));
            }
        }
    }
}
