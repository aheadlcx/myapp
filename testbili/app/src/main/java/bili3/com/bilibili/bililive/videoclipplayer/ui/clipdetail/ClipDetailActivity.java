package bili3.com.bilibili.bililive.videoclipplayer.ui.clipdetail;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.l;
import android.support.v7.widget.RecyclerView.u;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import bl.aqp;
import bl.axv;
import bl.clv;
import bl.cmq;
import bl.com;
import bl.cwr;
import bl.djg;
import bl.djh;
import bl.djk.b;
import bl.djl;
import bl.djm;
import bl.dlw;
import bl.ej;
import bl.esu;
import bl.eva;
import bl.fji;
import bl.hae;
import bl.mqf;
import bl.od;
import com.bilibili.bililive.videoclipplayer.core.api.entity.ClipVideoItem;
import com.bilibili.bililive.videoclipplayer.ui.newdetail.DisableScrollLinearLayoutManager;
import com.bilibili.bililive.videoclipplayer.ui.newdetail.widget.ShimmerLayout;
import com.bilibili.bililive.videoclipplayer.ui.newdetail.widget.SimpleDrawerLayout;
import com.bilibili.bililive.videoclipplayer.ui.newdetail.widget.SimpleDrawerLayout.h;
import java.util.List;

/* compiled from: BL */
public class ClipDetailActivity extends clv implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, b {
    private boolean A = true;
    private aqp B = null;
    private djl C;
    private l D = new l(this) {
        final /* synthetic */ ClipDetailActivity a;

        {
            this.a = r1;
        }

        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                int n = this.a.c.n();
                int p = this.a.c.p();
                if (n != -1 && n == p) {
                    this.a.a.b(n);
                }
            }
        }
    };
    private boolean E = false;
    private OnSeekBarChangeListener F = new OnSeekBarChangeListener(this) {
        final /* synthetic */ ClipDetailActivity a;
        private int b = 0;

        {
            this.a = r2;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                this.b = i;
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.a.q.removeCallbacks(this.a.G);
            this.a.E = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.a.q.postDelayed(this.a.G, 3000);
            this.a.a.c(this.b);
            this.a.E = false;
        }
    };
    private Runnable G = new Runnable(this) {
        final /* synthetic */ ClipDetailActivity a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.t.getVisibility() == 0) {
                this.a.z();
            }
        }
    };
    private bl.djk.a a;
    private RecyclerView b;
    private DisableScrollLinearLayoutManager c;
    private View d;
    private SimpleDrawerLayout e;
    private View f;
    private View g;
    private View h;
    private ImageView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private View m;
    private View n;
    private TextView o;
    private TextView p;
    private View q;
    private ShimmerLayout r;
    private ProgressBar s;
    private View t;
    private TextView u;
    private SeekBar v;
    private TextView w;
    private View x;
    private TextView y;
    private View z;

    /* compiled from: BL */
    class a extends h {
        final /* synthetic */ ClipDetailActivity a;
        private boolean b = false;
        private int c;

        a(ClipDetailActivity clipDetailActivity) {
            this.a = clipDetailActivity;
        }

        public void a(View view) {
            this.b = this.a.w();
            if (this.b) {
                this.a.C.c();
            }
        }

        public void b(View view) {
            if (this.b) {
                this.a.C.d();
            }
        }

        public void a(View view, float f) {
            super.a(view, f);
            if (f > 0.1f) {
                int i = this.a.a.c().mClipVideo.mId;
                if (i != this.c) {
                    this.a.C();
                    this.a.B = null;
                    this.a.B();
                    this.c = i;
                }
            }
        }
    }

    public static Intent a(Context context) {
        return new Intent(context, ClipDetailActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fji.a().a(this).b(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 99, (byte) 105, (byte) 106, (byte) 100, (byte) 113, (byte) 40, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 42, (byte) 118, (byte) 113, (byte) 106, (byte) 117}));
        setContentView(2131427364);
        this.C = new djl();
        this.a = new djm(this, this.C, this, getIntent());
        t();
        this.a.a(getWindow());
    }

    private void t() {
        a((Toolbar) findViewById(2131298932));
        setTitle(2131695376);
        B_().a(true);
        this.b = (RecyclerView) findViewById(2131299639);
        this.c = new DisableScrollLinearLayoutManager(this);
        this.c.f(true);
        this.b.setLayoutManager(this.c);
        this.b.setAdapter(this.a.b());
        new od().a(this.b);
        this.b.addOnScrollListener(this.D);
        this.d = findViewById(2131297303);
        this.d.setOnTouchListener(this);
        this.e = (SimpleDrawerLayout) findViewById(2131297457);
        this.e.addDrawerListener(new a(this));
        this.f = findViewById(2131300744);
        this.g = findViewById(2131296540);
        this.g.setOnClickListener(this);
        this.h = findViewById(2131296521);
        this.i = (ImageView) findViewById(2131296504);
        this.i.setOnClickListener(this);
        this.j = (TextView) findViewById(2131301125);
        this.k = (TextView) findViewById(2131299306);
        this.l = (TextView) findViewById(2131297753);
        this.l.setOnClickListener(this);
        this.m = findViewById(2131298861);
        this.m.setOnClickListener(this);
        this.n = findViewById(2131296658);
        this.o = (TextView) findViewById(2131300499);
        this.o.setOnClickListener(this);
        this.p = (TextView) findViewById(2131298252);
        this.p.setOnClickListener(this);
        this.q = findViewById(2131299441);
        this.q.setOnClickListener(this);
        this.r = (ShimmerLayout) findViewById(2131299986);
        this.s = (ProgressBar) findViewById(2131299436);
        this.t = findViewById(2131299895);
        this.u = (TextView) findViewById(2131297204);
        this.v = (SeekBar) findViewById(2131299894);
        this.v.setOnSeekBarChangeListener(this.F);
        this.v.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.w = (TextView) findViewById(2131300783);
        this.x = findViewById(2131297064);
        this.x.setOnClickListener(this);
        this.y = (TextView) findViewById(2131297050);
        this.z = findViewById(2131299959);
        this.z.setOnClickListener(this);
        this.a.a();
    }

    public void onBackPressed() {
        if (this.e.isDrawerOpen(8388613)) {
            this.e.closeDrawer(8388613);
            return;
        }
        if (this.C.b() != null) {
            Fragment b = this.C.b();
            if ((b instanceof cwr) && !((cwr) b).h()) {
                return;
            }
        }
        this.a.a(this);
        super.onBackPressed();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    public boolean c_() {
        return super.c_();
    }

    public void a(ClipVideoItem clipVideoItem) {
        cmq.a(this, this.i, clipVideoItem.mClipUser.mHeadUrl, 2131233502);
        this.j.setText(clipVideoItem.mClipUser.mName);
        if (this.a.b().b(clipVideoItem)) {
            this.k.setText("- -");
        } else {
            this.k.setText(com.b(clipVideoItem.mClipVideo.mWatchedNum));
        }
        if (clipVideoItem.mClipUser.mUid == eva.a(this).i()) {
            this.l.setVisibility(8);
        } else {
            if (clipVideoItem.mClipUser.mUid == 0) {
                this.l.setText(2131690668);
                this.l.setTextColor(ej.c(this, 2131100013));
                this.l.setBackgroundDrawable(ej.a(this, 2131235167));
            } else if (clipVideoItem.mClipUser.isFollowed) {
                this.l.setText(2131690662);
                this.l.setTextColor(ej.c(this, 2131101031));
                this.l.setBackgroundDrawable(ej.a(this, 2131235168));
            } else {
                this.l.setText(2131690668);
                this.l.setTextColor(ej.c(this, 2131101023));
                this.l.setBackgroundDrawable(ej.a(this, 2131235165));
            }
            this.l.setVisibility(0);
        }
        List list = clipVideoItem.mClipVideo.mTagLists;
        if (list == null || list.size() <= 0) {
            this.o.setVisibility(8);
        } else {
            String str = (String) list.get(0);
            CharSequence spannableString = new SpannableString("# " + str + " #");
            spannableString.setSpan(new ForegroundColorSpan(ej.c(this, 2131100412)), 0, 2, 18);
            spannableString.setSpan(new ForegroundColorSpan(ej.c(this, 2131100412)), str.length() + 2, str.length() + 4, 18);
            this.o.setText(spannableString);
            this.o.setVisibility(0);
        }
        this.p.setText(dlw.a(this).a(clipVideoItem.mClipVideo.mDesc, this.p, 24.0f, 3));
        if (this.a.b().b(clipVideoItem)) {
            this.y.setText("- -");
        } else {
            this.y.setText(com.b(clipVideoItem.mClipVideo.mCommentNum));
        }
        this.s.setMax(clipVideoItem.mClipVideo.mVideoTime * 1000);
        this.s.setProgress(0);
        this.v.setMax(clipVideoItem.mClipVideo.mVideoTime * 1000);
        this.v.setProgress(0);
    }

    public bl.dji.a h() {
        u findViewHolderForAdapterPosition = this.b.findViewHolderForAdapterPosition(this.c.n());
        if (findViewHolderForAdapterPosition instanceof bl.dji.a) {
            return (bl.dji.a) findViewHolderForAdapterPosition;
        }
        return null;
    }

    public void onClick(View view) {
        int id = view.getId();
        if (!this.A && id != 2131296540) {
            return;
        }
        if (id == 2131296540) {
            onBackPressed();
        } else if (id == 2131296504) {
            this.a.f();
        } else if (id == 2131297753) {
            this.a.e();
        } else if (id == 2131298861) {
            this.a.d();
        } else if (id == 2131300499) {
            this.a.g();
        } else if (id == 2131297064) {
            this.e.openDrawer(8388613);
        } else if (id == 2131299441 || id == 2131298252) {
            y();
        } else if (id == 2131299959) {
            this.a.h();
        }
    }

    private void u() {
        this.C.c();
    }

    private void v() {
        this.C.a();
    }

    private boolean w() {
        return this.C.e();
    }

    private boolean x() {
        return this.C.b() != null;
    }

    protected void onStop() {
        super.onStop();
    }

    protected void onPause() {
        super.onPause();
        u();
    }

    protected void onDestroy() {
        super.onDestroy();
        v();
    }

    public int k() {
        return this.c.n();
    }

    public void b(int i) {
        if (!this.E) {
            this.s.setProgress(i);
            this.v.setProgress(i);
            this.u.setText(mqf.a((long) i));
        }
    }

    public void a(String str, String str2) {
        this.u.setText(str);
        this.w.setText(str2);
    }

    public void a(long j) {
        ShimmerLayout shimmerLayout = this.r;
        ShimmerLayout shimmerLayout2 = this.r;
        shimmerLayout2.getClass();
        shimmerLayout.postDelayed(djg.a(shimmerLayout2), j);
    }

    public void b(long j) {
        ShimmerLayout shimmerLayout = this.r;
        ShimmerLayout shimmerLayout2 = this.r;
        shimmerLayout2.getClass();
        shimmerLayout.postDelayed(djh.a(shimmerLayout2), j);
    }

    public void a(int i, boolean z) {
        if (z) {
            this.b.smoothScrollToPosition(i);
        } else {
            this.b.scrollToPosition(i);
        }
    }

    public boolean l() {
        return this.e.isDrawerOpen(8388613);
    }

    public void a_(int i) {
        esu.b(this, i);
    }

    public void a(String str) {
        esu.b(this, str);
    }

    public long m() {
        return this.b.getItemAnimator().g();
    }

    public void a(boolean z) {
        this.A = z;
    }

    public void n() {
        this.f.setVisibility(4);
        this.n.setVisibility(4);
        this.c.f(false);
    }

    public void o() {
        this.f.setVisibility(0);
        this.n.setVisibility(0);
        this.c.f(true);
    }

    public void p() {
        this.e.setDrawerLockMode(1, 8388613);
    }

    public void q() {
        this.e.setDrawerLockMode(0, 8388613);
    }

    public void r() {
        this.l.setEnabled(false);
    }

    public void b(boolean z) {
        this.l.setEnabled(true);
        if (z) {
            this.l.setText(2131690662);
            this.l.setTextColor(ej.c(this, 2131101031));
            this.l.setBackgroundDrawable(ej.a(this, 2131235168));
            return;
        }
        this.l.setText(2131690668);
        this.l.setTextColor(ej.c(this, 2131101023));
        this.l.setBackgroundDrawable(ej.a(this, 2131235165));
    }

    public void s() {
        if (VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(4614);
        }
    }

    private void y() {
        if (this.r.getVisibility() == 0 && x()) {
            A();
        } else {
            z();
        }
    }

    private void z() {
        ObjectAnimator.ofFloat(this.t, hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{1.0f, 0.0f}).setDuration(200).addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ ClipDetailActivity a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.q.setEnabled(false);
            }

            public void onAnimationEnd(Animator animator) {
                this.a.t.setVisibility(4);
            }
        });
        ObjectAnimator.ofFloat(this.r, hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{0.0f, 1.0f}).setDuration(200).addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ ClipDetailActivity a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.r.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
                this.a.q.setEnabled(true);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{r0, r1});
        animatorSet.start();
    }

    private void A() {
        this.s.removeCallbacks(this.G);
        ObjectAnimator.ofFloat(this.r, hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{1.0f, 0.0f}).setDuration(200).addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ ClipDetailActivity a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.q.setEnabled(false);
            }

            public void onAnimationEnd(Animator animator) {
                this.a.r.setVisibility(4);
            }
        });
        ObjectAnimator.ofFloat(this.t, hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{0.0f, 1.0f}).setDuration(200).addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ ClipDetailActivity a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.t.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
                this.a.q.setEnabled(true);
                this.a.q.postDelayed(this.a.G, 3000);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{r0, r1});
        animatorSet.start();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.t.getVisibility() == 0) {
            return this.v.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public void onGlobalLayout() {
        if (this.d.getWidth() != this.v.getWidth() || this.d.getHeight() != this.v.getHeight()) {
            Rect rect = new Rect();
            this.d.getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            this.v.getGlobalVisibleRect(rect2, new Point(rect.left, rect.top));
            LayoutParams layoutParams = (LayoutParams) this.d.getLayoutParams();
            layoutParams.width = rect2.width();
            layoutParams.height = rect2.height();
            layoutParams.setMargins(rect2.left, rect2.top, 0, 0);
            this.d.setLayoutParams(layoutParams);
        }
    }

    private void B() {
        if (this.a.c().mClipVideo.mId > 0) {
            this.B = (aqp) axv.a(this, new bl.axv.a().a(5).a((long) this.a.c().mClipVideo.mId).a());
            getSupportFragmentManager().beginTransaction().replace(2131299750, this.B).commitNowAllowingStateLoss();
        }
    }

    private void C() {
        if (this.B != null) {
            getSupportFragmentManager().beginTransaction().remove(this.B).commitNowAllowingStateLoss();
        }
    }
}
