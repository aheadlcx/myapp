package bili2.bl;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class lei implements fit<Boolean> {
    private static final String a = hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 65, (byte) 100, (byte) 113, (byte) 100, (byte) 70, (byte) 106, (byte) 107, (byte) 97, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107});

    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public Boolean a(fjg bl_fjg) {
        boolean z = false;
        if (bl_fjg.c != null) {
            if (bl_fjg.b != null) {
                z = a(a(bl_fjg.c), bl_fjg.b);
            } else {
                BLog.w(hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 65, (byte) 100, (byte) 113, (byte) 100, (byte) 70, (byte) 106, (byte) 107, (byte) 97, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), hae.a(new byte[]{(byte) 87, (byte) 106, (byte) 112, (byte) 113, (byte) 96, (byte) 119, (byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 37, (byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 118, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 41, (byte) 37, (byte) 124, (byte) 106, (byte) 112, (byte) 37, (byte) 118, (byte) 109, (byte) 106, (byte) 112, (byte) 105, (byte) 97, (byte) 37, (byte) 118, (byte) 96, (byte) 113, (byte) 37, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 37, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 37, (byte) 36}));
            }
        }
        return Boolean.valueOf(z);
    }

    private static boolean a(Context context, @NonNull Bundle bundle) {
        String string = bundle.getString(hae.a(new byte[]{(byte) 99, (byte) 119, (byte) 96, (byte) 96, (byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 43, (byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 43, (byte) 110, (byte) 96, (byte) 124, (byte) 43, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 43, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113}));
        if (hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102}).equalsIgnoreCase(string)) {
            return b(context);
        }
        if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 114, (byte) 100, (byte) 113, (byte) 102, (byte) 109}).equalsIgnoreCase(string)) {
            return c(context);
        }
        if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 117, (byte) 112, (byte) 118, (byte) 109}).equalsIgnoreCase(string)) {
            return d(context);
        }
        if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97}).equalsIgnoreCase(string)) {
            return c(context);
        }
        if (hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 40, (byte) 102, (byte) 105, (byte) 108, (byte) 117, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106}).equalsIgnoreCase(string)) {
            return c(context);
        }
        if (hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107}).equalsIgnoreCase(string)) {
            return e(context);
        }
        if (hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 40, (byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 40, (byte) 119, (byte) 96, (byte) 115, (byte) 108, (byte) 96, (byte) 114}).equalsIgnoreCase(string)) {
            return f(context);
        }
        if (hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 40, (byte) 102, (byte) 106, (byte) 105, (byte) 112, (byte) 104, (byte) 107}).equalsIgnoreCase(string)) {
            return f(context);
        }
        if (hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 40, (byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119}).equalsIgnoreCase(string)) {
            return f(context);
        }
        if (hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 40, (byte) 115, (byte) 108, (byte) 117, (byte) 40, (byte) 104, (byte) 100, (byte) 105, (byte) 105}).equalsIgnoreCase(string)) {
            return f(context);
        }
        if (hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 108, (byte) 107, (byte) 113, (byte) 108, (byte) 107, (byte) 98}).equalsIgnoreCase(string)) {
            return g(context);
        }
        if (hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109, (byte) 40, (byte) 96, (byte) 100, (byte) 118, (byte) 113, (byte) 96, (byte) 119, (byte) 40, (byte) 96, (byte) 98, (byte) 98}).equalsIgnoreCase(string)) {
            return h(context);
        }
        if (hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 40, (byte) 112, (byte) 117, (byte) 105, (byte) 106, (byte) 100, (byte) 97}).equalsIgnoreCase(string)) {
            return i(context);
        }
        BLog.e(hae.a(new byte[]{(byte) 67, (byte) 119, (byte) 96, (byte) 96, (byte) 65, (byte) 100, (byte) 113, (byte) 100, (byte) 70, (byte) 106, (byte) 107, (byte) 97, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 37, (byte) 108, (byte) 107, (byte) 115, (byte) 106, (byte) 110, (byte) 96, (byte) 37, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113, (byte) 37, (byte) 104, (byte) 100, (byte) 113, (byte) 102, (byte) 109, (byte) 96, (byte) 97, (byte) 36}));
        return false;
    }

    private static Context a(Context context) {
        return ((context instanceof Application) || (context instanceof Service)) ? context : context.getApplicationContext();
    }

    private static boolean b(Context context) {
        return lea.d(context);
    }

    private static boolean c(Context context) {
        return lea.f(context);
    }

    private static boolean d(Context context) {
        return lea.g(context);
    }

    private static boolean e(Context context) {
        return lea.h(context);
    }

    private static boolean f(Context context) {
        return kro.J() && lea.i(context);
    }

    private static boolean g(Context context) {
        return lea.b(context);
    }

    private static boolean h(Context context) {
        return lea.j(context);
    }

    private static boolean i(Context context) {
        return lea.b(context);
    }
}
