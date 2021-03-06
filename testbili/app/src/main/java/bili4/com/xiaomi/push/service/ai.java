package bili4.com.xiaomi.push.service;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.xiaomi.channel.commonutils.string.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import u.aly.bj;

public class ai {
    private static Object a = new Object();
    private static Map<String, Queue<String>> b = new HashMap();

    public static boolean a(XMPushService xMPushService, String str, String str2) {
        synchronized (a) {
            SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
            Collection collection = (Queue) b.get(str);
            if (collection == null) {
                String[] split = sharedPreferences.getString(str, bj.b).split(",");
                collection = new LinkedList();
                for (Object add : split) {
                    collection.add(add);
                }
                b.put(str, collection);
            }
            if (collection.contains(str2)) {
                return true;
            }
            collection.add(str2);
            if (collection.size() > 25) {
                collection.poll();
            }
            String a = d.a(collection, ",");
            Editor edit = sharedPreferences.edit();
            edit.putString(str, a);
            edit.commit();
            return false;
        }
    }
}
