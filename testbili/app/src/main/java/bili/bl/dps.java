package bili.bl;

import android.graphics.Bitmap;
import tv.danmaku.videoplayer.basic.adapter.PlayerScreenMode;

final /* synthetic */ class dps implements eus {
    private final dpr a;
    private final PlayerScreenMode b;

    dps(dpr bl_dpr, PlayerScreenMode playerScreenMode) {
        this.a = bl_dpr;
        this.b = playerScreenMode;
    }

    public void a(Bitmap bitmap) {
        this.a.a(this.b, bitmap);
    }
}
