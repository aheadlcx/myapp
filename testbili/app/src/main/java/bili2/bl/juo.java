package bili2.bl;

import kotlin.reflect.jvm.internal.impl.name.State;

public final /* synthetic */ class juo {
    public static final /* synthetic */ int[] a = new int[State.values().length];

    static {
        a[State.BEGINNING.ordinal()] = 1;
        a[State.AFTER_DOT.ordinal()] = 2;
        a[State.MIDDLE.ordinal()] = 3;
    }
}
