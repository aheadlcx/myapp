package bili.bl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

/* compiled from: BL */
public class eas {
    private Context a;
    private ViewStub b;
    private LinearLayout c;
    private ImageView d;
    private TextView e;
    private Button f;
    private LinearLayout g;

    public eas(Context context, ViewStub viewStub) {
        this.a = context.getApplicationContext();
        this.b = viewStub;
    }

    public void a(final Runnable runnable) {
        b();
        b(new Runnable(this) {
            final /* synthetic */ eas b;

            public void run() {
                this.b.c.postDelayed(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                }, this.b.a().getDuration());
            }
        });
        d();
    }

    @NonNull
    public Animation a() {
        b();
        this.c.clearAnimation();
        Animation loadAnimation = AnimationUtils.loadAnimation(this.a, 2130772016);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            final /* synthetic */ eas a;

            {
                this.a = r1;
            }

            public void onAnimationStart(Animation animation) {
                this.a.c.setVisibility(0);
            }

            public void onAnimationEnd(Animation animation) {
                this.a.c.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.c.startAnimation(loadAnimation);
        return loadAnimation;
    }

    private void b() {
        if (this.g == null && this.b.getParent() != null) {
            View inflate = this.b.inflate();
            this.c = (LinearLayout) ButterKnife.a(inflate, 2131297565);
            this.d = (ImageView) ButterKnife.a(inflate, 2131297563);
            this.e = (TextView) ButterKnife.a(inflate, 2131297567);
            this.f = (Button) ButterKnife.a(inflate, 2131297559);
            this.g = (LinearLayout) ButterKnife.a(inflate, 2131297560);
            this.c.setBackgroundDrawable(null);
        }
    }

    private void b(final Runnable runnable) {
        c();
        this.d.setImageResource(2131234254);
        this.e.setText(2131696028);
        this.f.setText(2131694672);
        this.f.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ eas b;

            public void onClick(View view) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    private void c() {
        this.e.setVisibility(0);
        this.e.setText(2131696028);
        this.f.setEnabled(true);
        int dimension = (int) this.a.getResources().getDimension(2131165508);
        ((MarginLayoutParams) this.e.getLayoutParams()).topMargin = 0;
        ((MarginLayoutParams) this.g.getLayoutParams()).leftMargin = dimension;
        ((MarginLayoutParams) this.f.getLayoutParams()).topMargin = dimension / 2;
        this.g.requestLayout();
    }

    private Animation d() {
        this.c.clearAnimation();
        this.c.setVisibility(0);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.a, 2130772015);
        this.c.startAnimation(loadAnimation);
        return loadAnimation;
    }
}
