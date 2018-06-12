package bili3.com.bilibili.lib.router;

import bl.fjc.a.a;
import bl.fjc.b;
import com.bilibili.app.comm.comment2.comments.view.CommentDetailActivity;
import java.util.Collections;

/* compiled from: BL */
class ModuleComment2$b extends b {
    public ModuleComment2$b() {
        super("activity");
    }

    protected final void a() {
        this.c = new Class[1];
        this.d = new String[1];
        this.c[0] = CommentDetailActivity.class;
        this.d[0] = "activity://comment2/detail/";
        this.b.d = Collections.singletonList(a.a(-1, 0, "comment2", new a[]{a.a(0, 0, "detail", new a[0])}));
    }
}
