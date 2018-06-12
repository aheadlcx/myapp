package bili.bl;

import com.alibaba.fastjson.JSONException;
import com.bilibili.bilibililive.im.entity.Notification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import rx.Observable;
import rx.Observable.OnSubscribe;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class ceg extends cea implements cdx {
    public ceg(cdn bl_cdn) {
        super(bl_cdn);
    }

    public static ceg c() {
        return cdn.b().d();
    }

    public void a(final ArrayList<Notification> arrayList) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceg b;

            public void run() {
                if (this.b.b().j() && arrayList != null && arrayList.size() != 0) {
                    cej.b(arrayList);
                    ArrayList arrayList = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Notification notification = (Notification) it.next();
                        BLog.v(hae.a(new byte[]{(byte) 76, (byte) 72, (byte) 75, (byte) 106, (byte) 113, (byte) 108, (byte) 99, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 72, (byte) 100, (byte) 107, (byte) 100, (byte) 98, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) -23, (byte) -101, (byte) -71, (byte) -22, (byte) -121, (byte) -65, (byte) -26, (byte) -113, (byte) -107, (byte) -24, (byte) -112, (byte) -86, (byte) -32, (byte) -77, (byte) -107}) + notification.toString());
                        arrayList.add(cdq.a(notification));
                    }
                    cdj.a().a((Notification) arrayList.get(arrayList.size() - 1));
                    if (arrayList.size() > 0) {
                        cex bl_cex = new cex();
                        bl_cex.a = arrayList;
                        EventBus.getDefault().post(bl_cex);
                    }
                }
            }
        });
    }

    public static void a(Subscriber<List<cfq>> subscriber) {
        Observable.create(new OnSubscribe<List<cfq>>() {
            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super List<cfq>> subscriber) {
                List linkedList = new LinkedList();
                for (Notification a : cgs.b()) {
                    try {
                        cfq a2 = cdq.a(a);
                        if (a2 != null) {
                            linkedList.add(a2);
                        }
                    } catch (JSONException e) {
                        ibn.a(e);
                    }
                }
                subscriber.onNext(ceg.a(linkedList));
                subscriber.onCompleted();
            }
        }).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber);
    }

    public static List<cfq> a(List<cfq> list) {
        if (list == null) {
            return null;
        }
        List<cfq> linkedList = new LinkedList();
        List linkedList2 = new LinkedList();
        List linkedList3 = new LinkedList();
        for (cfq bl_cfq : list) {
            if (bl_cfq != null) {
                if (bl_cfq instanceof cfk) {
                    a((List) linkedList, linkedList2, bl_cfq);
                } else if (bl_cfq instanceof cfm) {
                    a((List) linkedList, linkedList2, (cfm) bl_cfq);
                } else if (bl_cfq instanceof cfl) {
                    a(list, linkedList2, (cfl) bl_cfq, linkedList3);
                } else {
                    linkedList.add(bl_cfq);
                }
            }
        }
        cgs.b(linkedList3);
        cgs.c(linkedList2);
        return linkedList;
    }

    private static void a(List<cfq> list, List<Notification> list2, cfq bl_cfq) {
        Object obj;
        for (cfq bl_cfq2 : list) {
            if ((bl_cfq2 instanceof cfk) && ((cfk) bl_cfq).f() == 0 && ((cfk) bl_cfq2).f() == 0 && bl_cfq2.c() == bl_cfq.c()) {
                list2.add(bl_cfq.k());
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj == null) {
            list.add(bl_cfq);
        }
    }

    private static void a(List<cfq> list, List<Notification> list2, cfm bl_cfm) {
        Object obj;
        for (cfq bl_cfq : list) {
            if (bl_cfq instanceof cfm) {
                cfm bl_cfm2 = (cfm) bl_cfq;
                if (bl_cfm.h() == 0 && bl_cfm.f() == bl_cfm2.f() && bl_cfm.g() == bl_cfm2.g()) {
                    list2.add(bl_cfm.k());
                    obj = 1;
                    break;
                }
            }
        }
        obj = null;
        if (obj == null) {
            list.add(bl_cfm);
        }
    }

    private static void a(List<cfq> list, List<Notification> list2, cfl bl_cfl, List<Notification> list3) {
        for (cfq bl_cfq : list) {
            if (bl_cfq instanceof cfm) {
                cfm bl_cfm = (cfm) bl_cfq;
                if (bl_cfl.f() == bl_cfm.d()) {
                    if (bl_cfl.e() == 1) {
                        bl_cfm.a(1);
                    } else if (bl_cfl.e() == 2) {
                        bl_cfm.a(-1);
                    }
                    bl_cfm.c(bl_cfl.d());
                    bl_cfm.j();
                    list3.add(bl_cfm.k());
                    list2.add(bl_cfl.k());
                    return;
                }
            }
        }
    }

    public static void b(Subscriber subscriber) {
        Observable.create(new OnSubscribe<Boolean>() {
            public /* synthetic */ void call(Object obj) {
                a((Subscriber) obj);
            }

            public void a(Subscriber<? super Boolean> subscriber) {
                boolean z = !cgq.b(11, "0").equals("0") || cgs.a() > 0;
                subscriber.onNext(Boolean.valueOf(z));
            }
        }).subscribeOn(cnk.b()).observeOn(cnk.a()).subscribe(subscriber);
    }

    public static void a(long j) {
        cgs.a(j);
    }

    public static void b(List<Notification> list) {
        cgs.a((List) list);
    }

    public void a(final Notification notification) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceg b;

            public void run() {
                cgs.b(notification);
            }
        });
    }

    public void b(final Notification notification) {
        b().a(new Runnable(this) {
            final /* synthetic */ ceg b;

            public void run() {
                cgs.a(notification);
            }
        });
    }
}
