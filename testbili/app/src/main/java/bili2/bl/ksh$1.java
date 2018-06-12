package bili2.bl;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.concurrent.Callable;

/* compiled from: BL */
class ksh$1 implements Callable<Void> {
    final /* synthetic */ String a;

    ksh$1(String str) {
        this.a = str;
    }

    @SuppressLint({"ApplySharedPref"})
    public /* synthetic */ Object call() throws Exception {
        return a();
    }

    @SuppressLint({"ApplySharedPref"})
    public Void a() throws Exception {
        SharedPreferences a = blh.a(blg.a()).a();
        if (!a.getBoolean(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 112, (byte) 117, (byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 90}) + this.a, false)) {
            synchronized (ksh.class) {
                Editor edit = a.edit();
                edit.putBoolean(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 112, (byte) 117, (byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 90}) + this.a, true);
                edit.commit();
            }
        }
        return null;
    }
}
