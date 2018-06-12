package bili2.bl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: BL */
public class jny extends joj implements jlr {
    private final Modality e;
    private jmj f;
    private Collection<? extends jlr> g = null;
    private final jlr h;
    private final Kind i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private jlu p;
    private jlu q;
    private List<jmb> r;
    private jnz s;
    private jlt t;
    private boolean u;

    /* compiled from: BL */
    public class a {
        final /* synthetic */ jny a;
        private jkx b = this.a.b();
        private Modality c = this.a.m();
        private jmj d = this.a.p();
        private jlr e = null;
        private Kind f = this.a.n();
        private kcc g = kcc.d;
        private boolean h = true;
        private jlu i = this.a.p;
        private List<jmb> j = null;
        private jup k = this.a.ba_();

        public a(jny bl_jny) {
            this.a = bl_jny;
        }

        public a a(jkx bl_jkx) {
            this.b = bl_jkx;
            return this;
        }

        public a a(CallableMemberDescriptor callableMemberDescriptor) {
            this.e = (jlr) callableMemberDescriptor;
            return this;
        }

        public a a(Modality modality) {
            this.c = modality;
            return this;
        }

        public a a(jmj bl_jmj) {
            this.d = bl_jmj;
            return this;
        }

        public a a(Kind kind) {
            this.f = kind;
            return this;
        }

        public a a(kcc bl_kcc) {
            this.g = bl_kcc;
            return this;
        }

        public a a(boolean z) {
            this.h = z;
            return this;
        }

        public jlr a() {
            return this.a.a(this);
        }
    }

    public /* synthetic */ jmg F() {
        return q();
    }

    public /* synthetic */ jls a() {
        return C();
    }

    public /* synthetic */ CallableMemberDescriptor a(jkx bl_jkx, Modality modality, jmj bl_jmj, Kind kind, boolean z) {
        return b(bl_jkx, modality, bl_jmj, kind, z);
    }

    public /* synthetic */ jkx be_() {
        return q();
    }

    public /* synthetic */ jla bf_() {
        return q();
    }

    public /* synthetic */ jky d(TypeSubstitutor typeSubstitutor) {
        return a(typeSubstitutor);
    }

    public /* synthetic */ jkn h() {
        return q();
    }

    public /* synthetic */ CallableMemberDescriptor l() {
        return q();
    }

    protected jny(jkx bl_jkx, jlr bl_jlr, jmq bl_jmq, Modality modality, jmj bl_jmj, boolean z, jup bl_jup, Kind kind, jlw bl_jlw, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(bl_jkx, bl_jmq, bl_jup, null, z, bl_jlw);
        this.e = modality;
        this.f = bl_jmj;
        if (bl_jlr == null) {
            bl_jlr = this;
        }
        this.h = bl_jlr;
        this.i = kind;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
    }

    public static jny a(jkx bl_jkx, jmq bl_jmq, Modality modality, jmj bl_jmj, boolean z, jup bl_jup, Kind kind, jlw bl_jlw, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return new jny(bl_jkx, null, bl_jmq, modality, bl_jmj, z, bl_jup, kind, bl_jlw, z2, z3, z4, z5, z6, z7);
    }

    public void a(kbf bl_kbf, List<? extends jmb> list, jlu bl_jlu, kbf bl_kbf2) {
        a(bl_kbf, (List) list, bl_jlu, jwb.a((jkn) this, bl_kbf2));
    }

    public void a(kbf bl_kbf, List<? extends jmb> list, jlu bl_jlu, jlu bl_jlu2) {
        a(bl_kbf);
        this.r = new ArrayList(list);
        this.q = bl_jlu2;
        this.p = bl_jlu;
    }

    public void a(jnz bl_jnz, jlt bl_jlt) {
        this.s = bl_jnz;
        this.t = bl_jlt;
    }

    public void a(boolean z) {
        this.u = z;
    }

    public void a(jmj bl_jmj) {
        this.f = bl_jmj;
    }

    public List<jmb> f() {
        return this.r;
    }

    public jlu d() {
        return this.q;
    }

    public jlu e() {
        return this.p;
    }

    public kbf g() {
        return r();
    }

    public Modality m() {
        return this.e;
    }

    public jmj p() {
        return this.f;
    }

    public jnz C() {
        return this.s;
    }

    public jlt c() {
        return this.t;
    }

    public boolean D() {
        return this.u;
    }

    public boolean A() {
        return this.j;
    }

    public boolean z() {
        return this.k;
    }

    public boolean v() {
        return this.n;
    }

    public boolean B() {
        return this.o;
    }

    public List<jlq> o() {
        List<jlq> arrayList = new ArrayList(2);
        if (this.s != null) {
            arrayList.add(this.s);
        }
        if (this.t != null) {
            arrayList.add(this.t);
        }
        return arrayList;
    }

    public jlr a(TypeSubstitutor typeSubstitutor) {
        return typeSubstitutor.a() ? this : E().a(typeSubstitutor.b()).a(q()).a();
    }

    public a E() {
        return new a(this);
    }

    protected jlr a(a aVar) {
        jlr a = a(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.k);
        List f = aVar.j == null ? f() : aVar.j;
        List arrayList = new ArrayList(f.size());
        TypeSubstitutor a2 = kat.a(f, aVar.g, a, arrayList);
        kbf b = a2.b(r(), Variance.OUT_VARIANCE);
        if (b == null) {
            return null;
        }
        kbf b2;
        jnz bl_jnz;
        jlt bl_jlt;
        jlu i = aVar.i;
        if (i != null) {
            i = i.a(a2);
            if (i == null) {
                return null;
            }
        }
        i = null;
        if (this.q != null) {
            b2 = a2.b(this.q.r(), Variance.IN_VARIANCE);
            if (b2 == null) {
                return null;
            }
        }
        b2 = null;
        a.a(b, arrayList, i, b2);
        if (this.s == null) {
            bl_jnz = null;
        } else {
            bl_jnz = new jnz(a, this.s.w(), aVar.c, a(this.s.p(), aVar.f), this.s.o(), this.s.v(), this.s.a(), aVar.f, aVar.e == null ? null : aVar.e.a(), jlw.a);
        }
        if (bl_jnz != null) {
            kbf g = this.s.g();
            bl_jnz.a(a(a2, this.s));
            bl_jnz.a(g != null ? a2.b(g, Variance.OUT_VARIANCE) : null);
        }
        if (this.t == null) {
            bl_jlt = null;
        } else {
            Object bl_joa = new joa(a, this.t.w(), aVar.c, a(this.t.p(), aVar.f), this.t.o(), this.t.v(), this.t.a(), aVar.f, aVar.e == null ? null : aVar.e.c(), jlw.a);
        }
        if (bl_jlt != null) {
            f = jno.a((jle) bl_jlt, this.t.i(), a2, false, false, null);
            if (f == null) {
                a.a(true);
                f = Collections.singletonList(joa.a(bl_jlt, jxf.d(aVar.b).q()));
            }
            if (f.size() != 1) {
                throw new IllegalStateException();
            }
            bl_jlt.a(a(a2, this.t));
            bl_jlt.a((jme) f.get(0));
        }
        a.a(bl_jnz, bl_jlt);
        if (aVar.h) {
            Collection c = kee.c();
            for (jlr a3 : k()) {
                c.add(a3.a(a2));
            }
            a.a(c);
        }
        if (!z() || this.a == null) {
            return a;
        }
        a.a(this.a);
        return a;
    }

    private static jmj a(jmj bl_jmj, Kind kind) {
        if (kind == Kind.FAKE_OVERRIDE && jmi.a(bl_jmj.b())) {
            return jmi.h;
        }
        return bl_jmj;
    }

    private static jle a(TypeSubstitutor typeSubstitutor, jlq bl_jlq) {
        return bl_jlq.s() != null ? bl_jlq.s().c(typeSubstitutor) : null;
    }

    protected jny a(jkx bl_jkx, Modality modality, jmj bl_jmj, jlr bl_jlr, Kind kind, jup bl_jup) {
        return new jny(bl_jkx, bl_jlr, w(), modality, bl_jmj, s(), bl_jup, kind, jlw.a, A(), z(), t(), u(), v(), B());
    }

    public <R, D> R a(jkz<R, D> bl_jkz_R__D, D d) {
        return bl_jkz_R__D.a((jlr) this, (Object) d);
    }

    public jlr q() {
        return this.h == this ? this : this.h.q();
    }

    public Kind n() {
        return this.i;
    }

    public boolean t() {
        return this.l;
    }

    public boolean u() {
        return this.m;
    }

    public void a(Collection<? extends CallableMemberDescriptor> collection) {
        this.g = collection;
    }

    public Collection<? extends jlr> k() {
        return this.g != null ? this.g : Collections.emptyList();
    }

    public jlr b(jkx bl_jkx, Modality modality, jmj bl_jmj, Kind kind, boolean z) {
        return E().a(bl_jkx).a(null).a(modality).a(bl_jmj).a(kind).a(z).a();
    }
}
