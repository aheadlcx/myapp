package bili.bl;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;

/* compiled from: BL */
public class bbt {
    public static void a(final View view) {
        view.setVisibility(0);
        view.clearAnimation();
        Animation animationSet = new AnimationSet(true);
        animationSet.addAnimation(AnimationUtils.loadAnimation(view.getContext(), 2130771984));
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), 2130771985);
        loadAnimation.setStartOffset(1500);
        animationSet.addAnimation(loadAnimation);
        animationSet.setAnimationListener(new AnimationListener() {
            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
            }

            public void onAnimationRepeat(Animation animation) {
            }
        });
        view.startAnimation(animationSet);
    }
}
