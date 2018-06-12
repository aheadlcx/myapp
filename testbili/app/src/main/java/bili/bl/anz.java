package bili.bl;

import android.content.Context;
import java.io.File;

/* compiled from: BL */
class anz {
    static final String a = hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96});
    static final String b = hae.a(new byte[]{(byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 113, (byte) 104, (byte) 117});
    static final String c = hae.a(new byte[]{(byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 105, (byte) 106, (byte) 102, (byte) 110});
    static final String d = hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
    static final String e = hae.a(new byte[]{(byte) 115, (byte) 96, (byte) 119, (byte) 118, (byte) 108, (byte) 106, (byte) 107});
    static final String f = hae.a(new byte[]{(byte) 96, (byte) 113, (byte) 108, (byte) 104, (byte) 96});
    static final String g = hae.a(new byte[]{(byte) 97, (byte) 113, (byte) 108, (byte) 104, (byte) 96});
    static final String h = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
    static final String i = hae.a(new byte[]{(byte) 96, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 108, (byte) 107, (byte) 98});
    static final String j = hae.a(new byte[]{(byte) 104, (byte) 108, (byte) 104, (byte) 96, (byte) 81, (byte) 124, (byte) 117, (byte) 96});
    static final String k = hae.a(new byte[]{(byte) 112, (byte) 113, (byte) 99, (byte) 40, (byte) 61});
    private static volatile anz l;
    private Context m;
    private final boolean n = false;
    private final File o;
    private final File p;
    private final File q;

    public static anz a(Context context) {
        if (l == null) {
            l = new anz(context);
        }
        return l;
    }

    private anz(Context context) {
        this.m = context.getApplicationContext();
        File file = new File(this.m.getDir("bh", 0), hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96}));
        b(file);
        this.o = file;
        File file2 = new File(this.o, hae.a(new byte[]{(byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 113, (byte) 104, (byte) 117}));
        b(file2);
        this.p = file2;
        file2 = new File(this.o, hae.a(new byte[]{(byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 105, (byte) 106, (byte) 102, (byte) 110}));
        b(file2);
        this.q = file2;
    }

    private void b(File file) {
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public boolean a() {
        return this.n;
    }

    public File b() {
        return this.o;
    }

    public File c() {
        return this.p;
    }

    public gt d() {
        return new gt(this.m.getFileStreamPath(hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107})));
    }

    public boolean a(File file) {
        String name = file.getName();
        return name.equals(hae.a(new byte[]{(byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 113, (byte) 104, (byte) 117})) || name.equals(hae.a(new byte[]{(byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 90, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 90, (byte) 105, (byte) 106, (byte) 102, (byte) 110}));
    }

    private String b(String str) {
        String a = esf.a(str);
        return a == null ? str : a;
    }

    public String a(String str, int i) {
        return b(str + i) + ".zip";
    }

    public String b(String str, int i) {
        File file = new File(this.p, String.valueOf(str));
        b(file);
        return file.getAbsolutePath() + File.separator + a(str, i);
    }

    public String c(String str, int i) {
        File file = new File(this.p, String.valueOf(str));
        b(file);
        File file2 = new File(file, String.valueOf(i));
        b(file2);
        return file2.getAbsolutePath();
    }

    public String a(String str) {
        return str + File.separator + hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
    }

    public String d(String str, int i) {
        return this.q.getAbsolutePath() + File.separator + str;
    }

    public String e(String str, int i) {
        File file = new File(this.o, String.valueOf(str));
        b(file);
        File file2 = new File(file, String.valueOf(i));
        b(file2);
        return file2.getAbsolutePath();
    }

    public String f(String str, int i) {
        return e(str, i) + File.separator + hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
    }
}
