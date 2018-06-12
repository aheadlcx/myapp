package bili2.bl;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final /* synthetic */ class lmh implements OnClickListener {
    private final lmf a;
    private final Context b;
    private final long c;
    private final gnc d;

    lmh(lmf bl_lmf, Context context, long j, gnc bl_gnc) {
        this.a = bl_lmf;
        this.b = context;
        this.c = j;
        this.d = bl_gnc;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b, this.c, this.d, dialogInterface, i);
    }
}
