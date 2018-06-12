package bili2.bl;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.LowerCapturedTypePolicy;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckerContext.SeveralSupertypesWithSameConstructorPolicy;

public final /* synthetic */ class kct {
    public static final /* synthetic */ int[] a = new int[LowerCapturedTypePolicy.values().length];
    public static final /* synthetic */ int[] b = new int[SeveralSupertypesWithSameConstructorPolicy.values().length];
    public static final /* synthetic */ int[] c = new int[Variance.values().length];

    static {
        a[LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
        a[LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
        a[LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
        b[SeveralSupertypesWithSameConstructorPolicy.FORCE_NOT_SUBTYPE.ordinal()] = 1;
        b[SeveralSupertypesWithSameConstructorPolicy.TAKE_FIRST_FOR_SUBTYPING.ordinal()] = 2;
        b[SeveralSupertypesWithSameConstructorPolicy.CHECK_ANY_OF_THEM.ordinal()] = 3;
        b[SeveralSupertypesWithSameConstructorPolicy.INTERSECT_ARGUMENTS_AND_CHECK_AGAIN.ordinal()] = 4;
        c[Variance.INVARIANT.ordinal()] = 1;
        c[Variance.OUT_VARIANCE.ordinal()] = 2;
        c[Variance.IN_VARIANCE.ordinal()] = 3;
    }
}
