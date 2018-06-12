package bili.bl;

import bl.dgs.b;
import com.bilibili.bililive.painting.api.repost.PaintingRepostItem;

final /* synthetic */ class dct implements b {
    private final dcr a;
    private final PaintingRepostItem b;

    dct(dcr bl_dcr, PaintingRepostItem paintingRepostItem) {
        this.a = bl_dcr;
        this.b = paintingRepostItem;
    }

    public void a(int i) {
        this.a.a(this.b, i);
    }
}
