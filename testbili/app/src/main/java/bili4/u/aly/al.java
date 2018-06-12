package bili4.u.aly;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import bl.ibn;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.a;
import com.umeng.analytics.b;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLEncoder;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* compiled from: BL */
public class al {
    private String a;
    private String b = "10.0.0.172";
    private int c = 80;
    private Context d;
    private aj e;

    public al(Context context) {
        this.d = context;
        this.a = a(context);
    }

    public void a(aj ajVar) {
        this.e = ajVar;
    }

    private void a() {
        bl.b("constructURLS");
        String b = x.a(this.d).b().b(bj.b);
        String a = x.a(this.d).b().a(bj.b);
        if (!TextUtils.isEmpty(b)) {
            a.b = b.b(b);
        }
        if (!TextUtils.isEmpty(a)) {
            a.c = b.b(a);
        }
        a.d = new String[]{a.b, a.c};
        if (bj.q(this.d)) {
            a.d = new String[]{a.c, a.b};
        } else {
            int b2 = aw.a(this.d).b();
            if (b2 != -1) {
                if (b2 == 0) {
                    a.d = new String[]{a.b, a.c};
                } else if (b2 == 1) {
                    a.d = new String[]{a.c, a.b};
                }
            }
        }
        bl.b("constructURLS list size:" + a.d.length);
    }

    public byte[] a(byte[] bArr) {
        byte[] bArr2 = null;
        for (String a : a.d) {
            bArr2 = a(bArr, a);
            if (bArr2 != null) {
                if (this.e != null) {
                    this.e.c();
                }
                return bArr2;
            }
            if (this.e != null) {
                this.e.d();
            }
        }
        return bArr2;
    }

    private boolean b() {
        if (this.d.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.d.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.d.getSystemService("connectivity");
            if (!bj.a(this.d, "android.permission.ACCESS_NETWORK_STATE")) {
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == 1)) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo != null && (extraInfo.equals("cmwap") || extraInfo.equals("3gwap") || extraInfo.equals("uniwap"))) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    private byte[] a(byte[] bArr, String str) {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Throwable e;
        try {
            if (this.e != null) {
                this.e.a();
            }
            if (b()) {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection(new Proxy(Type.HTTP, new InetSocketAddress(this.b, this.c)));
            } else {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            }
            try {
                httpURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                httpURLConnection.setRequestProperty("X-Umeng-Sdk", this.a);
                httpURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                httpURLConnection.setRequestProperty("Content-Type", "envelope/json");
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                if (Integer.parseInt(VERSION.SDK) < 8) {
                    System.setProperty("http.keepAlive", "false");
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
                if (this.e != null) {
                    this.e.b();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Object headerField = httpURLConnection.getHeaderField("Content-Type");
                if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                    headerField = null;
                } else {
                    headerField = 1;
                }
                if (responseCode != IjkMediaCodecInfo.RANK_SOFTWARE || r0 == null) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                bl.c("Send message to " + str);
                inputStream = httpURLConnection.getInputStream();
                byte[] b = bk.b(inputStream);
                bk.c(inputStream);
                if (httpURLConnection == null) {
                    return b;
                }
                httpURLConnection.disconnect();
                return b;
            } catch (Exception e2) {
                e = e2;
                try {
                    bl.e("IOException,Failed to send message.", e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                } catch (Throwable th) {
                    e = th;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                bk.c(inputStream);
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnection = null;
            bl.e("IOException,Failed to send message.", e);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            return null;
        } catch (Throwable th3) {
            e = th3;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw e;
        }
    }

    private String a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Android");
        stringBuffer.append("/");
        stringBuffer.append("6.0.1");
        stringBuffer.append(" ");
        try {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(bj.B(context));
            stringBuffer2.append("/");
            stringBuffer2.append(bj.d(context));
            stringBuffer2.append(" ");
            stringBuffer2.append(Build.MODEL);
            stringBuffer2.append("/");
            stringBuffer2.append(VERSION.RELEASE);
            stringBuffer2.append(" ");
            stringBuffer2.append(bk.a(AnalyticsConfig.a(context)));
            stringBuffer.append(URLEncoder.encode(stringBuffer2.toString(), "UTF-8"));
        } catch (Throwable e) {
            ibn.a(e);
        }
        return stringBuffer.toString();
    }
}
