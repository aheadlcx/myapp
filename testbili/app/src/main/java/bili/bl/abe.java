package bili.bl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* compiled from: BL */
public class abe implements aaw, abr {
    public static final abe a = new abe();

    private abe() {
    }

    public void a(abk bl_abk, Object obj, Object obj2, Type type) throws IOException {
        int i = 0;
        abx bl_abx = bl_abk.b;
        if (obj != null) {
            Type type2;
            if ((bl_abx.c & SerializerFeature.WriteClassName.mask) == 0 || !(type instanceof ParameterizedType)) {
                type2 = null;
            } else {
                type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            }
            Collection collection = (Collection) obj;
            abu bl_abu = bl_abk.j;
            bl_abk.a(bl_abu, obj, obj2, 0);
            if ((bl_abx.c & SerializerFeature.WriteClassName.mask) != 0) {
                if (HashSet.class == collection.getClass()) {
                    bl_abx.a((CharSequence) "Set");
                } else if (TreeSet.class == collection.getClass()) {
                    bl_abx.a((CharSequence) "TreeSet");
                }
            }
            try {
                bl_abx.write(91);
                for (Object next : collection) {
                    int i2 = i + 1;
                    if (i != 0) {
                        bl_abx.write(44);
                    }
                    if (next == null) {
                        bl_abx.a();
                        i = i2;
                    } else {
                        Class cls = next.getClass();
                        if (cls == Integer.class) {
                            bl_abx.b(((Integer) next).intValue());
                            i = i2;
                        } else if (cls == Long.class) {
                            bl_abx.a(((Long) next).longValue());
                            if ((bl_abx.c & SerializerFeature.WriteClassName.mask) != 0) {
                                bl_abx.write(76);
                                i = i2;
                            } else {
                                i = i2;
                            }
                        } else {
                            bl_abk.a.a(cls).a(bl_abk, next, Integer.valueOf(i2 - 1), type2);
                            i = i2;
                        }
                    }
                }
                bl_abx.write(93);
            } finally {
                bl_abk.j = bl_abu;
            }
        } else if ((bl_abx.c & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
            bl_abx.write("[]");
        } else {
            bl_abx.a();
        }
    }

    public <T> T a(aad bl_aad, Type type, Object obj) {
        if (bl_aad.c.a() == 8) {
            bl_aad.c.b(16);
            return null;
        } else if (type == JSONArray.class) {
            r2 = new JSONArray();
            bl_aad.b(r2);
            return r2;
        } else {
            Type type2 = type;
            while (!(type2 instanceof Class)) {
                if (type2 instanceof ParameterizedType) {
                    type2 = ((ParameterizedType) type2).getRawType();
                } else {
                    throw new JSONException("TODO");
                }
            }
            Class cls = (Class) type2;
            if (cls == AbstractCollection.class || cls == Collection.class) {
                r2 = new ArrayList();
            } else if (cls.isAssignableFrom(HashSet.class)) {
                r2 = new HashSet();
            } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                r2 = new LinkedHashSet();
            } else if (cls.isAssignableFrom(TreeSet.class)) {
                r2 = new TreeSet();
            } else if (cls.isAssignableFrom(ArrayList.class)) {
                r2 = new ArrayList();
            } else if (cls.isAssignableFrom(EnumSet.class)) {
                if (type instanceof ParameterizedType) {
                    cls = ((ParameterizedType) type).getActualTypeArguments()[0];
                } else {
                    cls = Object.class;
                }
                r2 = EnumSet.noneOf(cls);
            } else {
                try {
                    r2 = (Collection) cls.newInstance();
                } catch (Exception e) {
                    throw new JSONException("create instane error, class " + cls.getName());
                }
            }
            if (type instanceof ParameterizedType) {
                type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            } else {
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (!cls2.getName().startsWith("java.")) {
                        type2 = cls2.getGenericSuperclass();
                        if (type2 instanceof ParameterizedType) {
                            type2 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type2 == null) {
                                type2 = Object.class;
                            }
                        }
                    }
                }
                type2 = null;
                if (type2 == null) {
                    type2 = Object.class;
                }
            }
            bl_aad.a(type2, r2, obj);
            return r2;
        }
    }
}
