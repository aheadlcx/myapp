package bili3.com.bilibili.lib.router;

import bl.fjc.a.a;
import bl.fjc.b;
import com.mall.base.context.MallDispatcherActivity;
import java.util.Collections;

/* compiled from: BL */
class ModuleMall$c extends b {
    public ModuleMall$c() {
        super("http");
    }

    protected final void a() {
        this.c = new Class[1];
        this.d = new String[1];
        this.c[0] = MallDispatcherActivity.class;
        this.d[0] = "http://show.bilibili.com/";
        this.b.d = Collections.singletonList(a.a(0, 0, "show.bilibili.com", new a[0]));
    }
}
