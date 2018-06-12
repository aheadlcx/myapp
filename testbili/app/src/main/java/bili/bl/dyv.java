package bili.bl;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import bl.edc.a;

/* compiled from: BL */
public class dyv extends FrameLayout {
    View a;
    View b;
    View c;
    View d;
    View e;
    View f;
    View g;
    View h;
    private ViewGroup i;
    private boolean j = false;
    private a k;
    private AnimatorListener l = new AnimatorListenerAdapter(this) {
        final /* synthetic */ dyv a;

        {
            this.a = r1;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.j = false;
            this.a.a.setVisibility(4);
            this.a.setBackgroundColor(0);
            if (this.a.k != null) {
                this.a.k.a(2001);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.a.j = true;
            this.a.a.setVisibility(0);
            this.a.setBackgroundColor(Integer.MIN_VALUE);
            this.a.c();
        }
    };

    public dyv(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(2131428172, this);
        this.a = findViewById(2131297096);
        this.b = findViewById(2131297711);
        this.c = findViewById(2131297712);
        this.d = findViewById(2131297978);
        this.e = findViewById(2131298851);
        this.f = findViewById(2131300802);
        this.g = findViewById(2131298852);
        this.h = findViewById(2131297544);
        b();
        setLayoutParams(new LayoutParams(-1, -1));
    }

    private void b() {
        Context context = getContext();
        this.b.setPivotX(0.0f);
        this.b.setPivotY(coq.a(context, 17.5f));
        this.c.setPivotX(0.0f);
        this.c.setPivotY(coq.a(context, 10.2f));
        this.d.setPivotX(coq.a(context, 100.8f));
        this.d.setPivotY(coq.a(context, 35.0f));
        this.e.setPivotX(coq.a(context, 61.6f));
        this.e.setPivotY(coq.a(context, 60.9f));
        this.f.setPivotX(coq.a(context, 42.7f));
        this.f.setPivotY(coq.a(context, 52.5f));
        this.g.setPivotX(coq.a(context, 32.9f));
        this.g.setPivotY(coq.a(context, 65.8f));
        this.h.setPivotX(coq.a(context, 35.0f));
        this.h.setPivotY(coq.a(context, 20.3f));
    }

    public void a(ViewGroup viewGroup) {
        this.i = viewGroup;
        this.i.addView(this);
    }

    public void a() {
        if (!this.j) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{getInAnimator(), getSwingAnimation(), getOutAnimator()});
            animatorSet.addListener(this.l);
            animatorSet.start();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    private void c() {
        this.b.setAlpha(0.0f);
        this.c.setAlpha(0.0f);
    }

    private Animator getInAnimator() {
        int width = getWidth() - (this.a.getWidth() / 2);
        int width2 = (getWidth() - this.a.getWidth()) / 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.a, "x", new float[]{(float) width, (float) width2}).setDuration(700);
        width2 = (getHeight() / 2) - this.a.getHeight();
        int height = (getHeight() - this.a.getHeight()) / 2;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.a, "y", new float[]{(float) width2, (float) height}).setDuration(700);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{0.3f, 1.0f}).setDuration(700);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{0.3f, 1.0f}).setDuration(700);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new float[]{-20.0f, 0.0f}).setDuration(700);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5});
        return animatorSet;
    }

    private Animator getOutAnimator() {
        int width = (getWidth() - this.a.getWidth()) / 2;
        int i = (-this.a.getWidth()) / 2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.a, "x", new float[]{(float) width, (float) i}).setDuration(400);
        i = (getHeight() - this.a.getHeight()) / 2;
        int height = (getHeight() / 2) - this.a.getHeight();
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.a, "y", new float[]{(float) i, (float) height}).setDuration(400);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{1.0f, 0.3f}).setDuration(400);
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{1.0f, 0.3f}).setDuration(400);
        ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new float[]{0.0f, 15.0f}).setDuration(400);
        new AnimatorSet().playTogether(new Animator[]{a(this.b), a(this.c)});
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3, duration4, duration5, r5});
        animatorSet.setInterpolator(new AccelerateInterpolator(1.5f));
        return animatorSet;
    }

    private Animator getSwingAnimation() {
        new AnimatorSet().playTogether(new Animator[]{a(this.d, 2.0f), a(this.e, 2.0f), a(this.f, 1.0f), a(this.g, -2.0f), a(this.h, -1.0f)});
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{r0, getWholeSwingAnimator()});
        return animatorSet;
    }

    private Animator getWholeSwingAnimator() {
        float height = (float) ((getHeight() - this.a.getHeight()) / 2);
        float a = coq.a(getContext(), 10.0f);
        Animator duration = ObjectAnimator.ofFloat(this.a, "y", new float[]{height, height + a, height, height - a, height}).setDuration(1500);
        duration.setInterpolator(new LinearInterpolator());
        return duration;
    }

    private Animator a(View view, float f) {
        return ObjectAnimator.ofFloat(view, hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new float[]{0.0f, f, 0.0f, -f, 0.0f}).setDuration(1500);
    }

    private Animator a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{0.7f, 1.0f, 0.8f, 1.0f}).setDuration(150);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{0.7f, 1.0f, 0.8f, 1.0f}).setDuration(150);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view, hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{0.5f, 1.0f, 1.0f}).setDuration(150);
        Animator animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
        return animatorSet;
    }

    public void setmIOnAnimationEventListener(a aVar) {
        this.k = aVar;
    }
}
