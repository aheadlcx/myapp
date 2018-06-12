package bili2.bl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: BL */
final class jsu {
    private final Map<String, jsr> a = new LinkedHashMap();

    /* compiled from: BL */
    public final class a {
        final /* synthetic */ jsu a;
        private final String b;

        /* compiled from: BL */
        public final class a {
            final /* synthetic */ a a;
            private final List<Pair<String, jsy>> b = new ArrayList();
            private Pair<String, jsy> c = jdt.a("V", null);
            private final String d;

            public final void a(String r1, bl.jsn... r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: bl.jsu.a.a.a(java.lang.String, bl.jsn[]):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:265)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:272)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:272)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
Caused by: java.lang.NullPointerException
*/
                /*
                r0 = this;
                r0 = "type";
                bl.jgp.b(r7, r0);
                r0 = "qualifiers";
                bl.jgp.b(r8, r0);
                r0 = r6.b;
                r0 = (java.util.Collection) r0;
                r1 = r8;
                r1 = (java.lang.Object[]) r1;
                r1 = r1.length;
                if (r1 != 0) goto L_0x0022;
            L_0x0016:
                r1 = 1;
            L_0x0017:
                if (r1 == 0) goto L_0x0024;
            L_0x0019:
                r1 = 0;
                r1 = bl.jdt.a(r7, r1);
                r0.add(r1);
                return;
            L_0x0022:
                r1 = 0;
                goto L_0x0017;
            L_0x0024:
                r8 = (java.lang.Object[]) r8;
                r2 = bl.jee.k(r8);
                r1 = 10;
                r1 = bl.jei.a(r2, r1);
                r1 = bl.jew.a(r1);
                r3 = 16;
                r3 = bl.jhk.c(r1, r3);
                r1 = new java.util.LinkedHashMap;
                r1.<init>(r3);
                r1 = (java.util.Map) r1;
                r4 = r2.iterator();
                r2 = r4.hasNext();
                if (r2 == 0) goto L_0x0066;
            L_0x004b:
                r3 = r4.next();
                r2 = r3;
                r2 = (bl.jeo) r2;
                r2 = r2.a();
                r5 = java.lang.Integer.valueOf(r2);
                r3 = (bl.jeo) r3;
                r2 = r3.b();
                r2 = (bl.jsn) r2;
                r1.put(r5, r2);
                goto L_0x0045;
                r2 = new bl.jsy;
                r2.<init>(r1);
                r1 = r2;
                goto L_0x001a;
                */
                throw new UnsupportedOperationException("Method not decompiled: bl.jsu.a.a.a(java.lang.String, bl.jsn[]):void");
            }

            public final void b(String r1, bl.jsn... r2) {
                /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.DecodeException: Load method exception in method: bl.jsu.a.a.b(java.lang.String, bl.jsn[]):void
	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:116)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:265)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:272)
	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:272)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
Caused by: java.lang.NullPointerException
*/
                /*
                r0 = this;
                r0 = "type";
                bl.jgp.b(r6, r0);
                r0 = "qualifiers";
                bl.jgp.b(r7, r0);
                r7 = (java.lang.Object[]) r7;
                r1 = bl.jee.k(r7);
                r0 = 10;
                r0 = bl.jei.a(r1, r0);
                r0 = bl.jew.a(r0);
                r2 = 16;
                r2 = bl.jhk.c(r0, r2);
                r0 = new java.util.LinkedHashMap;
                r0.<init>(r2);
                r0 = (java.util.Map) r0;
                r3 = r1.iterator();
                r1 = r3.hasNext();
                if (r1 == 0) goto L_0x004e;
            L_0x0033:
                r2 = r3.next();
                r1 = r2;
                r1 = (bl.jeo) r1;
                r1 = r1.a();
                r4 = java.lang.Integer.valueOf(r1);
                r2 = (bl.jeo) r2;
                r1 = r2.b();
                r1 = (bl.jsn) r1;
                r0.put(r4, r1);
                goto L_0x002d;
                r1 = new bl.jsy;
                r1.<init>(r0);
                r0 = bl.jdt.a(r6, r1);
                r5.c = r0;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: bl.jsu.a.a.b(java.lang.String, bl.jsn[]):void");
            }

            public a(a aVar, String str) {
                jgp.b(str, "functionName");
                this.a = aVar;
                this.d = str;
            }

            public final void a(JvmPrimitiveType jvmPrimitiveType) {
                jgp.b(jvmPrimitiveType, "type");
                this.c = jdt.a(jvmPrimitiveType.c(), null);
            }

            public final Pair<String, jsr> a() {
                juc bl_juc = juc.a;
                String a = this.a.a();
                String str = this.d;
                Iterable<Pair> iterable = this.b;
                Collection arrayList = new ArrayList(jei.a(iterable, 10));
                for (Pair a2 : iterable) {
                    arrayList.add((String) a2.a());
                }
                a = bl_juc.a(a, bl_juc.a(str, (List) arrayList, (String) this.c.a()));
                jsy bl_jsy = (jsy) this.c.b();
                Iterable<Pair> iterable2 = this.b;
                Collection arrayList2 = new ArrayList(jei.a(iterable2, 10));
                for (Pair b : iterable2) {
                    arrayList2.add((jsy) b.b());
                }
                return jdt.a(a, new jsr(bl_jsy, (List) arrayList2));
            }
        }

        public a(jsu bl_jsu, String str) {
            jgp.b(str, "className");
            this.a = bl_jsu;
            this.b = str;
        }

        public final String a() {
            return this.b;
        }

        public final void a(String str, jfn<? super a, jdv> bl_jfn__super_bl_jsu_a_a__bl_jdv) {
            jgp.b(str, "name");
            jgp.b(bl_jfn__super_bl_jsu_a_a__bl_jdv, "block");
            Map a = this.a.a;
            a aVar = new a(this, str);
            bl_jfn__super_bl_jsu_a_a__bl_jdv.a(aVar);
            Pair a2 = aVar.a();
            a.put(a2.a(), a2.b());
        }
    }

    public final Map<String, jsr> a() {
        return this.a;
    }
}
