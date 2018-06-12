package bili.bl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bilibili.bililive.videoliveplayer.ui.widget.LightView;
import com.bilibili.lib.image.ScalableImageView;

/* compiled from: BL */
public class dyt extends PopupWindow {
    LightView a;
    ScalableImageView b;
    TextView c;
    RelativeLayout d;
    private Animator e;
    private ObjectAnimator f;
    private String g;
    private String h;

    public dyt(Activity activity, String str, String str2) {
        super(activity);
        View inflate = LayoutInflater.from(activity).inflate(2131428538, null);
        setContentView(inflate);
        this.a = (LightView) inflate.findViewById(2131298527);
        this.b = (ScalableImageView) inflate.findViewById(2131297882);
        this.c = (TextView) inflate.findViewById(2131297890);
        this.d = (RelativeLayout) inflate.findViewById(2131297873);
        setWidth(-1);
        setHeight(-1);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(-1342177280));
        this.g = str;
        this.h = str2;
    }

    public void a() {
        a(-1, 180, 1000);
        fci.g().a(this.g, this.b);
        this.c.setText(this.h);
        getContentView().postDelayed(new Runnable(this) {
            final /* synthetic */ dyt a;

            {
                this.a = r1;
            }

            public void run() {
                Animator animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{this.a.b()});
                animatorSet.addListener(new AnimatorListenerAdapter(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void onAnimationStart(Animator animator) {
                        this.a.a.a(-1, 360, 2000);
                    }

                    public void onAnimationEnd(Animator animator) {
                        super.dismiss();
                    }
                });
                this.a.e = animatorSet;
                this.a.e.start();
            }
        }, 1000);
    }

    private void a(int i, int i2, int i3) {
        this.f = ObjectAnimator.ofFloat(this.a, hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new float[]{0.0f, (float) i2}).setDuration((long) i3);
        this.f.setInterpolator(new TimeInterpolator(this) {
            final /* synthetic */ dyt a;

            {
                this.a = r1;
            }

            public float getInterpolation(float f) {
                return f;
            }
        });
        this.f.setRepeatCount(i);
        this.f.addListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ dyt a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animator animator) {
                this.a.a.setVisibility(0);
            }

            public void onAnimationEnd(Animator animator) {
            }
        });
        this.f.start();
    }

    private Animator b() {
        Animator animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[3];
        animatorArr[0] = ObjectAnimator.ofFloat(this.d, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{1.0f, 0.01f});
        animatorArr[1] = ObjectAnimator.ofFloat(this.d, hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{1.0f, 0.01f});
        animatorArr[2] = ObjectAnimator.ofFloat(this.d, "y", new float[]{this.d.getY(), (float) (getContentView().getHeight() / 3)});
        animatorSet.playTogether(animatorArr);
        animatorSet.setDuration(800);
        return animatorSet;
    }

    private void c() {
        if (this.e != null) {
            if (this.e.isRunning()) {
                this.e.cancel();
            }
            this.e = null;
        }
        if (this.f != null) {
            if (this.f.isRunning()) {
                this.f.cancel();
            }
            this.f = null;
        }
    }

    public void dismiss() {
        if (getContentView() != null && ib.G(getContentView())) {
            super.dismiss();
        }
        c();
    }
}
