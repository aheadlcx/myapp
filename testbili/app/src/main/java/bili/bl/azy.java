package bili.bl;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.bilibili.app.live.core.api.BiliCommentApiService;
import com.bilibili.app.live.core.api.BiliCommentList;
import com.bilibili.app.live.core.api.BiliCommentListWithRoot;

/* compiled from: BL */
public class azy extends azv<BiliCommentApiService> {
    private static final String b = hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});

    public static azy a(FragmentActivity fragmentActivity) {
        return a(fragmentActivity.getSupportFragmentManager());
    }

    public static azy a(FragmentManager fragmentManager) {
        return (azy) fragmentManager.findFragmentByTag(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113}));
    }

    public static void a(FragmentManager fragmentManager, azy bl_azy) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        if (!bl_azy.isAdded()) {
            beginTransaction.add((Fragment) bl_azy, hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113}));
        }
        beginTransaction.commitAllowingStateLoss();
    }

    public void a(long j, int i, int i2, gnc<BiliCommentList> bl_gnc_com_bilibili_app_live_core_api_BiliCommentList) {
        bag.a(eva.a(getApplicationContext()).j(), j, i, 0, -1, false, i2, bl_gnc_com_bilibili_app_live_core_api_BiliCommentList);
    }

    public void b(long j, int i, int i2, gnc<BiliCommentList> bl_gnc_com_bilibili_app_live_core_api_BiliCommentList) {
        bag.a(eva.a(getApplicationContext()).j(), j, i, 2, -1, true, i2, bl_gnc_com_bilibili_app_live_core_api_BiliCommentList);
    }

    public void a(long j, int i, long j2, int i2, gnc<BiliCommentListWithRoot> bl_gnc_com_bilibili_app_live_core_api_BiliCommentListWithRoot) {
        bag.a(eva.a(getApplicationContext()).j(), j, i, j2, i2, bl_gnc_com_bilibili_app_live_core_api_BiliCommentListWithRoot);
    }

    public void a(long j, int i, long j2, int i2, int i3, gnc<BiliCommentList> bl_gnc_com_bilibili_app_live_core_api_BiliCommentList) {
        bag.a(eva.a(getApplicationContext()).j(), j, i, j2, i2, i3, bl_gnc_com_bilibili_app_live_core_api_BiliCommentList);
    }

    protected void a(Context context) {
        if (this.a == null) {
            this.a = gnd.a(BiliCommentApiService.class);
        }
    }
}
