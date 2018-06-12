package bili2.bl;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import bl.ful.AnonymousClass1;

final /* synthetic */ class fuo implements AnimatorUpdateListener {
    private final AnonymousClass1 a;
    private final int b;

    fuo(AnonymousClass1 anonymousClass1, int i) {
        this.a = anonymousClass1;
        this.b = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(this.b, valueAnimator);
    }
}
