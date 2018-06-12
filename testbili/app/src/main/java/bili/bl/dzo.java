package bili.bl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.bilibili.api.BiliApiException;
import com.bilibili.bilibililive.im.entity.ChatMessage;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGuardOrderInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveShipTicket;
import com.bilibili.bililive.videoliveplayer.net.beans.BililiveBuyGoldOrder;
import com.bilibili.bililive.videoliveplayer.pay.RechargeOrderInfo;
import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.buyguard.SelectMonthButton;
import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.buyguard.widget.GuardHeadGroup;
import retrofit2.HttpException;

/* compiled from: BL */
public class dzo extends DialogFragment {
    private long a;
    private int b = 3;
    private SelectMonthButton c;
    private TextView d;
    private TextView e;
    private TextView f;
    private GuardHeadGroup g;
    private BiliLiveGuardOrderInfo h;
    private fnt i;
    private a j;
    private f k = new f(this) {
        final /* synthetic */ dzo a;

        {
            this.a = r1;
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (i == 0) {
                this.a.b = 3;
            } else if (i == 1) {
                this.a.b = 2;
            } else if (i == 2) {
                this.a.b = 1;
            }
            this.a.c(this.a.b);
        }

        public void onPageScrollStateChanged(int i) {
        }
    };

    /* compiled from: BL */
    public interface a {
        void a();

        void a(int i);
    }

    /* compiled from: BL */
    static class b extends FragmentPagerAdapter {
        public b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        public Fragment getItem(int i) {
            if (i == 1) {
                return dzy.a(2);
            }
            if (i == 2) {
                return dzy.a(1);
            }
            return dzy.a(3);
        }

        public int getCount() {
            return 3;
        }
    }

    public static dzo a(long j, int i) {
        dzo bl_dzo = new dzo();
        Bundle bundle = new Bundle();
        bundle.putLong(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 102, (byte) 109, (byte) 106, (byte) 119, (byte) 76, (byte) 97}), j);
        if (i < 1 || i > 3) {
            bundle.putInt(hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 99, (byte) 100, (byte) 112, (byte) 105, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 66, (byte) 112, (byte) 100, (byte) 119, (byte) 97, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105}), 3);
        } else {
            bundle.putInt(hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 99, (byte) 100, (byte) 112, (byte) 105, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 66, (byte) 112, (byte) 100, (byte) 119, (byte) 97, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105}), i);
        }
        bl_dzo.setArguments(bundle);
        return bl_dzo;
    }

    public void a(a aVar) {
        this.j = aVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getArguments() != null) {
            this.a = getArguments().getLong(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 102, (byte) 109, (byte) 106, (byte) 119, (byte) 76, (byte) 97}), 0);
            this.b = getArguments().getInt(hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 99, (byte) 100, (byte) 112, (byte) 105, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 66, (byte) 112, (byte) 100, (byte) 119, (byte) 97, (byte) 73, (byte) 96, (byte) 115, (byte) 96, (byte) 105}), 3);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.i = new fnt(getActivity());
        this.i.a(true);
        this.i.a(getString(2131694243));
        this.i.setCancelable(false);
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setLayout(-1, -2);
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 64, (byte) 51, (byte) 55, (byte) 55, (byte) 52, (byte) 102, (byte) 55, (byte) 48}))));
            window.setDimAmount(0.0f);
            window.requestFeature(1);
            window.setGravity(80);
        }
        return onCreateDialog;
    }

    public void dismiss() {
        super.dismissAllowingStateLoss();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.i != null) {
            this.i.dismiss();
        }
        if (this.j != null) {
            this.j.a();
        }
        super.onDismiss(dialogInterface);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131428652, viewGroup, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(2131298369).setOnClickListener(new dzp(this));
        ViewPager viewPager = (ViewPager) view.findViewById(2131298571);
        viewPager.setAdapter(new b(getChildFragmentManager()));
        viewPager.a(this.k);
        a(view, viewPager);
        this.g = (GuardHeadGroup) view.findViewById(2131297963);
        this.g.setOnHeaderClickedListener(new dzq(this, viewPager));
        this.d = (TextView) view.findViewById(2131300850);
        this.d.setText(b(1));
        this.c = (SelectMonthButton) view.findViewById(2131299898);
        this.c.setOnMonthChangeListener(new dzr(this));
        this.e = (TextView) view.findViewById(2131300878);
        this.f = (TextView) view.findViewById(2131300934);
        this.f.setOnClickListener(new dzs(this));
        if (this.b == 1) {
            viewPager.setCurrentItem(2);
        } else if (this.b == 2) {
            viewPager.setCurrentItem(1);
        } else {
            viewPager.setCurrentItem(0);
        }
        c(this.b);
        a();
    }

    final /* synthetic */ void b(View view) {
        dismiss();
    }

    final /* synthetic */ void a(ViewPager viewPager, int i) {
        if (i == 1) {
            viewPager.setCurrentItem(2);
        } else if (i == 2) {
            viewPager.setCurrentItem(1);
        } else if (i == 3) {
            viewPager.setCurrentItem(0);
        }
        this.b = i;
        c(this.b);
    }

    final /* synthetic */ void a(int i) {
        this.d.setText(b(i));
        b(this.b, i);
    }

    final /* synthetic */ void a(View view) {
        b();
    }

    private void a(@NonNull View view, @NonNull ViewPager viewPager) {
        int i = 0;
        if (getContext() != null) {
            boolean g = coa.g(getContext());
            if (g) {
                view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
                int b = coa.b(getContext()) - coa.c(getContext());
                if (g) {
                    i = coa.f(getContext());
                }
                i = b - i;
                if (i < view.getMeasuredHeight()) {
                    int measuredHeight = viewPager.getMeasuredHeight();
                    if (measuredHeight > 0) {
                        i = measuredHeight - ((view.getMeasuredHeight() - i) + 10);
                        if (i > 0 && viewPager.getLayoutParams() != null) {
                            LayoutParams layoutParams = viewPager.getLayoutParams();
                            layoutParams.height = i;
                            viewPager.setLayoutParams(layoutParams);
                        }
                    }
                }
            }
        }
    }

    private String b(int i) {
        return getString(2131692755, Integer.valueOf(i * 30));
    }

    private void c(int i) {
        this.g.a(i);
        this.c.setSelectMonth(1);
        this.d.setText(b(1));
        b(i, 1);
    }

    private void a() {
        d();
        doc.a().o(this.a, new gnc<BiliLiveGuardOrderInfo>(this) {
            final /* synthetic */ dzo a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(@Nullable Object obj) {
                a((BiliLiveGuardOrderInfo) obj);
            }

            public void a(@Nullable BiliLiveGuardOrderInfo biliLiveGuardOrderInfo) {
                this.a.e();
                this.a.h = biliLiveGuardOrderInfo;
                if (this.a.h != null) {
                    this.a.g.setGuardOrderInfo(this.a.h);
                    this.a.c(this.a.b);
                    return;
                }
                esu.a(this.a.getContext(), 2131692483, 1);
            }

            public void a(Throwable th) {
                this.a.e();
                esu.a(this.a.getContext(), 2131692483, 1);
            }

            public boolean a() {
                return !this.a.isAdded();
            }
        });
    }

    private void b() {
        d();
        final int selectedMonth = this.c.getSelectedMonth();
        doc.a().b(this.a, this.b, selectedMonth, new gnc<Object>(this) {
            final /* synthetic */ dzo b;

            public void b(@Nullable Object obj) {
                this.b.e();
                if (this.b.getContext() != null) {
                    new bl.jp.a(this.b.getContext()).b(2131692571).a(2131692570, new dzt(this, selectedMonth)).b(2131692357, new dzu(this)).b().show();
                }
            }

            final /* synthetic */ void a(int i, DialogInterface dialogInterface, int i2) {
                this.b.a(2, i);
                dialogInterface.dismiss();
            }

            final /* synthetic */ void a(DialogInterface dialogInterface, int i) {
                esu.a(this.b.getContext(), 2131692568, 1);
                dialogInterface.dismiss();
            }

            public void a(Throwable th) {
                if ((th instanceof BiliApiException) && ((BiliApiException) th).mCode == ChatMessage.TYPE_MEMBER_JOINED) {
                    if (this.b.getContext() != null) {
                        this.b.a(1, selectedMonth);
                    }
                } else if (th instanceof HttpException) {
                    this.b.e();
                    esu.a(this.b.getContext(), 2131692466, 1);
                } else {
                    this.b.e();
                    esu.a(this.b.getContext(), 2131694044, 1);
                }
            }

            public boolean a() {
                return !this.b.isAdded();
            }
        });
    }

    private void a(final int i, final int i2) {
        d();
        doc.a().a(this.a, i, this.b, i2, new gnc<BiliLiveShipTicket>(this) {
            final /* synthetic */ dzo c;

            public /* synthetic */ void b(@Nullable Object obj) {
                a((BiliLiveShipTicket) obj);
            }

            public void a(@Nullable BiliLiveShipTicket biliLiveShipTicket) {
                if (biliLiveShipTicket == null) {
                    this.c.e();
                    esu.a(this.c.getContext(), 2131694044, 1);
                } else if (i == 1) {
                    this.c.d(i2);
                } else if (i == 2) {
                    this.c.a(biliLiveShipTicket.token, i2);
                }
            }

            public void a(Throwable th) {
                this.c.e();
                if (th instanceof BiliApiException) {
                    esu.a(this.c.getContext(), th.getMessage(), 1);
                } else if (th instanceof HttpException) {
                    esu.a(this.c.getContext(), 2131692466, 1);
                } else {
                    esu.a(this.c.getContext(), 2131694044, 1);
                }
            }

            public boolean a() {
                return !this.c.isAdded();
            }
        });
    }

    private void a(String str, int i) {
        doc.a().a(this.a, this.b, i, str, new gnc<Object>(this) {
            final /* synthetic */ dzo a;

            {
                this.a = r1;
            }

            public void b(@Nullable Object obj) {
                this.a.e();
                if (this.a.getActivity() != null) {
                    dxl.a(this.a.getActivity()).d();
                }
                this.a.e(this.a.b);
            }

            public void a(Throwable th) {
                this.a.e();
                if (th instanceof HttpException) {
                    this.a.f();
                } else if ((th instanceof BiliApiException) && ((BiliApiException) th).mCode == ChatMessage.TYPE_MEMBER_JOINED) {
                    esu.a(this.a.getContext(), th.getMessage(), 1);
                } else {
                    this.a.g();
                }
            }

            public boolean a() {
                return !this.a.isAdded();
            }
        });
    }

    private void d(int i) {
        long j = -1;
        if (this.h != null) {
            j = this.h.getPrice(this.b) / 1000;
        }
        if (j < 0) {
            e();
            return;
        }
        final long j2 = j * ((long) i);
        doc.a().a(this.a, j2, this.b, i, new gnc<BililiveBuyGoldOrder>(this) {
            final /* synthetic */ dzo b;

            public /* synthetic */ void b(@Nullable Object obj) {
                a((BililiveBuyGoldOrder) obj);
            }

            public void a(@Nullable BililiveBuyGoldOrder bililiveBuyGoldOrder) {
                this.b.e();
                if (bililiveBuyGoldOrder != null) {
                    this.b.a(bililiveBuyGoldOrder.mOrderNo, j2);
                } else {
                    this.b.g();
                }
            }

            public void a(Throwable th) {
                this.b.e();
                if (th instanceof HttpException) {
                    this.b.f();
                } else {
                    this.b.g();
                }
            }

            public boolean a() {
                return !this.b.isAdded();
            }
        });
    }

    private void a(String str, long j) {
        drb.a((Fragment) this, new RechargeOrderInfo(str, (float) j, 3), new com.bilibili.bililive.videoliveplayer.pay.RechargeUiConfig.a().a(0.1f).a(getString(2131692270), getString(2131692563, String.valueOf(j), String.valueOf(j), c()), getString(2131692560), getString(2131692561)).a(), 111);
    }

    private String c() {
        if (this.b == 1) {
            return getContext().getString(2131692440);
        }
        if (this.b == 2) {
            return getContext().getString(2131692441);
        }
        if (this.b == 3) {
            return getContext().getString(2131692442);
        }
        return BuildConfig.VERSION_NAME;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 111) {
            return;
        }
        if (i2 == -1) {
            e(this.b);
        } else {
            g();
        }
    }

    private void e(int i) {
        int i2 = -1;
        if (i == 1) {
            i2 = 2003;
        } else if (i == 2) {
            i2 = 2004;
        } else if (i == 3) {
            i2 = 2005;
        }
        if (i2 < 0 || this.j == null) {
            esu.a(getContext(), 2131692569, 1);
        } else {
            egd.f(getContext(), i);
            this.j.a(i2);
        }
        dismiss();
    }

    private void b(int i, int i2) {
        if (this.h != null) {
            long price = this.h.getPrice(i) * ((long) i2);
            if (price > 0) {
                this.e.setText(com.a(price));
            } else {
                this.e.setText(BuildConfig.VERSION_NAME);
            }
            if (this.h.canBuy(i)) {
                this.f.setEnabled(true);
                return;
            } else {
                this.f.setEnabled(false);
                return;
            }
        }
        this.e.setText(BuildConfig.VERSION_NAME);
        this.f.setEnabled(false);
    }

    private void d() {
        if (this.i != null && !this.i.isShowing()) {
            this.i.show();
        }
    }

    private void e() {
        if (this.i != null) {
            this.i.dismiss();
        }
    }

    private void f() {
        if (getContext() != null) {
            new bl.jp.a(getContext()).a(2131692466).b(2131692467).a(2131692358, null).b().show();
        }
    }

    private void g() {
        if (getContext() != null) {
            new bl.jp.a(getContext()).a(2131694044).a(2131692358, null).b().show();
        }
    }
}
