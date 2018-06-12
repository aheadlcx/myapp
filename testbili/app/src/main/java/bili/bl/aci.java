package bili.bl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class aci {
    static List<acm> a;

    static {
        List arrayList = new ArrayList();
        a = arrayList;
        arrayList.add(new acp());
        a.add(new ach());
        a.add(new acg());
        a.add(new acl());
        a.add(new aco());
        a.add(new acf());
        a.add(new ace());
        a.add(new ack());
    }

    public static final <T> T a(Object obj, Type type) {
        for (acm bl_acm : a) {
            if (bl_acm.a(acq.a(type))) {
                T a = bl_acm.a(obj, type);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Object trim = str.trim();
        return (trim.startsWith("[") && trim.endsWith("]")) ? a(new kqe(trim), type) : (trim.startsWith("{") && trim.endsWith("}")) ? a(new kqf(trim), type) : a(trim, type);
    }
}
