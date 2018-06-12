package bili4.com.xiaomi.stats;

import bl.jae;
import bl.jah;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ap;
import com.xiaomi.push.thrift.b;
import com.xiaomi.xmpush.thrift.au;
import java.util.Hashtable;

public class h {
    private static final int a = com.xiaomi.push.thrift.a.PING_RTT.a();

    static class a {
        static Hashtable<Integer, Long> a = new Hashtable();
    }

    public static void a() {
        a(0, a);
    }

    public static void a(int i) {
        b f = f.a().f();
        f.a(com.xiaomi.push.thrift.a.CHANNEL_STATS_COUNTER.a());
        f.c(i);
        f.a().a(f);
    }

    public static synchronized void a(int i, int i2) {
        synchronized (h.class) {
            if (i2 < 16777215) {
                a.a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                com.xiaomi.channel.commonutils.logger.b.d("stats key should less than 16777215");
            }
        }
    }

    public static void a(int i, int i2, int i3, String str, int i4) {
        b f = f.a().f();
        f.a((byte) i);
        f.a(i2);
        f.b(i3);
        f.b(str);
        f.c(i4);
        f.a().a(f);
    }

    public static synchronized void a(int i, int i2, String str, int i3) {
        synchronized (h.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (a.a.containsKey(Integer.valueOf(i4))) {
                b f = f.a().f();
                f.a(i2);
                f.b((int) (currentTimeMillis - ((Long) a.a.get(Integer.valueOf(i4))).longValue()));
                f.b(str);
                if (i3 > -1) {
                    f.c(i3);
                }
                f.a().a(f);
                a.a.remove(Integer.valueOf(i2));
            } else {
                com.xiaomi.channel.commonutils.logger.b.d("stats key not found");
            }
        }
    }

    public static void a(XMPushService xMPushService, ap.b bVar) {
        new jae(xMPushService, bVar).a();
    }

    public static void a(String str, int i, Exception exception) {
        b f = f.a().f();
        if (i > 0) {
            f.a(com.xiaomi.push.thrift.a.GSLB_REQUEST_SUCCESS.a());
            f.b(str);
            f.b(i);
            f.a().a(f);
            return;
        }
        try {
            bl.jah.a a = jah.a(exception);
            f.a(a.a.a());
            f.c(a.b);
            f.b(str);
            f.a().a(f);
        } catch (NullPointerException e) {
        }
    }

    public static void a(String str, Exception exception) {
        try {
            bl.jah.a b = jah.b(exception);
            b f = f.a().f();
            f.a(b.a.a());
            f.c(b.b);
            f.b(str);
            f.a().a(f);
        } catch (NullPointerException e) {
        }
    }

    public static void b() {
        a(0, a, null, -1);
    }

    public static void b(String str, Exception exception) {
        try {
            bl.jah.a d = jah.d(exception);
            b f = f.a().f();
            f.a(d.a.a());
            f.c(d.b);
            f.b(str);
            f.a().a(f);
        } catch (NullPointerException e) {
        }
    }

    public static byte[] c() {
        org.apache.thrift.a e = f.a().e();
        return e != null ? au.a(e) : null;
    }
}
