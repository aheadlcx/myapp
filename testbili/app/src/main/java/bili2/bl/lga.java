package bili2.bl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: BL */
public class lga implements fit<Intent> {
    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public Intent a(fjg bl_fjg) {
        if (bl_fjg.c != null) {
            return a(bl_fjg.c, bl_fjg.b);
        }
        throw new NullPointerException(hae.a(new byte[]{(byte) 76, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 112, (byte) 118, (byte) 96, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113}));
    }

    private Intent a(Context context, Bundle bundle) {
        boolean z = true;
        String string = bundle.getString("uri");
        if (string == null) {
            return null;
        }
        Uri parse = Uri.parse(string);
        if (bundle.getInt(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 106, (byte) 107, (byte) 105, (byte) 124}), 1) != 1) {
            z = false;
        }
        return lgd.a(context, parse, z);
    }
}
