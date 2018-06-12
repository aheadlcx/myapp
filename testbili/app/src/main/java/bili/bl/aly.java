package bili.bl;

import android.support.annotation.WorkerThread;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.TextUtils;
import com.bilibili.ad.commercial.BaseRecord;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: BL */
abstract class aly<T extends BaseRecord> {
    AtomicBoolean a = new AtomicBoolean(false);
    amc<T> b;
    ame c;

    /* compiled from: BL */
    public interface a {
        void a();

        void a(int i, String str);
    }

    abstract amc<T> a();

    @WorkerThread
    abstract void a(T t, boolean z);

    @WorkerThread
    abstract void a(List<T> list, boolean z);

    abstract void b(T t);

    @WorkerThread
    abstract void c();

    aly(ame bl_ame) {
        this.c = bl_ame;
        this.b = a();
    }

    @WorkerThread
    public void a(T t) {
        b(t);
        if (c(t)) {
            a((BaseRecord) t, true);
        }
    }

    protected String b() {
        Object d = this.c.e().d();
        if (!TextUtils.isEmpty(d)) {
            try {
                return URLEncoder.encode(d, "UTF-8");
            } catch (Throwable e) {
                ibn.a(e);
            }
        }
        return BuildConfig.VERSION_NAME;
    }

    boolean c(T t) {
        if (blk.a().g()) {
            return true;
        }
        a(1, hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 37, (byte) 107, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110}), t);
        return false;
    }

    void d(T t) {
        this.b.a(t.key());
    }

    void a(int i, String str, T t) {
        if (t.fail()) {
            this.b.a((BaseRecord) t);
        } else {
            this.b.b((BaseRecord) t);
        }
        b(i, str, t);
    }

    static void b(int i, String str, BaseRecord baseRecord) {
        fcz.a().a(false, hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 108, (byte) 105}), hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 104, (byte) 117}), String.valueOf(baseRecord.ts), hae.a(new byte[]{(byte) 118, (byte) 119, (byte) 102, (byte) 90, (byte) 108, (byte) 97}), String.valueOf(baseRecord.srcId), hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), String.valueOf(baseRecord.type), hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 90, (byte) 119, (byte) 96, (byte) 100, (byte) 118, (byte) 106, (byte) 107}), String.valueOf(i), hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 90, (byte) 97, (byte) 96, (byte) 118}), String.valueOf(str), hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125}), String.valueOf(baseRecord.failCount));
    }

    public void a(int i) {
        if (!this.a.get()) {
            this.a.set(true);
            List<BaseRecord> a = this.b.a(i);
            if (i == 1) {
                for (List a2 : a((List) a, 10)) {
                    a(a2, false);
                }
            } else {
                for (BaseRecord baseRecord : a) {
                    if (baseRecord != null && c(baseRecord)) {
                        a(baseRecord, false);
                    }
                }
            }
            this.a.set(false);
        }
    }

    public static <T> List<List<T>> a(List<T> list, int i) {
        List<List<T>> arrayList = new ArrayList();
        List list2 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 % i == 0) {
                list2 = new ArrayList();
                arrayList.add(list2);
            }
            list2.add(list.get(i2));
        }
        return arrayList;
    }
}
