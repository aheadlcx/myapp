package bili.bl;

import android.app.Activity;
import android.os.Handler;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveActivityReceiveInfo;

/* compiled from: BL */
public class dzm {
    private Activity a;
    private int b;
    private Handler c;
    private Runnable d = new Runnable(this) {
        final /* synthetic */ dzm a;

        {
            this.a = r1;
        }

        public void run() {
            doc.a().a((long) this.a.b, doc.a(blg.a()), new gnc<BiliLiveActivityReceiveInfo>(this) {
                final /* synthetic */ AnonymousClass1 a;

                {
                    this.a = r1;
                }

                public /* synthetic */ void b(Object obj) {
                    a((BiliLiveActivityReceiveInfo) obj);
                }

                public void a(BiliLiveActivityReceiveInfo biliLiveActivityReceiveInfo) {
                    this.a.a.a();
                    if (biliLiveActivityReceiveInfo != null && biliLiveActivityReceiveInfo.mLists != null && !biliLiveActivityReceiveInfo.mLists.isEmpty()) {
                        ebl.a(this.a.a.a).a(biliLiveActivityReceiveInfo);
                    }
                }

                public void a(Throwable th) {
                    this.a.a.a();
                }

                public boolean a() {
                    return this.a.a.a == null || this.a.a.a.isFinishing();
                }
            });
        }
    };

    public dzm(Activity activity, int i) {
        this.a = activity;
        this.b = i;
    }

    public void a() {
        if (this.a != null && eva.a(this.a).a() && this.b > 0) {
            if (this.c == null) {
                this.c = etb.a(2);
            }
            this.c.removeCallbacks(this.d);
            this.c.postDelayed(this.d, 300000);
        }
    }

    public void b() {
        if (this.c != null) {
            this.c.removeCallbacks(this.d);
            this.c = null;
        }
    }
}
