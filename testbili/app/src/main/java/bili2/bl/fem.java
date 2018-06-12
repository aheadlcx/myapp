package bili2.bl;

import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: BL */
final class fem {
    static HttpURLConnection a(URL url) {
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118}).equals(protocol)) {
            try {
                return (HttpURLConnection) url.openConnection();
            } catch (Throwable e) {
                ibn.a(e);
            }
        }
        throw new IllegalArgumentException(hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 96, (byte) 125, (byte) 117, (byte) 96, (byte) 102, (byte) 113, (byte) 96, (byte) 97, (byte) 37, (byte) 117, (byte) 119, (byte) 106, (byte) 113, (byte) 106, (byte) 102, (byte) 106, (byte) 105, (byte) 63, (byte) 37}) + protocol);
    }
}
