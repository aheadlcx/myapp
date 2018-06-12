package bili2.bl;

import android.os.SystemClock;

/* compiled from: BL */
class fbp<ENTRY> {
    private ENTRY a;
    private long b;

    fbp(ENTRY entry, long j) {
        this.a = entry;
        this.b = j;
    }

    boolean a() {
        return this.b < SystemClock.elapsedRealtime();
    }

    ENTRY b() {
        return this.a;
    }

    static <ENTRY> fbp<ENTRY> a(ENTRY entry, long j) {
        return new fbp(entry, SystemClock.elapsedRealtime() + j);
    }
}
