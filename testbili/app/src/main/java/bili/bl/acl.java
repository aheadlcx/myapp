package bili.bl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class acl implements acm, acn {
    private static Map<Object, Object> a(Type type) {
        Class cls = type;
        while (cls != Properties.class) {
            if (cls == Hashtable.class) {
                return new Hashtable();
            }
            if (cls == IdentityHashMap.class) {
                return new IdentityHashMap();
            }
            if (cls == SortedMap.class || cls == TreeMap.class) {
                return new TreeMap();
            }
            if (cls == ConcurrentMap.class || cls == ConcurrentHashMap.class) {
                return new ConcurrentHashMap();
            }
            if (cls == Map.class || cls == HashMap.class) {
                return new HashMap();
            }
            if (cls == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (cls instanceof ParameterizedType) {
                cls = ((ParameterizedType) cls).getRawType();
            } else {
                Class cls2 = cls;
                if (cls2.isInterface()) {
                    throw new IllegalArgumentException("unsupport type " + cls);
                }
                try {
                    return (Map) cls2.newInstance();
                } catch (Throwable e) {
                    throw new IllegalArgumentException("unsupport type " + cls, e);
                }
            }
        }
        return new Properties();
    }

    public final Object a(Object obj) {
        Map treeMap = new TreeMap();
        for (Entry entry : ((Map) obj).entrySet()) {
            if (entry.getKey() instanceof String) {
                treeMap.put((String) entry.getKey(), acj.b(entry.getValue()));
            } else {
                throw new IllegalArgumentException("Map key must be String!");
            }
        }
        return treeMap;
    }

    public final Object a(Object obj, Type type) {
        if (!obj.getClass().equals(kqf.class)) {
            return null;
        }
        kqf bl_kqf = (kqf) obj;
        Map a = a(type);
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = parameterizedType.getActualTypeArguments()[0];
            Type type2 = parameterizedType.getActualTypeArguments()[1];
            if (String.class == cls) {
                Iterator a2 = bl_kqf.a();
                while (a2.hasNext()) {
                    String str = (String) a2.next();
                    if (acq.a((Class) type2)) {
                        a.put(str, bl_kqf.a(str));
                    } else {
                        a.put(str, aci.a(bl_kqf.a(str), type2));
                    }
                }
                return a;
            }
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        throw new IllegalArgumentException("Deserialize Map must be Generics!");
    }

    public final boolean a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
