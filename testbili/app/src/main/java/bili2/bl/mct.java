package bili2.bl;

import android.content.Context;
import android.util.DisplayMetrics;
import bl.feh.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BL */
public class mct implements a {
    public String a() {
        return ams.e();
    }

    public String b() {
        return String.valueOf(ams.c());
    }

    public String c() {
        return mbg.a().b();
    }

    public JSONObject a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", displayMetrics.widthPixels);
            jSONObject.put("h", displayMetrics.heightPixels);
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
