package bili.bl;

import android.content.Context;
import android.support.graphics.drawable.animated.BuildConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class aeg {
    public static Map<String, String> a(Context context) {
        String str;
        afe a = afe.a();
        Map<String, String> hashMap = new HashMap();
        aep a2 = aeo.a(context);
        String a3 = afe.a(context);
        String b = afe.b(context);
        String l = afe.l(context);
        String o = afe.o(context);
        String n = afe.n(context);
        if (a2 != null) {
            if (aey.a(a3)) {
                a3 = a2.a();
            }
            if (aey.a(b)) {
                b = a2.b();
            }
            if (aey.a(l)) {
                l = a2.c();
            }
            if (aey.a(o)) {
                o = a2.d();
            }
            if (aey.a(n)) {
                n = a2.e();
            }
            str = n;
            n = o;
            o = l;
            l = b;
            b = a3;
        } else {
            str = n;
            n = o;
            o = l;
            l = b;
            b = a3;
        }
        aep bl_aep = new aep(b, l, o, n, str);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", bl_aep.a());
                jSONObject.put("imsi", bl_aep.b());
                jSONObject.put("mac", bl_aep.c());
                jSONObject.put("bluetoothmac", bl_aep.d());
                jSONObject.put("gsi", bl_aep.e());
                a3 = jSONObject.toString();
                aev.a("device_feature_file_name", "device_feature_file_key", a3);
                aev.a(context, "device_feature_prefs_name", "device_feature_prefs_key", a3);
            } catch (Throwable e) {
                aed.a(e);
            }
        }
        hashMap.put("AD1", b);
        hashMap.put("AD2", l);
        hashMap.put("AD3", afe.g(context));
        hashMap.put("AD5", afe.i(context));
        hashMap.put("AD6", afe.j(context));
        hashMap.put("AD7", afe.k(context));
        hashMap.put("AD8", o);
        hashMap.put("AD9", afe.m(context));
        hashMap.put("AD10", str);
        hashMap.put("AD11", afe.d());
        hashMap.put("AD12", a.e());
        hashMap.put("AD13", afe.f());
        hashMap.put("AD14", afe.h());
        hashMap.put("AD15", afe.i());
        hashMap.put("AD16", afe.j());
        hashMap.put("AD17", BuildConfig.VERSION_NAME);
        hashMap.put("AD18", n);
        hashMap.put("AD19", afe.p(context));
        hashMap.put("AD20", afe.k());
        hashMap.put("AD21", afe.f(context));
        hashMap.put("AD22", BuildConfig.VERSION_NAME);
        hashMap.put("AD23", afe.l());
        hashMap.put("AD24", aey.f(afe.h(context)));
        hashMap.put("AD26", afe.e(context));
        hashMap.put("AD27", afe.q());
        hashMap.put("AD28", afe.s());
        hashMap.put("AD29", afe.u());
        hashMap.put("AD30", afe.r());
        hashMap.put("AD31", afe.t());
        hashMap.put("AD32", afe.o());
        hashMap.put("AD33", afe.p());
        hashMap.put("AD34", afe.s(context));
        hashMap.put("AD35", afe.t(context));
        hashMap.put("AD36", afe.r(context));
        hashMap.put("AD37", afe.n());
        hashMap.put("AD38", afe.m());
        hashMap.put("AD39", afe.c(context));
        hashMap.put("AD40", afe.d(context));
        hashMap.put("AD41", afe.b());
        hashMap.put("AD42", afe.c());
        hashMap.put("AL3", afe.q(context));
        return hashMap;
    }
}
