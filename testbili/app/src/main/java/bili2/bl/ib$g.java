package bili2.bl;

import android.support.annotation.RequiresApi;
import android.view.View;

@RequiresApi(23)
/* compiled from: BL */
class ib$g extends ib$f {
    ib$g() {
    }

    public void a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    public void c(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public void d(View view, int i) {
        view.offsetTopAndBottom(i);
    }
}
