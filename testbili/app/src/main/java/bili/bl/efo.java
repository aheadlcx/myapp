package bili.bl;

import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.wishbottle.beans.BiliLiveWishBottleBroadcast;

final /* synthetic */ class efo implements Runnable {
    private final efn a;
    private final BiliLiveWishBottleBroadcast b;

    efo(efn bl_efn, BiliLiveWishBottleBroadcast biliLiveWishBottleBroadcast) {
        this.a = bl_efn;
        this.b = biliLiveWishBottleBroadcast;
    }

    public void run() {
        this.a.b(this.b);
    }
}
