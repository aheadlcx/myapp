package bili3.com.bilibili.ad.adview.web;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;

/* compiled from: BL */
public class AdWebChromeClient extends WebChromeClient {
    private WebChromeClient a = new WebChromeClient();

    AdWebChromeClient() {
    }

    void setWebChromeClient(WebChromeClient webChromeClient) {
        this.a = webChromeClient;
    }

    public void onProgressChanged(WebView webView, int i) {
        this.a.onProgressChanged(webView, i);
    }

    public void onReceivedTitle(WebView webView, String str) {
        this.a.onReceivedTitle(webView, str);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.a.onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.a.onReceivedTouchIconUrl(webView, str, z);
    }

    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        this.a.onShowCustomView(view, customViewCallback);
    }

    @Deprecated
    public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        this.a.onShowCustomView(view, i, customViewCallback);
    }

    public void onHideCustomView() {
        this.a.onHideCustomView();
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        return this.a.onCreateWindow(webView, z, z2, message);
    }

    public void onRequestFocus(WebView webView) {
        this.a.onRequestFocus(webView);
    }

    public void onCloseWindow(WebView webView) {
        this.a.onCloseWindow(webView);
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.a.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.a.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.a.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.a.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        this.a.onExceededDatabaseQuota(str, str2, j, j2, j3, quotaUpdater);
    }

    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        this.a.onReachedMaxAppCacheSize(j, j2, quotaUpdater);
    }

    public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        this.a.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.a.onGeolocationPermissionsHidePrompt();
    }

    @TargetApi(21)
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        this.a.onPermissionRequest(permissionRequest);
    }

    @TargetApi(21)
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        this.a.onPermissionRequestCanceled(permissionRequest);
    }

    @Deprecated
    public boolean onJsTimeout() {
        return this.a.onJsTimeout();
    }

    @Deprecated
    public void onConsoleMessage(String str, int i, String str2) {
        this.a.onConsoleMessage(str, i, str2);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.a.onConsoleMessage(consoleMessage);
    }

    public Bitmap getDefaultVideoPoster() {
        return this.a.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        return this.a.getVideoLoadingProgressView();
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        this.a.getVisitedHistory(valueCallback);
    }

    @TargetApi(21)
    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        return this.a.onShowFileChooser(webView, valueCallback, fileChooserParams);
    }
}
