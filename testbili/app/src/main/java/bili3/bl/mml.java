package bili3.bl;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import bl.mpj.d;
import com.bilibili.lib.media.resource.PlayerCodecConfig.Player;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.exception.WeiboAuthException;
import com.tencent.bugly.CrashModule;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayer.features.report.HeartbeatApiService;
import tv.danmaku.biliplayer.features.report.HeartbeatApiService.Params;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.basic.context.ResolveResourceParams;
import tv.danmaku.videoplayer.basic.context.VideoViewParams;

/* compiled from: BL */
public class mml extends mfd {
    private static final String a = hae.a(new byte[]{(byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119});
    private static final String b = hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 108, (byte) 97});
    private static final String[] c = new String[]{hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 82, (byte) 108, (byte) 105, (byte) 105, (byte) 85, (byte) 105, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 71, (byte) 96, (byte) 98, (byte) 108, (byte) 107}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 86, (byte) 112, (byte) 102, (byte) 102, (byte) 96, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 85, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 81, (byte) 106, (byte) 98, (byte) 98, (byte) 105, (byte) 96}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 112, (byte) 105, (byte) 105, (byte) 86, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 108, (byte) 105, (byte) 97, (byte) 96, (byte) 103, (byte) 100, (byte) 119}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 68, (byte) 107, (byte) 100, (byte) 105, (byte) 124, (byte) 118, (byte) 108, (byte) 118, (byte) 76, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 102, (byte) 110, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 84, (byte) 112, (byte) 108, (byte) 113}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 75, (byte) 96, (byte) 114, (byte) 80, (byte) 108, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 100, (byte) 110, (byte) 96, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 97, (byte) 81, (byte) 108, (byte) 104, (byte) 96, (byte) 106, (byte) 112, (byte) 113}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 64, (byte) 124, (byte) 96, (byte) 118, (byte) 83, (byte) 55}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113, (byte) 86, (byte) 109, (byte) 100, (byte) 119, (byte) 108, (byte) 107, (byte) 98, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 112, (byte) 105, (byte) 105, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 64, (byte) 124, (byte) 96, (byte) 118, (byte) 83, (byte) 55}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 108, (byte) 107, (byte) 98, (byte) 84, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 65, (byte) 106, (byte) 112, (byte) 103, (byte) 105, (byte) 96, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 64, (byte) 107, (byte) 97, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 87, (byte) 96, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 111, (byte) 110, (byte) 81, (byte) 119, (byte) 100, (byte) 102, (byte) 110, (byte) 96, (byte) 119, (byte) 86, (byte) 96, (byte) 96, (byte) 110}), hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 79, (byte) 112, (byte) 104, (byte) 117})};
    private static final String d = hae.a(new byte[]{(byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113});
    private c e = new c();
    private b f = new b();
    private boolean g = false;
    private int h = -1;
    private boolean i = false;
    private long j = 0;
    private boolean k;
    private boolean l;
    private mtw m;
    private Runnable n = new Runnable(this) {
        final /* synthetic */ mml a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.Z()) {
                this.a.c(0);
                this.a.a(this, StatisticConfig.MIN_UPLOAD_INTERVAL);
            }
        }
    };
    private String o = WeiboAuthException.DEFAULT_AUTH_ERROR_CODE;
    private int p;
    private bl.mos.a u = new bl.mos.a(this) {
        final /* synthetic */ mml a;

        {
            this.a = r1;
        }

        public void a(ResolveResourceParams resolveResourceParams) {
            mmg.a().e(resolveResourceParams);
        }

        public void a(ResolveResourceParams resolveResourceParams, int i, Exception exception) {
            mmg.a().c(resolveResourceParams, i, exception);
        }

        public void b(ResolveResourceParams resolveResourceParams) {
            mmg.a().f(resolveResourceParams);
        }

        public void b(ResolveResourceParams resolveResourceParams, int i, Exception exception) {
            mmg.a().d(resolveResourceParams, i, exception);
        }
    };
    private String v;
    private bl.mmi.a w = new bl.mmi.a(this) {
        final /* synthetic */ mml a;

        {
            this.a = r1;
        }

        public void a(int i, int i2, boolean z) {
            String str = (bl.mpn.c.p(this.a.as()) && z) ? "[" + i + "," + i + "," + i + "]" : hae.a(new byte[]{(byte) 94, (byte) 53, (byte) 41, (byte) 53, (byte) 41}) + i + "]";
            this.a.c(hae.a(new byte[]{(byte) 100, (byte) 108, (byte) 90, (byte) 99, (byte) 108, (byte) 105, (byte) 113, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 118}), str);
            if (i2 != -1) {
                BLog.d(hae.a(new byte[]{(byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 65, (byte) 67, (byte) 72}), hae.a(new byte[]{(byte) 37, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 75, (byte) 106, (byte) 119, (byte) 104, (byte) 100, (byte) 105, (byte) 83, (byte) 55, (byte) 37, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 37, (byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 37, (byte) 99, (byte) 105, (byte) 100, (byte) 98, (byte) 37, (byte) 117, (byte) 96, (byte) 119, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 63}) + i2);
                this.a.c(hae.a(new byte[]{(byte) 99, (byte) 105, (byte) 100, (byte) 98, (byte) 90, (byte) 109, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 96, (byte) 119, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 98, (byte) 96}), String.valueOf(i2));
            }
        }

        public void a(int i, int i2, int i3, int i4, String str, int i5, long j, String str2, int i6, int i7, int i8) {
            if (!(i2 != 0 || TextUtils.isEmpty(str2) || i3 == 0)) {
                if (i4 == 0 || i4 == 200) {
                    bl.mpj.c.a(i3, str, str2);
                } else {
                    bl.mpj.c.a(i4, str2);
                }
            }
            PlayerParams d = this.a.au();
            ResolveResourceParams resolveResourceParams = null;
            if (d != null) {
                resolveResourceParams = d.c.g();
            }
            try {
                mty.a(i, i2, i3, i4, str, resolveResourceParams == null ? 0 : resolveResourceParams.mCid, i5, j, str2, i6, i7, i8);
            } catch (Throwable e) {
                ibn.a(e);
            }
            mmi.a().e();
        }
    };

    /* compiled from: BL */
    static class a implements mua {
        private a() {
        }

        public void a(@NonNull mtx bl_mtx) {
            if ((bl_mtx.a == CrashModule.MODULE_ID || bl_mtx.a == 1006) && bl_mtx.g != 0) {
                bl.mpj.c.a(hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113}), String.valueOf(bl_mtx.a), hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96}), String.valueOf(bl_mtx.b), hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 102, (byte) 108, (byte) 97}), String.valueOf(bl_mtx.c), hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 118, (byte) 96, (byte) 118, (byte) 118, (byte) 108, (byte) 106, (byte) 107}), bl_mtx.d, hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 90, (byte) 106, (byte) 99, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106}), String.valueOf(bl_mtx.f), hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), String.valueOf(bl_mtx.g), hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 109, (byte) 106, (byte) 118, (byte) 113}), bl_mtx.j, hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), bl_mtx.o, hae.a(new byte[]{(byte) 99, (byte) 90, (byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96}), String.valueOf(bl_mtx.k));
            }
        }

        public boolean a(Context context, PlayerParams playerParams, long j) {
            return mjs.c(context) && mjs.a(context, playerParams, j);
        }
    }

    /* compiled from: BL */
    static class b {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private int g;
        private String h;
        private long i;
        private int j;
        private int k;
        private int l;
        private int m;
        private String n;

        public b() {
            this.b = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
            this.c = Constants.STR_EMPTY;
            this.d = Constants.STR_EMPTY;
            this.e = Constants.STR_EMPTY;
            this.f = Constants.STR_EMPTY;
            this.l = 0;
            this.e = amv.a();
        }

        public void a(PlayerParams playerParams) {
            int i = 1;
            if (playerParams != null) {
                ResolveResourceParams g = playerParams.c.g();
                this.g = playerParams.a() ? 2 : 1;
                this.h = g.mSeasonId;
                this.i = g.mEpisodeId;
                if (TextUtils.isEmpty(this.h)) {
                    this.h = Constants.VIA_RESULT_SUCCESS;
                }
                this.j = g.mAvid;
                this.k = g.mCid;
                if (this.k == 0) {
                    this.k = g.mCid;
                }
                if (!hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}).equals(playerParams.c.g().mFrom)) {
                    i = 2;
                }
                this.m = i;
                ResolveResourceParams[] h = playerParams.c.h();
                if (h != null) {
                    for (int i2 = 0; i2 < h.length; i2++) {
                        if (h[i2].mPage == g.mPage) {
                            this.l = i2 + 1;
                            return;
                        }
                    }
                    return;
                }
                this.l = 0;
            }
        }

        public boolean a() {
            return !TextUtils.isEmpty(this.a) && this.g > 0 && this.k > 0;
        }

        public void b() {
            this.a = Constants.STR_EMPTY;
            this.b = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
            this.c = Constants.STR_EMPTY;
            this.d = Constants.STR_EMPTY;
            this.g = 0;
            this.h = Constants.VIA_RESULT_SUCCESS;
            this.i = 0;
            this.j = 0;
            this.k = 0;
            this.l = 0;
            this.m = 0;
        }
    }

    /* compiled from: BL */
    class c {
        final /* synthetic */ mml a;
        private long b;
        private long c;
        private long d;
        private long e;
        private long f;
        private boolean g;
        private int h;
        private int i;
        private String j;
        private String k;
        private String l;
        private int m;
        private int n;
        private int o;
        private boolean p;
        private int q;
        private int r;
        private int s;

        private c(mml bl_mml) {
            this.a = bl_mml;
        }

        public void a() {
            this.b = this.a.r();
            this.c = 0;
            this.e = 0;
            this.f = 0;
            this.g = false;
            this.h = 0;
            this.j = Constants.STR_EMPTY;
            this.k = Constants.STR_EMPTY;
            this.l = Constants.STR_EMPTY;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = false;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.i = 0;
        }

        public void a(PlayerParams playerParams, String str) {
            this.j = str;
            if (TextUtils.isEmpty(playerParams.c.g().mSeasonId) || playerParams.c.g().mEpisodeId <= 0) {
                this.k = Constants.STR_EMPTY;
                this.l = Constants.STR_EMPTY;
            } else {
                this.k = playerParams.c.g().mSeasonId;
                this.l = String.valueOf(playerParams.c.g().mEpisodeId);
            }
            this.m = playerParams.c.g().mCid;
            this.n = playerParams.c.g().b() ? 2 : 1;
            this.o = this.a.b(playerParams.c.j);
            this.p = hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}).equals(playerParams.c.g().mFrom);
            this.q = playerParams.c.g().mAvid;
            this.r = playerParams.c.g().mPage;
            this.s = playerParams.c.g().mTid;
        }

        public void b() {
            this.d = this.a.r();
        }

        public void c() {
            this.c = this.a.r() - this.d;
            this.d = 0;
        }

        public boolean d() {
            return !this.g;
        }

        public void e() {
            this.g = true;
        }

        public void f() {
            this.h = Math.max(this.a.W_(), this.h) / 1000;
        }

        public void g() {
            this.f = this.a.r();
        }

        public void h() {
            this.e += this.a.r() - this.f;
            this.f = 0;
        }
    }

    public mml() {
        a(blg.a());
    }

    public void j_() {
        super.j_();
        a(this, c);
    }

    public void a(Bundle bundle) {
        if (!(bundle == null || this.f == null)) {
            this.f.f = bundle.getString(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 108, (byte) 97}));
        }
        if (au() != null) {
            this.p = au().h();
            mmi.a().a(au().h(), this.w);
        }
        super.a(bundle);
        this.f.n = bl.mpn.a.a(as()) ? Constants.VIA_SSO_LOGIN : Constants.VIA_TO_TYPE_QQ_GROUP;
    }

    private void a(Context context) {
        if (this.m == null) {
            this.m = new mtw(context, new a());
        }
    }

    private long r() {
        return System.currentTimeMillis() / 1000;
    }

    private int b(int i) {
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                return 2;
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                return 1;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                return 3;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                return 4;
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                return 5;
            default:
                return 0;
        }
    }

    public void onEvent(String str, Object... objArr) {
        String str2 = null;
        super.onEvent(str, objArr);
        if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 82, (byte) 108, (byte) 105, (byte) 105, (byte) 85, (byte) 105, (byte) 100, (byte) 124}).equals(str)) {
            PlayerParams playerParams = (PlayerParams) objArr[0];
            if (this.e.m > 0 && this.e.m != playerParams.c.g().mCid) {
                c(this.e.d());
            }
            this.e.a();
            this.e.a(playerParams, B());
            G();
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 71, (byte) 96, (byte) 98, (byte) 108, (byte) 107}).equals(str)) {
            this.e.b();
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 86, (byte) 112, (byte) 102, (byte) 102, (byte) 96, (byte) 96, (byte) 97}).equals(str) || hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 67, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}).equals(str)) {
            this.e.c();
            if (this.f != null) {
                this.f.f = mmj.a();
                this.f.b();
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                this.f.c = this.o;
                if (TextUtils.equals(this.f.c, WeiboAuthException.DEFAULT_AUTH_ERROR_CODE)) {
                    if (bl.mpn.a.a(blg.a())) {
                        this.f.c = Constants.VIA_SSO_LOGIN;
                    } else {
                        this.f.c = Constants.VIA_TO_TYPE_QQ_GROUP;
                    }
                }
                I();
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 85, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 81, (byte) 106, (byte) 98, (byte) 98, (byte) 105, (byte) 96}).equals(str)) {
            if (objArr != null && objArr.length >= 1 && objArr[0] != null && (objArr[0] instanceof Boolean)) {
                if (((Boolean) objArr[0]).booleanValue()) {
                    a("play");
                    b(hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), null);
                    K();
                    return;
                }
                a(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 112, (byte) 118, (byte) 96}));
                b(hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), null);
                b(this.n);
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 65, (byte) 106, (byte) 112, (byte) 103, (byte) 105, (byte) 96, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equals(str)) {
            if (Z()) {
                c(2);
            } else {
                c(3);
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equals(str)) {
            if (Z()) {
                c(2);
            } else {
                c(3);
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 112, (byte) 105, (byte) 105, (byte) 86, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107}).equals(str)) {
            a(hae.a(new byte[]{(byte) 99, (byte) 112, (byte) 105, (byte) 105, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107}));
            b(hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 99, (byte) 112, (byte) 105, (byte) 105, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), null);
        } else if (hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 108, (byte) 105, (byte) 97, (byte) 96, (byte) 103, (byte) 100, (byte) 119}).equals(str)) {
            a(hae.a(new byte[]{(byte) 118, (byte) 108, (byte) 105, (byte) 97, (byte) 96, (byte) 103, (byte) 100, (byte) 119}));
            b(hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 99, (byte) 112, (byte) 105, (byte) 105, (byte) 90, (byte) 104, (byte) 106, (byte) 119, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), null);
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 68, (byte) 107, (byte) 100, (byte) 105, (byte) 124, (byte) 118, (byte) 108, (byte) 118, (byte) 76, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 97}).equals(str)) {
            if (objArr != null && objArr.length >= 1 && objArr[0] != null) {
                a(objArr);
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 73, (byte) 106, (byte) 102, (byte) 110, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}).equals(str)) {
            if (objArr != null && objArr.length >= 1 && objArr[0] != null && (objArr[0] instanceof Boolean)) {
                this.g = ((Boolean) objArr[0]).booleanValue();
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 84, (byte) 112, (byte) 108, (byte) 113}).equals(str)) {
            a("quit");
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113}).equals(str)) {
            b(objArr);
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 100, (byte) 110, (byte) 96, (byte) 65, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 87, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 97, (byte) 81, (byte) 108, (byte) 104, (byte) 96, (byte) 106, (byte) 112, (byte) 113}).equals(str)) {
            A();
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 108, (byte) 107, (byte) 98, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}).equals(str)) {
            if (au() != null) {
                int h = au().h();
                if (this.p != h) {
                    mmi.a().h(this.p);
                    mmi.a().a(h, this.w);
                    this.p = h;
                }
            }
            c(4);
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 64, (byte) 124, (byte) 96, (byte) 118, (byte) 83, (byte) 55}).equals(str)) {
            if (objArr != null && objArr.length > 1 && (objArr[0] instanceof String) && (objArr[1] instanceof String)) {
                d(objArr[0].toString(), objArr[1].toString());
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 112, (byte) 105, (byte) 105, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 64, (byte) 124, (byte) 96, (byte) 118, (byte) 83, (byte) 55}).equals(str)) {
            if (objArr != null && objArr.length > 4 && (objArr[0] instanceof String) && (objArr[1] instanceof String) && (objArr[2] instanceof String) && (objArr[3] instanceof String) && (objArr[4] instanceof String)) {
                a(objArr[0].toString(), objArr[1].toString(), objArr[2].toString(), objArr[3].toString(), objArr[4].toString());
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 75, (byte) 96, (byte) 114, (byte) 80, (byte) 108, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113}).equals(str)) {
            if (objArr != null && objArr.length >= 1) {
                String str3;
                String str4;
                String str5;
                switch (objArr.length) {
                    case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                        str3 = (String) objArr[0];
                        str4 = null;
                        str5 = null;
                        break;
                    case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                        str3 = (String) objArr[0];
                        str4 = (String) objArr[1];
                        str5 = null;
                        break;
                    case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                        str3 = (String) objArr[0];
                        str4 = (String) objArr[1];
                        str5 = (String) objArr[2];
                        break;
                    case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                        str3 = (String) objArr[0];
                        str4 = (String) objArr[1];
                        str5 = (String) objArr[2];
                        str2 = (String) objArr[3];
                        break;
                    default:
                        return;
                }
                a(str3, str4, str5, str2);
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113, (byte) 86, (byte) 109, (byte) 100, (byte) 119, (byte) 108, (byte) 107, (byte) 98, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97}).equals(str)) {
            if (this.f != null && objArr != null && objArr.length >= 1 && Boolean.TRUE.equals(objArr[0])) {
                this.f.f = mmj.a();
                this.f.b();
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                this.f.c = this.o;
                if (TextUtils.equals(this.f.c, WeiboAuthException.DEFAULT_AUTH_ERROR_CODE)) {
                    if (bl.mpn.a.a(blg.a())) {
                        this.f.c = Constants.VIA_SSO_LOGIN;
                    } else {
                        this.f.c = Constants.VIA_TO_TYPE_QQ_GROUP;
                    }
                }
                I();
            }
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 108, (byte) 107, (byte) 98, (byte) 84, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124}).equals(str)) {
            this.k = true;
            z();
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 64, (byte) 107, (byte) 97, (byte) 85, (byte) 100, (byte) 98, (byte) 96, (byte) 87, (byte) 96, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equals(str)) {
            c(1);
        } else if (hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 111, (byte) 110, (byte) 81, (byte) 119, (byte) 100, (byte) 102, (byte) 110, (byte) 96, (byte) 119, (byte) 86, (byte) 96, (byte) 96, (byte) 110}).equals(str) && objArr != null && objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.m.a(at(), (long) x(), (long) ((Integer) objArr[0]).intValue());
        } else if (hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 74, (byte) 107, (byte) 68, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 79, (byte) 112, (byte) 104, (byte) 117}).equals(str)) {
            this.l = true;
        }
    }

    private void z() {
        PlayerParams au = au();
        if (au != null) {
            au.c.g().mExtraParams.a(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 99, (byte) 105, (byte) 100, (byte) 118, (byte) 109, (byte) 90, (byte) 104, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96}), Boolean.valueOf(false));
            au.c.g().mExtraParams.a(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 117, (byte) 119, (byte) 96, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96}), Boolean.valueOf(false));
        }
    }

    public void onCompletion(IMediaPlayer iMediaPlayer) {
        super.onCompletion(iMediaPlayer);
        if (!y()) {
            this.i = true;
            c(4);
        }
    }

    private void a(Object... objArr) {
        if (objArr != null && objArr.length > 0 && objArr[0] != null) {
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 96, (byte) 117, (byte) 108, (byte) 118, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 107, (byte) 112}).equalsIgnoreCase(objArr[0].toString())) {
                a(hae.a(new byte[]{(byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119}));
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString()) && objArr[1] != null) {
                String str;
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109});
                this.f.c = objArr[1].toString();
                H();
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                if (objArr[1].toString().equals("off")) {
                    str = Constants.VIA_SSO_LOGIN;
                    this.f.n = Constants.VIA_SSO_LOGIN;
                } else {
                    str = Constants.VIA_TO_TYPE_QQ_GROUP;
                    this.f.n = Constants.VIA_TO_TYPE_QQ_GROUP;
                }
                this.f.c = str;
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 96, (byte) 113, (byte) 113, (byte) 108, (byte) 107, (byte) 98, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 118, (byte) 96, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 103, (byte) 100, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 124, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 103, (byte) 100, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 124, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 103, (byte) 100, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 124, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 103, (byte) 100, (byte) 113, (byte) 113, (byte) 96, (byte) 119, (byte) 124, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 118, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 118, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 118, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 118, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 118, (byte) 90, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 118, (byte) 90, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 96, (byte) 117, (byte) 108, (byte) 118, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 107, (byte) 112}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 117, (byte) 108, (byte) 118, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 107, (byte) 112, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 96, (byte) 117, (byte) 108, (byte) 118, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 107, (byte) 112, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 117, (byte) 108, (byte) 118, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 107, (byte) 112, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 98, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 90, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 98, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 104, (byte) 108, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 90, (byte) 99, (byte) 105, (byte) 108, (byte) 117, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 104, (byte) 108, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 90, (byte) 99, (byte) 105, (byte) 108, (byte) 117, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 118, (byte) 117, (byte) 96, (byte) 96, (byte) 97, (byte) 90, (byte) 103, (byte) 113, (byte) 107}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 118, (byte) 117, (byte) 96, (byte) 96, (byte) 97, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 118, (byte) 96, (byte) 113, (byte) 113, (byte) 108, (byte) 107, (byte) 98, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 118, (byte) 96, (byte) 113, (byte) 113, (byte) 108, (byte) 107, (byte) 98, (byte) 90, (byte) 118, (byte) 105, (byte) 96, (byte) 96, (byte) 117, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 105, (byte) 96, (byte) 96, (byte) 117, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 90, (byte) 104, (byte) 96, (byte) 107, (byte) 112}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 118, (byte) 117, (byte) 96, (byte) 102, (byte) 113, (byte) 90, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                if (objArr[1] instanceof String) {
                    this.f.c = (String) objArr[1];
                }
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 118, (byte) 114, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
                I();
            }
            if (hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 90, (byte) 117, (byte) 108, (byte) 102, (byte) 116, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 109, (byte) 108, (byte) 107, (byte) 113, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 90, (byte) 112, (byte) 108}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.a(au());
                this.f.a = hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 108, (byte) 102, (byte) 116, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 109, (byte) 108, (byte) 107, (byte) 113, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114});
                this.f.b = "show";
                I();
            }
            if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 115, (byte) 96, (byte) 97, (byte) 108, (byte) 106, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.b();
                this.f.a(au());
                this.f.a = objArr[0].toString();
                b(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
            } else if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 115, (byte) 96, (byte) 97, (byte) 108, (byte) 106, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.b();
                this.f.a(au());
                this.f.a = objArr[0].toString();
                b(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
            } else if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 115, (byte) 96, (byte) 97, (byte) 108, (byte) 106, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.b();
                this.f.a(au());
                this.f.a = objArr[0].toString();
                b("show");
            } else if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 115, (byte) 96, (byte) 97, (byte) 108, (byte) 106, (byte) 90, (byte) 118, (byte) 110, (byte) 108, (byte) 117, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.b();
                this.f.a(au());
                this.f.a = objArr[0].toString();
                b(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
            } else if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.b();
                this.f.a(au());
                this.f.a = objArr[0].toString();
                b("show");
            } else if (hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}).equalsIgnoreCase(objArr[0].toString())) {
                this.f.b();
                this.f.a(au());
                this.f.a = objArr[0].toString();
                b(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
            }
        }
    }

    private void A() {
        mty.a(11);
    }

    private String B() {
        msv at = at();
        if (at == null || at.a == null) {
            return null;
        }
        String str = (String) mst.a(at.a).a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), Constants.STR_EMPTY);
        if (at.a.c.g() == null || at.a.c.g().mPageTitle == null) {
            return str;
        }
        return at.a.c.g().mPageTitle + "-" + str;
    }

    private void b(Object... objArr) {
        if (objArr != null && objArr.length >= 1 && objArr[0] != null) {
            if (objArr[0] instanceof bl.mmn.a) {
                bl.mmn.a aVar = (bl.mmn.a) objArr[0];
                switch (aVar.a) {
                    case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                        if (aVar.d == null) {
                            fcz.a(aVar.b, new String[0]);
                            return;
                        } else {
                            fcz.a(aVar.b, aVar.d);
                            return;
                        }
                    case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                        fcz.a().a(aVar.e, aVar.c, aVar.d);
                        return;
                    default:
                        return;
                }
            } else if (objArr[0] instanceof bl.mmn.b) {
                bl.mmn.b bVar = (bl.mmn.b) objArr[0];
                if (!TextUtils.isEmpty(bVar.b)) {
                    switch (bVar.a) {
                        case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                            hal.a(as(), bVar.b);
                            return;
                        case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                            hal.a(as(), bVar.b, bVar.d);
                            return;
                        case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                            hal.a(as(), bVar.b, bVar.e);
                            return;
                        case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                            if (TextUtils.isEmpty(bVar.c) || TextUtils.isEmpty(bVar.d)) {
                                hal.a(as(), bVar.b, bVar.f);
                                return;
                            } else {
                                hal.a(as(), bVar.b, bVar.c, bVar.d, bVar.f);
                                return;
                            }
                        default:
                            return;
                    }
                }
            }
        }
    }

    public void s() {
        super.s();
        mos.a().a(this.u);
    }

    public void Q_() {
        super.Q_();
        if (this.l) {
            this.l = false;
        } else if (bl.mpj.b.c() && !this.i) {
            c(4);
        }
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        if (this.f != null) {
            bundle.putString(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 90, (byte) 108, (byte) 97}), this.f.f);
        }
    }

    public void O_() {
        super.O_();
        mos.a().b(this.u);
    }

    public void p_() {
        if (au() != null) {
            mmi.a().h(au().h());
        }
        super.p_();
        c(this.e.d());
        PlayerParams au = au();
        if (au != null) {
            mmg.a().g(au.c.g());
        }
        this.m.a();
    }

    public void onPrepared(IMediaPlayer iMediaPlayer) {
        super.onPrepared(iMediaPlayer);
        this.e.f();
        if (this.j <= 0 || this.i) {
            long a = d.a();
            if (a == -1) {
                a = System.currentTimeMillis();
            }
            this.j = a / 1000;
        }
        this.i = false;
        if (bl.mpj.b.c()) {
            if (this.k) {
                c(3);
            } else {
                c(1);
            }
            this.k = false;
            J();
        }
        this.m.a(at(), iMediaPlayer, this.v);
        PlayerParams au = au();
        if (au != null) {
            mmg.a().b(au.c.g(), ar());
        }
    }

    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        this.e.f();
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                this.m.b(at(), iMediaPlayer, this.v);
                break;
            case 701:
                this.e.g();
                if (i2 != -1) {
                    this.m.a(at(), iMediaPlayer, this.v, i2);
                    break;
                }
                break;
            case 702:
                this.e.h();
                this.m.b(at(), iMediaPlayer, this.v, i2);
                break;
            case 10002:
                this.m.c(at(), iMediaPlayer, this.v);
                break;
            case 10003:
                this.m.h(at(), iMediaPlayer, this.v);
                break;
            case 10004:
                this.m.i(at(), iMediaPlayer, this.v);
                break;
            case 10005:
                this.m.j(at(), iMediaPlayer, this.v);
                break;
            case 10006:
                this.m.k(at(), iMediaPlayer, this.v);
                break;
            case 10007:
                this.m.l(at(), iMediaPlayer, this.v);
                break;
            case 10008:
                this.m.c(at(), iMediaPlayer, this.v, i2);
                break;
            case 10009:
                this.m.d(at(), iMediaPlayer, this.v, i2);
                break;
            case Constants.REQUEST_API /*10100*/:
                this.m.a(at(), iMediaPlayer, i2);
                break;
        }
        return super.onInfo(iMediaPlayer, i, i2);
    }

    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (aw().a.equals(Player.NONE)) {
            this.e.e();
        }
        PlayerParams au = au();
        if (au != null) {
            mmg.a().a(au.c.g(), i, new Exception(String.valueOf(i2)), ar());
        }
        return super.onError(iMediaPlayer, i, i2);
    }

    public void a(int i, Object... objArr) {
        super.a(i, objArr);
        switch (i) {
            case 65561:
                PlayerParams au = au();
                if (au != null) {
                    mmg.a().c(au.c.g(), ar());
                    return;
                }
                return;
            case 65569:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof IMediaPlayer)) {
                    this.m.a(at(), (IMediaPlayer) objArr[0]);
                    return;
                }
                return;
            case 65570:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof IMediaPlayer)) {
                    this.m.f(at(), (IMediaPlayer) objArr[0], this.v);
                    return;
                }
                return;
            case 65571:
                if (objArr != null && objArr.length > 0 && (objArr[0] instanceof IMediaPlayer)) {
                    this.m.g(at(), (IMediaPlayer) objArr[0], this.v);
                    return;
                }
                return;
            case 1120662:
                this.e.i = 1;
                return;
            case 1120665:
                this.e.i = 3;
                return;
            case 1120667:
                this.e.i = 2;
                return;
            default:
                return;
        }
    }

    public boolean a(int i, Bundle bundle) {
        long j = 0;
        int i2;
        mvb ar;
        long s;
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                String string = bundle.getString(ParamKey.URL, null);
                mvb ar2 = ar();
                if (ar2 != null) {
                    j = (long) ar2.s();
                }
                this.m.a(at(), j, string);
                break;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                String string2 = bundle.getString(ParamKey.URL, null);
                int i3 = bundle.getInt(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), 0);
                i2 = bundle.getInt(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96}), 0);
                long j2 = bundle.getLong(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96}), 0);
                ar = ar();
                if (ar != null) {
                    s = (long) ar.s();
                } else {
                    s = 0;
                }
                this.m.a(at(), s, string2, i2, this.v, j2, i3);
                break;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                String string3 = bundle.getString(ParamKey.URL, null);
                ar = ar();
                if (ar != null) {
                    s = (long) ar.s();
                } else {
                    s = 0;
                }
                this.m.a(at(), s, bundle.getLong(hae.a(new byte[]{(byte) 106, (byte) 99, (byte) 99, (byte) 118, (byte) 96, (byte) 113}), 0), string3);
                break;
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                String string4 = bundle.getString(ParamKey.URL, null);
                int i4 = bundle.getInt(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), 0);
                i2 = bundle.getInt(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96}), 0);
                ar = ar();
                if (ar != null) {
                    s = (long) ar.s();
                } else {
                    s = 0;
                }
                this.m.a(at(), s, i4, i2, bundle.getLong(hae.a(new byte[]{(byte) 106, (byte) 99, (byte) 99, (byte) 118, (byte) 96, (byte) 113}), 0), this.v, string4);
                break;
            case 131074:
                this.v = bundle.getString("ip", null);
                break;
            case 131075:
            case 131077:
                this.m.a(bundle.getInt(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125}), 0));
                this.m.a(bundle.getString(ParamKey.URL, null));
                break;
        }
        return super.a(i, bundle);
    }

    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        super.onSeekComplete(iMediaPlayer);
        this.m.b(at(), iMediaPlayer);
    }

    protected void l_() {
        super.l_();
        this.f.a(au());
        if (Y()) {
            this.f.a = hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 112, (byte) 118, (byte) 96});
        } else {
            this.f.a = "play";
        }
        H();
        I();
    }

    public void a(Configuration configuration) {
        super.a(configuration);
    }

    private int C() {
        try {
            mvb ar = ar();
            if (ar == null) {
                return 1;
            }
            mwc r = ar.r();
            if (r == null || !mvj.b(r.g)) {
                return 1;
            }
            return 2;
        } catch (Throwable e) {
            ibn.a(e);
            return 0;
        }
    }

    private int D() {
        try {
            if (ar().r() == null) {
                return 0;
            }
            if (mvj.b(ar().r().g)) {
                return 2;
            }
            MediaInfo mediaInfo = ar().r().g;
            if (mediaInfo == null) {
                return 1;
            }
            if (TextUtils.equals(mediaInfo.mVideoDecoder, hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}))) {
                return 4;
            }
            if (mvj.a(mediaInfo)) {
                return 6;
            }
            return 5;
        } catch (Throwable e) {
            ibn.a(e);
            return 0;
        }
    }

    private int F() {
        mvb ar = ar();
        if (ar != null && ar.h()) {
            return 4;
        }
        if (aD()) {
            return 1;
        }
        if (this.g) {
            return 3;
        }
        return 2;
    }

    private void G() {
        try {
            mty.a(this.e.j, this.e.n, this.e.k, this.e.l, this.e.q, this.e.m, this.e.r, this.e.p, this.e.o, this.e.s, C(), d.c());
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    private void c(boolean z) {
        try {
            mty.a(this.e.j, this.e.n, this.e.k, this.e.l, this.e.q, this.e.m, this.e.r, (long) this.e.h, this.e.c, r() - this.e.b, this.e.e, this.e.p, this.e.o, this.e.s, d.c(), this.e.i, C(), z);
        } catch (Throwable e) {
            ibn.a(e);
        }
        this.e.a();
    }

    private void a(String str) {
        this.f.b();
        this.f.a = str;
        this.f.a(au());
        H();
    }

    private void H() {
        try {
            PlayerParams au = au();
            if (au == null || !this.f.a()) {
                this.f.b();
                return;
            }
            mty.a(this.f.a, this.f.c, this.f.e, this.f.g, this.f.h, this.f.i, this.f.j, this.f.k, this.f.l, this.f.m, F(), b(au.c.j), D(), Constants.STR_EMPTY, (long) (x() / 1000));
            this.f.b();
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    private void b(String str, String str2) {
        a(str, str2, null, null);
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            this.f.b();
            this.f.a = str;
            if (str2 != null) {
                this.f.c = str2;
            }
            if (!TextUtils.isEmpty(str3)) {
                this.f.b = str3;
            }
            if (!TextUtils.isEmpty(str4)) {
                this.f.d = str4;
            }
            this.f.a(au());
            I();
        }
    }

    private void I() {
        try {
            PlayerParams au = au();
            if (au == null || !this.f.a()) {
                this.f.b();
                return;
            }
            String M = M();
            String valueOf = String.valueOf(b(au.c.j));
            String valueOf2 = String.valueOf(D());
            String valueOf3 = String.valueOf(x() / 1000);
            L();
            String str = Constants.STR_EMPTY;
            VideoViewParams videoViewParams = au.c;
            if (videoViewParams != null) {
                str = videoViewParams.k();
            }
            mtz.a(hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 51}), this.f.a, this.f.b, this.f.c, this.f.d, this.f.f, String.valueOf(this.f.g), this.f.h, String.valueOf(this.f.i), String.valueOf(this.f.j), String.valueOf(this.f.k), String.valueOf(this.f.l), this.f.n, String.valueOf(this.f.m), M, valueOf, valueOf2, str, valueOf3).a();
            this.f.b();
        } catch (Throwable e) {
            ibn.a(e);
        }
    }

    @WorkerThread
    private void c(String str, String str2) {
        a(new mmm(this, str, str2));
    }

    final /* synthetic */ void a(String str, String str2) {
        d(str, str2);
    }

    @MainThread
    private void d(String str, String str2) {
        a(hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 51}), str, hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), str2, str2);
    }

    @MainThread
    private void a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.f.b();
            this.f.a = str2;
            this.f.c = str4;
            this.f.d = str5;
            this.f.a(au());
            PlayerParams au = au();
            if (au == null || !this.f.a()) {
                this.f.b();
                return;
            }
            mmq a = mmq.a(this.f.a, this.f.c, this.f.d, this.f.f, String.valueOf(this.f.g), String.valueOf(this.f.h), String.valueOf(this.f.i), String.valueOf(this.f.j), String.valueOf(this.f.k), String.valueOf(this.f.l), this.f.n, String.valueOf(this.f.m), String.valueOf(F()), String.valueOf(b(au.c.j)), String.valueOf(D()), Constants.STR_EMPTY, String.valueOf(x() / 1000));
            a.b = str3;
            mmp.a(str, a);
            this.f.b();
        } catch (Exception e) {
            BLog.e(hae.a(new byte[]{(byte) 87, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 68, (byte) 97, (byte) 100, (byte) 117, (byte) 113, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 63, (byte) 37}) + e.getMessage());
        }
    }

    private void J() {
        b(this.n);
        a(this.n, StatisticConfig.MIN_UPLOAD_INTERVAL);
    }

    private void K() {
        if (bl.mpj.b.c()) {
            J();
        }
    }

    private void c(int i) {
        PlayerParams au = au();
        Context as = as();
        if (au != null && as != null && blk.a().g()) {
            int X = X();
            if (X != -1 && X != 0 && X != 1) {
                long j;
                int i2;
                long i3 = eva.a(as).i();
                ResolveResourceParams g = au.c.g();
                X = x();
                b(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 70, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 107, (byte) 113, (byte) 85, (byte) 106, (byte) 118, (byte) 108, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), new Object[]{Integer.valueOf(X)});
                int intValue = ((Integer) mst.a(au).a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 111, (byte) 112, (byte) 104, (byte) 117, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}), Integer.valueOf(0))).intValue();
                int[] a = mhc.a(g, mst.a(au()), at());
                long j2 = 0;
                long j3 = 0;
                if (g.c()) {
                    try {
                        j2 = Long.parseLong(g.mSeasonId);
                    } catch (NumberFormatException e) {
                    }
                    j3 = g.mEpisodeId;
                    j = j2;
                } else {
                    j = j2;
                }
                if (i == 1) {
                    i2 = 0;
                } else {
                    i2 = X / 1000;
                }
                ((HeartbeatApiService) gnd.a(HeartbeatApiService.class)).report(new Params(g.mAvid, g.mCid, i3, (long) i2, this.j, intValue, a[0], a[1], j, j3, i)).b();
            }
        }
    }

    private void b(String str) {
        PlayerParams au = au();
        if (au != null) {
            L();
            String M = M();
            this.f.b = str;
            String str2 = Constants.STR_EMPTY;
            VideoViewParams videoViewParams = au.c;
            if (videoViewParams != null) {
                str2 = videoViewParams.k();
            }
            mtz.a(hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 51}), this.f.a, this.f.b, this.f.c, this.f.d, this.f.f, String.valueOf(this.f.g), this.f.h, String.valueOf(this.f.i), String.valueOf(this.f.j), String.valueOf(this.f.k), String.valueOf(this.f.l), this.f.n, String.valueOf(this.f.m), M, String.valueOf(b(au.c.j)), String.valueOf(D()), str2, String.valueOf(x() / 1000)).a();
        }
    }

    private void L() {
        this.f.n = this.o;
        if (!TextUtils.equals(this.f.n, WeiboAuthException.DEFAULT_AUTH_ERROR_CODE)) {
            return;
        }
        if (bl.mpn.a.a(blg.a())) {
            this.f.n = Constants.VIA_SSO_LOGIN;
        } else {
            this.f.n = Constants.VIA_TO_TYPE_QQ_GROUP;
        }
    }

    @NonNull
    private String M() {
        String str = Constants.VIA_RESULT_SUCCESS;
        mvb ar = ar();
        if (ar == null) {
            return str;
        }
        Activity ao = ao();
        if (ar.h() && ao != null && !ao.hasWindowFocus()) {
            return Constants.VIA_TO_TYPE_QZONE;
        }
        boolean ac = ac();
        boolean Z = Z();
        if (!ac && Z) {
            return Constants.VIA_TO_TYPE_QQ_GROUP;
        }
        if (ac && Z) {
            if (this.g) {
                return Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP;
            }
            return Constants.VIA_SSO_LOGIN;
        } else if (!ac && !Z) {
            return Constants.VIA_SHARE_TYPE_TEXT;
        } else {
            if (!ac || Z) {
                return str;
            }
            if (this.g) {
                return Constants.VIA_SHARE_TYPE_PUBLISHMOOD;
            }
            return Constants.VIA_SHARE_TYPE_INFO;
        }
    }
}
