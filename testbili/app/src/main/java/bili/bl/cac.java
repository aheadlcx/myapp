package bili.bl;

import android.support.annotation.NonNull;
import android.support.graphics.drawable.animated.BuildConfig;
import android.view.ViewGroup;
import com.bilibili.bilibililive.followingcard.api.entity.AtIndex;
import com.bilibili.bilibililive.followingcard.api.entity.FollowingCard;
import com.bilibili.bilibililive.followingcard.api.entity.cardBean.VideoClipCard;
import com.bilibili.bilibililive.followingcard.trace.util.FollowingTracePageTab;
import com.bilibili.bilibililive.followingcard.trace.util.FollowingTraceStatus;
import java.util.List;

/* compiled from: BL */
public class cac extends bwb<VideoClipCard, cad, cae> {
    private static final String e = hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 100, (byte) 108, (byte) 107, (byte) 96, (byte) 119});

    protected /* synthetic */ List b(@NonNull Object obj) {
        return a((VideoClipCard) obj);
    }

    protected /* synthetic */ bwt c() {
        return b();
    }

    protected /* synthetic */ bws d() {
        return a();
    }

    public cac(bvj bl_bvj, int i) {
        super(bl_bvj, i);
    }

    protected cad a() {
        return new cad();
    }

    protected cae b() {
        return new cae(this.g, this.b);
    }

    protected void a(@NonNull FollowingCard<VideoClipCard> followingCard, @NonNull ccn bl_ccn, @NonNull List<Object> list) {
        ViewGroup viewGroup = (ViewGroup) bl_ccn.a.findViewWithTag(hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 100, (byte) 108, (byte) 107, (byte) 96, (byte) 119}));
        if (viewGroup != null) {
            viewGroup.setId(e(bl_ccn));
        }
        if (list.isEmpty() || ((Integer) list.get(0)).intValue() != 4 || followingCard.isFake) {
            super.a((FollowingCard) followingCard, bl_ccn, (List) list);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) bl_ccn.a.findViewWithTag(hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 100, (byte) 108, (byte) 107, (byte) 96, (byte) 119}));
        if (viewGroup2 != null && followingCard.cardInfo != null) {
            ((cae) this.d).a(this.a, viewGroup2, ((cad) this.c).a((VideoClipCard) followingCard.cardInfo, this.b), bl_ccn, (VideoClipCard) followingCard.cardInfo);
            cbk.a(hae.a(new byte[]{(byte) 97, (byte) 113, (byte) 90, (byte) 102, (byte) 100, (byte) 119, (byte) 97, (byte) 90, (byte) 115, (byte) 102, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124}), "vc", followingCard.getTraceTitle(), String.valueOf(followingCard.getBusinessId()), cbm.a(followingCard.getCardType()), String.valueOf(followingCard.getDynamicId()), FollowingTracePageTab.INSTANCE.a(), FollowingTraceStatus.INSTANCE.a(), followingCard.traceMark(), "1", BuildConfig.VERSION_NAME);
        }
    }

    protected List<AtIndex> a(@NonNull VideoClipCard videoClipCard) {
        if (videoClipCard.item != null) {
            return videoClipCard.item.atControl;
        }
        return null;
    }

    protected void b(ccn bl_ccn) {
        super.b(bl_ccn);
        if (e(bl_ccn) == cbb.a().b()) {
            cbb.a().e();
        }
    }

    protected void c(@NonNull ccn bl_ccn) {
        super.c(bl_ccn);
        if (e(bl_ccn) == cbb.a().b()) {
            cbb.a().c();
        }
    }

    protected void a(boolean z, @NonNull FollowingCard<VideoClipCard> followingCard) {
        super.a(z, (FollowingCard) followingCard);
        cbf.a(this.a, followingCard.getBusinessId(), z, 102);
    }

    private int e(@NonNull ccn bl_ccn) {
        return bl_ccn.g() + 10000;
    }
}
