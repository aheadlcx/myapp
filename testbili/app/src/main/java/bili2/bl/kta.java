package bili2.bl;

import android.text.format.DateUtils;

/* compiled from: BL */
public final class kta extends bli {
    private static final String a = hae.a(new byte[]{(byte) 96, (byte) 107, (byte) 115, (byte) 108, (byte) 119, (byte) 106, (byte) 107, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 118});
    private static final String b = hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 119, (byte) 112, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96});
    private static final String c = hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96});
    private static final String d = hae.a(new byte[]{(byte) 105, (byte) 100, (byte) 118, (byte) 113, (byte) 90, (byte) 119, (byte) 112, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96});
    private static final String e = hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 115, (byte) 108, (byte) 97});
    private static final String f = hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96});
    private static final String g = hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 90, (byte) 108, (byte) 97});
    private static final String h = hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 96, (byte) 102, (byte) 110, (byte) 90, (byte) 112, (byte) 117, (byte) 97, (byte) 100, (byte) 113, (byte) 96});
    private static final String i = hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107});
    private static final String j = hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 97});
    private static final String k = hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 90, (byte) 108, (byte) 97});
    private static final String l = hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 108, (byte) 104, (byte) 96, (byte) 108});

    public static kta c() {
        return new kta();
    }

    private kta() {
        super(blg.a(), hae.a(new byte[]{(byte) 96, (byte) 107, (byte) 115, (byte) 108, (byte) 119, (byte) 106, (byte) 107, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 118}));
    }

    long d() {
        return a().getLong(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 119, (byte) 112, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), 0);
    }

    void a(long j) {
        a().edit().putLong(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 119, (byte) 112, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), j).apply();
    }

    public long e() {
        return a().getLong(hae.a(new byte[]{(byte) 105, (byte) 100, (byte) 118, (byte) 113, (byte) 90, (byte) 119, (byte) 112, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), 0);
    }

    public long f() {
        long j = 0;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long e = e();
            if (0 != e && currentTimeMillis >= e) {
                j = (currentTimeMillis - e) / 1000;
            }
        } catch (Exception e2) {
        }
        return j;
    }

    public void g() {
        a().edit().putLong(hae.a(new byte[]{(byte) 105, (byte) 100, (byte) 118, (byte) 113, (byte) 90, (byte) 119, (byte) 112, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), System.currentTimeMillis()).apply();
    }

    public String h() {
        return a().getString(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 115, (byte) 108, (byte) 97}), gmy.d);
    }

    public void b(String str) {
        a().edit().putString(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 115, (byte) 108, (byte) 97}), str).apply();
    }

    public void b(long j) {
        a().edit().putLong(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), j).apply();
    }

    public long i() {
        return a().getLong(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), 0);
    }

    public String j() {
        return a().getString(hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 90, (byte) 108, (byte) 97}), null);
    }

    public synchronized void c(String str) {
        a().edit().putString(hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 90, (byte) 108, (byte) 97}), str).apply();
    }

    public boolean k() {
        long i = i();
        return i == 0 || !DateUtils.isToday(i);
    }

    public String l() {
        return a().getString("guid", gmy.d);
    }

    public void d(String str) {
        a().edit().putString("guid", str).apply();
    }

    public String m() {
        return a().getString(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 90, (byte) 108, (byte) 97}), gmy.d);
    }

    public void e(String str) {
        a().edit().putString(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 90, (byte) 108, (byte) 97}), str).apply();
    }

    public String n() {
        return a().getString(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 108, (byte) 104, (byte) 96, (byte) 108}), gmy.d);
    }

    public void f(String str) {
        a().edit().putString(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 108, (byte) 104, (byte) 96, (byte) 108}), str).apply();
    }
}
