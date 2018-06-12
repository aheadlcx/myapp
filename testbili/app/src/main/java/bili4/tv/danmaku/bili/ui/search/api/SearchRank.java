package bili4.tv.danmaku.bili.ui.search.api;

import android.support.annotation.Keep;
import bl.loh;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchRank implements loh {
    @JSONField(name = "keyword")
    public String mKeyword;
    @JSONField(name = "status")
    public String mStatus;
    public String trackId;

    public String getTagName() {
        return this.mKeyword;
    }
}
