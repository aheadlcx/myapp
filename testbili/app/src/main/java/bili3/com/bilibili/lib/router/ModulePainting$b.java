package bili3.com.bilibili.lib.router;

import bl.fjc.a.a;
import bl.fjc.b;
import com.bilibili.bililive.painting.album.post.AlbumPostActivity;
import com.bilibili.bililive.painting.detail.PaintingDetailActivity;
import com.bilibili.bililive.painting.edit.PaintingEditActivity;
import com.bilibili.bililive.painting.edit.PaintingPermissionCheckActivity;
import com.bilibili.bililive.painting.home.ui.PaintingHomeActivity;
import com.sina.weibo.sdk.api.CmdObject;
import java.util.Arrays;

/* compiled from: BL */
class ModulePainting$b extends b {
    public ModulePainting$b() {
        super("activity");
    }

    protected final void a() {
        this.c = new Class[10];
        this.d = new String[10];
        this.c[0] = AlbumPostActivity.class;
        this.d[0] = "activity://painting/creative_center/";
        this.c[1] = PaintingDetailActivity.class;
        this.d[1] = "activity://painting/detail/";
        this.c[2] = PaintingEditActivity.class;
        this.d[2] = "activity://painting/editor/";
        this.c[3] = PaintingHomeActivity.class;
        this.d[3] = "activity://painting/home/";
        this.c[4] = PaintingPermissionCheckActivity.class;
        this.d[4] = "activity://painting/permission/";
        this.c[5] = AlbumPostActivity.class;
        this.d[5] = "activity://pictureshow/creative_center/";
        this.c[6] = PaintingDetailActivity.class;
        this.d[6] = "activity://pictureshow/detail/";
        this.c[7] = PaintingEditActivity.class;
        this.d[7] = "activity://pictureshow/editor/";
        this.c[8] = PaintingHomeActivity.class;
        this.d[8] = "activity://pictureshow/home/";
        this.c[9] = PaintingPermissionCheckActivity.class;
        this.d[9] = "activity://pictureshow/permission/";
        a aVar = this.b;
        r1 = new a[2];
        r1[0] = a.a(-1, 0, "painting", new a[]{a.a(0, 0, "creative_center", new a[0]), a.a(1, 0, "detail", new a[0]), a.a(2, 0, "editor", new a[0]), a.a(3, 0, CmdObject.CMD_HOME, new a[0]), a.a(4, 0, "permission", new a[0])});
        r1[1] = a.a(-1, 0, "pictureshow", new a[]{a.a(5, 0, "creative_center", new a[0]), a.a(6, 0, "detail", new a[0]), a.a(7, 0, "editor", new a[0]), a.a(8, 0, CmdObject.CMD_HOME, new a[0]), a.a(9, 0, "permission", new a[0])});
        aVar.d = Arrays.asList(r1);
    }
}
