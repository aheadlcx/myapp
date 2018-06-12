package bili3.com.bilibili.bililive.videoclipplayer.core.api.entity;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ClipBannerModel {
    @JSONField(name = "cover")
    public String cover;
    @JSONField(name = "description")
    public String description;
    @JSONField(name = "link")
    public String link;
    @JSONField(name = "title")
    public String title;
}
