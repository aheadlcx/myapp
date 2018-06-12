package bili2.bl;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

/* compiled from: BL */
public class knx {
    private static final knx a = a();
    private static final Logger b = Logger.getLogger(klw.class.getName());

    public static knx b() {
        return a;
    }

    public String c() {
        return "OkHttp";
    }

    protected X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        try {
            Object a = a((Object) sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) a(a, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<Protocol> list) {
    }

    public void b(SSLSocket sSLSocket) {
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public boolean b(String str) {
        return true;
    }

    public Object a(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        a(5, str, (Throwable) obj);
    }

    public static List<String> a(List<Protocol> list) {
        List<String> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public koa a(X509TrustManager x509TrustManager) {
        return new kny(b(x509TrustManager));
    }

    public koa b(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager a = a(sSLSocketFactory);
        if (a != null) {
            return a(a);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + b() + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    private static knx a() {
        knx a = knt.a();
        if (a != null) {
            return a;
        }
        a = knu.a();
        if (a != null) {
            return a;
        }
        a = knv.a();
        return a == null ? new knx() : a;
    }

    static byte[] b(List<Protocol> list) {
        kog bl_kog = new kog();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = (Protocol) list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                bl_kog.b(protocol.toString().length());
                bl_kog.a(protocol.toString());
            }
        }
        return bl_kog.v();
    }

    static <T> T a(Object obj, Class<T> cls, String str) {
        Class cls2 = obj.getClass();
        while (cls2 != Object.class) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (obj2 == null || !cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException e) {
                cls2 = cls2.getSuperclass();
            } catch (IllegalAccessException e2) {
                throw new AssertionError();
            }
        }
        if (!str.equals("delegate")) {
            Object a = a(obj, Object.class, "delegate");
            if (a != null) {
                return a(a, (Class) cls, str);
            }
        }
        return null;
    }

    public kod b(X509TrustManager x509TrustManager) {
        return new knz(x509TrustManager.getAcceptedIssuers());
    }
}
