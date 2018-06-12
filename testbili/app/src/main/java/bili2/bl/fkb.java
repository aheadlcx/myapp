package bili2.bl;

import android.util.SparseIntArray;

/* compiled from: BL */
final class fkb {
    private static final SparseIntArray a = new SparseIntArray(10);
    private static final SparseIntArray b = new SparseIntArray(11);

    static {
        a.put(1, 1);
        a.put(2, 2);
        a.put(3, 3);
        a.put(4, 4);
        a.put(5, 5);
        a.put(6, 6);
        a.put(7, 7);
        a.put(8, 8);
        a.put(9, 5);
        a.put(12, 12);
        b.put(1, 1);
        b.put(2, 2);
        b.put(3, 3);
        b.put(4, 4);
        b.put(5, 5);
        b.put(6, 6);
        b.put(7, 7);
        b.put(8, 8);
        b.put(9, 9);
        b.put(10, 10);
        b.put(11, 11);
    }

    public static int a(int i) {
        return a.get(i, i);
    }

    public static int b(int i) {
        return b.get(i, i);
    }

    public static int a(String str, int i) {
        if (fjx.c(str)) {
            return a(i);
        }
        if (fjx.d(str)) {
            return b(i);
        }
        return i;
    }
}
