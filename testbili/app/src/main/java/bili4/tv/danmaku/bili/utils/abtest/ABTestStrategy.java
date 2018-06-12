package bili4.tv.danmaku.bili.utils.abtest;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class ABTestStrategy {
    @JSONField(name = "desc")
    public String desc;
    @JSONField(name = "id")
    public int id;
    @JSONField(name = "param")
    public String param;
    @JSONField(name = "strategy")
    public String strategy;
    @JSONField(name = "traffic_group")
    public String trafficGroup;
}
