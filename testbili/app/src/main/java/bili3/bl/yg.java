package bili3.bl;

import android.util.JsonReader;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.io.IOException;

/* compiled from: BL */
public class yg {
    public static xj a(JsonReader jsonReader, uz uzVar) throws IOException {
        jsonReader.beginObject();
        xj xjVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            switch (nextName.hashCode()) {
                case 97:
                    if (nextName.equals("a")) {
                        obj = null;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                    xjVar = b(jsonReader, uzVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (xjVar == null) {
            return new xj(null, null, null, null);
        }
        return xjVar;
    }

    private static xj b(JsonReader jsonReader, uz uzVar) throws IOException {
        xa xaVar = null;
        jsonReader.beginObject();
        xa xaVar2 = null;
        wz wzVar = null;
        wz wzVar2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            switch (nextName.hashCode()) {
                case 116:
                    if (nextName.equals("t")) {
                        obj = 3;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        obj = null;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        obj = 2;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                    wzVar2 = yi.g(jsonReader, uzVar);
                    break;
                case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                    wzVar = yi.g(jsonReader, uzVar);
                    break;
                case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    xaVar2 = yi.a(jsonReader, uzVar);
                    break;
                case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                    xaVar = yi.a(jsonReader, uzVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new xj(wzVar2, wzVar, xaVar2, xaVar);
    }
}
