package bili3.com.mall.domain.search.sugBean;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class SearchSugBean {
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "type")
    public int type;
    @JSONField(name = "url")
    public String url;
}
