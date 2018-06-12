package bili2.bl;

import com.bilibili.okretro.GeneralResponse;
import com.bilibili.upper.api.bean.UpperCommentAddResult;
import java.util.Map;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@BaseUrl("http://api.bilibili.com")
/* compiled from: BL */
public interface hbm {
    @FormUrlEncoded
    @POST("/x/v2/reply/del")
    gne<GeneralResponse<Void>> deleteComments(@Field("access_key") String str, @Field("oid") int[] iArr, @Field("type") int i, @Field("rpid") int[] iArr2);

    @FormUrlEncoded
    @POST("/x/v2/reply/hide")
    gne<GeneralResponse<Void>> hideComments(@Field("access_key") String str, @Field("oid") int[] iArr, @Field("type") int i, @Field("rpid") int[] iArr2);

    @FormUrlEncoded
    @POST("/x/v2/reply/action")
    gne<GeneralResponse<Void>> replyActionComments(@Field("access_key") String str, @Field("oid") int i, @Field("type") int i2, @Field("rpid") int i3, @Field("action") int i4);

    @FormUrlEncoded
    @POST("/x/v2/reply/add")
    gne<GeneralResponse<UpperCommentAddResult>> replyAddComments(@Field("access_key") String str, @FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/x/v2/reply/report")
    gne<GeneralResponse<Void>> reportComments(@Field("access_key") String str, @Field("oid") int[] iArr, @Field("type") int i, @Field("rpid") int[] iArr2, @Field("reason") int i2, @Field("content") String str2);

    @FormUrlEncoded
    @POST("/x/v2/reply/show")
    gne<GeneralResponse<Void>> showComments(@Field("access_key") String str, @Field("oid") int[] iArr, @Field("type") int i, @Field("rpid") int[] iArr2);
}
