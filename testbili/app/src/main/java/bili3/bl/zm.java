package bili3.bl;

import android.util.JsonReader;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.io.IOException;

/* compiled from: BL */
class zm {
    static xx a(JsonReader jsonReader, uz uzVar) throws IOException {
        xg xgVar = null;
        int i = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            switch (nextName.hashCode()) {
                case 3432:
                    if (nextName.equals("ks")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        obj = null;
                        break;
                    }
                    break;
                case 104415:
                    if (nextName.equals("ind")) {
                        obj = 1;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                    str = jsonReader.nextString();
                    break;
                case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                    i = jsonReader.nextInt();
                    break;
                case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    xgVar = yi.e(jsonReader, uzVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new xx(str, i, xgVar);
    }
}
