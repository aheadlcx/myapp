package bili2.bl;

import android.content.Context;
import android.provider.Settings.System;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.zip.Adler32;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: BL */
public class iwc {
    private static final Object b = new Object();
    private static iwc c = null;
    private static final String j = (".UTSystemConfig" + File.separator + "Global");
    private Context a = null;
    private String d = null;
    private iwd e = null;
    private String f = "xx_utdid_key";
    private String g = "xx_utdid_domain";
    private ivw h = null;
    private ivw i = null;
    private Pattern k = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public iwc(Context context) {
        this.a = context;
        this.i = new ivw(context, j, "Alvin2", false, true);
        this.h = new ivw(context, ".DataStorage", "ContextData", false, true);
        this.e = new iwd();
        this.f = String.format("K_%d", new Object[]{Integer.valueOf(ivt.b(this.f))});
        this.g = String.format("D_%d", new Object[]{Integer.valueOf(ivt.b(this.g))});
    }

    public static iwc a(Context context) {
        if (context != null && c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new iwc(context);
                }
            }
        }
        return c;
    }

    static long a(ivz bl_ivz) {
        if (bl_ivz != null) {
            String format = String.format("%s%s%s%s%s", new Object[]{bl_ivz.e(), bl_ivz.d(), Long.valueOf(bl_ivz.a()), bl_ivz.c(), bl_ivz.b()});
            if (!ivt.a(format)) {
                Adler32 adler32 = new Adler32();
                adler32.reset();
                adler32.update(format.getBytes());
                return adler32.getValue();
            }
        }
        return 0;
    }

    private void a(String str) {
        if (f(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && this.i != null) {
                String a = this.i.a("UTDID");
                String a2 = this.i.a("EI");
                if (ivt.a(a2)) {
                    a2 = ivs.a(this.a);
                }
                String a3 = this.i.a("SI");
                if (ivt.a(a3)) {
                    a3 = ivs.b(this.a);
                }
                String a4 = this.i.a("DID");
                if (ivt.a(a4)) {
                    a4 = a2;
                }
                if (a == null || !a.equals(str)) {
                    ivz bl_ivz = new ivz();
                    bl_ivz.a(a2);
                    bl_ivz.b(a3);
                    bl_ivz.d(str);
                    bl_ivz.c(a4);
                    bl_ivz.b(java.lang.System.currentTimeMillis());
                    this.i.a("UTDID", str);
                    this.i.a("EI", bl_ivz.b());
                    this.i.a("SI", bl_ivz.c());
                    this.i.a("DID", bl_ivz.d());
                    this.i.a("timestamp", bl_ivz.a());
                    this.i.a("S", a(bl_ivz));
                    this.i.a();
                }
            }
        }
    }

    private void b(String str) {
        if (str != null && this.h != null && !str.equals(this.h.a(this.f))) {
            this.h.a(this.f, str);
            this.h.a();
        }
    }

    private void c(String str) {
        if (this.a.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && f(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !f(java.lang.System.getString(this.a.getContentResolver(), "mqBRboGZkQPcAkyk"))) {
                java.lang.System.putString(this.a.getContentResolver(), "mqBRboGZkQPcAkyk", str);
            }
        }
    }

    private void d(String str) {
        if (!str.equals(java.lang.System.getString(this.a.getContentResolver(), "dxCRMxhQkdGePGnp"))) {
            java.lang.System.putString(this.a.getContentResolver(), "dxCRMxhQkdGePGnp", str);
        }
    }

    private void e(String str) {
        if (this.a.checkCallingOrSelfPermission("android.permission.WRITE_SETTINGS") == 0 && str != null) {
            d(str);
        }
    }

    private String b() {
        if (this.i != null) {
            String a = this.i.a("UTDID");
            if (!(ivt.a(a) || this.e.a(a) == null)) {
                return a;
            }
        }
        return null;
    }

    private boolean f(String str) {
        if (str == null) {
            return false;
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        if (24 != str.length() || this.k.matcher(str).find()) {
            return false;
        }
        return true;
    }

    public synchronized String a() {
        String str;
        if (this.d != null) {
            str = this.d;
        } else {
            str = java.lang.System.getString(this.a.getContentResolver(), "mqBRboGZkQPcAkyk");
            if (!f(str)) {
                iwe bl_iwe = new iwe();
                Object obj = null;
                String string = java.lang.System.getString(this.a.getContentResolver(), "dxCRMxhQkdGePGnp");
                if (ivt.a(string)) {
                    obj = 1;
                } else {
                    str = bl_iwe.b(string);
                    if (f(str)) {
                        c(str);
                    } else {
                        str = bl_iwe.a(string);
                        if (f(str)) {
                            str = this.e.a(str);
                            if (!ivt.a(str)) {
                                e(str);
                                str = java.lang.System.getString(this.a.getContentResolver(), "dxCRMxhQkdGePGnp");
                                string = this.e.b(str);
                                if (f(string)) {
                                    this.d = string;
                                    a(string);
                                    b(str);
                                    c(this.d);
                                    str = this.d;
                                }
                            }
                        }
                        str = string;
                        string = this.e.b(str);
                        if (f(string)) {
                            this.d = string;
                            a(string);
                            b(str);
                            c(this.d);
                            str = this.d;
                        }
                    }
                }
                str = b();
                if (f(str)) {
                    string = this.e.a(str);
                    if (obj != null) {
                        e(string);
                    }
                    c(str);
                    b(string);
                    this.d = str;
                } else {
                    string = this.h.a(this.f);
                    if (!ivt.a(string)) {
                        str = bl_iwe.a(string);
                        if (!f(str)) {
                            str = this.e.b(string);
                        }
                        if (f(str)) {
                            string = this.e.a(str);
                            if (!ivt.a(str)) {
                                this.d = str;
                                if (obj != null) {
                                    e(string);
                                }
                                a(this.d);
                                str = this.d;
                            }
                        }
                    }
                    try {
                        byte[] c = c();
                        if (c != null) {
                            this.d = ivq.b(c, 2);
                            a(this.d);
                            str = this.e.a(c);
                            if (str != null) {
                                if (obj != null) {
                                    e(str);
                                }
                                b(str);
                            }
                            str = this.d;
                        }
                    } catch (Throwable e) {
                        ibn.a(e);
                    }
                    str = null;
                }
            }
        }
        return str;
    }

    private final byte[] c() throws Exception {
        String a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] a2 = ivr.a(currentTimeMillis);
        byte[] a3 = ivr.a(nextInt);
        byteArrayOutputStream.write(a2, 0, 4);
        byteArrayOutputStream.write(a3, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            a = ivs.a(this.a);
        } catch (Exception e) {
            a = gmy.d + new Random().nextInt();
        }
        byteArrayOutputStream.write(ivr.a(ivt.b(a)), 0, 4);
        a = gmy.d;
        byteArrayOutputStream.write(ivr.a(ivt.b(a(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private static String a(byte[] bArr) throws Exception {
        Mac instance = Mac.getInstance("HmacSHA1");
        instance.init(new SecretKeySpec("d6fc3a4a06adbde89223bvefedc24fecde188aaa9161".getBytes(), instance.getAlgorithm()));
        return ivq.b(instance.doFinal(bArr), 2);
    }
}
