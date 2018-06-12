package bili3.com.bilibili.lib.router;

import bl.fjc.a.a;
import bl.fjc.b;
import com.bilibili.bililive.painting.api.entity.PaintingItem;
import com.bilibili.bililive.painting.detail.PaintingDetailActivity;
import com.bilibili.bililive.painting.edit.PaintingEditActivity;
import com.bilibili.bililive.painting.home.ui.PaintingHomeActivity;
import java.util.Collections;

/* compiled from: BL */
class ModulePainting$c extends b {
    public ModulePainting$c() {
        super("http");
    }

    protected final void a() {
        this.c = new Class[6];
        this.d = new String[6];
        this.c[0] = PaintingEditActivity.class;
        this.d[0] = "http://h.bilibili.com/eden/publish/cos/";
        this.c[1] = PaintingEditActivity.class;
        this.d[1] = "http://h.bilibili.com/eden/publish/daily/";
        this.c[2] = PaintingEditActivity.class;
        this.d[2] = "http://h.bilibili.com/eden/publish/draw/";
        this.c[3] = PaintingDetailActivity.class;
        this.d[3] = "http://h.bilibili.com/ywh/h5/:extro_doc_id/";
        this.c[4] = PaintingHomeActivity.class;
        this.d[4] = "http://h.bilibili.com/ywh/h5/index/";
        this.c[5] = PaintingHomeActivity.class;
        this.d[5] = "http://h.bilibili.com/ywh/m/index/";
        a aVar = this.b;
        a[] aVarArr = new a[2];
        a[] aVarArr2 = new a[1];
        aVarArr2[0] = a.a(-1, 0, "publish", new a[]{a.a(0, 0, PaintingItem.CATEGORY_COS, new a[0]), a.a(1, 0, "daily", new a[0]), a.a(2, 0, PaintingItem.CATEGORY_DRAW, new a[0])});
        aVarArr[0] = a.a(-1, 0, "eden", aVarArr2);
        aVarArr2 = new a[2];
        aVarArr2[0] = a.a(3, 0, "h5", new a[]{a.a(4, 0, "index", new a[0])});
        aVarArr2[1] = a.a(-1, 0, "m", new a[]{a.a(5, 0, "index", new a[0])});
        aVarArr[1] = a.a(-1, 0, "ywh", aVarArr2);
        aVar.d = Collections.singletonList(a.a(-1, 0, "h.bilibili.com", aVarArr));
    }
}
