package bili3.com.bilibili.bilibililive.bililivefollowing.api;

import bl.bmm;
import bl.bmo;
import bl.bmp;
import bl.btv;
import bl.gne;
import bl.klv;
import bl.kmb;
import com.bilibili.bilibililive.bililivefollowing.api.entity.ClipVideoCreateInfo;
import com.bilibili.bilibililive.bililivefollowing.api.entity.FollowStatus;
import com.bilibili.bilibililive.bililivefollowing.api.entity.FollowingDetailInfo;
import com.bilibili.bilibililive.bililivefollowing.api.entity.FollowingLikeState;
import com.bilibili.bilibililive.bililivefollowing.api.entity.FollowingTypeInfo;
import com.bilibili.bilibililive.bililivefollowing.api.entity.ImagePublishResponse;
import com.bilibili.bilibililive.bililivefollowing.api.entity.ReportResult;
import com.bilibili.bilibililive.bililivefollowing.api.entity.response.AttentionResp;
import com.bilibili.bilibililive.bililivefollowing.api.entity.response.FollowingUploadImageResponse;
import com.bilibili.bilibililive.bililivefollowing.api.entity.response.RcmdTopicResp;
import com.bilibili.bilibililive.bililivefollowing.api.entity.response.TopicSearchResp;
import com.bilibili.bilibililive.bililivefollowing.api.entity.response.TransmitResp;
import com.bilibili.bilibililive.bililivefollowing.api.entity.response.UserSearchResp;
import com.bilibili.bilibililive.bililivefollowing.detail.repost.RepostListData;
import com.bilibili.bilibililive.followingcard.api.entity.FollowingInfo;
import com.bilibili.bilibililive.followingcard.api.entity.LiveContent;
import com.bilibili.bilibililive.followingcard.api.entity.NotificationInfo;
import com.bilibili.bilibililive.followingcard.api.entity.RecommendFollowingInfo;
import com.bilibili.bilibililive.followingcard.api.entity.TopicFollowingInfo;
import com.bilibili.bilibililive.followingcard.api.entity.cardBean.FollowingDramaResponse;
import com.bilibili.bilibililive.followingcard.api.entity.cardBean.FollowingTopic;
import com.bilibili.bilibililive.followingcard.api.entity.cardBean.HotTopic;
import com.bilibili.bilibililive.followingcard.api.entity.cardBean.TopicCard;
import com.bilibili.okretro.BaseResponse;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.okretro.anno.RequestInterceptor;
import java.util.List;
import retrofit2.http.BaseUrl;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

@BaseUrl("https://api.vc.bilibili.com")
/* compiled from: BL */
public interface FollowingApiService {
    @FormUrlEncoded
    @RequestInterceptor(bmo.class)
    @POST("/dynamic_repost/v1/dynamic_repost/pre_judge")
    gne<GeneralResponse<btv>> checkUserEnable(@Field("uid") long j, @Field("dynamic_id") long j2, @Field("content") String str);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_repost/v1/dynamic_repost/rm_rp_dyn")
    gne<GeneralResponse<bmm>> delete(@Field("uid") long j, @Field("dynamic_id") long j2);

    @GET("/clip/v1/video/uploadCompleteV2")
    @RequestInterceptor(bmo.class)
    gne<kmb> finishCompleteUpload(@Query("video_id") int i, @Query("upos_uri") String str);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_like/v1/dynamic_like/attention")
    gne<GeneralResponse<List<Void>>> followRecommendUser(@Field("uid") long j, @Field("dynamic_id") long j2);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("https://api.live.bilibili.com/feed/v1/feed/follow")
    gne<GeneralResponse<List<Void>>> followUser(@Field("uid") long j, @Field("follow") long j2, @Field("re_src") int i);

    @FormUrlEncoded
    @RequestInterceptor(bmo.class)
    @POST("/bplus_report/v1/Report/add")
    gne<BaseResponse> followingReport(@Field("biz_code") int i, @Field("module") int i2, @Field("accused_uid") long j, @Field("object_id") long j2, @Field("reason_type") int i3, @Field("reason_desc") String str);

    @GET("http://api.live.bilibili.com/feed_svr/v1/feed_svr/get_user_info")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<AttentionResp>> getAttentionUserInfo(@Query("page") int i, @Query("pagesize") int i2);

    @GET("http://bangumi.bilibili.com/api/mydynamic_follows")
    @RequestInterceptor(bmp.class)
    gne<FollowingDramaResponse> getFollowDrama(@Query("page") int i, @Query("pagesize") int i2);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_svr/v1/dynamic_svr/get_dynamic_detail")
    gne<GeneralResponse<FollowingDetailInfo>> getFollowInfo(@Field("uid") long j, @Field("dynamic_id") long j2, @Query("qn") int i);

    @GET("/topic_svr/v1/topic_svr/topic_history")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<FollowingInfo>> getHistoricTopicList(@Query("device_id") String str, @Query("topic_name") String str2, @Query("offset_dynamic_id") long j);

    @GET("dynamic_svr/v1/dynamic_svr/dynamic_history?rsp_type=2")
    @RequestInterceptor(bmo.class)
    gne<GeneralResponse<FollowingInfo>> getHistoryFollowingInfo(@Query("uid") long j, @Query("offset_dynamic_id") long j2, @Query("type") int i, @Query("qn") int i2, @Query("page") int i3);

    @GET("/topic/v1/topic/hots")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<HotTopic>> getHotTopic();

    @GET("https://api.live.bilibili.com/feed/v1/feed/getList")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<LiveContent>> getLiveList(@Query("page") int i, @Query("pagesize") int i2);

    @GET("/dynamic_topic/v1/topic/getTopTopics")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<TopicCard>> getMyTopic();

    @GET("/dynamic_svr/v1/dynamic_svr/dynamic_new?rsp_type=1&type=268435455")
    @RequestInterceptor(bmo.class)
    gne<GeneralResponse<FollowingInfo>> getNewFollowingCount(@Query("uid") long j, @Query("update_num_dy_id") long j2);

    @GET("/dynamic_svr/v1/dynamic_svr/dynamic_new?rsp_type=2")
    @RequestInterceptor(bmo.class)
    gne<GeneralResponse<FollowingInfo>> getNewFollowingInfo(@Query("uid") long j, @Query("type") int i, @Query("update_num_dy_id") long j2, @Query("qn") int i2);

    @GET("/topic_svr/v1/topic_svr/topic_new")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<TopicFollowingInfo>> getNewTopicList(@Query("device_id") String str, @Query("topic_name") String str2);

    @GET("https://api.live.bilibili.com/app_news/v1/News/current?biz_code=7&module=1201")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<NotificationInfo>> getNotification();

    @GET("/topic_svr/v1/topic_svr/get_rcmd_topic")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<RcmdTopicResp>> getRcmdTopic();

    @GET("/dynamic_svr/v1/dynamic_svr/recommend")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<RecommendFollowingInfo>> getRecommendFollowingInfo(@Query("uid") long j, @Query("page") int i, @Query("qn") int i2);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_repost/v1/dynamic_repost/view_repost")
    gne<GeneralResponse<RepostListData>> getRepostList(@Field("uid") long j, @Field("dynamic_id") long j2, @Field("offset") int i);

    @GET("/dynamic_tab/v1/dynamic_tab/get_configure?tab_version=3")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<FollowingTypeInfo>> getTabInfo(@Query("uid") long j);

    @GET("/dynamic_svr/v1/dynamic_svr/space_history")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<RecommendFollowingInfo>> getUserFollowingInfo(@Query("visitor_uid") long j, @Query("host_uid") long j2, @Query("offset_dynamic_id") long j3, @Query("qn") int i, @Query("page") int i2);

    @GET
    gne<kmb> initNewClipVideo(@Url String str);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_like/v1/dynamic_like/thumb")
    gne<GeneralResponse<FollowingLikeState>> like(@Field("uid") long j, @Field("dynamic_id") long j2, @Field("type") int i, @Field("rid") long j3, @Field("spec_type") int i2, @Field("up") int i3);

    @FormUrlEncoded
    @RequestInterceptor(bmo.class)
    @POST("/clip/v1/video/createV2")
    gne<GeneralResponse<ClipVideoCreateInfo>> newVideoClip(@Field("title") String str, @Field("description") String str2, @Field("cover_url") String str3, @Field("tag") String str4, @Field("cfrom") int i, @Field("at_uids") String str5, @Field("at_control") String str6, @Field("lontitude") float f, @Field("latitude") float f2, @Field("rnd") String str7, @Field("source") int i2);

    @POST("/dynamic_like/v1/dynamic_like/no_interest")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<RecommendFollowingInfo>> notInterest(@Query("uid") long j, @Query("dynamic_id") long j2);

    @FormUrlEncoded
    @RequestInterceptor(bmo.class)
    @POST("/link_draw/v1/doc/create")
    gne<GeneralResponse<ImagePublishResponse>> publishImageFollowing(@Field("category") int i, @Field("tags") String str, @Field("pictures") String str2, @Field("description") String str3, @Field("setting") String str4, @Field("at_uids") String str5, @Field("at_control") String str6, @Field("jumpfrom") int i2);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_report/v1/dynamic_report/rcmd_report")
    gne<kmb> recommendReport(@Field("report_type") int i, @Field("uid") long j, @Field("dynamic_id") long j2, @Field("count") int i2);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/report_service/v1/Report/add")
    gne<GeneralResponse<ReportResult>> report(@Field("biz_code") int i, @Field("module") int i2, @Field("accused_uid") long j, @Field("object_id") long j2, @Field("ip") String str, @Field("reason_type") int i3, @Field("reason_desc") String str2, @Field("comment") String str3, @Field("extra") String str4);

    @FormUrlEncoded
    @RequestInterceptor(bmo.class)
    @POST("/dynamic_repost/v1/dynamic_repost/repost")
    gne<GeneralResponse<TransmitResp>> repostFollowing(@Field("uid") long j, @Field("dynamic_id") long j2, @Field("type") int i, @Field("rid") long j3, @Field("content") String str, @Field("ctrl") String str2, @Field("at_uids") String str3, @Field("spec_type") int i2, @Field("repost_code") long j4);

    @GET("/dynamic_topic/v1/topic/followTopics")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<FollowingTopic>> requestFollowTopic(@Query("size") int i, @Query("page") int i2);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_topic/v1/topic/setTopTopic")
    gne<GeneralResponse<Void>> setTopTopic(@Field("top_list") String str);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("/dynamic_repost/v1/dynamic_repost/share")
    gne<GeneralResponse<TransmitResp>> shareRepostFollowing(@Field("uid") long j, @Field("type") int i, @Field("rid") long j2, @Field("share_uid") long j3, @Field("content") String str, @Field("ctrl") String str2, @Field("at_uids") String str3, @Field("repost_code") long j4, @Field("sketch") String str4);

    @GET("/dynamic_topic/v1/Topic/search")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<TopicSearchResp>> topicSearch(@Query("s") String str);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("https://api.live.bilibili.com/feed/v1/feed/unfollow")
    gne<GeneralResponse<List<Void>>> unfollowUser(@Field("uid") long j, @Field("follow") long j2, @Field("re_src") int i);

    @FormUrlEncoded
    @RequestInterceptor(bmp.class)
    @POST("http://api.live.bilibili.com/feed/v1/feed/isFollowed")
    gne<GeneralResponse<FollowStatus>> upIsFollowed(@Field("follow") long j);

    @POST("/api/v1/drawImage/upload")
    @RequestInterceptor(bmo.class)
    gne<GeneralResponse<FollowingUploadImageResponse>> uploadFollowingImages(@Body klv bl_klv);

    @FormUrlEncoded
    @RequestInterceptor(bmo.class)
    @POST("/clip/v1/video/videoAlert")
    gne<GeneralResponse<List<Void>>> uploadVideoAlert(@Field("vid") int i, @Field("type") int i2, @Field("url") String str, @Field("info") String str2);

    @GET("https://app.bilibili.com/x/v2/search/user")
    @RequestInterceptor(bmp.class)
    gne<GeneralResponse<UserSearchResp>> userSearch(@Query("keyword") String str, @Query("highlight") int i, @Query("user_type") int i2, @Query("order") String str2, @Query("order_sort") int i3, @Query("from_source") String str3, @Query("pn") int i4, @Query("ps") int i5);
}
