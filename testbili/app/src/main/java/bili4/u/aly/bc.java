package bili4.u.aly;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: BL */
public class bc implements Serializable, Cloneable, bp<bc, e> {
    public static final Map<e, cb> d;
    private static final ct e = new ct("IdTracking");
    private static final cj f = new cj("snapshots", cv.k, (short) 1);
    private static final cj g = new cj("journals", cv.m, (short) 2);
    private static final cj h = new cj("checksum", cv.i, (short) 3);
    private static final Map<Class<? extends cw>, cx> i = new HashMap();
    public Map<String, bb> a;
    public List<ba> b;
    public String c;
    private e[] j;

    /* compiled from: BL */
    static class a extends cy<bc> {
        private a() {
        }

        public /* synthetic */ void a(co coVar, bp bpVar) throws bv {
            b(coVar, (bc) bpVar);
        }

        public /* synthetic */ void b(co coVar, bp bpVar) throws bv {
            a(coVar, (bc) bpVar);
        }

        public void a(co coVar, bc bcVar) throws bv {
            coVar.j();
            while (true) {
                cj l = coVar.l();
                if (l.b == (byte) 0) {
                    coVar.k();
                    bcVar.o();
                    return;
                }
                int i;
                switch (l.c) {
                    case q.a /*1*/:
                        if (l.b != cv.k) {
                            cr.a(coVar, l.b);
                            break;
                        }
                        cl n = coVar.n();
                        bcVar.a = new HashMap(n.c * 2);
                        for (i = 0; i < n.c; i++) {
                            String z = coVar.z();
                            bb bbVar = new bb();
                            bbVar.a(coVar);
                            bcVar.a.put(z, bbVar);
                        }
                        coVar.o();
                        bcVar.a(true);
                        break;
                    case dd.c /*2*/:
                        if (l.b != cv.m) {
                            cr.a(coVar, l.b);
                            break;
                        }
                        ck p = coVar.p();
                        bcVar.b = new ArrayList(p.b);
                        for (i = 0; i < p.b; i++) {
                            ba baVar = new ba();
                            baVar.a(coVar);
                            bcVar.b.add(baVar);
                        }
                        coVar.q();
                        bcVar.b(true);
                        break;
                    case dd.d /*3*/:
                        if (l.b != cv.i) {
                            cr.a(coVar, l.b);
                            break;
                        }
                        bcVar.c = coVar.z();
                        bcVar.c(true);
                        break;
                    default:
                        cr.a(coVar, l.b);
                        break;
                }
                coVar.m();
            }
        }

        public void b(co coVar, bc bcVar) throws bv {
            bcVar.o();
            coVar.a(bc.e);
            if (bcVar.a != null) {
                coVar.a(bc.f);
                coVar.a(new cl(cv.i, cv.j, bcVar.a.size()));
                for (Entry entry : bcVar.a.entrySet()) {
                    coVar.a((String) entry.getKey());
                    ((bb) entry.getValue()).b(coVar);
                }
                coVar.e();
                coVar.c();
            }
            if (bcVar.b != null && bcVar.k()) {
                coVar.a(bc.g);
                coVar.a(new ck(cv.j, bcVar.b.size()));
                for (ba b : bcVar.b) {
                    b.b(coVar);
                }
                coVar.f();
                coVar.c();
            }
            if (bcVar.c != null && bcVar.n()) {
                coVar.a(bc.h);
                coVar.a(bcVar.c);
                coVar.c();
            }
            coVar.d();
            coVar.b();
        }
    }

    /* compiled from: BL */
    static class b implements cx {
        private b() {
        }

        public /* synthetic */ cw b() {
            return a();
        }

        public a a() {
            return new a();
        }
    }

    /* compiled from: BL */
    static class c extends cz<bc> {
        private c() {
        }

        public void a(co coVar, bc bcVar) throws bv {
            coVar = (cu) coVar;
            coVar.a(bcVar.a.size());
            for (Entry entry : bcVar.a.entrySet()) {
                coVar.a((String) entry.getKey());
                ((bb) entry.getValue()).b(coVar);
            }
            BitSet bitSet = new BitSet();
            if (bcVar.k()) {
                bitSet.set(0);
            }
            if (bcVar.n()) {
                bitSet.set(1);
            }
            coVar.a(bitSet, 2);
            if (bcVar.k()) {
                coVar.a(bcVar.b.size());
                for (ba b : bcVar.b) {
                    b.b(coVar);
                }
            }
            if (bcVar.n()) {
                coVar.a(bcVar.c);
            }
        }

        public void b(co coVar, bc bcVar) throws bv {
            int i = 0;
            coVar = (cu) coVar;
            cl clVar = new cl(cv.i, cv.j, coVar.w());
            bcVar.a = new HashMap(clVar.c * 2);
            for (int i2 = 0; i2 < clVar.c; i2++) {
                String z = coVar.z();
                bb bbVar = new bb();
                bbVar.a(coVar);
                bcVar.a.put(z, bbVar);
            }
            bcVar.a(true);
            BitSet b = coVar.b(2);
            if (b.get(0)) {
                ck ckVar = new ck(cv.j, coVar.w());
                bcVar.b = new ArrayList(ckVar.b);
                while (i < ckVar.b) {
                    ba baVar = new ba();
                    baVar.a(coVar);
                    bcVar.b.add(baVar);
                    i++;
                }
                bcVar.b(true);
            }
            if (b.get(1)) {
                bcVar.c = coVar.z();
                bcVar.c(true);
            }
        }
    }

    /* compiled from: BL */
    static class d implements cx {
        private d() {
        }

        public /* synthetic */ cw b() {
            return a();
        }

        public c a() {
            return new c();
        }
    }

    /* compiled from: BL */
    public enum e implements bw {
        SNAPSHOTS((short) 1, "snapshots"),
        JOURNALS((short) 2, "journals"),
        CHECKSUM((short) 3, "checksum");
        
        private static final Map<String, e> d = null;
        private final short e;
        private final String f;

        static {
            d = new HashMap();
            Iterator it = EnumSet.allOf(e.class).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                d.put(eVar.b(), eVar);
            }
        }

        public static e a(int i) {
            switch (i) {
                case q.a /*1*/:
                    return SNAPSHOTS;
                case dd.c /*2*/:
                    return JOURNALS;
                case dd.d /*3*/:
                    return CHECKSUM;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e a = a(i);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static e a(String str) {
            return (e) d.get(str);
        }

        private e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public short a() {
            return this.e;
        }

        public String b() {
            return this.f;
        }
    }

    public /* synthetic */ bw b(int i) {
        return a(i);
    }

    public /* synthetic */ bp p() {
        return a();
    }

    static {
        i.put(cy.class, new b());
        i.put(cz.class, new d());
        Map enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new cb("snapshots", (byte) 1, new ce(cv.k, new cc(cv.i), new cg(cv.j, bb.class))));
        enumMap.put(e.JOURNALS, new cb("journals", (byte) 2, new cd(cv.m, new cg(cv.j, ba.class))));
        enumMap.put(e.CHECKSUM, new cb("checksum", (byte) 2, new cc(cv.i)));
        d = Collections.unmodifiableMap(enumMap);
        cb.a(bc.class, d);
    }

    public bc() {
        this.j = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public bc(Map<String, bb> map) {
        this();
        this.a = map;
    }

    public bc(bc bcVar) {
        this.j = new e[]{e.JOURNALS, e.CHECKSUM};
        if (bcVar.f()) {
            Map hashMap = new HashMap();
            for (Entry entry : bcVar.a.entrySet()) {
                hashMap.put((String) entry.getKey(), new bb((bb) entry.getValue()));
            }
            this.a = hashMap;
        }
        if (bcVar.k()) {
            List arrayList = new ArrayList();
            for (ba baVar : bcVar.b) {
                arrayList.add(new ba(baVar));
            }
            this.b = arrayList;
        }
        if (bcVar.n()) {
            this.c = bcVar.c;
        }
    }

    public bc a() {
        return new bc(this);
    }

    public void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public int c() {
        return this.a == null ? 0 : this.a.size();
    }

    public void a(String str, bb bbVar) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, bbVar);
    }

    public Map<String, bb> d() {
        return this.a;
    }

    public bc a(Map<String, bb> map) {
        this.a = map;
        return this;
    }

    public void e() {
        this.a = null;
    }

    public boolean f() {
        return this.a != null;
    }

    public void a(boolean z) {
        if (!z) {
            this.a = null;
        }
    }

    public int g() {
        return this.b == null ? 0 : this.b.size();
    }

    public Iterator<ba> h() {
        return this.b == null ? null : this.b.iterator();
    }

    public void a(ba baVar) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(baVar);
    }

    public List<ba> i() {
        return this.b;
    }

    public bc a(List<ba> list) {
        this.b = list;
        return this;
    }

    public void j() {
        this.b = null;
    }

    public boolean k() {
        return this.b != null;
    }

    public void b(boolean z) {
        if (!z) {
            this.b = null;
        }
    }

    public String l() {
        return this.c;
    }

    public bc a(String str) {
        this.c = str;
        return this;
    }

    public void m() {
        this.c = null;
    }

    public boolean n() {
        return this.c != null;
    }

    public void c(boolean z) {
        if (!z) {
            this.c = null;
        }
    }

    public e a(int i) {
        return e.a(i);
    }

    public void a(co coVar) throws bv {
        ((cx) i.get(coVar.D())).b().b(coVar, this);
    }

    public void b(co coVar) throws bv {
        ((cx) i.get(coVar.D())).b().a(coVar, this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IdTracking(");
        stringBuilder.append("snapshots:");
        if (this.a == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.a);
        }
        if (k()) {
            stringBuilder.append(", ");
            stringBuilder.append("journals:");
            if (this.b == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.b);
            }
        }
        if (n()) {
            stringBuilder.append(", ");
            stringBuilder.append("checksum:");
            if (this.c == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.c);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public void o() throws bv {
        if (this.a == null) {
            throw new cp("Required field 'snapshots' was not present! Struct: " + toString());
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            b(new ci(new da((OutputStream) objectOutputStream)));
        } catch (bv e) {
            throw new IOException(e.getMessage());
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            a(new ci(new da((InputStream) objectInputStream)));
        } catch (bv e) {
            throw new IOException(e.getMessage());
        }
    }
}
