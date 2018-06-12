package bili2.bl;

import android.app.Activity;
import android.content.Context;
import com.bilibili.api.BiliApiException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import tv.danmaku.bili.ui.vip.api.VipPointBalance;

/* compiled from: BL */
public class lzp {
    private llp a;
    private evj b;
    private WeakReference<Activity> c;
    private a d;
    private b e;
    private VipPointBalance f;

    /* compiled from: BL */
    public interface a {
        void a(int i);

        void a(evf bl_evf);
    }

    /* compiled from: BL */
    public interface b {
        void b(int i);

        void c(int i);
    }

    public lzp(Activity activity) {
        this.c = new WeakReference(activity);
    }

    public void a() {
        this.c = null;
        this.d = null;
        this.a = null;
    }

    public void a(a aVar) {
        this.d = aVar;
    }

    public void a(b bVar) {
        this.e = bVar;
    }

    public void b() {
        if (!h()) {
            lzv.b(new gnc<VipPointBalance>(this) {
                final /* synthetic */ lzp a;

                {
                    this.a = r1;
                }

                public /* synthetic */ void b(Object obj) {
                    a((VipPointBalance) obj);
                }

                public boolean a() {
                    return this.a.h();
                }

                public void a(VipPointBalance vipPointBalance) {
                    if (vipPointBalance == null) {
                        this.a.d();
                        return;
                    }
                    evf c = eva.a(blg.a()).c();
                    if (c != null) {
                        if (c.t != vipPointBalance.pointBalance) {
                            this.a.c();
                        }
                        this.a.c(vipPointBalance.pointBalance);
                    }
                }

                public void a(Throwable th) {
                    this.a.d();
                }
            });
        }
    }

    private void c() {
        ps.a(new Callable<Void>(this) {
            final /* synthetic */ lzp a;

            {
                this.a = r1;
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public Void a() throws Exception {
                eva.a(blg.a()).h();
                return null;
            }
        });
    }

    private void d() {
        evf c = eva.a(blg.a()).c();
        if (c != null) {
            c(c.t);
        }
    }

    private void c(int i) {
        this.f = new VipPointBalance();
        this.f.pointBalance = i;
        if (this.d != null) {
            this.d.a(i);
        }
    }

    public void a(final int i) {
        if (!h() && e()) {
            f();
            lzv.a(i, eva.a((Context) this.c.get()).j(), new gnc<Void>(this) {
                final /* synthetic */ lzp b;

                public /* synthetic */ void b(Object obj) {
                    a((Void) obj);
                }

                public boolean a() {
                    return this.b.h();
                }

                public void a(Void voidR) {
                    lzt.a().a(new pr<evf, Void>(this) {
                        final /* synthetic */ AnonymousClass3 a;

                        {
                            this.a = r1;
                        }

                        public /* synthetic */ Object a(ps psVar) throws Exception {
                            return b(psVar);
                        }

                        public Void b(ps<evf> psVar) throws Exception {
                            this.a.b.g();
                            if (psVar.e()) {
                                this.a.b.e(8755);
                            } else if (psVar.c()) {
                                evf bl_evf = (evf) psVar.f();
                                if (bl_evf == null) {
                                    this.a.b.e(8755);
                                } else {
                                    this.a.b.f.pointBalance = bl_evf.t;
                                    if (this.a.b.d != null) {
                                        this.a.b.d.a(bl_evf);
                                    }
                                    this.a.b.d(i);
                                }
                            }
                            return null;
                        }
                    }, ps.b);
                }

                public void a(Throwable th) {
                    this.b.g();
                    if (th instanceof BiliApiException) {
                        this.b.e(((BiliApiException) th).mCode);
                    } else {
                        this.b.e(74832);
                    }
                }
            });
        }
    }

    private boolean e() {
        evf c = eva.a(blg.a()).c();
        if (c == null || c.s == null) {
            return false;
        }
        this.b = new evj();
        this.b.a = c.s.a;
        this.b.b = c.s.b;
        return true;
    }

    private void f() {
        if (!h()) {
            if (this.a == null) {
                this.a = llp.a((Activity) this.c.get(), ((Activity) this.c.get()).getString(2131691537), false);
            } else {
                this.a.show();
            }
        }
    }

    private void g() {
        if (this.a != null) {
            this.a.hide();
        }
    }

    private void d(int i) {
        if (this.e != null) {
            this.e.c(i);
        } else if (!h()) {
            lyv bl_lyv = new lyv((Context) this.c.get());
            bl_lyv.a(i);
            bl_lyv.a(this.b);
            bl_lyv.show();
        }
    }

    private void e(int i) {
        if (this.e != null) {
            this.e.b(8755);
        } else if (!h()) {
            lyu bl_lyu = new lyu((Context) this.c.get());
            bl_lyu.a(b(i));
            bl_lyu.show();
        }
    }

    public static String b(int i) {
        switch (i) {
            case -131:
                return blg.a().getString(2131696108);
            case 74832:
                return blg.a().getString(2131696111);
            default:
                return blg.a().getString(2131696127);
        }
    }

    private boolean h() {
        return this.c == null || this.c.get() == null || ((Activity) this.c.get()).isFinishing();
    }
}
