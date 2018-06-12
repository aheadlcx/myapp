package bili.bl;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.animation.Interpolator;
import bl.ene.a;
import java.lang.ref.WeakReference;

/* compiled from: BL */
final class eng extends ene {
    WeakReference<Animator> b;

    eng(Animator animator, end bl_end) {
        super(bl_end);
        this.b = new WeakReference(animator);
    }

    public void a() {
        Animator animator = (Animator) this.b.get();
        if (animator != null) {
            animator.start();
        }
    }

    public void a(int i) {
        Animator animator = (Animator) this.b.get();
        if (animator != null) {
            animator.setDuration((long) i);
        }
    }

    public void a(Interpolator interpolator) {
        Animator animator = (Animator) this.b.get();
        if (animator != null) {
            animator.setInterpolator(interpolator);
        }
    }

    public void a(final a aVar) {
        Animator animator = (Animator) this.b.get();
        if (animator != null) {
            if (aVar == null) {
                animator.addListener(null);
            } else {
                animator.addListener(new AnimatorListener(this) {
                    final /* synthetic */ eng b;

                    public void onAnimationStart(Animator animator) {
                        aVar.a();
                    }

                    public void onAnimationEnd(Animator animator) {
                        aVar.b();
                    }

                    public void onAnimationCancel(Animator animator) {
                        aVar.c();
                    }

                    public void onAnimationRepeat(Animator animator) {
                        aVar.d();
                    }
                });
            }
        }
    }
}
