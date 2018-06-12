package bili4.com.tencent.open.b;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.tencent.open.a.f;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u.aly.bj;
import u.aly.j;

/* compiled from: BL */
public class a {
    protected static final Uri a = Uri.parse("content://telephony/carriers/preferapn");

    public static String a(Context context) {
        int d = d(context);
        if (d == 2) {
            return "wifi";
        }
        if (d == 1) {
            return "cmwap";
        }
        if (d == 4) {
            return "cmnet";
        }
        if (d == 16) {
            return "uniwap";
        }
        if (d == 8) {
            return "uninet";
        }
        if (d == 64) {
            return "wap";
        }
        if (d == 32) {
            return "net";
        }
        if (d == j.g) {
            return "ctwap";
        }
        if (d == j.e) {
            return "ctnet";
        }
        if (d == IjkMediaMeta.FF_PROFILE_H264_INTRA) {
            return "3gnet";
        }
        if (d == 1024) {
            return "3gwap";
        }
        String b = b(context);
        if (b == null || b.length() == 0) {
            return "none";
        }
        return b;
    }

    public static String b(Context context) {
        try {
            Cursor query = context.getContentResolver().query(a, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex("apn"));
            if (query == null) {
                return string;
            }
            query.close();
            return string;
        } catch (SecurityException e) {
            f.e("openSDK_LOG.APNUtil", "getApn has exception: " + e.getMessage());
            return bj.b;
        } catch (Exception e2) {
            f.e("openSDK_LOG.APNUtil", "getApn has exception: " + e2.getMessage());
            return bj.b;
        }
    }

    public static String c(Context context) {
        try {
            Cursor query = context.getContentResolver().query(a, null, null, null, null);
            if (query == null) {
                return null;
            }
            query.moveToFirst();
            if (query.isAfterLast()) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            String string = query.getString(query.getColumnIndex("proxy"));
            if (query == null) {
                return string;
            }
            query.close();
            return string;
        } catch (SecurityException e) {
            f.e("openSDK_LOG.APNUtil", "getApnProxy has exception: " + e.getMessage());
            return bj.b;
        }
    }

    public static int d(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return j.h;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return j.h;
            }
            if (activeNetworkInfo.getTypeName().toUpperCase().equals("WIFI")) {
                return 2;
            }
            String toLowerCase = activeNetworkInfo.getExtraInfo().toLowerCase();
            if (toLowerCase.startsWith("cmwap")) {
                return 1;
            }
            if (toLowerCase.startsWith("cmnet") || toLowerCase.startsWith("epc.tmobile.com")) {
                return 4;
            }
            if (toLowerCase.startsWith("uniwap")) {
                return 16;
            }
            if (toLowerCase.startsWith("uninet")) {
                return 8;
            }
            if (toLowerCase.startsWith("wap")) {
                return 64;
            }
            if (toLowerCase.startsWith("net")) {
                return 32;
            }
            if (toLowerCase.startsWith("ctwap")) {
                return j.g;
            }
            if (toLowerCase.startsWith("ctnet")) {
                return j.e;
            }
            if (toLowerCase.startsWith("3gwap")) {
                return 1024;
            }
            if (toLowerCase.startsWith("3gnet")) {
                return IjkMediaMeta.FF_PROFILE_H264_INTRA;
            }
            if (toLowerCase.startsWith("#777")) {
                toLowerCase = c(context);
                if (toLowerCase == null || toLowerCase.length() <= 0) {
                    return j.e;
                }
                return j.g;
            }
            return j.h;
        } catch (Exception e) {
            f.e("openSDK_LOG.APNUtil", "getMProxyType has exception: " + e.getMessage());
        }
    }

    public static String e(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "MOBILE";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getTypeName();
        }
        return "MOBILE";
    }
}
