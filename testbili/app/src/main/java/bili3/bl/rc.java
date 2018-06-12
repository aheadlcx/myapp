package bili3.bl;

import c.t.m.g.bd;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class rc {
    private static rc a = new rc();
    private Map<String, String> b = new bd();

    private rc() {
        a(ry.b("HalleyOperInfo_" + ug.b(), Constants.STR_EMPTY), false);
    }

    public static rc a() {
        return a;
    }

    public static String a(int i) {
        return i == 1 ? "cm" : i == 3 ? "ct" : i == 2 ? "uni" : Constants.STR_EMPTY;
    }

    public final String a(String str) {
        if (sd.a(str) || "unknown".equals(str)) {
            return Constants.STR_EMPTY;
        }
        synchronized (this.b) {
            String str2 = (String) this.b.get(str);
            if (sd.a(str2)) {
                return Constants.STR_EMPTY;
            }
            return str2;
        }
    }

    public final void a(String str, String str2) {
        if (!sd.a(str) && !"unknown".equals(str) && !sd.a(str2) && !"unknown".equals(str2)) {
            synchronized (this.b) {
                if (!str2.equals((String) this.b.get(str))) {
                    this.b.put(str, str2);
                    ry.a("HalleyOperInfo_" + ug.b(), b());
                }
            }
        }
    }

    public final void a(String str, boolean z) {
        try {
            if (!sd.a(str)) {
                synchronized (this.b) {
                    this.b.clear();
                    String[] split = str.split("h;l");
                    if (split != null) {
                        for (String split2 : split) {
                            String[] split3 = split2.split("h,l");
                            if (split3.length == 2) {
                                this.b.put(split3[0], split3[1]);
                            }
                        }
                    }
                }
                if (z) {
                    ry.a("HalleyOperInfo_" + ug.b(), str);
                }
            }
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    public final String b() {
        StringBuilder stringBuilder = new StringBuilder();
        synchronized (this.b) {
            List arrayList = new ArrayList(this.b.keySet());
            List arrayList2 = new ArrayList(this.b.values());
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList2.get(i);
                stringBuilder.append((String) arrayList.get(i)).append("h,l").append(str).append("h;l");
            }
        }
        return stringBuilder.toString();
    }
}
