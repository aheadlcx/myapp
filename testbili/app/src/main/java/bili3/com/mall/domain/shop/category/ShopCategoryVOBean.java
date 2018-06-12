package bili3.com.mall.domain.shop.category;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.mall.domain.shop.ShopVoBaseDataBean;
import com.mall.domain.shop.home.ShopHomeGoodsBean;
import java.util.List;

@Keep
/* compiled from: BL */
public class ShopCategoryVOBean extends ShopVoBaseDataBean {
    @JSONField(name = "searchFilter")
    public List<ShopSearchFilterBean> filters;
    @JSONField(name = "product")
    public List<ShopHomeGoodsBean> goods;
    @JSONField(name = "numPages")
    public int numPages;
    @JSONField(name = "totalNum")
    public int totalNum;
}
