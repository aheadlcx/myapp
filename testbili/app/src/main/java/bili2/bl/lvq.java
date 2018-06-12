package bili2.bl;

import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;

/* compiled from: BL */
class lvq extends mfd {
    lvq() {
    }

    public void onCompletion(IMediaPlayer iMediaPlayer) {
        super.onCompletion(iMediaPlayer);
        c(false);
    }

    private void c(boolean z) {
        PlayerParams au = au();
        if (au != null && au.c != null) {
            int i = au.c.g().mPage;
            int b = aq().b(z);
            ResolveResourceParams[] h = au.c.h();
            if (h != null && b < h.length && b > -1) {
                c(10001, new Object[]{Integer.valueOf(i), Integer.valueOf(b + 1)});
            }
        }
    }
}
