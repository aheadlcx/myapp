package bili3.bl;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import bl.mpj.b;
import bl.mpn.a;
import bl.mpn.c;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayer.context.base.DanmakuParams;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;
import tv.danmaku.videoplayer.basic.context.VideoViewParams;

/* compiled from: BL */
public class mpm {
    private static final String a = hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119});

    public static PlayerParams a(Context context) {
        PlayerParams playerParams = new PlayerParams(new VideoViewParams(), new DanmakuParams());
        playerParams.c.g = !b.d();
        a(context, playerParams);
        return playerParams;
    }

    public static void a(Context context, PlayerParams playerParams) {
        float f = 0.5f;
        BLog.i(hae.a(new byte[]{(byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 85, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 68, (byte) 117, (byte) 117, (byte) 105, (byte) 124, (byte) 108, (byte) 107, (byte) 98, (byte) 37, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 96, (byte) 119, (byte) 96, (byte) 107, (byte) 102, (byte) 96, (byte) 118, (byte) 43}));
        msr a = mok.a();
        ResolveResourceParams g = playerParams.c.g();
        g.mExpectedQuality = b(context);
        g.mResolveBiliCdnPlay = c.l(context);
        g.mEnablePlayUrlHttps = c.k(context);
        int e = c.e(context);
        if (b.k() && e == 3) {
            c.d(context, 0);
            e = 0;
        }
        playerParams.c.b = e;
        playerParams.c.d = c.g(context);
        playerParams.c.e = c.a(context);
        playerParams.c.k.putBoolean(hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 40, (byte) 106, (byte) 107, (byte) 40, (byte) 117, (byte) 119, (byte) 96, (byte) 117, (byte) 100, (byte) 119, (byte) 96, (byte) 97}), true);
        boolean e2 = b.e();
        if (a()) {
            playerParams.c.e = 1;
        } else if (VERSION.SDK_INT < 17) {
            playerParams.c.e = 1;
        }
        if (!e2 && playerParams.c.e == 3) {
            playerParams.c.e = 0;
        }
        playerParams.c.f = c.f(context);
        mst a2 = mst.a(playerParams);
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 106, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 118, (byte) 90, (byte) 109, (byte) 108, (byte) 97, (byte) 96, (byte) 90, (byte) 107, (byte) 100, (byte) 115, (byte) 108, (byte) 98, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), Boolean.valueOf(mpn.b.a(context)));
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 106, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), a.a(context, hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 106, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), Integer.valueOf(0)));
        playerParams.d.f(a.a(context));
        playerParams.d.c(a.c(context));
        playerParams.d.a(a.b(context));
        playerParams.d.i(a.d(context));
        playerParams.d.j(a.e(context));
        playerParams.d.c(a.h(context));
        playerParams.d.k(a.f(context));
        playerParams.d.m(c.p(context));
        e = a.g(context);
        if (e != -1 && e < 5) {
            e = -1;
            a.a(context, -1);
        }
        playerParams.d.b(e);
        playerParams.d.b(a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 105, (byte) 96, (byte) 99, (byte) 113}), Boolean.valueOf(false)).booleanValue());
        playerParams.d.d(a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 119, (byte) 108, (byte) 98, (byte) 109, (byte) 113}), Boolean.valueOf(false)).booleanValue());
        playerParams.d.e(a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 98, (byte) 112, (byte) 96, (byte) 118, (byte) 113}), Boolean.valueOf(false)).booleanValue());
        playerParams.d.g(a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 102, (byte) 106, (byte) 105, (byte) 106, (byte) 119, (byte) 99, (byte) 112, (byte) 105}), Boolean.valueOf(false)).booleanValue());
        playerParams.d.h(a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 97, (byte) 112, (byte) 117, (byte) 105, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 119, (byte) 98, (byte) 108, (byte) 107, (byte) 98}), Boolean.valueOf(false)).booleanValue());
        float floatValue = a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 113, (byte) 96, (byte) 125, (byte) 113, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 90, (byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119}), Float.valueOf(0.9f)).floatValue();
        if (floatValue < 0.5f) {
            a.b(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 113, (byte) 96, (byte) 125, (byte) 113, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 90, (byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119}), Float.valueOf(0.5f));
            floatValue = 0.5f;
        }
        playerParams.d.d(floatValue);
        floatValue = a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 110, (byte) 96, (byte) 90, (byte) 114, (byte) 108, (byte) 97, (byte) 113, (byte) 109, (byte) 90, (byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 108, (byte) 107, (byte) 98}), Float.valueOf(0.8f)).floatValue();
        if (floatValue < 0.5f) {
            a.b(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 110, (byte) 96, (byte) 90, (byte) 114, (byte) 108, (byte) 97, (byte) 113, (byte) 109, (byte) 90, (byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 108, (byte) 107, (byte) 98}), Float.valueOf(0.5f));
        } else {
            f = floatValue;
        }
        playerParams.d.c(f);
        floatValue = a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 97, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119}), Float.valueOf(1.0f)).floatValue();
        if (floatValue < 0.3f) {
            floatValue = 0.3f;
            a.b(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 97, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119}), Float.valueOf(0.3f));
        }
        playerParams.d.b(floatValue);
        floatValue = a.a(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119}), Float.valueOf(1.0f)).floatValue();
        if (floatValue < 0.2f) {
            floatValue = 0.2f;
            a.b(context, hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 113, (byte) 106, (byte) 119}), Float.valueOf(0.2f));
        }
        playerParams.d.a(floatValue);
        e = Integer.valueOf(a.a(context, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 54}), String.valueOf(0))).intValue();
        if (e == 3) {
            e = 1;
        }
        if (e > 4) {
            a.b(context, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 106, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 54}), String.valueOf(0));
            e = 0;
        }
        playerParams.c.j = e;
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 98, (byte) 96, (byte) 118, (byte) 113, (byte) 112, (byte) 119, (byte) 96}), a.a(context, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 98, (byte) 96, (byte) 118, (byte) 113, (byte) 112, (byte) 119, (byte) 96}), Boolean.valueOf(true)));
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 98, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 90, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102}), a.a(context, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 98, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 90, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102}), Boolean.valueOf(false)));
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 115, (byte) 106, (byte) 108, (byte) 97, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 106, (byte) 107, (byte) 90, (byte) 118, (byte) 112, (byte) 103}), a.a(context, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 115, (byte) 106, (byte) 108, (byte) 97, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 106, (byte) 107, (byte) 90, (byte) 118, (byte) 112, (byte) 103}), Boolean.valueOf(true)));
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 114, (byte) 106, (byte) 119, (byte) 97, (byte) 118, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110}), a.a(context, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 114, (byte) 106, (byte) 119, (byte) 97, (byte) 118, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110}), Boolean.valueOf(true)));
        a2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 107, (byte) 106, (byte) 113, (byte) 108, (byte) 99, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 118, (byte) 113, (byte) 124, (byte) 105, (byte) 96}), Integer.valueOf(mpn.b.b(context)));
        a2.a(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124}), Boolean.valueOf(c.i(context)));
        a2.a(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 106, (byte) 90, (byte) 105, (byte) 100, (byte) 107, (byte) 97, (byte) 118, (byte) 102, (byte) 100, (byte) 117, (byte) 96}), Boolean.valueOf(c.h(context)));
    }

    private static boolean a() {
        return Build.MODEL != null && Build.MODEL.toLowerCase().contains(hae.a(new byte[]{(byte) 109, (byte) 112, (byte) 100, (byte) 114, (byte) 96, (byte) 108, (byte) 37, (byte) 117, (byte) 50}));
    }

    public static int b(Context context) {
        boolean e = blk.a().e();
        boolean c = mjs.c(context);
        int h = b.h();
        if (e || c) {
            h = 32;
        }
        int b = c.b(context);
        if (b > 0) {
            h = b;
        }
        e = eva.a(context).a();
        int g = b.g();
        if (e || g <= 0) {
            return h;
        }
        return Math.min(g, h);
    }
}
