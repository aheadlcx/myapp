package bili3.com.bilibili.music.app.base.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import bl.frs;
import bl.fsa;
import bl.fsb;
import bl.fsq;
import bl.fti;
import bl.ftj;
import bl.ftk;
import bl.fto;
import bl.fuz;
import bl.gaz;
import bl.hae;
import bl.ibn;
import bl.jq;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveHomePage;
import com.bilibili.opd.app.bizcommon.mediaplayer.MediaSource;
import com.bilibili.opd.app.bizcommon.mediaplayer.PlayMode;
import com.bilibili.opd.app.bizcommon.mediaplayer.rx.PlayerException;
import com.bilibili.opd.app.bizcommon.mediaplayer.rx.RxMediaPlayer;
import com.bilibili.opd.app.bizcommon.mediaplayer.rx.RxMediaPlayer.PlayerState;
import com.intertrust.wasabi.licensestore.LicenseStore;
import com.tencent.bugly.BuglyStrategy.a;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.ArrayList;
import java.util.List;
import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/* compiled from: BL */
public class MainMusicPlayerView extends ConstraintLayout implements OnSeekBarChangeListener {
    private static final String c = hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 104, (byte) 100, (byte) 108, (byte) 107});
    private ImageView d;
    private ImageView e;
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private SeekBar i;
    private TextView j;
    private TextView k;
    private ftk l;
    private RxMediaPlayer<MediaSource> m;
    private List<OnSeekBarChangeListener> n = new ArrayList(1);
    private CompositeSubscription o;
    private boolean p;
    private boolean q;
    private String r;

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[PlayMode.values().length];
        static final /* synthetic */ int[] b = new int[PlayerState.values().length];

        static {
            try {
                b[PlayerState.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[PlayerState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[PlayerState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[PlayerState.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[PlayerState.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[PlayerState.ENDED.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[PlayerState.PREPARING_THEN_PAUSE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                b[PlayerState.PREPARING_THEN_START.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                b[PlayerState.PREPARED.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                b[PlayerState.BUFFERING.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[PlayMode.SINGLE_LOOP.ordinal()] = 1;
            } catch (NoSuchFieldError e11) {
            }
            try {
                a[PlayMode.LIST_LOOP.ordinal()] = 2;
            } catch (NoSuchFieldError e12) {
            }
            try {
                a[PlayMode.RANDOM.ordinal()] = 3;
            } catch (NoSuchFieldError e13) {
            }
        }
    }

    public MainMusicPlayerView(Context context) {
        super(context);
        d();
    }

    public MainMusicPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public MainMusicPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        d();
    }

    private void d() {
        this.o = new CompositeSubscription();
        LayoutInflater.from(getContext()).inflate(2131429465, this);
        setBackgroundColor(Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 102, (byte) 102, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53, (byte) 53})));
        this.d = (ImageView) findViewById(2131299326);
        this.h = (ImageView) findViewById(2131299376);
        this.e = (ImageView) findViewById(2131299339);
        this.f = (ImageView) findViewById(2131299338);
        this.g = (ImageView) findViewById(2131299377);
        this.i = (SeekBar) findViewById(2131299894);
        this.j = (TextView) findViewById(2131299344);
        this.k = (TextView) findViewById(2131300774);
        this.i.setOnSeekBarChangeListener(this);
        this.l = new ftk(getContext(), this);
        this.i.setThumb(this.l);
        this.m = fuz.a().c();
        this.h.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.m.F() != 0) {
                    try {
                        new gaz().show(((jq) view.getContext()).getSupportFragmentManager(), gaz.class.getSimpleName());
                    } catch (Throwable e) {
                        ibn.a(e);
                    }
                    fsb.a().b(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 90, (byte) 97, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 90, (byte) 96, (byte) 125, (byte) 117, (byte) 100, (byte) 107, (byte) 97, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 105, (byte) 108, (byte) 118, (byte) 113}));
                }
            }
        });
        this.d.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.q) {
                    fto.b(view.getContext(), this.a.r == null ? Constants.STR_EMPTY : this.a.r);
                } else {
                    this.a.m.c();
                }
            }
        });
        this.g.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.m.A();
                fsb.a().j(this.a.m.z().name());
                switch (AnonymousClass4.a[this.a.m.z().ordinal()]) {
                    case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                        fto.a(this.a.getContext(), hae.a(new byte[]{(byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79, (byte) -23, (byte) -89, (byte) -82, (byte) -22, (byte) -77, Byte.MIN_VALUE, (byte) -22, (byte) -72, (byte) -67, (byte) -22, (byte) -121, (byte) -120, (byte) -23, (byte) -126, (byte) -83, (byte) -21, (byte) -73, (byte) -75, (byte) -32, (byte) -77, (byte) -107, (byte) -22, (byte) -126, (byte) -102, (byte) -23, (byte) -108, (byte) -67, (byte) -22, (byte) -79, (byte) -91, (byte) -24, (byte) -127, (byte) -96}), 0);
                        return;
                    case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                        fto.a(this.a.getContext(), hae.a(new byte[]{(byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79, (byte) -23, (byte) -89, (byte) -82, (byte) -22, (byte) -77, Byte.MIN_VALUE, (byte) -22, (byte) -72, (byte) -67, (byte) -22, (byte) -121, (byte) -120, (byte) -23, (byte) -126, (byte) -83, (byte) -21, (byte) -73, (byte) -75, (byte) -32, (byte) -77, (byte) -107, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -22, (byte) -79, (byte) -91, (byte) -24, (byte) -127, (byte) -96}), 0);
                        return;
                    case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                        fto.a(this.a.getContext(), hae.a(new byte[]{(byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79, (byte) -23, (byte) -89, (byte) -82, (byte) -22, (byte) -77, Byte.MIN_VALUE, (byte) -22, (byte) -72, (byte) -67, (byte) -22, (byte) -121, (byte) -120, (byte) -23, (byte) -126, (byte) -83, (byte) -21, (byte) -73, (byte) -75, (byte) -32, (byte) -77, (byte) -107, (byte) -26, (byte) -107, Byte.MIN_VALUE, (byte) -23, (byte) -109, (byte) -75, (byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79}), 0);
                        return;
                    default:
                        return;
                }
            }
        });
        this.e.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.m.C();
            }
        });
        this.f.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.m.B();
            }
        });
    }

    private void e() {
        this.d.setImageResource(2131234827);
        this.e.setEnabled(false);
        this.f.setEnabled(false);
    }

    private void f() {
        this.e.setEnabled(true);
        this.f.setEnabled(true);
        this.q = false;
    }

    public void c() {
        this.d.setImageResource(2131234827);
        this.j.setText(hae.a(new byte[]{(byte) 40, (byte) 40, (byte) 63, (byte) 40, (byte) 40}));
        this.k.setText(hae.a(new byte[]{(byte) 40, (byte) 40, (byte) 63, (byte) 40, (byte) 40}));
        this.i.setProgress(0);
        this.i.setSecondaryProgress(0);
    }

    private void a(boolean z, String str) {
        this.q = z;
        this.r = str;
    }

    protected void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        Log.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 104, (byte) 100, (byte) 108, (byte) 107}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 67, (byte) 106, (byte) 102, (byte) 112, (byte) 118, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 63}) + z);
        super.onFocusChanged(z, i, rect);
    }

    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Log.d(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 104, (byte) 100, (byte) 108, (byte) 107}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 83, (byte) 108, (byte) 118, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 113, (byte) 124, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 63}) + i);
        if (i == 0) {
            g();
        } else if (i == 8) {
            h();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l.a();
        h();
    }

    private void g() {
        Subscription subscribe = this.m.D().observeOn(fsa.b()).subscribe(new Action1<List<MediaSource>>(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((List) obj);
            }

            public void a(List<MediaSource> list) {
                if (list == null || list.isEmpty()) {
                    this.a.e();
                } else {
                    this.a.f();
                }
            }
        }, frs.a());
        Subscription subscribe2 = this.m.l().observeOn(fsa.b()).subscribe(new Action1<PlayerState>(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((PlayerState) obj);
            }

            public void a(PlayerState playerState) {
                switch (AnonymousClass4.b[playerState.ordinal()]) {
                    case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                        this.a.d.setImageResource(2131234824);
                        return;
                    case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                    case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                    case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                    case QzoneShare.SHARE_TO_QZONE_TYPE_APP /*6*/:
                        this.a.d.setImageResource(2131234827);
                        return;
                    case a.CRASHTYPE_BLOCK /*7*/:
                        this.a.d.setImageResource(2131234827);
                        return;
                    case LicenseStore.WSB_LS_FLAG_LICENSE_TAG /*8*/:
                        this.a.d.setImageResource(2131234824);
                        return;
                    default:
                        return;
                }
            }
        }, frs.a());
        Subscription subscribe3 = this.m.l().observeOn(fsa.b()).subscribe(new Action1<PlayerState>(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((PlayerState) obj);
            }

            public void a(PlayerState playerState) {
                switch (AnonymousClass4.b[playerState.ordinal()]) {
                    case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                    case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                    case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                    case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                    case QzoneShare.SHARE_TO_QZONE_TYPE_APP /*6*/:
                    case a.CRASHTYPE_BLOCK /*7*/:
                    case BiliLiveHomePage.MODULE_TYPE_AREA_STD /*9*/:
                        this.a.l.stop();
                        return;
                    case LicenseStore.WSB_LS_FLAG_LICENSE_TAG /*8*/:
                    case BiliLiveHomePage.MODULE_TYPE_AREA_SQUARE /*10*/:
                        this.a.l.start();
                        return;
                    default:
                        return;
                }
            }
        }, frs.a());
        Subscription subscribe4 = this.m.y().observeOn(fsa.b()).subscribe(new Action1<PlayMode>(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((PlayMode) obj);
            }

            public void a(PlayMode playMode) {
                this.a.setPlayModeInternal(playMode);
            }
        }, frs.a());
        Subscription subscribe5 = this.m.o().observeOn(fsa.b()).subscribe(new Action1<Integer>(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((Integer) obj);
            }

            public void a(Integer num) {
                this.a.i.setSecondaryProgress(num.intValue());
            }
        }, frs.a());
        Subscription subscribe6 = this.m.j().distinctUntilChanged().observeOn(fsa.b()).subscribe(new Action1<Long>(this) {
            final /* synthetic */ MainMusicPlayerView a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((Long) obj);
            }

            public void a(Long l) {
                if (!this.a.p) {
                    this.a.setPlayedTime(l.longValue());
                }
            }
        }, frs.a());
        Subscription subscribe7 = this.m.v().observeOn(fsa.b()).subscribe(new fti(this), frs.a());
        Subscription subscribe8 = this.m.p().observeOn(fsa.b()).subscribe(new ftj(this), frs.a());
        this.o.addAll(new Subscription[]{subscribe, subscribe2, subscribe3, subscribe4, subscribe5, subscribe6, subscribe8, subscribe7});
    }

    public final /* synthetic */ void a(MediaSource mediaSource) {
        a(false, Constants.STR_EMPTY);
    }

    public final /* synthetic */ void a(PlayerException playerException) {
        if (playerException.a() == 7 || playerException.a() == 1 || playerException.a() == 8) {
            c();
            a(true, playerException.getMessage());
        } else if (playerException.a() == 2) {
            c();
        }
    }

    private void h() {
        this.o.clear();
    }

    private void setPlayedTime(long j) {
        long i = this.m.i();
        int i2 = 0;
        if (i != 0) {
            i2 = (int) ((100 * j) / i);
        }
        if (i < 3600000) {
            this.j.setText(fsq.a(j));
            this.k.setText(fsq.a(i));
        } else {
            this.j.setText(fsq.b(j));
            this.k.setText(fsq.b(i));
        }
        this.i.setProgress(i2);
    }

    private void setPlayModeInternal(PlayMode playMode) {
        switch (AnonymousClass4.a[playMode.ordinal()]) {
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                this.g.setImageResource(2131234842);
                return;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                this.g.setImageResource(2131234837);
                return;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                this.g.setImageResource(2131234839);
                return;
            default:
                return;
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        for (OnSeekBarChangeListener onProgressChanged : this.n) {
            onProgressChanged.onProgressChanged(seekBar, i, z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.p = true;
        for (OnSeekBarChangeListener onStartTrackingTouch : this.n) {
            onStartTrackingTouch.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.p = false;
        long i = this.m.i();
        if (i == 0) {
            this.i.setProgress(0);
        }
        this.m.b((long) (((double) i) * (((double) seekBar.getProgress()) / 100.0d)));
        for (OnSeekBarChangeListener onStopTrackingTouch : this.n) {
            onStopTrackingTouch.onStopTrackingTouch(seekBar);
        }
    }
}
