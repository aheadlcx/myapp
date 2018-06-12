package bili3.com.bilibili.opd.app.bizcommon.mediaplayer;

import android.support.annotation.Keep;
import bl.hae;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

@Keep
/* compiled from: BL */
public class UrlResponse implements Serializable {
    public static final int CDN_PLAY_NOT_TRIED = 1;
    public static final int CDN_PLAY_TRIED = 2;
    private static final long serialVersionUID = 6298655262348524797L;
    public List<String> cdns = Collections.emptyList();
    public transient int currentUseCDN = -1;
    public long sid;
    public transient Object tag;
    public transient String tempCachePath;
    public int timeout;
    public long timeoutStamp;
    public String url;

    public UrlResponse(long j) {
        this.sid = j;
    }

    public boolean isTimeout() {
        return this.timeoutStamp - System.currentTimeMillis() < 1800000;
    }

    public void copyFromResponse(UrlResponse urlResponse) {
        this.url = urlResponse.url;
        this.timeout = urlResponse.timeout;
        config();
    }

    public String toString() {
        return hae.a(new byte[]{(byte) 80, (byte) 119, (byte) 105, (byte) 87, (byte) 96, (byte) 118, (byte) 117, (byte) 106, (byte) 107, (byte) 118, (byte) 96, (byte) 126, (byte) 112, (byte) 119, (byte) 105, (byte) 56, (byte) 34}) + this.url + '\'' + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 106, (byte) 112, (byte) 113, (byte) 56}) + this.timeout + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 106, (byte) 112, (byte) 113, (byte) 86, (byte) 113, (byte) 100, (byte) 104, (byte) 117, (byte) 56}) + this.timeoutStamp + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 118, (byte) 108, (byte) 97, (byte) 56, (byte) 34}) + this.sid + '\'' + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 113, (byte) 100, (byte) 98, (byte) 56}) + this.tag + '}';
    }

    public void config() {
        this.timeoutStamp = System.currentTimeMillis() + ((long) (this.timeout * 1000));
        if (this.cdns.size() == 0) {
            this.cdns = Collections.singletonList(this.url);
        }
    }
}
