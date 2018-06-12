package bili3.bl;

import android.location.Location;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationRequest;

/* compiled from: BL */
public final class tj {
    public static boolean a = true;

    static {
        AnonymousClass1 anonymousClass1 = new Object() {
        };
    }

    public static TencentLocation a(TencentLocation tencentLocation, byte[] bArr) {
        tencentLocation.getExtra().putByteArray("raw_data", bArr);
        return tencentLocation;
    }

    public static void a(TencentLocation tencentLocation, String str) {
        if (tencentLocation != null) {
            tencentLocation.getExtra().putString("raw_query", str);
        }
    }

    public static void a(TencentLocation tencentLocation, Location location) {
        if (tencentLocation != null) {
            try {
                tencentLocation.getExtra().putParcelable("raw_gps", location);
            } catch (Exception e) {
            }
        }
    }

    public static boolean a(TencentLocationRequest tencentLocationRequest) {
        if (tencentLocationRequest == null) {
            return false;
        }
        return tencentLocationRequest.getExtras().getBoolean("request_raw_data");
    }

    public static boolean a(int i) {
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                return true;
            default:
                return i == 7;
        }
    }
}
