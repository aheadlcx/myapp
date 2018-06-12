package bili2.bl;

import android.content.Context;
import android.text.TextUtils;
import bl.fmt.a;
import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class fmu implements fmt, TencentLocationListener {
    private TencentLocationManager a;
    private TencentLocationRequest b = TencentLocationRequest.create();
    private final List<a> c;

    public fmu(Context context) {
        this.a = TencentLocationManager.getInstance(context);
        this.a.setCoordinateType(1);
        this.b.setInterval(5000);
        this.b.setRequestLevel(3);
        this.c = new ArrayList();
    }

    public void a(final a aVar) {
        this.a.requestLocationUpdates(this.b, new TencentLocationListener(this) {
            final /* synthetic */ fmu b;

            public void onLocationChanged(TencentLocation tencentLocation, int i, String str) {
                if (!TextUtils.isEmpty(tencentLocation.getCityCode()) && !TextUtils.isEmpty(tencentLocation.getCity())) {
                    this.b.a.removeUpdates(this);
                    switch (i) {
                        case 0:
                            aVar.a(new fmr(tencentLocation), 0, null);
                            return;
                        case 1:
                            aVar.a(null, 2, str);
                            return;
                        case 2:
                            aVar.a(null, 1, str);
                            return;
                        case 4:
                            aVar.a(null, 3, str);
                            return;
                        case 404:
                            aVar.a(null, 4, str);
                            return;
                        default:
                            return;
                    }
                }
            }

            public void onStatusUpdate(String str, int i, String str2) {
            }
        });
    }

    public fmr a() {
        return new fmr(this.a.getLastKnownLocation());
    }

    public void onLocationChanged(TencentLocation tencentLocation, int i, String str) {
        int i2 = 0;
        if (!TextUtils.isEmpty(tencentLocation.getCityCode()) && !TextUtils.isEmpty(tencentLocation.getCity())) {
            fmr bl_fmr;
            switch (i) {
                case 0:
                    bl_fmr = new fmr(tencentLocation);
                    str = null;
                    break;
                case 1:
                    i2 = 2;
                    bl_fmr = null;
                    break;
                case 2:
                    i2 = 1;
                    bl_fmr = null;
                    break;
                case 4:
                    i2 = 3;
                    bl_fmr = null;
                    break;
                case 404:
                    i2 = 4;
                    bl_fmr = null;
                    break;
                default:
                    bl_fmr = null;
                    break;
            }
            synchronized (this.c) {
                for (a a : this.c) {
                    a.a(bl_fmr, i2, str);
                }
            }
        }
    }

    public void onStatusUpdate(String str, int i, String str2) {
    }
}
