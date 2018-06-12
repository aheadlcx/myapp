package bili2.bl;

import java.util.Arrays;

/* compiled from: BL */
public final class jpc extends jyk {
    public static final jpc a = new jpc(1, 0, 2);
    public static final jpc b = new jpc(new int[0]);
    public static final a c = new a();

    /* compiled from: BL */
    public static final class a {
        private a() {
        }
    }

    public jpc(int... iArr) {
        jgp.b(iArr, "numbers");
        super(Arrays.copyOf(iArr, iArr.length));
    }
}
