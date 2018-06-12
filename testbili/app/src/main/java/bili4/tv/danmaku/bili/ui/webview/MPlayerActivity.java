package bili4.tv.danmaku.bili.ui.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import bl.eva;
import bl.hae;
import bl.kyo;
import bl.lvd;
import bl.mst;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import u.aly.bj;

@SuppressLint({"NewApi"})
/* compiled from: BL */
public class MPlayerActivity extends kyo {
    protected static final String b = MPlayerActivity.class.getSimpleName();
    private static final String e = hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118});
    private static final String f = hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 49, (byte) 53, (byte) 49, (byte) 43, (byte) 109, (byte) 113, (byte) 104, (byte) 105});
    ProgressBar c;
    WebView d;
    private boolean g;
    private PlayerParams h;
    private boolean i;
    private String j;

    /* compiled from: BL */
    class a {
        final /* synthetic */ MPlayerActivity a;

        private a(MPlayerActivity mPlayerActivity) {
            this.a = mPlayerActivity;
        }

        @JavascriptInterface
        public void openPlayer() {
            this.a.r();
        }

        @JavascriptInterface
        public boolean isUserLogin() {
            return this.a.i;
        }
    }

    private void a(WebView webView) {
        webView.loadUrl(hae.a(new byte[]{(byte) 111, (byte) 100, (byte) 115, (byte) 100, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 63, (byte) 115, (byte) 100, (byte) 119, (byte) 37, (byte) 115, (byte) 118, (byte) 56, (byte) 97, (byte) 106, (byte) 102, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 98, (byte) 96, (byte) 113, (byte) 64, (byte) 105, (byte) 96, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 118, (byte) 71, (byte) 124, (byte) 81, (byte) 100, (byte) 98, (byte) 75, (byte) 100, (byte) 104, (byte) 96, (byte) 45, (byte) 34, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 34, (byte) 44, (byte) 62, (byte) 99, (byte) 106, (byte) 119, (byte) 45, (byte) 115, (byte) 100, (byte) 119, (byte) 37, (byte) 108, (byte) 56, (byte) 53, (byte) 62, (byte) 108, (byte) 57, (byte) 115, (byte) 118, (byte) 43, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 62, (byte) 108, (byte) 46, (byte) 46, (byte) 44, (byte) 126, (byte) 115, (byte) 118, (byte) 94, (byte) 108, (byte) 88, (byte) 43, (byte) 117, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 45, (byte) 44, (byte) 62, (byte) 115, (byte) 118, (byte) 94, (byte) 108, (byte) 88, (byte) 43, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 118, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 56, (byte) 115, (byte) 118, (byte) 94, (byte) 108, (byte) 88, (byte) 43, (byte) 117, (byte) 100, (byte) 112, (byte) 118, (byte) 96, (byte) 45, (byte) 44, (byte) 62, (byte) 120}));
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h = (PlayerParams) getIntent().getExtras().getParcelable(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118}));
        if (this.h.c.g() == null) {
            throw new IllegalArgumentException();
        }
        Object obj = this.h.c.g().mWeb;
        if (TextUtils.isEmpty(obj)) {
            r();
            return;
        }
        this.i = eva.a(getApplicationContext()).a();
        setContentView(2131427596);
        this.c = (ProgressBar) findViewById(2131299439);
        this.d = (WebView) findViewById(2131301303);
        WebSettings settings = this.d.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        o();
        p();
        B_().a((CharSequence) mst.a(this.h).a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), bj.b));
        this.d.addJavascriptInterface(new a(), hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97}));
        this.d.setWebChromeClient(new WebChromeClient(this) {
            final /* synthetic */ MPlayerActivity a;

            {
                this.a = r1;
            }

            public void onProgressChanged(WebView webView, int i) {
                this.a.c.setProgress(i);
            }
        });
        this.d.setWebViewClient(new WebViewClient(this) {
            final /* synthetic */ MPlayerActivity a;

            {
                this.a = r1;
            }

            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                return false;
            }

            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                this.a.c.setVisibility(0);
            }

            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                this.a.c.setVisibility(8);
                this.a.a(webView);
            }
        });
        this.j = obj;
        a(this.d);
        this.d.loadUrl(this.j);
        this.g = false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (!hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 113, (byte) 117, (byte) 63, (byte) 42, (byte) 42, (byte) 114, (byte) 114, (byte) 114, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 102, (byte) 106, (byte) 104, (byte) 42, (byte) 49, (byte) 53, (byte) 49, (byte) 43, (byte) 109, (byte) 113, (byte) 104, (byte) 105}).equalsIgnoreCase(this.j)) {
            getMenuInflater().inflate(2131492915, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 2131298783) {
            return super.onOptionsItemSelected(menuItem);
        }
        r();
        return true;
    }

    private void b(WebView webView) {
        if (webView != null) {
            try {
                Class.forName(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 114, (byte) 96, (byte) 103, (byte) 110, (byte) 108, (byte) 113, (byte) 43, (byte) 82, (byte) 96, (byte) 103, (byte) 83, (byte) 108, (byte) 96, (byte) 114})).getMethod(hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 85, (byte) 100, (byte) 112, (byte) 118, (byte) 96}), (Class[]) null).invoke(webView, (Object[]) null);
            } catch (Exception e) {
            }
        }
    }

    private void q() {
        if (this.d != null) {
            b(this.d);
            a(this.d);
            this.d.stopLoading();
            this.d.pauseTimers();
        }
    }

    private void r() {
        q();
        finish();
        Bundle bundle = new Bundle();
        bundle.putParcelable(hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106}), this.h);
        lvd.a(4).a(this).a(bundle).a();
    }

    protected void onPause() {
        super.onPause();
        q();
        if (isFinishing() || isDestroyed()) {
            this.d.loadUrl(bj.b);
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.g = true;
        if (this.d != null) {
            this.d.destroy();
        }
        this.d = null;
    }

    public boolean isDestroyed() {
        if (VERSION.SDK_INT >= 17) {
            return super.isDestroyed();
        }
        return this.g;
    }

    protected void onResume() {
        super.onResume();
        this.d.resumeTimers();
    }

    public void onBackPressed() {
        if (this.d.canGoBack()) {
            this.d.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public static void a(Context context, PlayerParams playerParams) {
        Intent intent = new Intent(context, MPlayerActivity.class);
        intent.putExtra(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118}), playerParams);
        context.startActivity(intent);
    }
}
