package bili.bl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bilibili.api.BiliApiException;
import com.bilibili.app.live.core.api.BiliComment;
import com.bilibili.app.live.core.api.BiliComment.Content;
import com.bilibili.app.live.core.api.BiliComment.Member;
import com.bilibili.app.live.core.api.CommentAddResult;
import com.bilibili.lib.account.model.VipExtraUserInfo;
import com.bilibili.okretro.GeneralResponse;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class bab extends fku implements bl.bap.a {
    public static final String a = hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 96, (byte) 107, (byte) 97, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119});
    private long b;
    private int c;
    private long d;
    private int e;
    private bap f;
    private d g;
    private azw h;
    private azx i;
    private String j;
    private long k;
    private boolean l;
    private int m = 2131694511;
    private List<b> n;

    /* compiled from: BL */
    public interface b {
        void a(BiliComment biliComment, long j);
    }

    /* compiled from: BL */
    static class a extends ReplacementSpan {
        final Context a;
        long b;
        Paint c;

        public a(Context context) {
            this.a = context;
        }

        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            Rect rect = new Rect();
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
            return rect.right;
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            if (this.c == null) {
                this.c = new Paint(paint);
            }
            int size = getSize(paint, charSequence, i, i2 - 1, null);
            paint.setColor(fnd.a(this.a, 2131100837));
            canvas.drawRect(f, (float) i3, (float) size, (float) i5, paint);
            paint.setColor(this.c.getColor());
            canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        }
    }

    /* compiled from: BL */
    class c extends gnb<GeneralResponse<CommentAddResult>> {
        final /* synthetic */ bab a;
        private String b;
        private long c;

        public c(bab bl_bab, String str, long j) {
            this.a = bl_bab;
            this.b = str;
            this.c = j;
        }

        public boolean a() {
            return this.a.getActivity() == null;
        }

        public void a(Throwable th) {
            this.a.g.a(false);
            this.a.g.c.dismiss();
            Context activity = this.a.getActivity();
            if (th instanceof BiliApiException) {
                int a;
                BiliApiException biliApiException = (BiliApiException) th;
                int i = biliApiException.mCode;
                String message = biliApiException.getMessage();
                if (TextUtils.isEmpty(message)) {
                    a = bac.a(i);
                } else {
                    a = -2;
                }
                if (!(this.a.h == null || this.a.h.getDialog() == null || !this.a.h.getDialog().isShowing())) {
                    this.a.h.g();
                }
                if (a == bac.a) {
                    this.a.g();
                    return;
                } else if (a == -2) {
                    esu.b(activity, message);
                    return;
                } else {
                    esu.b(activity, activity.getString(a, new Object[]{Integer.valueOf(i)}));
                    return;
                }
            }
            esu.b(activity, hae.a(new byte[]{(byte) -23, (byte) -67, (byte) -82, (byte) -23, (byte) -109, (byte) -122, (byte) -22, Byte.MIN_VALUE, (byte) -96, (byte) -24, (byte) -101, (byte) -89, (byte) -24, (byte) -107, (byte) -117, (byte) -24, (byte) -78, (byte) -98, (byte) -24, (byte) -76, (byte) -109, (byte) -25, (byte) -80, (byte) -111, (byte) -23, (byte) -127, (byte) -86}));
            if (this.a.h != null && this.a.h.getDialog() != null && this.a.h.getDialog().isShowing()) {
                this.a.h.a();
            }
        }

        public void a(GeneralResponse<CommentAddResult> generalResponse) {
            this.a.g.a(false);
            this.a.g.c.dismiss();
            if (this.a.getFragmentManager() != null && this.a.getActivity() != null && generalResponse != null) {
                int i = generalResponse.code;
                if (i == 0) {
                    this.a.a(this.b, (GeneralResponse) generalResponse, this.c);
                } else if (i != 12015 || generalResponse.data == null) {
                    a(new BiliApiException(i, generalResponse.message));
                } else if (!((CommentAddResult) generalResponse.data).need_captcha) {
                    esu.b(this.a.getContext(), hae.a(new byte[]{(byte) -21, (byte) -78, (byte) -81, (byte) -22, (byte) -72, (byte) -67, (byte) -24, (byte) -76, Byte.MIN_VALUE, (byte) -21, (byte) -73, (byte) -126, (byte) -26, (byte) -109, (byte) -113, (byte) -25, (byte) -87, (byte) -114, (byte) -26, (byte) -91, (byte) -125, (byte) -25, (byte) -96, (byte) -114, (byte) -24, (byte) -81, (byte) -114, (byte) -21, (byte) -75, (byte) -119}));
                    this.a.a(this.b, (GeneralResponse) generalResponse, this.c);
                } else if (this.a.h == null) {
                } else {
                    if (this.a.h.getDialog() == null || !this.a.h.getDialog().isShowing()) {
                        this.a.h.show(this.a.getFragmentManager(), hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 70, (byte) 100, (byte) 117, (byte) 113, (byte) 102, (byte) 109, (byte) 100, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113}));
                        this.a.h.c(((CommentAddResult) generalResponse.data).url);
                        return;
                    }
                    this.a.h.h();
                    this.a.h.c(((CommentAddResult) generalResponse.data).url);
                }
            }
        }
    }

    /* compiled from: BL */
    public static class d extends azy {
        private static final String b = hae.a(new byte[]{(byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 43, (byte) 118, (byte) 96, (byte) 107, (byte) 97});
        private fnt c;

        public static d b(FragmentActivity fragmentActivity) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            d dVar = (d) supportFragmentManager.findFragmentByTag(hae.a(new byte[]{(byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 43, (byte) 118, (byte) 96, (byte) 107, (byte) 97}));
            if (dVar == null) {
                dVar = new d();
                supportFragmentManager.beginTransaction().add((Fragment) dVar, hae.a(new byte[]{(byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 43, (byte) 118, (byte) 96, (byte) 107, (byte) 97})).commitAllowingStateLoss();
                supportFragmentManager.executePendingTransactions();
            }
            dVar.c = fnt.a(fragmentActivity, null, hae.a(new byte[]{(byte) -22, Byte.MIN_VALUE, (byte) -98, (byte) -26, (byte) -113, (byte) -114, (byte) -21, (byte) -73, (byte) -94, (byte) 43, (byte) 43, (byte) 43}), true, false);
            return dVar;
        }

        public void a(long j, int i, long j2, long j3, String str, String str2, int i2, gnb<GeneralResponse<CommentAddResult>> bl_gnb_com_bilibili_okretro_GeneralResponse_com_bilibili_app_live_core_api_CommentAddResult) {
            a(true);
            bag.a(eva.a(getApplicationContext()).j(), str, str2, j, i, j2, j3, null, i2, bl_gnb_com_bilibili_okretro_GeneralResponse_com_bilibili_app_live_core_api_CommentAddResult);
        }
    }

    public static bab a(long j, int i, long j2) {
        bab bl_bab = new bab();
        Bundle bundle = new Bundle();
        bundle.putLong("oid", j);
        bundle.putInt("type", i);
        bundle.putLong("rpid", j2);
        bl_bab.setArguments(bundle);
        return bl_bab;
    }

    static a a(Editable editable) {
        a[] aVarArr = (a[]) editable.getSpans(0, editable.length(), a.class);
        if (aVarArr.length > 0) {
            return aVarArr[0];
        }
        return null;
    }

    public static String a() {
        return hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 96, (byte) 107, (byte) 97, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 106, (byte) 105, (byte) 105, (byte) 96, (byte) 119});
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(long j, long j2) {
        a(j, j2, false);
    }

    public void a(long j, long j2, boolean z) {
        this.b = j;
        this.d = j2;
        if (z && this.f != null) {
            CharSequence a = this.i.a(this.b, this.c, this.d);
            if (!TextUtils.isEmpty(a)) {
                this.f.setText(a);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.b = arguments.getLong("oid");
        this.d = arguments.getLong("rpid");
        this.c = arguments.getInt("type");
        this.i = new azx(getActivity());
        e();
    }

    public void onDestroy() {
        this.i.close();
        super.onDestroy();
    }

    private void e() {
        if (this.h == null) {
            this.h = new azw();
            this.h.a(new bl.azu.a(this) {
                final /* synthetic */ bab a;

                {
                    this.a = r1;
                }

                public void onClick(azu bl_azu, int i) {
                    if (i == -1) {
                        String i2 = bl_azu.i();
                        if (!TextUtils.isEmpty(i2)) {
                            esn.b(this.a.getContext(), bl_azu.getView(), 2);
                            bl_azu.j();
                            this.a.a(i2);
                        }
                    } else if (i == -2) {
                        bl_azu.dismissAllowingStateLoss();
                    } else if (i == -3) {
                        this.a.h.k();
                    }
                }
            });
        }
    }

    private void f() {
        if (this.h != null && this.h.getDialog() != null && this.h.getDialog().isShowing()) {
            this.h.dismiss();
        }
    }

    private void a(String str) {
        a(this.k, this.j, str);
    }

    public void a(bap bl_bap) {
        this.f = bl_bap;
        this.f.setActivity(getActivity());
        this.f.setSendCallback(this);
        CharSequence a = this.i.a(this.b, this.c, this.d);
        if (!TextUtils.isEmpty(a)) {
            this.f.setText(a);
        }
    }

    public String b() {
        if (this.i != null) {
            return this.i.a(this.b, this.c, this.d);
        }
        return BuildConfig.VERSION_NAME;
    }

    public void a(BiliComment biliComment) {
        if (this.f != null) {
            Editable text = this.f.getText();
            a a = a(text);
            if (a != null) {
                text.delete(text.getSpanStart(a), text.getSpanEnd(a));
            }
            if (biliComment == null) {
                return;
            }
            if (a == null || a.b != biliComment.mRpId) {
                Object string = getString(2131691600, new Object[]{biliComment.mMember.mNick});
                text.insert(0, string);
                a aVar = new a(getActivity());
                aVar.b = biliComment.mRpId;
                text.setSpan(aVar, 0, string.length(), 33);
                this.f.j();
            }
        }
    }

    public void onStop() {
        if (this.f != null) {
            this.f.h();
        }
        c();
        super.onStop();
    }

    private void g() {
        new bl.jp.a(getActivity()).b(hae.a(new byte[]{(byte) -22, Byte.MIN_VALUE, (byte) -98, (byte) -24, (byte) -127, (byte) -65, (byte) -23, (byte) -115, (byte) -89, (byte) -24, (byte) -107, (byte) -117, (byte) -25, (byte) -69, (byte) -87, (byte) -22, Byte.MIN_VALUE, (byte) -72, (byte) -23, (byte) -109, (byte) -91, (byte) -24, (byte) -76, (byte) -98, (byte) -22, (byte) -95, (byte) -107, (byte) -23, (byte) -122, (byte) -124, (byte) -23, (byte) -109, (byte) -75, (byte) 41, (byte) -21, (byte) -73, (byte) -126, (byte) -25, (byte) -116, (byte) -78, (byte) -22, (byte) -95, (byte) -125, (byte) -23, (byte) -121, (byte) -97, (byte) -23, (byte) -100, (byte) -126, (byte) -21, (byte) -78, (byte) -109, (byte) -22, (byte) -100, (byte) -87, (byte) 41, (byte) -26, (byte) -90, (byte) -93, (byte) -21, (byte) -73, (byte) -123, (byte) -24, (byte) -76, (byte) -98, (byte) -22, (byte) -95, (byte) -107, (byte) -22, (byte) -77, (byte) -113, (byte) -22, (byte) -97, (byte) -96, (byte) -23, (byte) -110, (byte) -116, (byte) -26, (byte) -106, (byte) -97, (byte) -22, (byte) -97, (byte) -88, (byte) 123})).b("\u4e0b\u6b21\u518d\u8bf4", null).a("\u9a6c\u4e0a\u7ed1\u5b9a", new OnClickListener(this) {
            final /* synthetic */ bab a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                baa.a(this.a.getApplicationContext());
                dialogInterface.cancel();
            }
        }).b().show();
    }

    public void c() {
        if (this.f != null && this.b > 0) {
            Editable text = this.f.getText();
            a a = a(text);
            if (a != null) {
                text.delete(text.getSpanStart(a), text.getSpanEnd(a));
            }
            this.i.a(this.b, this.c, this.d, text.toString());
        }
    }

    public void b(Editable editable) {
        if (this.l) {
            Activity activity = getActivity();
            if (activity != null) {
                esu.b(activity.getApplicationContext(), this.m);
                return;
            }
            return;
        }
        long j = this.d;
        a a = a(editable);
        int i = 0;
        if (a != null) {
            j = a.b;
            i = editable.getSpanEnd(a);
        }
        a(j);
        if (a(editable, i)) {
            this.j = editable.toString().trim();
            if (TextUtils.isEmpty(this.j)) {
                esu.b(getApplicationContext(), 2131691585);
                return;
            }
            Context activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            if (eva.a(activity2).a()) {
                a(j, this.j);
                return;
            }
            esu.b(activity2.getApplicationContext(), 2131691597);
            baa.b(activity2);
        }
    }

    private boolean a(@NonNull Editable editable, int i) {
        if (editable.length() == 0) {
            esu.b(getApplicationContext(), 2131691585);
            return false;
        } else if (editable.length() - i < 1000) {
            return true;
        } else {
            esu.b(getApplicationContext(), 2131691586);
            return false;
        }
    }

    public boolean d() {
        return this.f != null && this.f.d();
    }

    public void a(long j) {
        this.k = j;
    }

    public void a(long j, String str) {
        a(j, str, null);
    }

    public void a(long j, String str, String str2) {
        if (this.g == null) {
            this.g = d.b(getActivity());
        }
        if (!this.g.b() && this.b > 0) {
            this.g.a(this.b, this.c, this.d, j, str, str2, this.e, new c(this, str, j));
        }
    }

    private void a(String str, GeneralResponse<CommentAddResult> generalResponse, long j) {
        f();
        Context activity = getActivity();
        if (activity != null && generalResponse != null && generalResponse.data != null) {
            this.f.setText(BuildConfig.VERSION_NAME);
            this.i.b(this.b, this.c, this.d);
            BiliComment biliComment = new BiliComment();
            biliComment.mMember = new Member();
            evf c = eva.a(getApplicationContext()).c();
            String str2 = "0";
            if (c != null) {
                if ("1".equals(str2)) {
                    str2 = "\u7537";
                } else if ("2".equals(str2)) {
                    str2 = "\u5973";
                }
                biliComment.mMember.mLevelInfo = c.r;
                biliComment.mMember.mFace = c.c;
                biliComment.mMember.mNick = c.b;
                biliComment.mMid = c.a;
                evj bl_evj = c.s;
                if (bl_evj != null) {
                    VipExtraUserInfo vipExtraUserInfo = new VipExtraUserInfo();
                    vipExtraUserInfo.a = bl_evj.a;
                    vipExtraUserInfo.b = bl_evj.b;
                    vipExtraUserInfo.c = bl_evj.d;
                    biliComment.mMember.vipInfo = vipExtraUserInfo;
                }
            }
            biliComment.mMember.mGender = str2;
            biliComment.mContent = new Content();
            biliComment.mContent.mMsg = baj.a(getActivity(), (CharSequence) str);
            biliComment.mOid = this.b;
            biliComment.mType = this.c;
            biliComment.mRpId = ((CommentAddResult) generalResponse.data).rpid == 0 ? -1 : (long) ((CommentAddResult) generalResponse.data).rpid;
            biliComment.mPubTimeMs = System.currentTimeMillis() / 1000;
            biliComment.isPending = ((CommentAddResult) generalResponse.data).is_pending;
            esu.b(activity, biliComment.isPending ? hae.a(new byte[]{(byte) -23, Byte.MIN_VALUE, (byte) -97, (byte) -21, (byte) -75, (byte) -85, (byte) -23, (byte) -121, (byte) -97, (byte) -22, (byte) -123, (byte) -112, (byte) 123}) : activity.getString(2131691606));
            this.f.e();
            if (this.n != null && !this.n.isEmpty()) {
                for (b a : this.n) {
                    a.a(biliComment, j);
                }
            }
        }
    }

    public void a(b bVar) {
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(bVar);
    }
}
