package bili3.com.mall.domain.order.detail.bean;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.mall.base.BaseModel;
import com.mall.domain.order.bean.OrderExpressDetailVO;
import java.io.Serializable;

@Keep
/* compiled from: BL */
public class OrderDetailExpressBean extends BaseModel implements Serializable {
    @JSONField(name = "vo")
    public OrderExpressDetailVO vo;
}
