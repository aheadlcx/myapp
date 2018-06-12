package bili2.bl;

/* compiled from: BL */
public abstract class kbm extends kch {
    public abstract kbm a(boolean z);

    public abstract kbm c(jmq bl_jmq);

    public String toString() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: bl.kbm.toString():java.lang.String
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:265)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
Caused by: java.lang.NullPointerException
*/
        /*
        r0 = this;
        r5 = 0;
        r6 = 0;
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r0 = r11.w();
        r0 = r0.c();
        r1 = r0.iterator();
    L_0x0013:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0042;
    L_0x0019:
        r0 = r1.next();
        r0 = (bl.jmp) r0;
        r2 = r0.c();
        r0 = r0.d();
        r3 = 3;
        r3 = new java.lang.String[r3];
        r4 = "[";
        r3[r5] = r4;
        r4 = 1;
        r7 = bl.jvr.h;
        r0 = r7.a(r2, r0);
        r3[r4] = r0;
        r0 = 2;
        r2 = "] ";
        r3[r0] = r2;
        bl.kgn.a(r10, r3);
        goto L_0x0013;
    L_0x0042:
        r0 = r11.g();
        r10.append(r0);
        r0 = r11.a();
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0072;
    L_0x0053:
        r0 = r11.a();
        r0 = (java.lang.Iterable) r0;
        r1 = r10;
        r1 = (java.lang.Appendable) r1;
        r2 = ", ";
        r2 = (java.lang.CharSequence) r2;
        r3 = "<";
        r3 = (java.lang.CharSequence) r3;
        r4 = ">";
        r4 = (java.lang.CharSequence) r4;
        r8 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r7 = r6;
        r9 = r6;
        bl.jem.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9);
    L_0x0072:
        r0 = r11.c();
        if (r0 == 0) goto L_0x007e;
    L_0x0078:
        r0 = "?";
        r10.append(r0);
        r0 = r10.toString();
        r1 = "StringBuilder().apply(builderAction).toString()";
        bl.jgp.a(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.kbm.toString():java.lang.String");
    }

    public kbm() {
        super();
    }
}
