package bili3.com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bl.ibn;
import com.sina.weibo.sdk.utils.AidTask;
import com.tencent.bugly.crashreport.common.info.b;
import com.tencent.bugly.crashreport.common.strategy.a;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;

/* compiled from: BL */
public class BuglyBroadcastRecevier extends BroadcastReceiver {
    private static BuglyBroadcastRecevier d = null;
    private IntentFilter a = new IntentFilter();
    private Context b;
    private String c;
    private boolean e = true;

    public static synchronized BuglyBroadcastRecevier getInstance() {
        BuglyBroadcastRecevier buglyBroadcastRecevier;
        synchronized (BuglyBroadcastRecevier.class) {
            if (d == null) {
                d = new BuglyBroadcastRecevier();
            }
            buglyBroadcastRecevier = d;
        }
        return buglyBroadcastRecevier;
    }

    public synchronized void addFilter(String str) {
        if (!this.a.hasAction(str)) {
            this.a.addAction(str);
        }
        x.c("add action %s", str);
    }

    public synchronized void register(Context context) {
        this.b = context;
        z.a(new Runnable(this) {
            private /* synthetic */ BuglyBroadcastRecevier b;

            public final void run() {
                try {
                    x.a(BuglyBroadcastRecevier.d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        this.b.b.registerReceiver(BuglyBroadcastRecevier.d, this.b.a);
                    }
                } catch (Throwable th) {
                    ibn.a(th);
                }
            }
        });
    }

    public synchronized void unregister(Context context) {
        try {
            x.a(getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.b = context;
        } catch (Throwable th) {
            if (!x.a(th)) {
                ibn.a(th);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            a(context, intent);
        } catch (Throwable th) {
            if (!x.a(th)) {
                ibn.a(th);
            }
        }
    }

    private synchronized boolean a(Context context, Intent intent) {
        boolean z = true;
        synchronized (this) {
            if (!(context == null || intent == null)) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    if (this.e) {
                        this.e = false;
                    } else {
                        String f = b.f(this.b);
                        x.c("is Connect BC " + f, new Object[0]);
                        x.a("network %s changed to %s", this.c, f);
                        if (f == null) {
                            this.c = null;
                        } else {
                            String str = this.c;
                            this.c = f;
                            long currentTimeMillis = System.currentTimeMillis();
                            a a = a.a();
                            u a2 = u.a();
                            com.tencent.bugly.crashreport.common.info.a a3 = com.tencent.bugly.crashreport.common.info.a.a(context);
                            if (a == null || a2 == null || a3 == null) {
                                x.d("not inited BC not work", new Object[0]);
                            } else if (!f.equals(str)) {
                                if (currentTimeMillis - a2.a(c.a) > StatisticConfig.MIN_UPLOAD_INTERVAL) {
                                    x.a("try to upload crash on network changed.", new Object[0]);
                                    c a4 = c.a();
                                    if (a4 != null) {
                                        a4.a(0);
                                    }
                                }
                                if (currentTimeMillis - a2.a((int) AidTask.WHAT_LOAD_AID_SUC) > StatisticConfig.MIN_UPLOAD_INTERVAL) {
                                    x.a("try to upload userinfo on network changed.", new Object[0]);
                                    com.tencent.bugly.crashreport.biz.b.a.b();
                                }
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return z;
    }
}
