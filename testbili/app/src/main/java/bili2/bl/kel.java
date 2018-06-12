package bili2.bl;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.parameterizedTypeArguments.1;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.parameterizedTypeArguments.2;

@jds(a = {"\u0000J\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010#\u001a\u0006\u0012\u0002\b\u00030\u0002*\u0006\u0012\u0002\b\u00030\u0002\u001a\u000e\u0010$\u001a\u00020%*\u0006\u0012\u0002\b\u00030\u0002\"&\u0010\u0000\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\",\u0010\t\u001a \u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\",\u0010\n\u001a \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0002\u0012\u000e\u0012\f\u0012\u0006\b\u0001\u0012\u00020\b\u0018\u00010\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0019\u0010\u000b\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0019\u0010\u000f\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006*\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0019\u0010\u001d\u001a\u00020\u001e*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u001f\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002*\u0006\u0012\u0002\b\u00030\u00028F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\u001c\u00a8\u0006&"}, b = {"FUNCTION_CLASSES", "", "Ljava/lang/Class;", "Lkotlin/Function;", "", "PRIMITIVE_CLASSES", "", "Lkotlin/reflect/KClass;", "", "PRIMITIVE_TO_WRAPPER", "WRAPPER_TO_PRIMITIVE", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/name/ClassId;", "desc", "", "getDesc", "(Ljava/lang/Class;)Ljava/lang/String;", "functionClassArity", "getFunctionClassArity", "(Ljava/lang/Class;)Ljava/lang/Integer;", "parameterizedTypeArguments", "Ljava/lang/reflect/Type;", "getParameterizedTypeArguments", "(Ljava/lang/reflect/Type;)Ljava/util/List;", "primitiveByWrapper", "getPrimitiveByWrapper", "(Ljava/lang/Class;)Ljava/lang/Class;", "safeClassLoader", "Ljava/lang/ClassLoader;", "getSafeClassLoader", "(Ljava/lang/Class;)Ljava/lang/ClassLoader;", "wrapperByPrimitive", "getWrapperByPrimitive", "createArrayType", "isEnumClassOrSpecializedEnumEntryClass", "", "descriptors.runtime"})
/* compiled from: BL */
public final class kel {
    private static final List<jhm<? extends Object>> a = jeh.b((Object[]) new jhm[]{jgr.a(Boolean.TYPE), jgr.a(Byte.TYPE), jgr.a(Character.TYPE), jgr.a(Double.TYPE), jgr.a(Float.TYPE), jgr.a(Integer.TYPE), jgr.a(Long.TYPE), jgr.a(Short.TYPE)});
    private static final Map<Class<? extends Object>, Class<? extends Object>> b;
    private static final Map<Class<? extends Object>, Class<? extends Object>> c;
    private static final Map<Class<? extends jdo<?>>, Integer> d;

    public static final ClassLoader a(Class<?> cls) {
        jgp.b(cls, "$receiver");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        classLoader = ClassLoader.getSystemClassLoader();
        jgp.a(classLoader, "ClassLoader.getSystemClassLoader()");
        return classLoader;
    }

    public static final boolean b(Class<?> cls) {
        jgp.b(cls, "$receiver");
        return Enum.class.isAssignableFrom(cls);
    }

    static {
        int i = 0;
        Iterable<jhm> iterable = a;
        Collection arrayList = new ArrayList(jei.a(iterable, 10));
        for (jhm bl_jhm : iterable) {
            arrayList.add(jdt.a(jfl.c(bl_jhm), jfl.b(bl_jhm)));
        }
        b = jew.a((Iterable) (List) arrayList);
        iterable = a;
        arrayList = new ArrayList(jei.a(iterable, 10));
        for (jhm bl_jhm2 : iterable) {
            arrayList.add(jdt.a(jfl.b(bl_jhm2), jfl.c(bl_jhm2)));
        }
        c = jew.a((Iterable) (List) arrayList);
        Iterable<Class> b = jeh.b((Object[]) new Class[]{jfm.class, jfn.class, jfy.class, jgc.class, jgd.class, jge.class, jgf.class, jgg.class, jgh.class, jgi.class, jfo.class, jfp.class, jfq.class, jfr.class, jfs.class, jft.class, jfu.class, jfv.class, jfw.class, jfx.class, jfz.class, jga.class, jgb.class});
        arrayList = new ArrayList(jei.a(b, 10));
        for (Class a : b) {
            int i2 = i + 1;
            arrayList.add(jdt.a(a, Integer.valueOf(i)));
            i = i2;
        }
        d = jew.a((Iterable) (List) arrayList);
    }

    public static final Class<?> c(Class<?> cls) {
        jgp.b(cls, "$receiver");
        return (Class) b.get(cls);
    }

    public static final Class<?> d(Class<?> cls) {
        jgp.b(cls, "$receiver");
        return (Class) c.get(cls);
    }

    public static final juk e(Class<?> cls) {
        jgp.b(cls, "$receiver");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        } else if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        } else {
            if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
                String simpleName = cls.getSimpleName();
                jgp.a(simpleName, "simpleName");
                if (!(((CharSequence) simpleName).length() == 0)) {
                    juk e;
                    Class declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        e = e(declaringClass);
                        if (e != null) {
                            e = e.a(jup.a(cls.getSimpleName()));
                            if (e != null) {
                                return e;
                            }
                        }
                    }
                    e = juk.a(new jul(cls.getName()));
                    jgp.a(e, "ClassId.topLevel(FqName(name))");
                    return e;
                }
            }
            jul bl_jul = new jul(cls.getName());
            return new juk(bl_jul.d(), jul.c(bl_jul.e()), true);
        }
    }

    public static final String f(Class<?> cls) {
        jgp.b(cls, "$receiver");
        if (jgp.a(cls, Void.TYPE)) {
            return "V";
        }
        String name = g(cls).getName();
        jgp.a(name, "createArrayType().name");
        if (name == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        name = name.substring(1);
        jgp.a(name, "(this as java.lang.String).substring(startIndex)");
        return kgp.a(name, '.', '/', false, 4, null);
    }

    public static final Class<?> g(Class<?> cls) {
        jgp.b(cls, "$receiver");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final List<Type> a(Type type) {
        jgp.b(type, "$receiver");
        if (!(type instanceof ParameterizedType)) {
            return jeh.a();
        }
        if (((ParameterizedType) type).getOwnerType() != null) {
            return kfu.e(kfu.d(kft.a((Object) type, (jfn) 1.INSTANCE), (jfn) 2.INSTANCE));
        }
        Object actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        jgp.a(actualTypeArguments, "actualTypeArguments");
        return jee.h((Object[]) actualTypeArguments);
    }
}
