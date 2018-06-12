package bili3.com.mall.domain.shop.discovery.bean;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.mall.base.BaseModel;
import java.io.Serializable;

@Keep
/* compiled from: BL */
public class DiscoveryBean extends BaseModel implements Serializable {
    @JSONField(name = "vo")
    public ShopDiscoveryVoBean vo;
}
