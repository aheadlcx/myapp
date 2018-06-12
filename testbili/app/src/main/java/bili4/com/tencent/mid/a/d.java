package bili4.com.tencent.mid.a;

import bl.ibn;
import org.json.JSONObject;

public class d {
    private int a = -1;
    private JSONObject b = null;

    public d(int i, String str) {
        this.a = i;
        try {
            this.b = new JSONObject(str);
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    public int a() {
        return this.a;
    }

    public JSONObject b() {
        return this.b;
    }
}
