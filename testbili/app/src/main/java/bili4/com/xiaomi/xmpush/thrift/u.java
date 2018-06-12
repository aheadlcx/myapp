package bili4.com.xiaomi.xmpush.thrift;

import bl.kpo;
import bl.kpt;
import bl.kpv;
import bl.kpw;
import bl.kpx;
import bl.kpz;
import com.tencent.open.SocialConstants;
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
import org.apache.thrift.protocol.f;
import tv.danmaku.ijk.media.player.IjkMediaPlayer.OnNativeInvokeListener;
import u.aly.au;
import u.aly.bo;
import u.aly.cp;
import u.aly.cv;
import u.aly.dd;
import u.aly.j;
import u.aly.q;

public class u implements Serializable, Cloneable, org.apache.thrift.a<u, a> {
    public static final Map<a, b> m;
    private static final kpz n = new kpz("PushMetaInfo");
    private static final kpt o = new kpt(au.aG, cv.i, (short) 1);
    private static final kpt p = new kpt("messageTs", (byte) 10, (short) 2);
    private static final kpt q = new kpt("topic", cv.i, (short) 3);
    private static final kpt r = new kpt(SocialConstants.PARAM_TITLE, cv.i, (short) 4);
    private static final kpt s = new kpt(SocialConstants.PARAM_COMMENT, cv.i, (short) 5);
    private static final kpt t = new kpt("notifyType", (byte) 8, (short) 6);
    private static final kpt u = new kpt(OnNativeInvokeListener.ARG_URL, cv.i, (short) 7);
    private static final kpt v = new kpt("passThrough", (byte) 8, (short) 8);
    private static final kpt w = new kpt("notifyId", (byte) 8, (short) 9);
    private static final kpt x = new kpt("extra", cv.k, (short) 10);
    private static final kpt y = new kpt("internal", cv.k, (short) 11);
    private static final kpt z = new kpt("ignoreRegInfo", (byte) 2, (short) 12);
    private BitSet A;
    public String a;
    public long b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public int h;
    public int i;
    public Map<String, String> j;
    public Map<String, String> k;
    public boolean l;

    public enum a {
        ID((short) 1, au.aG),
        MESSAGE_TS((short) 2, "messageTs"),
        TOPIC((short) 3, "topic"),
        TITLE((short) 4, SocialConstants.PARAM_TITLE),
        DESCRIPTION((short) 5, SocialConstants.PARAM_COMMENT),
        NOTIFY_TYPE((short) 6, "notifyType"),
        URL((short) 7, OnNativeInvokeListener.ARG_URL),
        PASS_THROUGH((short) 8, "passThrough"),
        NOTIFY_ID((short) 9, "notifyId"),
        EXTRA((short) 10, "extra"),
        INTERNAL((short) 11, "internal"),
        IGNORE_REG_INFO((short) 12, "ignoreRegInfo");
        
        private static final Map<String, a> m = null;
        private final short n;
        private final String o;

        static {
            m = new HashMap();
            Iterator it = EnumSet.allOf(a.class).iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                m.put(aVar.a(), aVar);
            }
        }

        private a(short s, String str) {
            this.n = s;
            this.o = str;
        }

        public String a() {
            return this.o;
        }
    }

    static {
        Map enumMap = new EnumMap(a.class);
        enumMap.put(a.ID, new b(au.aG, (byte) 1, new c(cv.i)));
        enumMap.put(a.MESSAGE_TS, new b("messageTs", (byte) 1, new c((byte) 10)));
        enumMap.put(a.TOPIC, new b("topic", (byte) 2, new c(cv.i)));
        enumMap.put(a.TITLE, new b(SocialConstants.PARAM_TITLE, (byte) 2, new c(cv.i)));
        enumMap.put(a.DESCRIPTION, new b(SocialConstants.PARAM_COMMENT, (byte) 2, new c(cv.i)));
        enumMap.put(a.NOTIFY_TYPE, new b("notifyType", (byte) 2, new c((byte) 8)));
        enumMap.put(a.URL, new b(OnNativeInvokeListener.ARG_URL, (byte) 2, new c(cv.i)));
        enumMap.put(a.PASS_THROUGH, new b("passThrough", (byte) 2, new c((byte) 8)));
        enumMap.put(a.NOTIFY_ID, new b("notifyId", (byte) 2, new c((byte) 8)));
        enumMap.put(a.EXTRA, new b("extra", (byte) 2, new e(cv.k, new c(cv.i), new c(cv.i))));
        enumMap.put(a.INTERNAL, new b("internal", (byte) 2, new e(cv.k, new c(cv.i), new c(cv.i))));
        enumMap.put(a.IGNORE_REG_INFO, new b("ignoreRegInfo", (byte) 2, new c((byte) 2)));
        m = Collections.unmodifiableMap(enumMap);
        b.a(u.class, m);
    }

    public u() {
        this.A = new BitSet(5);
        this.l = false;
    }

    public u(u uVar) {
        Map hashMap;
        this.A = new BitSet(5);
        this.A.clear();
        this.A.or(uVar.A);
        if (uVar.c()) {
            this.a = uVar.a;
        }
        this.b = uVar.b;
        if (uVar.g()) {
            this.c = uVar.c;
        }
        if (uVar.i()) {
            this.d = uVar.d;
        }
        if (uVar.k()) {
            this.e = uVar.e;
        }
        this.f = uVar.f;
        if (uVar.n()) {
            this.g = uVar.g;
        }
        this.h = uVar.h;
        this.i = uVar.i;
        if (uVar.t()) {
            hashMap = new HashMap();
            for (Entry entry : uVar.j.entrySet()) {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
            this.j = hashMap;
        }
        if (uVar.v()) {
            hashMap = new HashMap();
            for (Entry entry2 : uVar.k.entrySet()) {
                hashMap.put((String) entry2.getKey(), (String) entry2.getValue());
            }
            this.k = hashMap;
        }
        this.l = uVar.l;
    }

    public u a() {
        return new u(this);
    }

    public u a(int i) {
        this.f = i;
        b(true);
        return this;
    }

    public u a(String str) {
        this.a = str;
        return this;
    }

    public u a(Map<String, String> map) {
        this.j = map;
        return this;
    }

    public void a(kpw bl_kpw) {
        bl_kpw.g();
        while (true) {
            kpt i = bl_kpw.i();
            if (i.b == (byte) 0) {
                bl_kpw.h();
                if (e()) {
                    y();
                    return;
                }
                throw new f("Required field 'messageTs' was not found in serialized data! Struct: " + toString());
            }
            kpv k;
            int i2;
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
                    if (i.b != (byte) 10) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.b = bl_kpw.u();
                    a(true);
                    break;
                case dd.d /*3*/:
                    if (i.b != cv.i) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    } else {
                        this.c = bl_kpw.w();
                        break;
                    }
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
                    b(true);
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
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.h = bl_kpw.t();
                    c(true);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    if (i.b != (byte) 8) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.i = bl_kpw.t();
                    d(true);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    if (i.b != cv.k) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    k = bl_kpw.k();
                    this.j = new HashMap(k.c * 2);
                    for (i2 = 0; i2 < k.c; i2++) {
                        this.j.put(bl_kpw.w(), bl_kpw.w());
                    }
                    bl_kpw.l();
                    break;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    if (i.b != cv.k) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    k = bl_kpw.k();
                    this.k = new HashMap(k.c * 2);
                    for (i2 = 0; i2 < k.c; i2++) {
                        this.k.put(bl_kpw.w(), bl_kpw.w());
                    }
                    bl_kpw.l();
                    break;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    if (i.b != (byte) 2) {
                        kpx.a(bl_kpw, i.b);
                        break;
                    }
                    this.l = bl_kpw.q();
                    e(true);
                    break;
                default:
                    kpx.a(bl_kpw, i.b);
                    break;
            }
            bl_kpw.j();
        }
    }

    public void a(String str, String str2) {
        if (this.j == null) {
            this.j = new HashMap();
        }
        this.j.put(str, str2);
    }

    public void a(boolean z) {
        this.A.set(0, z);
    }

    public boolean a(u uVar) {
        if (uVar == null) {
            return false;
        }
        boolean c = c();
        boolean c2 = uVar.c();
        if (((c || c2) && (!c || !c2 || !this.a.equals(uVar.a))) || this.b != uVar.b) {
            return false;
        }
        c = g();
        c2 = uVar.g();
        if ((c || c2) && (!c || !c2 || !this.c.equals(uVar.c))) {
            return false;
        }
        c = i();
        c2 = uVar.i();
        if ((c || c2) && (!c || !c2 || !this.d.equals(uVar.d))) {
            return false;
        }
        c = k();
        c2 = uVar.k();
        if ((c || c2) && (!c || !c2 || !this.e.equals(uVar.e))) {
            return false;
        }
        c = m();
        c2 = uVar.m();
        if ((c || c2) && (!c || !c2 || this.f != uVar.f)) {
            return false;
        }
        c = n();
        c2 = uVar.n();
        if ((c || c2) && (!c || !c2 || !this.g.equals(uVar.g))) {
            return false;
        }
        c = p();
        c2 = uVar.p();
        if ((c || c2) && (!c || !c2 || this.h != uVar.h)) {
            return false;
        }
        c = r();
        c2 = uVar.r();
        if ((c || c2) && (!c || !c2 || this.i != uVar.i)) {
            return false;
        }
        c = t();
        c2 = uVar.t();
        if ((c || c2) && (!c || !c2 || !this.j.equals(uVar.j))) {
            return false;
        }
        c = v();
        c2 = uVar.v();
        if ((c || c2) && (!c || !c2 || !this.k.equals(uVar.k))) {
            return false;
        }
        c = x();
        c2 = uVar.x();
        return !(c || c2) || (c && c2 && this.l == uVar.l);
    }

    public int b(u uVar) {
        if (!getClass().equals(uVar.getClass())) {
            return getClass().getName().compareTo(uVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(c()).compareTo(Boolean.valueOf(uVar.c()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (c()) {
            compareTo = kpo.a(this.a, uVar.a);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(e()).compareTo(Boolean.valueOf(uVar.e()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (e()) {
            compareTo = kpo.a(this.b, uVar.b);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(g()).compareTo(Boolean.valueOf(uVar.g()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (g()) {
            compareTo = kpo.a(this.c, uVar.c);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(i()).compareTo(Boolean.valueOf(uVar.i()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (i()) {
            compareTo = kpo.a(this.d, uVar.d);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(k()).compareTo(Boolean.valueOf(uVar.k()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (k()) {
            compareTo = kpo.a(this.e, uVar.e);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(m()).compareTo(Boolean.valueOf(uVar.m()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m()) {
            compareTo = kpo.a(this.f, uVar.f);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(n()).compareTo(Boolean.valueOf(uVar.n()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (n()) {
            compareTo = kpo.a(this.g, uVar.g);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(p()).compareTo(Boolean.valueOf(uVar.p()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (p()) {
            compareTo = kpo.a(this.h, uVar.h);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(r()).compareTo(Boolean.valueOf(uVar.r()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (r()) {
            compareTo = kpo.a(this.i, uVar.i);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(t()).compareTo(Boolean.valueOf(uVar.t()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (t()) {
            compareTo = kpo.a(this.j, uVar.j);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(v()).compareTo(Boolean.valueOf(uVar.v()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (v()) {
            compareTo = kpo.a(this.k, uVar.k);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        compareTo = Boolean.valueOf(x()).compareTo(Boolean.valueOf(uVar.x()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (x()) {
            compareTo = kpo.a(this.l, uVar.l);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public u b(int i) {
        this.h = i;
        c(true);
        return this;
    }

    public u b(String str) {
        this.c = str;
        return this;
    }

    public String b() {
        return this.a;
    }

    public void b(kpw bl_kpw) {
        y();
        bl_kpw.a(n);
        if (this.a != null) {
            bl_kpw.a(o);
            bl_kpw.a(this.a);
            bl_kpw.b();
        }
        bl_kpw.a(p);
        bl_kpw.a(this.b);
        bl_kpw.b();
        if (this.c != null && g()) {
            bl_kpw.a(q);
            bl_kpw.a(this.c);
            bl_kpw.b();
        }
        if (this.d != null && i()) {
            bl_kpw.a(r);
            bl_kpw.a(this.d);
            bl_kpw.b();
        }
        if (this.e != null && k()) {
            bl_kpw.a(s);
            bl_kpw.a(this.e);
            bl_kpw.b();
        }
        if (m()) {
            bl_kpw.a(t);
            bl_kpw.a(this.f);
            bl_kpw.b();
        }
        if (this.g != null && n()) {
            bl_kpw.a(u);
            bl_kpw.a(this.g);
            bl_kpw.b();
        }
        if (p()) {
            bl_kpw.a(v);
            bl_kpw.a(this.h);
            bl_kpw.b();
        }
        if (r()) {
            bl_kpw.a(w);
            bl_kpw.a(this.i);
            bl_kpw.b();
        }
        if (this.j != null && t()) {
            bl_kpw.a(x);
            bl_kpw.a(new kpv(cv.i, cv.i, this.j.size()));
            for (Entry entry : this.j.entrySet()) {
                bl_kpw.a((String) entry.getKey());
                bl_kpw.a((String) entry.getValue());
            }
            bl_kpw.d();
            bl_kpw.b();
        }
        if (this.k != null && v()) {
            bl_kpw.a(y);
            bl_kpw.a(new kpv(cv.i, cv.i, this.k.size()));
            for (Entry entry2 : this.k.entrySet()) {
                bl_kpw.a((String) entry2.getKey());
                bl_kpw.a((String) entry2.getValue());
            }
            bl_kpw.d();
            bl_kpw.b();
        }
        if (x()) {
            bl_kpw.a(z);
            bl_kpw.a(this.l);
            bl_kpw.b();
        }
        bl_kpw.c();
        bl_kpw.a();
    }

    public void b(String str, String str2) {
        if (this.k == null) {
            this.k = new HashMap();
        }
        this.k.put(str, str2);
    }

    public void b(boolean z) {
        this.A.set(1, z);
    }

    public u c(int i) {
        this.i = i;
        d(true);
        return this;
    }

    public u c(String str) {
        this.d = str;
        return this;
    }

    public void c(boolean z) {
        this.A.set(2, z);
    }

    public boolean c() {
        return this.a != null;
    }

    public /* synthetic */ int compareTo(Object obj) {
        return b((u) obj);
    }

    public long d() {
        return this.b;
    }

    public u d(String str) {
        this.e = str;
        return this;
    }

    public void d(boolean z) {
        this.A.set(3, z);
    }

    public void e(boolean z) {
        this.A.set(4, z);
    }

    public boolean e() {
        return this.A.get(0);
    }

    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof u)) ? a((u) obj) : false;
    }

    public String f() {
        return this.c;
    }

    public boolean g() {
        return this.c != null;
    }

    public String h() {
        return this.d;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.d != null;
    }

    public String j() {
        return this.e;
    }

    public boolean k() {
        return this.e != null;
    }

    public int l() {
        return this.f;
    }

    public boolean m() {
        return this.A.get(1);
    }

    public boolean n() {
        return this.g != null;
    }

    public int o() {
        return this.h;
    }

    public boolean p() {
        return this.A.get(2);
    }

    public int q() {
        return this.i;
    }

    public boolean r() {
        return this.A.get(3);
    }

    public Map<String, String> s() {
        return this.j;
    }

    public boolean t() {
        return this.j != null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("PushMetaInfo(");
        stringBuilder.append("id:");
        if (this.a == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append(this.a);
        }
        stringBuilder.append(", ");
        stringBuilder.append("messageTs:");
        stringBuilder.append(this.b);
        if (g()) {
            stringBuilder.append(", ");
            stringBuilder.append("topic:");
            if (this.c == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.c);
            }
        }
        if (i()) {
            stringBuilder.append(", ");
            stringBuilder.append("title:");
            if (this.d == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.d);
            }
        }
        if (k()) {
            stringBuilder.append(", ");
            stringBuilder.append("description:");
            if (this.e == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.e);
            }
        }
        if (m()) {
            stringBuilder.append(", ");
            stringBuilder.append("notifyType:");
            stringBuilder.append(this.f);
        }
        if (n()) {
            stringBuilder.append(", ");
            stringBuilder.append("url:");
            if (this.g == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.g);
            }
        }
        if (p()) {
            stringBuilder.append(", ");
            stringBuilder.append("passThrough:");
            stringBuilder.append(this.h);
        }
        if (r()) {
            stringBuilder.append(", ");
            stringBuilder.append("notifyId:");
            stringBuilder.append(this.i);
        }
        if (t()) {
            stringBuilder.append(", ");
            stringBuilder.append("extra:");
            if (this.j == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.j);
            }
        }
        if (v()) {
            stringBuilder.append(", ");
            stringBuilder.append("internal:");
            if (this.k == null) {
                stringBuilder.append("null");
            } else {
                stringBuilder.append(this.k);
            }
        }
        if (x()) {
            stringBuilder.append(", ");
            stringBuilder.append("ignoreRegInfo:");
            stringBuilder.append(this.l);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Map<String, String> u() {
        return this.k;
    }

    public boolean v() {
        return this.k != null;
    }

    public boolean w() {
        return this.l;
    }

    public boolean x() {
        return this.A.get(4);
    }

    public void y() {
        if (this.a == null) {
            throw new f("Required field 'id' was not present! Struct: " + toString());
        }
    }
}
