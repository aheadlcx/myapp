package bili3.com.bilibili.bilibililive.ui.livestreaming.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl.chi;
import bl.chn;
import bl.cig;
import bl.ckv;
import bl.cla;
import bl.cnn;
import bl.coa;
import bl.cob;
import bl.coo;
import bl.cow;
import bl.hae;
import bl.ibn;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: BL */
public class FloatDanmakuView extends LinearLayout implements bl.cig.a, bl.ckw.b {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private long F;
    private chi G;
    private Runnable H;
    private boolean I;
    private a J;
    private int K;
    private long L;
    private int M;
    private int N;
    private Paint O;
    private int P;
    private ckv Q;
    private cig R;
    private f S;
    private OnTouchListener T;
    private Size U;
    private int V;
    private Rect W;
    ImageView a;
    private OnClickListener aa;
    ImageView b;
    ImageView c;
    ImageView d;
    ImageView e;
    View[] f;
    View g;
    View h;
    View i;
    TextView j;
    TextView k;
    RecyclerView l;
    TextView m;
    View n;
    TextView o;
    TextView p;
    private cla q;
    private WindowManager r;
    private LayoutParams s;
    private d t;
    private LayoutInflater u;
    private float v;
    private float w;
    private int x;
    private boolean y;
    private int z;

    /* compiled from: BL */
    static class ArrayList<E> extends java.util.ArrayList<E> {
        public ArrayList(int i) {
            super(i);
        }

        public void removeRange(int i, int i2) {
            super.removeRange(i, i2);
        }
    }

    /* compiled from: BL */
    static class CustomerLayoutManager extends LinearLayoutManager {
        public CustomerLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
        }

        public void a(Recycler recycler, r rVar, int i, int i2) {
            if (rVar.e() == 0) {
                g(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
                return;
            }
            View c = recycler.c(0);
            if (c != null) {
                a(c, i, i2);
                g(MeasureSpec.getSize(i), c.getMeasuredHeight());
            }
        }
    }

    /* compiled from: BL */
    class a extends android.support.v7.widget.RecyclerView.a<c> {
        final /* synthetic */ FloatDanmakuView a;
        private b b;

        private a(FloatDanmakuView floatDanmakuView) {
            this.a = floatDanmakuView;
            this.b = new b();
        }

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public c a(ViewGroup viewGroup, int i) {
            c cVar = new c(this.a.u.inflate(2131428955, viewGroup, false));
            cVar.n.setTextColor(this.a.K);
            cVar.o.setTextColor(this.a.K);
            return cVar;
        }

        public void a(c cVar, int i) {
            chi a = this.b.a(i);
            cVar.n.setText(a.d);
            cVar.p.setText(a.a);
        }

        public int a() {
            return this.b.a();
        }

        public void a(chi bl_chi) {
            this.b.a(bl_chi);
        }
    }

    /* compiled from: BL */
    static class b {
        private ArrayList<chi> a;

        private b() {
            this.a = new ArrayList(20);
        }

        public chi a(int i) {
            return (chi) this.a.get((this.a.size() - i) - 1);
        }

        public void a(chi bl_chi) {
            if (this.a.size() == 20) {
                this.a.removeRange(0, 11);
            }
            this.a.add(bl_chi);
        }

        public int a() {
            if (this.a.size() >= 10) {
                return 10;
            }
            return this.a.size();
        }
    }

    /* compiled from: BL */
    static class c extends u {
        private TextView n;
        private TextView o;
        private TextView p;

        public c(View view) {
            super(view);
            this.n = (TextView) view.findViewById(2131298903);
            this.o = (TextView) view.findViewById(2131297025);
            this.p = (TextView) view.findViewById(2131300551);
        }
    }

    /* compiled from: BL */
    public interface d {
        void b(boolean z);

        void g();
    }

    /* compiled from: BL */
    static class e implements TimeInterpolator {
        e() {
        }

        public float getInterpolation(float f) {
            return 1.0f - f;
        }
    }

    /* compiled from: BL */
    class f {
        final /* synthetic */ FloatDanmakuView a;
        private int b;
        private int c;
        private Timer d;

        /* compiled from: BL */
        class a extends TimerTask {
            final /* synthetic */ f a;

            a(f fVar) {
                this.a = fVar;
            }

            public void run() {
                this.a.a.post(new Runnable(this) {
                    final /* synthetic */ a a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        if (this.a.a.b == 1) {
                            this.a.a.d();
                        }
                    }
                });
            }
        }

        private f(FloatDanmakuView floatDanmakuView) {
            this.a = floatDanmakuView;
            this.b = 0;
            this.c = 0;
        }

        private void a() {
            if (this.b == 2) {
                e();
            } else if (this.b == 0) {
                g();
            } else {
                d();
            }
        }

        private void b() {
            this.a.b.setImageResource(this.c == 2 ? 2131233088 : 2131233087);
            if (this.c == 2) {
                f();
            } else if (this.c == 0) {
                h();
            }
        }

        private void c() {
            d();
        }

        private void d() {
            j();
            if (this.c == 2) {
                h();
            } else if (this.c == 0) {
                f();
            }
        }

        private void e() {
            this.c = this.b;
            this.b = 1;
            this.a.c(2);
            i();
        }

        private void f() {
            this.c = 1;
            this.b = 0;
            this.a.q();
        }

        private void g() {
            this.c = this.b;
            this.b = 1;
            this.a.c(0);
            i();
        }

        private void h() {
            this.c = 1;
            this.b = 2;
            this.a.r();
        }

        private void i() {
            if (this.b == 1) {
                j();
                this.d = new Timer();
                this.d.schedule(new a(this), 3000);
            }
        }

        private void j() {
            if (this.d != null) {
                this.d.cancel();
                this.d = null;
            }
        }
    }

    public FloatDanmakuView(Context context) {
        this(context, null);
    }

    public FloatDanmakuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatDanmakuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.F = 0;
        this.G = null;
        this.I = false;
        this.M = 0;
        this.S = new f();
        this.T = new OnTouchListener(this) {
            final /* synthetic */ FloatDanmakuView a;

            {
                this.a = r1;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                int id = view.getId();
                if (id == 2131300748 || id == 2131297259 || id == 2131301111 || id == 2131301254 || id == 2131298208) {
                    return this.a.a(view, motionEvent);
                }
                if (id == 2131298205 || id == 2131298184 || id == 2131298195 || id == 2131298207) {
                    return this.a.b(view, motionEvent);
                }
                return false;
            }
        };
        this.U = null;
        this.V = 0;
        this.W = new Rect(0, 0, 0, 0);
        this.aa = new OnClickListener(this) {
            final /* synthetic */ FloatDanmakuView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                int id = view.getId();
                if (id == 2131298208) {
                    this.a.b();
                } else if (id == 2131298184) {
                    this.a.c();
                } else if (id == 2131298195) {
                    this.a.d();
                } else if (id == 2131298207) {
                    this.a.p();
                } else if (id == 2131298205) {
                    this.a.e();
                } else if (id == 2131297259) {
                    this.a.f();
                }
            }
        };
        a(context);
        b(context);
    }

    private void j() {
        this.a = (ImageView) findViewById(2131298208);
        this.b = (ImageView) findViewById(2131298184);
        this.c = (ImageView) findViewById(2131298207);
        this.d = (ImageView) findViewById(2131298195);
        this.e = (ImageView) findViewById(2131298205);
        this.g = findViewById(2131301143);
        this.h = findViewById(2131301144);
        this.i = findViewById(2131300748);
        this.j = (TextView) findViewById(2131297259);
        this.k = (TextView) findViewById(2131301254);
        this.l = (RecyclerView) findViewById(2131299639);
        this.m = (TextView) findViewById(2131297242);
        this.n = findViewById(2131296658);
        this.o = (TextView) findViewById(2131301111);
        this.p = (TextView) findViewById(2131297025);
        this.f = new View[]{this.a, this.b, this.c, this.d, this.e};
        this.i.setOnTouchListener(this.T);
        this.j.setOnTouchListener(this.T);
        this.o.setOnTouchListener(this.T);
        this.k.setOnTouchListener(this.T);
        this.a.setOnTouchListener(this.T);
        this.e.setOnTouchListener(this.T);
        this.b.setOnTouchListener(this.T);
        this.c.setOnTouchListener(this.T);
        this.d.setOnTouchListener(this.T);
        this.a.setOnClickListener(this.aa);
        this.b.setOnClickListener(this.aa);
        this.c.setOnClickListener(this.aa);
        this.d.setOnClickListener(this.aa);
        this.e.setOnClickListener(this.aa);
        this.j.setOnClickListener(this.aa);
    }

    private void a(Context context) {
        this.u = LayoutInflater.from(context);
        setOrientation(1);
        this.u.inflate(2131429091, this);
        this.q = new cla(context);
        j();
        this.r = (WindowManager) context.getSystemService(hae.a(new byte[]{(byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114}));
        this.z = 10;
        this.A = 0;
        int a = coa.a(context);
        this.E = context.getResources().getDimensionPixelOffset(2131165416);
        this.B = coa.a(context, 300.0f);
        this.C = k();
        this.D = context.getResources().getDimensionPixelOffset(2131165424);
        this.x = context.getResources().getDimensionPixelSize(2131165422);
        this.K = cnn.c();
        this.o.setTextColor(this.K);
        this.p.setTextColor(this.K);
        this.s = new LayoutParams();
        if (coo.a(26)) {
            this.s.type = 2038;
        } else if (coo.a(23)) {
            this.s.type = 2003;
        } else {
            this.s.type = 2005;
        }
        this.s.format = 1;
        this.s.flags = 520;
        this.s.gravity = 8388659;
        this.s.width = this.B;
        this.s.height = -2;
        this.s.x = (a - this.B) / 2;
        this.N = this.B;
        this.O = new Paint(1);
        this.O.setColor(-434628326);
        this.P = context.getResources().getDimensionPixelSize(2131165423);
        setWillNotDraw(false);
    }

    private void b(Context context) {
        a(0);
        setKeepScreenOn(true);
        this.i.setPadding(this.E, 0, 0, 0);
        this.g.setX((float) this.E);
        this.h.setX((float) (this.E * (this.f.length - 1)));
        this.l.setLayoutManager(new CustomerLayoutManager(context, 1, false));
        this.J = new a();
        this.l.setAdapter(this.J);
        this.m.setText(context.getString(2131695190, new Object[]{Integer.valueOf(this.z)}));
        this.L = System.currentTimeMillis();
    }

    private int k() {
        return this.E * this.f.length;
    }

    public void a() {
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.r.addView(this, this.s);
    }

    public void a(chi bl_chi) {
        if (this.G != null) {
            this.J.a(this.G);
        } else {
            this.p.setVisibility(0);
        }
        this.G = bl_chi;
        if (System.currentTimeMillis() - this.F > 300) {
            l();
        } else {
            m();
        }
    }

    private void l() {
        this.o.setText(this.G.d);
        this.j.setText(this.G.a);
        this.J.f();
        this.F = System.currentTimeMillis();
        this.H = null;
    }

    private void m() {
        if (this.H == null) {
            this.H = new Runnable(this) {
                final /* synthetic */ FloatDanmakuView a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.H == this) {
                        this.a.l();
                    }
                }
            };
            postDelayed(this.H, 300);
        }
    }

    public void a(chn bl_chn) {
        if (bl_chn != null) {
            final chi bl_chi = new chi();
            bl_chi.a = bl_chn.b(this.K);
            bl_chi.d = bl_chn.a;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                final /* synthetic */ FloatDanmakuView b;

                public void run() {
                    this.b.a(bl_chi);
                }
            });
        }
    }

    public void a(int i) {
        if (i > this.M) {
            this.M = i;
        }
        this.k.setText(getContext().getString(2131696076, new Object[]{Integer.valueOf(i)}));
    }

    public void b(int i) {
    }

    public void setCommandListener(d dVar) {
        this.t = dVar;
    }

    public void a(boolean z) {
        this.d.setImageResource(z ? 2131233089 : 2131233090);
    }

    protected void onConfigurationChanged(Configuration configuration) {
        this.U = null;
        n();
        this.r.updateViewLayout(this, this.s);
    }

    public boolean a(View view, MotionEvent motionEvent) {
        if (view.getId() == 2131298208) {
            b(view, motionEvent);
        }
        switch (motionEvent.getAction()) {
            case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                this.v = motionEvent.getX() + view.getX();
                this.w = motionEvent.getY() + view.getY();
                this.y = false;
                this.S.j();
                break;
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                this.S.i();
                break;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                break;
        }
        float x = motionEvent.getX() + view.getX();
        float y = motionEvent.getY() + view.getY();
        if (!this.y && a(this.v, this.w, x, y) > ((float) this.x)) {
            this.y = true;
        }
        if (this.y) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = ((int) motionEvent.getRawY()) - getStatusBarHeight();
            this.s.x = (int) (((float) rawX) - this.v);
            this.s.y = (int) (((float) rawY) - this.w);
            n();
            this.r.updateViewLayout(this, this.s);
        }
        return false;
    }

    private static float a(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt((double) (((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4))));
    }

    public boolean b(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                if (view != this.a) {
                    this.S.j();
                }
                a(view);
                break;
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                if (view != this.a) {
                    this.S.i();
                }
                b(view);
                break;
        }
        return false;
    }

    private void a(View view) {
        a(view, true).start();
    }

    private void b(View view) {
        a(view, false).start();
    }

    private Animator a(View view, boolean z) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{1.0f, 0.88f}).setDuration(200);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{1.0f, 0.88f}).setDuration(200);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2});
        if (!z) {
            animatorSet.setInterpolator(new e());
        }
        return animatorSet;
    }

    @TargetApi(21)
    private void n() {
        Rect mainRect = getMainRect();
        Size floatViewAvailableSize = getFloatViewAvailableSize();
        if (this.s.x + mainRect.left < 0) {
            this.s.x = -mainRect.left;
        } else if (this.s.x + mainRect.right > floatViewAvailableSize.getWidth()) {
            this.s.x = floatViewAvailableSize.getWidth() - mainRect.right;
        }
        if (this.s.y + mainRect.top < 0) {
            this.s.y = -mainRect.top;
        } else if (this.s.y + mainRect.bottom > floatViewAvailableSize.getHeight()) {
            this.s.y = floatViewAvailableSize.getHeight() - mainRect.bottom;
        }
    }

    @TargetApi(21)
    private Size getFloatViewAvailableSize() {
        if (this.U == null) {
            Display defaultDisplay = ((WindowManager) getContext().getSystemService(hae.a(new byte[]{(byte) 114, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114}))).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            this.U = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels - getStatusBarHeight());
        }
        return this.U;
    }

    private int getStatusBarHeight() {
        if (this.V == 0) {
            this.V = coa.c(getContext());
        }
        return this.V;
    }

    private Rect getMainRect() {
        this.W.right = this.N;
        this.W.bottom = getHeight();
        return this.W;
    }

    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(0.0f, 0.0f, (float) Math.min(this.N, canvas.getWidth()), (float) canvas.getHeight(), (float) this.P, (float) this.P, this.O);
    }

    private void o() {
        cow.a(this.a, 300);
        cow.a(this.b, 300);
        cow.a(this.d, 300);
        cow.a(this.e, 300);
    }

    public void b() {
        o();
        if (!this.y) {
            s();
            this.S.a();
        }
    }

    public void c() {
        o();
        this.S.b();
    }

    @TargetApi(21)
    private void p() {
        o();
        this.S.c();
        if (this.Q == null) {
            this.Q = new ckv(getContext());
        } else {
            this.Q = new ckv(this.Q);
        }
        this.Q.create();
        this.Q.a(this);
        cob.a(this.Q, true);
        this.Q.show();
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.q.b();
            return;
        }
        this.q.setTopicText(str);
        if (!this.q.a()) {
            this.q.a(this.Q.a());
        }
    }

    public void d() {
        o();
        this.S.c();
        if (this.t != null) {
            this.t.g();
        }
    }

    public void e() {
        o();
        this.S.c();
        g();
    }

    public void f() {
        if (!this.y) {
            if (this.I) {
                u();
            } else if (this.J.a() != 0) {
                t();
            }
        }
    }

    private void q() {
        d(this.B);
        this.a.setImageResource(2131233085);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{c(false), e(this.B)});
        animatorSet.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ FloatDanmakuView a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.h.setVisibility(4);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.a.i.setVisibility(0);
            }
        });
        animatorSet.start();
    }

    private void c(final int i) {
        boolean z = false;
        this.i.setVisibility(8);
        this.a.setImageResource(2131233084);
        if (i == 2) {
            d(this.C);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[2];
        animatorArr[0] = e(this.C);
        if (i == 2) {
            z = true;
        }
        animatorArr[1] = b(z);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ FloatDanmakuView b;

            public void onAnimationStart(Animator animator) {
                if (i == 0) {
                    this.b.h.setVisibility(4);
                }
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (i == 2) {
                    this.b.g.setVisibility(0);
                    this.b.h.setVisibility(0);
                } else if (i == 0) {
                    this.b.d(this.b.C);
                    this.b.h.setVisibility(0);
                }
            }
        });
        animatorSet.start();
    }

    private void r() {
        this.a.setImageResource(2131233085);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{c(true), e(this.D)});
        animatorSet.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ FloatDanmakuView a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.g.setVisibility(4);
                this.a.h.setVisibility(4);
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                this.a.d(this.a.D);
                this.a.a.setX(0.0f);
            }
        });
        animatorSet.start();
    }

    private void d(int i) {
        this.s.width = i;
        try {
            this.r.updateViewLayout(this, this.s);
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    private Animator b(boolean z) {
        Collection arrayList = new java.util.ArrayList();
        float f = z ? (float) ((this.D - this.E) / 2) : 0.0f;
        for (int i = 0; i < this.f.length; i++) {
            arrayList.add(ObjectAnimator.ofFloat(this.f[i], "x", new float[]{f, (float) f(i)}).setDuration(300));
            if (i != 0) {
                arrayList.add(ObjectAnimator.ofFloat(this.f[i], hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{0.0f, 1.0f}).setDuration(300));
            }
        }
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    private Animator c(boolean z) {
        Animator b = b(z);
        b.setInterpolator(new e());
        return b;
    }

    private Animator e(int i) {
        final Animator duration = ValueAnimator.ofInt(new int[]{this.N, i}).setDuration(300);
        duration.addUpdateListener(new AnimatorUpdateListener(this) {
            final /* synthetic */ FloatDanmakuView b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.b.N = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                this.b.n();
                try {
                    this.b.r.updateViewLayout(this.b, this.b.s);
                } catch (IllegalArgumentException e) {
                    duration.cancel();
                }
                this.b.invalidate();
            }
        });
        return duration;
    }

    private int f(int i) {
        return this.E * i;
    }

    private void s() {
        if (this.I) {
            u();
        }
    }

    private void t() {
        this.l.setVisibility(0);
        this.n.setVisibility(0);
        this.I = true;
    }

    private void u() {
        this.l.setVisibility(8);
        this.n.setVisibility(8);
        this.I = false;
    }

    public void d(boolean z) {
        if (this.t != null) {
            this.t.b(z);
        }
        this.R = null;
    }

    public void g() {
        if (this.R == null || !this.R.isShowing()) {
            this.R = new cig(getContext());
            this.R.a(this);
            cob.a(this.R, true);
            this.R.show();
        }
    }

    public boolean h() {
        return this.R != null;
    }

    public void i() {
        try {
            this.r.removeView(this);
            this.q.b();
            if (this.Q != null) {
                this.Q.dismiss();
            }
        } catch (IllegalArgumentException e) {
            setVisibility(8);
        }
    }

    public int getMaxOnLines() {
        return this.M;
    }

    public int getLiveTimeInSeconds() {
        return (int) ((System.currentTimeMillis() - this.L) / 1000);
    }
}
