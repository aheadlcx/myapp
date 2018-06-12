package bili.bl;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import bl.bol.a;
import bl.bol.b;
import com.bilibili.api.BiliApiException;
import com.bilibili.bilibililive.bililivefollowing.api.entity.FollowStatus;
import com.bilibili.bilibililive.bililivefollowing.api.entity.FollowingDetailInfo;
import com.bilibili.bilibililive.followingcard.api.entity.FollowingCard;
import java.util.ArrayList;
import java.util.List;
import retrofit2.HttpException;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* compiled from: BL */
public class bom extends bqk<b> implements a {
    final /* synthetic */ FollowingCard a(FollowingCard followingCard) {
        return b(followingCard);
    }

    bom(b bVar) {
        super(bVar);
    }

    public void a(Context context, FollowingCard followingCard) {
        Observable.zip(a(context, eva.a(context).i(), followingCard.getDynamicId()), c(context, followingCard.getUserId()), bon.a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<Pair<Boolean, FollowingCard>>(this) {
            final /* synthetic */ bom a;

            {
                this.a = r1;
            }

            public /* synthetic */ void onNext(Object obj) {
                a((Pair) obj);
            }

            public void onCompleted() {
            }

            public void onError(Throwable th) {
            }

            public void a(Pair<Boolean, FollowingCard> pair) {
                if (this.a.h != null && !((b) this.a.h).l()) {
                    if (pair == null || pair.second == null) {
                        ((b) this.a.h).e();
                    } else {
                        ((b) this.a.h).a(((Boolean) pair.first).booleanValue(), (FollowingCard) pair.second, false);
                    }
                }
            }
        });
    }

    public void a(Context context, long j) {
        a(context, eva.a(context).i(), j).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber<FollowingCard>(this) {
            final /* synthetic */ bom a;

            {
                this.a = r1;
            }

            public /* synthetic */ void onNext(Object obj) {
                a((FollowingCard) obj);
            }

            public void onCompleted() {
            }

            public void onError(Throwable th) {
                if (this.a.h != null && !((b) this.a.h).l()) {
                    ((b) this.a.h).d();
                }
            }

            public void a(FollowingCard followingCard) {
                if (this.a.h != null && !((b) this.a.h).l()) {
                    if (followingCard != null) {
                        ((b) this.a.h).a(true, followingCard, false);
                    } else {
                        ((b) this.a.h).e();
                    }
                }
            }
        });
    }

    public void b(Context context, long j) {
        if (eva.a(context).i() != j) {
            bmj.a(j, new gnc<FollowStatus>(this) {
                final /* synthetic */ bom a;

                {
                    this.a = r1;
                }

                public /* synthetic */ void b(@Nullable Object obj) {
                    a((FollowStatus) obj);
                }

                public void a(@Nullable FollowStatus followStatus) {
                    if (followStatus != null) {
                        ((b) this.a.h).a(followStatus.follow != 0);
                    }
                }

                public void a(Throwable th) {
                    ((b) this.a.h).a(true);
                }

                public boolean a() {
                    return this.a.h == null || ((b) this.a.h).l();
                }
            });
        }
    }

    public FollowingCard a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        FollowingCard followingCard = (FollowingCard) zy.a(str, FollowingCard.class);
        return followingCard != null ? b(followingCard) : null;
    }

    public void a(long j, long j2) {
        bmj.a(j, j2, new gnc<List<Void>>(this) {
            final /* synthetic */ bom a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(@Nullable Object obj) {
                a((List) obj);
            }

            public void a(@Nullable List<Void> list) {
                ((b) this.a.h).a_(2131691693);
                ((b) this.a.h).a(true);
            }

            public void a(Throwable th) {
                if (th instanceof BiliApiException) {
                    BiliApiException biliApiException = (BiliApiException) th;
                    if (biliApiException.mCode == 22006) {
                        ((b) this.a.h).m();
                    } else {
                        ((b) this.a.h).a(biliApiException.getMessage());
                    }
                } else if (th instanceof HttpException) {
                    ((b) this.a.h).a_(2131695193);
                } else {
                    ((b) this.a.h).a(th.getMessage());
                }
            }

            public boolean a() {
                return this.a.h == null || ((b) this.a.h).l();
            }
        });
    }

    private Observable<Boolean> c(Context context, long j) {
        if (eva.a(context).i() == j) {
            return Observable.just(Boolean.valueOf(true));
        }
        return Observable.fromCallable(new boo(j)).onErrorReturn(bop.a);
    }

    static final /* synthetic */ Boolean a(long j) throws Exception {
        FollowStatus a = bmj.a(j);
        boolean z = (a == null || a.follow == 0) ? false : true;
        return Boolean.valueOf(z);
    }

    private Observable<FollowingCard> a(Context context, long j, long j2) {
        return Observable.fromCallable(new boq(j, j2, bua.d(context).intValue())).map(bor.a).doOnNext(new bos(this));
    }

    static final /* synthetic */ FollowingCard a(FollowingDetailInfo followingDetailInfo) {
        if (followingDetailInfo == null) {
            return new FollowingCard();
        }
        cao.a().a(followingDetailInfo.attentions);
        followingDetailInfo.attentions = null;
        return followingDetailInfo.mCard;
    }

    private FollowingCard b(FollowingCard followingCard) {
        if (followingCard == null) {
            return null;
        }
        List arrayList = new ArrayList();
        arrayList.add(followingCard);
        caj.a(arrayList, false);
        return (FollowingCard) arrayList.get(0);
    }
}
