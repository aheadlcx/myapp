package bili2.bl;

import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.isBuiltinFunctionWithDifferentNameInJvm.1;

/* compiled from: BL */
public final class jop {
    public static final jop a = null;
    private static final jpd b = null;
    private static final Map<jpd, jup> c = null;
    private static final Map<String, jup> d = null;
    private static final List<jup> e = null;
    private static final Map<jup, List<jup>> f = null;

    static {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: bl.jop.<clinit>():void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:265)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
Caused by: java.lang.NullPointerException
*/
        /*
        r8 = 10;
        r0 = new bl.jop;
        r0.<init>();
        a = r0;
        r0 = "java/util/List";
        r1 = "removeAt";
        r2 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT;
        r2 = r2.c();
        r3 = "JvmPrimitiveType.INT.desc";
        bl.jgp.a(r2, r3);
        r3 = "Ljava/lang/Object;";
        r0 = bl.jpf.a(r0, r1, r2, r3);
        b = r0;
        r0 = bl.juc.a;
        r1 = 8;
        r1 = new kotlin.Pair[r1];
        r2 = 0;
        r3 = "Number";
        r3 = r0.a(r3);
        r4 = "toByte";
        r5 = "";
        r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.BYTE;
        r6 = r6.c();
        r7 = "JvmPrimitiveType.BYTE.desc";
        bl.jgp.a(r6, r7);
        r3 = bl.jpf.a(r3, r4, r5, r6);
        r4 = "byteValue";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 1;
        r3 = "Number";
        r3 = r0.a(r3);
        r4 = "toShort";
        r5 = "";
        r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.SHORT;
        r6 = r6.c();
        r7 = "JvmPrimitiveType.SHORT.desc";
        bl.jgp.a(r6, r7);
        r3 = bl.jpf.a(r3, r4, r5, r6);
        r4 = "shortValue";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 2;
        r3 = "Number";
        r3 = r0.a(r3);
        r4 = "toInt";
        r5 = "";
        r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT;
        r6 = r6.c();
        r7 = "JvmPrimitiveType.INT.desc";
        bl.jgp.a(r6, r7);
        r3 = bl.jpf.a(r3, r4, r5, r6);
        r4 = "intValue";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 3;
        r3 = "Number";
        r3 = r0.a(r3);
        r4 = "toLong";
        r5 = "";
        r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.LONG;
        r6 = r6.c();
        r7 = "JvmPrimitiveType.LONG.desc";
        bl.jgp.a(r6, r7);
        r3 = bl.jpf.a(r3, r4, r5, r6);
        r4 = "longValue";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 4;
        r3 = "Number";
        r3 = r0.a(r3);
        r4 = "toFloat";
        r5 = "";
        r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.FLOAT;
        r6 = r6.c();
        r7 = "JvmPrimitiveType.FLOAT.desc";
        bl.jgp.a(r6, r7);
        r3 = bl.jpf.a(r3, r4, r5, r6);
        r4 = "floatValue";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 5;
        r3 = "Number";
        r3 = r0.a(r3);
        r4 = "toDouble";
        r5 = "";
        r6 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.DOUBLE;
        r6 = r6.c();
        r7 = "JvmPrimitiveType.DOUBLE.desc";
        bl.jgp.a(r6, r7);
        r3 = bl.jpf.a(r3, r4, r5, r6);
        r4 = "doubleValue";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 6;
        r3 = b;
        r4 = "remove";
        r4 = bl.jup.a(r4);
        r3 = bl.jdt.a(r3, r4);
        r1[r2] = r3;
        r2 = 7;
        r3 = "CharSequence";
        r0 = r0.a(r3);
        r3 = "get";
        r4 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT;
        r4 = r4.c();
        r5 = "JvmPrimitiveType.INT.desc";
        bl.jgp.a(r4, r5);
        r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.CHAR;
        r5 = r5.c();
        r6 = "JvmPrimitiveType.CHAR.desc";
        bl.jgp.a(r5, r6);
        r0 = bl.jpf.a(r0, r3, r4, r5);
        r3 = "charAt";
        r3 = bl.jup.a(r3);
        r0 = bl.jdt.a(r0, r3);
        r1[r2] = r0;
        r0 = bl.jew.a(r1);
        c = r0;
        r1 = c;
        r0 = new java.util.LinkedHashMap;
        r2 = r1.size();
        r2 = bl.jew.a(r2);
        r0.<init>(r2);
        r0 = (java.util.Map) r0;
        r1 = r1.entrySet();
        r1 = (java.lang.Iterable) r1;
        r3 = r1.iterator();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x01b4;
    L_0x0199:
        r2 = r3.next();
        r1 = r2;
        r1 = (java.util.Map.Entry) r1;
        r1 = r1.getKey();
        r1 = (bl.jpd) r1;
        r1 = r1.b();
        r2 = (java.util.Map.Entry) r2;
        r2 = r2.getValue();
        r0.put(r1, r2);
        goto L_0x0193;
        d = r0;
        r0 = c;
        r0 = r0.keySet();
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = bl.jei.a(r0, r8);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r2 = r0.iterator();
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x01e3;
        r0 = r2.next();
        r0 = (bl.jpd) r0;
        r0 = r0.a();
        r1.add(r0);
        goto L_0x01cf;
        r1 = (java.util.List) r1;
        e = r1;
        r0 = c;
        r0 = r0.entrySet();
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r2 = bl.jei.a(r0, r8);
        r1.<init>(r2);
        r1 = (java.util.Collection) r1;
        r3 = r0.iterator();
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0222;
        r0 = r3.next();
        r0 = (java.util.Map.Entry) r0;
        r4 = new kotlin.Pair;
        r2 = r0.getKey();
        r2 = (bl.jpd) r2;
        r2 = r2.a();
        r0 = r0.getValue();
        r4.<init>(r2, r0);
        r1.add(r4);
        goto L_0x01ff;
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        r4 = r1.iterator();
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0266;
        r2 = r4.next();
        r1 = r2;
        r1 = (kotlin.Pair) r1;
        r1 = r1.b();
        r1 = (bl.jup) r1;
        r3 = r0.get(r1);
        if (r3 != 0) goto L_0x0264;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0.put(r1, r3);
        r1 = r3;
        r1 = (java.util.List) r1;
        r2 = (kotlin.Pair) r2;
        r2 = r2.a();
        r2 = (bl.jup) r2;
        r1.add(r2);
        goto L_0x0232;
        r1 = r3;
        goto L_0x0255;
        f = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.jop.<clinit>():void");
    }

    private jop() {
    }

    public final List<jup> a() {
        return e;
    }

    public final boolean a(jup bl_jup) {
        jgp.b(bl_jup, "$receiver");
        return e.contains(bl_jup);
    }

    public final jup a(jlv bl_jlv) {
        jgp.b(bl_jlv, "functionDescriptor");
        Map map = d;
        String b = jty.b((jkn) bl_jlv);
        return b != null ? (jup) map.get(b) : null;
    }

    public final boolean b(jlv bl_jlv) {
        jgp.b(bl_jlv, "functionDescriptor");
        return jkf.a((jkx) bl_jlv) && jxf.a((CallableMemberDescriptor) bl_jlv, false, (jfn) new 1(bl_jlv), 1, null) != null;
    }

    public final List<jup> b(jup bl_jup) {
        jgp.b(bl_jup, "name");
        List<jup> list = (List) f.get(bl_jup);
        return list != null ? list : jeh.a();
    }

    public final boolean c(jlv bl_jlv) {
        jgp.b(bl_jlv, "$receiver");
        return jgp.a(bl_jlv.ba_().a(), "removeAt") && jgp.a(jty.b((jkn) bl_jlv), b.b());
    }
}
