package bili2.bl;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import bl.blk.c;
import bl.dw.d;
import bl.ktc.b;
import bl.lti.a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.report.startup.TrackType;
import tv.danmaku.bili.services.videodownload.action.AutoStartAllTaskIfNeedAction;
import tv.danmaku.bili.ui.userfeedback.UserFeedbackItem;
import tv.danmaku.bili.update.BiliUpdateVerInfo;

/* compiled from: BL */
public class ljr extends fku {
    private static final String a = hae.a(new byte[]{(byte) 86, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 112, (byte) 117, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 55});
    private static final String c = hae.a(new byte[]{(byte) 118, (byte) 100, (byte) 115, (byte) 96, (byte) 97, (byte) 81, (byte) 108, (byte) 104, (byte) 96});
    private Handler b = etb.a(0);
    private long d = 0;
    private boolean e = false;
    private c f = null;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context activity = getActivity();
        if (ljn.a(activity)) {
            ktk.a(lji.a());
            if (bundle == null) {
                lzg.a();
                mcz.b(getApplicationContext());
            }
            if (bundle == null || SystemClock.elapsedRealtime() - bundle.getLong(hae.a(new byte[]{(byte) 118, (byte) 100, (byte) 115, (byte) 96, (byte) 97, (byte) 81, (byte) 108, (byte) 104, (byte) 96}), 0) >= 1800000) {
                etb.a(2, new Runnable(this) {
                    final /* synthetic */ ljr a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        ksz.a().d();
                        kta c = kta.c();
                        kuv.a(true, String.valueOf(c.f()));
                        kuv.a(this.a.getApplicationContext());
                        c.g();
                    }
                });
                if (blk.a().g()) {
                    maq.a();
                    a(activity);
                    kur.b(getApplicationContext());
                    b();
                    this.b.postDelayed(new Runnable(this) {
                        final /* synthetic */ ljr a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            Context activity = this.a.getActivity();
                            if (activity != null) {
                                this.a.d();
                                hjm.a(activity);
                                AutoStartAllTaskIfNeedAction.c(this.a.getApplicationContext());
                                apb.a(this.a.getActivity());
                                awg.a(this.a.getActivity());
                                mhy.a(activity);
                                lee.a();
                            }
                        }
                    }, 1500);
                    c();
                    return;
                }
                this.f = e();
                blk.a().a(this.f);
                esu.b(activity.getApplicationContext(), 2131693753);
            }
        }
    }

    private void b() {
        this.b.postDelayed(new Runnable(this) {
            final /* synthetic */ ljr a;

            {
                this.a = r1;
            }

            public void run() {
                if (!this.a.activityDie()) {
                    Activity activity = this.a.getActivity();
                    if (activity != null) {
                        kvi.b(TrackType.STARTUP);
                        lgv.a(this.a.getActivity());
                        mat.b((Context) activity);
                        mat.a(activity);
                    }
                }
            }
        }, 1000);
    }

    private void c() {
        this.b.postDelayed(new Runnable(this) {
            final /* synthetic */ ljr a;

            {
                this.a = r1;
            }

            public void run() {
                Activity activity = this.a.getActivity();
                if (activity != null) {
                    try {
                        if (!b.a(activity)) {
                            fic.c();
                        }
                    } catch (Throwable th) {
                        BLog.w(hae.a(new byte[]{(byte) 86, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 112, (byte) 117, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 55}), th);
                    }
                    ljr.b(activity);
                    kvq.b();
                }
            }
        }, 3000);
        this.b.postDelayed(new Runnable(this) {
            final /* synthetic */ ljr a;

            {
                this.a = r1;
            }

            public void run() {
                FragmentActivity activity = this.a.getActivity();
                if (activity != null) {
                    ens.b(activity);
                }
            }
        }, 5000);
        etb.a(2, new ljs(this));
    }

    final /* synthetic */ void a() {
        lou.a(getApplicationContext());
    }

    private void d() {
        if (VERSION.SDK_INT >= 25) {
            krr.a(getApplicationContext());
        }
    }

    private c e() {
        return new c(this) {
            final /* synthetic */ ljr a;

            {
                this.a = r1;
            }

            public void a(int i) {
                switch (i) {
                    case 1:
                    case 2:
                    case 5:
                        if (!this.a.e && System.currentTimeMillis() - this.a.d >= 60000) {
                            this.a.d = System.currentTimeMillis();
                            mat.b(this.a.getActivity()).c(new pr<BiliUpdateVerInfo, Void>(this) {
                                final /* synthetic */ AnonymousClass6 a;

                                {
                                    this.a = r1;
                                }

                                public /* synthetic */ Object a(ps psVar) throws Exception {
                                    return b(psVar);
                                }

                                public Void b(ps<BiliUpdateVerInfo> psVar) throws Exception {
                                    if (!(this.a.a.getActivity() == null || this.a.a.getActivity().isFinishing() || psVar.f() == null)) {
                                        this.a.a.e = true;
                                        new maz(this.a.a.getActivity()).b((BiliUpdateVerInfo) psVar.f());
                                    }
                                    return null;
                                }
                            }, ps.b);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        };
    }

    public void onDestroy() {
        if (this.f != null) {
            blk.a().b(this.f);
        }
        super.onDestroy();
    }

    private static void b(Activity activity) {
        final Context applicationContext = activity.getApplicationContext();
        if (eva.a(activity).l()) {
            lti.a(new a() {
                public void a(UserFeedbackItem userFeedbackItem) {
                    if (userFeedbackItem != null) {
                        ljr.a(applicationContext, userFeedbackItem);
                    }
                }
            });
        }
    }

    static void a(final Context context, final UserFeedbackItem userFeedbackItem) {
        hae.a(new byte[]{(byte) -23, (byte) -115, (byte) -89, (byte) -24, (byte) -107, (byte) -117, (byte) -22, Byte.MIN_VALUE, (byte) -126, (byte) -26, (byte) -87, (byte) -121, (byte) -23, (byte) -109, (byte) -122, (byte) -22, (byte) -108, (byte) -111, (byte) -22, (byte) -75, (byte) -101, (byte) -21, (byte) -75, (byte) -119, (byte) 123});
        final String b = TextUtils.isEmpty(userFeedbackItem.imgUrl) ? ert.b(userFeedbackItem.content, 20) : "[\u56fe\u7247]";
        ksd.a(context, new ksg.b() {
            public void a() {
            }

            public void b() {
                Intent a = lti.a();
                if (a != null) {
                    kkz.a(a);
                    d a2 = new d(context, gmz.a(context)).c(true).a(hae.a(new byte[]{(byte) -23, (byte) -115, (byte) -89, (byte) -24, (byte) -107, (byte) -117, (byte) -22, Byte.MIN_VALUE, (byte) -126, (byte) -26, (byte) -87, (byte) -121, (byte) -23, (byte) -109, (byte) -122, (byte) -22, (byte) -108, (byte) -111, (byte) -22, (byte) -75, (byte) -101, (byte) -21, (byte) -75, (byte) -119, (byte) 123})).d(hae.a(new byte[]{(byte) -23, (byte) -115, (byte) -89, (byte) -24, (byte) -107, (byte) -117, (byte) -22, Byte.MIN_VALUE, (byte) -126, (byte) -26, (byte) -87, (byte) -121, (byte) -23, (byte) -109, (byte) -122, (byte) -22, (byte) -108, (byte) -111, (byte) -22, (byte) -75, (byte) -101, (byte) -21, (byte) -75, (byte) -119, (byte) 123})).b(b).a(2131233527).a(userFeedbackItem.ctime * 1000).a(PendingIntent.getActivities(context, 4671, new Intent[]{new Intent(context, ljn.a()).addFlags(872415232), a}, 134217728));
                    if (ert.c(userFeedbackItem.content) > 20) {
                        a2.a(new dw.c().a(hae.a(new byte[]{(byte) -23, (byte) -115, (byte) -89, (byte) -24, (byte) -107, (byte) -117, (byte) -22, Byte.MIN_VALUE, (byte) -126, (byte) -26, (byte) -87, (byte) -121, (byte) -23, (byte) -109, (byte) -122, (byte) -22, (byte) -108, (byte) -111, (byte) -22, (byte) -75, (byte) -101, (byte) -21, (byte) -75, (byte) -119, (byte) 123})).b(ert.b(userFeedbackItem.content, 50)));
                    }
                    gna.a(context, 9029, a2.a());
                }
            }

            public void a(Exception exception) {
            }
        });
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong(hae.a(new byte[]{(byte) 118, (byte) 100, (byte) 115, (byte) 96, (byte) 97, (byte) 81, (byte) 108, (byte) 104, (byte) 96}), SystemClock.elapsedRealtime());
    }

    static void a(Context context) {
        NetworkInfo a = blj.a(context);
        if (a != null && kqw.e(context) && kqw.a(a.getSubtype()) != 0) {
            esu.b(context, context.getString(2131696139, new Object[]{kqw.a[kqw.a(a.getSubtype())]}));
        }
    }

    public static boolean a(FragmentManager fragmentManager) {
        return fragmentManager.findFragmentByTag(hae.a(new byte[]{(byte) 86, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 112, (byte) 117, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 55})) != null;
    }

    public static void a(FragmentTransaction fragmentTransaction, ljr bl_ljr) {
        fragmentTransaction.add(bl_ljr, hae.a(new byte[]{(byte) 86, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 112, (byte) 117, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 83, (byte) 55}));
    }
}
