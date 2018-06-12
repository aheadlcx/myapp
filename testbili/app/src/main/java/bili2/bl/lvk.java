package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import bl.mpn.c;
import com.bilibili.bangumi.api.BangumiApiResponse;
import com.bilibili.bangumi.api.BangumiApiService;
import com.bilibili.bangumi.api.BiliBangumiSeason.Episode;
import com.bilibili.bangumi.api.BiliBangumiSeasonDetail;
import com.bilibili.commons.time.FastDateFormat;
import com.bilibili.lib.media.resolver.exception.ResolveMediaSourceException;
import com.bilibili.lib.media.resource.MediaResource;
import com.bilibili.lib.media.resource.PlayIndex;
import com.bilibili.lib.media.resource.Segment;
import com.bilibili.okretro.GeneralResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail.Page;
import tv.danmaku.bili.ui.video.api.VideoApiService;
import tv.danmaku.bili.ui.video.api.VideoApiService.VideoParamsMap;
import tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo;
import tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo.AvidError;
import tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo.CidError;
import tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo.PlayerIndexError;
import tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo.SeekInfo;
import tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo.SegmentError;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;

/* compiled from: BL */
public class lvk implements Runnable {
    public static final String a = hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 67, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 81, (byte) 100, (byte) 118, (byte) 110});
    private Context b;
    private WeakReference<a> c;
    private Handler d = new Handler(this, Looper.getMainLooper()) {
        final /* synthetic */ lvk a;

        public void handleMessage(Message message) {
            if (this.a.c != null) {
                a aVar = (a) this.a.c.get();
                switch (message.what) {
                    case 1:
                        esu.b(this.a.b, this.a.b.getString(2131694210));
                        if (aVar != null) {
                            aVar.a();
                            return;
                        }
                        return;
                    case 2:
                        esu.b(this.a.b, this.a.b.getString(2131694197));
                        if (aVar != null) {
                            aVar.b();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    };
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private long k;
    private boolean l;
    private String m;
    private volatile boolean n;
    private PlayerFeedbackInfo o;
    private long p;

    /* compiled from: BL */
    public interface a {
        void a();

        void b();
    }

    @BaseUrl("http://api.bilibili.com")
    /* compiled from: BL */
    public interface b {
        @FormUrlEncoded
        @POST("/x/feedback/playerCheck")
        gne<GeneralResponse<Void>> report(@Field("access_key") String str, @Field("mid") long j, @Field("region") String str2, @Field("school") String str3, @Field("check_time") long j2, @Field("aid") long j3, @Field("ip_change_times") int i, @Field("connect_speed") int i2, @Field("io_speed") int i3);
    }

    private boolean a(com.bilibili.lib.media.resource.PlayIndex r11, com.bilibili.lib.media.resource.Segment r12, String r13, tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo r14, tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo.SegmentError r15) {
        /* JADX: method processing error */
/*
Error: java.util.NoSuchElementException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1444)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1466)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:535)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:175)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:80)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:51)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
*/
        /*
        r10 = this;
        r1 = 1;
        r7 = 18;
        r0 = 0;
        r14.segmentError = r15;
        r3 = java.net.InetAddress.getAllByName(r13);	 Catch:{ UnknownHostException -> 0x0024 }
        r2 = new java.util.ArrayList;	 Catch:{ UnknownHostException -> 0x0024 }
        r4 = r3.length;	 Catch:{ UnknownHostException -> 0x0024 }
        r2.<init>(r4);	 Catch:{ UnknownHostException -> 0x0024 }
        r14.segmentIps = r2;	 Catch:{ UnknownHostException -> 0x0024 }
        r4 = r3.length;	 Catch:{ UnknownHostException -> 0x0024 }
        r2 = r0;	 Catch:{ UnknownHostException -> 0x0024 }
    L_0x0014:
        if (r2 >= r4) goto L_0x0031;	 Catch:{ UnknownHostException -> 0x0024 }
    L_0x0016:
        r5 = r3[r2];	 Catch:{ UnknownHostException -> 0x0024 }
        r6 = r14.segmentIps;	 Catch:{ UnknownHostException -> 0x0024 }
        r5 = r5.getHostAddress();	 Catch:{ UnknownHostException -> 0x0024 }
        r6.add(r5);	 Catch:{ UnknownHostException -> 0x0024 }
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x0024:
        r1 = move-exception;
        r1 = new byte[r7];
        r1 = {-22, -112, -112, -22, -97, -126, -25, -88, -84, -23, -111, -97, -22, -85, -66, -25, -69, -86};
        r1 = bl.hae.a(r1);
        r15.errorMsg = r1;
    L_0x0030:
        return r0;
    L_0x0031:
        r2 = 0;
        r6 = android.os.SystemClock.elapsedRealtime();
        r3 = 7;
        r3 = new byte[r3];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = {115, 112, 117, 105, 106, 100, 97};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.hae.a(r3);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r4 = r11.v;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = r3.equalsIgnoreCase(r4);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r3 != 0) goto L_0x005a;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x0048:
        r3 = 7;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = new byte[r3];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = {103, 100, 107, 98, 112, 104, 108};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.hae.a(r3);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r4 = r11.v;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = r3.equals(r4);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r3 == 0) goto L_0x00b6;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x005a:
        r5 = r1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x005b:
        r3 = r12.a;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r4 = r11.F;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r2 = r10.a(r3, r4);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r4 = r2.getResponseCode();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r5 == 0) goto L_0x008b;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x0069:
        r3 = 10;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = new byte[r3];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = {80, 118, 96, 119, 40, 68, 98, 96, 107, 113};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.hae.a(r3);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = r2.getRequestProperty(r3);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r14.segmentUA = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = r2.getURL();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = r3.toString();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r8 = "?";	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.ert.a(r3, r8);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r14.segmentUrl = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x008b:
        if (r4 != 0) goto L_0x00b8;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x008d:
        r3 = -1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x008e:
        r15.httpCode = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r8 = r8 - r6;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.responseTime = r8;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = r10.o;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r8 = r15.responseTime;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r8 = (int) r8;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3.segmentConnectTime = r8;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r4 == r3) goto L_0x00ba;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x00a2:
        r1 = 19;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = new byte[r1];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = {109, 113, 113, 117, -24, -123, -71, -23, -113, -114, -24, -81, -114, -22, -77, -115, -22, -73, -73};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = bl.hae.a(r1);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.errorMsg = r1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r2 == 0) goto L_0x0030;
    L_0x00b1:
        r2.disconnect();
        goto L_0x0030;
    L_0x00b6:
        r5 = r0;
        goto L_0x005b;
    L_0x00b8:
        r3 = r4;
        goto L_0x008e;
    L_0x00ba:
        r3 = r2.getContentLength();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r14.segmentSize = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r3 > 0) goto L_0x00d6;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x00c2:
        r1 = 25;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = new byte[r1];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = {-23, -103, -120, -21, -76, -71, -26, -102, -80, -22, -75, -87, -22, -65, -128, -21, -75, -127, -24, -94, -122, -21, -75, -127, 53};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = bl.hae.a(r1);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.errorMsg = r1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r2 == 0) goto L_0x0030;
    L_0x00d1:
        r2.disconnect();
        goto L_0x0030;
    L_0x00d6:
        r3 = r2.getContentType();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r3 == 0) goto L_0x00fd;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x00dc:
        r14.segmentType = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r5 == 0) goto L_0x00fd;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x00e0:
        r4 = "html";	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.ert.e(r3, r4);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r3 == 0) goto L_0x00fd;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
    L_0x00e9:
        r1 = 24;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = new byte[r1];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = {-23, -103, -120, -21, -76, -71, -21, -73, -126, -23, -105, -96, -25, -88, -119, -26, -83, -98, -24, -66, -76, -22, -111, -124};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = bl.hae.a(r1);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.errorMsg = r1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r2 == 0) goto L_0x0030;
    L_0x00f8:
        r2.disconnect();
        goto L_0x0030;
    L_0x00fd:
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r3 = r10.a(r2, r4, r14);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r3 != 0) goto L_0x010c;
    L_0x0105:
        if (r2 == 0) goto L_0x0030;
    L_0x0107:
        r2.disconnect();
        goto L_0x0030;
    L_0x010c:
        if (r2 == 0) goto L_0x0111;
    L_0x010e:
        r2.disconnect();
    L_0x0111:
        r0 = r1;
        goto L_0x0030;
    L_0x0114:
        r1 = move-exception;
        r3 = 18;
        r3 = new byte[r3];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = {-25, -88, -119, -26, -83, -98, -25, -80, -111, -23, -127, -86, -25, -71, -118, -23, -104, -71};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.hae.a(r3);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.errorMsg = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = r1.toString();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.exception = r1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = r10.o;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r4 = r4 - r6;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = (int) r4;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1.segmentConnectTime = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r2 == 0) goto L_0x0030;
    L_0x0134:
        r2.disconnect();
        goto L_0x0030;
    L_0x0139:
        r1 = move-exception;
        r3 = 18;
        r3 = new byte[r3];	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = {-25, -88, -119, -26, -83, -98, -25, -80, -111, -23, -127, -86, -22, -120, -75, -26, -101, -106};	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r3 = bl.hae.a(r3);	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.errorMsg = r3;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r1 = r1.toString();	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        r15.exception = r1;	 Catch:{ SocketTimeoutException -> 0x0114, IOException -> 0x0139, all -> 0x0154 }
        if (r2 == 0) goto L_0x0030;
    L_0x014f:
        r2.disconnect();
        goto L_0x0030;
    L_0x0154:
        r0 = move-exception;
        if (r2 == 0) goto L_0x015a;
    L_0x0157:
        r2.disconnect();
    L_0x015a:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.lvk.a(com.bilibili.lib.media.resource.PlayIndex, com.bilibili.lib.media.resource.Segment, java.lang.String, tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo, tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo$SegmentError):boolean");
    }

    private boolean a(com.bilibili.lib.media.resource.Segment r15, int r16, com.bilibili.lib.media.resource.PlayIndex r17, tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo r18) {
        /* JADX: method processing error */
/*
Error: java.util.NoSuchElementException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1444)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1466)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:535)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:175)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:80)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:51)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:290)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:167)
*/
        /*
        r14 = this;
        r9 = new tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo$SeekError;
        r9.<init>();
        r10 = new java.util.ArrayList;
        r2 = 3;
        r10.<init>(r2);
        r0 = r18;
        r0.segmentSeeks = r10;
        r0 = r18;
        r0.seekError = r9;
        r3 = 0;
        r2 = 0;
        r8 = r2;
    L_0x0016:
        r2 = 3;
        if (r8 >= r2) goto L_0x00c9;
    L_0x0019:
        r7 = new tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo$SeekInfo;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r7.<init>();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r10.add(r7);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r15.a;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r0 = r17;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = r0.F;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r3 = r14.a(r2, r4);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = 1;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = 3 - r8;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r2 << r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r16 / r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = 1;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r5 = 2 - r8;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = r4 << r5;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = r16 / r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r5 = 5;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r5 = new byte[r5];	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r5 = {87, 100, 107, 98, 96};	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r5 = bl.hae.a(r5);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r6 = new java.lang.StringBuilder;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r6.<init>();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r11 = 6;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r11 = new byte[r11];	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r11 = {103, 124, 113, 96, 118, 56};	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r11 = bl.hae.a(r11);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r6 = r6.append(r11);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r6.append(r2);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r6 = "-";	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r2.append(r6);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r2.append(r4);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r2.toString();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r3.addRequestProperty(r5, r2);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r3.getResponseCode();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r7.httpCode = r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.httpCode = r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r12 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = r12 - r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r7.responseTime = r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.responseTime = r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r6 = 206; // 0xce float:2.89E-43 double:1.02E-321;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        if (r2 == r6) goto L_0x0098;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
    L_0x0084:
        r2 = 19;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = {109, 113, 113, 117, -24, -123, -71, -23, -113, -114, -24, -81, -114, -22, -77, -115, -22, -73, -73};	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = bl.hae.a(r2);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.errorMsg = r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = 0;
        if (r3 == 0) goto L_0x0097;
    L_0x0094:
        r3.disconnect();
    L_0x0097:
        return r2;
    L_0x0098:
        r12 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1));
        if (r2 <= 0) goto L_0x00b2;
    L_0x009e:
        r2 = 18;
        r2 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = {-22, -100, -126, -22, -75, -101, -23, -104, -71, -26, -104, -69, -22, -77, -115, -22, -73, -73};	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = bl.hae.a(r2);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.errorMsg = r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = 0;
        if (r3 == 0) goto L_0x0097;
    L_0x00ae:
        r3.disconnect();
        goto L_0x0097;
    L_0x00b2:
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r2 = r14;
        r6 = r18;
        r2 = r2.a(r3, r4, r6, r7);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        if (r2 != 0) goto L_0x00c4;
    L_0x00bd:
        r2 = 0;
        if (r3 == 0) goto L_0x0097;
    L_0x00c0:
        r3.disconnect();
        goto L_0x0097;
    L_0x00c4:
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0016;
    L_0x00c9:
        if (r3 == 0) goto L_0x00ce;
    L_0x00cb:
        r3.disconnect();
    L_0x00ce:
        r2 = 1;
        goto L_0x0097;
    L_0x00d0:
        r2 = move-exception;
        r4 = 18;
        r4 = new byte[r4];	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = {-25, -88, -119, -26, -83, -98, -25, -80, -111, -23, -127, -86, -25, -71, -118, -23, -104, -71};	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = bl.hae.a(r4);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.errorMsg = r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r2.toString();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.exception = r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = 0;
        if (r3 == 0) goto L_0x0097;
    L_0x00e7:
        r3.disconnect();
        goto L_0x0097;
    L_0x00eb:
        r2 = move-exception;
        r4 = 18;
        r4 = new byte[r4];	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = {-25, -88, -119, -26, -83, -98, -25, -80, -111, -23, -127, -86, -22, -120, -75, -26, -101, -106};	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r4 = bl.hae.a(r4);	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.errorMsg = r4;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = r2.toString();	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r9.exception = r2;	 Catch:{ SocketTimeoutException -> 0x00d0, IOException -> 0x00eb, all -> 0x0106 }
        r2 = 0;
        if (r3 == 0) goto L_0x0097;
    L_0x0102:
        r3.disconnect();
        goto L_0x0097;
    L_0x0106:
        r2 = move-exception;
        if (r3 == 0) goto L_0x010c;
    L_0x0109:
        r3.disconnect();
    L_0x010c:
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.lvk.a(com.bilibili.lib.media.resource.Segment, int, com.bilibili.lib.media.resource.PlayIndex, tv.danmaku.bili.ui.video.feedback.PlayerFeedbackInfo):boolean");
    }

    public lvk(Context context, a aVar, String str, String str2, int i, int i2, long j, boolean z, String str3, String str4, String str5) {
        this.b = context.getApplicationContext();
        this.e = str;
        this.f = str2;
        this.g = str4;
        this.h = str5;
        this.i = i;
        this.j = i2;
        this.k = j;
        this.l = z;
        this.m = str3;
        this.c = new WeakReference(aVar);
    }

    public void run() {
        String str = null;
        try {
            str = b();
        } catch (Exception e) {
        }
        if (TextUtils.isEmpty(str)) {
            this.d.sendEmptyMessage(2);
        } else if (TextUtils.equals(str, "1")) {
            this.d.sendEmptyMessage(1);
        } else {
            a(this.e, this.f, str);
            this.d.sendEmptyMessage(1);
        }
    }

    private String b() throws Exception {
        a(this.i, this.j);
        if (!TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.g)) {
            Object a = a(this.o);
            if (TextUtils.isEmpty(a)) {
                BLog.e(hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 67, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 81, (byte) 100, (byte) 118, (byte) 110}), hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 37, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 118, (byte) 100, (byte) 115, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}));
                return null;
            }
            File file = new File(a);
            if (!file.isFile() || !file.exists()) {
                return null;
            }
            a = lti.a(file.getAbsolutePath());
            if (!file.delete()) {
                file.getAbsoluteFile().delete();
            }
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            return (String) ((JSONObject) new JSONObject(a).get("data")).get("url");
        } else if (c()) {
            return "1";
        } else {
            return null;
        }
    }

    private void a(int i, int i2) {
        if (!this.n) {
            String a;
            ResolveResourceParams resolveResourceParams;
            this.o = new PlayerFeedbackInfo();
            this.o.avid = i;
            this.o.cid = i2;
            this.o.feedbackId = this.e;
            this.o.feedbackContent = this.f;
            PlayerFeedbackInfo playerFeedbackInfo = this.o;
            if (this.l) {
                a = hae.a(new byte[]{(byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108});
            } else {
                a = hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106});
            }
            playerFeedbackInfo.type = a;
            this.o.player = c.e(this.b);
            this.o.renderer = c.a(this.b);
            this.o.time = FastDateFormat.a(2, 2).a(System.currentTimeMillis());
            this.p = System.currentTimeMillis();
            this.o.localIp = a();
            this.o.bssId = a(this.b);
            this.o.wifiMac = mcu.a(this.b);
            try {
                this.o.localDns = d();
            } catch (Exception e) {
            }
            if (this.l) {
                List<Episode> a2 = a(String.valueOf(this.k), this.o);
                if (a2 == null) {
                    this.o.errorCode = 1;
                    return;
                } else if (!this.n) {
                    resolveResourceParams = null;
                    for (Episode episode : a2) {
                        if (i == episode.mAvid) {
                            ResolveResourceParams resolveResourceParams2 = new ResolveResourceParams();
                            resolveResourceParams2.mSeasonId = String.valueOf(this.k);
                            resolveResourceParams2.mAvid = episode.mAvid;
                            resolveResourceParams2.mEpisodeId = episode.mId;
                            resolveResourceParams2.mEpCover = episode.mCover;
                            resolveResourceParams2.mPageIndex = episode.mIndex;
                            resolveResourceParams2.mPageTitle = episode.mTitle;
                            resolveResourceParams2.mCid = episode.mDanmakuId == null ? 0 : episode.mDanmakuId.intValue();
                            resolveResourceParams2.mPage = episode.mPage;
                            resolveResourceParams2.mFrom = hae.a(new byte[]{(byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108});
                            resolveResourceParams2.mPageTitle = episode.mTitle;
                            this.o.episodePage = episode.mPage;
                            this.o.episodeTitle = episode.mTitle;
                            resolveResourceParams = resolveResourceParams2;
                        }
                    }
                } else {
                    return;
                }
            }
            List<Page> a3 = a(i, this.o);
            if (a3 == null) {
                this.o.errorCode = 1;
                return;
            } else if (!this.n) {
                resolveResourceParams = null;
                for (Page page : a3) {
                    if (i2 == page.mCid) {
                        ResolveResourceParams resolveResourceParams3 = new ResolveResourceParams(page.mFrom, page.mCid, page.mVid, page.mRawVid, page.mWebLink, page.mHasAlias, i, page.mPage, page.mTitle, page.mTid);
                        resolveResourceParams3.mPageTitle = page.mTitle;
                        this.o.episodePage = page.mPage;
                        this.o.episodeTitle = page.mTitle;
                        resolveResourceParams = resolveResourceParams3;
                    }
                }
            } else {
                return;
            }
            if (resolveResourceParams == null) {
                this.o.errorCode = 1;
                this.o.avidError.errorMsg = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75});
                return;
            }
            PlayIndex a4 = a(resolveResourceParams, this.o);
            if (a4 == null) {
                this.o.errorCode = 2;
                return;
            }
            this.o.playerIndexQuality = a4.x;
            this.o.playerIndexSize = a4.A.size();
            if (!this.n) {
                for (int i3 = 0; i3 < this.o.playerIndexSize; i3++) {
                    PlayerIndexError a5 = a(a4, i3);
                    if (a5 != null) {
                        a5.errorIndex = i3;
                        this.o.playerIndexError = a5;
                        this.o.errorCode = 3;
                        return;
                    }
                }
                if (!this.n) {
                    SegmentError segmentError = new SegmentError();
                    if (a4.a() == null) {
                        segmentError.errorMsg = hae.a(new byte[]{(byte) -23, (byte) -67, (byte) -82, (byte) -23, (byte) -109, (byte) -122, (byte) -22, (byte) -121, (byte) -119, (byte) -23, (byte) -95, (byte) -70, (byte) -21, (byte) -80, (byte) -82, (byte) -23, (byte) -114, (byte) -96});
                        this.o.errorCode = 4;
                        return;
                    }
                    Segment a6 = a4.a();
                    Object obj = TextUtils.isEmpty(a6.a) ? !TextUtils.isEmpty(a6.d) ? a6.d : gmy.d : a6.a;
                    if (TextUtils.isEmpty(obj)) {
                        segmentError.errorMsg = hae.a(new byte[]{(byte) -22, (byte) -121, (byte) -119, (byte) -23, (byte) -95, (byte) -70, (byte) -22, (byte) -109, (byte) -65, (byte) -22, (byte) -110, (byte) -113, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75});
                        this.o.errorCode = 4;
                    }
                    String host = Uri.parse(obj).getHost();
                    this.o.segmentHost = host;
                    if (!this.n) {
                        if (!a(a4, a6, host, this.o, segmentError)) {
                            this.o.errorCode = 4;
                        } else if (!this.n && !a(a6, this.o.segmentSize, a4, this.o)) {
                            this.o.errorCode = 5;
                        }
                    }
                }
            }
        }
    }

    private List<Page> a(int i, PlayerFeedbackInfo playerFeedbackInfo) {
        gne a = ((VideoApiService) gnd.a(VideoApiService.class)).getVideoDetails(new VideoParamsMap(i), eva.a(this.b).j()).a(new lup());
        StringBuilder stringBuilder = new StringBuilder();
        AvidError avidError = new AvidError();
        playerFeedbackInfo.avidError = avidError;
        try {
            kqs g = a.g();
            avidError.httpCode = g.b();
            if (!g.e() || g.f() == null) {
                stringBuilder.append(hae.a(new byte[]{(byte) -25, (byte) -127, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86}));
                return null;
            } else if (((GeneralResponse) g.f()).code != 0) {
                stringBuilder.append(hae.a(new byte[]{(byte) -25, (byte) -127, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -22, (byte) -120, (byte) -75, (byte) -26, (byte) -101, (byte) -106}));
                avidError.responseCode = ((GeneralResponse) g.f()).code;
                avidError.responseMsg = ((GeneralResponse) g.f()).message;
                return null;
            } else {
                BiliVideoDetail biliVideoDetail = (BiliVideoDetail) ((GeneralResponse) g.f()).data;
                if (biliVideoDetail == null || biliVideoDetail.mPageList == null || biliVideoDetail.mPageList.isEmpty()) {
                    stringBuilder.append(hae.a(new byte[]{(byte) -25, (byte) -127, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75}));
                    return null;
                }
                playerFeedbackInfo.episodeTotalSize = biliVideoDetail.mPageList.size();
                return biliVideoDetail.mPageList;
            }
        } catch (Throwable e) {
            Throwable a2 = erw.a(e);
            if (a2 instanceof InterruptedIOException) {
                stringBuilder.append("\u8d85\u65f6");
            } else if (a2 instanceof CertificateException) {
                stringBuilder.append(hae.a(new byte[]{(byte) 77, (byte) 81, (byte) 81, (byte) 85, (byte) 86, (byte) 37, (byte) -25, (byte) -95, (byte) -85, (byte) -25, (byte) -96, (byte) -114, (byte) -22, (byte) -120, (byte) -75, (byte) -26, (byte) -101, (byte) -106}));
            } else if (a2 instanceof IOException) {
                stringBuilder.append(hae.a(new byte[]{(byte) -21, (byte) -73, (byte) -127, (byte) -23, (byte) -109, (byte) -126, (byte) -22, (byte) -123, (byte) -82, (byte) -22, (byte) -106, (byte) -89, (byte) -25, (byte) -80, (byte) -111, (byte) -23, (byte) -127, (byte) -86, (byte) -22, (byte) -120, (byte) -75, (byte) -26, (byte) -101, (byte) -106}));
            } else if (a2 != null) {
                stringBuilder.append(a2.getClass().getSimpleName());
            } else {
                stringBuilder.append(e.getClass().getSimpleName());
            }
            avidError.errorMsg = stringBuilder.toString();
            return null;
        }
    }

    private List<Episode> a(String str, PlayerFeedbackInfo playerFeedbackInfo) {
        gne seasonDetail = ((BangumiApiService) gnd.a(BangumiApiService.class)).getSeasonDetail(bbx.b(this.b), str);
        seasonDetail.a(new bbm(this.b));
        StringBuilder stringBuilder = new StringBuilder();
        AvidError avidError = new AvidError();
        playerFeedbackInfo.avidError = avidError;
        try {
            kqs g = seasonDetail.g();
            avidError.httpCode = g.b();
            if (!g.e() || g.f() == null) {
                stringBuilder.append(hae.a(new byte[]{(byte) -25, (byte) -127, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86}));
                return null;
            } else if (((BangumiApiResponse) g.f()).code != 0) {
                stringBuilder.append(hae.a(new byte[]{(byte) -25, (byte) -127, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -22, (byte) -120, (byte) -75, (byte) -26, (byte) -101, (byte) -106}));
                avidError.responseCode = ((BangumiApiResponse) g.f()).code;
                avidError.responseMsg = ((BangumiApiResponse) g.f()).message;
                return null;
            } else {
                BiliBangumiSeasonDetail biliBangumiSeasonDetail = (BiliBangumiSeasonDetail) ((BangumiApiResponse) g.f()).result;
                if (biliBangumiSeasonDetail == null || biliBangumiSeasonDetail.isEpisodesEmpty()) {
                    stringBuilder.append(hae.a(new byte[]{(byte) -25, (byte) -127, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -22, (byte) -121, (byte) -104, (byte) -25, (byte) -82, (byte) -89, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75}));
                    return null;
                }
                playerFeedbackInfo.episodeTotalSize = biliBangumiSeasonDetail.mEpisodes.size();
                return biliBangumiSeasonDetail.mEpisodes;
            }
        } catch (Throwable e) {
            Throwable a = erw.a(e);
            if (a instanceof InterruptedIOException) {
                stringBuilder.append("\u8d85\u65f6");
            } else if (a instanceof CertificateException) {
                stringBuilder.append(hae.a(new byte[]{(byte) 77, (byte) 81, (byte) 81, (byte) 85, (byte) 86, (byte) 37, (byte) -25, (byte) -95, (byte) -85, (byte) -25, (byte) -96, (byte) -114, (byte) -22, (byte) -120, (byte) -75, (byte) -26, (byte) -101, (byte) -106}));
            } else if (a instanceof IOException) {
                stringBuilder.append(hae.a(new byte[]{(byte) -21, (byte) -73, (byte) -127, (byte) -23, (byte) -109, (byte) -126, (byte) -22, (byte) -123, (byte) -82, (byte) -22, (byte) -106, (byte) -89, (byte) -25, (byte) -80, (byte) -111, (byte) -23, (byte) -127, (byte) -86, (byte) -22, (byte) -120, (byte) -75, (byte) -26, (byte) -101, (byte) -106}));
            } else if (a != null) {
                stringBuilder.append(a.getClass().getSimpleName());
            } else {
                stringBuilder.append(e.getClass().getSimpleName());
            }
            avidError.errorMsg = stringBuilder.toString();
            return null;
        }
    }

    private PlayIndex a(ResolveResourceParams resolveResourceParams, PlayerFeedbackInfo playerFeedbackInfo) {
        fej a;
        String a2;
        ResolveMediaSourceException e;
        JSONException e2;
        Exception e3;
        eva a3 = eva.a(this.b);
        String j = a3.j();
        long i = a3.i();
        long k = a3.k();
        if (a3.l()) {
            a = fej.a(j, i, k);
        } else {
            a = null;
        }
        resolveResourceParams.mExpectedQuality = bl.ktc.b.d(this.b);
        playerFeedbackInfo.currentQuality = this.m;
        playerFeedbackInfo.episodeFrom = resolveResourceParams.mFrom;
        playerFeedbackInfo.episodeQuality = resolveResourceParams.mExpectedQuality;
        playerFeedbackInfo.resolveCodecMode = resolveResourceParams.mCodecMode;
        playerFeedbackInfo.resolveCdnPlay = resolveResourceParams.mResolveBiliCdnPlay;
        CidError cidError = new CidError();
        playerFeedbackInfo.cidError = cidError;
        j = gmy.d;
        try {
            a2 = fek.a(this.b, resolveResourceParams.g(), a, resolveResourceParams.h());
            try {
                if (TextUtils.isEmpty(a2)) {
                    cidError.errorMsg = hae.a(new byte[]{(byte) 73, (byte) 112, (byte) 100, (byte) -25, (byte) -80, (byte) -101, (byte) -22, (byte) -108, (byte) -111, (byte) -22, (byte) -113, (byte) -77, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75});
                } else {
                    MediaResource mediaResource = new MediaResource();
                    mediaResource.a(new JSONObject(a2));
                    if (mediaResource.c()) {
                        return mediaResource.d();
                    }
                    cidError.errorMsg = hae.a(new byte[]{(byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) -21, (byte) -73, (byte) -126, (byte) -22, Byte.MIN_VALUE, (byte) -96, (byte) -23, (byte) -99, (byte) -94});
                }
            } catch (ResolveMediaSourceException e4) {
                e = e4;
                cidError.errorMsg = hae.a(new byte[]{(byte) 73, (byte) 112, (byte) 100, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86});
                cidError.exception = e.toString();
                cidError.result = a2;
                return null;
            } catch (JSONException e5) {
                e2 = e5;
                cidError.errorMsg = hae.a(new byte[]{(byte) 79, (byte) 118, (byte) 106, (byte) 107, (byte) -23, (byte) -102, (byte) -65, (byte) -23, (byte) -126, (byte) -95, (byte) -22, (byte) -77, (byte) -115, (byte) -22, (byte) -73, (byte) -73});
                cidError.exception = e2.toString();
                cidError.result = a2;
                return null;
            } catch (Exception e6) {
                e3 = e6;
                cidError.errorMsg = hae.a(new byte[]{(byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86});
                cidError.exception = e3.toString();
                cidError.result = a2;
                return null;
            }
        } catch (ResolveMediaSourceException e7) {
            ResolveMediaSourceException resolveMediaSourceException = e7;
            a2 = j;
            e = resolveMediaSourceException;
            cidError.errorMsg = hae.a(new byte[]{(byte) 73, (byte) 112, (byte) 100, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86});
            cidError.exception = e.toString();
            cidError.result = a2;
            return null;
        } catch (JSONException e8) {
            JSONException jSONException = e8;
            a2 = j;
            e2 = jSONException;
            cidError.errorMsg = hae.a(new byte[]{(byte) 79, (byte) 118, (byte) 106, (byte) 107, (byte) -23, (byte) -102, (byte) -65, (byte) -23, (byte) -126, (byte) -95, (byte) -22, (byte) -77, (byte) -115, (byte) -22, (byte) -73, (byte) -73});
            cidError.exception = e2.toString();
            cidError.result = a2;
            return null;
        } catch (Exception e9) {
            Exception exception = e9;
            a2 = j;
            e3 = exception;
            cidError.errorMsg = hae.a(new byte[]{(byte) -25, (byte) -88, (byte) -119, (byte) -26, (byte) -83, (byte) -98, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86});
            cidError.exception = e3.toString();
            cidError.result = a2;
            return null;
        }
        cidError.result = a2;
        return null;
    }

    private PlayerIndexError a(PlayIndex playIndex, int i) {
        PlayerIndexError playerIndexError = new PlayerIndexError();
        try {
            Segment segment = (Segment) playIndex.A.get(i);
            if (segment == null) {
                playerIndexError.errorMsg = "\u5206\u6bb5\u4e3a\u7a7a";
                return playerIndexError;
            }
            if (TextUtils.isEmpty(segment.a) && TextUtils.isEmpty(segment.d)) {
                fei bl_fei = new fei(playIndex, segment);
                Object a = fek.a(this.b, bl_fei, bl_fei.c(), false);
                if (TextUtils.isEmpty(a)) {
                    playerIndexError.errorMsg = hae.a(new byte[]{(byte) -22, (byte) -121, (byte) -119, (byte) -23, (byte) -95, (byte) -70, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -25, (byte) -80, (byte) -101, (byte) -22, (byte) -108, (byte) -111, (byte) -22, (byte) -113, (byte) -77, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75});
                    return playerIndexError;
                }
                try {
                    segment.a(new JSONObject(a));
                } catch (JSONException e) {
                    playerIndexError.errorMsg = hae.a(new byte[]{(byte) -22, (byte) -121, (byte) -119, (byte) -23, (byte) -95, (byte) -70, (byte) 79, (byte) 118, (byte) 106, (byte) 107, (byte) -25, (byte) -88, (byte) -84, (byte) -23, (byte) -111, (byte) -97, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86});
                    return playerIndexError;
                }
            }
            if (TextUtils.isEmpty(segment.a) && TextUtils.isEmpty(segment.d)) {
                playerIndexError.errorMsg = hae.a(new byte[]{(byte) -22, (byte) -121, (byte) -119, (byte) -23, (byte) -95, (byte) -70, (byte) -24, (byte) -107, (byte) -117, (byte) 80, (byte) 87, (byte) 73, (byte) -21, (byte) -73, (byte) -75, (byte) -24, (byte) -90, (byte) -75});
                return playerIndexError;
            }
            return null;
        } catch (Exception e2) {
            playerIndexError.errorMsg = e2.toString();
        }
    }

    private HttpURLConnection a(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        if (TextUtils.isEmpty(str2)) {
            str2 = krl.b;
        }
        httpURLConnection.setRequestProperty(hae.a(new byte[]{(byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 40, (byte) 68, (byte) 98, (byte) 96, (byte) 107, (byte) 113}), str2);
        return httpURLConnection;
    }

    private boolean a(HttpURLConnection httpURLConnection, long j, PlayerFeedbackInfo playerFeedbackInfo) {
        byte[] bArr = new byte[8192];
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = 0;
            int i = 0;
            do {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                j2 += (long) read;
                i = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            } while (((long) i) < j);
            if (j2 == 0 || i == 0) {
                playerFeedbackInfo.segmentError.errorMsg = "EOF";
                if (inputStream == null) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (IOException e) {
                    return false;
                }
            }
            float f = ((((float) j2) * 1000.0f) / 1024.0f) / ((float) i);
            playerFeedbackInfo.segmentSpeed = f;
            if (f < 200.0f) {
                playerFeedbackInfo.segmentError.errorMsg = hae.a(new byte[]{(byte) -25, (byte) -80, (byte) -111, (byte) -23, (byte) -127, (byte) -86, (byte) -26, (byte) -113, (byte) -112, (byte) -22, (byte) -75, (byte) -87, (byte) -25, (byte) -80, (byte) -120, (byte) -21, (byte) -78, (byte) -127});
                if (inputStream == null) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (IOException e2) {
                    return false;
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
            return true;
        } catch (IOException e4) {
            playerFeedbackInfo.segmentError.errorMsg = "\u8bfb\u53d6\u5931\u8d25";
            playerFeedbackInfo.segmentError.exception = e4.toString();
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e5) {
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                }
            }
        }
    }

    private boolean a(HttpURLConnection httpURLConnection, long j, PlayerFeedbackInfo playerFeedbackInfo, SeekInfo seekInfo) {
        byte[] bArr = new byte[8192];
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = 0;
            int i = 0;
            do {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                j2 += (long) read;
                i = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            } while (((long) i) < j);
            if (j2 == 0 || i == 0) {
                playerFeedbackInfo.seekError.errorMsg = "EOF";
                if (inputStream == null) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (IOException e) {
                    return false;
                }
            }
            float f = ((((float) j2) * 1000.0f) / 1024.0f) / ((float) i);
            seekInfo.seekSpeed = f;
            if (f < 200.0f) {
                playerFeedbackInfo.seekError.errorMsg = hae.a(new byte[]{(byte) -25, (byte) -80, (byte) -111, (byte) -23, (byte) -127, (byte) -86, (byte) -26, (byte) -113, (byte) -112, (byte) -22, (byte) -75, (byte) -87, (byte) -25, (byte) -80, (byte) -120, (byte) -21, (byte) -78, (byte) -127});
                if (inputStream == null) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (IOException e2) {
                    return false;
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
            return true;
        } catch (IOException e4) {
            playerFeedbackInfo.seekError.errorMsg = "\u8bfb\u53d6\u5931\u8d25";
            playerFeedbackInfo.seekError.exception = e4.toString();
            if (inputStream == null) {
                return false;
            }
            try {
                inputStream.close();
                return false;
            } catch (IOException e5) {
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                }
            }
        }
    }

    public String a(PlayerFeedbackInfo playerFeedbackInfo) {
        OutputStream outputStream;
        IOException iOException;
        Throwable th;
        String str = null;
        if (playerFeedbackInfo != null) {
            String f = kwp.f(this.b, "log");
            if (f != null) {
                StringBuilder stringBuilder = new StringBuilder(f);
                if (f.endsWith("/")) {
                    stringBuilder.append(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90}));
                    stringBuilder.append(System.currentTimeMillis());
                } else {
                    stringBuilder.append(File.separator);
                    stringBuilder.append(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90}));
                    stringBuilder.append(System.currentTimeMillis());
                }
                stringBuilder.append(".log");
                File file = new File(stringBuilder.toString());
                File parentFile = file.getParentFile();
                OutputStream fileOutputStream;
                try {
                    if (!parentFile.exists() && parentFile.isDirectory()) {
                        parentFile.mkdirs();
                    }
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(com.alibaba.fastjson.JSONObject.a(playerFeedbackInfo).getBytes(Charset.forName("UTF-8")));
                        StringBuilder stringBuilder2 = new StringBuilder(f);
                        if (f.endsWith("/")) {
                            stringBuilder2.append(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90}));
                            stringBuilder2.append(System.currentTimeMillis());
                        } else {
                            stringBuilder.append(File.separator);
                            stringBuilder2.append(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 90}));
                            stringBuilder2.append(System.currentTimeMillis());
                        }
                        stringBuilder2.append(".zip");
                        File file2 = new File(stringBuilder2.toString());
                        List arrayList = new ArrayList(1);
                        arrayList.add(file);
                        File[] logFilesByDate = BLog.getLogFilesByDate(1, new Date(System.currentTimeMillis()));
                        if (logFilesByDate != null) {
                            for (File file3 : logFilesByDate) {
                                if (ert.e(file3.getName(), hae.a(new byte[]{(byte) 108, (byte) 111, (byte) 110, (byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 108, (byte) 102, (byte) 96}))) {
                                    arrayList.add(file3);
                                } else if (ert.e(file3.getName(), "main")) {
                                    arrayList.add(file3);
                                }
                            }
                        }
                        a(arrayList, file2);
                        if (!file.delete()) {
                            file.getAbsoluteFile().delete();
                        }
                        str = file2.toString();
                        erz.a(fileOutputStream);
                    } catch (FileNotFoundException e) {
                    } catch (IOException e2) {
                        IOException iOException2 = e2;
                        outputStream = fileOutputStream;
                        iOException = iOException2;
                    }
                } catch (FileNotFoundException e3) {
                    fileOutputStream = null;
                    try {
                        BLog.d(hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 67, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 81, (byte) 100, (byte) 118, (byte) 110}), hae.a(new byte[]{(byte) 118, (byte) 100, (byte) 115, (byte) 96, (byte) 37, (byte) 63, (byte) 37, (byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 75, (byte) 106, (byte) 113, (byte) 67, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 64, (byte) 125, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107}));
                        erz.a(fileOutputStream);
                        return str;
                    } catch (Throwable th2) {
                        th = th2;
                        erz.a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e4) {
                    iOException = e4;
                    outputStream = null;
                    try {
                        BLog.d(hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 67, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 81, (byte) 100, (byte) 118, (byte) 110}), iOException.toString());
                        erz.a(outputStream);
                        return str;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = outputStream;
                        erz.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    fileOutputStream = null;
                    th = th5;
                    erz.a(fileOutputStream);
                    throw th;
                }
            }
        }
        return str;
    }

    private void a(String str, String str2, String str3) {
        lti.a(str3, null, str2, str, "view");
    }

    private boolean c() {
        boolean z = false;
        if (this.o != null) {
            eva a = eva.a(blg.a());
            Object j = a.j();
            if (!TextUtils.isEmpty(j)) {
                try {
                    z = ((b) gnd.a(b.class)).report(j, a.i(), this.g, this.h, this.p / 1000, (long) this.i, z, this.o.segmentConnectTime, (int) this.o.segmentSpeed).g().e();
                } catch (Exception e) {
                }
            }
        }
        return z;
    }

    private static boolean a(List<File> list, File file) {
        InputStream inputStream;
        Throwable th;
        BufferedInputStream bufferedInputStream;
        ZipOutputStream zipOutputStream = null;
        if (list == null || list.size() == 0) {
            return false;
        }
        ZipOutputStream zipOutputStream2;
        BufferedInputStream bufferedInputStream2;
        try {
            zipOutputStream2 = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                zipOutputStream2.setLevel(9);
                bufferedInputStream2 = null;
                for (File file2 : list) {
                    try {
                        InputStream bufferedInputStream3 = new BufferedInputStream(new FileInputStream(file2), 2048);
                        try {
                            zipOutputStream2.putNextEntry(new ZipEntry(file2.getName()));
                            a(bufferedInputStream3, (OutputStream) zipOutputStream2);
                            inputStream = bufferedInputStream3;
                        } catch (Exception e) {
                            zipOutputStream = zipOutputStream2;
                            InputStream inputStream2 = bufferedInputStream3;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = bufferedInputStream3;
                        }
                    } catch (Exception e2) {
                        zipOutputStream = zipOutputStream2;
                        bufferedInputStream = bufferedInputStream2;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                if (zipOutputStream2 != null) {
                    try {
                        zipOutputStream2.close();
                    } catch (IOException e3) {
                    }
                }
                if (bufferedInputStream2 == null) {
                    return true;
                }
                try {
                    bufferedInputStream2.close();
                    return true;
                } catch (IOException e4) {
                    return true;
                }
            } catch (Exception e5) {
                ZipOutputStream zipOutputStream3 = zipOutputStream2;
                bufferedInputStream = null;
                zipOutputStream = zipOutputStream3;
                if (zipOutputStream != null) {
                    try {
                        zipOutputStream.close();
                    } catch (IOException e6) {
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e7) {
                    }
                }
                return false;
            } catch (Throwable th4) {
                bufferedInputStream2 = null;
                th = th4;
                if (zipOutputStream2 != null) {
                    try {
                        zipOutputStream2.close();
                    } catch (IOException e8) {
                    }
                }
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e9) {
                    }
                }
                throw th;
            }
        } catch (Exception e10) {
            bufferedInputStream = null;
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            return false;
        } catch (Throwable th42) {
            zipOutputStream2 = null;
            bufferedInputStream2 = null;
            th = th42;
            if (zipOutputStream2 != null) {
                zipOutputStream2.close();
            }
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            throw th;
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8196];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return;
                }
            } catch (Throwable e) {
                ibn.a(e);
                return;
            }
        }
    }

    public static String a() {
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        return inetAddress.getHostAddress();
                    }
                }
            }
        } catch (Exception e) {
        }
        return "0";
    }

    public String a(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                return "0";
            }
            return connectionInfo.getBSSID();
        } catch (Exception e) {
            return "0";
        }
    }

    private String d() throws Exception {
        for (String a : new String[]{hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 113, (byte) 43, (byte) 97, (byte) 107, (byte) 118, (byte) 52}), hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 113, (byte) 43, (byte) 97, (byte) 107, (byte) 118, (byte) 55}), hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 113, (byte) 43, (byte) 97, (byte) 107, (byte) 118, (byte) 54}), hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 113, (byte) 43, (byte) 97, (byte) 107, (byte) 118, (byte) 49})}) {
            String a2 = est.a(a2);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return gmy.d;
    }
}
