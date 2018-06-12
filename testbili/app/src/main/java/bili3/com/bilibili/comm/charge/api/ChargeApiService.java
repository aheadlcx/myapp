package bili3.com.bilibili.comm.charge.api;

import bl.eqs;
import bl.gne;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.CacheControl;
import com.bilibili.okretro.anno.RequestInterceptor;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("http://elec.bilibili.com")
/* compiled from: BL */
public interface ChargeApiService {
    @FormUrlEncoded
    @RequestInterceptor(eqs.class)
    @POST("/api/can.support.do")
    gne<GeneralResponse<ChargeRankResult>> canSupport(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @RequestInterceptor(eqs.class)
    @POST("/api/add.pay.order.do")
    gne<GeneralResponse<PayOrderResponse>> createPayOrder(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @RequestInterceptor(eqs.class)
    @POST("/api/elec.remark.do")
    gne<GeneralResponse<Void>> elecCommit(@FieldMap Map<String, String> map);

    @RequestInterceptor(eqs.class)
    @Deprecated
    @GET("/api/elec.list.do")
    gne<ChargeTheme> getElecList(@Query("goods_id") int i);

    @GET("/api/query.order.result.do")
    @RequestInterceptor(eqs.class)
    gne<GeneralResponse<ChargeOrderResult>> queryChargeOrderResult(@Query("order_no") String str);

    @GET("/api/query.rank.do")
    @RequestInterceptor(eqs.class)
    gne<GeneralResponse<ChargeRankResult>> queryOrderRank(@QueryMap Map<String, String> map);

    @RequestInterceptor(eqs.class)
    @CacheControl(120000)
    @GET("/api/rank/query/av")
    gne<GeneralResponse<ChargeRankResult>> queryVideoRank(@Query("mid") long j, @Query("av_no") String str);
}
