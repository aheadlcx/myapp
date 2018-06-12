package bili.bl;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: BL */
public final class agy {
    private static agy c;
    int a = 3500;
    public String b = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&";

    public final int a() {
        if (this.a < 1000 || this.a > 20000) {
            return 3500;
        }
        new StringBuilder("DynamicConfig::getJumpTimeout >").append(this.a);
        return this.a;
    }

    public static agy b() {
        if (c == null) {
            agy bl_agy = new agy();
            c = bl_agy;
            Object b = aid.b(ahu.a().a, "alipay_cashier_dynamic_config", null);
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    bl_agy.a = jSONObject.optInt("timeout", 3500);
                    bl_agy.b = jSONObject.optString("tbreturl", "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&").trim();
                } catch (Throwable th) {
                }
            }
        }
        return c;
    }

    public final void a(Context context) {
        new Thread(new agz(this, context)).start();
    }
}
