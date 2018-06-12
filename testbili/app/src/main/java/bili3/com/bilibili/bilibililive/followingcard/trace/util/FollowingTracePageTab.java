package bili3.com.bilibili.bilibililive.followingcard.trace.util;

import bl.hae;
import com.bilibili.bilibililive.followingcard.api.entity.FollowingCard;
import com.bilibili.bililive.privateletter.comment.api.BiliCommentList;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveHomePage;
import com.googlecode.mp4parser.boxes.apple.QuicktimeTextSampleEntry;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;

/* compiled from: BL */
public enum FollowingTracePageTab {
    INSTANCE;
    
    private int pageTag;

    public void a(int i) {
        this.pageTag = i;
    }

    public String a() {
        switch (this.pageTag) {
            case -200:
                return FollowingCard.CARD_RECOMMEND;
            case BiliLiveHomePage.MODULE_TYPE_AREA_STD /*9*/:
                return hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 70, (byte) 100, (byte) 119, (byte) 97});
            case BiliCommentList.OID_TYPE_PAINTING /*11*/:
                return QuicktimeTextSampleEntry.TYPE;
            case BiliCommentList.OID_TYPE_ARTICLE /*12*/:
                return hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96});
            case BiliCommentList.OID_TYPE_MUSIC /*14*/:
                return hae.a(new byte[]{(byte) 113, (byte) 106, (byte) 117, (byte) 108, (byte) 102});
            case 32:
            case QQShare.QQ_SHARE_SUMMARY_MAX_LENGTH /*512*/:
                return hae.a(new byte[]{(byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108});
            case 520:
                return hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106});
            case 268435455:
                return "sum";
            default:
                return Constants.VIA_RESULT_SUCCESS;
        }
    }
}
