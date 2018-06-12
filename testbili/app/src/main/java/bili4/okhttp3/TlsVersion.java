package bili4.okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u.aly.dd;
import u.aly.q;

/* compiled from: BL */
public enum TlsVersion {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public final String javaName;

    private TlsVersion(String str) {
        this.javaName = str;
    }

    public static TlsVersion a(String str) {
        Object obj = -1;
        switch (str.hashCode()) {
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    obj = 2;
                    break;
                }
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    obj = 1;
                    break;
                }
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    obj = null;
                    break;
                }
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    obj = 4;
                    break;
                }
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    obj = 3;
                    break;
                }
                break;
        }
        switch (obj) {
            case dd.a /*0*/:
                return TLS_1_3;
            case q.a /*1*/:
                return TLS_1_2;
            case dd.c /*2*/:
                return TLS_1_1;
            case dd.d /*3*/:
                return TLS_1_0;
            case dd.e /*4*/:
                return SSL_3_0;
            default:
                throw new IllegalArgumentException("Unexpected TLS version: " + str);
        }
    }

    public static List<TlsVersion> a(String... strArr) {
        List arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
