package bili4.com.xiaomi.xmpush.thrift;

import bl.kpo;
import bl.kpt;
import bl.kpv;
import bl.kpw;
import bl.kpx;
import bl.kpz;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.sqlcipher.IBulkCursor;
import org.apache.thrift.meta_data.b;
import org.apache.thrift.meta_data.c;
import org.apache.thrift.meta_data.e;
import u.aly.au;
import u.aly.bo;
import u.aly.cp;
import u.aly.cv;
import u.aly.dd;
import u.aly.j;
import u.aly.q;

public class f implements Serializable, Cloneable, org.apache.thrift.a<f, a> {
    public static final Map<a, b> l;
    private static final kpz m = new kpz("ClientUploadDataItem");
    private static final kpt n = new kpt(au.b, cv.i, (short) 1);
    private static final kpt o = new kpt("data", cv.i, (short) 2);
    private static final kpt p = new kpt("name", cv.i, (short) 3);
    private static final kpt q = new kpt("counter", (byte) 10, (short) 4);
    private static final kpt r = new kpt("timestamp", (byte) 10, (short) 5);
    private static final kpt s = new kpt("fromSdk", (byte) 2, (short) 6);
    private static final kpt t = new kpt("category", cv.i, (short) 7);
    private static final kpt u = new kpt("sourcePackage", cv.i, (short) 8);
    private static final kpt v = new kpt(au.aG, cv.i, (short) 9);
    private static final kpt w = new kpt("extra", cv.k, (short) 10);
    private static final kpt x = new kpt("pkgName", cv.i, (short) 11);
    public String a;
    public String b;
    public String c;
    public long d;
    public long e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public Map<String, String> j;
    public String k;
    private BitSet y = new BitSet(3);

    public enum a {
        CHANNEL((short) 1, au.b),
        DATA((short) 2, "data"),
        NAME((short) 3, "name"),
        COUNTER((short) 4, "counter"),
        TIMESTAMP((short) 5, "timestamp"),
        FROM_SDK((short) 6, "fromSdk"),
        CATEGORY((short) 7, "category"),
        SOURCE_PACKAGE((short) 8, "sourcePackage"),
        ID((short) 9, au.aG),
        EXTRA((short) 10, "extra"),
        PKG_NAME((short) 11, "pkgName");
        
        private static final Map<String, a> l = null;
        private final short m;
        private final String n;

        static {
            l = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                l.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.m = s;
            this.n = str;
        }

        public String a() {
            return this.n;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.CHANNEL, new b(au.b, (byte) 2, new c(cv.i)));
        enumMap.put(a.DATA, new b("data", (byte) 2, new c(cv.i)));
        enumMap.put(a.NAME, new b("name", (byte) 2, new c(cv.i)));
        enumMap.put(a.COUNTER, new b("counter", (byte) 2, new c((byte) 10)));
        enumMap.put(a.TIMESTAMP, new b("timestamp", (byte) 2, new c((byte) 10)));
        enumMap.put(a.FROM_SDK, new b("fromSdk", (byte) 2, new c((byte) 2)));
        enumMap.put(a.CATEGORY, new b("category", (byte) 2, new c(cv.i)));
        enumMap.put(a.SOURCE_PACKAGE, new b("sourcePackage", (byte) 2, new c(cv.i)));
        enumMap.put(a.ID, new b(au.aG, (byte) 2, new c(cv.i)));
        enumMap.put(a.EXTRA, new b("extra", (byte) 2, new e(cv.k, new c(cv.i), new c(cv.i))));
        enumMap.put(a.PKG_NAME, new b("pkgName", (byte) 2, new c(cv.i)));
        l = Collections.unmodifiableMap(enumMap);
        b.a(f.class, l);
    }

    public f a(long j) {
        this.d = j;
        a(true);
        return this;
    }

    public f a(String str) {
        this.a = str;
        return this;
    }

    public String a() {
        return this.a;
    }

    public void a(kpw bl_kpw) {
        bl_kpw.g();
        while (true) {
            kpt i = bl_kpw.i();
            if (i.b == (byte) 0) {
                bl_kpw.h();
                r();
                return;
            }
            switch (i.c) {
                case q.a /*1*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.a = bl_kpw.w();
                        break;
                    }
                case dd.c /*2*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.b = bl_kpw.w();
                        break;
                    }
                case dd.d /*3*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.c = bl_kpw.w();
                        break;
                    }
                case dd.e /*4*/:
                    if (i.b != (byte) 10) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.d = bl_kpw.u();
                    a(true);
                    break;
                case cp.f /*5*/:
                    if (i.b != (byte) 10) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.e = bl_kpw.u();
                    b(true);
                    break;
                case bo.g /*6*/:
                    if (i.b != (byte) 2) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.f = bl_kpw.q();
                    d(true);
                    break;
                case bo.h /*7*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.g = bl_kpw.w();
                        break;
                    }
                case j.f /*8*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.h = bl_kpw.w();
                        break;
                    }
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.i = bl_kpw.w();
                        break;
                    }
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    if (i.b != cv.k) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    kpv k = bl_kpw.k();
                    this.j = new HashMap(k.c * 2);
                    for (int i2 = 0; i2 < k.c; i2++) {
                        this.j.put(bl_kpw.w(), bl_kpw.w());
                    }
                    bl_kpw.l();
                    break;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.k = bl_kpw.w();
                        break;
                    }
                default:
                    kpx.a(bl_kpw, i.b);
                    break;
            }
            bl_kpw.j();
        }
    }

    public void a(boolean z) {
        this.y.set(0, z);
    }

    public boolean a(f fVar) {
        if (fVar == null) {
            return false;
        }
        boolean b = b();
        boolean b2 = fVar.b();
        if ((b || b2) && (!b || !b2 || !this.a.equals(fVar.a))) {
            return false;
        }
        b = c();
        b2 = fVar.c();
        if ((b || b2) && (!b || !b2 || !this.b.equals(fVar.b))) {
            return false;
        }
        b = e();
        b2 = fVar.e();
        if ((b || b2) && (!b || !b2 || !this.c.equals(fVar.c))) {
            return false;
        }
        b = f();
        b2 = fVar.f();
        if ((b || b2) && (!b || !b2 || this.d != fVar.d)) {
            return false;
        }
        b = h();
        b2 = fVar.h();
        if ((b || b2) && (!b || !b2 || this.e != fVar.e)) {
            return false;
        }
        b = i();
        b2 = fVar.i();
        if ((b || b2) && (!b || !b2 || this.f != fVar.f)) {
            return false;
        }
        b = j();
        b2 = fVar.j();
        if ((b || b2) && (!b || !b2 || !this.g.equals(fVar.g))) {
            return false;
        }
        b = l();
        b2 = fVar.l();
        if ((b || b2) && (!b || !b2 || !this.h.equals(fVar.h))) {
            return false;
        }
        b = n();
        b2 = fVar.n();
        if ((b || b2) && (!b || !b2 || !this.i.equals(fVar.i))) {
            return false;
        }
        b = o();
        b2 = fVar.o();
        if ((b || b2) && (!b || !b2 || !this.j.equals(fVar.j))) {
            return false;
        }
        b = q();
        b2 = fVar.q();
        return !(b || b2) || (b && b2 && this.k.equals(fVar.k));
    }

    public int b(f fVar) {
        if (!getClass().equals(fVar.getClass())) {
            return getClass().getName().compareTo(fVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = kpo.a(this.a, fVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = kpo.a(this.b, fVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(e()).compareTo(Boolean.valueOf(fVar.e()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (e()) {
            compareTo = kpo.a(this.c, fVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(f()).compareTo(Boolean.valueOf(fVar.f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (f()) {
            compareTo = kpo.a(this.d, fVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(h()).compareTo(Boolean.valueOf(fVar.h()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (h()) {
            compareTo = kpo.a(this.e, fVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(i()).compareTo(Boolean.valueOf(fVar.i()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i()) {
            compareTo = kpo.a(this.f, fVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(j()).compareTo(Boolean.valueOf(fVar.j()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (j()) {
            compareTo = kpo.a(this.g, fVar.g);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(l()).compareTo(Boolean.valueOf(fVar.l()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (l()) {
            compareTo = kpo.a(this.h, fVar.h);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(n()).compareTo(Boolean.valueOf(fVar.n()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (n()) {
            compareTo = kpo.a(this.i, fVar.i);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(o()).compareTo(Boolean.valueOf(fVar.o()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (o()) {
            compareTo = kpo.a(this.j, fVar.j);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(q()).compareTo(Boolean.valueOf(fVar.q()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (q()) {
            compareTo = kpo.a(this.k, fVar.k);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public f b(long j) {
        this.e = j;
        b(true);
        return this;
    }

    public f b(String str) {
        this.b = str;
        return this;
    }

    public void b(kpw bl_kpw) {
        r();
        bl_kpw.a(m);
        if (this.a != null && b()) {
            bl_kpw.a(n);
            bl_kpw.a(this.a);
            bl_kpw.b();
        }
        if (this.b != null && c()) {
            bl_kpw.a(o);
            bl_kpw.a(this.b);
            bl_kpw.b();
        }
        if (this.c != null && e()) {
            bl_kpw.a(p);
            bl_kpw.a(this.c);
            bl_kpw.b();
        }
        if (f()) {
            bl_kpw.a(q);
            bl_kpw.a(this.d);
            bl_kpw.b();
        }
        if (h()) {
            bl_kpw.a(r);
            bl_kpw.a(this.e);
            bl_kpw.b();
        }
        if (i()) {
            bl_kpw.a(s);
            bl_kpw.a(this.f);
            bl_kpw.b();
        }
        if (this.g != null && j()) {
            bl_kpw.a(t);
            bl_kpw.a(this.g);
            bl_kpw.b();
        }
        if (this.h != null && l()) {
            bl_kpw.a(u);
            bl_kpw.a(this.h);
            bl_kpw.b();
        }
        if (this.i != null && n()) {
            bl_kpw.a(v);
            bl_kpw.a(this.i);
            bl_kpw.b();
        }
        if (this.j != null && o()) {
            bl_kpw.a(w);
            bl_kpw.a(new kpv(cv.i, cv.i, this.j.size()));
            for (Entry entry : this.j.entrySet()) {
                bl_kpw.a((String) entry.getKey());
                bl_kpw.a((String) entry.getValue());
            }
            bl_kpw.d();
            bl_kpw.b();
        }
        if (this.k != null && q()) {
            bl_kpw.a(x);
            bl_kpw.a(this.k);
            bl_kpw.b();
        }
        bl_kpw.c();
        bl_kpw.a();
    }

    public void b(boolean z) {
        this.y.set(1, z);
    }

    public boolean b() {
        return this.a != null;
    }

    public f c(String str) {
        this.c = str;
        return this;
    }

    public f c(boolean z) {
        this.f = z;
        d(true);
        return this;
    }

    public boolean c() {
        return this.b != null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((f) obj);
    }

    public f d(String str) {
        this.g = str;
        return this;
    }

    public String d() {
        return this.c;
    }

    public void d(boolean z) {
        this.y.set(2, z);
    }

    public f e(String str) {
        this.h = str;
        return this;
    }

    public boolean e() {
        return this.c != null;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof f)) ? a((f) obj) : false;
    }

    public f f(String str) {
        this.i = str;
        return this;
    }

    public boolean f() {
        return this.y.get(0);
    }

    public long g() {
        return this.e;
    }

    public f g(String str) {
        this.k = str;
        return this;
    }

    public boolean h() {
        return this.y.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.y.get(2);
    }

    public boolean j() {
        return this.g != null;
    }

    public String k() {
        return this.h;
    }

    public boolean l() {
        return this.h != null;
    }

    public String m() {
        return this.i;
    }

    public boolean n() {
        return this.i != null;
    }

    public boolean o() {
        return this.j != null;
    }

    public String p() {
        return this.k;
    }

    public boolean q() {
        return this.k != null;
    }

    public void r() {
    }

    public String toString() {
        Object obj = null;
        StringBuilder stringBuilder = new StringBuilder("ClientUploadDataItem(");
        Object obj2 = 1;
        if (b()) {
            stringBuilder.append("channel:");
            if (this.a == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.a);
            }
            obj2 = null;
        }
        if (c()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("data:");
            if (this.b == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.b);
            }
            obj2 = null;
        }
        if (e()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("name:");
            if (this.c == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.c);
            }
            obj2 = null;
        }
        if (f()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("counter:");
            stringBuilder.append(this.d);
            obj2 = null;
        }
        if (h()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("timestamp:");
            stringBuilder.append(this.e);
            obj2 = null;
        }
        if (i()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("fromSdk:");
            stringBuilder.append(this.f);
            obj2 = null;
        }
        if (j()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("category:");
            if (this.g == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.g);
            }
            obj2 = null;
        }
        if (l()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("sourcePackage:");
            if (this.h == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.h);
            }
            obj2 = null;
        }
        if (n()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("id:");
            if (this.i == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.i);
            }
            obj2 = null;
        }
        if (o()) {
            if (obj2 == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("extra:");
            if (this.j == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.j);
            }
        } else {
            obj = obj2;
        }
        if (q()) {
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("pkgName:");
            if (this.k == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.k);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
