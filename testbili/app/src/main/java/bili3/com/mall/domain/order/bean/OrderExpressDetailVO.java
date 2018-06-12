package bili3.com.mall.domain.order.bean;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.mall.domain.order.detail.bean.OrderExpressDetail;
import java.util.List;

@Keep
/* compiled from: BL */
public class OrderExpressDetailVO {
    @JSONField(name = "com_v")
    public String com;
    @JSONField(name = "detail")
    public List<OrderExpressDetail> detail;
    @JSONField(name = "id")
    public long id;
    @JSONField(name = "oid")
    public long oid;
    @JSONField(name = "sno")
    public String sno;
    @JSONField(name = "state")
    public String state;
    @JSONField(name = "state_v")
    public String state_v;
    @JSONField(name = "status")
    public int status;
    @JSONField(name = "status_v")
    public String status_v;
    @JSONField(name = "tel")
    public String tel;
}
