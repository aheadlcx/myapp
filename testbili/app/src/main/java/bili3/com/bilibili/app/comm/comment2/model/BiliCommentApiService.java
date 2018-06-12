package bili3.com.bilibili.app.comm.comment2.model;

import bl.gne;
import com.bilibili.okretro.GeneralResponse;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@BaseUrl("http://api.bilibili.com")
/* compiled from: BL */
public interface BiliCommentApiService {
    @FormUrlEncoded
    @POST("/x/v2/reply/del")
    gne<GeneralResponse<Void>> delete(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2);

    @FormUrlEncoded
    @POST("/x/v2/reply/hate")
    gne<GeneralResponse<Void>> dislike(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("action") int i2);

    @GET("/x/v2/reply/reply")
    gne<GeneralResponse<BiliCommentDetail>> getCommentDetail(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply")
    gne<GeneralResponse<BiliCommentList>> getCommentList(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/cursor")
    gne<GeneralResponse<BiliCommentCursorList>> getCommentListByCursor(@QueryMap Map<String, String> map);

    @GET("/x/v2/reply/log")
    gne<GeneralResponse<BiliCommentDeleteHistory>> getDeleteLog(@Query("oid") long j, @Query("type") int i, @Query("pn") int i2, @Query("ps") int i3);

    @GET("/x/v2/reply/topics")
    gne<GeneralResponse<BiliCommentTopic>> getTopic(@Query("oid") long j, @Query("type") int i, @Query("mid") long j2, @Query("message") String str);

    @FormUrlEncoded
    @POST("/x/v2/reply/action")
    gne<GeneralResponse<Void>> like(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("action") int i2);

    @FormUrlEncoded
    @POST("/x/v2/reply/add")
    gne<GeneralResponse<BiliCommentAddResult>> postComment(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/x/v2/reply/report")
    gne<GeneralResponse<Void>> report(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("reason") int i2, @Field("content") String str2);

    @FormUrlEncoded
    @POST("/x/v2/reply/top")
    gne<GeneralResponse<Void>> stick(@Field("access_key") String str, @Field("oid") long j, @Field("type") int i, @Field("rpid") long j2, @Field("action") int i2);
}
