package bili2.bl;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: BL */
public class jqo implements jqp {
    private final jfn<jsa, Boolean> a;
    private final Map<jup, List<jsa>> b;
    private final Map<jup, jrx> c;
    private final jrq d;
    private final jfn<jrz, Boolean> e;

    public jqo(bl.jrq r1, bl.jfn<? super bl.jrz, Boolean> r2) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: bl.jqo.<init>(bl.jrq, bl.jfn):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:265)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
Caused by: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r0 = "jClass";
        bl.jgp.b(r6, r0);
        r0 = "memberFilter";
        bl.jgp.b(r7, r0);
        r5.<init>();
        r5.d = r6;
        r5.e = r7;
        r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.ClassDeclaredMemberIndex$methodFilter$1;
        r0.<init>(r5);
        r0 = (bl.jfn) r0;
        r5.a = r0;
        r0 = r5.d;
        r0 = r0.k();
        r0 = (java.lang.Iterable) r0;
        r0 = bl.jem.r(r0);
        r1 = r5.a;
        r1 = bl.kfu.a(r0, r1);
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        r3 = r1.a();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0060;
    L_0x003f:
        r2 = r3.next();
        r1 = r2;
        r1 = (bl.jsa) r1;
        r4 = r1.r();
        r1 = r0.get(r4);
        if (r1 != 0) goto L_0x0059;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r0.put(r4, r1);
        r1 = (java.util.List) r1;
        r1.add(r2);
        goto L_0x0039;
        r5.b = r0;
        r0 = r5.d;
        r0 = r0.l();
        r0 = (java.lang.Iterable) r0;
        r0 = bl.jem.r(r0);
        r1 = r5.e;
        r1 = bl.kfu.a(r0, r1);
        r0 = new java.util.LinkedHashMap;
        r0.<init>();
        r0 = (java.util.Map) r0;
        r3 = r1.a();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0095;
        r2 = r3.next();
        r1 = r2;
        r1 = (bl.jrx) r1;
        r1 = r1.r();
        r0.put(r1, r2);
        goto L_0x0080;
        r5.c = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.jqo.<init>(bl.jrq, bl.jfn):void");
    }

    public Collection<jsa> a(jup bl_jup) {
        jgp.b(bl_jup, "name");
        List list = (List) this.b.get(bl_jup);
        return list != null ? list : jeh.a();
    }

    public Set<jup> a() {
        Collection linkedHashSet = new LinkedHashSet();
        Iterator a = kfu.a(jem.r(this.d.k()), this.a).a();
        while (a.hasNext()) {
            linkedHashSet.add(((jsa) a.next()).r());
        }
        return (Set) linkedHashSet;
    }

    public jrx b(jup bl_jup) {
        jgp.b(bl_jup, "name");
        return (jrx) this.c.get(bl_jup);
    }

    public Set<jup> b() {
        Collection linkedHashSet = new LinkedHashSet();
        Iterator a = kfu.a(jem.r(this.d.l()), this.e).a();
        while (a.hasNext()) {
            linkedHashSet.add(((jrx) a.next()).r());
        }
        return (Set) linkedHashSet;
    }
}
