package bili4.com.tencent.stat;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.mid.api.MidService;
import com.tencent.stat.common.DeviceInfo;
import com.tencent.stat.common.StatCommonHelper;
import com.tencent.stat.common.StatConstants;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.common.StatPreferences;
import com.tencent.stat.common.Util;
import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.frontia.BuildConfig;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import u.aly.bj;
import u.aly.j;

public class StatConfig {
    private static HashSet<String> A = new HashSet();
    private static int B = 100000;
    private static int C = 30;
    private static int D = 10;
    private static int E = 100;
    private static int F = 30;
    private static int G = 1;
    private static String H = null;
    private static String I;
    private static String J;
    private static String K = "mta_channel";
    private static int L = 180;
    private static String M;
    private static int N = 1024;
    private static long O = 0;
    private static long P = 300000;
    private static volatile String Q = StatConstants.MTA_REPORT_FULL_URL;
    private static int R = 0;
    private static volatile int S = 0;
    private static int T = 20;
    private static int U = 0;
    private static boolean V = false;
    private static int W = 4096;
    private static boolean X = true;
    private static String Y = null;
    private static boolean Z = false;
    static f a = new f(2);
    private static StatCustomLogger aa = null;
    private static StatExceptionCallBack ab = null;
    private static String ac = null;
    private static JSONObject ad = null;
    private static HashSet<String> ae = new HashSet();
    private static long af = 800;
    private static StatActionListener ag = null;
    private static boolean ah = true;
    static f b = new f(1);
    static String c = "__HIBERNATE__";
    static String d = "__HIBERNATE__TIME";
    static String e = "__MTA_KILL__";
    static String f = bj.b;
    static boolean g = false;
    static int h = BuildConfig.VERSION_CODE;
    static long i = 10000;
    public static boolean isAutoExceptionCaught = true;
    static boolean j = true;
    static volatile String k = StatConstants.MTA_SERVER;
    static boolean l = true;
    static int m = 0;
    static long n = 10000;
    static int o = j.g;
    static StatDataTransfer p = null;
    static boolean q = false;
    static boolean r = true;
    static boolean s = true;
    static long t = 7;
    private static StatLogger u = StatCommonHelper.getLogger();
    private static StatReportStrategy v = StatReportStrategy.APP_LAUNCH;
    private static boolean w = false;
    private static boolean x = true;
    private static int y = 30000;
    private static HashSet<String> z = null;

    static String a(Context context) {
        return Util.decode(StatPreferences.getString(context, "_mta_ky_tag_", null));
    }

    static void a() {
        if (b != null) {
            b(b.b.optString("__INSTANT_EI_LIST__", null));
            updateDontReportEventIdsSet(b.b.optString("__DONT_REPORT_EI_LIST__", null));
        }
    }

    static synchronized void a(int i) {
        synchronized (StatConfig.class) {
            S = i;
        }
    }

    static void a(long j) {
        StatPreferences.putLong(g.a(), c, j);
        setEnableStatService(false);
        u.warn("MTA is disable for current SDK version");
    }

    static void a(Context context, f fVar) throws JSONException {
        if (fVar.a == b.a) {
            b = fVar;
            a(b.b);
            a();
        } else if (fVar.a == a.a) {
            a = fVar;
        }
    }

    static void a(Context context, f fVar, JSONObject jSONObject) {
        Object obj = null;
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                Object obj2;
                String str = (String) keys.next();
                if (str.equalsIgnoreCase("v")) {
                    int i = jSONObject.getInt(str);
                    obj2 = fVar.d != i ? 1 : obj;
                    fVar.d = i;
                } else if (str.equalsIgnoreCase("c")) {
                    str = jSONObject.getString("c");
                    if (str.length() > 0) {
                        fVar.b = new JSONObject(str);
                    }
                    obj2 = obj;
                } else {
                    if (str.equalsIgnoreCase("m")) {
                        fVar.c = jSONObject.getString("m");
                    }
                    obj2 = obj;
                }
                obj = obj2;
            }
            if (obj == 1) {
                bb a = bb.a(g.a());
                if (a != null) {
                    a.a(fVar);
                }
                if (fVar.a == b.a) {
                    a(fVar.b);
                    b(fVar.b);
                }
            }
            a(context, fVar);
        } catch (Throwable e) {
            u.e(e);
        } catch (Throwable e2) {
            u.e(e2);
        }
    }

    static void a(Context context, String str) {
        if (str != null) {
            StatPreferences.putString(context, "_mta_ky_tag_", Util.encode(str));
        }
    }

    static void a(Context context, JSONObject jSONObject) {
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str.equalsIgnoreCase(Integer.toString(b.a))) {
                    a(context, b, jSONObject.getJSONObject(str));
                    a();
                } else if (str.equalsIgnoreCase(Integer.toString(a.a))) {
                    a(context, a, jSONObject.getJSONObject(str));
                } else if (str.equalsIgnoreCase("rs")) {
                    StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt(str));
                    if (statReportStrategy != null) {
                        v = statReportStrategy;
                        if (isDebugEnable()) {
                            u.d("Change to ReportStrategy:" + statReportStrategy.name());
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            u.e(e);
        }
    }

    static void a(JSONObject jSONObject) {
        try {
            int i = jSONObject.getInt("rs");
            u.i("updateReportStrategy:" + jSONObject + ",sendStrategy:" + i);
            StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(i);
            if (statReportStrategy != null) {
                setStatSendStrategy(statReportStrategy);
            }
        } catch (JSONException e) {
            if (isDebugEnable()) {
                u.i("rs not found.");
            }
        }
    }

    static boolean a(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    static boolean a(String str) {
        return (z == null || z.size() == 0 || !StatCommonHelper.isStringValid(str)) ? false : z.contains(str.toLowerCase());
    }

    static boolean a(JSONObject jSONObject, String str, String str2) {
        if (!jSONObject.isNull(str)) {
            String optString = jSONObject.optString(str);
            if (StatCommonHelper.isStringValid(str2) && StatCommonHelper.isStringValid(optString) && str2.equalsIgnoreCase(optString)) {
                return true;
            }
        }
        return false;
    }

    public static void addSkipSessionReportAppkey(String str) {
        if (StatCommonHelper.isStringValid(str)) {
            ae.add(str);
        }
    }

    static int b() {
        return C;
    }

    static void b(int i) {
        if (i >= 0) {
            U = i;
        }
    }

    static void b(Context context, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString(e);
            if (StatCommonHelper.isStringValid(optString)) {
                JSONObject jSONObject2 = new JSONObject(optString);
                if (jSONObject2 != null && jSONObject2.length() != 0) {
                    Object obj;
                    if (!jSONObject2.isNull("sm")) {
                        obj = jSONObject2.get("sm");
                        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof String ? Integer.valueOf((String) obj).intValue() : 0;
                        if (intValue > 0) {
                            if (isDebugEnable()) {
                                u.i("match sleepTime:" + intValue + " minutes");
                            }
                            StatPreferences.putLong(context, d, System.currentTimeMillis() + ((long) ((intValue * 60) * IjkMediaCodecInfo.RANK_MAX)));
                            setEnableStatService(false);
                            u.warn("MTA is disable for current SDK version");
                        }
                    }
                    if (a(jSONObject2, "sv", StatConstants.VERSION)) {
                        u.i("match sdk version:2.3.0");
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (a(jSONObject2, "md", Build.MODEL)) {
                        u.i("match MODEL:" + Build.MODEL);
                        obj = 1;
                    }
                    if (a(jSONObject2, "av", StatCommonHelper.getCurAppVersion(context))) {
                        u.i("match app version:" + StatCommonHelper.getCurAppVersion(context));
                        obj = 1;
                    }
                    if (a(jSONObject2, "mf", Build.MANUFACTURER + bj.b)) {
                        u.i("match MANUFACTURER:" + Build.MANUFACTURER + bj.b);
                        obj = 1;
                    }
                    if (a(jSONObject2, "osv", VERSION.SDK_INT + bj.b)) {
                        u.i("match android SDK version:" + VERSION.SDK_INT);
                        obj = 1;
                    }
                    if (a(jSONObject2, "ov", VERSION.SDK_INT + bj.b)) {
                        u.i("match android SDK version:" + VERSION.SDK_INT);
                        obj = 1;
                    }
                    if (a(jSONObject2, DeviceInfo.TAG_IMEI, bb.a(context).b(context).getImei())) {
                        u.i("match imei:" + bb.a(context).b(context).getImei());
                        obj = 1;
                    }
                    if (a(jSONObject2, DeviceInfo.TAG_MID, getLocalMidOnly(context))) {
                        u.i("match mid:" + getLocalMidOnly(context));
                        obj = 1;
                    }
                    if (obj != null) {
                        a(StatCommonHelper.getSDKLongVersion(StatConstants.VERSION));
                    }
                }
            }
        } catch (Throwable e) {
            u.e(e);
        }
    }

    static void b(String str) {
        if (StatCommonHelper.isStringValid(str)) {
            String[] split = str.toLowerCase().split(";");
            if (split.length > 0) {
                if (z == null) {
                    z = new HashSet(split.length);
                }
                z.addAll(Arrays.asList(split));
            }
        }
    }

    static void b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                b(g.a(), jSONObject);
                String string = jSONObject.getString(c);
                if (isDebugEnable()) {
                    u.d("hibernateVer:" + string + ", current version:" + StatConstants.VERSION);
                }
                long sDKLongVersion = StatCommonHelper.getSDKLongVersion(string);
                if (StatCommonHelper.getSDKLongVersion(StatConstants.VERSION) <= sDKLongVersion) {
                    a(sDKLongVersion);
                }
            } catch (JSONException e) {
                u.d("__HIBERNATE__ not found.");
            }
        }
    }

    static void c() {
        U++;
    }

    private static boolean c(String str) {
        if (str == null) {
            return false;
        }
        if (I == null) {
            I = str;
            return true;
        } else if (I.contains(str)) {
            return false;
        } else {
            I += "|" + str;
            return true;
        }
    }

    static int d() {
        return U;
    }

    private static boolean d(String str) {
        return "Wechat_Sdk".equalsIgnoreCase(str) || "QQConnect".equalsIgnoreCase(str);
    }

    protected static StatExceptionCallBack e() {
        return ab;
    }

    public static void enableCommitEventAtBackground(Context context, boolean z) {
        if (z) {
            if (ag == null) {
                ag = new e(context);
                StatService.addActionListener(ag);
            }
        } else if (ag != null) {
            StatService.removeActionListener(ag);
            ag = null;
        }
    }

    public static synchronized String getAppKey(Context context) {
        String str;
        synchronized (StatConfig.class) {
            if (I != null) {
                str = I;
            } else {
                if (context != null) {
                    if (I == null) {
                        I = StatCommonHelper.getAppKey(context);
                    }
                }
                if (I == null || I.trim().length() == 0) {
                    u.e((Object) "AppKey can not be null or empty, please read Developer's Guide first!");
                }
                str = I;
            }
        }
        return str;
    }

    public static String getAppVersion() {
        return ac;
    }

    public static long getBackgroundDelayTimestamp() {
        return af;
    }

    public static int getCurSessionStatReportCount() {
        return S;
    }

    public static JSONObject getCustomGlobalReportContent() {
        return ad;
    }

    public static StatCustomLogger getCustomLogger() {
        return aa;
    }

    public static String getCustomProperty(String str) {
        try {
            return a.b.getString(str);
        } catch (Throwable th) {
            u.e(th);
            return null;
        }
    }

    public static String getCustomProperty(String str, String str2) {
        try {
            String string = a.b.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            u.e(th);
            return str2;
        }
    }

    public static String getCustomUserId(Context context) {
        if (context == null) {
            u.error((Object) "Context for getCustomUid is null.");
            return null;
        }
        if (Y == null) {
            try {
                Y = StatPreferences.getString(context, "MTA_CUSTOM_UID", bj.b);
            } catch (Throwable e) {
                u.e(e);
            }
        }
        return Y;
    }

    public static StatDataTransfer getDataTransfer() {
        return p;
    }

    public static long getFlushDBSpaceMS() {
        return n;
    }

    public static synchronized String getInstallChannel(Context context) {
        String str;
        synchronized (StatConfig.class) {
            if (J != null) {
                str = J;
            } else {
                str = StatPreferences.getString(context, K, bj.b);
                if (TextUtils.isEmpty(str) || d(str)) {
                    str = StatCommonHelper.getInstallChannel(context);
                }
                J = str;
                if (J == null || J.trim().length() == 0) {
                    u.w("installChannel can not be null or empty, please read Developer's Guide first!");
                }
                str = J;
            }
        }
        return str;
    }

    public static String getLocalMidOnly(Context context) {
        return MidService.getLocalMidOnly(context);
    }

    public static String getMTAPreferencesFileName() {
        return M;
    }

    public static int getMaxBatchReportCount() {
        return F;
    }

    public static int getMaxDaySessionNumbers() {
        return T;
    }

    public static int getMaxImportantDataSendRetryCount() {
        return E;
    }

    public static int getMaxParallelTimmingEvents() {
        return N;
    }

    public static int getMaxReportEventLength() {
        return W;
    }

    public static int getMaxSendRetryCount() {
        return D;
    }

    public static int getMaxSessionStatReportCount() {
        return R;
    }

    public static int getMaxStoreEventCount() {
        return B;
    }

    public static String getMid(Context context) {
        return MidService.getMid(context);
    }

    public static long getMsPeriodForMethodsCalledLimitClear() {
        return i;
    }

    public static int getNumEventsCachedInMemory() {
        return m;
    }

    public static int getNumEventsCommitPerSec() {
        return G;
    }

    public static int getNumOfMethodsCalledLimit() {
        return h;
    }

    public static String getQQ(Context context) {
        return StatPreferences.getString(context, "mta.acc.qq", f);
    }

    public static int getReportCompressedSize() {
        return o;
    }

    public static String getSDKProperty(String str) {
        try {
            return b.b.getString(str);
        } catch (Throwable th) {
            u.w(th);
            return null;
        }
    }

    public static String getSDKProperty(String str, String str2) {
        try {
            String string = b.b.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            u.d("can't find SDK Properties key:" + str);
            return str2;
        }
    }

    public static int getSendPeriodMinutes() {
        return L;
    }

    public static int getSessionTimoutMillis() {
        return y;
    }

    public static String getStatReportHost() {
        return k;
    }

    public static String getStatReportUrl() {
        return Q;
    }

    public static StatReportStrategy getStatSendStrategy() {
        return v;
    }

    public static long getStoredRecordExpiredDays() {
        return t;
    }

    public static void init(Context context) {
        a.b(context);
        b.b(context);
        a();
    }

    public static void initNativeCrashReport(Context context, String str) {
        if (!isEnableStatService()) {
            return;
        }
        if (context == null) {
            u.error((Object) "The Context of StatConfig.initNativeCrashReport() can not be null!");
        } else {
            StatNativeCrashReport.initNativeCrash(context, str);
        }
    }

    public static boolean isAntoActivityLifecycleStat() {
        return q;
    }

    public static boolean isAutoExceptionCaught() {
        return isAutoExceptionCaught;
    }

    public static boolean isAutoTrackAppsEvent() {
        return s;
    }

    public static boolean isAutoTrackBackgroundEvent() {
        return r;
    }

    public static boolean isDebugEnable() {
        return w;
    }

    public static boolean isEnableConcurrentProcess() {
        return X;
    }

    public static boolean isEnableReportWifiList() {
        return ah;
    }

    public static boolean isEnableSmartReporting() {
        return j;
    }

    public static boolean isEnableStatService() {
        return x;
    }

    public static boolean isEventIdInDontReportEventIdsSet(String str) {
        return (A == null || A.size() == 0 || !StatCommonHelper.isStringValid(str)) ? false : A.contains(str.toLowerCase());
    }

    public static boolean isReportEventsByOrder() {
        return l;
    }

    public static boolean isXGProMode() {
        return Z;
    }

    public static void removeSkipSessionReportAppkey(String str) {
        ae.remove(str);
    }

    public static void setAntoActivityLifecycleStat(boolean z) {
        q = z;
    }

    public static void setAppKey(Context context, String str) {
        if (context == null) {
            u.error((Object) "ctx in StatConfig.setAppKey() is null");
        } else if (str == null || str.length() > j.e) {
            u.error((Object) "appkey in StatConfig.setAppKey() is null or exceed 256 bytes");
        } else {
            if (I == null) {
                I = a(context);
            }
            if ((c(str) | c(StatCommonHelper.getAppKey(context))) != 0) {
                a(context, I);
            }
        }
    }

    public static void setAppKey(String str) {
        if (str == null) {
            u.error((Object) "appkey in StatConfig.setAppKey() is null");
        } else if (str.length() > j.e) {
            u.error((Object) "The length of appkey cann't exceed 256 bytes.");
        } else {
            I = str;
        }
    }

    public static void setAppVersion(String str) {
        ac = str;
    }

    public static void setAutoExceptionCaught(boolean z) {
        isAutoExceptionCaught = z;
    }

    public static void setAutoTrackAppsEvent(boolean z) {
        s = z;
    }

    public static void setAutoTrackBackgroundEvent(boolean z) {
        r = z;
    }

    public static void setBackgroundDelayTimestamp(long j) {
        if (j <= 0 || j >= 10000) {
            Log.e(StatConstants.LOG_TAG, "setBackgroundDelayTimestamp falied, timestamp:" + j + " is invalid.");
        } else {
            af = j;
        }
    }

    public static void setCustomGlobalReportContent(JSONObject jSONObject) {
        ad = jSONObject;
    }

    public static void setCustomLogger(StatCustomLogger statCustomLogger) {
        aa = statCustomLogger;
    }

    public static void setCustomUserId(Context context, String str) {
        if (context == null) {
            u.error((Object) "Context for setCustomUid is null.");
            return;
        }
        StatPreferences.putString(context, "MTA_CUSTOM_UID", str);
        Y = str;
    }

    public static void setDataTransfer(StatDataTransfer statDataTransfer) {
        p = statDataTransfer;
    }

    public static void setDebugEnable(boolean z) {
        w = z;
        StatCommonHelper.getLogger().setDebugEnable(z);
    }

    public static void setEnableConcurrentProcess(boolean z) {
        X = z;
    }

    public static void setEnableReportWifiList(boolean z) {
        ah = z;
    }

    public static void setEnableSmartReporting(boolean z) {
        j = z;
    }

    public static void setEnableStatService(boolean z) {
        x = z;
        if (!z) {
            u.warn("!!!!!!MTA StatService has been disabled!!!!!!");
        }
    }

    public static void setFlushDBSpaceMS(long j) {
        if (j > 0) {
            n = j;
        }
    }

    public static void setInstallChannel(Context context, String str) {
        if (str.length() > j.h) {
            u.error((Object) "the length of installChannel can not exceed the range of 128 bytes.");
        } else if (!d(str)) {
            J = str;
            StatPreferences.putString(context, K, str);
        }
    }

    public static void setInstallChannel(String str) {
        if (str.length() > j.h) {
            u.error((Object) "the length of installChannel can not exceed the range of 128 bytes.");
        } else if (!d(str)) {
            J = str;
        }
    }

    public static void setMTAPreferencesFileName(String str) {
        M = str;
    }

    public static void setMaxBatchReportCount(int i) {
        if (a(i, 2, (int) IjkMediaCodecInfo.RANK_MAX)) {
            F = i;
        } else {
            u.error((Object) "setMaxBatchReportCount can not exceed the range of [2,1000].");
        }
    }

    public static void setMaxDaySessionNumbers(int i) {
        if (i <= 0) {
            u.e((Object) "maxDaySessionNumbers must be greater than 0.");
        } else {
            T = i;
        }
    }

    public static void setMaxImportantDataSendRetryCount(int i) {
        if (i > 100) {
            E = i;
        }
    }

    public static void setMaxParallelTimmingEvents(int i) {
        if (a(i, 1, 4096)) {
            N = i;
        } else {
            u.error((Object) "setMaxParallelTimmingEvents can not exceed the range of [1, 4096].");
        }
    }

    public static void setMaxReportEventLength(int i) {
        if (i <= 0) {
            u.error((Object) "maxReportEventLength on setMaxReportEventLength() must greater than 0.");
        } else {
            W = i;
        }
    }

    public static void setMaxSendRetryCount(int i) {
        if (a(i, 1, (int) IjkMediaCodecInfo.RANK_MAX)) {
            D = i;
        } else {
            u.error((Object) "setMaxSendRetryCount can not exceed the range of [1,1000].");
        }
    }

    public static void setMaxSessionStatReportCount(int i) {
        if (i < 0) {
            u.error((Object) "maxSessionStatReportCount cannot be less than 0.");
        } else {
            R = i;
        }
    }

    public static void setMaxStoreEventCount(int i) {
        if (a(i, 0, 500000)) {
            B = i;
        } else {
            u.error((Object) "setMaxStoreEventCount can not exceed the range of [0, 500000].");
        }
    }

    public static void setNativeCrashDebugEnable(boolean z) {
        StatNativeCrashReport.setNativeCrashDebugEnable(z);
    }

    public static void setNumEventsCachedInMemory(int i) {
        if (i >= 0) {
            m = i;
        }
    }

    public static void setNumEventsCommitPerSec(int i) {
        if (i > 0) {
            G = i;
        }
    }

    public static void setNumOfMethodsCalledLimit(int i, long j) {
        h = i;
        if (j >= 1000) {
            i = j;
        }
    }

    public static void setQQ(Context context, String str) {
        StatPreferences.putString(context, "mta.acc.qq", str);
        f = str;
    }

    public static void setReportCompressedSize(int i) {
        if (i > 0) {
            o = i;
        }
    }

    public static void setReportEventsByOrder(boolean z) {
        l = z;
    }

    public static void setSendPeriodMinutes(int i) {
        if (a(i, 1, 10080)) {
            L = i;
        } else {
            u.error((Object) "setSendPeriodMinutes can not exceed the range of [1, 7*24*60] minutes.");
        }
    }

    public static void setSessionTimoutMillis(int i) {
        if (a(i, (int) IjkMediaCodecInfo.RANK_MAX, 86400000)) {
            y = i;
        } else {
            u.error((Object) "setSessionTimoutMillis can not exceed the range of [1000, 24 * 60 * 60 * 1000].");
        }
    }

    public static void setStatExCallBack(StatExceptionCallBack statExceptionCallBack) {
        ab = statExceptionCallBack;
    }

    public static void setStatReportUrl(String str) {
        if (str == null || str.length() == 0) {
            u.error((Object) "statReportUrl cannot be null or empty.");
            return;
        }
        Q = str;
        try {
            k = new URI(Q).getHost();
        } catch (Exception e) {
            u.w(e);
        }
        if (isDebugEnable()) {
            u.i("url:" + Q + ", domain:" + k);
        }
    }

    public static void setStatSendStrategy(StatReportStrategy statReportStrategy) {
        v = statReportStrategy;
        if (statReportStrategy != StatReportStrategy.PERIOD) {
            StatServiceImpl.c = 0;
        }
        if (isDebugEnable()) {
            u.d("Change to statSendStrategy: " + statReportStrategy);
        }
    }

    public static void setStoredRecordExpiredDays(long j) {
        if (j > 0) {
            t = j;
        }
    }

    public static void setXGProMode(boolean z) {
        Z = z;
    }

    public static boolean shouldSkipSessionReport(String str) {
        return ae.contains(str);
    }

    public static void updateDontReportEventIdsSet(String str) {
        if (StatCommonHelper.isStringValid(str)) {
            String[] split = str.toLowerCase().split(";");
            if (split.length > 0) {
                if (A == null) {
                    A = new HashSet(split.length);
                }
                A.addAll(Arrays.asList(split));
            }
        }
    }
}
