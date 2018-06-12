package bili2.bl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import bl.fmm.b;
import bl.jp.a;
import com.alibaba.fastjson.JSONObject;
import com.tencent.mm.opensdk.modelpay.PayResp;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.concurrent.Callable;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class mal extends maj {
    private static final String a = hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124});
    private boolean b = false;
    private fib d;

    public boolean h() {
        return false;
    }

    @JavascriptInterface
    public void jumpToScheme(String str) {
        b e = this.c.e();
        if (e != null) {
            try {
                JSONObject b = zy.b(str);
                final Uri parse = Uri.parse(b.l("url"));
                String scheme = parse.getScheme();
                if (hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108}).equals(scheme)) {
                    if ("pay".equals(parse.getHost())) {
                        e.a().setResult("1".equals(parse.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 112, (byte) 118}))) ? -1 : 0);
                    } else {
                        kyq.a(e.a(), parse);
                    }
                    e.a().finish();
                } else if ("http".equals(scheme) || hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118}).equals(scheme)) {
                    this.c.a(new Runnable(this) {
                        final /* synthetic */ mal b;

                        public void run() {
                            b e = this.b.c.e();
                            if (e != null) {
                                e.c().a(parse, true);
                            }
                        }
                    });
                }
                if (b.l(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 76, (byte) 97})) != null) {
                    BLog.e(hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 111, (byte) 112, (byte) 104, (byte) 117, (byte) 81, (byte) 106, (byte) 86, (byte) 102, (byte) 109, (byte) 96, (byte) 104, (byte) 96, (byte) 37, (byte) 107, (byte) 106, (byte) 37, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 36}));
                }
            } catch (Throwable e2) {
                BLog.w(hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124}), e2);
                esu.b(e.a(), hae.a(new byte[]{(byte) 76, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 37, (byte) 100, (byte) 119, (byte) 98, (byte) 118, (byte) 63, (byte) 37, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 100, (byte) 117, (byte) 117, (byte) 43, (byte) 106, (byte) 117, (byte) 96, (byte) 107, (byte) 86, (byte) 102, (byte) 109, (byte) 96, (byte) 104, (byte) 96, (byte) 45}) + str + ")");
            }
        }
    }

    @JavascriptInterface
    public void alipay(String str) {
        b e = this.c.e();
        if (e != null) {
            JSONObject b = zy.b(str);
            final String l = b.l(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 76, (byte) 97}));
            if (this.b) {
                BLog.e(hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 109, (byte) 100, (byte) 115, (byte) 96, (byte) 37, (byte) 117, (byte) 100, (byte) 124, (byte) 37, (byte) 113, (byte) 100, (byte) 118, (byte) 110, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124}));
            } else if (!a(e.a())) {
                final String l2 = b.l("sign");
                a(e.b()).d(new pr<Void, ps<fhk>>(this) {
                    final /* synthetic */ mal b;

                    public /* synthetic */ Object a(ps psVar) throws Exception {
                        return b(psVar);
                    }

                    public ps<fhk> b(ps<Void> psVar) throws Exception {
                        b e = this.b.c.e();
                        if (e == null) {
                            return null;
                        }
                        return mal.b(l2, e.a());
                    }
                }).a(new pr<fhk, Void>(this) {
                    final /* synthetic */ mal b;

                    public /* synthetic */ Object a(ps psVar) throws Exception {
                        return b(psVar);
                    }

                    public Void b(ps<fhk> psVar) throws Exception {
                        b e = this.b.c.e();
                        if (e != null) {
                            JSONObject jSONObject = new JSONObject();
                            if (psVar.e() || psVar.d()) {
                                esu.b(e.a(), 2131694088);
                                BLog.e(hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 106, (byte) 102, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 97, (byte) 37, (byte) 106, (byte) 107, (byte) 37, (byte) 100, (byte) 105, (byte) 108, (byte) 117, (byte) 100, (byte) 124, (byte) 45, (byte) 44, (byte) 36}), psVar.g());
                                jSONObject.a("code", Integer.valueOf(-1));
                                jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}));
                            } else {
                                fhk bl_fhk = (fhk) psVar.f();
                                String str = "code";
                                int i = bl_fhk.d ? 1 : bl_fhk.e == 6001 ? 0 : -1;
                                jSONObject.a(str, Integer.valueOf(i));
                                if (bl_fhk.d) {
                                    e.a().setResult(-1);
                                }
                                jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), bl_fhk.b);
                                esu.b(e.a(), bl_fhk.b);
                                jSONObject.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), bl_fhk.a());
                            }
                            if (l != null) {
                                fmm.a(e.b(), l, jSONObject);
                            }
                            this.b.b = false;
                        }
                        return null;
                    }
                }, hot.b());
            }
        }
    }

    @JavascriptInterface
    public void wechatpay(String str) {
        b e = this.c.e();
        if (e != null) {
            if (this.b) {
                BLog.e(hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 109, (byte) 100, (byte) 115, (byte) 96, (byte) 37, (byte) 117, (byte) 100, (byte) 124, (byte) 37, (byte) 113, (byte) 100, (byte) 118, (byte) 110, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124}));
            } else if (!a(e.a())) {
                JSONObject b = zy.b(str);
                final String l = b.l(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 76, (byte) 97}));
                PackageInfo a = eso.a(e.a(), hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 113, (byte) 96, (byte) 107, (byte) 102, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 104, (byte) 104}), 0);
                if (a == null || !a.applicationInfo.enabled) {
                    a(e, l);
                    return;
                }
                final String l2 = b.l("sign");
                a(e.b()).d(new pr<Void, ps<PayResp>>(this) {
                    final /* synthetic */ mal b;

                    public /* synthetic */ Object a(ps psVar) throws Exception {
                        return b(psVar);
                    }

                    public ps<PayResp> b(ps<Void> psVar) throws Exception {
                        b e = this.b.c.e();
                        if (e == null) {
                            return null;
                        }
                        return this.b.a(e.a(), l2);
                    }
                }).a(new pr<PayResp, Void>(this) {
                    final /* synthetic */ mal b;

                    public /* synthetic */ Object a(ps psVar) throws Exception {
                        return b(psVar);
                    }

                    public Void b(ps<PayResp> psVar) throws Exception {
                        b e = this.b.c.e();
                        if (e != null) {
                            JSONObject jSONObject = new JSONObject();
                            if (psVar.e()) {
                                esu.b(e.a(), 2131694088);
                                BLog.e(hae.a(new byte[]{(byte) 79, (byte) 100, (byte) 115, (byte) 100, (byte) 86, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96, (byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 68, (byte) 117, (byte) 117, (byte) 85, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 106, (byte) 102, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 97, (byte) 37, (byte) 106, (byte) 107, (byte) 37, (byte) 114, (byte) 96, (byte) 102, (byte) 109, (byte) 100, (byte) 113, (byte) 117, (byte) 100, (byte) 124, (byte) 45, (byte) 44, (byte) 36}), psVar.g());
                                jSONObject.a("code", Integer.valueOf(-1));
                                jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}));
                            } else if (psVar.d()) {
                                jSONObject.a("code", Integer.valueOf(0));
                                jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 105, (byte) 105, (byte) 96, (byte) 97, (byte) 37, (byte) 117, (byte) 112, (byte) 119, (byte) 102, (byte) 109, (byte) 100, (byte) 118, (byte) 96}));
                                esu.b(e.a(), hae.a(new byte[]{(byte) -24, (byte) -101, (byte) -89, (byte) -23, (byte) -121, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -23, (byte) -71, (byte) -121, (byte) -23, (byte) -101, (byte) -96, (byte) -21, (byte) -76, (byte) -105}));
                            } else {
                                PayResp payResp = (PayResp) psVar.f();
                                if (payResp.checkArgs()) {
                                    int i = payResp.errCode == 0 ? 1 : payResp.errCode == -2 ? 0 : -1;
                                    jSONObject.a("code", Integer.valueOf(i));
                                    jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), payResp.returnKey);
                                    if (i == 0) {
                                        esu.b(e.a(), hae.a(new byte[]{(byte) -24, (byte) -101, (byte) -89, (byte) -23, (byte) -121, (byte) -72, (byte) -22, Byte.MIN_VALUE, (byte) -103, (byte) -23, (byte) -71, (byte) -121, (byte) -23, (byte) -101, (byte) -96, (byte) -21, (byte) -76, (byte) -105}));
                                    } else if (i == 1) {
                                        e.a().setResult(-1);
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.a(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 70, (byte) 106, (byte) 97, (byte) 96}), Integer.valueOf(payResp.errCode));
                                    jSONObject2.a(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 86, (byte) 113, (byte) 119}), payResp.errStr);
                                    jSONObject2.a(hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 117, (byte) 100, (byte) 124, (byte) 76, (byte) 97}), payResp.prepayId);
                                    jSONObject2.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 113, (byte) 112, (byte) 119, (byte) 107, (byte) 78, (byte) 96, (byte) 124}), payResp.returnKey);
                                    jSONObject2.a(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 65, (byte) 100, (byte) 113, (byte) 100}), payResp.extData);
                                    jSONObject.a(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), jSONObject2);
                                } else {
                                    jSONObject.a("code", Integer.valueOf(-1));
                                    jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 37, (byte) 106, (byte) 102, (byte) 102, (byte) 112, (byte) 119, (byte) 119, (byte) 96, (byte) 97, (byte) 36, (byte) 37, (byte) 87, (byte) 96, (byte) 118, (byte) 117, (byte) 106, (byte) 107, (byte) 118, (byte) 96, (byte) 37, (byte) 99, (byte) 119, (byte) 106, (byte) 104, (byte) 37, (byte) 114, (byte) 125, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 108, (byte) 105, (byte) 105, (byte) 96, (byte) 98, (byte) 100, (byte) 105, (byte) 36}));
                                }
                            }
                            if (l != null) {
                                fmm.a(e.b(), l, jSONObject);
                            }
                            this.b.b = false;
                            fia.a(null);
                        }
                        return null;
                    }
                }, hot.b());
            }
        }
    }

    private boolean a(final Activity activity) {
        if (VERSION.SDK_INT < 17 || Global.getInt(activity.getContentResolver(), hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 114, (byte) 100, (byte) 124, (byte) 118, (byte) 90, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 118, (byte) 109, (byte) 90, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 108, (byte) 96, (byte) 118}), 0) != 1) {
            return false;
        }
        new a(activity).a(2131693806, new OnClickListener(this) {
            final /* synthetic */ mal b;

            public void onClick(DialogInterface dialogInterface, int i) {
                try {
                    activity.startActivity(new Intent(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 118, (byte) 96, (byte) 113, (byte) 113, (byte) 108, (byte) 107, (byte) 98, (byte) 118, (byte) 43, (byte) 68, (byte) 85, (byte) 85, (byte) 73, (byte) 76, (byte) 70, (byte) 68, (byte) 81, (byte) 76, (byte) 74, (byte) 75, (byte) 90, (byte) 65, (byte) 64, (byte) 83, (byte) 64, (byte) 73, (byte) 74, (byte) 85, (byte) 72, (byte) 64, (byte) 75, (byte) 81, (byte) 90, (byte) 86, (byte) 64, (byte) 81, (byte) 81, (byte) 76, (byte) 75, (byte) 66, (byte) 86})));
                } catch (Exception e) {
                }
            }
        }).b(2131694054).c();
        return true;
    }

    private ps<Void> a(final WebView webView) {
        return ps.a(new Callable<Void>(this) {
            final /* synthetic */ mal b;

            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public Void a() throws Exception {
                if (mal.b(Uri.parse(webView.getUrl()))) {
                    return null;
                }
                throw new UnsupportedOperationException();
            }
        }, hot.b());
    }

    private void a(final b bVar, final String str) {
        new a(bVar.a()).a(hae.a(new byte[]{(byte) -22, (byte) -78, (byte) -100, (byte) -22, (byte) -122, (byte) -126, (byte) -25, (byte) -95, (byte) -79, (byte) -22, (byte) -85, (byte) -120, (byte) -23, (byte) -67, (byte) -82, (byte) -23, (byte) -109, (byte) -122, (byte) -22, (byte) -95, (byte) -122, (byte) -25, (byte) -84, (byte) -118, (byte) -22, (byte) -79, (byte) -95, (byte) -21, (byte) -80, (byte) -82, (byte) -22, (byte) -95, (byte) -83, (byte) -23, (byte) -121, (byte) -72, (byte) -24, (byte) -92, (byte) -96, (byte) -32, (byte) -77, (byte) -125, (byte) -23, (byte) -104, (byte) -81, (byte) -23, (byte) -68, (byte) -102, (byte) -21, (byte) -78, (byte) -80, (byte) -24, (byte) -101, (byte) -89, (byte) -22, (byte) -79, (byte) -95, (byte) -21, (byte) -80, (byte) -82, (byte) -23, (byte) -101, (byte) -96, (byte) -21, (byte) -76, (byte) -105, (byte) -32, (byte) -77, (byte) -125, (byte) -25, (byte) -96, (byte) -72, (byte) -22, (byte) -95, (byte) -122, (byte) -25, (byte) -84, (byte) -118, (byte) -22, (byte) -97, (byte) -127, (byte) -26, (byte) -120, (byte) -126, (byte) -25, (byte) -96, (byte) -102})).a(2131693806, new OnClickListener(this) {
            final /* synthetic */ mal c;

            public void onClick(DialogInterface dialogInterface, int i) {
                if (str != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.a("code", Integer.valueOf(-2));
                    jSONObject.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 114, (byte) 96, (byte) 102, (byte) 109, (byte) 100, (byte) 113, (byte) 37, (byte) 100, (byte) 117, (byte) 117, (byte) 37, (byte) 108, (byte) 118, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 99, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 36}));
                    fmm.a(bVar.b(), str, jSONObject);
                }
            }
        }).a(false).c();
    }

    private static ps<fhk> b(String str, Activity activity) {
        esu.b(activity.getApplicationContext(), 2131691805);
        return new fhl().a(str, activity);
    }

    private ps<PayResp> a(Activity activity, String str) {
        if (this.d != null) {
            return ps.a(new IllegalStateException("\u91cd\u590d\u70b9\u51fb"));
        }
        String decode;
        esu.b(activity, 2131691806);
        try {
            decode = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            decode = URLDecoder.decode(str);
        }
        this.d = new fib();
        return this.d.a(activity, 18, decode);
    }

    public boolean a(int i, int i2, Intent intent) {
        if (super.a(i, i2, intent)) {
            return true;
        }
        if (i != 18 || this.d == null) {
            return false;
        }
        this.d.a(i2, intent);
        this.d = null;
        return true;
    }

    public void b() {
        super.b();
        if (this.d != null) {
            this.d = null;
        }
    }

    public boolean c() {
        return this.d != null || super.c();
    }

    public static boolean b(Uri uri) {
        boolean z;
        String host = uri.getHost();
        CharSequence scheme = uri.getScheme();
        if (host == null || !host.equalsIgnoreCase(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 124, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104}))) {
            z = false;
        } else {
            z = true;
        }
        if (z && TextUtils.equals(hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 118}), scheme)) {
            return true;
        }
        return false;
    }
}
