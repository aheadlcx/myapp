package bili2.bl;

import android.support.annotation.NonNull;
import com.mall.domain.order.list.bean.OrderListDataBean;
import com.mall.domain.order.list.bean.OrderListShareDataBean;

/* compiled from: BL */
public class igj {
    igi a;

    public igj() {
        if (this.a == null) {
            this.a = (igi) grc.a(igi.class, ieb.a().b().h());
        }
    }

    public gne a(final idv<OrderListDataBean> bl_idv_com_mall_domain_order_list_bean_OrderListDataBean, int i, int i2, int i3) {
        gne loadList = this.a.loadList(i, i2, i3);
        loadList.a(new iei<OrderListDataBean>(this) {
            final /* synthetic */ igj b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((OrderListDataBean) obj);
            }

            public void a(@NonNull OrderListDataBean orderListDataBean) {
                bl_idv_com_mall_domain_order_list_bean_OrderListDataBean.a((Object) orderListDataBean);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_domain_order_list_bean_OrderListDataBean.a(th);
            }
        });
        return loadList;
    }

    public gne a(final idv<OrderListShareDataBean> bl_idv_com_mall_domain_order_list_bean_OrderListShareDataBean, long j) {
        gne shareParam = this.a.getShareParam(j);
        shareParam.a(new iei<OrderListShareDataBean>(this) {
            final /* synthetic */ igj b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((OrderListShareDataBean) obj);
            }

            public void a(@NonNull OrderListShareDataBean orderListShareDataBean) {
                bl_idv_com_mall_domain_order_list_bean_OrderListShareDataBean.a((Object) orderListShareDataBean);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_domain_order_list_bean_OrderListShareDataBean.a(th);
            }
        });
        return shareParam;
    }
}
