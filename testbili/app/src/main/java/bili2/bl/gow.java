package bili2.bl;

import com.alibaba.fastjson.JSONObject;

/* compiled from: BL */
public class gow {
    public int a;
    public String b;
    public Object c;

    public gow(int i, String str, JSONObject jSONObject) {
        this.a = i;
        this.b = str;
        this.c = jSONObject;
    }

    public static gow a(int i) {
        return new gow(i, null, null);
    }

    public static gow a(int i, String str, JSONObject jSONObject) {
        return new gow(i, str, jSONObject);
    }

    public static gow a(JSONObject jSONObject) {
        return new gow(0, null, jSONObject);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.a("code", Integer.valueOf(this.a));
        jSONObject.a("msg", this.b);
        if (this.c == null) {
            jSONObject.a("data", gmy.d);
        } else if (JSONObject.class.isInstance(this.c)) {
            jSONObject.a("data", this.c);
        }
        return jSONObject.a();
    }

    public String a() {
        return toString();
    }
}
