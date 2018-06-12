package bili.bl;

import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAttention;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveAttentionClose;
import com.bilibili.bililive.videoliveplayer.ui.live.attention.items.LiveAttentionClose;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
class duz {
    static List<Object> a(BiliLiveAttention biliLiveAttention) {
        List<Object> arrayList = new ArrayList();
        if (!(biliLiveAttention == null || biliLiveAttention.mCount == 0 || biliLiveAttention.mAttentions == null || biliLiveAttention.mAttentions.isEmpty())) {
            dvm bl_dvm = new dvm();
            bl_dvm.b = 0;
            bl_dvm.a = biliLiveAttention.mCount;
            arrayList.add(bl_dvm);
            if (biliLiveAttention.mAttentions != null) {
                arrayList.addAll(biliLiveAttention.mAttentions);
            }
        }
        return arrayList;
    }

    static List<Object> a(BiliLiveAttentionClose biliLiveAttentionClose, boolean z) {
        boolean z2 = true;
        List<Object> arrayList = new ArrayList();
        if (biliLiveAttentionClose == null || biliLiveAttentionClose.mCount == 0 || biliLiveAttentionClose.mAttentions == null || biliLiveAttentionClose.mAttentions.isEmpty()) {
            return arrayList;
        }
        dvm bl_dvm = new dvm();
        bl_dvm.b = 1;
        bl_dvm.a = biliLiveAttentionClose.mCount;
        arrayList.add(bl_dvm);
        if (biliLiveAttentionClose.mAttentions != null) {
            arrayList.addAll(biliLiveAttentionClose.mAttentions);
        }
        if (!z) {
            dvl bl_dvl = new dvl();
            if (biliLiveAttentionClose.mHasMore != 1) {
                z2 = false;
            }
            bl_dvl.a = z2;
            bl_dvl.b = false;
            arrayList.add(bl_dvl);
        }
        return arrayList;
    }

    static List<Object> a(List<LiveAttentionClose> list) {
        List<Object> arrayList = new ArrayList();
        if (!(list == null || list.isEmpty())) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    static List<Object> a() {
        List<Object> arrayList = new ArrayList();
        dvl bl_dvl = new dvl();
        bl_dvl.a = false;
        bl_dvl.b = true;
        arrayList.add(bl_dvl);
        return arrayList;
    }
}
