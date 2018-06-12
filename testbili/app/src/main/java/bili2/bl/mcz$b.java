package bili2.bl;

import android.content.Context;
import android.support.annotation.WorkerThread;
import java.util.concurrent.Callable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.services.videodownload.action.StopAllFullHDTaskAction;
import tv.danmaku.bili.ui.author.AuthorSpaceActivity;

/* compiled from: BL */
class mcz$b extends mcz$a {
    mcz$b(Context context) {
        super(context);
    }

    void b() {
        StopAllFullHDTaskAction.c(this.a);
        ps.a(new Callable<Void>(this) {
            final /* synthetic */ mcz$b a;

            {
                this.a = r1;
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public Void a() throws Exception {
                try {
                    fic.e();
                    eva.a(this.a.a).p();
                    mcz$b.b(this.a.a);
                } catch (Throwable e) {
                    BLog.w(hae.a(new byte[]{(byte) 85, (byte) 100, (byte) 118, (byte) 118, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 77, (byte) 96, (byte) 105, (byte) 117, (byte) 96, (byte) 119}), e);
                }
                return null;
            }
        });
    }

    @WorkerThread
    private static void b(Context context) {
        anb.c().a();
        mcz.d(context);
        bce.a().b();
        lsh.a(context).b();
        new kzp(context).a();
        new lfo(context).c();
        mcz.e(context);
        AuthorSpaceActivity.E();
        fdq.b();
    }

    void a() {
        fic.d();
        lsh.a(this.a).a();
    }

    void c() {
        StopAllFullHDTaskAction.c(this.a);
        mcz.c(this.a);
    }
}
