package bili4.kotlin.reflect.jvm.internal.impl.resolve;

import bl.jdv;
import bl.jeg;
import bl.jfn;
import bl.jfy;
import bl.jkn;
import bl.jkq;
import bl.jkx;
import bl.jlb;
import bl.jle;
import bl.jlf;
import bl.jlq;
import bl.jlr;
import bl.jlu;
import bl.jmb;
import bl.jme;
import bl.jmi;
import bl.jmj;
import bl.jno;
import bl.jnx;
import bl.jny;
import bl.jup;
import bl.jwa;
import bl.jwc;
import bl.jwg;
import bl.jwi;
import bl.kbc;
import bl.kbf;
import bl.kbh;
import bl.kbv;
import bl.kcn;
import bl.kcn.a;
import bl.kco;
import bl.kee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import u.aly.dd;
import u.aly.q;

/* compiled from: BL */
public class OverridingUtil {
    public static final OverridingUtil a = new OverridingUtil(new a() {
        public boolean a(kbv bl_kbv, kbv bl_kbv2) {
            return bl_kbv.equals(bl_kbv2);
        }
    });
    static final /* synthetic */ boolean b = (!OverridingUtil.class.desiredAssertionStatus());
    private static final List<ExternalOverridabilityCondition> c = jeg.l(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    private final a d;

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass9 {
        static final /* synthetic */ int[] a = new int[Result.values().length];
        static final /* synthetic */ int[] b = new int[Result.values().length];
        static final /* synthetic */ int[] c = new int[Modality.values().length];

        static {
            try {
                c[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[Result.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    /* compiled from: BL */
    public static class OverrideCompatibilityInfo {
        private static final OverrideCompatibilityInfo a = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        private final Result b;
        private final String c;

        /* compiled from: BL */
        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public static OverrideCompatibilityInfo a() {
            return a;
        }

        public static OverrideCompatibilityInfo a(String str) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public static OverrideCompatibilityInfo b(String str) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            this.b = result;
            this.c = str;
        }

        public Result b() {
            return this.b;
        }
    }

    public static OverridingUtil a(a aVar) {
        return new OverridingUtil(aVar);
    }

    private OverridingUtil(a aVar) {
        this.d = aVar;
    }

    public static <D extends jkn> Set<D> a(Set<D> set) {
        return a((Set) set, new jfy<D, D, Pair<jkn, jkn>>() {
            public Pair<jkn, jkn> a(D d, D d2) {
                return new Pair(d, d2);
            }
        });
    }

    public static <D> Set<D> a(Set<D> set, jfy<? super D, ? super D, Pair<jkn, jkn>> bl_jfy__super_D___super_D__kotlin_Pair_bl_jkn__bl_jkn) {
        if (set.size() <= 1) {
            return set;
        }
        Set<D> linkedHashSet = new LinkedHashSet();
        for (Object next : set) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) bl_jfy__super_D___super_D__kotlin_Pair_bl_jkn__bl_jkn.a(next, it.next());
                jkn bl_jkn = (jkn) pair.c();
                jkn bl_jkn2 = (jkn) pair.d();
                if (a(bl_jkn, bl_jkn2)) {
                    it.remove();
                } else if (a(bl_jkn2, bl_jkn)) {
                    break;
                }
            }
            linkedHashSet.add(next);
        }
        if (b || !linkedHashSet.isEmpty()) {
            return linkedHashSet;
        }
        throw new AssertionError("All candidates filtered out from " + set);
    }

    public static <D extends jkn> boolean a(D d, D d2) {
        if (!d.equals(d2) && jwa.a.a(d.h(), d2.h())) {
            return true;
        }
        jkn h = d2.h();
        for (jkn a : jwc.a(d)) {
            if (jwa.a.a(h, a)) {
                return true;
            }
        }
        return false;
    }

    public static Set<CallableMemberDescriptor> a(CallableMemberDescriptor callableMemberDescriptor) {
        Set linkedHashSet = new LinkedHashSet();
        a(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    private static void a(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor.n().a()) {
            set.add(callableMemberDescriptor);
        } else if (callableMemberDescriptor.k().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        } else {
            for (CallableMemberDescriptor a : callableMemberDescriptor.k()) {
                a(a, (Set) set);
            }
        }
    }

    public OverrideCompatibilityInfo a(jkn bl_jkn, jkn bl_jkn2, jkq bl_jkq) {
        return a(bl_jkn, bl_jkn2, bl_jkq, false);
    }

    public OverrideCompatibilityInfo a(jkn bl_jkn, jkn bl_jkn2, jkq bl_jkq, boolean z) {
        OverrideCompatibilityInfo a = a(bl_jkn, bl_jkn2, z);
        Object obj = a.b() == Result.OVERRIDABLE ? 1 : null;
        Object obj2 = obj;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : c) {
            if (externalOverridabilityCondition.a() != Contract.CONFLICTS_ONLY && (obj2 == null || externalOverridabilityCondition.a() != Contract.SUCCESS_ONLY)) {
                switch (AnonymousClass9.a[externalOverridabilityCondition.a(bl_jkn, bl_jkn2, bl_jkq).ordinal()]) {
                    case q.a /*1*/:
                        int i = 1;
                        break;
                    case dd.c /*2*/:
                        return OverrideCompatibilityInfo.b("External condition failed");
                    case dd.d /*3*/:
                        return OverrideCompatibilityInfo.a("External condition");
                    default:
                        obj = obj2;
                        break;
                }
                obj2 = obj;
            }
        }
        if (obj2 == null) {
            return a;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : c) {
            if (externalOverridabilityCondition2.a() == Contract.CONFLICTS_ONLY) {
                switch (AnonymousClass9.a[externalOverridabilityCondition2.a(bl_jkn, bl_jkn2, bl_jkq).ordinal()]) {
                    case q.a /*1*/:
                        throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                    case dd.c /*2*/:
                        return OverrideCompatibilityInfo.b("External condition failed");
                    case dd.d /*3*/:
                        return OverrideCompatibilityInfo.a("External condition");
                    default:
                        break;
                }
            }
        }
        return OverrideCompatibilityInfo.a();
    }

    public OverrideCompatibilityInfo a(jkn bl_jkn, jkn bl_jkn2, boolean z) {
        int i = 0;
        OverrideCompatibilityInfo b = b(bl_jkn, bl_jkn2);
        if (b != null) {
            return b;
        }
        List a = a(bl_jkn);
        List a2 = a(bl_jkn2);
        List f = bl_jkn.f();
        List f2 = bl_jkn2.f();
        if (f.size() != f2.size()) {
            while (i < a.size()) {
                if (!kcn.a.b((kbf) a.get(i), (kbf) a2.get(i))) {
                    return OverrideCompatibilityInfo.a("Type parameter number mismatch");
                }
                i++;
            }
            return OverrideCompatibilityInfo.b("Type parameter number mismatch");
        }
        int i2;
        kcn a3 = a(f, f2);
        for (i2 = 0; i2 < f.size(); i2++) {
            if (!a((jmb) f.get(i2), (jmb) f2.get(i2), a3)) {
                return OverrideCompatibilityInfo.a("Type parameter bounds mismatch");
            }
        }
        for (i2 = 0; i2 < a.size(); i2++) {
            if (!a((kbf) a.get(i2), (kbf) a2.get(i2), a3)) {
                return OverrideCompatibilityInfo.a("Value parameter type mismatch");
            }
        }
        if ((bl_jkn instanceof jle) && (bl_jkn2 instanceof jle) && ((jle) bl_jkn).C() != ((jle) bl_jkn2).C()) {
            return OverrideCompatibilityInfo.b("Incompatible suspendability");
        }
        if (z) {
            kbf g = bl_jkn.g();
            kbf g2 = bl_jkn2.g();
            if (!(g == null || g2 == null)) {
                if (kbh.a(g2) && kbh.a(g)) {
                    i = 1;
                }
                if (i == 0 && !a3.a(g2, g)) {
                    return OverrideCompatibilityInfo.b("Return type mismatch");
                }
            }
        }
        return OverrideCompatibilityInfo.a();
    }

    public static OverrideCompatibilityInfo b(jkn bl_jkn, jkn bl_jkn2) {
        if (((bl_jkn instanceof jle) && !(bl_jkn2 instanceof jle)) || ((bl_jkn instanceof jlr) && !(bl_jkn2 instanceof jlr))) {
            return OverrideCompatibilityInfo.a("Member kind mismatch");
        }
        if (!(bl_jkn instanceof jle) && !(bl_jkn instanceof jlr)) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bl_jkn);
        } else if (!bl_jkn.ba_().equals(bl_jkn2.ba_())) {
            return OverrideCompatibilityInfo.a("Name mismatch");
        } else {
            OverrideCompatibilityInfo e = e(bl_jkn, bl_jkn2);
            return e == null ? null : e;
        }
    }

    private kcn a(List<jmb> list, List<jmb> list2) {
        if (!b && list.size() != list2.size()) {
            throw new AssertionError("Should be the same number of type parameters: " + list + " vs " + list2);
        } else if (list.isEmpty()) {
            return kco.a(this.d);
        } else {
            final Map hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(((jmb) list.get(i)).e(), ((jmb) list2.get(i)).e());
            }
            return kco.a(new a(this) {
                final /* synthetic */ OverridingUtil b;

                public boolean a(kbv bl_kbv, kbv bl_kbv2) {
                    if (this.b.d.a(bl_kbv, bl_kbv2)) {
                        return true;
                    }
                    kbv bl_kbv3 = (kbv) hashMap.get(bl_kbv);
                    kbv bl_kbv4 = (kbv) hashMap.get(bl_kbv2);
                    boolean z = (bl_kbv3 != null && bl_kbv3.equals(bl_kbv2)) || (bl_kbv4 != null && bl_kbv4.equals(bl_kbv));
                    return z;
                }
            });
        }
    }

    private static OverrideCompatibilityInfo e(jkn bl_jkn, jkn bl_jkn2) {
        Object obj = 1;
        Object obj2 = bl_jkn.d() == null ? 1 : null;
        if (bl_jkn2.d() != null) {
            obj = null;
        }
        if (obj2 != obj) {
            return OverrideCompatibilityInfo.a("Receiver presence mismatch");
        }
        if (bl_jkn.i().size() != bl_jkn2.i().size()) {
            return OverrideCompatibilityInfo.a("Value parameter number mismatch");
        }
        return null;
    }

    private static boolean a(kbf bl_kbf, kbf bl_kbf2, kcn bl_kcn) {
        boolean z;
        if (kbh.a(bl_kbf) && kbh.a(bl_kbf2)) {
            z = true;
        } else {
            z = false;
        }
        if (z || bl_kcn.b(bl_kbf, bl_kbf2)) {
            return true;
        }
        return false;
    }

    private static boolean a(jmb bl_jmb, jmb bl_jmb2, kcn bl_kcn) {
        List<kbf> j = bl_jmb.j();
        List arrayList = new ArrayList(bl_jmb2.j());
        if (j.size() != arrayList.size()) {
            return false;
        }
        for (kbf bl_kbf : j) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (a(bl_kbf, (kbf) listIterator.next(), bl_kcn)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static List<kbf> a(jkn bl_jkn) {
        jlu d = bl_jkn.d();
        List<kbf> arrayList = new ArrayList();
        if (d != null) {
            arrayList.add(d.r());
        }
        for (jme r : bl_jkn.i()) {
            arrayList.add(r.r());
        }
        return arrayList;
    }

    public static void a(jup bl_jup, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, jkq bl_jkq, jwg bl_jwg) {
        Collection linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor a : collection2) {
            linkedHashSet.removeAll(a(a, (Collection) collection, bl_jkq, bl_jwg));
        }
        a(bl_jkq, linkedHashSet, bl_jwg);
    }

    public static boolean a(jlf bl_jlf, jlf bl_jlf2) {
        return !jmi.a(bl_jlf2.p()) && jmi.a(bl_jlf2, bl_jlf);
    }

    private static Collection<CallableMemberDescriptor> a(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection, jkq bl_jkq, jwg bl_jwg) {
        Collection<CallableMemberDescriptor> arrayList = new ArrayList(collection.size());
        kee c = kee.c();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jlf bl_jlf = (CallableMemberDescriptor) it.next();
            Result b = a.a((jkn) bl_jlf, (jkn) callableMemberDescriptor, bl_jkq).b();
            boolean a = a((jlf) callableMemberDescriptor, bl_jlf);
            switch (AnonymousClass9.b[b.ordinal()]) {
                case q.a /*1*/:
                    if (a) {
                        c.add(bl_jlf);
                    }
                    arrayList.add(bl_jlf);
                    break;
                case dd.c /*2*/:
                    if (a) {
                        bl_jwg.b(bl_jlf, callableMemberDescriptor);
                    }
                    arrayList.add(bl_jlf);
                    break;
                default:
                    break;
            }
        }
        bl_jwg.a(callableMemberDescriptor, c);
        return arrayList;
    }

    private static boolean b(Collection<CallableMemberDescriptor> collection) {
        if (collection.size() < 2) {
            return true;
        }
        final jkx b = ((CallableMemberDescriptor) collection.iterator().next()).b();
        return jeg.d(collection, new jfn<CallableMemberDescriptor, Boolean>() {
            public Boolean a(CallableMemberDescriptor callableMemberDescriptor) {
                return Boolean.valueOf(callableMemberDescriptor.b() == b);
            }
        });
    }

    private static void a(jkq bl_jkq, Collection<CallableMemberDescriptor> collection, jwg bl_jwg) {
        if (b((Collection) collection)) {
            for (CallableMemberDescriptor singleton : collection) {
                a(Collections.singleton(singleton), bl_jkq, bl_jwg);
            }
            return;
        }
        Queue linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            a(a(jwi.a(linkedList), linkedList, bl_jwg), bl_jkq, bl_jwg);
        }
    }

    public static boolean c(jkn bl_jkn, jkn bl_jkn2) {
        kbf g = bl_jkn.g();
        kbf g2 = bl_jkn2.g();
        if (!b && g == null) {
            throw new AssertionError("Return type of " + bl_jkn + " is null");
        } else if (!b && g2 == null) {
            throw new AssertionError("Return type of " + bl_jkn2 + " is null");
        } else if (!a((jlb) bl_jkn, (jlb) bl_jkn2)) {
            return false;
        } else {
            if (bl_jkn instanceof jle) {
                if (b || (bl_jkn2 instanceof jle)) {
                    return a(bl_jkn, g, bl_jkn2, g2);
                }
                throw new AssertionError("b is " + bl_jkn2.getClass());
            } else if (!(bl_jkn instanceof jlr)) {
                throw new IllegalArgumentException("Unexpected callable: " + bl_jkn.getClass());
            } else if (b || (bl_jkn2 instanceof jlr)) {
                jlr bl_jlr = (jlr) bl_jkn;
                jlr bl_jlr2 = (jlr) bl_jkn2;
                if (!a(bl_jlr.c(), bl_jlr2.c())) {
                    return false;
                }
                if (bl_jlr.s() && bl_jlr2.s()) {
                    return a.a(bl_jkn.f(), bl_jkn2.f()).b(g, g2);
                }
                boolean z = (bl_jlr.s() || !bl_jlr2.s()) && a(bl_jkn, g, bl_jkn2, g2);
                return z;
            } else {
                throw new AssertionError("b is " + bl_jkn2.getClass());
            }
        }
    }

    private static boolean a(jlb bl_jlb, jlb bl_jlb2) {
        Integer b = jmi.b(bl_jlb.p(), bl_jlb2.p());
        return b == null || b.intValue() >= 0;
    }

    private static boolean a(jlq bl_jlq, jlq bl_jlq2) {
        if (bl_jlq == null || bl_jlq2 == null) {
            return true;
        }
        return a((jlb) bl_jlq, (jlb) bl_jlq2);
    }

    private static boolean a(jkn bl_jkn, Collection<jkn> collection) {
        for (jkn c : collection) {
            if (!c(bl_jkn, c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(jkn bl_jkn, kbf bl_kbf, jkn bl_jkn2, kbf bl_kbf2) {
        return a.a(bl_jkn.f(), bl_jkn2.f()).a(bl_kbf, bl_kbf2);
    }

    public static <H> H a(Collection<H> collection, jfn<H, jkn> bl_jfn_H__bl_jkn) {
        if (!b && collection.isEmpty()) {
            throw new AssertionError("Should have at least one overridable descriptor");
        } else if (collection.size() == 1) {
            return jeg.b(collection);
        } else {
            Iterable arrayList = new ArrayList(2);
            Collection c = jeg.c(collection, bl_jfn_H__bl_jkn);
            H b = jeg.b(collection);
            jkn bl_jkn = (jkn) bl_jfn_H__bl_jkn.a(b);
            H h = b;
            for (H next : collection) {
                jkn bl_jkn2 = (jkn) bl_jfn_H__bl_jkn.a(next);
                if (a(bl_jkn2, c)) {
                    arrayList.add(next);
                }
                if (!c(bl_jkn2, bl_jkn) || c(bl_jkn, bl_jkn2)) {
                    b = h;
                } else {
                    b = next;
                }
                h = b;
            }
            if (arrayList.isEmpty()) {
                return h;
            }
            if (arrayList.size() == 1) {
                return jeg.b(arrayList);
            }
            for (H h2 : arrayList) {
                if (!kbc.a(((jkn) bl_jfn_H__bl_jkn.a(h2)).g())) {
                    break;
                }
            }
            h2 = null;
            return h2 == null ? jeg.b(arrayList) : h2;
        }
    }

    private static void a(Collection<CallableMemberDescriptor> collection, jkq bl_jkq, jwg bl_jwg) {
        Collection<CallableMemberDescriptor> a = a(bl_jkq, (Collection) collection);
        boolean isEmpty = a.isEmpty();
        if (!isEmpty) {
            collection = a;
        }
        CallableMemberDescriptor a2 = ((CallableMemberDescriptor) a(r6, new jfn<CallableMemberDescriptor, jkn>() {
            public CallableMemberDescriptor a(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        })).a(bl_jkq, c(r6), isEmpty ? jmi.h : jmi.g, Kind.FAKE_OVERRIDE, false);
        bl_jwg.a(a2, r6);
        if (b || !a2.k().isEmpty()) {
            bl_jwg.a(a2);
            return;
        }
        throw new AssertionError("Overridden descriptors should be set for " + Kind.FAKE_OVERRIDE);
    }

    private static Modality c(Collection<CallableMemberDescriptor> collection) {
        Object obj = null;
        Object obj2 = null;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Object obj3;
            switch (AnonymousClass9.c[callableMemberDescriptor.m().ordinal()]) {
                case q.a /*1*/:
                    return Modality.FINAL;
                case dd.c /*2*/:
                    throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor);
                case dd.d /*3*/:
                    obj3 = obj;
                    int i = 1;
                    break;
                case dd.e /*4*/:
                    int i2 = 1;
                    obj = obj2;
                    break;
                default:
                    obj3 = obj;
                    obj = obj2;
                    break;
            }
            obj2 = obj;
            obj = obj3;
        }
        if (obj2 != null && obj == null) {
            return Modality.OPEN;
        }
        if (obj2 == null && obj != null) {
            return Modality.ABSTRACT;
        }
        Set hashSet = new HashSet();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            hashSet.addAll(a(callableMemberDescriptor2));
        }
        return d(a(hashSet));
    }

    private static Modality d(Collection<CallableMemberDescriptor> collection) {
        Enum enumR = Modality.ABSTRACT;
        Enum enumR2 = enumR;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            if (callableMemberDescriptor.m().compareTo(enumR2) < 0) {
                enumR = callableMemberDescriptor.m();
            } else {
                enumR = enumR2;
            }
            enumR2 = enumR;
        }
        return enumR2;
    }

    private static Collection<CallableMemberDescriptor> a(final jkq bl_jkq, Collection<CallableMemberDescriptor> collection) {
        return jeg.b(collection, new jfn<CallableMemberDescriptor, Boolean>() {
            public Boolean a(CallableMemberDescriptor callableMemberDescriptor) {
                boolean z = !jmi.a(callableMemberDescriptor.p()) && jmi.a(callableMemberDescriptor, bl_jkq);
                return Boolean.valueOf(z);
            }
        });
    }

    public static <H> Collection<H> a(H h, Collection<H> collection, jfn<H, jkn> bl_jfn_H__bl_jkn, jfn<H, jdv> bl_jfn_H__bl_jdv) {
        Collection<H> arrayList = new ArrayList();
        arrayList.add(h);
        jkn bl_jkn = (jkn) bl_jfn_H__bl_jkn.a(h);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            jkn bl_jkn2 = (jkn) bl_jfn_H__bl_jkn.a(next);
            if (h == next) {
                it.remove();
            } else {
                Result d = d(bl_jkn, bl_jkn2);
                if (d == Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (d == Result.CONFLICT) {
                    bl_jfn_H__bl_jdv.a(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static Result d(jkn bl_jkn, jkn bl_jkn2) {
        Result b = a.a(bl_jkn2, bl_jkn, null).b();
        Result b2 = a.a(bl_jkn, bl_jkn2, null).b();
        if (b == Result.OVERRIDABLE && b2 == Result.OVERRIDABLE) {
            return Result.OVERRIDABLE;
        }
        return (b == Result.CONFLICT || b2 == Result.CONFLICT) ? Result.CONFLICT : Result.INCOMPATIBLE;
    }

    private static Collection<CallableMemberDescriptor> a(final CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, final jwg bl_jwg) {
        return a((Object) callableMemberDescriptor, (Collection) queue, new jfn<CallableMemberDescriptor, jkn>() {
            public jkn a(CallableMemberDescriptor callableMemberDescriptor) {
                return callableMemberDescriptor;
            }
        }, new jfn<CallableMemberDescriptor, jdv>() {
            public jdv a(CallableMemberDescriptor callableMemberDescriptor) {
                bl_jwg.c(callableMemberDescriptor, callableMemberDescriptor);
                return jdv.a;
            }
        });
    }

    public static void a(CallableMemberDescriptor callableMemberDescriptor, jfn<CallableMemberDescriptor, jdv> bl_jfn_kotlin_reflect_jvm_internal_impl_descriptors_CallableMemberDescriptor__bl_jdv) {
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.k()) {
            if (callableMemberDescriptor2.p() == jmi.g) {
                a(callableMemberDescriptor2, (jfn) bl_jfn_kotlin_reflect_jvm_internal_impl_descriptors_CallableMemberDescriptor__bl_jdv);
            }
        }
        if (callableMemberDescriptor.p() == jmi.g) {
            jmj bl_jmj;
            jmj b = b(callableMemberDescriptor);
            if (b == null) {
                if (bl_jfn_kotlin_reflect_jvm_internal_impl_descriptors_CallableMemberDescriptor__bl_jdv != null) {
                    bl_jfn_kotlin_reflect_jvm_internal_impl_descriptors_CallableMemberDescriptor__bl_jdv.a(callableMemberDescriptor);
                }
                bl_jmj = jmi.e;
            } else {
                bl_jmj = b;
            }
            if (callableMemberDescriptor instanceof jny) {
                ((jny) callableMemberDescriptor).a(bl_jmj);
                for (CallableMemberDescriptor callableMemberDescriptor22 : ((jlr) callableMemberDescriptor).o()) {
                    jfn bl_jfn;
                    if (b == null) {
                        bl_jfn = null;
                    } else {
                        jfn<CallableMemberDescriptor, jdv> bl_jfn_kotlin_reflect_jvm_internal_impl_descriptors_CallableMemberDescriptor__bl_jdv2 = bl_jfn_kotlin_reflect_jvm_internal_impl_descriptors_CallableMemberDescriptor__bl_jdv;
                    }
                    a(callableMemberDescriptor22, bl_jfn);
                }
            } else if (callableMemberDescriptor instanceof jno) {
                ((jno) callableMemberDescriptor).a(bl_jmj);
            } else if (b || (callableMemberDescriptor instanceof jnx)) {
                ((jnx) callableMemberDescriptor).a(bl_jmj);
            } else {
                throw new AssertionError();
            }
        }
    }

    private static jmj b(CallableMemberDescriptor callableMemberDescriptor) {
        Collection<CallableMemberDescriptor> k = callableMemberDescriptor.k();
        jmj a = a((Collection) k);
        if (a == null) {
            return null;
        }
        if (callableMemberDescriptor.n() != Kind.FAKE_OVERRIDE) {
            return a.b();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : k) {
            if (callableMemberDescriptor2.m() != Modality.ABSTRACT && !callableMemberDescriptor2.p().equals(a)) {
                return null;
            }
        }
        return a;
    }

    public static jmj a(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection.isEmpty()) {
            return jmi.k;
        }
        jmj bl_jmj = null;
        for (CallableMemberDescriptor callableMemberDescriptor : collection) {
            Integer b;
            jmj p = callableMemberDescriptor.p();
            if (!b && p == jmi.g) {
                throw new AssertionError("Visibility should have been computed for " + callableMemberDescriptor);
            } else if (bl_jmj == null) {
                bl_jmj = p;
            } else {
                jmj bl_jmj2;
                b = jmi.b(p, bl_jmj);
                if (b == null) {
                    bl_jmj2 = null;
                } else if (b.intValue() > 0) {
                    bl_jmj2 = p;
                } else {
                    bl_jmj2 = bl_jmj;
                }
                bl_jmj = bl_jmj2;
            }
        }
        if (bl_jmj == null) {
            return null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            b = jmi.b(bl_jmj, callableMemberDescriptor2.p());
            if (b == null) {
                return null;
            }
            if (b.intValue() < 0) {
                return null;
            }
        }
        return bl_jmj;
    }
}
