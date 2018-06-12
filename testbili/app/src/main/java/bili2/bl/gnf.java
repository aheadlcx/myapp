package bili2.bl;

import bl.kqj.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: BL */
public class gnf extends a {
    private klw a;
    private amz b;

    public gnf(klw bl_klw, amz bl_amz) {
        this.a = bl_klw;
        this.b = bl_amz;
    }

    public kqj<?, gne> a(final Type type, final Annotation[] annotationArr, kqt bl_kqt) {
        if (a.a(type) != gne.class) {
            return null;
        }
        return new kqj<Object, gne>(this) {
            final /* synthetic */ gnf c;

            public /* synthetic */ Object b(kqi bl_kqi) {
                return a(bl_kqi);
            }

            public Type a() {
                return a.b(0, (ParameterizedType) type);
            }

            public gne a(kqi<Object> bl_kqi_java_lang_Object) {
                return new gne(bl_kqi_java_lang_Object.c(), a(), annotationArr, this.c.a, this.c.b);
            }
        };
    }
}
