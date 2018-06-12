package bili4.kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import bl.jfm;
import bl.jqu;
import bl.jrx;
import bl.jup;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* compiled from: BL */
public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends Lambda implements jfm<Map<jup, ? extends jrx>> {
    final /* synthetic */ jqu this$0;

    public LazyJavaClassMemberScope$enumEntryIndex$1(jqu bl_jqu) {
        this.this$0 = bl_jqu;
        super(0);
    }

    public final Map<bl.jup, bl.jrx> b() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1.b():java.util.Map<bl.jup, bl.jrx>
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:265)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
Caused by: java.lang.NullPointerException
	at jadx.core.dex.nodes.MethodNode.addJump(MethodNode.java:370)
	at jadx.core.dex.nodes.MethodNode.initJumps(MethodNode.java:356)
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:106)
	... 5 more
*/
        /*
        r0 = this;
        r0 = r4.this$0;
        r0 = bl.jqu.a(r0);
        r0 = r0.l();
        r0 = (java.lang.Iterable) r0;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r1 = (java.util.Collection) r1;
        r3 = r0.iterator();
    L_0x0017:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x002e;
    L_0x001d:
        r2 = r3.next();
        r0 = r2;
        r0 = (bl.jrx) r0;
        r0 = r0.c();
        if (r0 == 0) goto L_0x0017;
    L_0x002a:
        r1.add(r2);
        goto L_0x0017;
    L_0x002e:
        r1 = (java.util.List) r1;
        r1 = (java.lang.Iterable) r1;
        r0 = 10;
        r0 = bl.jeg.a(r1, r0);
        r0 = bl.jet.a(r0);
        r2 = 16;
        r2 = bl.jhi.c(r0, r2);
        r0 = new java.util.LinkedHashMap;
        r0.<init>(r2);
        r0 = (java.util.Map) r0;
        r3 = r1.iterator();
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0063;
    L_0x0054:
        r2 = r3.next();
        r1 = r2;
        r1 = (bl.jrx) r1;
        r1 = r1.r();
        r0.put(r1, r2);
        goto L_0x004e;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1.b():java.util.Map<bl.jup, bl.jrx>");
    }

    public /* synthetic */ Object a() {
        return b();
    }
}
