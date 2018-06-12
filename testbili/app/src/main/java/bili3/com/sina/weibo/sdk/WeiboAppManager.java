package bili3.com.sina.weibo.sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import bl.ibn;
import com.bilibili.bilibililive.api.entity.BiliPostImage;
import com.sina.weibo.sdk.auth.WbAppInfo;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONObject;

/* compiled from: BL */
public class WeiboAppManager {
    private static final String SDK_INT_FILE_NAME = "weibo_for_sdk.json";
    private static final String TAG = WeiboAppManager.class.getName();
    private static final Uri WEIBOG3_NAME_URI = Uri.parse("content://com.sina.weibo.sdkProvider/query/package");
    private static final String WEIBO_IDENTITY_ACTION = "com.sina.weibo.action.sdkidentity";
    private static final Uri WEIBO_NAME_URI = Uri.parse("content://com.sina.weibo.sdkProvider/query/package");
    private static WeiboAppManager sInstance;
    private Context mContext;
    private WbAppInfo wbAppInfo;

    private WeiboAppManager(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static synchronized WeiboAppManager getInstance(Context context) {
        WeiboAppManager weiboAppManager;
        synchronized (WeiboAppManager.class) {
            if (sInstance == null) {
                sInstance = new WeiboAppManager(context);
            }
            weiboAppManager = sInstance;
        }
        return weiboAppManager;
    }

    public synchronized WbAppInfo getWbAppInfo() {
        if (this.wbAppInfo == null) {
            this.wbAppInfo = queryWbInfoInternal(this.mContext);
        }
        return this.wbAppInfo;
    }

    private WbAppInfo queryWbInfoInternal(Context context) {
        Object obj = 1;
        WbAppInfo queryWbInfoByProvider = queryWbInfoByProvider(context);
        WbAppInfo queryWbInfoByAsset = queryWbInfoByAsset(context);
        Object obj2 = queryWbInfoByProvider != null ? 1 : null;
        if (queryWbInfoByAsset == null) {
            obj = null;
        }
        if (obj2 == null || obj == null) {
            if (obj2 != null) {
                return queryWbInfoByProvider;
            }
            if (obj != null) {
                return queryWbInfoByAsset;
            }
            return null;
        } else if (queryWbInfoByProvider.getSupportVersion() >= queryWbInfoByAsset.getSupportVersion()) {
            return queryWbInfoByProvider;
        } else {
            return queryWbInfoByAsset;
        }
    }

    private WbAppInfo queryWbInfoByProvider(Context context) {
        Exception e;
        Throwable th;
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query;
        try {
            Cursor query2 = contentResolver.query(WEIBO_NAME_URI, null, null, null, null);
            if (query2 == null) {
                try {
                    query = contentResolver.query(WEIBOG3_NAME_URI, null, null, null, null);
                    if (query == null) {
                        if (query != null) {
                            query.close();
                        }
                        return null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    query = query2;
                    try {
                        LogUtil.e(TAG, e.getMessage());
                        if (query != null) {
                            query.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    query = query2;
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            query = query2;
            try {
                int columnIndex = query.getColumnIndex("support_api");
                int columnIndex2 = query.getColumnIndex("package");
                int columnIndex3 = query.getColumnIndex("sso_activity");
                if (query.moveToFirst()) {
                    int parseInt;
                    Object string;
                    int i = -1;
                    try {
                        parseInt = Integer.parseInt(query.getString(columnIndex));
                    } catch (Throwable e3) {
                        ibn.a(e3);
                        parseInt = i;
                    }
                    String string2 = query.getString(columnIndex2);
                    if (columnIndex3 > 0) {
                        string = query.getString(columnIndex3);
                    } else {
                        string = null;
                    }
                    if (!TextUtils.isEmpty(string2) && ApiUtils.validateWeiboSign(context, string2)) {
                        WbAppInfo wbAppInfo = new WbAppInfo();
                        wbAppInfo.setPackageName(string2);
                        wbAppInfo.setSupportVersion(parseInt);
                        if (!TextUtils.isEmpty(string)) {
                            wbAppInfo.setAuthActivityName(string);
                        }
                        if (query == null) {
                            return wbAppInfo;
                        }
                        query.close();
                        return wbAppInfo;
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (Exception e4) {
                e = e4;
                LogUtil.e(TAG, e.getMessage());
                if (query != null) {
                    query.close();
                }
                return null;
            }
        } catch (Exception e5) {
            e = e5;
            query = null;
            LogUtil.e(TAG, e.getMessage());
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
        return null;
    }

    private WbAppInfo queryWbInfoByAsset(Context context) {
        WbAppInfo wbAppInfo = null;
        Intent intent = new Intent(WEIBO_IDENTITY_ACTION);
        intent.addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (!(queryIntentServices == null || queryIntentServices.isEmpty())) {
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (!(resolveInfo.serviceInfo == null || resolveInfo.serviceInfo.applicationInfo == null || TextUtils.isEmpty(resolveInfo.serviceInfo.packageName))) {
                    WbAppInfo parseWbInfoByAsset = parseWbInfoByAsset(resolveInfo.serviceInfo.packageName);
                    if (parseWbInfoByAsset == null) {
                        parseWbInfoByAsset = wbAppInfo;
                    }
                    wbAppInfo = parseWbInfoByAsset;
                }
            }
        }
        return wbAppInfo;
    }

    public WbAppInfo parseWbInfoByAsset(String str) {
        Exception e;
        Throwable th;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        InputStream open;
        try {
            byte[] bArr = new byte[BiliPostImage.MAX_HEIGHT];
            open = this.mContext.createPackageContext(str, 2).getAssets().open(SDK_INT_FILE_NAME);
            try {
                int read;
                StringBuilder stringBuilder = new StringBuilder();
                while (true) {
                    read = open.read(bArr, 0, BiliPostImage.MAX_HEIGHT);
                    if (read == -1) {
                        break;
                    }
                    stringBuilder.append(new String(bArr, 0, read));
                }
                if (!TextUtils.isEmpty(stringBuilder.toString()) && ApiUtils.validateWeiboSign(this.mContext, str)) {
                    JSONObject jSONObject = new JSONObject(stringBuilder.toString());
                    read = jSONObject.optInt("support_api", -1);
                    WbAppInfo wbAppInfo = new WbAppInfo();
                    wbAppInfo.setPackageName(str);
                    wbAppInfo.setSupportVersion(read);
                    wbAppInfo.setAuthActivityName(jSONObject.optString("authActivityName", "com.sina.weibo.SSOActivity"));
                    if (open != null) {
                        try {
                            open.close();
                        } catch (IOException e2) {
                        }
                    }
                    return wbAppInfo;
                } else if (open == null) {
                    return null;
                } else {
                    try {
                        open.close();
                        return null;
                    } catch (IOException e3) {
                        return null;
                    }
                }
            } catch (Exception e4) {
                e = e4;
                try {
                    LogUtil.e(TAG, e.getMessage());
                    if (open != null) {
                        return null;
                    }
                    try {
                        open.close();
                        return null;
                    } catch (IOException e5) {
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (open != null) {
                        try {
                            open.close();
                        } catch (IOException e6) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e7) {
            e = e7;
            open = null;
            LogUtil.e(TAG, e.getMessage());
            if (open != null) {
                return null;
            }
            open.close();
            return null;
        } catch (Throwable th3) {
            open = null;
            th = th3;
            if (open != null) {
                open.close();
            }
            throw th;
        }
    }
}
