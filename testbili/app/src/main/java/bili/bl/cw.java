package bili.bl;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewOverlay;

@RequiresApi(18)
/* compiled from: BL */
class cw implements cx {
    private final ViewOverlay a;

    cw(@NonNull View view) {
        this.a = view.getOverlay();
    }

    public void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    public void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }
}
