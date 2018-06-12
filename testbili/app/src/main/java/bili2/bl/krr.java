package bili2.bl;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.ArrayList;
import tv.danmaku.bili.ui.intent.IntentHandlerActivity;
import tv.danmaku.bili.ui.search.stardust.StarDustSearchActivity;
import tv.danmaku.bili.ui.videodownload.VideoDownloadListActivity;

@jds(a = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, b = {"Ltv/danmaku/bili/ShortcutHelper;", "", "()V", "ACTION_SHORT_CUT", "", "ENABLED", "", "SCHEME", "SHORTCUT_DOWNLOAD", "SHORTCUT_SEARCH", "findMatchesIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "publishAllDynamic", "", "iBiliPlayer-v4_release"})
/* compiled from: BL */
public final class krr {
    public static final String a = hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 86, (byte) 77, (byte) 74, (byte) 87, (byte) 81, (byte) 90, (byte) 70, (byte) 80, (byte) 81});
    public static final krr b = new krr();
    private static final String c = hae.a(new byte[]{(byte) 103, (byte) 105, (byte) 118, (byte) 109, (byte) 106, (byte) 119, (byte) 113, (byte) 102, (byte) 112, (byte) 113});
    private static final String d = hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109});
    private static final String e = hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 40, (byte) 105, (byte) 108, (byte) 118, (byte) 113});
    private static final boolean f = (VERSION.SDK_INT >= 25);

    private krr() {
    }

    @TargetApi(25)
    public static final void a(Context context) {
        jgp.b(context, hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113}));
        if (f) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager != null) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new Builder(context, hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109})).setShortLabel(context.getString(2131694808)).setLongLabel(context.getString(2131694808)).setIcon(Icon.createWithResource(context, 2131233862)).setIntent(new Intent(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 86, (byte) 77, (byte) 74, (byte) 87, (byte) 81, (byte) 90, (byte) 70, (byte) 80, (byte) 81}), Uri.parse(hae.a(new byte[]{(byte) 103, (byte) 105, (byte) 118, (byte) 109, (byte) 106, (byte) 119, (byte) 113, (byte) 102, (byte) 112, (byte) 113, (byte) 63, (byte) 42, (byte) 42, (byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109}))).setClass(context, IntentHandlerActivity.class)).build());
                arrayList.add(new Builder(context, hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 40, (byte) 105, (byte) 108, (byte) 118, (byte) 113})).setShortLabel(context.getString(2131694807)).setLongLabel(context.getString(2131694807)).setIcon(Icon.createWithResource(context, 2131233861)).setIntent(new Intent(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 86, (byte) 77, (byte) 74, (byte) 87, (byte) 81, (byte) 90, (byte) 70, (byte) 80, (byte) 81}), Uri.parse(hae.a(new byte[]{(byte) 103, (byte) 105, (byte) 118, (byte) 109, (byte) 106, (byte) 119, (byte) 113, (byte) 102, (byte) 112, (byte) 113, (byte) 63, (byte) 42, (byte) 42, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 40, (byte) 105, (byte) 108, (byte) 118, (byte) 113}))).setClass(context, IntentHandlerActivity.class)).build());
                shortcutManager.setDynamicShortcuts(arrayList);
            }
        }
    }

    public static final Intent a(Context context, Uri uri) {
        jgp.b(context, hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113}));
        jgp.b(uri, "uri");
        if ((jgp.a(hae.a(new byte[]{(byte) 103, (byte) 105, (byte) 118, (byte) 109, (byte) 106, (byte) 119, (byte) 113, (byte) 102, (byte) 112, (byte) 113}), uri.getScheme()) ^ 1) != 0) {
            return null;
        }
        String host = uri.getHost();
        if (ert.a(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 100, (byte) 119, (byte) 102, (byte) 109}), host)) {
            return StarDustSearchActivity.a(context);
        }
        return ert.a((CharSequence) hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 40, (byte) 105, (byte) 108, (byte) 118, (byte) 113}), (CharSequence) host) ? VideoDownloadListActivity.a(context) : null;
    }
}
