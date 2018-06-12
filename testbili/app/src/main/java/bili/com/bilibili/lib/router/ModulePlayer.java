package bili.com.bilibili.lib.router;

import bl.fjc;
import bl.fjh;

/* compiled from: BL */
public final class ModulePlayer extends fjc {
    final fjh[] routeTables = new fjh[1];

    public ModulePlayer() {
        super("player", -1, null);
        this.routeTables[0] = new a();
    }

    protected fjh tableOf(String str) {
        if ("action".equals(str)) {
            return this.routeTables[0];
        }
        return null;
    }
}
