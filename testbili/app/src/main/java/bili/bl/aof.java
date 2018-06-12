package bili.bl;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import com.bilibili.app.comm.bh.cache.model.BHCacheList;
import com.bilibili.app.comm.bh.cache.model.BHDownloadInfo;
import com.bilibili.okretro.GeneralResponse;
import retrofit2.http.BaseUrl;
import retrofit2.http.GET;
import retrofit2.http.Query;

@BaseUrl("https://api.bilibili.com")
@RestrictTo({Scope.LIBRARY})
/* compiled from: BL */
public interface aof {
    @GET("/offline_package/getstaticmaplist")
    gne<GeneralResponse<BHCacheList>> queryConfigList();

    @GET("/offline_package/getnewstaticmap")
    gne<GeneralResponse<BHDownloadInfo>> queryPackageInfo(@Query("page_id") String str, @Query("version") int i);
}
