package bili4.tv.danmaku.bili.ui.theme.api;

import bl.gne;
import bl.lso;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@BaseUrl("http://club.bilibili.com")
/* compiled from: BL */
public interface BiliThemeApiService {
    @FormUrlEncoded
    @RequestInterceptor(lso.class)
    @POST("/api/add.skin.order.do")
    gne<GeneralResponse<OrderResult>> addOrder(@Query("access_key") String str, @Field("id") int i);

    @FormUrlEncoded
    @RequestInterceptor(lso.class)
    @POST("/api/cancel.skin.order.do")
    gne<GeneralResponse<OrderResult>> cancelOrder(@Query("access_key") String str, @Field("id") int i);

    @GET("/api/query.skin.list.do")
    @RequestInterceptor(lso.class)
    gne<BiliSkinList> getThemeList(@Query("access_key") String str);

    @FormUrlEncoded
    @RequestInterceptor(lso.class)
    @POST("/api/renew.skin.order.do")
    gne<GeneralResponse<OrderResult>> renew(@Query("access_key") String str, @Field("id") int i);
}
