package bili.bl;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.ad.adview.banner.BannerBean;
import com.bilibili.ad.adview.common.Motion;
import com.bilibili.ad.adview.feed.model.FeedExtra;
import com.bilibili.ad.adview.web.AdWebActivity;
import java.util.ArrayList;

/* compiled from: BL */
public class ajl {
    public static int A = 0;
    private static final String B = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 112, (byte) 119, (byte) 108, (byte) 40, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119, (byte) 42});
    private static final String C = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 40, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119, (byte) 42});
    public static final String a = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 42});
    public static final String b = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 42, (byte) 98, (byte) 96, (byte) 113, (byte) 40, (byte) 104, (byte) 108, (byte) 97, (byte) 42});
    public static final String c = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 42, (byte) 98, (byte) 96, (byte) 113, (byte) 40, (byte) 103, (byte) 112, (byte) 115, (byte) 108, (byte) 97, (byte) 42});
    public static final String d = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 103, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 119, (byte) 42, (byte) 112, (byte) 118, (byte) 96, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 114, (byte) 96, (byte) 103});
    public static final String e = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 96, (byte) 103, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 42, (byte) 118, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96, (byte) 90, (byte) 96, (byte) 107, (byte) 113, (byte) 96, (byte) 119});
    public static final String f = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 96, (byte) 103, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 42, (byte) 118, (byte) 112, (byte) 108, (byte) 102, (byte) 108, (byte) 97, (byte) 96, (byte) 90, (byte) 105, (byte) 96, (byte) 100, (byte) 115, (byte) 96});
    public static final String g = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 103, (byte) 105, (byte) 100, (byte) 107, (byte) 110, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 97, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 42, (byte) 100, (byte) 97, (byte) 90, (byte) 118, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107});
    public static final String h = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 103, (byte) 105, (byte) 100, (byte) 107, (byte) 110, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 42, (byte) 100, (byte) 97, (byte) 90, (byte) 118, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107});
    public static final String i = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 96, (byte) 125, (byte) 117, (byte) 106, (byte) 118, (byte) 96});
    public static final String j = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
    public static final String k = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 105, (byte) 106, (byte) 118, (byte) 96});
    public static final String l = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 96, (byte) 125, (byte) 117, (byte) 106, (byte) 118, (byte) 96, (byte) 40, (byte) 104, (byte) 104, (byte) 100});
    public static final String m = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 40, (byte) 104, (byte) 104, (byte) 100});
    public static final String n = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 40, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113});
    public static final String o = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 119, (byte) 96, (byte) 113, (byte) 119, (byte) 124, (byte) 90, (byte) 106, (byte) 107, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 90, (byte) 112, (byte) 117});
    public static final String p = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 96, (byte) 125, (byte) 117, (byte) 106, (byte) 118, (byte) 96, (byte) 40, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113});
    public static final String q = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 40, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113});
    public static final String r = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 105, (byte) 106, (byte) 118, (byte) 96, (byte) 40, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113});
    public static final String s = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 108, (byte) 107, (byte) 99, (byte) 106});
    public static final String t = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 102, (byte) 104, (byte) 40, (byte) 104, (byte) 100, (byte) 119, (byte) 110});
    public static final String u = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 103, (byte) 108, (byte) 107, (byte) 97, (byte) 40, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97});
    public static final String v = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 112, (byte) 107, (byte) 103, (byte) 108, (byte) 107, (byte) 97, (byte) 40, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97});
    public static final String w = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 100, (byte) 97, (byte) 97, (byte) 40, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 40, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110});
    public static final String x = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 119, (byte) 96, (byte) 104, (byte) 106, (byte) 115, (byte) 96, (byte) 40, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 40, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110});
    public static final String y = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 42, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 108, (byte) 107});
    public static final String z = hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 100, (byte) 97, (byte) 42, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 42, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 106, (byte) 112, (byte) 113});

    /* compiled from: BL */
    public static class a implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            return bl_fjg == null ? null : null;
        }
    }

    /* compiled from: BL */
    public static class b implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            alz.d();
            return null;
        }
    }

    /* compiled from: BL */
    public static class c implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg != null) {
                Bundle bundle = bl_fjg.b;
                if (bundle != null) {
                    try {
                        alz.a(bundle.getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 106, (byte) 102}), false), bundle.getString(hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 112, (byte) 119, (byte) 105})), ajl.a(bundle, hae.a(new byte[]{(byte) 118, (byte) 119, (byte) 102, (byte) 90, (byte) 108, (byte) 97})), bundle.getString("ip"), bundle.getString(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 97})), bundle.getString(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100})), new Motion());
                    } catch (Exception e) {
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class d implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (!(bl_fjg == null || bl_fjg.c == null)) {
                bl_fjg.c.sendBroadcast(new Intent(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 108, (byte) 107})));
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class e implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (!(bl_fjg == null || bl_fjg.c == null)) {
                bl_fjg.c.sendBroadcast(new Intent(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 108, (byte) 107, (byte) 118, (byte) 113, (byte) 100, (byte) 105, (byte) 105, (byte) 90, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 106, (byte) 112, (byte) 113})));
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class f implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg != null) {
                Bundle bundle = bl_fjg.b;
                if (bundle != null) {
                    try {
                        alz.a(bundle.getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 106, (byte) 102}), false), bundle.getString(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 90, (byte) 112, (byte) 119, (byte) 105})), ajl.a(bundle, hae.a(new byte[]{(byte) 118, (byte) 119, (byte) 102, (byte) 90, (byte) 108, (byte) 97})), bundle.getString("ip"), bundle.getString(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 90, (byte) 108, (byte) 97})), ajl.a(bundle, hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 108, (byte) 97})), bundle.getString(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100})));
                    } catch (Exception e) {
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class g implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            alz.e();
            return null;
        }
    }

    /* compiled from: BL */
    public static class h implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg != null) {
                ala.a().a(bl_fjg.c);
                ala.a().a(bl_fjg.c, 1);
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class i implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg != null) {
                Bundle bundle = bl_fjg.b;
                if (bundle != null) {
                    try {
                        alz.b(bundle.getString("uri", BuildConfig.VERSION_NAME));
                    } catch (Exception e) {
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class j implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Void a(bl.fjg r19) {
            /*
            r18 = this;
            if (r19 != 0) goto L_0x0004;
        L_0x0002:
            r1 = 0;
        L_0x0003:
            return r1;
        L_0x0004:
            r0 = r19;
            r0 = r0.b;
            r16 = r0;
            if (r16 == 0) goto L_0x00b9;
        L_0x000c:
            r1 = 9;
            r1 = new byte[r1];	 Catch:{ Exception -> 0x00bc }
            r1 = {108, 118, 90, 100, 97, 90, 105, 106, 102};	 Catch:{ Exception -> 0x00bc }
            r1 = bl.hae.a(r1);	 Catch:{ Exception -> 0x00bc }
            r2 = 0;
            r0 = r16;
            r1 = r0.getBoolean(r1, r2);	 Catch:{ Exception -> 0x00bc }
            r2 = 5;
            r2 = new byte[r2];	 Catch:{ Exception -> 0x00bc }
            r2 = {108, 118, 90, 100, 97};	 Catch:{ Exception -> 0x00bc }
            r2 = bl.hae.a(r2);	 Catch:{ Exception -> 0x00bc }
            r3 = 0;
            r0 = r16;
            r2 = r0.getBoolean(r2, r3);	 Catch:{ Exception -> 0x00bc }
            r3 = 5;
            r3 = new byte[r3];	 Catch:{ Exception -> 0x00bc }
            r3 = {100, 97, 90, 102, 103};	 Catch:{ Exception -> 0x00bc }
            r3 = bl.hae.a(r3);	 Catch:{ Exception -> 0x00bc }
            r4 = "";
            r0 = r16;
            r3 = r0.getString(r3, r4);	 Catch:{ Exception -> 0x00bc }
            r4 = 6;
            r4 = new byte[r4];	 Catch:{ Exception -> 0x00bc }
            r4 = {118, 119, 102, 90, 108, 97};	 Catch:{ Exception -> 0x00bc }
            r4 = bl.hae.a(r4);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r4 = bl.ajl.a(r0, r4);	 Catch:{ Exception -> 0x00bc }
            r6 = "idx";
            r0 = r16;
            r6 = bl.ajl.a(r0, r6);	 Catch:{ Exception -> 0x00bc }
            r8 = "ip";
            r9 = "";
            r0 = r16;
            r8 = r0.getString(r8, r9);	 Catch:{ Exception -> 0x00bc }
            r9 = 11;
            r9 = new byte[r9];	 Catch:{ Exception -> 0x00bc }
            r9 = {118, 96, 119, 115, 96, 119, 90, 113, 124, 117, 96};	 Catch:{ Exception -> 0x00bc }
            r9 = bl.hae.a(r9);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r9 = bl.ajl.a(r0, r9);	 Catch:{ Exception -> 0x00bc }
            r11 = 11;
            r11 = new byte[r11];	 Catch:{ Exception -> 0x00bc }
            r11 = {119, 96, 118, 106, 112, 119, 102, 96, 90, 108, 97};	 Catch:{ Exception -> 0x00bc }
            r11 = bl.hae.a(r11);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r11 = bl.ajl.a(r0, r11);	 Catch:{ Exception -> 0x00bc }
            r13 = "id";
            r0 = r16;
            r13 = bl.ajl.a(r0, r13);	 Catch:{ Exception -> 0x00bc }
            r15 = 11;
            r15 = new byte[r15];	 Catch:{ Exception -> 0x00bc }
            r15 = {103, 112, 113, 113, 106, 107, 90, 118, 109, 106, 114};	 Catch:{ Exception -> 0x00bc }
            r15 = bl.hae.a(r15);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r15 = r0.getBoolean(r15);	 Catch:{ Exception -> 0x00bc }
            r17 = 10;
            r0 = r17;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00bc }
            r17 = r0;
            r17 = {102, 100, 119, 97, 90, 108, 107, 97, 96, 125};	 Catch:{ Exception -> 0x00bc }
            r17 = bl.hae.a(r17);	 Catch:{ Exception -> 0x00bc }
            r16 = r16.getLong(r17);	 Catch:{ Exception -> 0x00bc }
            bl.alz.a(r1, r2, r3, r4, r6, r8, r9, r11, r13, r15, r16);	 Catch:{ Exception -> 0x00bc }
        L_0x00b9:
            r1 = 0;
            goto L_0x0003;
        L_0x00bc:
            r1 = move-exception;
            goto L_0x00b9;
            */
            throw new UnsupportedOperationException("Method not decompiled: bl.ajl.j.a(bl.fjg):java.lang.Void");
        }
    }

    /* compiled from: BL */
    public static class k implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Void a(bl.fjg r19) {
            /*
            r18 = this;
            if (r19 != 0) goto L_0x0004;
        L_0x0002:
            r1 = 0;
        L_0x0003:
            return r1;
        L_0x0004:
            r0 = r19;
            r0 = r0.b;
            r16 = r0;
            if (r16 == 0) goto L_0x00b9;
        L_0x000c:
            r1 = 9;
            r1 = new byte[r1];	 Catch:{ Exception -> 0x00bc }
            r1 = {108, 118, 90, 100, 97, 90, 105, 106, 102};	 Catch:{ Exception -> 0x00bc }
            r1 = bl.hae.a(r1);	 Catch:{ Exception -> 0x00bc }
            r2 = 0;
            r0 = r16;
            r1 = r0.getBoolean(r1, r2);	 Catch:{ Exception -> 0x00bc }
            r2 = 5;
            r2 = new byte[r2];	 Catch:{ Exception -> 0x00bc }
            r2 = {108, 118, 90, 100, 97};	 Catch:{ Exception -> 0x00bc }
            r2 = bl.hae.a(r2);	 Catch:{ Exception -> 0x00bc }
            r3 = 0;
            r0 = r16;
            r2 = r0.getBoolean(r2, r3);	 Catch:{ Exception -> 0x00bc }
            r3 = 5;
            r3 = new byte[r3];	 Catch:{ Exception -> 0x00bc }
            r3 = {100, 97, 90, 102, 103};	 Catch:{ Exception -> 0x00bc }
            r3 = bl.hae.a(r3);	 Catch:{ Exception -> 0x00bc }
            r4 = "";
            r0 = r16;
            r3 = r0.getString(r3, r4);	 Catch:{ Exception -> 0x00bc }
            r4 = 6;
            r4 = new byte[r4];	 Catch:{ Exception -> 0x00bc }
            r4 = {118, 119, 102, 90, 108, 97};	 Catch:{ Exception -> 0x00bc }
            r4 = bl.hae.a(r4);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r4 = bl.ajl.a(r0, r4);	 Catch:{ Exception -> 0x00bc }
            r6 = "idx";
            r0 = r16;
            r6 = bl.ajl.a(r0, r6);	 Catch:{ Exception -> 0x00bc }
            r8 = "ip";
            r9 = "";
            r0 = r16;
            r8 = r0.getString(r8, r9);	 Catch:{ Exception -> 0x00bc }
            r9 = 11;
            r9 = new byte[r9];	 Catch:{ Exception -> 0x00bc }
            r9 = {118, 96, 119, 115, 96, 119, 90, 113, 124, 117, 96};	 Catch:{ Exception -> 0x00bc }
            r9 = bl.hae.a(r9);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r9 = bl.ajl.a(r0, r9);	 Catch:{ Exception -> 0x00bc }
            r11 = 11;
            r11 = new byte[r11];	 Catch:{ Exception -> 0x00bc }
            r11 = {119, 96, 118, 106, 112, 119, 102, 96, 90, 108, 97};	 Catch:{ Exception -> 0x00bc }
            r11 = bl.hae.a(r11);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r11 = bl.ajl.a(r0, r11);	 Catch:{ Exception -> 0x00bc }
            r13 = "id";
            r0 = r16;
            r13 = bl.ajl.a(r0, r13);	 Catch:{ Exception -> 0x00bc }
            r15 = 11;
            r15 = new byte[r15];	 Catch:{ Exception -> 0x00bc }
            r15 = {103, 112, 113, 113, 106, 107, 90, 118, 109, 106, 114};	 Catch:{ Exception -> 0x00bc }
            r15 = bl.hae.a(r15);	 Catch:{ Exception -> 0x00bc }
            r0 = r16;
            r15 = r0.getBoolean(r15);	 Catch:{ Exception -> 0x00bc }
            r17 = 10;
            r0 = r17;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00bc }
            r17 = r0;
            r17 = {102, 100, 119, 97, 90, 108, 107, 97, 96, 125};	 Catch:{ Exception -> 0x00bc }
            r17 = bl.hae.a(r17);	 Catch:{ Exception -> 0x00bc }
            r16 = r16.getLong(r17);	 Catch:{ Exception -> 0x00bc }
            bl.alz.b(r1, r2, r3, r4, r6, r8, r9, r11, r13, r15, r16);	 Catch:{ Exception -> 0x00bc }
        L_0x00b9:
            r1 = 0;
            goto L_0x0003;
        L_0x00bc:
            r1 = move-exception;
            goto L_0x00b9;
            */
            throw new UnsupportedOperationException("Method not decompiled: bl.ajl.k.a(bl.fjg):java.lang.Void");
        }
    }

    /* compiled from: BL */
    public static class l implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg == null) {
                return null;
            }
            Bundle bundle = bl_fjg.b;
            if (bundle != null) {
                try {
                    alz.a(bundle.getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 106, (byte) 102}), false), bundle.getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 97}), false), bundle.getString(hae.a(new byte[]{(byte) 100, (byte) 97, (byte) 90, (byte) 102, (byte) 103}), BuildConfig.VERSION_NAME), ajl.a(bundle, hae.a(new byte[]{(byte) 118, (byte) 119, (byte) 102, (byte) 90, (byte) 108, (byte) 97})), ajl.a(bundle, "idx"), bundle.getString("ip", BuildConfig.VERSION_NAME), ajl.a(bundle, hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96})), ajl.a(bundle, hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 97})), ajl.a(bundle, "id"));
                } catch (Exception e) {
                }
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class m implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg == null) {
                return null;
            }
            Bundle bundle = bl_fjg.b;
            if (bundle != null) {
                try {
                    alz.b(bundle.getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 97, (byte) 90, (byte) 105, (byte) 106, (byte) 102}), false), bundle.getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 100, (byte) 97}), false), bundle.getString(hae.a(new byte[]{(byte) 100, (byte) 97, (byte) 90, (byte) 102, (byte) 103}), BuildConfig.VERSION_NAME), ajl.a(bundle, hae.a(new byte[]{(byte) 118, (byte) 119, (byte) 102, (byte) 90, (byte) 108, (byte) 97})), ajl.a(bundle, "idx"), bundle.getString("ip", BuildConfig.VERSION_NAME), ajl.a(bundle, hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 119, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96})), ajl.a(bundle, hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 112, (byte) 119, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 97})), ajl.a(bundle, "id"));
                } catch (Exception e) {
                }
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class n implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Void a(bl.fjg r19) {
            /*
            r18 = this;
            if (r19 != 0) goto L_0x0004;
        L_0x0002:
            r2 = 0;
        L_0x0003:
            return r2;
        L_0x0004:
            r0 = r19;
            r0 = r0.b;
            r16 = r0;
            if (r16 == 0) goto L_0x00a8;
        L_0x000c:
            r2 = 9;
            r2 = new byte[r2];	 Catch:{ Exception -> 0x00ab }
            r2 = {108, 118, 90, 100, 97, 90, 105, 106, 102};	 Catch:{ Exception -> 0x00ab }
            r2 = bl.hae.a(r2);	 Catch:{ Exception -> 0x00ab }
            r3 = 0;
            r0 = r16;
            r2 = r0.getBoolean(r2, r3);	 Catch:{ Exception -> 0x00ab }
            r3 = 5;
            r3 = new byte[r3];	 Catch:{ Exception -> 0x00ab }
            r3 = {108, 118, 90, 100, 97};	 Catch:{ Exception -> 0x00ab }
            r3 = bl.hae.a(r3);	 Catch:{ Exception -> 0x00ab }
            r4 = 0;
            r0 = r16;
            r3 = r0.getBoolean(r3, r4);	 Catch:{ Exception -> 0x00ab }
            r4 = 5;
            r4 = new byte[r4];	 Catch:{ Exception -> 0x00ab }
            r4 = {100, 97, 90, 102, 103};	 Catch:{ Exception -> 0x00ab }
            r4 = bl.hae.a(r4);	 Catch:{ Exception -> 0x00ab }
            r5 = "";
            r0 = r16;
            r4 = r0.getString(r4, r5);	 Catch:{ Exception -> 0x00ab }
            r5 = 6;
            r5 = new byte[r5];	 Catch:{ Exception -> 0x00ab }
            r5 = {118, 119, 102, 90, 108, 97};	 Catch:{ Exception -> 0x00ab }
            r5 = bl.hae.a(r5);	 Catch:{ Exception -> 0x00ab }
            r0 = r16;
            r5 = bl.ajl.a(r0, r5);	 Catch:{ Exception -> 0x00ab }
            r7 = "idx";
            r0 = r16;
            r7 = bl.ajl.a(r0, r7);	 Catch:{ Exception -> 0x00ab }
            r9 = "ip";
            r10 = "";
            r0 = r16;
            r9 = r0.getString(r9, r10);	 Catch:{ Exception -> 0x00ab }
            r10 = 11;
            r10 = new byte[r10];	 Catch:{ Exception -> 0x00ab }
            r10 = {118, 96, 119, 115, 96, 119, 90, 113, 124, 117, 96};	 Catch:{ Exception -> 0x00ab }
            r10 = bl.hae.a(r10);	 Catch:{ Exception -> 0x00ab }
            r0 = r16;
            r10 = bl.ajl.a(r0, r10);	 Catch:{ Exception -> 0x00ab }
            r12 = 11;
            r12 = new byte[r12];	 Catch:{ Exception -> 0x00ab }
            r12 = {119, 96, 118, 106, 112, 119, 102, 96, 90, 108, 97};	 Catch:{ Exception -> 0x00ab }
            r12 = bl.hae.a(r12);	 Catch:{ Exception -> 0x00ab }
            r0 = r16;
            r12 = bl.ajl.a(r0, r12);	 Catch:{ Exception -> 0x00ab }
            r14 = "id";
            r0 = r16;
            r14 = bl.ajl.a(r0, r14);	 Catch:{ Exception -> 0x00ab }
            r17 = 10;
            r0 = r17;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00ab }
            r17 = r0;
            r17 = {119, 96, 116, 112, 96, 118, 113, 90, 108, 97};	 Catch:{ Exception -> 0x00ab }
            r17 = bl.hae.a(r17);	 Catch:{ Exception -> 0x00ab }
            r16 = r16.getString(r17);	 Catch:{ Exception -> 0x00ab }
            bl.alz.a(r2, r3, r4, r5, r7, r9, r10, r12, r14, r16);	 Catch:{ Exception -> 0x00ab }
        L_0x00a8:
            r2 = 0;
            goto L_0x0003;
        L_0x00ab:
            r2 = move-exception;
            goto L_0x00a8;
            */
            throw new UnsupportedOperationException("Method not decompiled: bl.ajl.n.a(bl.fjg):java.lang.Void");
        }
    }

    /* compiled from: BL */
    public static class o implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Void a(bl.fjg r23) {
            /*
            r22 = this;
            if (r23 != 0) goto L_0x0004;
        L_0x0002:
            r2 = 0;
        L_0x0003:
            return r2;
        L_0x0004:
            r0 = r23;
            r0 = r0.b;
            r20 = r0;
            if (r20 == 0) goto L_0x00ed;
        L_0x000c:
            r2 = 9;
            r2 = new byte[r2];	 Catch:{ Exception -> 0x00f0 }
            r2 = {108, 118, 90, 100, 97, 90, 105, 106, 102};	 Catch:{ Exception -> 0x00f0 }
            r2 = bl.hae.a(r2);	 Catch:{ Exception -> 0x00f0 }
            r3 = 0;
            r0 = r20;
            r2 = r0.getBoolean(r2, r3);	 Catch:{ Exception -> 0x00f0 }
            r3 = 5;
            r3 = new byte[r3];	 Catch:{ Exception -> 0x00f0 }
            r3 = {108, 118, 90, 100, 97};	 Catch:{ Exception -> 0x00f0 }
            r3 = bl.hae.a(r3);	 Catch:{ Exception -> 0x00f0 }
            r4 = 0;
            r0 = r20;
            r3 = r0.getBoolean(r3, r4);	 Catch:{ Exception -> 0x00f0 }
            r4 = 5;
            r4 = new byte[r4];	 Catch:{ Exception -> 0x00f0 }
            r4 = {100, 97, 90, 102, 103};	 Catch:{ Exception -> 0x00f0 }
            r4 = bl.hae.a(r4);	 Catch:{ Exception -> 0x00f0 }
            r5 = "";
            r0 = r20;
            r4 = r0.getString(r4, r5);	 Catch:{ Exception -> 0x00f0 }
            r5 = 6;
            r5 = new byte[r5];	 Catch:{ Exception -> 0x00f0 }
            r5 = {118, 119, 102, 90, 108, 97};	 Catch:{ Exception -> 0x00f0 }
            r5 = bl.hae.a(r5);	 Catch:{ Exception -> 0x00f0 }
            r0 = r20;
            r5 = bl.ajl.a(r0, r5);	 Catch:{ Exception -> 0x00f0 }
            r7 = "idx";
            r0 = r20;
            r7 = bl.ajl.a(r0, r7);	 Catch:{ Exception -> 0x00f0 }
            r9 = "ip";
            r10 = "";
            r0 = r20;
            r9 = r0.getString(r9, r10);	 Catch:{ Exception -> 0x00f0 }
            r10 = 11;
            r10 = new byte[r10];	 Catch:{ Exception -> 0x00f0 }
            r10 = {118, 96, 119, 115, 96, 119, 90, 113, 124, 117, 96};	 Catch:{ Exception -> 0x00f0 }
            r10 = bl.hae.a(r10);	 Catch:{ Exception -> 0x00f0 }
            r0 = r20;
            r10 = bl.ajl.a(r0, r10);	 Catch:{ Exception -> 0x00f0 }
            r12 = 11;
            r12 = new byte[r12];	 Catch:{ Exception -> 0x00f0 }
            r12 = {119, 96, 118, 106, 112, 119, 102, 96, 90, 108, 97};	 Catch:{ Exception -> 0x00f0 }
            r12 = bl.hae.a(r12);	 Catch:{ Exception -> 0x00f0 }
            r0 = r20;
            r12 = bl.ajl.a(r0, r12);	 Catch:{ Exception -> 0x00f0 }
            r14 = "id";
            r0 = r20;
            r14 = bl.ajl.a(r0, r14);	 Catch:{ Exception -> 0x00f0 }
            r16 = 10;
            r0 = r16;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00f0 }
            r16 = r0;
            r16 = {119, 96, 116, 112, 96, 118, 113, 90, 108, 97};	 Catch:{ Exception -> 0x00f0 }
            r16 = bl.hae.a(r16);	 Catch:{ Exception -> 0x00f0 }
            r0 = r20;
            r1 = r16;
            r16 = r0.getString(r1);	 Catch:{ Exception -> 0x00f0 }
            r17 = 11;
            r0 = r17;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00f0 }
            r17 = r0;
            r17 = {102, 119, 96, 100, 113, 108, 115, 96, 90, 108, 97};	 Catch:{ Exception -> 0x00f0 }
            r17 = bl.hae.a(r17);	 Catch:{ Exception -> 0x00f0 }
            r0 = r20;
            r1 = r17;
            r17 = bl.ajl.a(r0, r1);	 Catch:{ Exception -> 0x00f0 }
            r19 = 11;
            r0 = r19;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00f0 }
            r19 = r0;
            r19 = {103, 112, 113, 113, 106, 107, 90, 118, 109, 106, 114};	 Catch:{ Exception -> 0x00f0 }
            r19 = bl.hae.a(r19);	 Catch:{ Exception -> 0x00f0 }
            r0 = r20;
            r1 = r19;
            r19 = r0.getBoolean(r1);	 Catch:{ Exception -> 0x00f0 }
            r21 = 10;
            r0 = r21;
            r0 = new byte[r0];	 Catch:{ Exception -> 0x00f0 }
            r21 = r0;
            r21 = {102, 100, 119, 97, 90, 108, 107, 97, 96, 125};	 Catch:{ Exception -> 0x00f0 }
            r21 = bl.hae.a(r21);	 Catch:{ Exception -> 0x00f0 }
            r20 = r20.getLong(r21);	 Catch:{ Exception -> 0x00f0 }
            bl.alz.a(r2, r3, r4, r5, r7, r9, r10, r12, r14, r16, r17, r19, r20);	 Catch:{ Exception -> 0x00f0 }
        L_0x00ed:
            r2 = 0;
            goto L_0x0003;
        L_0x00f0:
            r2 = move-exception;
            goto L_0x00ed;
            */
            throw new UnsupportedOperationException("Method not decompiled: bl.ajl.o.a(bl.fjg):java.lang.Void");
        }
    }

    /* compiled from: BL */
    public static class p implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            return bl_fjg == null ? null : null;
        }
    }

    /* compiled from: BL */
    public static class q implements fit<Integer> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Integer a(fjg bl_fjg) {
            int i = -1;
            Bundle bundle = bl_fjg.b;
            if (bundle != null) {
                try {
                    int i2;
                    String string = bundle.getString(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100}));
                    if (!TextUtils.isEmpty(string)) {
                        FeedExtra feedExtra = (FeedExtra) zy.a(string, FeedExtra.class);
                        if (!(feedExtra == null || feedExtra.card == null)) {
                            i2 = feedExtra.card.cardType;
                            if (i2 == 4) {
                                i2 = 101;
                            } else if (i2 == 5) {
                                i2 = 102;
                            } else if (i2 == 6) {
                                i2 = 103;
                            }
                            i = i2;
                        }
                    }
                    i2 = -1;
                    i = i2;
                } catch (Exception e) {
                }
            }
            return Integer.valueOf(i);
        }
    }

    /* compiled from: BL */
    public static class r implements fit<Void> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Void a(fjg bl_fjg) {
            if (bl_fjg != null) {
                ala.a().b(bl_fjg.c);
            }
            return null;
        }
    }

    /* compiled from: BL */
    public static class s implements fit<Boolean> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Boolean a(fjg bl_fjg) {
            Uri uri = (Uri) bl_fjg.b.getParcelable("uri");
            if (uri != null) {
                try {
                    String queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 111, (byte) 112, (byte) 104, (byte) 117, (byte) 90, (byte) 112, (byte) 119, (byte) 105}));
                    String queryParameter2 = uri.getQueryParameter("data");
                    queryParameter = ajl.b(queryParameter);
                    queryParameter2 = ajl.b(queryParameter2);
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        return Boolean.valueOf(ajl.b(alz.c(), (BannerBean) zy.a(queryParameter2, BannerBean.class), queryParameter));
                    }
                } catch (Exception e) {
                }
            }
            return Boolean.valueOf(false);
        }
    }

    /* compiled from: BL */
    public static class t implements fit<String> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public String a(fjg bl_fjg) {
            String jSONObject;
            Throwable e;
            JSONObject jSONObject2 = new JSONObject();
            Context context = bl_fjg.c;
            try {
                ajl.A++;
                if (ajl.A == 1) {
                    amo.a(context, 7000);
                }
                if (!ajk.b()) {
                    return jSONObject2.toString();
                }
                Location a = amo.a(context, false);
                if (!(a == null || a.getTime() == 0)) {
                    jSONObject2.a("lng", String.valueOf(a.getLongitude()));
                    jSONObject2.a("lat", String.valueOf(a.getLatitude()));
                    jSONObject2.a(hae.a(new byte[]{(byte) 105, (byte) 103, (byte) 118, (byte) 90, (byte) 113, (byte) 118}), String.valueOf(a.getTime()));
                }
                CharSequence c = amo.c();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 107, (byte) 96, (byte) 113, (byte) 114, (byte) 106, (byte) 119, (byte) 110}), c);
                }
                c = amo.a(context);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 106, (byte) 117, (byte) 96, (byte) 119, (byte) 100, (byte) 113, (byte) 106, (byte) 119, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), c);
                }
                c = amo.b(context);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), c);
                }
                c = amo.c(context);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 90, (byte) 104, (byte) 100, (byte) 102}), c);
                }
                c = amo.d();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 115, (byte) 96, (byte) 107, (byte) 97, (byte) 106, (byte) 119}), c);
                }
                c = amo.f();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 105}), c);
                }
                c = amo.d(context);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 90, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96}), c);
                }
                c = amo.e(context);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a("imei", c);
                }
                c = amo.g();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a("mac", c);
                }
                c = amo.f(context);
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 108, (byte) 97}), c);
                }
                c = amo.h();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a("ua", c);
                }
                c = amo.i();
                if (!TextUtils.isEmpty(c)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 112, (byte) 100, (byte) 90, (byte) 118, (byte) 124, (byte) 118}), c);
                }
                CharSequence h = amo.h(context);
                if (!TextUtils.isEmpty(h)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 112, (byte) 100, (byte) 90, (byte) 114, (byte) 96, (byte) 103}), h);
                }
                h = amo.j();
                if (!TextUtils.isEmpty(h)) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 103, (byte) 108, (byte) 90, (byte) 100, (byte) 117, (byte) 117}), h);
                }
                h = amo.e();
                if (!TextUtils.isEmpty(h)) {
                    jSONObject2.a("os_v", h);
                }
                int k = amo.k();
                if (k > 0) {
                    jSONObject2.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 108, (byte) 105, (byte) 97}), Integer.valueOf(k));
                }
                jSONObject = jSONObject2.toString();
                try {
                    if (TextUtils.isEmpty(jSONObject)) {
                        return jSONObject;
                    }
                    return amn.a(amn.a, jSONObject);
                } catch (Exception e2) {
                    e = e2;
                    ibn.a(e);
                    return jSONObject;
                }
            } catch (Throwable e3) {
                Throwable th = e3;
                jSONObject = null;
                e = th;
                ibn.a(e);
                return jSONObject;
            }
        }
    }

    public static void a(@NonNull Context context, @NonNull Uri uri) {
        a(context, uri, true);
    }

    public static void a(@NonNull Context context, @NonNull Uri uri, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", uri.toString());
        bundle.putInt(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 106, (byte) 107, (byte) 105, (byte) 124}), z ? 1 : 0);
        fji.a().a(context).a(bundle).a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 112, (byte) 119, (byte) 108, (byte) 40, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119, (byte) 42}));
    }

    public static long a(Bundle bundle, String str) {
        long j = -1;
        try {
            j = bundle.getLong(str, -2147483647L);
        } catch (Exception e) {
        }
        if (j != -2147483647L) {
            return j;
        }
        try {
            return (long) bundle.getInt(str);
        } catch (Exception e2) {
            return j;
        }
    }

    public static Intent b(@NonNull Context context, @NonNull Uri uri, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", uri.toString());
        bundle.putInt(hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 106, (byte) 107, (byte) 105, (byte) 124}), z ? 1 : 0);
        return (Intent) fji.a().a(context).a(bundle).b(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 40, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 119, (byte) 42}));
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        return new String(Base64.decode(str.getBytes(), 0));
    }

    private static boolean b(Context context, BannerBean bannerBean, String str) {
        if (context == null || bannerBean == null) {
            return false;
        }
        String str2 = BuildConfig.VERSION_NAME;
        if (TextUtils.isEmpty(str) || Uri.parse(str) == null) {
            return false;
        }
        str2 = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        if (!"http".equals(str2) && !hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118}).equals(str2)) {
            return a(context, str2, str);
        }
        Intent a = alz.a(str);
        if (a != null) {
            try {
                a.addFlags(268435456);
                context.startActivity(a);
            } catch (Exception e) {
            }
        } else {
            if (bannerBean.a != null && alz.a(str, bannerBean.clickUrl, bannerBean.a.clickUrls)) {
                str = alz.a(str, bannerBean.requestId, bannerBean.ip, new Motion());
            }
            if (bannerBean.a == null || !bannerBean.a.useAdWebV2) {
                a(context, Uri.parse(str), false);
            } else {
                a = new Intent(context, AdWebActivity.class);
                a.putParcelableArrayListExtra(hae.a(new byte[]{(byte) 114, (byte) 109, (byte) 108, (byte) 113, (byte) 96, (byte) 90, (byte) 100, (byte) 117, (byte) 110, (byte) 90, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97}), (ArrayList) bannerBean.a.downloadWhitelist);
                a.putExtra(hae.a(new byte[]{(byte) 114, (byte) 109, (byte) 108, (byte) 113, (byte) 96, (byte) 90, (byte) 112, (byte) 119, (byte) 105, (byte) 90, (byte) 106, (byte) 117, (byte) 96, (byte) 107}), (ArrayList) bannerBean.a.openWhitelist);
                a.putExtra(hae.a(new byte[]{(byte) 100, (byte) 97, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96, (byte) 105}), bannerBean);
                a.addFlags(268435456);
                a.setData(Uri.parse(str));
                context.startActivity(a);
            }
        }
        return true;
    }

    private static boolean a(Context context, String str, String str2) {
        if (!hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108}).equals(str)) {
            return false;
        }
        a(context, Uri.parse(str2));
        return true;
    }
}
