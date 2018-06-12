package bili2.bl;

import java.io.File;
import tv.danmaku.bili.update.UpdateService;

public final /* synthetic */ class maw implements pr {
    private final UpdateService a;
    private final File b;
    private final File c;

    public maw(UpdateService updateService, File file, File file2) {
        this.a = updateService;
        this.b = file;
        this.c = file2;
    }

    public Object a(ps psVar) {
        return this.a.a(this.b, this.c, psVar);
    }
}
