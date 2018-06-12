package bili2.bl;

import bl.jlh.a;
import bl.jlh.b;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl.packageFragmentProviderForWholeModuleWithDependencies.2;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl.packages.1;

/* compiled from: BL */
public final class jnu extends jnj implements jlh {
    static final /* synthetic */ jhu[] a = new jhu[]{jgr.a(new PropertyReference1Impl(jgr.a(jnu.class), "packageFragmentProviderForWholeModuleWithDependencies", "getPackageFragmentProviderForWholeModuleWithDependencies()Lorg/jetbrains/kotlin/descriptors/impl/CompositePackageFragmentProvider;"))};
    private final Map<a<? extends Object>, Object> b;
    private jns c;
    private jll d;
    private boolean e;
    private final kac<jul, jln> f;
    private final jdp g;
    private final kai h;
    private final jkf i;

    public jnu(jup bl_jup, kai bl_kai, jkf bl_jkf, jwe bl_jwe) {
        this(bl_jup, bl_kai, bl_jkf, bl_jwe, null, 16, null);
    }

    private final jni g() {
        jdp bl_jdp = this.g;
        jhu bl_jhu = a[0];
        return (jni) bl_jdp.a();
    }

    public <R, D> R a(jkz<R, D> bl_jkz_R__D, D d) {
        jgp.b(bl_jkz_R__D, "visitor");
        return b.a(this, bl_jkz_R__D, d);
    }

    public jkx b() {
        return b.a(this);
    }

    public jkf a() {
        return this.i;
    }

    public /* synthetic */ jnu(jup bl_jup, kai bl_kai, jkf bl_jkf, jwe bl_jwe, Map map, int i, jgo bl_jgo) {
        jwe bl_jwe2;
        if ((i & 8) != 0) {
            bl_jwe2 = (jwe) null;
        } else {
            bl_jwe2 = bl_jwe;
        }
        this(bl_jup, bl_kai, bl_jkf, bl_jwe2, (i & 16) != 0 ? jew.a() : map);
    }

    public jnu(jup bl_jup, kai bl_kai, jkf bl_jkf, jwe bl_jwe, Map<a<?>, ? extends Object> map) {
        jgp.b(bl_jup, "moduleName");
        jgp.b(bl_kai, "storageManager");
        jgp.b(bl_jkf, "builtIns");
        jgp.b(map, "capabilities");
        super(jmq.a.a(), bl_jup);
        this.h = bl_kai;
        this.i = bl_jkf;
        if (bl_jup.c()) {
            Map a;
            jnu bl_jnu;
            if (bl_jwe != null) {
                a = jew.a(jdt.a(jwe.a, bl_jwe));
                if (a != null) {
                    bl_jnu = this;
                    bl_jnu.b = jew.a((Map) map, a);
                    this.e = true;
                    this.f = this.h.a((jfn) new 1(this));
                    this.g = jdq.a((jfm) new 2(this));
                    return;
                }
            }
            bl_jnu = this;
            a = jew.a();
            bl_jnu.b = jew.a((Map) map, a);
            this.e = true;
            this.f = this.h.a((jfn) new 1(this));
            this.g = jdq.a((jfm) new 2(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + bl_jup);
    }

    public boolean c() {
        return this.e;
    }

    public void e() {
        if (!c()) {
            throw ((Throwable) new InvalidModuleException("Accessing invalid module descriptor " + this));
        }
    }

    public jln a(jul bl_jul) {
        jgp.b(bl_jul, "fqName");
        e();
        return (jln) this.f.a(bl_jul);
    }

    public Collection<jul> a(jul bl_jul, jfn<? super jup, Boolean> bl_jfn__super_bl_jup__java_lang_Boolean) {
        jgp.b(bl_jul, "fqName");
        jgp.b(bl_jfn__super_bl_jup__java_lang_Boolean, "nameFilter");
        e();
        return f().a(bl_jul, bl_jfn__super_bl_jup__java_lang_Boolean);
    }

    private final boolean h() {
        return this.d != null;
    }

    public final void a(jns bl_jns) {
        jgp.b(bl_jns, "dependencies");
        Object obj = this.c == null ? 1 : null;
        if (jdw.a && obj == null) {
            throw new AssertionError("Dependencies of " + j() + " were already set");
        }
        this.c = bl_jns;
    }

    public final void a(jnu... bl_jnuArr) {
        jgp.b(bl_jnuArr, "descriptors");
        a(jee.h((Object[]) bl_jnuArr));
    }

    public final void a(List<jnu> list) {
        jgp.b(list, "descriptors");
        a((jns) new jnt(list, jfa.a()));
    }

    public boolean a(jlh bl_jlh) {
        jgp.b(bl_jlh, "targetModule");
        if (!jgp.a(this, bl_jlh)) {
            jns bl_jns = this.c;
            if (bl_jns == null) {
                jgp.a();
            }
            if (!jem.a((Iterable) bl_jns.b(), (Object) bl_jlh)) {
                return false;
            }
        }
        return true;
    }

    private final String j() {
        String bl_jup = ba_().toString();
        jgp.a(bl_jup, "name.toString()");
        return bl_jup;
    }

    public final void a(jll bl_jll) {
        jgp.b(bl_jll, "providerForModuleContent");
        Object obj = !h() ? 1 : null;
        if (jdw.a && obj == null) {
            throw new AssertionError("Attempt to initialize module " + j() + " twice");
        }
        this.d = bl_jll;
    }

    public final jll f() {
        e();
        return g();
    }
}
