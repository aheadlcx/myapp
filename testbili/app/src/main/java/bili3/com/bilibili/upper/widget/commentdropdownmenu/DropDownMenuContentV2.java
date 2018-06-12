package bili3.com.bilibili.upper.widget.commentdropdownmenu;

import a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl.fnd;
import bl.hae;
import bl.hik;
import bl.hil;
import bl.his;
import bl.hit;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout.b;

/* compiled from: BL */
public class DropDownMenuContentV2 extends RelativeLayout {
    private View a;
    private int b;
    private int c;
    private RecyclerView d;
    private ImageView e;
    private SwipeRefreshLayout f;
    private View g;
    private Animation h;
    private Animation i;
    private Animation j;
    private Animation k;
    private boolean l;

    public DropDownMenuContentV2(Context context) {
        this(context, null, 0);
    }

    public DropDownMenuContentV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DropDownMenuContentV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1;
        a(context, attributeSet);
        LayoutInflater.from(context).inflate(2131428175, this, true);
        this.d = (RecyclerView) findViewById(2131299639);
        this.d.setBackgroundColor(this.c);
        this.f = (SwipeRefreshLayout) findViewById(2131300286);
        this.f.setColorSchemeColors(new int[]{fnd.a(context, 2131100837)});
        this.e = (ImageView) findViewById(2131298656);
        this.a = findViewById(2131298735);
        this.g = LayoutInflater.from(context).inflate(2131428097, this, false);
        a();
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.as);
            if (obtainStyledAttributes != null) {
                this.c = obtainStyledAttributes.getColor(0, Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 96, (byte) 100, (byte) 96, (byte) 100, (byte) 96, (byte) 100})));
                obtainStyledAttributes.recycle();
            }
        }
    }

    public View getMask() {
        return this.a;
    }

    public int getSpanCount() {
        return this.b;
    }

    public void setSpanCount(int i) {
        this.b = i;
    }

    public void setContentBgColor(int i) {
        this.c = i;
        this.d.setBackgroundColor(this.c);
    }

    public void a(LayoutManager layoutManager, RecyclerView.a aVar, hit bl_hit, b bVar) {
        if (!(aVar == null || layoutManager == null)) {
            this.d.setLayoutManager(layoutManager);
            this.d.setAdapter(aVar);
        }
        if (bl_hit != null) {
            this.d.clearOnScrollListeners();
            this.d.addOnScrollListener(bl_hit);
            this.f.setOnRefreshListener(bVar);
        } else {
            this.d.clearOnScrollListeners();
            this.f.setOnRefreshListener(null);
        }
        e();
        i();
        if ((aVar instanceof hil) || (aVar instanceof hik)) {
            this.d.getLayoutParams().height = -2;
            this.f.setEnabled(false);
        } else if (aVar instanceof his) {
            this.d.getLayoutParams().height = getResources().getDimensionPixelOffset(2131166040);
            this.d.requestLayout();
            ((his) aVar).a(this.g);
            this.f.setEnabled(true);
        }
    }

    public void a() {
        this.h = n();
        this.j = o();
        this.i = p();
        this.i.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ DropDownMenuContentV2 a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animation animation) {
                this.a.l = true;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.r();
                this.a.l = false;
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.k = q();
        this.k.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ DropDownMenuContentV2 a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animation animation) {
                this.a.l = true;
                this.a.e.setVisibility(8);
            }

            public void onAnimationEnd(Animation animation) {
                this.a.l = false;
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
    }

    private Animation n() {
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200);
        alphaAnimation.setFillAfter(false);
        return alphaAnimation;
    }

    private Animation o() {
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setDuration(200);
        alphaAnimation.setFillAfter(false);
        return alphaAnimation;
    }

    private Animation p() {
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(false);
        return translateAnimation;
    }

    private Animation q() {
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setDuration(200);
        translateAnimation.setFillAfter(false);
        return translateAnimation;
    }

    public void b() {
        if (!d() && !this.l) {
            this.a.setVisibility(0);
            this.a.startAnimation(this.h);
            this.d.setVisibility(0);
            this.d.startAnimation(this.i);
        }
    }

    public void c() {
        if (d() && !this.l) {
            this.a.startAnimation(this.j);
            this.a.setVisibility(8);
            this.d.startAnimation(this.k);
            this.d.setVisibility(8);
        }
    }

    public boolean d() {
        if (this.d == null || this.d.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void e() {
        if (this.g != null) {
            this.g.setVisibility(8);
        }
    }

    public void f() {
        if (this.g != null) {
            this.g.setOnClickListener(null);
            this.g.setVisibility(0);
            this.g.findViewById(2131298656).setVisibility(0);
            ((TextView) this.g.findViewById(2131300554)).setText(2131695825);
        }
    }

    public void g() {
        if (this.g != null) {
            this.g.setOnClickListener(null);
            this.g.setVisibility(0);
            this.g.findViewById(2131298656).setVisibility(8);
            ((TextView) this.g.findViewById(2131300554)).setText(2131695840);
        }
    }

    public void h() {
        if (this.g != null) {
            this.g.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ DropDownMenuContentV2 a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                }
            });
            this.g.setVisibility(0);
            this.g.findViewById(2131298656).setVisibility(8);
            ((TextView) this.g.findViewById(2131300554)).setText(2131695824);
        }
    }

    public void i() {
        Drawable drawable = this.e.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        this.e.setVisibility(8);
    }

    public void j() {
        l();
        r();
        this.e.setImageResource(2131234242);
    }

    public void k() {
        l();
        r();
        this.e.setImageResource(2131234245);
    }

    public void l() {
        Drawable drawable = this.e.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
    }

    public void m() {
        if (this.f != null && this.f.b()) {
            this.f.setRefreshing(false);
        }
    }

    private void r() {
        RecyclerView.a adapter = this.d.getAdapter();
        if (!(adapter instanceof his)) {
            this.e.setVisibility(8);
        } else if (adapter.a() > 1) {
            this.e.setVisibility(8);
        } else {
            this.e.setVisibility(0);
        }
    }
}
