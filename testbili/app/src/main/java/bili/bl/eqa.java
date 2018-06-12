package bili.bl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import bl.fmm.b;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.boxing.model.config.CropConfig;
import com.bilibili.boxing.model.config.PickerConfig;
import com.bilibili.boxing.model.config.PickerConfig.Mode;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: BL */
public class eqa extends flk {
    private static final String a = hae.a(new byte[]{(byte) 68, (byte) 119, (byte) 113, (byte) 108, (byte) 102, (byte) 105, (byte) 96, (byte) 64, (byte) 97, (byte) 108, (byte) 113, (byte) 79, (byte) 86, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96});
    private boolean b = true;

    @JavascriptInterface
    public void setNavigationStyle(String str) {
        b e = this.c.e();
        if (e != null) {
            try {
                JSONObject b = zy.b(str);
                int h = b.h(hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 124, (byte) 105, (byte) 96}));
                int parseColor = Color.parseColor(b.l(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 106, (byte) 119})));
                if (e.c() instanceof epz) {
                    ((epz) e.c()).a(h, parseColor);
                }
            } catch (Throwable e2) {
                ibn.a(e2);
            }
        }
    }

    @JavascriptInterface
    public void hideNavigation() {
        b e = this.c.e();
        if (e != null && (e.c() instanceof epz)) {
            ((epz) e.c()).ac_();
        }
    }

    @JavascriptInterface
    public void hideMenu() {
        this.b = false;
        if (this.c.e() != null) {
            this.c.a(new Runnable(this) {
                final /* synthetic */ eqa a;

                {
                    this.a = r1;
                }

                public void run() {
                    b e = this.a.c.e();
                    if (e != null) {
                        e.a().supportInvalidateOptionsMenu();
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void setStatusBarVisibility(String str) {
        b e = this.c.e();
        if (e != null && !TextUtils.isEmpty(str)) {
            try {
                boolean z = zy.b(str).h(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 86, (byte) 109, (byte) 106, (byte) 114})) == 0;
                if (e.c() instanceof epz) {
                    ((epz) e.c()).a(z);
                }
            } catch (Throwable e2) {
                Log.e(hae.a(new byte[]{(byte) 68, (byte) 119, (byte) 113, (byte) 108, (byte) 102, (byte) 105, (byte) 96, (byte) 64, (byte) 97, (byte) 108, (byte) 113, (byte) 79, (byte) 86, (byte) 71, (byte) 119, (byte) 108, (byte) 97, (byte) 98, (byte) 96}), hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 113, (byte) 86, (byte) 113, (byte) 100, (byte) 113, (byte) 112, (byte) 118, (byte) 71, (byte) 100, (byte) 119, (byte) 83, (byte) 108, (byte) 118, (byte) 108, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 112, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107, (byte) 37, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 36}), e2);
            }
        }
    }

    @JavascriptInterface
    public void setTopicId(String str) {
    }

    @JavascriptInterface
    public void startPicker(String str) {
        b e = this.c.e();
        if (e != null) {
            try {
                JSONObject b = zy.b(str);
                int h = b.h("mode");
                Integer g = b.g(hae.a(new byte[]{(byte) 104, (byte) 100, (byte) 125, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96}));
                String l = b.l(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 76, (byte) 97}));
                final PickerConfig pickerConfig = new PickerConfig(h == 1 ? Mode.MULTI_IMG : Mode.SINGLE_IMG);
                if (g != null) {
                    pickerConfig.b(g.intValue());
                }
                if (h != 3 || a(b, pickerConfig)) {
                    e.b().setTag(2131301303, l);
                    e.b().post(new Runnable(this) {
                        final /* synthetic */ eqa b;

                        public void run() {
                            b e = this.b.c.e();
                            if (e != null) {
                                Class cls = (Class) fji.a().a(e.a()).b(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 117, (byte) 108, (byte) 102, (byte) 110, (byte) 96, (byte) 119}));
                                if (cls != null) {
                                    eks.a(pickerConfig).a(e.a(), cls).a(e.a(), 19);
                                }
                            }
                        }
                    });
                    return;
                }
                new JSONObject().a("code", Integer.valueOf(-2));
                fmm.a(e.b(), new Object[]{l, r0});
            } catch (Throwable e2) {
                ibn.a(e2);
                esu.b(e.a(), hae.a(new byte[]{(byte) 112, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 113, (byte) 106, (byte) 37, (byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 37, (byte) 117, (byte) 108, (byte) 102, (byte) 110, (byte) 96, (byte) 119, (byte) 43}));
            }
        }
    }

    private boolean a(JSONObject jSONObject, PickerConfig pickerConfig) {
        b e = this.c.e();
        if (e == null) {
            return false;
        }
        File externalCacheDir = e.a().getExternalCacheDir();
        if (externalCacheDir == null) {
            return false;
        }
        Uri build = new Builder().scheme("file").appendPath(externalCacheDir.getAbsolutePath()).appendPath(String.format(Locale.US, hae.a(new byte[]{(byte) 32, (byte) 118, (byte) 43, (byte) 117, (byte) 107, (byte) 98}), new Object[]{Long.valueOf(System.currentTimeMillis())})).build();
        float floatValue = jSONObject.k(hae.a(new byte[]{(byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 125})).floatValue();
        float floatValue2 = jSONObject.k(hae.a(new byte[]{(byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 124})).floatValue();
        CropConfig cropConfig = new CropConfig(build);
        cropConfig.a(floatValue, floatValue2);
        pickerConfig.a(cropConfig);
        return true;
    }

    public boolean a(int i, int i2, Intent intent) {
        if (super.a(i, i2, intent)) {
            return true;
        }
        if (i != 19 || intent == null) {
            return false;
        }
        b e = this.c.e();
        if (e == null) {
            return false;
        }
        if (!String.class.isInstance(e.b().getTag(2131301303))) {
            return false;
        }
        if (i2 != -1) {
            fmm.a(e.b(), new Object[]{r3.toString(), hae.a(new byte[]{(byte) 126, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 63, (byte) 37, (byte) 40, (byte) 52, (byte) 120})});
            return true;
        }
        a(e.b(), intent);
        return true;
    }

    private void a(final WebView webView, @NonNull final Intent intent) {
        Context context = webView.getContext();
        final fnt bl_fnt = new fnt(context);
        bl_fnt.setCancelable(false);
        bl_fnt.a(context.getString(2131691832));
        bl_fnt.show();
        ps.a(new Callable<Void>(this) {
            final /* synthetic */ eqa c;

            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public Void a() throws Exception {
                List a = eks.a(intent);
                int size = a == null ? 0 : a.size();
                Object tag = webView.getTag(2131301303);
                if (size == 0) {
                    new JSONObject().a("code", "-1");
                    fmm.a(webView, new Object[]{tag, r0});
                } else {
                    for (int i = 0; i < size; i++) {
                        if (a.get(i) instanceof ImageMedia) {
                            ImageMedia imageMedia = (ImageMedia) a.get(i);
                            try {
                                String str = hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 113, (byte) 100, (byte) 63}) + imageMedia.j() + hae.a(new byte[]{(byte) 62, (byte) 103, (byte) 100, (byte) 118, (byte) 96, (byte) 51, (byte) 49, (byte) 41}) + Base64.encodeToString(erx.g(new File(imageMedia.d())), 0);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.a("code", "0");
                                jSONObject.a(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113}), str);
                                fmm.a(webView, new Object[]{tag, jSONObject});
                            } catch (Exception e) {
                                new JSONObject().a("code", "-3");
                                fmm.a(webView, new Object[]{tag, r0});
                            }
                        } else {
                            new JSONObject().a("code", "-2");
                            fmm.a(webView, new Object[]{tag, r0});
                        }
                    }
                }
                return null;
            }
        }).a(new pr<Void, Void>(this) {
            final /* synthetic */ eqa b;

            public /* synthetic */ Object a(ps psVar) throws Exception {
                return b(psVar);
            }

            public Void b(ps<Void> psVar) throws Exception {
                bl_fnt.dismiss();
                return null;
            }
        }, ps.b);
    }

    @JavascriptInterface
    public void reportPerformance(final String str) {
        b e = this.c.e();
        if (e != null && anm.class.isInstance(e.b())) {
            final ank interceptor = ((anm) e.b()).getInterceptor();
            if (interceptor != null) {
                etb.a(2, new Runnable(this) {
                    final /* synthetic */ eqa c;

                    public void run() {
                        interceptor.a().a(str);
                    }
                });
            }
        }
    }

    @JavascriptInterface
    public void openCashier(String str) {
    }

    @JavascriptInterface
    public void openBpPay(String str) {
    }

    @JavascriptInterface
    public void invokeVip(String str) {
    }

    @JavascriptInterface
    public void immersiveMode() {
        b e = this.c.e();
        if (e != null && (e.c() instanceof epz)) {
            ((epz) e.c()).c();
        }
    }
}
