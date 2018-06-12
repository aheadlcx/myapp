package bili.bl;

import android.support.graphics.drawable.animated.BuildConfig;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class acw extends act {
    private int c;
    private Object d;

    public acw(int i, String str, Object obj) {
        super(str, obj);
        this.c = i;
    }

    public final void a(Object obj) {
        this.d = obj;
    }

    public final byte[] a() {
        try {
            List arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", acj.a(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.a));
            arrayList.add(new BasicNameValuePair("id", this.c));
            new StringBuilder("mParams is:").append(this.b);
            arrayList.add(new BasicNameValuePair("requestData", this.b == null ? "[]" : acj.a(this.b)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Throwable e) {
            Throwable th = e;
            throw new RpcException(Integer.valueOf(9), new StringBuilder("request  =").append(this.b).append(":").append(th).toString() == null ? BuildConfig.VERSION_NAME : th.getMessage(), th);
        }
    }
}
