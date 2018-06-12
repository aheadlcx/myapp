package bili3.com.mall.domain.order.detail.bean;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.mall.base.BaseModel;

@Keep
/* compiled from: BL */
public class OrderDetailDataBean extends BaseModel {
    @JSONField(name = "vo")
    public OrderDetailVo vo;
}
