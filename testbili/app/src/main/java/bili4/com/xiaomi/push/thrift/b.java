package bili4.com.xiaomi.push.thrift;

import bl.kpo;
import bl.kpt;
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
import net.sqlcipher.IBulkCursor;
import org.apache.thrift.meta_data.c;
import org.apache.thrift.protocol.f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u.aly.bo;
import u.aly.cp;
import u.aly.cv;
import u.aly.dd;
import u.aly.j;
import u.aly.q;

public class b implements Serializable, Cloneable, org.apache.thrift.a<b, a> {
    public static final Map<a, org.apache.thrift.meta_data.b> k;
    private static final kpz l = new kpz("StatsEvent");
    private static final kpt m = new kpt("chid", (byte) 3, (short) 1);
    private static final kpt n = new kpt(IjkMediaMeta.IJKM_KEY_TYPE, (byte) 8, (short) 2);
    private static final kpt o = new kpt(u.aly.d.a.a.c, (byte) 8, (short) 3);
    private static final kpt p = new kpt("connpt", cv.i, (short) 4);
    private static final kpt q = new kpt("host", cv.i, (short) 5);
    private static final kpt r = new kpt("subvalue", (byte) 8, (short) 6);
    private static final kpt s = new kpt("annotation", cv.i, (short) 7);
    private static final kpt t = new kpt("user", cv.i, (short) 8);
    private static final kpt u = new kpt("time", (byte) 8, (short) 9);
    private static final kpt v = new kpt("clientIp", (byte) 8, (short) 10);
    public byte a;
    public int b;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    public int j;
    private BitSet w = new BitSet(6);

    public enum a {
        CHID((short) 1, "chid"),
        TYPE((short) 2, IjkMediaMeta.IJKM_KEY_TYPE),
        VALUE((short) 3, u.aly.d.a.a.c),
        CONNPT((short) 4, "connpt"),
        HOST((short) 5, "host"),
        SUBVALUE((short) 6, "subvalue"),
        ANNOTATION((short) 7, "annotation"),
        USER((short) 8, "user"),
        TIME((short) 9, "time"),
        CLIENT_IP((short) 10, "clientIp");
        
        private static final Map<String, a> k = null;
        private final short l;
        private final String m;

        static {
            k = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                k.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.l = s;
            this.m = str;
        }

        public String a() {
            return this.m;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.CHID, new org.apache.thrift.meta_data.b("chid", (byte) 1, new c((byte) 3)));
        enumMap.put(a.TYPE, new org.apache.thrift.meta_data.b(IjkMediaMeta.IJKM_KEY_TYPE, (byte) 1, new c((byte) 8)));
        enumMap.put(a.VALUE, new org.apache.thrift.meta_data.b(u.aly.d.a.a.c, (byte) 1, new c((byte) 8)));
        enumMap.put(a.CONNPT, new org.apache.thrift.meta_data.b("connpt", (byte) 1, new c(cv.i)));
        enumMap.put(a.HOST, new org.apache.thrift.meta_data.b("host", (byte) 2, new c(cv.i)));
        enumMap.put(a.SUBVALUE, new org.apache.thrift.meta_data.b("subvalue", (byte) 2, new c((byte) 8)));
        enumMap.put(a.ANNOTATION, new org.apache.thrift.meta_data.b("annotation", (byte) 2, new c(cv.i)));
        enumMap.put(a.USER, new org.apache.thrift.meta_data.b("user", (byte) 2, new c(cv.i)));
        enumMap.put(a.TIME, new org.apache.thrift.meta_data.b("time", (byte) 2, new c((byte) 8)));
        enumMap.put(a.CLIENT_IP, new org.apache.thrift.meta_data.b("clientIp", (byte) 2, new c((byte) 8)));
        k = Collections.unmodifiableMap(enumMap);
        org.apache.thrift.meta_data.b.a(b.class, k);
    }

    public b a(byte b) {
        this.a = b;
        a(true);
        return this;
    }

    public b a(int i) {
        this.b = i;
        b(true);
        return this;
    }

    public b a(String str) {
        this.d = str;
        return this;
    }

    public void a(kpw bl_kpw) {
        bl_kpw.g();
        while (true) {
            kpt i = bl_kpw.i();
            if (i.b == (byte) 0) {
                bl_kpw.h();
                if (!a()) {
                    throw new f("Required field 'chid' was not found in serialized data! Struct: " + toString());
                } else if (!b()) {
                    throw new f("Required field 'type' was not found in serialized data! Struct: " + toString());
                } else if (c()) {
                    k();
                    return;
                } else {
                    throw new f("Required field 'value' was not found in serialized data! Struct: " + toString());
                }
            }
            switch (i.c) {
                case q.a /*1*/:
                    if (i.b != (byte) 3) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.a = bl_kpw.r();
                    a(true);
                    break;
                case dd.c /*2*/:
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.b = bl_kpw.t();
                    b(true);
                    break;
                case dd.d /*3*/:
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.c = bl_kpw.t();
                    c(true);
                    break;
                case dd.e /*4*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.d = bl_kpw.w();
                        break;
                    }
                case cp.f /*5*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.e = bl_kpw.w();
                        break;
                    }
                case bo.g /*6*/:
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.f = bl_kpw.t();
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
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.i = bl_kpw.t();
                    e(true);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.j = bl_kpw.t();
                    f(true);
                    break;
                default:
                    kpx.a(bl_kpw, i.b);
                    break;
            }
            bl_kpw.j();
        }
    }

    public void a(boolean z) {
        this.w.set(0, z);
    }

    public boolean a() {
        return this.w.get(0);
    }

    public boolean a(b bVar) {
        if (bVar == null || this.a != bVar.a || this.b != bVar.b || this.c != bVar.c) {
            return false;
        }
        boolean d = d();
        boolean d2 = bVar.d();
        if ((d || d2) && (!d || !d2 || !this.d.equals(bVar.d))) {
            return false;
        }
        d = e();
        d2 = bVar.e();
        if ((d || d2) && (!d || !d2 || !this.e.equals(bVar.e))) {
            return false;
        }
        d = f();
        d2 = bVar.f();
        if ((d || d2) && (!d || !d2 || this.f != bVar.f)) {
            return false;
        }
        d = g();
        d2 = bVar.g();
        if ((d || d2) && (!d || !d2 || !this.g.equals(bVar.g))) {
            return false;
        }
        d = h();
        d2 = bVar.h();
        if ((d || d2) && (!d || !d2 || !this.h.equals(bVar.h))) {
            return false;
        }
        d = i();
        d2 = bVar.i();
        if ((d || d2) && (!d || !d2 || this.i != bVar.i)) {
            return false;
        }
        d = j();
        d2 = bVar.j();
        return !(d || d2) || (d && d2 && this.j == bVar.j);
    }

    public int b(b bVar) {
        if (!getClass().equals(bVar.getClass())) {
            return getClass().getName().compareTo(bVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(a()).compareTo(Boolean.valueOf(bVar.a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (a()) {
            compareTo = kpo.a(this.a, bVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(b()).compareTo(Boolean.valueOf(bVar.b()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (b()) {
            compareTo = kpo.a(this.b, bVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(bVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = kpo.a(this.c, bVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(d()).compareTo(Boolean.valueOf(bVar.d()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (d()) {
            compareTo = kpo.a(this.d, bVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(e()).compareTo(Boolean.valueOf(bVar.e()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (e()) {
            compareTo = kpo.a(this.e, bVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(f()).compareTo(Boolean.valueOf(bVar.f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (f()) {
            compareTo = kpo.a(this.f, bVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(g()).compareTo(Boolean.valueOf(bVar.g()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (g()) {
            compareTo = kpo.a(this.g, bVar.g);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(h()).compareTo(Boolean.valueOf(bVar.h()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (h()) {
            compareTo = kpo.a(this.h, bVar.h);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(i()).compareTo(Boolean.valueOf(bVar.i()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i()) {
            compareTo = kpo.a(this.i, bVar.i);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(j()).compareTo(Boolean.valueOf(bVar.j()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (j()) {
            compareTo = kpo.a(this.j, bVar.j);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public b b(int i) {
        this.c = i;
        c(true);
        return this;
    }

    public b b(String str) {
        this.e = str;
        return this;
    }

    public void b(kpw bl_kpw) {
        k();
        bl_kpw.a(l);
        bl_kpw.a(m);
        bl_kpw.a(this.a);
        bl_kpw.b();
        bl_kpw.a(n);
        bl_kpw.a(this.b);
        bl_kpw.b();
        bl_kpw.a(o);
        bl_kpw.a(this.c);
        bl_kpw.b();
        if (this.d != null) {
            bl_kpw.a(p);
            bl_kpw.a(this.d);
            bl_kpw.b();
        }
        if (this.e != null && e()) {
            bl_kpw.a(q);
            bl_kpw.a(this.e);
            bl_kpw.b();
        }
        if (f()) {
            bl_kpw.a(r);
            bl_kpw.a(this.f);
            bl_kpw.b();
        }
        if (this.g != null && g()) {
            bl_kpw.a(s);
            bl_kpw.a(this.g);
            bl_kpw.b();
        }
        if (this.h != null && h()) {
            bl_kpw.a(t);
            bl_kpw.a(this.h);
            bl_kpw.b();
        }
        if (i()) {
            bl_kpw.a(u);
            bl_kpw.a(this.i);
            bl_kpw.b();
        }
        if (j()) {
            bl_kpw.a(v);
            bl_kpw.a(this.j);
            bl_kpw.b();
        }
        bl_kpw.c();
        bl_kpw.a();
    }

    public void b(boolean z) {
        this.w.set(1, z);
    }

    public boolean b() {
        return this.w.get(1);
    }

    public b c(int i) {
        this.f = i;
        d(true);
        return this;
    }

    public b c(String str) {
        this.g = str;
        return this;
    }

    public void c(boolean z) {
        this.w.set(2, z);
    }

    public boolean c() {
        return this.w.get(2);
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((b) obj);
    }

    public b d(int i) {
        this.i = i;
        e(true);
        return this;
    }

    public b d(String str) {
        this.h = str;
        return this;
    }

    public void d(boolean z) {
        this.w.set(3, z);
    }

    public boolean d() {
        return this.d != null;
    }

    public b e(int i) {
        this.j = i;
        f(true);
        return this;
    }

    public void e(boolean z) {
        this.w.set(4, z);
    }

    public boolean e() {
        return this.e != null;
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof b)) ? a((b) obj) : false;
    }

    public void f(boolean z) {
        this.w.set(5, z);
    }

    public boolean f() {
        return this.w.get(3);
    }

    public boolean g() {
        return this.g != null;
    }

    public boolean h() {
        return this.h != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.w.get(4);
    }

    public boolean j() {
        return this.w.get(5);
    }

    public void k() {
        if (this.d == null) {
            throw new f("Required field 'connpt' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StatsEvent(");
        stringBuilder.append("chid:");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append("type:");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append("value:");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append("connpt:");
        if (this.d == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.d);
        }
        if (e()) {
            stringBuilder.append(", ");
            stringBuilder.append("host:");
            if (this.e == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.e);
            }
        }
        if (f()) {
            stringBuilder.append(", ");
            stringBuilder.append("subvalue:");
            stringBuilder.append(this.f);
        }
        if (g()) {
            stringBuilder.append(", ");
            stringBuilder.append("annotation:");
            if (this.g == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.g);
            }
        }
        if (h()) {
            stringBuilder.append(", ");
            stringBuilder.append("user:");
            if (this.h == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.h);
            }
        }
        if (i()) {
            stringBuilder.append(", ");
            stringBuilder.append("time:");
            stringBuilder.append(this.i);
        }
        if (j()) {
            stringBuilder.append(", ");
            stringBuilder.append("clientIp:");
            stringBuilder.append(this.j);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
