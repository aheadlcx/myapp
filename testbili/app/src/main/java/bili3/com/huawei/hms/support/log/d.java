package bili3.com.huawei.hms.support.log;

import android.os.Process;
import android.util.Log;
import com.tencent.connect.share.QzoneShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: BL */
public class d {
    private String a = null;
    private String b = "HMS";
    private int c = 0;
    private long d = 0;
    private long e = 0;
    private String f;
    private int g;
    private int h;
    private int i = 0;
    private final StringBuilder j = new StringBuilder();

    d(int i, String str, int i2, String str2) {
        this.i = i;
        this.a = str;
        this.c = i2;
        if (str2 != null) {
            this.b = str2;
        }
        c();
    }

    private d c() {
        this.d = System.currentTimeMillis();
        Thread currentThread = Thread.currentThread();
        this.e = currentThread.getId();
        this.g = java.lang.Process.myPid();
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        if (stackTrace.length > this.i) {
            StackTraceElement stackTraceElement = stackTrace[this.i];
            this.f = stackTraceElement.getFileName();
            this.h = stackTraceElement.getLineNumber();
        }
        return this;
    }

    public <T> d a(T t) {
        this.j.append(t);
        return this;
    }

    public d a(Throwable th) {
        a(Character.valueOf('\n')).a(Log.getStackTraceString(th));
        return this;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder);
        return stringBuilder.toString();
    }

    private StringBuilder a(StringBuilder stringBuilder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        stringBuilder.append('[');
        stringBuilder.append(simpleDateFormat.format(Long.valueOf(this.d)));
        stringBuilder.append(' ').append(a(this.c)).append('/').append(this.b).append('/').append(this.a);
        stringBuilder.append(' ').append(this.g).append(':').append(this.e);
        stringBuilder.append(' ').append(this.f).append(':').append(this.h);
        stringBuilder.append(']');
        return stringBuilder;
    }

    public static String a(int i) {
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                return "D";
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                return "I";
            case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                return "W";
            case QzoneShare.SHARE_TO_QZONE_TYPE_APP /*6*/:
                return "E";
            default:
                return String.valueOf(i);
        }
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder);
        return stringBuilder.toString();
    }

    private StringBuilder b(StringBuilder stringBuilder) {
        stringBuilder.append(' ').append(this.j.toString());
        return stringBuilder;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        a(stringBuilder);
        b(stringBuilder);
        return stringBuilder.toString();
    }
}
