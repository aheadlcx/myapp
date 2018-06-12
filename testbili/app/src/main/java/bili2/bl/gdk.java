package bili2.bl;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final /* synthetic */ class gdk implements OnClickListener {
    private final gdj a;
    private final Activity b;

    gdk(gdj bl_gdj, Activity activity) {
        this.a = bl_gdj;
        this.b = activity;
    }

    public void onClick(View view) {
        this.a.a(this.b, view);
    }
}
