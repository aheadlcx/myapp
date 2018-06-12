package bili.bl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: BL */
public class acc implements ParameterizedType {
    private final Type[] a;
    private final Type b;
    private final Type c;

    public acc(Type[] typeArr, Type type, Type type2) {
        this.a = typeArr;
        this.b = type;
        this.c = type2;
    }

    public Type[] getActualTypeArguments() {
        return this.a;
    }

    public Type getOwnerType() {
        return this.b;
    }

    public Type getRawType() {
        return this.c;
    }
}
