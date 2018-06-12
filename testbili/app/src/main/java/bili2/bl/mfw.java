package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import bl.kly.a;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import tv.danmaku.android.log.BLog;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;
import tv.danmaku.videoplayer.core.danmaku.DanmakuLoadException;
import tv.danmaku.videoplayer.core.danmaku.DanmakuParser.Filter;
import tv.danmaku.videoplayer.core.danmaku.IDanmakuParams;

/* compiled from: BL */
public class mfw {
    public static Pattern a;
    static final /* synthetic */ boolean b = (!mfw.class.desiredAssertionStatus());
    private static final String c = mfw.class.getName();
    private static final String d = hae.a(new byte[]{(byte) 42, (byte) 125, (byte) 42, (byte) 115, (byte) 52, (byte) 42, (byte) 97, (byte) 104, (byte) 42, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 43, (byte) 118, (byte) 106});

    public static String a(Context context, String str) {
        long i = eva.a(context).i();
        Object j = eva.a(context).j();
        Builder q = HttpUrl.f(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 117, (byte) 108, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 125, (byte) 42, (byte) 115, (byte) 52, (byte) 42, (byte) 97, (byte) 104, (byte) 42, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 43, (byte) 118, (byte) 106})).q();
        q.a("oid", str);
        if (!TextUtils.isEmpty(j) && i > 0) {
            q.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 90, (byte) 110, (byte) 96, (byte) 124}), j);
        }
        return new gnp().a(new a().a(q.c()).c()).a().toString();
    }

    public static String a(Context context, String str, String str2, long j) {
        long i = eva.a(context).i();
        Object j2 = eva.a(context).j();
        Builder q = HttpUrl.f(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 117, (byte) 108, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 125, (byte) 42, (byte) 115, (byte) 55, (byte) 42, (byte) 97, (byte) 104, (byte) 42, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 43, (byte) 118, (byte) 106})).q();
        q.a("aid", str).a("oid", str2).a("ps", String.valueOf(j)).a("type", "1").a("plat", "2");
        if (!TextUtils.isEmpty(j2) && i > 0) {
            q.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 90, (byte) 110, (byte) 96, (byte) 124}), j2);
        }
        return new gnp().a(new a().a(q.c()).c()).a().toString();
    }

    public static String a(String str) {
        Uri.Builder buildUpon = Uri.parse(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 102, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104})).buildUpon();
        buildUpon.appendEncodedPath(String.format(hae.a(new byte[]{(byte) 97, (byte) 104, (byte) 41, (byte) 32, (byte) 118}), new Object[]{str}));
        return buildUpon.toString();
    }

    public static File a(Context context) {
        File file = new File(context.getCacheDir(), hae.a(new byte[]{(byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112}));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File b(Context context, String str) {
        return new File(a(context), String.format(hae.a(new byte[]{(byte) 32, (byte) 118, (byte) 43, (byte) 125, (byte) 104, (byte) 105}), new Object[]{str}));
    }

    public static mfv a(Context context, PlayerParams playerParams) {
        File b = b(context, String.valueOf(playerParams.c.g().mCid));
        if (!b.exists()) {
            mmi.a().a(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 96, (byte) 37, (byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 96, (byte) 125, (byte) 108, (byte) 118, (byte) 113}));
        } else if (System.currentTimeMillis() - b.lastModified() < 1800000) {
            try {
                BLog.i(c, hae.a(new byte[]{(byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 102, (byte) 100, (byte) 102, (byte) 109, (byte) 96}));
                mfv a = a(context, b, playerParams.d);
                if (a != null) {
                    return a;
                }
                b.delete();
            } catch (DanmakuLoadException e) {
            }
        } else {
            mmi.a().a(hae.a(new byte[]{(byte) 81, (byte) 109, (byte) 96, (byte) 37, (byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 96, (byte) 125, (byte) 117, (byte) 108, (byte) 119, (byte) 96, (byte) 97}));
        }
        return null;
    }

    public static mfv a(Context context, InputStream inputStream, IDanmakuParams iDanmakuParams) throws DanmakuLoadException {
        mfv bl_mfv = (mfv) iDanmakuParams.a();
        if (iDanmakuParams != null) {
            Filter v = iDanmakuParams.v();
            if (v != null) {
                v.a(context);
            }
            bl_mfv.e = v;
        }
        bl_mfv.f = inputStream;
        if (bl_mfv instanceof mvo) {
            bl_mfv.a(inputStream);
        }
        return bl_mfv;
    }

    public static mfv a(Context context, File file, IDanmakuParams iDanmakuParams) throws DanmakuLoadException {
        try {
            BLog.i(c, hae.a(new byte[]{(byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 37, (byte) 63, (byte) 37}) + file.getPath());
            return a(context, new BufferedInputStream(new FileInputStream(file)), iDanmakuParams);
        } catch (Throwable e) {
            mmi.a().a(hae.a(new byte[]{(byte) 76, (byte) 74, (byte) 64, (byte) 125, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 37, (byte) 114, (byte) 109, (byte) 96, (byte) 107, (byte) 37, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 118, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104}));
            BLog.e(c, e.getMessage());
            throw new DanmakuLoadException(e);
        }
    }

    public static mfv a(Context context, IDanmakuParams iDanmakuParams, int i, int i2, long j) throws DanmakuLoadException {
        String c;
        boolean e = mjs.e(context);
        String a = a(context, String.valueOf(i), String.valueOf(i2), j);
        BLog.i(c, hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 114, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 63}) + a);
        if (e) {
            c = mjs.c(context, a);
        } else {
            c = a;
        }
        mmi.a().b(e ? c : a);
        mfv a2 = a(context, a, iDanmakuParams, e, c);
        if (a2 != null) {
            a2.a(String.valueOf(i), String.valueOf(i2));
        }
        return a2;
    }

    public static mfv a(Context context, String str, IDanmakuParams iDanmakuParams, boolean z, String str2) throws DanmakuLoadException {
        mfv a;
        try {
            a = a(context, a(context, str, z, str2), iDanmakuParams);
        } catch (Throwable e) {
            BLog.e(c, hae.a(new byte[]{(byte) 37, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 107, (byte) 96, (byte) 114, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 63}) + e.getMessage());
            if ((e instanceof SocketTimeoutException) || !(e instanceof InterruptedIOException)) {
                mmi.a().a(e.getClass().getName() + ":" + e.getMessage());
                if (mmi.a().f() == 0) {
                    mmi.a().b(8);
                }
                throw new DanmakuLoadException(e);
            }
            a = null;
        } finally {
            mmi.a().b(str);
        }
        return a;
    }

    private static klw b() {
        return fgw.b().b(60, TimeUnit.SECONDS).c(30, TimeUnit.SECONDS).a(10, TimeUnit.SECONDS).b(true).c();
    }

    private static kly a(HttpUrl httpUrl) {
        return new a().a(hae.a(new byte[]{(byte) 68, (byte) 102, (byte) 102, (byte) 96, (byte) 117, (byte) 113}), hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 105, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 42, (byte) 125, (byte) 109, (byte) 113, (byte) 104, (byte) 105, (byte) 46, (byte) 125, (byte) 104, (byte) 105, (byte) 41, (byte) 100, (byte) 117, (byte) 117, (byte) 105, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 42, (byte) 125, (byte) 104, (byte) 105})).a(hae.a(new byte[]{(byte) 68, (byte) 102, (byte) 102, (byte) 96, (byte) 117, (byte) 113, (byte) 40, (byte) 64, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 108, (byte) 107, (byte) 98}), hae.a(new byte[]{(byte) 98, Byte.MAX_VALUE, (byte) 108, (byte) 117, (byte) 41, (byte) 37, (byte) 97, (byte) 96, (byte) 99, (byte) 105, (byte) 100, (byte) 113, (byte) 96})).a(hae.a(new byte[]{(byte) 80, (byte) 118, (byte) 96, (byte) 119, (byte) 40, (byte) 68, (byte) 98, (byte) 96, (byte) 107, (byte) 113}), ams.b()).a(hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 107, (byte) 107, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 96, (byte) 117, (byte) 40, (byte) 100, (byte) 105, (byte) 108, (byte) 115, (byte) 96})).a(httpUrl).a().c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static InputStream a(android.content.Context r12, String r13, boolean r14, String r15) throws java.io.IOException {
        /*
        r0 = 19078; // 0x4a86 float:2.6734E-41 double:9.426E-320;
        r8 = bl.mpj.c.a(r12, r0);
        r0 = bl.kqw.c(r12);
        if (r0 == 0) goto L_0x0014;
    L_0x000c:
        r0 = bl.mmi.a();
        r1 = 1;
        r0.b(r1);
    L_0x0014:
        r4 = b();
        if (r14 == 0) goto L_0x0164;
    L_0x001a:
        r0 = r15;
    L_0x001b:
        r9 = okhttp3.HttpUrl.f(r0);
        r1 = a(r9);
        r6 = 0;
        r10 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r0 = new bl.gne;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = bl.kmb.class;
        r3 = 0;
        r3 = new java.lang.annotation.Annotation[r3];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = bl.anb.c();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = new bl.gnm;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1.<init>();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r0.a(r1);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = 0;
        r7 = r1;
    L_0x0040:
        r1 = 3;
        if (r7 >= r1) goto L_0x022d;
    L_0x0043:
        if (r7 <= 0) goto L_0x03af;
    L_0x0045:
        r1 = b(r12, r13, r14, r15);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = c;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r3 = new java.lang.StringBuilder;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r3.<init>();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = 16;
        r5 = new byte[r5];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = {113, 119, 124, 37, 97, 100, 107, 104, 100, 110, 112, 37, 112, 119, 105, 63};	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = bl.hae.a(r5);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r3 = r3.append(r5);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r3 = r3.append(r1);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r3 = r3.toString();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        tv.danmaku.android.log.BLog.i(r2, r3);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = 5;
        r2 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = {109, 113, 113, 117, 118};	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = bl.hae.a(r2);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = r1.startsWith(r2);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        if (r1 == 0) goto L_0x0167;
    L_0x007a:
        r0 = r0.d();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = r0;
    L_0x007f:
        r3 = 0;
        r2 = r1.g();	 Catch:{ Exception -> 0x03ab, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r5 = 0;
        if (r2 != 0) goto L_0x019a;
    L_0x0087:
        r0 = 17;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = {119, 96, 118, 117, 106, 107, 118, 96, 37, 108, 118, 37, 107, 112, 105, 105, 36};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = bl.hae.a(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
    L_0x0092:
        if (r0 == 0) goto L_0x0229;
    L_0x0094:
        r3 = new java.io.IOException;	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r5.<init>();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = 38;
        r6 = new byte[r6];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = {113, 109, 96, 37, 108, 107, 117, 112, 113, 118, 113, 119, 96, 100, 104, 37, 105, 96, 107, 98, 113, 109, 37, 108, 118, 37, 53, 37, 99, 106, 119, 37, 104, 118, 98, 37, 56, 37};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = bl.hae.a(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r5.append(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r3.<init>(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        throw r3;	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
    L_0x00b6:
        r0 = move-exception;
    L_0x00b7:
        r3 = c;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = new java.lang.StringBuilder;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5.<init>();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = 25;
        r6 = new byte[r6];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = {37, 105, 106, 100, 97, 37, 107, 96, 114, 37, 97, 100, 107, 104, 100, 110, 112, 37, 96, 119, 119, 106, 119, 37, 63};	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = bl.hae.a(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.append(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.append(r13);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = 6;
        r6 = new byte[r6];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = {37, 99, 106, 119, 37, 63};	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = bl.hae.a(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.append(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = r0.getMessage();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.append(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = 9;
        r6 = new byte[r6];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = {37, 113, 108, 104, 96, 118, 37, 63, 37};	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r6 = bl.hae.a(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.append(r6);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.append(r7);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = r5.toString();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        tv.danmaku.android.log.BLog.e(r3, r5);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r3 = 2;
        if (r7 < r3) goto L_0x03b2;
    L_0x0104:
        throw r0;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
    L_0x0105:
        r0 = move-exception;
        r1 = c;	 Catch:{ all -> 0x015f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015f }
        r2.<init>();	 Catch:{ all -> 0x015f }
        r3 = 25;
        r3 = new byte[r3];	 Catch:{ all -> 0x015f }
        r3 = {37, 105, 106, 100, 97, 37, 107, 96, 114, 37, 97, 100, 107, 104, 100, 110, 112, 37, 96, 119, 119, 106, 119, 37, 63};	 Catch:{ all -> 0x015f }
        r3 = bl.hae.a(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r3 = r0.getMessage();	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.toString();	 Catch:{ all -> 0x015f }
        tv.danmaku.android.log.BLog.e(r1, r2);	 Catch:{ all -> 0x015f }
        r1 = bl.mmi.a();	 Catch:{ all -> 0x015f }
        r2 = 3;
        r1.b(r2);	 Catch:{ all -> 0x015f }
        r1 = bl.mmi.a();	 Catch:{ all -> 0x015f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015f }
        r2.<init>();	 Catch:{ all -> 0x015f }
        r3 = r0.getClass();	 Catch:{ all -> 0x015f }
        r3 = r3.getName();	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r3 = ":";
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r3 = r0.getMessage();	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.toString();	 Catch:{ all -> 0x015f }
        r1.a(r2);	 Catch:{ all -> 0x015f }
        throw r0;	 Catch:{ all -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        bl.mpj.c.a(r12, r8);
        throw r0;
    L_0x0164:
        r0 = r13;
        goto L_0x001b;
    L_0x0167:
        r0 = new bl.gne;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = r9.q();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = 5;
        r2 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = {109, 113, 113, 117, 118};	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = bl.hae.a(r2);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = r1.a(r2);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = r1.c();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = a(r1);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = bl.kmb.class;
        r3 = 0;
        r3 = new java.lang.annotation.Annotation[r3];	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r5 = bl.anb.c();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = new bl.gnm;	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1.<init>();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r0.a(r1);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r1 = r0;
        goto L_0x007f;
    L_0x019a:
        r0 = r2.d();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = 14;
        r6 = new byte[r6];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = {70, 106, 107, 113, 96, 107, 113, 40, 73, 96, 107, 98, 113, 109};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = bl.hae.a(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.c(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.size();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        if (r0 <= 0) goto L_0x01e0;
    L_0x01b3:
        r0 = r2.d();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = 14;
        r6 = new byte[r6];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = {70, 106, 107, 113, 96, 107, 113, 40, 73, 96, 107, 98, 113, 109};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = bl.hae.a(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.c(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r6 = 0;
        r0 = r0.get(r6);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        if (r0 > 0) goto L_0x01e0;
    L_0x01d3:
        r0 = 20;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = {102, 106, 107, 113, 96, 107, 113, 40, 105, 96, 107, 98, 113, 109, 37, 108, 118, 37, 53, 36};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = bl.hae.a(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        goto L_0x0092;
    L_0x01e0:
        r0 = r2.f();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        if (r0 != 0) goto L_0x01f3;
    L_0x01e6:
        r0 = 29;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = {113, 109, 96, 37, 103, 106, 97, 124, 37, 106, 99, 37, 119, 96, 118, 117, 106, 107, 118, 96, 37, 108, 118, 37, 107, 112, 105, 105, 36};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = bl.hae.a(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        goto L_0x0092;
    L_0x01f3:
        r0 = r2.f();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = (bl.kmb) r0;	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.d();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        if (r0 != 0) goto L_0x020c;
    L_0x01ff:
        r0 = 36;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = {113, 109, 96, 37, 103, 106, 97, 124, 37, 118, 113, 119, 96, 100, 104, 37, 106, 99, 37, 119, 96, 118, 117, 106, 107, 118, 96, 37, 108, 118, 37, 107, 112, 105, 105, 36};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = bl.hae.a(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        goto L_0x0092;
    L_0x020c:
        r0 = r2.f();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = (bl.kmb) r0;	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.d();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = r0.available();	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        if (r0 > 0) goto L_0x03b5;
    L_0x021c:
        r0 = 40;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = {113, 109, 96, 37, 103, 106, 97, 124, 37, 118, 113, 119, 96, 100, 104, 37, 105, 96, 107, 98, 113, 109, 37, 106, 99, 37, 119, 96, 118, 117, 106, 107, 118, 96, 37, 108, 118, 37, 53, 36};	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        r0 = bl.hae.a(r0);	 Catch:{ Exception -> 0x00b6, SocketTimeoutException -> 0x0105, IOException -> 0x0296 }
        goto L_0x0092;
    L_0x0229:
        r0 = r3;
        r6 = r2;
    L_0x022b:
        if (r0 != 0) goto L_0x0290;
    L_0x022d:
        r0 = bl.mmi.a();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        r2 = r2 - r10;
        r0.a(r2);	 Catch:{ SocketTimeoutException -> 0x0105, IOException -> 0x0296, Exception -> 0x02bd }
        bl.mpj.c.a(r12, r8);
        r1 = r6.b();
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r1 == r0) goto L_0x02e9;
    L_0x0244:
        r0 = bl.mmi.a();
        r2 = 4;
        r3 = "";
        r0.a(r2, r1, r3, r13);
        r0 = r6.f();
        if (r0 == 0) goto L_0x025e;
    L_0x0255:
        r0 = r6.f();
        r0 = (bl.kmb) r0;
        r0.close();
    L_0x025e:
        r0 = c;
        r2 = 37;
        r2 = new byte[r2];
        r2 = {37, 105, 106, 100, 97, 37, 107, 96, 114, 37, 97, 100, 107, 104, 100, 110, 112, 37, 96, 119, 119, 106, 119, 37, 63, 37, 102, 106, 97, 96, 37, 36, 56, 37, 55, 53, 53};
        r2 = bl.hae.a(r2);
        tv.danmaku.android.log.BLog.e(r0, r2);
        r0 = new java.io.FileNotFoundException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = 26;
        r3 = new byte[r3];
        r3 = {80, 107, 96, 125, 117, 96, 102, 113, 96, 97, 37, 119, 96, 118, 117, 106, 107, 118, 96, 37, 102, 106, 97, 96, 63, 37};
        r3 = bl.hae.a(r3);
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0290:
        r0 = r7 + 1;
        r7 = r0;
        r0 = r1;
        goto L_0x0040;
    L_0x0296:
        r0 = move-exception;
        r1 = c;	 Catch:{ all -> 0x015f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015f }
        r2.<init>();	 Catch:{ all -> 0x015f }
        r3 = 25;
        r3 = new byte[r3];	 Catch:{ all -> 0x015f }
        r3 = {37, 105, 106, 100, 97, 37, 107, 96, 114, 37, 97, 100, 107, 104, 100, 110, 112, 37, 96, 119, 119, 106, 119, 37, 63};	 Catch:{ all -> 0x015f }
        r3 = bl.hae.a(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r3 = r0.getMessage();	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.toString();	 Catch:{ all -> 0x015f }
        tv.danmaku.android.log.BLog.e(r1, r2);	 Catch:{ all -> 0x015f }
        throw r0;	 Catch:{ all -> 0x015f }
    L_0x02bd:
        r0 = move-exception;
        r1 = c;	 Catch:{ all -> 0x015f }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x015f }
        r2.<init>();	 Catch:{ all -> 0x015f }
        r3 = 25;
        r3 = new byte[r3];	 Catch:{ all -> 0x015f }
        r3 = {37, 105, 106, 100, 97, 37, 107, 96, 114, 37, 97, 100, 107, 104, 100, 110, 112, 37, 96, 119, 119, 106, 119, 37, 63};	 Catch:{ all -> 0x015f }
        r3 = bl.hae.a(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r3 = r0.getMessage();	 Catch:{ all -> 0x015f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x015f }
        r2 = r2.toString();	 Catch:{ all -> 0x015f }
        tv.danmaku.android.log.BLog.e(r1, r2);	 Catch:{ all -> 0x015f }
        r1 = new java.io.IOException;	 Catch:{ all -> 0x015f }
        r1.<init>(r0);	 Catch:{ all -> 0x015f }
        throw r1;	 Catch:{ all -> 0x015f }
    L_0x02e9:
        r0 = r6.f();
        r0 = (bl.kmb) r0;
        r1 = bl.mmi.a();
        r2 = r0.b();
        r1.c(r2);
        r1 = r6.f();
        if (r1 == 0) goto L_0x03a6;
    L_0x0300:
        r1 = r6.d();
        r2 = 16;
        r2 = new byte[r2];
        r2 = {70, 106, 107, 113, 96, 107, 113, 40, 64, 107, 102, 106, 97, 108, 107, 98};
        r2 = bl.hae.a(r2);
        r1 = r1.c(r2);
        r1 = r1.size();
        if (r1 <= 0) goto L_0x03a6;
    L_0x0319:
        r1 = 7;
        r1 = new byte[r1];
        r1 = {97, 96, 99, 105, 100, 113, 96};
        r2 = bl.hae.a(r1);
        r1 = r6.d();
        r3 = 16;
        r3 = new byte[r3];
        r3 = {70, 106, 107, 113, 96, 107, 113, 40, 64, 107, 102, 106, 97, 108, 107, 98};
        r3 = bl.hae.a(r3);
        r1 = r1.c(r3);
        r3 = 0;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        r1 = r2.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x0356;
    L_0x0343:
        r1 = new java.util.zip.InflaterInputStream;
        r0 = r0.d();
        r2 = new java.util.zip.Inflater;
        r3 = 1;
        r2.<init>(r3);
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1.<init>(r0, r2, r3);
        r0 = r1;
    L_0x0355:
        return r0;
    L_0x0356:
        r1 = c;
        r2 = 35;
        r2 = new byte[r2];
        r2 = {119, 96, 118, 117, 106, 107, 118, 96, 37, 97, 106, 37, 107, 106, 113, 37, 109, 100, 115, 96, 37, 97, 96, 99, 105, 100, 113, 96, 37, 109, 96, 100, 97, 96, 119};
        r2 = bl.hae.a(r2);
        tv.danmaku.android.log.BLog.i(r1, r2);
        r2 = "gzip";
        r1 = r6.d();
        r3 = 16;
        r3 = new byte[r3];
        r3 = {70, 106, 107, 113, 96, 107, 113, 40, 64, 107, 102, 106, 97, 108, 107, 98};
        r3 = bl.hae.a(r3);
        r1 = r1.c(r3);
        r3 = 0;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        r1 = r2.equalsIgnoreCase(r1);
        if (r1 == 0) goto L_0x0396;
    L_0x0389:
        r1 = new java.util.zip.GZIPInputStream;
        r0 = r0.d();
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1.<init>(r0, r2);
        r0 = r1;
        goto L_0x0355;
    L_0x0396:
        r1 = c;
        r2 = 32;
        r2 = new byte[r2];
        r2 = {119, 96, 118, 117, 106, 107, 118, 96, 37, 97, 106, 37, 107, 106, 113, 37, 109, 100, 115, 96, 37, 98, 127, 108, 117, 37, 109, 96, 100, 97, 96, 119};
        r2 = bl.hae.a(r2);
        tv.danmaku.android.log.BLog.i(r1, r2);
    L_0x03a6:
        r0 = r0.d();
        goto L_0x0355;
    L_0x03ab:
        r0 = move-exception;
        r2 = r6;
        goto L_0x00b7;
    L_0x03af:
        r1 = r0;
        goto L_0x007f;
    L_0x03b2:
        r6 = r2;
        goto L_0x022b;
    L_0x03b5:
        r0 = r5;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.mfw.a(android.content.Context, java.lang.String, boolean, java.lang.String):java.io.InputStream");
    }

    private static String b(Context context, String str, boolean z, String str2) {
        if (!z || mjs.a(context)) {
            return str;
        }
        return str2;
    }

    public static mfv b(Context context, PlayerParams playerParams) throws DanmakuLoadException {
        String a;
        String c;
        String str;
        ResolveResourceParams g = playerParams.c.g();
        boolean e = mjs.e(context);
        if (g.a()) {
            a = a(g.mVid);
        } else {
            a = a(context, String.valueOf(g.mCid));
        }
        BLog.i(c, hae.a(new byte[]{(byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 106, (byte) 105, (byte) 97, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 112, (byte) 119, (byte) 105, (byte) 37, (byte) 63}) + a);
        if (e) {
            c = mjs.c(context, a);
        } else {
            c = a;
        }
        mmi a2 = mmi.a();
        if (e) {
            str = c;
        } else {
            str = a;
        }
        a2.b(str);
        return a(context, a, playerParams.d, e, c);
    }

    public static void a() {
        if (a == null) {
            a = Pattern.compile(hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 89, (byte) 43, (byte) 118, (byte) 96, (byte) 96, (byte) 110, (byte) 89, (byte) 45, (byte) 45, (byte) 89, (byte) 97, (byte) 46, (byte) 44, (byte) 89, (byte) 44, (byte) 62}));
        }
    }

    public static long b(String str) {
        a();
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            Object group = matcher.group(1);
            if (!TextUtils.isEmpty(group)) {
                return Long.parseLong(group);
            }
        }
        return 0;
    }

    public static boolean a(mvm bl_mvm) {
        return bl_mvm != null && "1".equals(bl_mvm.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 100, (byte) 105, (byte) 107, (byte) 100, (byte) 104, (byte) 96})));
    }
}
