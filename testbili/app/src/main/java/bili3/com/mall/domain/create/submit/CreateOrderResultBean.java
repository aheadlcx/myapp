package bili3.com.mall.domain.create.submit;

import android.support.annotation.Keep;
import bl.ige;
import com.alibaba.fastjson.annotation.JSONField;
import com.mall.base.BaseModel;
import com.mall.domain.create.presale.CouponCode;
import com.mall.domain.order.pay.OrderPayParamsBean;
import java.math.BigDecimal;
import java.util.List;

@Keep
/* compiled from: BL */
public class CreateOrderResultBean extends BaseModel {
    @JSONField(name = "benifitTotalMoneyAll")
    public BigDecimal benifitTotalMoneyAll;
    @JSONField(name = "cartOrderType")
    public int cartOrderType;
    @JSONField(name = "cartTotalMoney")
    public BigDecimal cartTotalMoney;
    @JSONField(name = "couponCodeId")
    public String couponCodeId;
    @JSONField(name = "couponCodeList")
    public List<CouponCode> couponCodeList;
    @JSONField(name = "couponDesc")
    public String couponDesc;
    @JSONField(name = "couponListIsShow")
    public int couponListIsShow;
    @JSONField(name = "discountList")
    public List<ige> discountList;
    @JSONField(name = "discountTotalMoneyAll")
    public BigDecimal discountTotalMoneyAll;
    @JSONField(name = "expressTotalMoneyAll")
    public BigDecimal expressTotalMoneyAll;
    @JSONField(name = "invalidList")
    public List<GoodslistItemBean> invalidList;
    @JSONField(name = "itemsTotalMoneyAll")
    public BigDecimal itemsTotalMoneyAll;
    @JSONField(name = "orderId")
    public long orderId;
    @JSONField(name = "payInfo")
    public OrderPayParamsBean payInfo;
    @JSONField(name = "payTotalMoneyAll")
    public BigDecimal payTotalMoneyAll;
    @JSONField(name = "validList")
    public List<GoodslistItemBean> validList;
}
