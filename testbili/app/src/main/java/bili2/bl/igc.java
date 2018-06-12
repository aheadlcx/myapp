package bili2.bl;

import android.support.annotation.NonNull;
import com.mall.base.BaseModel;
import com.mall.domain.order.detail.bean.OrderDetailExpressBean;
import com.mall.domain.order.pay.OrderPayParamDataBean;

/* compiled from: BL */
public class igc {
    private igk a = ((igk) grc.a(igk.class, ieb.a().b().h()));

    public gne a(final idv<BaseModel> bl_idv_com_mall_base_BaseModel, long j) {
        gne receiptDelay = this.a.receiptDelay(j);
        receiptDelay.a(new iei<BaseModel>(this) {
            final /* synthetic */ igc b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((BaseModel) obj);
            }

            public void a(@NonNull BaseModel baseModel) {
                bl_idv_com_mall_base_BaseModel.a((Object) baseModel);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_base_BaseModel.a(th);
            }
        });
        return receiptDelay;
    }

    public gne b(final idv<BaseModel> bl_idv_com_mall_base_BaseModel, long j) {
        gne receiptConfirm = this.a.receiptConfirm(j);
        receiptConfirm.a(new iei<BaseModel>(this) {
            final /* synthetic */ igc b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((BaseModel) obj);
            }

            public void a(@NonNull BaseModel baseModel) {
                bl_idv_com_mall_base_BaseModel.a((Object) baseModel);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_base_BaseModel.a(th);
            }
        });
        return receiptConfirm;
    }

    public gne c(final idv<BaseModel> bl_idv_com_mall_base_BaseModel, long j) {
        gne cancelOrder = this.a.cancelOrder(j);
        cancelOrder.a(new iei<BaseModel>(this) {
            final /* synthetic */ igc b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((BaseModel) obj);
            }

            public void a(@NonNull BaseModel baseModel) {
                bl_idv_com_mall_base_BaseModel.a((Object) baseModel);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_base_BaseModel.a(th);
            }
        });
        return cancelOrder;
    }

    public gne d(final idv<BaseModel> bl_idv_com_mall_base_BaseModel, long j) {
        gne deleteOrder = this.a.deleteOrder(j);
        deleteOrder.a(new iei<BaseModel>(this) {
            final /* synthetic */ igc b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((BaseModel) obj);
            }

            public void a(@NonNull BaseModel baseModel) {
                bl_idv_com_mall_base_BaseModel.a((Object) baseModel);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_base_BaseModel.a(th);
            }
        });
        return deleteOrder;
    }

    public gne e(final idv<OrderDetailExpressBean> bl_idv_com_mall_domain_order_detail_bean_OrderDetailExpressBean, long j) {
        gne expressDetail = this.a.expressDetail(j);
        expressDetail.a(new iei<OrderDetailExpressBean>(this) {
            final /* synthetic */ igc b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((OrderDetailExpressBean) obj);
            }

            public void a(@NonNull OrderDetailExpressBean orderDetailExpressBean) {
                bl_idv_com_mall_domain_order_detail_bean_OrderDetailExpressBean.a((Object) orderDetailExpressBean);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_domain_order_detail_bean_OrderDetailExpressBean.a(th);
            }
        });
        return expressDetail;
    }

    public gne f(final idv<OrderPayParamDataBean> bl_idv_com_mall_domain_order_pay_OrderPayParamDataBean, long j) {
        gne forPay = this.a.forPay(j, ieb.c(), "3");
        forPay.a(new iei<OrderPayParamDataBean>(this) {
            final /* synthetic */ igc b;

            public /* synthetic */ void b(@NonNull Object obj) {
                a((OrderPayParamDataBean) obj);
            }

            public void a(@NonNull OrderPayParamDataBean orderPayParamDataBean) {
                bl_idv_com_mall_domain_order_pay_OrderPayParamDataBean.a((Object) orderPayParamDataBean);
            }

            public void a(Throwable th) {
                bl_idv_com_mall_domain_order_pay_OrderPayParamDataBean.a(th);
            }
        });
        return forPay;
    }

    public void a(String str, iel bl_iel) {
        iej.a().a(str, bl_iel);
    }
}
