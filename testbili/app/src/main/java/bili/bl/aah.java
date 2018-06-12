package bili.bl;

import android.support.graphics.drawable.animated.BuildConfig;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: BL */
public class aah implements aaw {
    public final aai a;
    private final aau[] b;
    private final aau[] c;
    private final Class<?> d;

    public aah(aan bl_aan, Class<?> cls, Type type) {
        this(bl_aan, cls, type, aai.a(cls, cls.getModifiers(), type, false, true, true, true));
    }

    public aah(aan bl_aan, Class<?> cls, Type type, aai bl_aai) {
        int i;
        int i2 = 0;
        this.d = cls;
        this.a = bl_aai;
        this.c = new aau[bl_aai.f.length];
        int length = bl_aai.f.length;
        for (i = 0; i < length; i++) {
            this.c[i] = bl_aan.a(bl_aan, cls, bl_aai.f[i]);
        }
        this.b = new aau[bl_aai.e.length];
        i = bl_aai.e.length;
        while (i2 < i) {
            this.b[i2] = a(bl_aai.e[i2].a);
            i2++;
        }
    }

    protected Object a(aad bl_aad, Type type) {
        int i = 0;
        if ((type instanceof Class) && this.d.isInterface()) {
            Class cls = (Class) type;
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, new JSONObject((bl_aad.c.c & Feature.OrderedField.mask) != 0));
        } else if (this.a.a == null) {
            return null;
        } else {
            try {
                Object newInstance;
                Constructor constructor = this.a.a;
                if (this.a.b == 0) {
                    newInstance = constructor.newInstance(new Object[0]);
                } else {
                    newInstance = constructor.newInstance(new Object[]{bl_aad.d.a});
                }
                if (bl_aad == null || (bl_aad.c.c & Feature.InitStringFieldAsEmpty.mask) == 0) {
                    return newInstance;
                }
                aca[] bl_acaArr = this.a.e;
                int length = bl_acaArr.length;
                while (i < length) {
                    aca bl_aca = bl_acaArr[i];
                    if (bl_aca.f == String.class) {
                        bl_aca.a(newInstance, BuildConfig.VERSION_NAME);
                    }
                    i++;
                }
                return newInstance;
            } catch (Throwable e) {
                throw new JSONException("create instance error, class " + this.d.getName(), e);
            }
        }
    }

    public <T> T a(aad bl_aad, Type type, Object obj) {
        return b(bl_aad, type, obj, null);
    }

    private <T> T a(aad bl_aad, Type type, Object obj, Object obj2) {
        aaf bl_aaf = bl_aad.c;
        Object a = a(bl_aad, type);
        int length = this.c.length;
        int i = 0;
        while (i < length) {
            char c;
            int i2 = i == length + -1 ? 93 : 44;
            aau bl_aau = this.c[i];
            aca bl_aca = bl_aau.b;
            Class cls = bl_aca.f;
            if (cls == Integer.TYPE) {
                i2 = (int) bl_aaf.v();
                if (bl_aca.d) {
                    bl_aca.c.setInt(a, i2);
                } else {
                    bl_aau.a(a, new Integer(i2));
                }
                if (bl_aaf.d == ',') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        try {
                            c = bl_aaf.o.charAt(i2);
                        } catch (Throwable e) {
                            throw new JSONException("set " + bl_aca.a + "error", e);
                        }
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 16;
                } else if (bl_aaf.d == ']') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 15;
                } else {
                    bl_aaf.f();
                }
            } else if (cls == String.class) {
                if (bl_aaf.d == '\"') {
                    r2 = bl_aaf.b('\"');
                } else if (bl_aaf.d == 'n' && bl_aaf.o.startsWith("null", bl_aaf.e)) {
                    bl_aaf.e += 4;
                    i2 = bl_aaf.e;
                    if (bl_aaf.e >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    r2 = null;
                } else {
                    throw new JSONException("not match string. feild : " + obj);
                }
                if (bl_aca.d) {
                    bl_aca.c.set(a, r2);
                } else {
                    bl_aau.a(a, r2);
                }
                if (bl_aaf.d == ',') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 16;
                } else if (bl_aaf.d == ']') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 15;
                } else {
                    bl_aaf.f();
                }
            } else if (cls == Long.TYPE) {
                long v = bl_aaf.v();
                if (bl_aca.d) {
                    bl_aca.c.setLong(a, v);
                } else {
                    bl_aau.a(a, new Long(v));
                }
                if (bl_aaf.d == ',') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 16;
                } else if (bl_aaf.d == ']') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 15;
                } else {
                    bl_aaf.f();
                }
            } else if (cls == Boolean.TYPE) {
                boolean t = bl_aaf.t();
                if (bl_aca.d) {
                    bl_aca.c.setBoolean(a, t);
                } else {
                    bl_aau.a(a, Boolean.valueOf(t));
                }
                if (bl_aaf.d == ',') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 16;
                } else if (bl_aaf.d == ']') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 15;
                } else {
                    bl_aaf.f();
                }
            } else if (cls.isEnum()) {
                c = bl_aaf.d;
                if (c == '\"') {
                    String a2 = bl_aaf.a(bl_aad.a);
                    if (a2 == null) {
                        r2 = null;
                    } else {
                        r2 = Enum.valueOf(cls, a2);
                    }
                } else if (c < '0' || c > '9') {
                    throw new JSONException("illegal enum." + bl_aaf.j());
                } else {
                    r2 = ((aae) ((aac) bl_aau).a(bl_aad.b)).a[(int) bl_aaf.v()];
                }
                bl_aau.a(a, r2);
                if (bl_aaf.d == ',') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 16;
                } else if (bl_aaf.d == ']') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 15;
                } else {
                    bl_aaf.f();
                }
            } else if (cls == Date.class && bl_aaf.d == '1') {
                bl_aau.a(a, new Date(bl_aaf.v()));
                if (bl_aaf.d == ',') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 16;
                } else if (bl_aaf.d == ']') {
                    i2 = bl_aaf.e + 1;
                    bl_aaf.e = i2;
                    if (i2 >= bl_aaf.p) {
                        c = '\u001a';
                    } else {
                        c = bl_aaf.o.charAt(i2);
                    }
                    bl_aaf.d = c;
                    bl_aaf.a = 15;
                } else {
                    bl_aaf.f();
                }
            } else {
                int i3;
                char c2;
                if (bl_aaf.d == '[') {
                    i3 = bl_aaf.e + 1;
                    bl_aaf.e = i3;
                    if (i3 >= bl_aaf.p) {
                        c2 = '\u001a';
                    } else {
                        c2 = bl_aaf.o.charAt(i3);
                    }
                    bl_aaf.d = c2;
                    bl_aaf.a = 14;
                } else if (bl_aaf.d == '{') {
                    i3 = bl_aaf.e + 1;
                    bl_aaf.e = i3;
                    if (i3 >= bl_aaf.p) {
                        c2 = '\u001a';
                    } else {
                        c2 = bl_aaf.o.charAt(i3);
                    }
                    bl_aaf.d = c2;
                    bl_aaf.a = 12;
                } else {
                    bl_aaf.f();
                }
                bl_aau.a(bl_aad, a, bl_aca.g, null);
                if (i2 == 93) {
                    if (bl_aaf.a != 15) {
                        throw new JSONException("syntax error");
                    }
                } else if (i2 == 44 && bl_aaf.a != 16) {
                    throw new JSONException("syntax error");
                }
            }
            i++;
        }
        if (bl_aaf.d == ',') {
            i2 = bl_aaf.e + 1;
            bl_aaf.e = i2;
            if (i2 >= bl_aaf.p) {
                c = '\u001a';
            } else {
                c = bl_aaf.o.charAt(i2);
            }
            bl_aaf.d = c;
            bl_aaf.a = 16;
        } else {
            bl_aaf.f();
        }
        return a;
    }

    private <T> T b(bl.aad r30, Type r31, Object r32, Object r33) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:bl.aah.b(bl.aad, java.lang.reflect.Type, java.lang.Object, java.lang.Object):T. bs: [B:100:0x0198, B:364:0x06fe, B:378:0x0748]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
*/
        /*
        r29 = this;
        r4 = bl.zy.class;
        r0 = r31;
        if (r0 == r4) goto L_0x000c;
    L_0x0006:
        r4 = com.alibaba.fastjson.JSONObject.class;
        r0 = r31;
        if (r0 != r4) goto L_0x0011;
    L_0x000c:
        r33 = r30.g();
    L_0x0010:
        return r33;
    L_0x0011:
        r0 = r30;
        r0 = r0.c;
        r23 = r0;
        r0 = r23;
        r6 = r0.a;
        r4 = 8;
        if (r6 != r4) goto L_0x0029;
    L_0x001f:
        r4 = 16;
        r0 = r23;
        r0.b(r4);
        r33 = 0;
        goto L_0x0010;
    L_0x0029:
        r0 = r23;
        r0 = r0.r;
        r24 = r0;
        r0 = r30;
        r4 = r0.d;
        if (r33 == 0) goto L_0x07be;
    L_0x0035:
        if (r4 == 0) goto L_0x07be;
    L_0x0037:
        r4 = r4.b;
        r10 = r4;
    L_0x003a:
        r5 = 0;
        r9 = 0;
        r4 = 13;
        if (r6 != r4) goto L_0x0059;
    L_0x0040:
        r4 = 16;
        r0 = r23;	 Catch:{ all -> 0x00f5 }
        r0.b(r4);	 Catch:{ all -> 0x00f5 }
        if (r33 != 0) goto L_0x004d;	 Catch:{ all -> 0x00f5 }
    L_0x0049:
        r33 = r29.a(r30, r31);	 Catch:{ all -> 0x00f5 }
    L_0x004d:
        if (r5 == 0) goto L_0x0053;
    L_0x004f:
        r0 = r33;
        r5.a = r0;
    L_0x0053:
        r0 = r30;
        r0.a(r10);
        goto L_0x0010;
    L_0x0059:
        r4 = 14;
        if (r6 != r4) goto L_0x0087;
    L_0x005d:
        r0 = r29;	 Catch:{ all -> 0x00f5 }
        r4 = r0.a;	 Catch:{ all -> 0x00f5 }
        r4 = r4.i;	 Catch:{ all -> 0x00f5 }
        if (r4 != 0) goto L_0x0070;	 Catch:{ all -> 0x00f5 }
    L_0x0065:
        r0 = r23;	 Catch:{ all -> 0x00f5 }
        r4 = r0.c;	 Catch:{ all -> 0x00f5 }
        r7 = com.alibaba.fastjson.parser.Feature.SupportArrayToBean;	 Catch:{ all -> 0x00f5 }
        r7 = r7.mask;	 Catch:{ all -> 0x00f5 }
        r4 = r4 & r7;	 Catch:{ all -> 0x00f5 }
        if (r4 == 0) goto L_0x0085;	 Catch:{ all -> 0x00f5 }
    L_0x0070:
        r4 = 1;	 Catch:{ all -> 0x00f5 }
    L_0x0071:
        if (r4 == 0) goto L_0x0087;	 Catch:{ all -> 0x00f5 }
    L_0x0073:
        r7 = r29.a(r30, r31, r32, r33);	 Catch:{ all -> 0x00f5 }
        if (r5 == 0) goto L_0x007d;
    L_0x0079:
        r0 = r33;
        r5.a = r0;
    L_0x007d:
        r0 = r30;
        r0.a(r10);
        r33 = r7;
        goto L_0x0010;
    L_0x0085:
        r4 = 0;
        goto L_0x0071;
    L_0x0087:
        r4 = 12;
        if (r6 == r4) goto L_0x0102;
    L_0x008b:
        r4 = 16;
        if (r6 == r4) goto L_0x0102;
    L_0x008f:
        r4 = r23.q();	 Catch:{ all -> 0x00f5 }
        if (r4 == 0) goto L_0x00a5;
    L_0x0095:
        r7 = 0;
        if (r5 == 0) goto L_0x009c;
    L_0x0098:
        r0 = r33;
        r5.a = r0;
    L_0x009c:
        r0 = r30;
        r0.a(r10);
        r33 = r7;
        goto L_0x0010;
    L_0x00a5:
        r4 = 4;
        if (r6 != r4) goto L_0x00c5;
    L_0x00a8:
        r4 = r23.p();	 Catch:{ all -> 0x00f5 }
        r4 = r4.length();	 Catch:{ all -> 0x00f5 }
        if (r4 != 0) goto L_0x00c5;	 Catch:{ all -> 0x00f5 }
    L_0x00b2:
        r23.f();	 Catch:{ all -> 0x00f5 }
        r7 = 0;
        if (r5 == 0) goto L_0x00bc;
    L_0x00b8:
        r0 = r33;
        r5.a = r0;
    L_0x00bc:
        r0 = r30;
        r0.a(r10);
        r33 = r7;
        goto L_0x0010;
    L_0x00c5:
        r4 = new java.lang.StringBuffer;	 Catch:{ all -> 0x00f5 }
        r4.<init>();	 Catch:{ all -> 0x00f5 }
        r6 = "syntax error, expect {, actual ";	 Catch:{ all -> 0x00f5 }
        r4 = r4.append(r6);	 Catch:{ all -> 0x00f5 }
        r6 = r23.j();	 Catch:{ all -> 0x00f5 }
        r4 = r4.append(r6);	 Catch:{ all -> 0x00f5 }
        r0 = r32;	 Catch:{ all -> 0x00f5 }
        r6 = r0 instanceof java.lang.String;	 Catch:{ all -> 0x00f5 }
        if (r6 == 0) goto L_0x00eb;	 Catch:{ all -> 0x00f5 }
    L_0x00df:
        r6 = ", fieldName ";	 Catch:{ all -> 0x00f5 }
        r6 = r4.append(r6);	 Catch:{ all -> 0x00f5 }
        r0 = r32;	 Catch:{ all -> 0x00f5 }
        r6.append(r0);	 Catch:{ all -> 0x00f5 }
    L_0x00eb:
        r6 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x00f5 }
        r4 = r4.toString();	 Catch:{ all -> 0x00f5 }
        r6.<init>(r4);	 Catch:{ all -> 0x00f5 }
        throw r6;	 Catch:{ all -> 0x00f5 }
    L_0x00f5:
        r4 = move-exception;
        r7 = r33;
    L_0x00f8:
        if (r5 == 0) goto L_0x00fc;
    L_0x00fa:
        r5.a = r7;
    L_0x00fc:
        r0 = r30;
        r0.a(r10);
        throw r4;
    L_0x0102:
        r0 = r30;	 Catch:{ all -> 0x00f5 }
        r4 = r0.e;	 Catch:{ all -> 0x00f5 }
        r6 = 2;	 Catch:{ all -> 0x00f5 }
        if (r4 != r6) goto L_0x010e;	 Catch:{ all -> 0x00f5 }
    L_0x0109:
        r4 = 0;	 Catch:{ all -> 0x00f5 }
        r0 = r30;	 Catch:{ all -> 0x00f5 }
        r0.e = r4;	 Catch:{ all -> 0x00f5 }
    L_0x010e:
        r4 = 0;	 Catch:{ all -> 0x00f5 }
        r0 = r29;	 Catch:{ all -> 0x00f5 }
        r6 = r0.c;	 Catch:{ all -> 0x00f5 }
        r0 = r6.length;	 Catch:{ all -> 0x00f5 }
        r25 = r0;	 Catch:{ all -> 0x00f5 }
        r22 = r4;
        r7 = r33;
    L_0x011a:
        r11 = 0;
        r8 = 0;
        r6 = 0;
        r4 = 0;
        r0 = r22;
        r1 = r25;
        if (r0 >= r1) goto L_0x07b3;
    L_0x0124:
        r0 = r29;	 Catch:{ all -> 0x03d5 }
        r4 = r0.c;	 Catch:{ all -> 0x03d5 }
        r8 = r4[r22];	 Catch:{ all -> 0x03d5 }
        r6 = r8.b;	 Catch:{ all -> 0x03d5 }
        r4 = r6.f;	 Catch:{ all -> 0x03d5 }
        r19 = r4;	 Catch:{ all -> 0x03d5 }
        r20 = r6;	 Catch:{ all -> 0x03d5 }
        r21 = r8;	 Catch:{ all -> 0x03d5 }
    L_0x0134:
        r8 = 0;	 Catch:{ all -> 0x03d5 }
        r6 = 0;	 Catch:{ all -> 0x03d5 }
        r4 = 0;	 Catch:{ all -> 0x03d5 }
        r15 = 0;	 Catch:{ all -> 0x03d5 }
        r16 = 0;	 Catch:{ all -> 0x03d5 }
        r14 = 0;	 Catch:{ all -> 0x03d5 }
        r12 = 0;	 Catch:{ all -> 0x03d5 }
        if (r21 == 0) goto L_0x0789;	 Catch:{ all -> 0x03d5 }
    L_0x013f:
        r0 = r20;	 Catch:{ all -> 0x03d5 }
        r0 = r0.j;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 == r1) goto L_0x0155;	 Catch:{ all -> 0x03d5 }
    L_0x014d:
        r26 = java.lang.Integer.class;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x01cb;	 Catch:{ all -> 0x03d5 }
    L_0x0155:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r15 = r0.b(r1);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        if (r18 <= 0) goto L_0x01b5;	 Catch:{ all -> 0x03d5 }
    L_0x0165:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
    L_0x0173:
        if (r18 != 0) goto L_0x0503;	 Catch:{ all -> 0x03d5 }
    L_0x0175:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r6 = r0.a;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r6 = r0.a(r6);	 Catch:{ all -> 0x03d5 }
        if (r6 != 0) goto L_0x039b;	 Catch:{ all -> 0x03d5 }
    L_0x0181:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r11 = r0.a;	 Catch:{ all -> 0x03d5 }
        r26 = 13;	 Catch:{ all -> 0x03d5 }
        r0 = r26;	 Catch:{ all -> 0x03d5 }
        if (r11 != r0) goto L_0x0382;	 Catch:{ all -> 0x03d5 }
    L_0x018b:
        r4 = 16;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0.b(r4);	 Catch:{ all -> 0x03d5 }
        r4 = r5;
        r5 = r7;
    L_0x0194:
        if (r5 != 0) goto L_0x0708;
    L_0x0196:
        if (r9 != 0) goto L_0x06d9;
    L_0x0198:
        r33 = r29.a(r30, r31);	 Catch:{ all -> 0x073a }
        if (r4 != 0) goto L_0x01a8;
    L_0x019e:
        r0 = r30;	 Catch:{ all -> 0x0779 }
        r1 = r33;	 Catch:{ all -> 0x0779 }
        r2 = r32;	 Catch:{ all -> 0x0779 }
        r4 = r0.a(r10, r1, r2);	 Catch:{ all -> 0x0779 }
    L_0x01a8:
        if (r4 == 0) goto L_0x01ae;
    L_0x01aa:
        r0 = r33;
        r4.a = r0;
    L_0x01ae:
        r0 = r30;
        r0.a(r10);
        goto L_0x0010;
    L_0x01b5:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0789;	 Catch:{ all -> 0x03d5 }
    L_0x01c3:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
    L_0x01c4:
        r5 = r22 + 1;	 Catch:{ all -> 0x03d5 }
        r22 = r5;	 Catch:{ all -> 0x03d5 }
        r5 = r4;	 Catch:{ all -> 0x03d5 }
        goto L_0x011a;	 Catch:{ all -> 0x03d5 }
    L_0x01cb:
        r26 = java.lang.Long.TYPE;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 == r1) goto L_0x01db;	 Catch:{ all -> 0x03d5 }
    L_0x01d3:
        r26 = java.lang.Long.class;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x020b;	 Catch:{ all -> 0x03d5 }
    L_0x01db:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r16 = r0.c(r1);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        if (r18 <= 0) goto L_0x01fb;	 Catch:{ all -> 0x03d5 }
    L_0x01eb:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x01fb:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0789;	 Catch:{ all -> 0x03d5 }
    L_0x0209:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x020b:
        r26 = java.lang.String.class;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0243;	 Catch:{ all -> 0x03d5 }
    L_0x0213:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r4 = r0.d(r1);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        if (r18 <= 0) goto L_0x0233;	 Catch:{ all -> 0x03d5 }
    L_0x0223:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x0233:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x07a5;	 Catch:{ all -> 0x03d5 }
    L_0x0241:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x0243:
        r26 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 == r1) goto L_0x0253;	 Catch:{ all -> 0x03d5 }
    L_0x024b:
        r26 = java.lang.Boolean.class;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0288;	 Catch:{ all -> 0x03d5 }
    L_0x0253:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r4 = r0.e(r1);	 Catch:{ all -> 0x03d5 }
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        if (r18 <= 0) goto L_0x0277;	 Catch:{ all -> 0x03d5 }
    L_0x0267:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x0277:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0797;	 Catch:{ all -> 0x03d5 }
    L_0x0285:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x0288:
        r26 = java.lang.Float.TYPE;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 == r1) goto L_0x0298;	 Catch:{ all -> 0x03d5 }
    L_0x0290:
        r26 = java.lang.Float.class;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x02c9;	 Catch:{ all -> 0x03d5 }
    L_0x0298:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r14 = r0.f(r1);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        if (r18 <= 0) goto L_0x02b8;	 Catch:{ all -> 0x03d5 }
    L_0x02a8:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x02b8:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0789;	 Catch:{ all -> 0x03d5 }
    L_0x02c6:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x02c9:
        r26 = java.lang.Double.TYPE;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 == r1) goto L_0x02d9;	 Catch:{ all -> 0x03d5 }
    L_0x02d1:
        r26 = java.lang.Double.class;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x030a;	 Catch:{ all -> 0x03d5 }
    L_0x02d9:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r12 = r0.g(r1);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        if (r18 <= 0) goto L_0x02f9;	 Catch:{ all -> 0x03d5 }
    L_0x02e9:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x02f9:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x0789;	 Catch:{ all -> 0x03d5 }
    L_0x0307:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x030a:
        r0 = r20;	 Catch:{ all -> 0x03d5 }
        r0 = r0.k;	 Catch:{ all -> 0x03d5 }
        r26 = r0;	 Catch:{ all -> 0x03d5 }
        if (r26 == 0) goto L_0x0369;	 Catch:{ all -> 0x03d5 }
    L_0x0312:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0 = r0.b;	 Catch:{ all -> 0x03d5 }
        r26 = r0;	 Catch:{ all -> 0x03d5 }
        r0 = r26;	 Catch:{ all -> 0x03d5 }
        r1 = r19;	 Catch:{ all -> 0x03d5 }
        r26 = r0.a(r1);	 Catch:{ all -> 0x03d5 }
        r0 = r26;	 Catch:{ all -> 0x03d5 }
        r0 = r0 instanceof bl.aae;	 Catch:{ all -> 0x03d5 }
        r26 = r0;	 Catch:{ all -> 0x03d5 }
        if (r26 == 0) goto L_0x0369;	 Catch:{ all -> 0x03d5 }
    L_0x0328:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0 = r0.a;	 Catch:{ all -> 0x03d5 }
        r26 = r0;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r2 = r26;	 Catch:{ all -> 0x03d5 }
        r18 = r0.a(r1, r2);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r26 = r0;	 Catch:{ all -> 0x03d5 }
        if (r26 <= 0) goto L_0x0358;	 Catch:{ all -> 0x03d5 }
    L_0x0340:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r6 = 1;	 Catch:{ all -> 0x03d5 }
        r0 = r19;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r4 = java.lang.Enum.valueOf(r0, r1);	 Catch:{ all -> 0x03d5 }
    L_0x034a:
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x0358:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0 = r0.n;	 Catch:{ all -> 0x03d5 }
        r18 = r0;	 Catch:{ all -> 0x03d5 }
        r26 = -2;	 Catch:{ all -> 0x03d5 }
        r0 = r18;	 Catch:{ all -> 0x03d5 }
        r1 = r26;	 Catch:{ all -> 0x03d5 }
        if (r0 != r1) goto L_0x034a;	 Catch:{ all -> 0x03d5 }
    L_0x0366:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x0369:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r1 = r18;	 Catch:{ all -> 0x03d5 }
        r8 = r0.a(r1);	 Catch:{ all -> 0x03d5 }
        if (r8 == 0) goto L_0x0786;	 Catch:{ all -> 0x03d5 }
    L_0x0373:
        r8 = 1;	 Catch:{ all -> 0x03d5 }
        r18 = r8;	 Catch:{ all -> 0x03d5 }
        r8 = r15;	 Catch:{ all -> 0x03d5 }
        r27 = r16;	 Catch:{ all -> 0x03d5 }
        r16 = r4;	 Catch:{ all -> 0x03d5 }
        r17 = r6;	 Catch:{ all -> 0x03d5 }
        r4 = r14;	 Catch:{ all -> 0x03d5 }
        r14 = r27;	 Catch:{ all -> 0x03d5 }
        goto L_0x0173;	 Catch:{ all -> 0x03d5 }
    L_0x0382:
        r26 = 16;	 Catch:{ all -> 0x03d5 }
        r0 = r26;	 Catch:{ all -> 0x03d5 }
        if (r11 != r0) goto L_0x039b;	 Catch:{ all -> 0x03d5 }
    L_0x0388:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r11 = r0.c;	 Catch:{ all -> 0x03d5 }
        r26 = com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas;	 Catch:{ all -> 0x03d5 }
        r0 = r26;	 Catch:{ all -> 0x03d5 }
        r0 = r0.mask;	 Catch:{ all -> 0x03d5 }
        r26 = r0;	 Catch:{ all -> 0x03d5 }
        r11 = r11 & r26;	 Catch:{ all -> 0x03d5 }
        if (r11 == 0) goto L_0x039b;	 Catch:{ all -> 0x03d5 }
    L_0x0398:
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        goto L_0x01c4;	 Catch:{ all -> 0x03d5 }
    L_0x039b:
        r11 = "$ref";	 Catch:{ all -> 0x03d5 }
        if (r11 != r6) goto L_0x046b;	 Catch:{ all -> 0x03d5 }
    L_0x03a0:
        r4 = 58;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0.a(r4);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r4 = r0.a;	 Catch:{ all -> 0x03d5 }
        r6 = 4;	 Catch:{ all -> 0x03d5 }
        if (r4 != r6) goto L_0x0432;	 Catch:{ all -> 0x03d5 }
    L_0x03ae:
        r6 = r23.p();	 Catch:{ all -> 0x03d5 }
        r4 = "@";	 Catch:{ all -> 0x03d5 }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x03d5 }
        if (r4 == 0) goto L_0x03d8;	 Catch:{ all -> 0x03d5 }
    L_0x03bb:
        r7 = r10.a;	 Catch:{ all -> 0x03d5 }
    L_0x03bd:
        r4 = 13;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0.b(r4);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r4 = r0.a;	 Catch:{ all -> 0x03d5 }
        r6 = 13;	 Catch:{ all -> 0x03d5 }
        if (r4 == r6) goto L_0x0450;	 Catch:{ all -> 0x03d5 }
    L_0x03cc:
        r4 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x03d5 }
        r6 = "illegal ref";	 Catch:{ all -> 0x03d5 }
        r4.<init>(r6);	 Catch:{ all -> 0x03d5 }
        throw r4;	 Catch:{ all -> 0x03d5 }
    L_0x03d5:
        r4 = move-exception;	 Catch:{ all -> 0x03d5 }
        goto L_0x00f8;	 Catch:{ all -> 0x03d5 }
    L_0x03d8:
        r4 = "..";	 Catch:{ all -> 0x03d5 }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x03d5 }
        if (r4 == 0) goto L_0x03fa;	 Catch:{ all -> 0x03d5 }
    L_0x03e1:
        r4 = r10.b;	 Catch:{ all -> 0x03d5 }
        r8 = r4.a;	 Catch:{ all -> 0x03d5 }
        if (r8 == 0) goto L_0x03ea;	 Catch:{ all -> 0x03d5 }
    L_0x03e7:
        r7 = r4.a;	 Catch:{ all -> 0x03d5 }
        goto L_0x03bd;	 Catch:{ all -> 0x03d5 }
    L_0x03ea:
        r8 = new bl.aad$a;	 Catch:{ all -> 0x03d5 }
        r8.<init>(r4, r6);	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0.a(r8);	 Catch:{ all -> 0x03d5 }
        r4 = 1;	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0.e = r4;	 Catch:{ all -> 0x03d5 }
        goto L_0x03bd;	 Catch:{ all -> 0x03d5 }
    L_0x03fa:
        r4 = "$";	 Catch:{ all -> 0x03d5 }
        r4 = r4.equals(r6);	 Catch:{ all -> 0x03d5 }
        if (r4 == 0) goto L_0x0422;	 Catch:{ all -> 0x03d5 }
    L_0x0403:
        r4 = r10;	 Catch:{ all -> 0x03d5 }
    L_0x0404:
        r8 = r4.b;	 Catch:{ all -> 0x03d5 }
        if (r8 == 0) goto L_0x040b;	 Catch:{ all -> 0x03d5 }
    L_0x0408:
        r4 = r4.b;	 Catch:{ all -> 0x03d5 }
        goto L_0x0404;	 Catch:{ all -> 0x03d5 }
    L_0x040b:
        r8 = r4.a;	 Catch:{ all -> 0x03d5 }
        if (r8 == 0) goto L_0x0412;	 Catch:{ all -> 0x03d5 }
    L_0x040f:
        r7 = r4.a;	 Catch:{ all -> 0x03d5 }
        goto L_0x03bd;	 Catch:{ all -> 0x03d5 }
    L_0x0412:
        r8 = new bl.aad$a;	 Catch:{ all -> 0x03d5 }
        r8.<init>(r4, r6);	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0.a(r8);	 Catch:{ all -> 0x03d5 }
        r4 = 1;	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0.e = r4;	 Catch:{ all -> 0x03d5 }
        goto L_0x03bd;	 Catch:{ all -> 0x03d5 }
    L_0x0422:
        r4 = new bl.aad$a;	 Catch:{ all -> 0x03d5 }
        r4.<init>(r10, r6);	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0.a(r4);	 Catch:{ all -> 0x03d5 }
        r4 = 1;	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r0.e = r4;	 Catch:{ all -> 0x03d5 }
        goto L_0x03bd;	 Catch:{ all -> 0x03d5 }
    L_0x0432:
        r6 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x03d5 }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03d5 }
        r8.<init>();	 Catch:{ all -> 0x03d5 }
        r9 = "illegal ref, ";	 Catch:{ all -> 0x03d5 }
        r8 = r8.append(r9);	 Catch:{ all -> 0x03d5 }
        r4 = bl.aag.a(r4);	 Catch:{ all -> 0x03d5 }
        r4 = r8.append(r4);	 Catch:{ all -> 0x03d5 }
        r4 = r4.toString();	 Catch:{ all -> 0x03d5 }
        r6.<init>(r4);	 Catch:{ all -> 0x03d5 }
        throw r6;	 Catch:{ all -> 0x03d5 }
    L_0x0450:
        r4 = 16;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0.b(r4);	 Catch:{ all -> 0x03d5 }
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r1 = r32;	 Catch:{ all -> 0x03d5 }
        r0.a(r10, r7, r1);	 Catch:{ all -> 0x03d5 }
        if (r5 == 0) goto L_0x0462;
    L_0x0460:
        r5.a = r7;
    L_0x0462:
        r0 = r30;
        r0.a(r10);
        r33 = r7;
        goto L_0x0010;
    L_0x046b:
        r11 = "@type";	 Catch:{ all -> 0x03d5 }
        if (r11 != r6) goto L_0x0504;	 Catch:{ all -> 0x03d5 }
    L_0x0470:
        r4 = 58;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0.a(r4);	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r4 = r0.a;	 Catch:{ all -> 0x03d5 }
        r6 = 4;	 Catch:{ all -> 0x03d5 }
        if (r4 != r6) goto L_0x04fa;	 Catch:{ all -> 0x03d5 }
    L_0x047e:
        r8 = r23.p();	 Catch:{ all -> 0x03d5 }
        r4 = 16;	 Catch:{ all -> 0x03d5 }
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r0.b(r4);	 Catch:{ all -> 0x03d5 }
        r0 = r31;	 Catch:{ all -> 0x03d5 }
        r4 = r0 instanceof java.lang.Class;	 Catch:{ all -> 0x03d5 }
        if (r4 == 0) goto L_0x04ad;	 Catch:{ all -> 0x03d5 }
    L_0x048f:
        r0 = r31;	 Catch:{ all -> 0x03d5 }
        r0 = (java.lang.Class) r0;	 Catch:{ all -> 0x03d5 }
        r4 = r0;	 Catch:{ all -> 0x03d5 }
        r4 = r4.getName();	 Catch:{ all -> 0x03d5 }
        r4 = r8.equals(r4);	 Catch:{ all -> 0x03d5 }
        if (r4 == 0) goto L_0x04ad;	 Catch:{ all -> 0x03d5 }
    L_0x049e:
        r0 = r23;	 Catch:{ all -> 0x03d5 }
        r4 = r0.a;	 Catch:{ all -> 0x03d5 }
        r6 = 13;	 Catch:{ all -> 0x03d5 }
        if (r4 != r6) goto L_0x0786;	 Catch:{ all -> 0x03d5 }
    L_0x04a6:
        r23.f();	 Catch:{ all -> 0x03d5 }
        r4 = r5;	 Catch:{ all -> 0x03d5 }
        r5 = r7;	 Catch:{ all -> 0x03d5 }
        goto L_0x0194;	 Catch:{ all -> 0x03d5 }
    L_0x04ad:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r4 = r0.b;	 Catch:{ all -> 0x03d5 }
        r0 = r29;	 Catch:{ all -> 0x03d5 }
        r6 = r0.a;	 Catch:{ all -> 0x03d5 }
        r0 = r29;	 Catch:{ all -> 0x03d5 }
        r6 = r0.a(r4, r6, r8);	 Catch:{ all -> 0x03d5 }
        r4 = 0;	 Catch:{ all -> 0x03d5 }
        if (r6 != 0) goto L_0x04de;	 Catch:{ all -> 0x03d5 }
    L_0x04be:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r4 = r0.b;	 Catch:{ all -> 0x03d5 }
        r4 = r4.c;	 Catch:{ all -> 0x03d5 }
        r4 = bl.acd.a(r8, r4);	 Catch:{ all -> 0x03d5 }
        r6 = bl.acd.c(r31);	 Catch:{ all -> 0x03d5 }
        if (r6 == 0) goto L_0x04d6;	 Catch:{ all -> 0x03d5 }
    L_0x04ce:
        if (r4 == 0) goto L_0x04f1;	 Catch:{ all -> 0x03d5 }
    L_0x04d0:
        r6 = r6.isAssignableFrom(r4);	 Catch:{ all -> 0x03d5 }
        if (r6 == 0) goto L_0x04f1;	 Catch:{ all -> 0x03d5 }
    L_0x04d6:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r6 = r0.b;	 Catch:{ all -> 0x03d5 }
        r6 = r6.a(r4);	 Catch:{ all -> 0x03d5 }
    L_0x04de:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r1 = r32;	 Catch:{ all -> 0x03d5 }
        r33 = r6.a(r0, r4, r1);	 Catch:{ all -> 0x03d5 }
        if (r5 == 0) goto L_0x04ea;
    L_0x04e8:
        r5.a = r7;
    L_0x04ea:
        r0 = r30;
        r0.a(r10);
        goto L_0x0010;
    L_0x04f1:
        r4 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x03d5 }
        r6 = "type not match";	 Catch:{ all -> 0x03d5 }
        r4.<init>(r6);	 Catch:{ all -> 0x03d5 }
        throw r4;	 Catch:{ all -> 0x03d5 }
    L_0x04fa:
        r4 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x03d5 }
        r6 = "syntax error";	 Catch:{ all -> 0x03d5 }
        r4.<init>(r6);	 Catch:{ all -> 0x03d5 }
        throw r4;	 Catch:{ all -> 0x03d5 }
    L_0x0503:
        r6 = r11;	 Catch:{ all -> 0x03d5 }
    L_0x0504:
        if (r7 != 0) goto L_0x0783;	 Catch:{ all -> 0x03d5 }
    L_0x0506:
        if (r9 != 0) goto L_0x0783;	 Catch:{ all -> 0x03d5 }
    L_0x0508:
        r7 = r29.a(r30, r31);	 Catch:{ all -> 0x03d5 }
        if (r7 != 0) goto L_0x0518;	 Catch:{ all -> 0x03d5 }
    L_0x050e:
        r9 = new java.util.HashMap;	 Catch:{ all -> 0x03d5 }
        r0 = r29;	 Catch:{ all -> 0x03d5 }
        r11 = r0.b;	 Catch:{ all -> 0x03d5 }
        r11 = r11.length;	 Catch:{ all -> 0x03d5 }
        r9.<init>(r11);	 Catch:{ all -> 0x03d5 }
    L_0x0518:
        if (r24 != 0) goto L_0x0783;	 Catch:{ all -> 0x03d5 }
    L_0x051a:
        r0 = r30;	 Catch:{ all -> 0x03d5 }
        r1 = r32;	 Catch:{ all -> 0x03d5 }
        r5 = r0.a(r10, r7, r1);	 Catch:{ all -> 0x03d5 }
        r11 = r5;
    L_0x0523:
        if (r18 == 0) goto L_0x067a;
    L_0x0525:
        if (r17 != 0) goto L_0x053b;
    L_0x0527:
        r0 = r21;	 Catch:{ all -> 0x0586 }
        r1 = r30;	 Catch:{ all -> 0x0586 }
        r2 = r31;	 Catch:{ all -> 0x0586 }
        r0.a(r1, r7, r2, r9);	 Catch:{ all -> 0x0586 }
    L_0x0530:
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r4 = r0.a;	 Catch:{ all -> 0x0586 }
        r5 = 16;	 Catch:{ all -> 0x0586 }
        if (r4 != r5) goto L_0x0695;	 Catch:{ all -> 0x0586 }
    L_0x0538:
        r4 = r11;	 Catch:{ all -> 0x0586 }
        goto L_0x01c4;	 Catch:{ all -> 0x0586 }
    L_0x053b:
        if (r7 != 0) goto L_0x059e;	 Catch:{ all -> 0x0586 }
    L_0x053d:
        r5 = java.lang.Integer.TYPE;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 == r5) goto L_0x0549;	 Catch:{ all -> 0x0586 }
    L_0x0543:
        r5 = java.lang.Integer.class;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 != r5) goto L_0x0561;	 Catch:{ all -> 0x0586 }
    L_0x0549:
        r16 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x0586 }
    L_0x054d:
        r0 = r20;	 Catch:{ all -> 0x0586 }
        r4 = r0.a;	 Catch:{ all -> 0x0586 }
        r0 = r16;	 Catch:{ all -> 0x0586 }
        r9.put(r4, r0);	 Catch:{ all -> 0x0586 }
    L_0x0556:
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r4 = r0.n;	 Catch:{ all -> 0x0586 }
        r5 = 4;	 Catch:{ all -> 0x0586 }
        if (r4 != r5) goto L_0x0530;	 Catch:{ all -> 0x0586 }
    L_0x055d:
        r4 = r11;	 Catch:{ all -> 0x0586 }
        r5 = r7;	 Catch:{ all -> 0x0586 }
        goto L_0x0194;	 Catch:{ all -> 0x0586 }
    L_0x0561:
        r5 = java.lang.Long.TYPE;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 == r5) goto L_0x056d;	 Catch:{ all -> 0x0586 }
    L_0x0567:
        r5 = java.lang.Long.class;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 != r5) goto L_0x0572;	 Catch:{ all -> 0x0586 }
    L_0x056d:
        r16 = java.lang.Long.valueOf(r14);	 Catch:{ all -> 0x0586 }
        goto L_0x054d;	 Catch:{ all -> 0x0586 }
    L_0x0572:
        r5 = java.lang.Float.TYPE;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 == r5) goto L_0x057e;	 Catch:{ all -> 0x0586 }
    L_0x0578:
        r5 = java.lang.Float.class;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 != r5) goto L_0x058a;	 Catch:{ all -> 0x0586 }
    L_0x057e:
        r16 = new java.lang.Float;	 Catch:{ all -> 0x0586 }
        r0 = r16;	 Catch:{ all -> 0x0586 }
        r0.<init>(r4);	 Catch:{ all -> 0x0586 }
        goto L_0x054d;	 Catch:{ all -> 0x0586 }
    L_0x0586:
        r4 = move-exception;	 Catch:{ all -> 0x0586 }
        r5 = r11;	 Catch:{ all -> 0x0586 }
        goto L_0x00f8;	 Catch:{ all -> 0x0586 }
    L_0x058a:
        r4 = java.lang.Double.TYPE;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 == r4) goto L_0x0596;	 Catch:{ all -> 0x0586 }
    L_0x0590:
        r4 = java.lang.Double.class;	 Catch:{ all -> 0x0586 }
        r0 = r19;	 Catch:{ all -> 0x0586 }
        if (r0 != r4) goto L_0x054d;	 Catch:{ all -> 0x0586 }
    L_0x0596:
        r16 = new java.lang.Double;	 Catch:{ all -> 0x0586 }
        r0 = r16;	 Catch:{ all -> 0x0586 }
        r0.<init>(r12);	 Catch:{ all -> 0x0586 }
        goto L_0x054d;
    L_0x059e:
        if (r16 != 0) goto L_0x0671;
    L_0x05a0:
        r5 = java.lang.Integer.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 == r5) goto L_0x05ac;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05a6:
        r5 = java.lang.Integer.class;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r5) goto L_0x05e8;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05ac:
        r0 = r20;	 Catch:{ IllegalAccessException -> 0x05be }
        r4 = r0.d;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r4 == 0) goto L_0x05dd;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05b2:
        r4 = java.lang.Integer.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r4) goto L_0x05dd;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05b8:
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r8);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;
    L_0x05be:
        r4 = move-exception;
        r5 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x0586 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0586 }
        r6.<init>();	 Catch:{ all -> 0x0586 }
        r8 = "set property error, ";	 Catch:{ all -> 0x0586 }
        r6 = r6.append(r8);	 Catch:{ all -> 0x0586 }
        r0 = r20;	 Catch:{ all -> 0x0586 }
        r8 = r0.a;	 Catch:{ all -> 0x0586 }
        r6 = r6.append(r8);	 Catch:{ all -> 0x0586 }
        r6 = r6.toString();	 Catch:{ all -> 0x0586 }
        r5.<init>(r6, r4);	 Catch:{ all -> 0x0586 }
        throw r5;	 Catch:{ all -> 0x0586 }
    L_0x05dd:
        r4 = java.lang.Integer.valueOf(r8);	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r4);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05e8:
        r5 = java.lang.Long.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 == r5) goto L_0x05f4;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05ee:
        r5 = java.lang.Long.class;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r5) goto L_0x0612;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05f4:
        r0 = r20;	 Catch:{ IllegalAccessException -> 0x05be }
        r4 = r0.d;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r4 == 0) goto L_0x0607;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x05fa:
        r4 = java.lang.Long.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r4) goto L_0x0607;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0600:
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r14);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0607:
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r4);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0612:
        r5 = java.lang.Float.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 == r5) goto L_0x061e;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0618:
        r5 = java.lang.Float.class;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r5) goto L_0x063d;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x061e:
        r0 = r20;	 Catch:{ IllegalAccessException -> 0x05be }
        r5 = r0.d;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r5 == 0) goto L_0x0631;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0624:
        r5 = java.lang.Float.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r5) goto L_0x0631;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x062a:
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r4);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0631:
        r5 = new java.lang.Float;	 Catch:{ IllegalAccessException -> 0x05be }
        r5.<init>(r4);	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r5);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x063d:
        r4 = java.lang.Double.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 == r4) goto L_0x0649;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0643:
        r4 = java.lang.Double.class;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r4) goto L_0x0668;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0649:
        r0 = r20;	 Catch:{ IllegalAccessException -> 0x05be }
        r4 = r0.d;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r4 == 0) goto L_0x065c;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x064f:
        r4 = java.lang.Double.TYPE;	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r19;	 Catch:{ IllegalAccessException -> 0x05be }
        if (r0 != r4) goto L_0x065c;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0655:
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r12);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x065c:
        r4 = new java.lang.Double;	 Catch:{ IllegalAccessException -> 0x05be }
        r4.<init>(r12);	 Catch:{ IllegalAccessException -> 0x05be }
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r4);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;	 Catch:{ IllegalAccessException -> 0x05be }
    L_0x0668:
        r0 = r21;	 Catch:{ IllegalAccessException -> 0x05be }
        r1 = r16;	 Catch:{ IllegalAccessException -> 0x05be }
        r0.a(r7, r1);	 Catch:{ IllegalAccessException -> 0x05be }
        goto L_0x0556;
    L_0x0671:
        r0 = r21;	 Catch:{ all -> 0x0586 }
        r1 = r16;	 Catch:{ all -> 0x0586 }
        r0.a(r7, r1);	 Catch:{ all -> 0x0586 }
        goto L_0x0556;	 Catch:{ all -> 0x0586 }
    L_0x067a:
        r4 = r29;	 Catch:{ all -> 0x0586 }
        r5 = r30;	 Catch:{ all -> 0x0586 }
        r8 = r31;	 Catch:{ all -> 0x0586 }
        r4 = r4.a(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0586 }
        if (r4 != 0) goto L_0x0530;	 Catch:{ all -> 0x0586 }
    L_0x0686:
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r4 = r0.a;	 Catch:{ all -> 0x0586 }
        r5 = 13;	 Catch:{ all -> 0x0586 }
        if (r4 != r5) goto L_0x07bb;	 Catch:{ all -> 0x0586 }
    L_0x068e:
        r23.f();	 Catch:{ all -> 0x0586 }
        r4 = r11;	 Catch:{ all -> 0x0586 }
        r5 = r7;	 Catch:{ all -> 0x0586 }
        goto L_0x0194;	 Catch:{ all -> 0x0586 }
    L_0x0695:
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r4 = r0.a;	 Catch:{ all -> 0x0586 }
        r5 = 13;	 Catch:{ all -> 0x0586 }
        if (r4 != r5) goto L_0x06a8;	 Catch:{ all -> 0x0586 }
    L_0x069d:
        r4 = 16;	 Catch:{ all -> 0x0586 }
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r0.b(r4);	 Catch:{ all -> 0x0586 }
        r4 = r11;	 Catch:{ all -> 0x0586 }
        r5 = r7;	 Catch:{ all -> 0x0586 }
        goto L_0x0194;	 Catch:{ all -> 0x0586 }
    L_0x06a8:
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r4 = r0.a;	 Catch:{ all -> 0x0586 }
        r5 = 18;	 Catch:{ all -> 0x0586 }
        if (r4 == r5) goto L_0x06b7;	 Catch:{ all -> 0x0586 }
    L_0x06b0:
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r4 = r0.a;	 Catch:{ all -> 0x0586 }
        r5 = 1;	 Catch:{ all -> 0x0586 }
        if (r4 != r5) goto L_0x07bb;	 Catch:{ all -> 0x0586 }
    L_0x06b7:
        r4 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x0586 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0586 }
        r5.<init>();	 Catch:{ all -> 0x0586 }
        r6 = "syntax error, unexpect token ";	 Catch:{ all -> 0x0586 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0586 }
        r0 = r23;	 Catch:{ all -> 0x0586 }
        r6 = r0.a;	 Catch:{ all -> 0x0586 }
        r6 = bl.aag.a(r6);	 Catch:{ all -> 0x0586 }
        r5 = r5.append(r6);	 Catch:{ all -> 0x0586 }
        r5 = r5.toString();	 Catch:{ all -> 0x0586 }
        r4.<init>(r5);	 Catch:{ all -> 0x0586 }
        throw r4;	 Catch:{ all -> 0x0586 }
    L_0x06d9:
        r0 = r29;	 Catch:{ all -> 0x073a }
        r6 = r0.b;	 Catch:{ all -> 0x073a }
        r7 = r6.length;	 Catch:{ all -> 0x073a }
        r8 = new java.lang.Object[r7];	 Catch:{ all -> 0x073a }
        r6 = 0;	 Catch:{ all -> 0x073a }
    L_0x06e1:
        if (r6 >= r7) goto L_0x06f6;	 Catch:{ all -> 0x073a }
    L_0x06e3:
        r0 = r29;	 Catch:{ all -> 0x073a }
        r11 = r0.b;	 Catch:{ all -> 0x073a }
        r11 = r11[r6];	 Catch:{ all -> 0x073a }
        r11 = r11.b;	 Catch:{ all -> 0x073a }
        r11 = r11.a;	 Catch:{ all -> 0x073a }
        r11 = r9.get(r11);	 Catch:{ all -> 0x073a }
        r8[r6] = r11;	 Catch:{ all -> 0x073a }
        r6 = r6 + 1;	 Catch:{ all -> 0x073a }
        goto L_0x06e1;	 Catch:{ all -> 0x073a }
    L_0x06f6:
        r0 = r29;	 Catch:{ all -> 0x073a }
        r6 = r0.a;	 Catch:{ all -> 0x073a }
        r6 = r6.c;	 Catch:{ all -> 0x073a }
        if (r6 == 0) goto L_0x0740;
    L_0x06fe:
        r0 = r29;	 Catch:{ Exception -> 0x0715 }
        r6 = r0.a;	 Catch:{ Exception -> 0x0715 }
        r6 = r6.c;	 Catch:{ Exception -> 0x0715 }
        r5 = r6.newInstance(r8);	 Catch:{ Exception -> 0x0715 }
    L_0x0708:
        if (r4 == 0) goto L_0x070c;
    L_0x070a:
        r4.a = r5;
    L_0x070c:
        r0 = r30;
        r0.a(r10);
        r33 = r5;
        goto L_0x0010;
    L_0x0715:
        r6 = move-exception;
        r7 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x073a }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x073a }
        r8.<init>();	 Catch:{ all -> 0x073a }
        r9 = "create instance error, ";	 Catch:{ all -> 0x073a }
        r8 = r8.append(r9);	 Catch:{ all -> 0x073a }
        r0 = r29;	 Catch:{ all -> 0x073a }
        r9 = r0.a;	 Catch:{ all -> 0x073a }
        r9 = r9.c;	 Catch:{ all -> 0x073a }
        r9 = r9.toGenericString();	 Catch:{ all -> 0x073a }
        r8 = r8.append(r9);	 Catch:{ all -> 0x073a }
        r8 = r8.toString();	 Catch:{ all -> 0x073a }
        r7.<init>(r8, r6);	 Catch:{ all -> 0x073a }
        throw r7;	 Catch:{ all -> 0x073a }
    L_0x073a:
        r6 = move-exception;	 Catch:{ all -> 0x073a }
        r7 = r5;	 Catch:{ all -> 0x073a }
        r5 = r4;	 Catch:{ all -> 0x073a }
        r4 = r6;	 Catch:{ all -> 0x073a }
        goto L_0x00f8;	 Catch:{ all -> 0x073a }
    L_0x0740:
        r0 = r29;	 Catch:{ all -> 0x073a }
        r6 = r0.a;	 Catch:{ all -> 0x073a }
        r6 = r6.d;	 Catch:{ all -> 0x073a }
        if (r6 == 0) goto L_0x0708;
    L_0x0748:
        r0 = r29;	 Catch:{ Exception -> 0x0754 }
        r6 = r0.a;	 Catch:{ Exception -> 0x0754 }
        r6 = r6.d;	 Catch:{ Exception -> 0x0754 }
        r7 = 0;	 Catch:{ Exception -> 0x0754 }
        r5 = r6.invoke(r7, r8);	 Catch:{ Exception -> 0x0754 }
        goto L_0x0708;
    L_0x0754:
        r6 = move-exception;
        r7 = new com.alibaba.fastjson.JSONException;	 Catch:{ all -> 0x073a }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x073a }
        r8.<init>();	 Catch:{ all -> 0x073a }
        r9 = "create factory method error, ";	 Catch:{ all -> 0x073a }
        r8 = r8.append(r9);	 Catch:{ all -> 0x073a }
        r0 = r29;	 Catch:{ all -> 0x073a }
        r9 = r0.a;	 Catch:{ all -> 0x073a }
        r9 = r9.d;	 Catch:{ all -> 0x073a }
        r9 = r9.toString();	 Catch:{ all -> 0x073a }
        r8 = r8.append(r9);	 Catch:{ all -> 0x073a }
        r8 = r8.toString();	 Catch:{ all -> 0x073a }
        r7.<init>(r8, r6);	 Catch:{ all -> 0x073a }
        throw r7;	 Catch:{ all -> 0x073a }
    L_0x0779:
        r5 = move-exception;
        r7 = r33;
        r27 = r4;
        r4 = r5;
        r5 = r27;
        goto L_0x00f8;
    L_0x0783:
        r11 = r5;
        goto L_0x0523;
    L_0x0786:
        r4 = r5;
        goto L_0x01c4;
    L_0x0789:
        r18 = r8;
        r8 = r15;
        r27 = r16;
        r16 = r4;
        r17 = r6;
        r4 = r14;
        r14 = r27;
        goto L_0x0173;
    L_0x0797:
        r18 = r8;
        r8 = r15;
        r27 = r16;
        r16 = r4;
        r17 = r6;
        r4 = r14;
        r14 = r27;
        goto L_0x0173;
    L_0x07a5:
        r18 = r8;
        r8 = r15;
        r27 = r16;
        r16 = r4;
        r17 = r6;
        r4 = r14;
        r14 = r27;
        goto L_0x0173;
    L_0x07b3:
        r19 = r4;
        r20 = r6;
        r21 = r8;
        goto L_0x0134;
    L_0x07bb:
        r4 = r11;
        goto L_0x01c4;
    L_0x07be:
        r10 = r4;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.aah.b(bl.aad, java.lang.reflect.Type, java.lang.Object, java.lang.Object):T");
    }

    protected aau a(String str) {
        int i = 0;
        if (str == null) {
            return null;
        }
        if (this.a.h) {
            while (i < this.c.length) {
                if (this.c[i].b.a.equalsIgnoreCase(str)) {
                    return this.c[i];
                }
                i++;
            }
            return null;
        }
        int i2 = 0;
        i = this.c.length - 1;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int compareTo = this.c[i3].b.a.compareTo(str);
            if (compareTo < 0) {
                i2 = i3 + 1;
            } else if (compareTo <= 0) {
                return this.c[i3];
            } else {
                i = i3 - 1;
            }
        }
        return null;
    }

    private boolean a(aad bl_aad, String str, Object obj, Type type, Map<String, Object> map) {
        aaf bl_aaf = bl_aad.c;
        aau a = a(str);
        if (a == null) {
            boolean startsWith = str.startsWith("is");
            for (aau bl_aau : this.c) {
                aca bl_aca = bl_aau.b;
                Class cls = bl_aca.f;
                String str2 = bl_aca.a;
                if (str2.equalsIgnoreCase(str) || (startsWith && ((cls == Boolean.TYPE || cls == Boolean.class) && str2.equalsIgnoreCase(str.substring(2))))) {
                    break;
                }
            }
        }
        aau bl_aau2 = a;
        if (bl_aau2 == null) {
            a(bl_aad, obj, str);
            return false;
        }
        bl_aaf.a(':');
        bl_aau2.a(bl_aad, obj, type, map);
        return true;
    }

    void a(aad bl_aad, Object obj, String str) {
        aaf bl_aaf = bl_aad.c;
        if ((bl_aad.c.c & Feature.IgnoreNotMatch.mask) == 0) {
            throw new JSONException("setter not found, class " + this.d.getName() + ", property " + str);
        }
        Object g;
        bl_aaf.a(':');
        Type type = null;
        List<aat> list = bl_aad.f;
        if (list != null) {
            for (aat a : list) {
                type = a.a(obj, str);
            }
        }
        if (type == null) {
            g = bl_aad.g();
        } else {
            g = bl_aad.a(type);
        }
        if (obj instanceof aar) {
            ((aar) obj).a(str, g);
            return;
        }
        List<aas> list2 = bl_aad.g;
        if (list2 != null) {
            for (aas a2 : list2) {
                a2.a(obj, str, g);
            }
        }
    }

    public Object a(Map<String, Object> map, aan bl_aan) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.a.c == null) {
            Object a = a(null, this.d);
            for (Entry entry : map.entrySet()) {
                aau a2 = a((String) entry.getKey());
                if (a2 != null) {
                    Object value = entry.getValue();
                    Method method = a2.b.b;
                    if (method != null) {
                        value = acd.a(value, method.getGenericParameterTypes()[0], bl_aan);
                        method.invoke(a, new Object[]{value});
                    } else {
                        a2.b.c.set(a, acd.a(value, a2.b.g, bl_aan));
                    }
                }
            }
            return a;
        }
        aca[] bl_acaArr = this.a.e;
        int length = bl_acaArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(bl_acaArr[i].a);
        }
        if (this.a.c == null) {
            return null;
        }
        try {
            return this.a.c.newInstance(objArr);
        } catch (Throwable e) {
            throw new JSONException("create instance error, " + this.a.c.toGenericString(), e);
        }
    }

    protected aah a(aan bl_aan, aai bl_aai, String str) {
        if (bl_aai.g == null) {
            return null;
        }
        for (Type a : bl_aai.g.seeAlso()) {
            aaw a2 = bl_aan.a(a);
            if (a2 instanceof aah) {
                aah bl_aah = (aah) a2;
                aai bl_aai2 = bl_aah.a;
                if (bl_aai2.j.equals(str)) {
                    return bl_aah;
                }
                bl_aah = a(bl_aan, bl_aai2, str);
                if (bl_aah != null) {
                    return bl_aah;
                }
            }
        }
        return null;
    }
}
