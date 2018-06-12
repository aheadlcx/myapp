package bili.bl;

import bl.cvd.a;
import com.bilibili.bililive.im.notice.UnJoinGroupModel;
import java.util.List;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* compiled from: BL */
class cvg extends cut<a> {
    cvg() {
    }

    public void I_() {
        Observable.create(new OnSubscribe<List<UnJoinGroupModel>>(this) {
            final /* synthetic */ cvg a;

            {
                this.a = r1;
            }

            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<UnJoinGroupModel>> subscriber) {
                try {
                    subscriber.onNext(zy.b(cde.b().l("list"), UnJoinGroupModel.class));
                    subscriber.onCompleted();
                } catch (Throwable e) {
                    subscriber.onError(e);
                }
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new cdi<List<UnJoinGroupModel>>(this) {
            final /* synthetic */ cvg a;

            {
                this.a = r1;
            }

            protected void a() {
                if (((a) this.a.a).c() != null && !((a) this.a.a).c().isFinishing()) {
                    ((a) this.a.a).d();
                }
            }

            protected void a(List<UnJoinGroupModel> list) {
                if (((a) this.a.a).c() != null && !((a) this.a.a).c().isFinishing()) {
                    ((a) this.a.a).a(list);
                }
            }
        });
    }

    public void b() {
    }

    public void c() {
    }
}
