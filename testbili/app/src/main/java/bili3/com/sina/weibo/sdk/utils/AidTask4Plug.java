package bili3.com.sina.weibo.sdk.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bilibili.bililive.privateletter.comment.api.BiliCommentList;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveHomePage;
import com.intertrust.wasabi.licensestore.LicenseStore;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.HttpManager;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.tencent.bugly.BuglyStrategy.a;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzoneShare;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BL */
public class AidTask4Plug {
    private static final String AID_FILE_NAME = "weibo_sdk_aid";
    private static final int MAX_RETRY_NUM = 3;
    private static final String TAG = "AidTask";
    private static final int VERSION = 1;
    public static final int WHAT_LOAD_AID_ERR = 1002;
    public static final int WHAT_LOAD_AID_SUC = 1001;
    private static AidTask4Plug sInstance;
    private String hash;
    private Map<String, AidInfo> mAidInfo = new HashMap(MAX_RETRY_NUM);
    private String mAppKey;
    private Context mContext;
    private CallbackHandler mHandler;
    private String pkg;

    /* compiled from: BL */
    public static final class AidInfo {
        private String mAid;
        private String mSubCookie;

        public String getAid() {
            return this.mAid;
        }

        public String getSubCookie() {
            return this.mSubCookie;
        }

        public static AidInfo parseJson(String str) throws WeiboException {
            AidInfo aidInfo = new AidInfo();
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("error") || jSONObject.has("error_code")) {
                    LogUtil.d(AidTask4Plug.TAG, "loadAidFromNet has error !!!");
                    throw new WeiboException("loadAidFromNet has error !!!");
                }
                aidInfo.mAid = jSONObject.optString(LogBuilder.KEY_AID, Constants.STR_EMPTY);
                aidInfo.mSubCookie = jSONObject.optString("sub", Constants.STR_EMPTY);
                return aidInfo;
            } catch (JSONException e) {
                LogUtil.d(AidTask4Plug.TAG, "loadAidFromNet JSONException Msg : " + e.getMessage());
                throw new WeiboException("loadAidFromNet has error !!!");
            }
        }

        AidInfo cloneAidInfo() {
            AidInfo aidInfo = new AidInfo();
            aidInfo.mAid = this.mAid;
            aidInfo.mSubCookie = this.mSubCookie;
            return aidInfo;
        }
    }

    /* compiled from: BL */
    public interface AidResultCallBack {
        void onAidGenFailed(Exception exception);

        void onAidGenSuccessed(AidInfo aidInfo);
    }

    /* compiled from: BL */
    static class CallbackHandler extends Handler {
        private WeakReference<AidResultCallBack> callBackReference;

        public CallbackHandler(Looper looper) {
            super(looper);
        }

        public void setCallback(AidResultCallBack aidResultCallBack) {
            if (this.callBackReference == null) {
                this.callBackReference = new WeakReference(aidResultCallBack);
            } else if (((AidResultCallBack) this.callBackReference.get()) != aidResultCallBack) {
                this.callBackReference = new WeakReference(aidResultCallBack);
            }
        }

        public void handleMessage(Message message) {
            AidResultCallBack aidResultCallBack = (AidResultCallBack) this.callBackReference.get();
            switch (message.what) {
                case AidTask4Plug.WHAT_LOAD_AID_SUC /*1001*/:
                    if (aidResultCallBack != null) {
                        aidResultCallBack.onAidGenSuccessed(((AidInfo) message.obj).cloneAidInfo());
                        return;
                    }
                    return;
                case AidTask4Plug.WHAT_LOAD_AID_ERR /*1002*/:
                    if (aidResultCallBack != null) {
                        aidResultCallBack.onAidGenFailed((WeiboException) message.obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public synchronized void setAppkey(String str) {
        this.mAppKey = str;
    }

    private AidTask4Plug(Context context, final String str) {
        this.mContext = context.getApplicationContext();
        this.mHandler = new CallbackHandler(this.mContext.getMainLooper());
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < AidTask4Plug.VERSION; i += AidTask4Plug.VERSION) {
                    try {
                        AidTask4Plug.this.getAidInfoFile(i, str).delete();
                    } catch (Exception e) {
                    }
                }
            }
        }).start();
    }

    public static synchronized AidTask4Plug getInstance(Context context, String str) {
        AidTask4Plug aidTask4Plug;
        synchronized (AidTask4Plug.class) {
            if (sInstance == null) {
                sInstance = new AidTask4Plug(context, str);
            }
            aidTask4Plug = sInstance;
        }
        return aidTask4Plug;
    }

    public void aidTaskInit(String str) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "aidTaskInit ");
            initAidInfo(str);
        }
    }

    private AidInfo aidTaskInit(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LogUtil.e(TAG, "aidTaskInit ");
        return initAidInfo(str, str2, str3);
    }

    public AidInfo initAidInfo(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        this.mAppKey = str;
        this.pkg = str2;
        this.hash = str3;
        AidInfo loadAidInfoFromCache = loadAidInfoFromCache(str);
        if (loadAidInfoFromCache == null) {
            int i = VERSION;
            do {
                i += VERSION;
                try {
                    String loadAidFromNet = loadAidFromNet();
                    loadAidInfoFromCache = AidInfo.parseJson(loadAidFromNet);
                    cacheAidInfo(loadAidFromNet, str);
                    this.mAidInfo.put(str, loadAidInfoFromCache);
                    return loadAidInfoFromCache;
                } catch (WeiboException e) {
                    LogUtil.e(TAG, "AidTaskInit WeiboException Msg : " + e.getMessage());
                    if (i >= MAX_RETRY_NUM) {
                        return loadAidInfoFromCache;
                    }
                }
            } while (i >= MAX_RETRY_NUM);
            return loadAidInfoFromCache;
        }
        this.mAidInfo.put(str, loadAidInfoFromCache);
        return loadAidInfoFromCache;
    }

    private void initAidInfo(String str) {
        initAidInfo(str, null, null);
    }

    public AidInfo getAid4PlugSync(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LogUtil.e(TAG, "getAidSync ");
        if (this.mAidInfo.get(str) == null) {
            aidTaskInit(str, str2, str3);
        }
        return (AidInfo) this.mAidInfo.get(str);
    }

    protected synchronized AidInfo loadAidInfoFromCache(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        AidInfo aidInfo = null;
        synchronized (this) {
            try {
                fileInputStream = new FileInputStream(getAidInfoFile(VERSION, str));
                try {
                    byte[] bArr = new byte[fileInputStream.available()];
                    fileInputStream.read(bArr);
                    aidInfo = AidInfo.parseJson(new String(bArr));
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Exception e2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                        }
                    }
                    return aidInfo;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                fileInputStream = aidInfo;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                return aidInfo;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                fileInputStream = aidInfo;
                th = th4;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        }
        return aidInfo;
    }

    public String loadAidFromCache(String str) {
        AidInfo loadAidInfoFromCache = loadAidInfoFromCache(str);
        if (loadAidInfoFromCache != null) {
            return loadAidInfoFromCache.getAid() == null ? Constants.STR_EMPTY : loadAidInfoFromCache.getAid();
        } else {
            return Constants.STR_EMPTY;
        }
    }

    private File getAidInfoFile(int i, String str) {
        return new File(this.mContext.getFilesDir(), AID_FILE_NAME + str + i);
    }

    private String loadAidFromNet() throws WeiboException {
        String str = "https://api.weibo.com/oauth2/getaid.json";
        str = this.pkg == null ? this.mContext.getPackageName() : this.pkg;
        String sign = this.hash == null ? Utility.getSign(this.mContext, str) : this.hash;
        String mfp = getMfp(this.mContext);
        WeiboParameters weiboParameters = new WeiboParameters(this.mAppKey);
        weiboParameters.put(LogBuilder.KEY_APPKEY, this.mAppKey);
        weiboParameters.put("mfp", mfp);
        weiboParameters.put(LogBuilder.KEY_PACKAGE_NAME, str);
        weiboParameters.put(LogBuilder.KEY_HASH, sign);
        try {
            str = HttpManager.openUrl(this.mContext, "https://api.weibo.com/oauth2/getaid.json", Constants.HTTP_GET, weiboParameters);
            LogUtil.d(TAG, "loadAidFromNet response : " + str);
            return str;
        } catch (WeiboException e) {
            LogUtil.d(TAG, "loadAidFromNet WeiboException Msg : " + e.getMessage());
            throw e;
        }
    }

    private synchronized void cacheAidInfo(String str, String str2) {
        Throwable th;
        if (!TextUtils.isEmpty(str)) {
            FileOutputStream fileOutputStream = null;
            FileOutputStream fileOutputStream2;
            try {
                fileOutputStream2 = new FileOutputStream(getAidInfoFile(VERSION, str2));
                try {
                    fileOutputStream2.write(str.getBytes());
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                        }
                    }
                } catch (Exception e2) {
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e3) {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    fileOutputStream = fileOutputStream2;
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                fileOutputStream2 = null;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        }
        return;
    }

    private static String getMfp(Context context) {
        String str = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB";
        String genMfpString = genMfpString(context);
        String str2 = Constants.STR_EMPTY;
        try {
            str = new String(genMfpString.getBytes(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            str = str2;
        }
        LogUtil.d(TAG, "genMfpString() utf-8 string : " + str);
        try {
            str = encryptRsa(str, "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDHHM0Fi2Z6+QYKXqFUX2Cy6AaWq3cPi+GSn9oeAwQbPZR75JB7Netm0HtBVVbtPhzT7UO2p1JhFUKWqrqoYuAjkgMVPmA0sFrQohns5EE44Y86XQopD4ZO+dE5KjUZFE6vrPO3rWW3np2BqlgKpjnYZri6TJApmIpGcQg9/G/3zQIDAQAB");
            LogUtil.d(TAG, "encryptRsa() string : " + str);
            return str;
        } catch (Exception e2) {
            LogUtil.e(TAG, e2.getMessage());
            return Constants.STR_EMPTY;
        }
    }

    private static String genMfpString(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            CharSequence os = getOS();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_TO_TYPE_QQ_GROUP, os);
            }
            os = getImei(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_SSO_LOGIN, os);
            }
            os = getMeid(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP, os);
            }
            os = getImsi(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_TO_TYPE_QZONE, os);
            }
            os = getMac(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_SHARE_TYPE_TEXT, os);
            }
            os = getIccid(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_SHARE_TYPE_INFO, os);
            }
            os = getSerialNo();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_SHARE_TYPE_PUBLISHMOOD, os);
            }
            os = getAndroidId(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, os);
            }
            os = getCpu();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_JOININ_GROUP, os);
            }
            os = getModel();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_MAKE_FRIEND, os);
            }
            os = getSdSize();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_WPA_STATE, os);
            }
            os = getResolution(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_START_WAP, os);
            }
            os = getSsid(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_START_GROUP, os);
            }
            os = getDeviceName();
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_REPORT_TYPE_BIND_GROUP, os);
            }
            os = getConnectType(context);
            if (!TextUtils.isEmpty(os)) {
                jSONObject.put(Constants.VIA_ACT_TYPE_NINETEEN, os);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String encryptRsa(String str, String str2) throws Exception {
        Throwable th;
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(VERSION, getPublicKey(str2));
        byte[] bytes = str.getBytes("UTF-8");
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (true) {
                try {
                    int splite = splite(bytes, i, 117);
                    if (splite == -1) {
                        break;
                    }
                    byte[] doFinal = instance.doFinal(bytes, i, splite);
                    byteArrayOutputStream.write(doFinal);
                    LogUtil.d(TAG, "encryptRsa offset = " + i + "     len = " + splite + "     enBytes len = " + doFinal.length);
                    i += splite;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            byteArrayOutputStream.flush();
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            LogUtil.d(TAG, "encryptRsa total enBytes len = " + toByteArray.length);
            toByteArray = Base64.encodebyte(toByteArray);
            LogUtil.d(TAG, "encryptRsa total base64byte len = " + toByteArray.length);
            String str3 = "01";
            String str4 = "01" + new String(toByteArray, "UTF-8");
            LogUtil.d(TAG, "encryptRsa total base64string : " + str4);
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                }
            }
            return str4;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                }
            }
            throw th;
        }
    }

    private static int splite(byte[] bArr, int i, int i2) {
        if (i >= bArr.length) {
            return -1;
        }
        return Math.min(bArr.length - i, i2);
    }

    private static PublicKey getPublicKey(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes())));
    }

    private static String getOS() {
        try {
            return "Android " + VERSION.RELEASE;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getImei(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getMeid(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getImsi(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getMac(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService(TencentLocationListener.WIFI);
            if (wifiManager == null) {
                return Constants.STR_EMPTY;
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            return connectionInfo != null ? connectionInfo.getMacAddress() : Constants.STR_EMPTY;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getIccid(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getSerialNo() {
        String str = Constants.STR_EMPTY;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{"ro.serialno", "unknown"});
        } catch (Exception e) {
            return str;
        }
    }

    private static String getAndroidId(Context context) {
        try {
            return Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getCpu() {
        try {
            return Build.CPU_ABI;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getModel() {
        try {
            return Build.MODEL;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getSdSize() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return Long.toString(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getResolution(Context context) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return String.valueOf(displayMetrics.widthPixels) + "*" + String.valueOf(displayMetrics.heightPixels);
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getSsid(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService(TencentLocationListener.WIFI)).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
        } catch (Exception e) {
        }
        return Constants.STR_EMPTY;
    }

    private static String getDeviceName() {
        try {
            return Build.BRAND;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    private static String getConnectType(Context context) {
        String str = "none";
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.getType() == 0) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case VERSION /*1*/:
                        case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                        case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                        case a.CRASHTYPE_BLOCK /*7*/:
                        case BiliCommentList.OID_TYPE_PAINTING /*11*/:
                            return "2G";
                        case MAX_RETRY_NUM /*3*/:
                        case QzoneShare.SHARE_TO_QZONE_TYPE_IMAGE /*5*/:
                        case QzoneShare.SHARE_TO_QZONE_TYPE_APP /*6*/:
                        case LicenseStore.WSB_LS_FLAG_LICENSE_TAG /*8*/:
                        case BiliLiveHomePage.MODULE_TYPE_AREA_STD /*9*/:
                        case BiliLiveHomePage.MODULE_TYPE_AREA_SQUARE /*10*/:
                        case BiliCommentList.OID_TYPE_ARTICLE /*12*/:
                        case BiliCommentList.OID_TYPE_MUSIC /*14*/:
                        case BiliCommentList.OID_TYPE_REVIEW /*15*/:
                            return "3G";
                        case 13:
                            return "4G";
                        default:
                            return "none";
                    }
                } else if (activeNetworkInfo.getType() == VERSION) {
                    return TencentLocationListener.WIFI;
                }
            }
            return str;
        } catch (Exception e) {
            return str;
        }
    }
}
