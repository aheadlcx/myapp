package bili4.kotlin.reflect.jvm.internal;

import bl.jds;
import bl.jfn;
import bl.jgp;
import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.jvm.internal.Lambda;
import u.aly.bj;

@jds(a = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010&\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\n\u00a2\u0006\u0002\b\u0005"}, b = {"<anonymous>", "", "entry", "", "", "invoke"})
/* compiled from: BL */
final class AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 extends Lambda implements jfn<Entry<? extends String, ? extends Object>, String> {
    public static final AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 INSTANCE = new AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1();

    AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1() {
        super(1);
    }

    public final String a(Entry<String, ? extends Object> entry) {
        String arrays;
        jgp.b(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            arrays = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            arrays = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            arrays = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            arrays = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            arrays = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            arrays = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            arrays = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            arrays = Arrays.toString((double[]) value);
        } else if (value instanceof Object[]) {
            arrays = Arrays.toString((Object[]) value);
        } else {
            arrays = value.toString();
        }
        return bj.b + str + '=' + arrays;
    }
}
