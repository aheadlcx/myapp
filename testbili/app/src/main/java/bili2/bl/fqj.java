package bili2.bl;

import android.support.v4.media.MediaMetadataCompat;
import com.bilibili.opd.app.bizcommon.mediaplayer.MediaSource;
import com.bilibili.opd.app.bizcommon.mediaplayer.PlayMode;
import com.bilibili.opd.app.bizcommon.mediaplayer.rx.RxMediaPlayer;
import com.bilibili.opd.app.bizcommon.mediaplayer.rx.RxMediaPlayer.PlayerState;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.player.notification.AbsMusicService;

/* compiled from: BL */
class fqj implements lnj {
    private static final String a = hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110});
    private AbsMusicService b;
    private RxMediaPlayer<MediaSource> c;
    private a d;
    private bl.lnj.a e;
    private int f;
    private final CompositeSubscription g = new CompositeSubscription();

    /* compiled from: BL */
    public interface a {
        void a();
    }

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[PlayerState.values().length];

        static {
            try {
                a[PlayerState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[PlayerState.PREPARING_THEN_START.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[PlayerState.PREPARED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[PlayerState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[PlayerState.IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[PlayerState.STOPPED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[PlayerState.COMPLETED.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[PlayerState.ENDED.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[PlayerState.PREPARING_THEN_PAUSE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
        }
    }

    public fqj(AbsMusicService absMusicService, RxMediaPlayer<MediaSource> rxMediaPlayer, a aVar) {
        this.b = absMusicService;
        this.c = rxMediaPlayer;
        this.d = aVar;
        Subscription subscribe = this.c.l().observeOn(fsa.b()).subscribe(new Action1<PlayerState>(this) {
            final /* synthetic */ fqj a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((PlayerState) obj);
            }

            public void a(PlayerState playerState) {
                BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 41, (byte) 37, (byte) 102, (byte) 112, (byte) 119, (byte) 37, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 37, (byte) 108, (byte) 118, (byte) 94}) + playerState.ordinal() + "]");
                switch (AnonymousClass4.a[playerState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        this.a.f = 3;
                        if (this.a.e != null) {
                            this.a.e.a(this.a.f);
                            return;
                        }
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        this.a.f = 2;
                        if (this.a.e != null) {
                            this.a.e.a(this.a.f);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }, new Action1<Throwable>(this) {
            final /* synthetic */ fqj a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((Throwable) obj);
            }

            public void a(Throwable th) {
                ibn.a(th);
            }
        });
        Subscription subscribe2 = this.c.v().observeOn(fsa.b()).subscribe(new fqk(this), frs.a(hae.a(new byte[]{(byte) 75, (byte) 106, (byte) 113, (byte) 108, (byte) 99, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 37, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 37, (byte) 118, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104})));
        Subscription subscribe3 = this.c.y().observeOn(fsa.b()).subscribe(new Action1<PlayMode>(this) {
            final /* synthetic */ fqj a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((PlayMode) obj);
            }

            public void a(PlayMode playMode) {
                BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 72, (byte) 106, (byte) 97, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 41, (byte) 37, (byte) 102, (byte) 112, (byte) 119, (byte) 37, (byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 37, (byte) 108, (byte) 118, (byte) 94}) + playMode.ordinal() + "]");
                this.a.b.b(fqh.a(playMode));
                if (this.a.e != null && this.a.c.w() != null) {
                    this.a.e.a(this.a.b.e());
                }
            }
        }, frs.a());
        this.g.addAll(new Subscription[]{subscribe2, subscribe3, subscribe});
    }

    final /* synthetic */ void a(MediaSource mediaSource) {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 41, (byte) 37, (byte) 102, (byte) 112, (byte) 119, (byte) 37, (byte) 104, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 37, (byte) 108, (byte) 118, (byte) 94}) + (mediaSource == null ? gmy.d : mediaSource.getName()) + "]");
        this.f = h() ? 3 : 2;
        try {
            if (this.e != null) {
                this.e.a(this.f);
            }
            if (this.e != null && mediaSource != null) {
                this.e.a(this.b.e());
            }
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    public void a() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), "init");
        if (this.c != null) {
            if (h()) {
                this.b.b();
                this.f = 3;
                this.b.b(fqh.a(this.c.z()));
            } else {
                this.f = 2;
            }
            if (this.e != null) {
                this.e.a(this.f);
            }
            if (this.e != null && this.c.w() != null) {
                this.e.a(this.b.e());
            }
        }
    }

    public void b() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113}));
    }

    public void a(MediaMetadataCompat mediaMetadataCompat) {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), "play");
        if (this.c != null) {
            this.c.a();
            this.f = 3;
            if (this.e != null) {
                this.e.a(this.f);
            }
            if (this.e != null) {
                this.e.a(mediaMetadataCompat);
            }
        }
    }

    public void c() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 112, (byte) 118, (byte) 96}));
        if (this.c != null) {
            this.c.b();
            this.f = 2;
            if (this.e != null) {
                this.e.a(this.f);
            }
        }
    }

    public void d() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 85, (byte) 100, (byte) 112, (byte) 118, (byte) 96}));
        if (this.c != null) {
            this.c.c();
        }
    }

    public void e() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 118, (byte) 110, (byte) 108, (byte) 117, (byte) 81, (byte) 106, (byte) 75, (byte) 96, (byte) 125, (byte) 113}));
        if (this.c != null) {
            this.f = 10;
            c(this.f);
            this.c.B();
            if (!(this.e == null || this.c.w() == null)) {
                this.e.a(this.b.e());
            }
            this.f = 3;
            c(this.f);
        }
    }

    public void f() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 118, (byte) 110, (byte) 108, (byte) 117, (byte) 81, (byte) 106, (byte) 85, (byte) 119, (byte) 96, (byte) 115, (byte) 108, (byte) 106, (byte) 112, (byte) 118}));
        if (this.c != null) {
            this.f = 9;
            c(this.f);
            this.c.C();
            if (!(this.e == null || this.c.w() == null)) {
                this.e.a(this.b.e());
            }
            this.f = 3;
            c(this.f);
        }
    }

    public void g() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 113, (byte) 106, (byte) 98, (byte) 98, (byte) 105, (byte) 96, (byte) 72, (byte) 106, (byte) 97, (byte) 96}));
        if (this.c != null) {
            fto.a(this.b, hae.a(new byte[]{(byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79, (byte) -23, (byte) -89, (byte) -82, (byte) -22, (byte) -77, Byte.MIN_VALUE, (byte) -22, (byte) -72, (byte) -67, (byte) -22, (byte) -121, (byte) -120, (byte) -23, (byte) -126, (byte) -83, (byte) -21, (byte) -73, (byte) -75, (byte) -32, (byte) -77, (byte) -107}) + this.b.getString(a(fqh.a(this.c.A()))));
        }
    }

    public void a(boolean z) {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), "stop");
        if (this.c != null) {
            this.f = 1;
            if (z && this.e != null) {
                this.e.a(this.f);
            }
            this.c.e();
            if (this.d != null) {
                this.d.a();
            }
            i();
        }
    }

    public void i() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 105, (byte) 96, (byte) 100, (byte) 118, (byte) 96}));
        this.g.clear();
        this.c = null;
        this.e = null;
        this.b = null;
    }

    public boolean h() {
        BLog.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 103, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98}));
        if (this.c == null) {
            return false;
        }
        return this.c.f();
    }

    public void a(bl.lnj.a aVar) {
        this.e = aVar;
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 2131693536;
            case 1:
                return 2131693537;
            case 2:
                return 2131693538;
            default:
                return 0;
        }
    }

    private void c(int i) {
        if (this.e != null) {
            this.e.a(i);
        }
    }

    public void b(int i) {
        this.f = i;
    }
}
