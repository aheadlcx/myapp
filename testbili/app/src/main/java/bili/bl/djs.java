package bili.bl;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

final /* synthetic */ class djs implements OnDismissListener {
    private final a a;

    djs(a aVar) {
        this.a = aVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.a.b();
    }
}
