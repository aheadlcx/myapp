package bili.bl;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@RequiresApi(18)
/* compiled from: BL */
class cp implements cq {
    private final ViewGroupOverlay a;

    cp(@NonNull ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }

    public void a(@NonNull Drawable drawable) {
        this.a.add(drawable);
    }

    public void b(@NonNull Drawable drawable) {
        this.a.remove(drawable);
    }

    public void a(@NonNull View view) {
        this.a.add(view);
    }

    public void b(@NonNull View view) {
        this.a.remove(view);
    }
}
