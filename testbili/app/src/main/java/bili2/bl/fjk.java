package bili2.bl;

import android.net.Uri;
import android.support.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: BL */
class fjk {
    final Map<String, fjf> a;

    public fjk(Map<String, fjf> map) {
        this.a = map;
    }

    void a(fjc... bl_fjcArr) {
        for (Entry value : this.a.entrySet()) {
            ((fjf) value.getValue()).a(bl_fjcArr);
        }
    }

    void a(Uri uri, Object obj) {
        String scheme = uri.getScheme();
        fjf bl_fjf = (fjf) this.a.get(scheme.toLowerCase());
        if (bl_fjf == null || !bl_fjf.b(uri, obj)) {
            fjb.a("Unsupported scheme " + scheme + " with parameter " + obj);
        } else {
            bl_fjf.a(uri, obj);
        }
    }

    fjd a(Uri uri) {
        String scheme = uri.getScheme();
        fjf bl_fjf = (fjf) this.a.get(scheme.toLowerCase());
        if (bl_fjf != null) {
            return bl_fjf.a(uri);
        }
        fjb.a("Unsupported scheme " + scheme + " now!");
        return b(uri);
    }

    @VisibleForTesting
    fjd b(Uri uri) {
        return fiz.a(uri);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            stringBuilder.append((String) entry.getKey()).append(": {").append(entry.getValue()).append("}");
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
