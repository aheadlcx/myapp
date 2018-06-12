package bili2.bl;

import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class fmp {
    private static final String a = hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 86, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96});
    private static AtomicInteger b = new AtomicInteger(0);
    private static List<String> c = Collections.emptyList();

    public static void a(@NonNull String str) {
        BLog.d(hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 86, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96}), hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 37, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 37, (byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 41, (byte) 37, (byte) 96, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 37, (byte) 56, (byte) 37}) + str);
        a();
        etb.a(2).removeCallbacksAndMessages(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96}));
        if (c.equals(Collections.emptyList())) {
            synchronized (fmp.class) {
                c = new LinkedList();
            }
        }
        b.incrementAndGet();
        c.add(hae.a(new byte[]{(byte) 64, (byte) 107, (byte) 113, (byte) 119, (byte) 108, (byte) 96, (byte) 118, (byte) 37, (byte) 57, (byte) 57, (byte) 37}) + str);
    }

    public static void b(@NonNull String str) {
        BLog.d(hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 86, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96}), hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 37, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 37, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109, (byte) 96, (byte) 97, (byte) 41, (byte) 37, (byte) 96, (byte) 107, (byte) 113, (byte) 119, (byte) 124, (byte) 37, (byte) 56, (byte) 37}) + str);
        a();
        if (c.equals(Collections.emptyList())) {
            synchronized (fmp.class) {
                c = new LinkedList();
            }
        }
        c.add(hae.a(new byte[]{(byte) 64, (byte) 107, (byte) 113, (byte) 119, (byte) 108, (byte) 96, (byte) 118, (byte) 37, (byte) 59, (byte) 59, (byte) 37}) + str);
        if (b.decrementAndGet() <= 0) {
            BLog.i(hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 86, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96}), hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 106, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 37, (byte) 114, (byte) 108, (byte) 105, (byte) 105, (byte) 37, (byte) 118, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96, (byte) 37, (byte) 100, (byte) 99, (byte) 113, (byte) 96, (byte) 119, (byte) 37, (byte) 51, (byte) 53, (byte) 37, (byte) 118, (byte) 96, (byte) 102, (byte) 106, (byte) 107, (byte) 97, (byte) 118, (byte) 43, (byte) 43, (byte) 43}));
            etb.a(2).postAtTime(new Runnable() {
                public void run() {
                    BLog.dfmt(hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 86, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96}), hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96, (byte) 43, (byte) 43, (byte) 37, (byte) 117, (byte) 108, (byte) 97, (byte) 56, (byte) 32, (byte) 97}), new Object[]{Integer.valueOf(java.lang.Process.myPid())});
                    java.lang.Process.killProcess(java.lang.Process.myPid());
                }
            }, hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96}), SystemClock.uptimeMillis() + 1800000);
        }
    }

    private static void a() {
        if (ert.a(esp.a(), 58) < 0) {
            throw new IllegalStateException(hae.a(new byte[]{(byte) 82, (byte) 96, (byte) 103, (byte) 86, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 100, (byte) 117, (byte) 117, (byte) 105, (byte) 108, (byte) 96, (byte) 97, (byte) 37, (byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 108, (byte) 107, (byte) 37, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 37, (byte) 117, (byte) 119, (byte) 106, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 43}));
        }
    }
}
