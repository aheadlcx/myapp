package bili2.bl;

import android.util.SparseIntArray;

/* compiled from: BL */
public class hxc {
    private static final SparseIntArray a = new SparseIntArray(0);

    private static int b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            return (min / 4) * 3;
        }
        return min / 2;
    }

    public static hxp a() {
        return new hxp(0, b(), a);
    }
}
