package bili.bl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import bl.doq.g;
import com.bilibili.api.BiliApiException;
import com.bilibili.bililive.videoliveplayer.ui.live.center.LiveBuyVipActivity;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import retrofit2.HttpException;
import tv.danmaku.videoplayer.basic.adapter.PlayerScreenMode;

/* compiled from: BL */
public class dnh {
    private Activity a;
    private int b;
    private ebs c;
    private dne d;
    private Set<String> e;
    private dxp f;
    private CharSequence g;
    private doq h;
    private PlayerScreenMode i;
    private long j;
    private a k;
    private b l;
    private bl.dxp.a m = new bl.dxp.a(this) {
        final /* synthetic */ dnh a;

        {
            this.a = r1;
        }

        public void a() {
            if (this.a.l != null) {
                this.a.l.a();
            }
        }

        public void a(String str) {
            this.a.a(str);
        }
    };
    private g n = new g(this) {
        final /* synthetic */ dnh a;

        {
            this.a = r1;
        }

        public void a(String str) {
            this.a.a(str);
        }

        public void a(int i) {
            if (this.a.a != null && !this.a.a.isFinishing() && this.a.b > 0) {
                if (i == 0) {
                    this.a.a(this.a.a, this.a.a.getString(2131692528));
                } else if (i == 1) {
                    this.a.a(this.a.a, this.a.a.getString(2131692527));
                }
            }
        }

        public void b(String str) {
            if (this.a.a != null && !this.a.a.isFinishing() && this.a.b > 0) {
                this.a.a(this.a.a, str);
            }
        }

        public void c(String str) {
            if (this.a.a != null && !this.a.a.isFinishing() && this.a.b > 0 && this.a.j > 0) {
                this.a.a(this.a.a, str, 0);
            }
        }

        public void d(String str) {
            if (this.a.a != null && !this.a.a.isFinishing() && this.a.b > 0 && this.a.j > 0) {
                this.a.a(this.a.a, str, 1);
            }
        }

        public void a(CharSequence charSequence) {
            this.a.g = charSequence;
        }
    };

    /* compiled from: BL */
    public interface a {
        void a();
    }

    /* compiled from: BL */
    public interface b {
        void a();
    }

    public dnh(Activity activity, int i, long j, Set<String> set) {
        this.a = activity;
        this.b = i;
        this.j = j;
        this.e = set;
        this.c = new ebs(3000);
    }

    public void a(a aVar) {
        this.k = aVar;
    }

    public void a(PlayerScreenMode playerScreenMode) {
        this.i = playerScreenMode;
        if (this.f == null) {
            a();
        }
        if (this.f != null) {
            this.f.show();
        }
    }

    public void a(dne bl_dne) {
        this.d = bl_dne;
    }

    private void a() {
        if (this.a != null && !this.a.isFinishing() && this.b > 0) {
            this.f = new dxp(this.a, this.m);
            this.f.a(new OnShowListener(this) {
                final /* synthetic */ dnh a;

                {
                    this.a = r1;
                }

                public void onShow(DialogInterface dialogInterface) {
                }
            });
            this.f.a(new OnDismissListener(this) {
                final /* synthetic */ dnh a;

                {
                    this.a = r1;
                }

                public void onDismiss(DialogInterface dialogInterface) {
                }
            });
        }
    }

    public void b(PlayerScreenMode playerScreenMode) {
        this.i = playerScreenMode;
        if (this.a != null && !this.a.isFinishing() && this.b > 0) {
            this.h = new doq((jq) this.a, this.g);
            this.h.a(this.n);
            this.h.show();
        }
    }

    public void a(String str) {
        a(str, egd.g(blg.a()), egd.e(blg.a()));
    }

    private void a(String str, int i, int i2) {
        if (this.b > 0 && this.a != null && !this.a.isFinishing()) {
            if (ert.b((CharSequence) str)) {
                esu.a(this.a, 2131692328);
                return;
            }
            final String replace = str.toString().replace("\r", BuildConfig.VERSION_NAME).replace("\n", BuildConfig.VERSION_NAME);
            if (this.c.a()) {
                this.c.b();
                String valueOf = String.valueOf(egy.a());
                this.e.add(valueOf);
                final int i3 = i;
                final int i4 = i2;
                final String str2 = valueOf;
                doc.a().c(a(this.b + BuildConfig.VERSION_NAME, 25, replace, 0, i2, i, valueOf), new gnc<List<Void>>(this) {
                    final /* synthetic */ dnh e;

                    public /* synthetic */ void b(@Nullable Object obj) {
                        a((List) obj);
                    }

                    public void a(@Nullable List<Void> list) {
                        if (this.e.d != null) {
                            mvs a = cze.a(i3, replace, 0, 25, i4);
                            if (a != null) {
                                a.B = true;
                                this.e.d.a(replace, a);
                            }
                        }
                    }

                    public void a(Throwable th) {
                        if (th instanceof BiliApiException) {
                            final int i = ((BiliApiException) th).mCode;
                            String message = th.getMessage();
                            if (i == 1001 || i == 1002) {
                                cog.a(this.e.a);
                                etb.a(0).postDelayed(new Runnable(this) {
                                    final /* synthetic */ AnonymousClass5 b;

                                    public void run() {
                                        drc.a(this.b.e.a, this.b.e.a(i));
                                    }
                                }, 300);
                            }
                            this.e.e.remove(str2);
                            if (this.e.d != null) {
                                this.e.d.a(i, message);
                            }
                        } else if (th instanceof HttpException) {
                            esu.b(this.e.a, 2131693725);
                        } else if (th instanceof IOException) {
                            esu.b(this.e.a, 2131693753);
                        }
                    }

                    public boolean a() {
                        return this.e.a == null || this.e.a.isFinishing();
                    }
                });
                return;
            }
            esu.b(blg.a(), 2131692461);
        }
    }

    private int a(int i) {
        if (i == 1001) {
            return 61001;
        }
        if (i == 1002) {
            return 61002;
        }
        return 0;
    }

    private Map a(String str, int i, String str2, int i2, int i3, int i4, String str3) {
        double d = ((double) i2) / 1000.0d;
        gr grVar = new gr();
        String str4 = BuildConfig.VERSION_NAME;
        if (eva.a(blg.a()).l()) {
            grVar.put("mid", String.valueOf(eva.a(blg.a()).i()));
        }
        grVar.put("type", "json");
        grVar.put("cid", str);
        grVar.put(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 81, (byte) 108, (byte) 104, (byte) 96}), String.valueOf(d));
        grVar.put(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 105, (byte) 106, (byte) 119}), String.valueOf(i3));
        grVar.put("msg", str2);
        grVar.put(hae.a(new byte[]{(byte) 99, (byte) 106, (byte) 107, (byte) 113, (byte) 118, (byte) 108, Byte.MAX_VALUE, (byte) 96}), String.valueOf(i));
        grVar.put("mode", String.valueOf(i4));
        grVar.put("pool", "0");
        if (!TextUtils.isEmpty(str3)) {
            grVar.put("rnd", str3);
        }
        return grVar;
    }

    private void a(Context context, String str) {
        b(context, context.getString(2131692524, new Object[]{str}));
    }

    private void b(Context context, String str) {
        Dialog b = new bl.jp.a(context, 2131755025).b(str).a(17039370, null).b();
        a(b);
        b.show();
    }

    private void a(Activity activity, String str, int i) {
        Dialog b = new bl.jp.a(activity, 2131755025).b(str).b(2131693760, new OnClickListener(this) {
            final /* synthetic */ dnh a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).a(2131693807, new OnClickListener(this) {
            final /* synthetic */ dnh a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                if (this.a.j > 0 && this.a.k != null) {
                    if (this.a.h != null) {
                        this.a.h.dismiss();
                    }
                    this.a.k.a();
                }
            }
        }).b();
        a(b);
        b.show();
        b.a(-2).setTextColor(-4737097);
    }

    private void a(final Activity activity, String str) {
        Dialog b = new bl.jp.a(activity, 2131755025).b(str).a(2131690528, new OnClickListener(this) {
            final /* synthetic */ dnh b;

            public void onClick(DialogInterface dialogInterface, int i) {
                activity.startActivityForResult(new Intent(activity, LiveBuyVipActivity.class), 2336);
            }
        }).b(2131693760, null).b();
        a(b);
        b.show();
    }

    private void a(final Dialog dialog) {
        dialog.setOnShowListener(new OnShowListener(this) {
            final /* synthetic */ dnh b;

            public void onShow(DialogInterface dialogInterface) {
                Window window = dialog.getWindow();
                LayoutParams attributes = window.getAttributes();
                int i = this.b.a.getResources().getDisplayMetrics().widthPixels;
                if (this.b.b()) {
                    attributes.width = (i * 6) / 7;
                } else {
                    attributes.width = (i * 4) / 7;
                }
                attributes.height = -2;
                attributes.gravity = 17;
                window.setAttributes(attributes);
                window.getDecorView().requestLayout();
            }
        });
    }

    private boolean b() {
        return this.i == PlayerScreenMode.VERTICAL_FULLSCREEN;
    }

    public void a(b bVar) {
        this.l = bVar;
    }
}
