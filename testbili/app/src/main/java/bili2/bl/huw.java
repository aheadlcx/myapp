package bili2.bl;

/* compiled from: BL */
public class huw implements hpf<hve> {
    public /* synthetic */ Object a() {
        return b();
    }

    public hve b() {
        int c = c();
        return new hve(c, Integer.MAX_VALUE, c, Integer.MAX_VALUE, c / 8);
    }

    private int c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        if (min < 33554432) {
            return 2097152;
        }
        return 4194304;
    }
}
