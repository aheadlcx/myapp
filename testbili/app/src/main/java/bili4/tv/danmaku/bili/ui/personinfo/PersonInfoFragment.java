package bili4.tv.danmaku.bili.ui.personinfo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import bl.esl;
import bl.esu;
import bl.evf;
import bl.fci;
import bl.fcz;
import bl.fnt;
import bl.hae;
import bl.hah;
import bl.hal;
import bl.iuo;
import bl.kyt;
import bl.lls;
import bl.mbz;
import bl.mcz;
import bl.pr;
import bl.ps;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.ui.CircleImageView;
import java.util.List;
import tv.danmaku.bili.ui.personinfo.PersonInfoActivity.ModifyType;
import tv.danmaku.bili.ui.personinfo.PersonInfoLoadFragment.b;
import tv.danmaku.bili.ui.splash.Splash;
import tv.danmaku.bili.widget.LoadingImageView;
import u.aly.cp;
import u.aly.dd;
import u.aly.q;

/* compiled from: BL */
public class PersonInfoFragment extends hah {
    public static final String a = hae.a(new byte[]{(byte) 85, (byte) 96, (byte) 119, (byte) 118, (byte) 106, (byte) 107, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    kyt b;
    fnt c;
    private evf d;
    private Unbinder e;
    @BindView
    CircleImageView mAvatar;
    @BindView
    LoadingImageView mLoadingView;
    @BindView
    ScrollView mScrollView;
    @BindViews
    List<TextView> mTextViews;

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[ModifyType.values().length];

        static {
            try {
                a[ModifyType.SEX.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[ModifyType.BIRTHDAY.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[ModifyType.AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[ModifyType.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[ModifyType.SIGNATURE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    /* compiled from: BL */
    public static class a {
        public static final a a = new a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = kyt.a(getActivity());
        if (this.b == null) {
            FragmentManager fragmentManager = getFragmentManager();
            kyt bl_kyt = new kyt();
            this.b = bl_kyt;
            kyt.a(fragmentManager, bl_kyt);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(2131427810, viewGroup, false);
        this.e = ButterKnife.a(this, inflate);
        return inflate;
    }

    public void onResume() {
        super.onResume();
        if (this.d == null) {
            b();
            this.b.a();
        }
    }

    @OnClick
    public void onLoginoutClick() {
        new bl.jp.a(getActivity()).b(2131691231).b(2131691228, null).a(2131691229, new OnClickListener(this) {
            final /* synthetic */ PersonInfoFragment a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                this.a.a(new Runnable(this) {
                    final /* synthetic */ AnonymousClass1 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 74, (byte) 112, (byte) 113, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 119, (byte) 104, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                    }
                });
            }
        }).b().show();
        fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 74, (byte) 112, (byte) 113, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
    }

    private void a(final Runnable runnable) {
        mcz.c(getContext()).c(new pr<Void, Void>(this) {
            final /* synthetic */ PersonInfoFragment b;

            public /* synthetic */ Object a(ps psVar) throws Exception {
                return b(psVar);
            }

            public Void b(ps<Void> psVar) throws Exception {
                FragmentActivity activity = this.b.getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                    activity.finish();
                }
                if (runnable != null) {
                    runnable.run();
                }
                return null;
            }
        }, ps.b);
    }

    @OnClick
    public void onItemClick(View view) {
        switch (view.getId()) {
            case 2131296521:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.AVATAR;
                fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                break;
            case 2131296634:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.BIRTHDAY;
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 108, (byte) 119, (byte) 113, (byte) 109, (byte) 97, (byte) 100, (byte) 124, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 103, (byte) 108, (byte) 119, (byte) 113, (byte) 109, (byte) 97, (byte) 100, (byte) 124, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                break;
            case 2131298913:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.NAME;
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 107, (byte) 108, (byte) 102, (byte) 110, (byte) 107, (byte) 100, (byte) 104, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                break;
            case 2131299503:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.QR_CODE;
                fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 116, (byte) 119, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 103, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                break;
            case 2131299950:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.SEX;
                fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 118, (byte) 96, (byte) 125, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                break;
            case 2131300031:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.SIGNATURE;
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 112, (byte) 118, (byte) 108, (byte) 98, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                fcz.a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 90, (byte) 118, (byte) 108, (byte) 98, (byte) 107, (byte) 100, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                break;
            case 2131301032:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.NONE;
                if (this.d != null) {
                    esl.a(getContext(), "UID:" + this.d.a);
                    esu.b(getContext(), getString(2131694562));
                    break;
                }
                break;
            default:
                tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a.b = ModifyType.NONE;
                break;
        }
        a().b(tv.danmaku.bili.ui.personinfo.PersonInfoActivity.a.a);
    }

    @iuo
    public void onEventMyInfoLoadResult(bl.kyt.a aVar) {
        if (getActivity() != null) {
            if (aVar.b != null) {
                this.d = aVar.b;
            } else if (aVar.a != null && (aVar.a instanceof BiliApiException) && ((BiliApiException) aVar.a).a()) {
                a(null);
                return;
            } else {
                this.d = lls.a(getActivity());
                if (this.d == null) {
                    d();
                    return;
                }
            }
            c();
            e();
        }
    }

    @iuo
    public void onEventModifyPersonInfo(b bVar) {
        if (getActivity() != null) {
            if (this.c != null) {
                this.c.dismiss();
            }
            if (bVar.b != null) {
                if (bVar.b instanceof BiliApiException) {
                    a(bVar);
                } else {
                    esu.b(getActivity(), 2131694120);
                }
            } else if (this.d == null) {
                esu.b(getActivity(), 2131694120);
            } else {
                b(bVar);
            }
        }
    }

    @iuo
    public void onEventUploading(a aVar) {
        if (getActivity() != null) {
            this.c = fnt.a(getActivity(), null, getResources().getString(2131694243), true);
            this.c.setCanceledOnTouchOutside(false);
        }
    }

    private void e() {
        fci.g().a(this.d.c, this.mAvatar);
        ((TextView) this.mTextViews.get(0)).setText(this.d.b);
        ((TextView) this.mTextViews.get(1)).setText(String.valueOf(this.d.a));
        ((TextView) this.mTextViews.get(2)).setText(a(this.d.h));
        ((TextView) this.mTextViews.get(3)).setText(this.d.j);
        ((TextView) this.mTextViews.get(4)).setText(this.d.i);
    }

    public void b() {
        if (this.mLoadingView != null) {
            this.mLoadingView.setVisibility(0);
            this.mLoadingView.a();
            this.mScrollView.setVisibility(8);
        }
    }

    public void c() {
        if (this.mLoadingView != null) {
            this.mLoadingView.b();
            this.mLoadingView.setVisibility(8);
            this.mScrollView.setVisibility(0);
        }
    }

    public void d() {
        if (this.mLoadingView != null) {
            if (!this.mLoadingView.isShown()) {
                this.mLoadingView.setVisibility(0);
            }
            this.mLoadingView.c();
        }
    }

    public void a(b bVar) {
        int i = ((BiliApiException) bVar.b).mCode;
        String message = bVar.b.getMessage();
        if (mbz.a(i)) {
            mbz.a(getActivity(), i, message);
            return;
        }
        if (TextUtils.isEmpty(message)) {
            message = getResources().getString(2131694120);
            switch (AnonymousClass3.a[bVar.c.ordinal()]) {
                case q.a /*1*/:
                    if (i == -653) {
                        message = getResources().getString(2131694137);
                        break;
                    }
                    break;
                case dd.c /*2*/:
                    if (i == -653) {
                        message = getResources().getString(2131694118);
                        break;
                    }
                    break;
                case dd.d /*3*/:
                    if (i != -653) {
                        if (i != -4097) {
                            if (i == 10000) {
                                message = getResources().getString(2131694121);
                                break;
                            }
                        }
                        message = bVar.b.getMessage();
                        break;
                    }
                    message = getResources().getString(2131694111);
                    break;
                    break;
                case dd.e /*4*/:
                    if (i == -618) {
                        message = getResources().getString(2131694124);
                    } else if (i == -655) {
                        message = getResources().getString(2131694125);
                    } else if (i == -707) {
                        message = getResources().getString(2131694126);
                    } else if (i == 10000) {
                        message = getResources().getString(2131694121);
                    }
                    hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 107, (byte) 108, (byte) 102, (byte) 110, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}), message);
                    break;
                case cp.f /*5*/:
                    if (i == -653) {
                        message = getResources().getString(2131694144);
                    } else if (i == -1001) {
                        message = getResources().getString(2131694146);
                    } else if (i == 10000) {
                        message = getResources().getString(2131694121);
                    }
                    hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 112, (byte) 118, (byte) 108, (byte) 98, (byte) 107}), hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}), message);
                    break;
            }
        }
        esu.b(getActivity(), message);
    }

    public void b(b bVar) {
        switch (AnonymousClass3.a[bVar.c.ordinal()]) {
            case q.a /*1*/:
                this.d.h = String.valueOf(bVar.a);
                ((TextView) this.mTextViews.get(2)).setText(a(this.d.h));
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 118, (byte) 96, (byte) 125}), "sex", a(this.d.h));
                break;
            case dd.c /*2*/:
                this.d.j = (String) bVar.a;
                ((TextView) this.mTextViews.get(3)).setText(this.d.j);
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 108, (byte) 119, (byte) 113, (byte) 109, (byte) 97, (byte) 100, (byte) 124}), hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 119, (byte) 113, (byte) 109, (byte) 97, (byte) 100, (byte) 124}), this.d.j.split("-")[0]);
                break;
            case dd.d /*3*/:
                if (bVar.a != null) {
                    this.d.c = (String) bVar.a;
                    fci.g().a(this.d.c, this.mAvatar);
                    break;
                }
                break;
            case dd.e /*4*/:
                this.d.b = (String) bVar.a;
                ((TextView) this.mTextViews.get(0)).setText(this.d.b);
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 107, (byte) 108, (byte) 102, (byte) 110, (byte) 107, (byte) 100, (byte) 104, (byte) 96}));
                break;
            case cp.f /*5*/:
                this.d.i = (String) bVar.a;
                ((TextView) this.mTextViews.get(4)).setText(this.d.i);
                hal.a(getActivity(), hae.a(new byte[]{(byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 99, (byte) 108, (byte) 105, (byte) 96, (byte) 90, (byte) 112, (byte) 118, (byte) 108, (byte) 98, (byte) 107}));
                break;
        }
        lls.a(getActivity(), this.d);
        esu.b(getActivity(), 2131694122);
    }

    public String a(String str) {
        if (Splash.SPLASH_TYPE_DEFAULT.equals(str)) {
            return getResources().getString(2131694139);
        }
        if (Splash.SPLASH_TYPE_BD.equals(str)) {
            return getResources().getString(2131694140);
        }
        if (Splash.SPLASH_TYPE_BIRTHDAY.equals(str)) {
            return getResources().getString(2131694138);
        }
        return getResources().getString(2131694139);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
    }
}
