package bili3.com.sina.weibo.sdk.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import bl.dw.d;
import bl.ibn;

/* compiled from: BL */
public class SDKNotification {
    private Context mContext;
    private Notification mNotification;

    /* compiled from: BL */
    public static class SDKNotificationBuilder {
        private String mNotificationContent;
        private PendingIntent mNotificationPendingIntent;
        private String mNotificationTitle;
        private Uri mSoundUri;
        private String mTickerText;
        private long[] mVibrate;

        public static SDKNotificationBuilder buildUpon() {
            return new SDKNotificationBuilder();
        }

        public SDKNotificationBuilder setTickerText(String str) {
            this.mTickerText = str;
            return this;
        }

        public SDKNotificationBuilder setNotificationTitle(String str) {
            this.mNotificationTitle = str;
            return this;
        }

        public SDKNotificationBuilder setNotificationContent(String str) {
            this.mNotificationContent = str;
            return this;
        }

        public SDKNotificationBuilder setNotificationPendingIntent(PendingIntent pendingIntent) {
            this.mNotificationPendingIntent = pendingIntent;
            return this;
        }

        public SDKNotificationBuilder setVibrate(long[] jArr) {
            this.mVibrate = jArr;
            return this;
        }

        public SDKNotificationBuilder setSoundUri(Uri uri) {
            this.mSoundUri = uri;
            return this;
        }

        public SDKNotification build(Context context) {
            d dVar = new d(context);
            dVar.c(true);
            dVar.a(this.mNotificationPendingIntent);
            dVar.d(this.mTickerText);
            dVar.a(getNotificationIcon(context));
            dVar.a(System.currentTimeMillis());
            if (this.mSoundUri != null) {
                dVar.a(this.mSoundUri);
            }
            if (this.mVibrate != null) {
                dVar.a(this.mVibrate);
            }
            dVar.a(((BitmapDrawable) ResourceManager.getDrawable(context, "weibosdk_notification_icon.png")).getBitmap());
            dVar.a(this.mNotificationTitle);
            dVar.b(this.mNotificationContent);
            return new SDKNotification(context, dVar.a());
        }

        private static int getNotificationIcon(Context context) {
            int resourceId = getResourceId(context, "com_sina_weibo_sdk_weibo_logo", "drawable");
            return resourceId > 0 ? resourceId : 17301659;
        }

        private static int getResourceId(Context context, String str, String str2) {
            String packageName = context.getApplicationContext().getPackageName();
            try {
                return context.getPackageManager().getResourcesForApplication(packageName).getIdentifier(str, str2, packageName);
            } catch (Throwable e) {
                ibn.a(e);
                return 0;
            }
        }
    }

    private SDKNotification(Context context, Notification notification) {
        this.mContext = context.getApplicationContext();
        this.mNotification = notification;
    }

    public void show(int i) {
        if (this.mNotification != null) {
            ((NotificationManager) this.mContext.getSystemService("notification")).notify(i, this.mNotification);
        }
    }
}
