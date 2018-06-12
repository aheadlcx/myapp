package bili.bl;

import com.bilibili.okretro.GeneralResponse;
import retrofit2.http.BaseUrl;
import retrofit2.http.POST;
import retrofit2.http.Query;

@BaseUrl("http://api.bilibili.com")
/* compiled from: BL */
public interface aow {
    @POST("/x/relation/modify")
    gne<GeneralResponse<Void>> changeRelation(@Query("access_key") String str, @Query("fid") long j, @Query("act") int i, @Query("re_src") int i2);
}
