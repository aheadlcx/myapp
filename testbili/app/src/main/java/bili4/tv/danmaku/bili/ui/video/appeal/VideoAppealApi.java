package bili4.tv.danmaku.bili.ui.video.appeal;

import bl.gne;
import bl.gnp;
import bl.klv.b;
import bl.klz;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

@BaseUrl("http://app.bilibili.com")
/* compiled from: BL */
public interface VideoAppealApi {
    @FormUrlEncoded
    @POST("/x/v2/view/report/add")
    gne<GeneralResponse<Void>> add(@Field("mid") long j, @Field("access_key") String str, @Field("aid") String str2, @Field("type") String str3, @Field("reason") String str4, @Field("pics") String str5);

    @Multipart
    @RequestInterceptor(gnp.class)
    @POST("/x/v2/view/report/upload")
    gne<JSONObject> appealImageUpload(@Query("access_key") String str, @Part("aid") klz bl_klz, @Part("mid") klz bl_klz2, @Part b bVar);

    @GET("/x/v2/view/report")
    gne<GeneralResponse<List<BiliVideoAppeal>>> init(@Query("mid") long j, @Query("access_key") String str, @Query("aid") String str2);
}
