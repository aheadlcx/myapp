package bili.bl;

import android.content.Context;
import android.os.SystemClock;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.TextUtils;
import bl.klv.b;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.bilibili.bilibililive.im.api.IMApiService;
import com.bilibili.bilibililive.im.api.LiveApiService;
import com.bilibili.bilibililive.im.api.MainApiService;
import com.bilibili.bilibililive.im.entity.AppNews;
import com.bilibili.bilibililive.im.entity.ChatGroup;
import com.bilibili.bilibililive.im.entity.CreateCheckModel;
import com.bilibili.bilibililive.im.entity.GroupConfig;
import com.bilibili.bilibililive.im.entity.IMReportResult;
import com.bilibili.bilibililive.im.entity.IMSetting;
import com.bilibili.bilibililive.im.entity.JoinApply;
import com.bilibili.bilibililive.im.entity.LastUpMessage;
import com.bilibili.bilibililive.im.entity.LimitStatusModel;
import com.bilibili.bilibililive.im.entity.Money;
import com.bilibili.bilibililive.im.entity.NewGroupInfo;
import com.bilibili.bilibililive.im.entity.PushCardModel;
import com.bilibili.bilibililive.im.entity.SearchInfo;
import com.bilibili.bilibililive.im.entity.SignResult;
import com.bilibili.bilibililive.im.entity.User;
import com.bilibili.bilibililive.im.entity.UserStatus;
import com.bilibili.okretro.BiliApiParseException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import retrofit2.HttpException;

/* compiled from: BL */
public class cde {
    private static IMApiService e() {
        return (IMApiService) gnd.a(IMApiService.class);
    }

    private static cdg f() {
        return (cdg) gnd.a(cdg.class);
    }

    private static LiveApiService g() {
        return (LiveApiService) gnd.a(LiveApiService.class);
    }

    private static MainApiService h() {
        return (MainApiService) gnd.a(MainApiService.class);
    }

    private static <T> gne<T> a(gne<T> bl_gne_T) {
        bl_gne_T.a(new cdh(bl_gne_T.i()));
        return bl_gne_T;
    }

    public static void a(int i, blq<GroupConfig> bl_blq_com_bilibili_bilibililive_im_entity_GroupConfig) {
        a(e().checkCreateGroup(i)).a(bl_blq_com_bilibili_bilibililive_im_entity_GroupConfig);
    }

    public static void a(blq<JSONObject> bl_blq_com_alibaba_fastjson_JSONObject) {
        a(e().checkCreateFriendGroup()).a(bl_blq_com_alibaba_fastjson_JSONObject);
    }

    public static void a(String str, int i, int i2, String str2, String str3, blq<NewGroupInfo> bl_blq_com_bilibili_bilibililive_im_entity_NewGroupInfo) {
        a(e().createNewGroup(str, i, i2, str2, str3)).a(bl_blq_com_bilibili_bilibililive_im_entity_NewGroupInfo);
    }

    public static NewGroupInfo a(String str, int i, int i2, String str2, String str3) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (NewGroupInfo) gnt.b(a(e().createNewGroup(str, i, i2, str2, str3)).g());
    }

    public static void a(long j, int i, blq<JSONObject> bl_blq_com_alibaba_fastjson_JSONObject) {
        a(e().replyJoinGroup(j, i)).a(bl_blq_com_alibaba_fastjson_JSONObject);
    }

    public static JSONObject a(long j, String str, String str2, String str3) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.b(e().updateGroupInfo(j, str, str2, str3).g());
    }

    public static JSONObject a(long j, String str) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.a(e().removeGroupMember(j, str).g());
    }

    public static JSONObject a(long j) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.a(e().disBandGroup(j).g());
    }

    public static void a(long j, long j2, blq<PushCardModel> bl_blq_com_bilibili_bilibililive_im_entity_PushCardModel) {
        e().requestGroupPushcard(j, j2).a(bl_blq_com_bilibili_bilibililive_im_entity_PushCardModel);
    }

    public static JSONObject b(long j) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.a(e().exitGroup(j).g());
    }

    public static void a(String str, String str2, blq<SearchInfo> bl_blq_com_bilibili_bilibililive_im_entity_SearchInfo) {
        a(e().getSearchInfo(str, str2)).a(bl_blq_com_bilibili_bilibililive_im_entity_SearchInfo);
    }

    public static ChatGroup c(long j) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (ChatGroup) gnt.b(a(e().getGroupDetail(j)).g());
    }

    public static void a(long j, long j2, gnc<List<Void>> bl_gnc_java_util_List_java_lang_Void) {
        a(e().assignGroupAdmin(j, j2)).a(bl_gnc_java_util_List_java_lang_Void);
    }

    public static void b(long j, long j2, gnc<List<Void>> bl_gnc_java_util_List_java_lang_Void) {
        a(e().cancelGroupAdmin(j, j2)).a(bl_gnc_java_util_List_java_lang_Void);
    }

    public static JSONObject d(long j) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.b(e().getGroupMember(j).g());
    }

    public static JSONObject a() throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.a(e().reqServerList().g());
    }

    public static JSONObject a(List<Long> list, long j, long j2, long j3) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.b(e().getUserIMDetails(TextUtils.join(",", list), j, j2, j3).g());
    }

    public static JSONObject a(List<Long> list) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.b(e().getUserDetails(TextUtils.join(",", list)).g());
    }

    public static List<User> b(List<Long> list) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (List) gnt.b(e().getUserInfos(TextUtils.join(",", list)).g());
    }

    public static void b(blq<UserStatus> bl_blq_com_bilibili_bilibililive_im_entity_UserStatus) {
        a(e().indentifyUserStatus()).a(bl_blq_com_bilibili_bilibililive_im_entity_UserStatus);
    }

    public static void a(long j, blq<Void> bl_blq_java_lang_Void) {
        a(e().unBindFriend(j)).a(bl_blq_java_lang_Void);
    }

    public static void a(long j, int i, String str, blq<Void> bl_blq_java_lang_Void) {
        a(e().doWithBindFriendApply(j, i, str)).a(bl_blq_java_lang_Void);
    }

    public static void b(long j, blq<JoinApply> bl_blq_com_bilibili_bilibililive_im_entity_JoinApply) {
        a(e().joinGroupV2(j)).a(bl_blq_com_bilibili_bilibililive_im_entity_JoinApply);
    }

    public static JSONObject b() throws BiliApiException, IOException, BiliApiParseException, HttpException {
        return (JSONObject) gnt.b(e().requestUnJoinGroups().g());
    }

    public static void c(blq<List<Long>> bl_blq_java_util_List_java_lang_Long) {
        a(e().getLiveAnchors()).a(bl_blq_java_util_List_java_lang_Long);
    }

    public static JSONObject e(long j) throws BiliApiException, IOException, BiliApiParseException, HttpException {
        return (JSONObject) gnt.b(e().joinGroupWithoutAgree(j).g());
    }

    public static void d(blq<Void> bl_blq_java_lang_Void) {
        a(e().stopGroup()).a(bl_blq_java_lang_Void);
    }

    public static JSONObject f(long j) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONObject) gnt.b(g().getAttentionList(j).g());
    }

    public static void a(int i, int i2, long j, long j2, String str, int i3, String str2, String str3, String str4, String str5, blq<IMReportResult> bl_blq_com_bilibili_bilibililive_im_entity_IMReportResult) {
        a(e().reportChat(i, i2, j, j2, str, i3, str2, str3, str4, str5)).a(bl_blq_com_bilibili_bilibililive_im_entity_IMReportResult);
    }

    public static JSONArray a(int i) throws IOException, BiliApiParseException, HttpException, BiliApiException {
        return (JSONArray) gnt.b(e().setStrangerMessageReceive(i).g());
    }

    public static void b(int i, blq<IMSetting> bl_blq_com_bilibili_bilibililive_im_entity_IMSetting) {
        a(e().getStrangerMessageReceive(i)).a(bl_blq_com_bilibili_bilibililive_im_entity_IMSetting);
    }

    public static void c(long j, blq<LimitStatusModel> bl_blq_com_bilibili_bilibililive_im_entity_LimitStatusModel) {
        a(e().isLimitUser(j, 1)).a(bl_blq_com_bilibili_bilibililive_im_entity_LimitStatusModel);
    }

    public static void d(long j, blq<LimitStatusModel> bl_blq_com_bilibili_bilibililive_im_entity_LimitStatusModel) {
        a(e().isLimitUser(j, 2)).a(bl_blq_com_bilibili_bilibililive_im_entity_LimitStatusModel);
    }

    public static void e(blq<CreateCheckModel> bl_blq_com_bilibili_bilibililive_im_entity_CreateCheckModel) {
        a(e().checkShowCreateGroup()).a(bl_blq_com_bilibili_bilibililive_im_entity_CreateCheckModel);
    }

    public static void f(blq<AppNews> bl_blq_com_bilibili_bilibililive_im_entity_AppNews) {
        a(g().getAppNews(4, 606)).a(bl_blq_com_bilibili_bilibililive_im_entity_AppNews);
    }

    public static void e(long j, blq<JSONObject> bl_blq_com_alibaba_fastjson_JSONObject) {
        a(e().getAvailableGroup(j)).a(bl_blq_com_alibaba_fastjson_JSONObject);
    }

    public static void f(long j, blq<Money> bl_blq_com_bilibili_bilibililive_im_entity_Money) {
        a(g().getMyMoneyInfo("coin")).a(bl_blq_com_bilibili_bilibililive_im_entity_Money);
    }

    public static void a(long j, String str, blq<Void> bl_blq_java_lang_Void) {
        a(e().buyMedal(j, str)).a(bl_blq_java_lang_Void);
    }

    public static void b(long j, long j2, blq<SignResult> bl_blq_com_bilibili_bilibililive_im_entity_SignResult) {
        a(e().sign(j, j2)).a(bl_blq_com_bilibili_bilibililive_im_entity_SignResult);
    }

    public static JSONObject c() throws IOException, BiliApiParseException, BiliApiException, HttpException {
        return (JSONObject) gnt.b(e().requestBilibiliAccount().g());
    }

    public static List<Long> d() throws IOException, BiliApiParseException, BiliApiException, HttpException {
        return (List) gnt.b(h().requestSpecialFollow().g());
    }

    public static void g(long j, blq<Void> bl_blq_java_lang_Void) {
        a(h().setSpecialFollow(j)).a(bl_blq_java_lang_Void);
    }

    public static void h(long j, blq<Void> bl_blq_java_lang_Void) {
        a(h().cancelSpecialFollow(j)).a(bl_blq_java_lang_Void);
    }

    public static void g(blq<LastUpMessage> bl_blq_com_bilibili_bilibililive_im_entity_LastUpMessage) {
        a(f().getLastUpMessage()).a(bl_blq_com_bilibili_bilibililive_im_entity_LastUpMessage);
    }

    public static void b(long j, int i, blq<Void> bl_blq_java_lang_Void) {
        a(f().deleteNotify(j, i)).a(bl_blq_java_lang_Void);
    }

    public static JSONObject a(klz bl_klz, klz bl_klz2, String str, b bVar) throws IOException, BiliApiParseException, BiliApiException {
        return (JSONObject) gnt.b(e().uploadSyncImage(bl_klz, bl_klz2, str, bVar).g());
    }

    public static String a(Context context, File file) throws IOException, BiliApiException, BiliApiParseException {
        return a(klz.a(klu.a(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 117, (byte) 100, (byte) 119, (byte) 113, (byte) 42, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 40, (byte) 97, (byte) 100, (byte) 113, (byte) 100})), BuildConfig.VERSION_NAME + SystemClock.elapsedRealtime()), klz.a(klu.a(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 117, (byte) 100, (byte) 119, (byte) 113, (byte) 42, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 40, (byte) 97, (byte) 100, (byte) 113, (byte) 100})), BuildConfig.VERSION_NAME + System.currentTimeMillis()), eva.a(context).j(), b.a(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 112, (byte) 117}), file.getName(), klz.a(klu.a(hae.a(new byte[]{(byte) 104, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 117, (byte) 100, (byte) 119, (byte) 113, (byte) 42, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 40, (byte) 97, (byte) 100, (byte) 113, (byte) 100})), file))).l(hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 112, (byte) 119, (byte) 105}));
    }
}
