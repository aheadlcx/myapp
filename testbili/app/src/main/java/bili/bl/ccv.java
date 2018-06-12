package bili.bl;

import com.bilibili.bilibililive.im.entity.ChatMessage;
import com.bilibili.bilibililive.im.entity.DataChangeNotify;
import com.bilibili.bilibililive.im.entity.GroupMemberRoleChangeItem;
import com.bilibili.bilibililive.im.entity.Notification;
import java.util.ArrayList;

/* compiled from: BL */
public interface ccv {
    void a();

    void a(ArrayList<Notification> arrayList);

    void a(ArrayList<ChatMessage> arrayList, ArrayList<ChatMessage> arrayList2);

    void b(ArrayList<DataChangeNotify> arrayList);

    void c(ArrayList<Long> arrayList);

    void d(ArrayList<GroupMemberRoleChangeItem> arrayList);
}
