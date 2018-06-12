package bili.bl;

import android.view.View;
import android.view.View.OnFocusChangeListener;

final /* synthetic */ class dwq implements OnFocusChangeListener {
    private final dwp a;

    dwq(dwp bl_dwp) {
        this.a = bl_dwp;
    }

    public void onFocusChange(View view, boolean z) {
        this.a.a(view, z);
    }
}
