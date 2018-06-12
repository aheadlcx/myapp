package bili.bl;

import android.content.Context;
import android.support.graphics.drawable.animated.BuildConfig;
import java.util.HashMap;
import java.util.Map;

public final class aef {
    public static synchronized Map<String, String> a(Context context, Map<String, String> map) {
        Map<String, String> hashMap;
        synchronized (aef.class) {
            hashMap = new HashMap();
            String a = aey.a(map, "tid", BuildConfig.VERSION_NAME);
            String a2 = aey.a(map, "utdid", BuildConfig.VERSION_NAME);
            String a3 = aey.a(map, "userId", BuildConfig.VERSION_NAME);
            String a4 = aey.a(map, "appName", BuildConfig.VERSION_NAME);
            String a5 = aey.a(map, "appKeyClient", BuildConfig.VERSION_NAME);
            String a6 = aey.a(map, "tmxSessionId", BuildConfig.VERSION_NAME);
            String c = aer.c(context);
            hashMap.put("AC1", a);
            hashMap.put("AC2", a2);
            hashMap.put("AC3", BuildConfig.VERSION_NAME);
            hashMap.put("AC4", c);
            hashMap.put("AC5", a3);
            hashMap.put("AC6", a6);
            hashMap.put("AC7", BuildConfig.VERSION_NAME);
            hashMap.put("AC8", a4);
            hashMap.put("AC9", a5);
        }
        return hashMap;
    }
}
