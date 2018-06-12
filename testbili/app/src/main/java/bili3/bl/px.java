package bili3.bl;

import java.lang.reflect.Array;
import java.util.List;

/* compiled from: BL */
public final class px {
    private static final boolean a = a();

    private static boolean a() {
        try {
            Class.forName("bl.fa");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        } catch (VerifyError e2) {
            return false;
        }
    }

    @SafeVarargs
    public static <T> List<T> a(T... tArr) {
        return new pw(b(tArr));
    }

    private static <T> T[] b(T[] tArr) {
        int length = tArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3;
            T t = tArr[i];
            if (t != null) {
                i3 = i2 + 1;
                tArr[i2] = t;
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        if (i2 == length) {
            return tArr;
        }
        T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2);
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        return tArr2;
    }
}
