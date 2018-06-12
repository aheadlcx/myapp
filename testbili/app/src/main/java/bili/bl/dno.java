package bili.bl;

import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;

/* compiled from: BL */
public class dno {
    public static PlayerParams a(int i) {
        PlayerParams a = czm.a();
        ResolveResourceParams g = a.c.g();
        g.mFrom = "live";
        g.mCid = i;
        g.mStartPlayTime = 0;
        return a;
    }
}
