package bili2.bl;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.android.log.BLog;

@Deprecated
/* compiled from: BL */
public final class fju {
    private static final String a = hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 43, (byte) 109, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119, (byte) 43, (byte) 108, (byte) 107, (byte) 107, (byte) 96, (byte) 119});
    private FragmentActivity b;
    private a c;
    private c d;
    private ISharePlatformSelector e;
    private List<fkd> f = new ArrayList();
    private com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector.a g = new com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector.a(this) {
        final /* synthetic */ fju a;

        {
            this.a = r1;
        }

        public void a(SharePlatform sharePlatform) {
            this.a.a(sharePlatform);
            this.a.a();
        }
    };

    /* compiled from: BL */
    public interface a {
        Bundle a(String str);

        void b(String str);

        void c(String str);

        void d(String str);
    }

    @Deprecated
    /* compiled from: BL */
    public static class b {
        public static final String a = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96});
        public static final String b = hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 99, (byte) 100, (byte) 112, (byte) 105, (byte) 113, (byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96});
        public static final String c = hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 113, (byte) 99, (byte) 106, (byte) 119, (byte) 104});
        public static final String d = hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96});
        public static final String e = hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113});
        public static final String f = hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
        public static final String g = hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
        public static final String h = hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109});
        public static final String i = hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 118});
        public static final String j = hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 103, (byte) 104, (byte) 117});
        public static final String k = hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96});
        public static final String l = hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 113, (byte) 96, (byte) 125, (byte) 113});
        public static final String m = hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96});
        public static final String n = hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106});
        public static final String o = hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 114, (byte) 96, (byte) 103});
        public static final String p = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118});
        public static final String q = hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 109, (byte) 108, (byte) 118, (byte) 113, (byte) 106, (byte) 119, (byte) 124});
        public static final String r = hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 113, (byte) 99, (byte) 106, (byte) 119, (byte) 104});
        public static final String s = hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 112, (byte) 119, (byte) 105});
        public static final String t = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113});
        Bundle u = new Bundle();

        public b a(String str) {
            this.u.putString(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), str);
            return this;
        }

        public b b(String str) {
            this.u.putString(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113}), str);
            return this;
        }

        public b c(String str) {
            this.u.putString(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 100, (byte) 119, (byte) 98, (byte) 96, (byte) 113, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), str);
            return this;
        }

        public b d(String str) {
            this.u.putString(hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), str);
            return this;
        }

        public b e(String str) {
            this.u.putString(hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 117, (byte) 100, (byte) 113, (byte) 109}), str);
            return this;
        }

        public b f(String str) {
            this.u.putString(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), str);
            return this;
        }

        public b a(Bundle bundle) {
            this.u.putBundle(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118}), bundle);
            return this;
        }

        public Bundle a() {
            return this.u;
        }
    }

    @Deprecated
    /* compiled from: BL */
    public interface c {
        boolean a(String str);

        void b(String str);
    }

    /* compiled from: BL */
    public static abstract class d implements a {
        public void b(String str) {
        }

        public void c(String str) {
        }

        public void d(String str) {
        }
    }

    public fju(FragmentActivity fragmentActivity, a aVar) {
        this.b = fragmentActivity;
        this.c = aVar;
        this.f.add(new fkg(this.b));
        this.f.add(new fjz(this.b));
    }

    private void a() {
        if (this.e != null) {
            this.e.a();
        }
    }

    public void a(SharePlatform sharePlatform) {
        String str = sharePlatform.c;
        if (this.d == null || !this.d.a(str)) {
            Bundle a = this.c.a(str);
            if (a == null) {
                BLog.d(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 43, (byte) 109, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119, (byte) 43, (byte) 108, (byte) 107, (byte) 107, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 96, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 37, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118}));
                return;
            } else {
                a(sharePlatform, a);
                return;
            }
        }
        this.d.b(str);
    }

    public void a(SharePlatform sharePlatform, Bundle bundle) {
        String str = sharePlatform.c;
        for (fkd bl_fkd : this.f) {
            if (bl_fkd.a(str)) {
                bl_fkd.a(str, bundle, this.c);
                return;
            }
        }
    }
}
