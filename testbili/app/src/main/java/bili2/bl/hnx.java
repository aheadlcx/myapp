package bili2.bl;

import android.net.Uri;

/* compiled from: BL */
public class hnx implements hns {
    final String a;

    public hnx(String str) {
        this.a = (String) hpd.a((Object) str);
    }

    public String toString() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hnx)) {
            return false;
        }
        return this.a.equals(((hnx) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean a(Uri uri) {
        return this.a.contains(uri.toString());
    }

    public String a() {
        return this.a;
    }
}
