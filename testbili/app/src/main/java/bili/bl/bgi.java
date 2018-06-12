package bili.bl;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final /* synthetic */ class bgi implements OnClickListener {
    static final OnClickListener a = new bgi();

    private bgi() {
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
