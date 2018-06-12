package bili3.com.bilibili.column.api.service;

import bl.eni;
import bl.gne;
import com.bilibili.column.api.Column.Category;
import com.bilibili.column.api.ColumnArticleList;
import com.bilibili.column.api.ColumnGuide;
import com.bilibili.column.api.ColumnRank;
import com.bilibili.column.api.ColumnRankCategory;
import com.bilibili.column.api.response.ColumnAuthorList;
import com.bilibili.column.api.response.ColumnDetailData;
import com.bilibili.column.api.response.ColumnDetailUserInfo;
import com.bilibili.column.api.response.ColumnFavoriteData;
import com.bilibili.column.api.response.ColumnHomeTabData;
import com.bilibili.column.api.response.ColumnHotSpotsData;
import com.bilibili.column.api.response.ColumnRecommendData;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.CacheControl;
import com.bilibili.okretro.anno.RequestInterceptor;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@BaseUrl("https://api.bilibili.com")
/* compiled from: BL */
public interface ColumnApiService {
    @FormUrlEncoded
    @POST("/x/article/favorites/add")
    gne<GeneralResponse<Void>> add(@Field("access_key") String str, @Field("id") long j);

    @FormUrlEncoded
    @POST("/x/article/addshare")
    gne<GeneralResponse<Void>> addShare(@Field("access_key") String str, @Field("id") long j);

    @FormUrlEncoded
    @POST("/x/article/complaints")
    gne<GeneralResponse<Void>> doReport(@Query("access_key") String str, @Field("aid") int i, @Field("cid") int i2, @Field("images") String str2, @Field("reason") String str3);

    @CacheControl(3600000)
    @GET("/x/article/categories")
    gne<GeneralResponse<List<Category>>> getArticleCategories();

    @GET("x/article/list/articles")
    gne<GeneralResponse<ColumnArticleList>> getArticleCollection(@Query("access_key") String str, @Query("id") String str2);

    @Deprecated
    @GET("/x/article/view")
    gne<ColumnDetailData> getArticleDetail(@Query("access_key") String str, @Query("id") long j);

    @GET("/x/article/viewinfo")
    @RequestInterceptor(eni.class)
    gne<ColumnDetailUserInfo> getArticleDetailUserInfo(@Query("access_key") String str, @Query("id") long j, @Query("from") String str2);

    @Deprecated
    @GET("/x/article/favorites/list")
    gne<GeneralResponse<ColumnFavoriteData>> getArticleList(@Query("access_key") String str, @Query("pn") int i, @Query("ps") int i2);

    @Deprecated
    @GET("http://app.bilibili.com/x/v2/space/article")
    gne<GeneralResponse<ColumnAuthorList>> getArticleList(@Query("access_key") String str, @Query("vmid") long j, @Query("pn") int i, @Query("ps") int i2);

    @GET("/x/article/recommends")
    gne<ColumnRecommendData> getArticleRecommends(@Query("access_key") String str, @Query("cid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str2, @Query("sort") int i4, @Query("from") int i5);

    @GET("/x/article/recommends/plus")
    gne<ColumnHomeTabData> getArticleRecommendsPlus(@Query("access_key") String str, @Query("cid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str2, @Query("sort") int i4, @Query("from") int i5);

    @GET("x/article/user/notice")
    gne<GeneralResponse<ColumnGuide>> getGuide(@Query("access_key") String str);

    @GET("/x/article/home")
    gne<ColumnHomeTabData> getHomeTab(@Query("access_key") String str, @Query("cid") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str2);

    @GET("x/article/hotspots")
    gne<ColumnHotSpotsData> getHotSpots(@Query("id") int i, @Query("pn") int i2, @Query("ps") int i3, @Query("aids") String str, @Query("sort") int i4);

    @GET("/x/article/rank/categories")
    gne<GeneralResponse<List<ColumnRankCategory>>> getRankCategories();

    @GET("/x/article/rank/list")
    gne<GeneralResponse<List<ColumnRank>>> getRankList(@Query("access_key") String str, @Query("cid") String str2);

    @FormUrlEncoded
    @POST("/x/article/like")
    gne<GeneralResponse<Void>> like(@Query("access_key") String str, @Field("id") long j, @Field("type") int i);

    @FormUrlEncoded
    @POST("/x/relation/modify")
    gne<GeneralResponse<Void>> modify(@Query("access_key") String str, @Field("fid") long j, @Field("act") int i, @Field("re_src") int i2);

    @FormUrlEncoded
    @POST("/x/article/favorites/del")
    gne<GeneralResponse<Void>> remove(@Field("access_key") String str, @Field("id") long j);

    @GET("/x/article/addview")
    gne<GeneralResponse<Void>> reportArticleDetail(@Query("access_key") String str, @Query("page") String str2, @Query("from") String str3);

    @FormUrlEncoded
    @POST("x/article/user/notice/update")
    gne<GeneralResponse<Void>> updateGuide(@Query("access_key") String str, @Field("type") String str2);
}
