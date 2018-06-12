package bili2.bl;

import java.io.File;
import java.util.concurrent.Callable;
import tv.danmaku.bili.ui.theme.api.BiliSkinList;

final /* synthetic */ class lsi implements Callable {
    private final lsh a;
    private final BiliSkinList b;
    private final File c;

    lsi(lsh bl_lsh, BiliSkinList biliSkinList, File file) {
        this.a = bl_lsh;
        this.b = biliSkinList;
        this.c = file;
    }

    public Object call() {
        return this.a.a(this.b, this.c);
    }
}
