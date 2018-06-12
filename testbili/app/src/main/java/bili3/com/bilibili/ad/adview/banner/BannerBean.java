package bili3.com.bilibili.ad.adview.banner;

import android.support.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.feed.model.BaseInfoItem;
import com.bilibili.ad.adview.feed.model.FeedExtra;

/* compiled from: BL */
public class BannerBean extends BaseInfoItem {
    @Nullable
    @JSONField(name = "extra")
    public FeedExtra a;
}
