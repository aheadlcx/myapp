package bili.bl;

import android.content.Context;
import android.net.Uri;
import com.bilibili.api.BiliApiException;
import com.bilibili.bilibililive.api.entity.LiveStreamingSpeedUpInfo;
import com.bilibili.bilibililive.api.exceptions.LiveBiliApiException;
import java.util.HashMap;
import java.util.Set;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;

/* compiled from: BL */
public class cik {
    private static final String a = hae.a(new byte[]{(byte) 70, (byte) 100, (byte) 104, (byte) 96, (byte) 119, (byte) 100, (byte) 86, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104, (byte) 108, (byte) 107, (byte) 98, (byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 106, (byte) 119, (byte) 124});
    private Context b;

    public cik(Context context) {
        this.b = context;
    }

    public void a(final String str, Subscriber<LiveStreamingSpeedUpInfo> subscriber) {
        Observable.create(new OnSubscribe<LiveStreamingSpeedUpInfo>(this) {
            final /* synthetic */ cik b;

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super LiveStreamingSpeedUpInfo> subscriber) {
                try {
                    civ.a(ciy.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 116, (byte) 90, (byte) 103, (byte) 96, (byte) 118, (byte) 113, (byte) 90, (byte) 107, (byte) 106, (byte) 97, (byte) 96})));
                    Uri parse = Uri.parse(str);
                    Set<String> queryParameterNames = parse.getQueryParameterNames();
                    HashMap hashMap = new HashMap(queryParameterNames.size());
                    for (String str : queryParameterNames) {
                        hashMap.put(str, parse.getQueryParameter(str));
                    }
                    String str2 = parse.getPath();
                    if (str2.indexOf("/") >= 0) {
                        str2 = str2.substring(1, str2.length());
                    }
                    LiveStreamingSpeedUpInfo a = bme.a().a(parse.getScheme() + "://" + parse.getHost() + "/" + str2, hashMap);
                    civ.a(ciy.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 117, (byte) 90, (byte) 103, (byte) 96, (byte) 118, (byte) 113, (byte) 90, (byte) 107, (byte) 106, (byte) 97, (byte) 96})));
                    subscriber.onNext(a);
                    subscriber.onCompleted();
                } catch (BiliApiException e) {
                    subscriber.onError(new LiveBiliApiException(e.mCode, e.getMessage()));
                } catch (Throwable e2) {
                    subscriber.onError(new LiveBiliApiException(e2));
                }
            }
        }).subscribeOn(cnk.b()).observeOn(cnk.a()).subscribe(subscriber);
    }
}
