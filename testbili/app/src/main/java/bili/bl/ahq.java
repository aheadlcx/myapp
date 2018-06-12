package bili.bl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BL */
public final class ahq extends ahm {
    protected final List<Header> a(boolean z, String str) {
        List<Header> arrayList = new ArrayList();
        arrayList.add(new BasicHeader("msp-gzip", String.valueOf(z)));
        arrayList.add(new BasicHeader("content-type", "application/octet-stream"));
        arrayList.add(new BasicHeader("des-mode", "CBC"));
        return arrayList;
    }

    protected final String c() throws JSONException {
        HashMap hashMap = new HashMap();
        hashMap.put("api_name", "/sdk/log");
        hashMap.put("api_version", "1.0.0");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("log_v", "1.0");
        return ahm.a(hashMap, hashMap2);
    }

    protected final JSONObject a() throws JSONException {
        return null;
    }

    protected final String a(String str, JSONObject jSONObject) {
        return str;
    }

    public final ahk a(Context context, String str) throws Throwable {
        return a(context, str, "http://mcgw.alipay.com/sdklog.do", true);
    }
}
