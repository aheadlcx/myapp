package bili.bl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BL */
public class cpu extends clt {
    private static Map<Class, WeakReference<cpu>> a = new HashMap();

    public static void g() {
        for (WeakReference weakReference : a.values()) {
            if (weakReference.get() != null) {
                ((cpu) weakReference.get()).finish();
            }
        }
        a.clear();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        a.put(getClass(), new WeakReference(this));
    }

    protected void onDestroy() {
        super.onDestroy();
        a.remove(getClass());
    }
}
