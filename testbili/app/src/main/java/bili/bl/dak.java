package bili.bl;

import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.bililive.painting.api.entity.PaintingItem;
import java.util.List;

/* compiled from: BL */
public class dak {
    @JSONField(name = "has_more")
    public int a;
    @JSONField(name = "next_offset")
    public String b;
    @JSONField(name = "items")
    public List<PaintingItem> c;
}
