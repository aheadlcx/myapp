package bili3.bl;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class rj extends rh {
    ri a = new ri("HttpSchedulerHandler");

    public final void a() {
        ug.j().post(new rk(this, null, null));
    }

    public final void a(rd rdVar) {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            ri riVar = this.a;
            uj.e();
            byte[] a = riVar.a(uj.b());
            jSONObject = !sd.a(a) ? new JSONObject(new String(a)) : null;
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("resultMap");
                if (optJSONObject != null) {
                    Iterator keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        JSONArray optJSONArray = optJSONObject.optJSONArray(str);
                        if (optJSONArray != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject jSONObject4 = optJSONArray.getJSONObject(i);
                                jSONObject3.put(jSONObject4.optString("unit"), jSONObject4.optString("schedulecode"));
                            }
                            jSONObject2.put(str, jSONObject3);
                        }
                    }
                } else {
                    jSONObject2.put(ug.b(), new JSONObject());
                }
            } else {
                jSONObject2.put(ug.b(), new JSONObject());
            }
            rdVar.a.put("directScheduleCodes", jSONObject2);
        } catch (Exception e) {
            try {
                jSONObject = new JSONObject();
                jSONObject.put(ug.b(), new JSONObject());
                rdVar.a.put("directScheduleCodes", jSONObject);
            } catch (Throwable e2) {
                ibn.a(e2);
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("AccessScheduleRsp");
            if (optJSONObject != null) {
                String jSONObject2 = optJSONObject.toString();
                if (!sd.a(jSONObject2)) {
                    byte[] bytes = jSONObject2.getBytes();
                    if (!sd.a(bytes)) {
                        String b = uj.b();
                        this.a.a(b, bytes);
                        ug.j().post(new rk(this, b, bytes));
                    }
                }
            }
        } catch (Throwable th) {
            ibn.a(th);
        }
    }

    public final String c() {
        return "accessscheduler";
    }
}
