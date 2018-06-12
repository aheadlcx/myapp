package bili3.com.bilibili.upper.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bl.esu;
import bl.fci;
import bl.fcz;
import bl.fji;
import bl.fkt;
import bl.fky;
import bl.fnd;
import bl.fnt;
import bl.gnb;
import bl.gr;
import bl.hae;
import bl.hbk;
import bl.hfh;
import bl.hfx;
import bl.hfy;
import bl.hio;
import com.bilibili.api.BiliApiException;
import com.bilibili.lib.ui.CircleImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.upper.api.bean.UpperComment;
import com.bilibili.upper.api.bean.UpperCommentAddResult;
import com.bilibili.upper.api.bean.UpperCommentParentInfo;
import com.bilibili.upper.api.bean.UpperCommentParentInfo.ContentEntity;
import com.bilibili.upper.api.bean.UpperCommentParentInfo.MemberEntity;
import com.bilibili.upper.widget.text.UpperImageSpannableTextView;
import com.tencent.connect.common.Constants;
import tv.danmaku.bili.widget.FlowLayout;

/* compiled from: BL */
public class CommentDetailActivity extends fky implements OnClickListener, bl.hio.a {
    public static String a = hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 96, (byte) 107, (byte) 113, (byte) 119, (byte) 124});
    private int A;
    private int B;
    private UpperComment b;
    private CircleImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private LinearLayout g;
    private TextView h;
    private ImageView i;
    private TextView j;
    private UpperImageSpannableTextView k;
    private TextView l;
    private TintTextView m;
    private RelativeLayout n;
    private RelativeLayout o;
    private CircleImageView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private FlowLayout t;
    private hio v;
    private String w;
    private c x;
    private int y;
    private int z;

    /* compiled from: BL */
    static class a extends ReplacementSpan {
        final Context a;
        Paint b;

        public a(Context context) {
            this.a = context;
        }

        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            Rect rect = new Rect();
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
            return rect.right;
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            if (this.b == null) {
                this.b = new Paint(paint);
            }
            int size = getSize(paint, charSequence, i, i2 - 1, null);
            paint.setColor(fnd.a(this.a, 2131100837));
            canvas.drawRect(f, (float) i3, (float) size, (float) i5, paint);
            paint.setColor(this.b.getColor());
            canvas.drawText(charSequence, i, i2, f, (float) i4, paint);
        }
    }

    /* compiled from: BL */
    class b extends gnb<GeneralResponse<UpperCommentAddResult>> {
        final /* synthetic */ CommentDetailActivity a;
        private String b;

        public b(CommentDetailActivity commentDetailActivity, String str) {
            this.a = commentDetailActivity;
            this.b = str;
        }

        public void a(GeneralResponse<UpperCommentAddResult> generalResponse) {
            this.a.x.a(false);
            this.a.x.c.dismiss();
            int i = generalResponse.code;
            if (i == 0) {
                this.a.v.setText(Constants.STR_EMPTY);
                fcz.a(hae.a(new byte[]{(byte) 104, (byte) 117, (byte) 90, (byte) 102, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 119, (byte) 96, (byte) 117, (byte) 105, (byte) 124}), new String[0]);
                esu.b(this.a, this.a.getString(2131695809));
                this.a.finish();
            } else if (i != 12015 || generalResponse.data == null) {
                a(new BiliApiException(i, generalResponse.message));
            } else {
                esu.b(this.a, this.a.getString(2131695718));
            }
        }

        public void a(Throwable th) {
            this.a.x.a(false);
            this.a.x.c.dismiss();
            Object obj = this.a;
            if (th instanceof BiliApiException) {
                BiliApiException biliApiException = (BiliApiException) th;
                if (biliApiException.mCode == 61001 || biliApiException.mCode == 61002) {
                    Bundle bundle = new Bundle();
                    bundle.putInt(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 70, (byte) 106, (byte) 97, (byte) 96}), biliApiException.mCode);
                    bundle.putString(hae.a(new byte[]{(byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 72, (byte) 118, (byte) 98}), biliApiException.getMessage());
                    fji.a().a(obj).a(bundle).a(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 124, (byte) 40, (byte) 97, (byte) 108, (byte) 100, (byte) 105, (byte) 106, (byte) 98}));
                    return;
                }
                int i = biliApiException.mCode;
                obj = biliApiException.getMessage();
                if (TextUtils.isEmpty(obj)) {
                    esu.b(this.a, this.a.getString(2131695716));
                } else {
                    esu.b(this.a, obj);
                }
            }
        }
    }

    /* compiled from: BL */
    public static class c extends fkt {
        private static final String a = hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 43, (byte) 118, (byte) 96, (byte) 107, (byte) 97});
        private boolean b = false;
        private fnt c;

        public static c a(FragmentActivity fragmentActivity) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            c cVar = (c) supportFragmentManager.findFragmentByTag(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 43, (byte) 118, (byte) 96, (byte) 107, (byte) 97}));
            if (cVar == null) {
                cVar = new c();
                supportFragmentManager.beginTransaction().add(cVar, hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 99, (byte) 96, (byte) 96, (byte) 97, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 43, (byte) 118, (byte) 96, (byte) 107, (byte) 97})).commitAllowingStateLoss();
                supportFragmentManager.executePendingTransactions();
            }
            cVar.c = fnt.a(fragmentActivity, null, hae.a(new byte[]{(byte) -22, Byte.MIN_VALUE, (byte) -98, (byte) -26, (byte) -113, (byte) -114, (byte) -21, (byte) -73, (byte) -94, (byte) 43, (byte) 43, (byte) 43}), true, false);
            return cVar;
        }

        public void a(Context context, int i, int i2, int i3, int i4, String str, gnb<GeneralResponse<UpperCommentAddResult>> bl_gnb_com_bilibili_okretro_GeneralResponse_com_bilibili_upper_api_bean_UpperCommentAddResult) {
            a(true);
            String a = hfh.a();
            gr grVar = new gr();
            grVar.put("oid", String.valueOf(i));
            grVar.put(LogBuilder.KEY_TYPE, String.valueOf(i2));
            grVar.put("root", String.valueOf(i3));
            grVar.put(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 96, (byte) 107, (byte) 113}), String.valueOf(i4));
            grVar.put(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}), String.valueOf(str));
            grVar.put("plat", String.valueOf(2));
            hbk.a(a, grVar, bl_gnb_com_bilibili_okretro_GeneralResponse_com_bilibili_upper_api_bean_UpperCommentAddResult);
        }

        public void a(boolean z) {
            this.b = z;
        }

        public boolean a() {
            return this.b;
        }
    }

    public static Intent a(Context context, UpperComment upperComment) {
        if (upperComment == null) {
            return null;
        }
        Intent intent = new Intent(context, CommentDetailActivity.class);
        intent.putExtra(a, upperComment);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427627);
        g();
        D();
        B_().a(getString(2131695715));
        this.b = (UpperComment) getIntent().getParcelableExtra(a);
        this.c = (CircleImageView) findViewById(2131296521);
        this.n = (RelativeLayout) findViewById(2131299749);
        this.t = (FlowLayout) findViewById(2131297742);
        this.d = (TextView) findViewById(2131300892);
        this.e = (TextView) findViewById(2131300893);
        this.f = (TextView) findViewById(2131298957);
        this.g = (LinearLayout) findViewById(2131298637);
        this.i = (ImageView) findViewById(2131299557);
        this.h = (TextView) findViewById(2131299559);
        this.j = (TextView) findViewById(2131301210);
        this.k = (UpperImageSpannableTextView) findViewById(2131298809);
        this.l = (TextView) findViewById(2131299466);
        this.m = (TintTextView) findViewById(2131297983);
        this.o = (RelativeLayout) findViewById(2131299755);
        this.p = (CircleImageView) findViewById(2131296522);
        this.q = (TextView) findViewById(2131300913);
        this.r = (TextView) findViewById(2131300967);
        this.s = (TextView) findViewById(2131300840);
        this.v = (hio) findViewById(2131297048);
        this.v.setSendCallback(this);
        this.c.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.j.setOnClickListener(this);
        this.n.setOnClickListener(this);
        a(this.b);
    }

    private void a(UpperComment upperComment) {
        if (upperComment != null) {
            this.A = upperComment.id;
            this.B = upperComment.root == 0 ? upperComment.id : upperComment.root;
            this.y = upperComment.oid;
            this.z = upperComment.type;
            if (!TextUtils.isEmpty(upperComment.uface)) {
                fci.g().a(upperComment.uface, this.c);
            }
            if (upperComment.relation == 2 || upperComment.relation == 3 || upperComment.isElec != 0) {
                this.t.setVisibility(0);
                if (upperComment.relation == 2 || upperComment.relation == 3) {
                    this.d.setVisibility(0);
                } else {
                    this.d.setVisibility(8);
                }
                if (upperComment.isElec == 1) {
                    this.e.setVisibility(0);
                } else if (upperComment.isElec == 0) {
                    this.e.setVisibility(8);
                }
            } else {
                this.t.setVisibility(8);
            }
            if (!TextUtils.isEmpty(upperComment.replier)) {
                this.f.setText(upperComment.replier);
            }
            if (upperComment.isParised > 0) {
                this.i.setImageDrawable(fnd.a(this, getResources().getDrawable(2131233996), 2131100837));
                this.h.setTextColor(fnd.a(this, 2131100837));
            } else {
                this.i.setImageResource(2131233995);
                this.h.setTextColor(fnd.a(this, 2131100035));
            }
            if (upperComment.like == 0) {
                this.h.setText(getString(2131695849));
            } else {
                this.h.setText(String.valueOf(upperComment.like));
            }
            if (!TextUtils.isEmpty(upperComment.title)) {
                this.j.setText(hae.a(new byte[]{(byte) -25, (byte) -96, (byte) -117, (byte) -25, (byte) -95, (byte) -75, (byte) -23, (byte) -110, (byte) -86, (byte) -23, (byte) -75, (byte) -97, (byte) 37, (byte) 63}) + upperComment.title);
            }
            if (!TextUtils.isEmpty(upperComment.message)) {
                this.k.setText(upperComment.message);
            }
            if (!TextUtils.isEmpty(upperComment.ctime)) {
                this.l.setText(upperComment.ctime);
            }
            if (upperComment.state == 1) {
                this.m.setVisibility(0);
            } else {
                this.m.setVisibility(8);
            }
            UpperCommentParentInfo upperCommentParentInfo = upperComment.parentInfo;
            if (upperCommentParentInfo != null) {
                MemberEntity memberEntity = upperCommentParentInfo.member;
                ContentEntity contentEntity = upperCommentParentInfo.content;
                if (memberEntity != null) {
                    this.o.setVisibility(0);
                    if (!TextUtils.isEmpty(memberEntity.avatar)) {
                        fci.g().a(memberEntity.avatar, this.p);
                    }
                    if (!TextUtils.isEmpty(memberEntity.uname)) {
                        this.q.setText(memberEntity.uname);
                    }
                    if (!TextUtils.isEmpty(upperCommentParentInfo.ctime)) {
                        this.r.setText(hfy.a(upperCommentParentInfo.ctime));
                    }
                    if (contentEntity != null) {
                        if (!TextUtils.isEmpty(contentEntity.message)) {
                            this.s.setText(contentEntity.message);
                        }
                        this.o.setOnClickListener(new OnClickListener(this) {
                            final /* synthetic */ CommentDetailActivity a;

                            {
                                this.a = r1;
                            }

                            public void onClick(View view) {
                                this.a.j();
                                this.a.v.h();
                            }
                        });
                        j();
                        return;
                    }
                    return;
                }
                this.o.setVisibility(8);
            }
        }
    }

    private void j() {
        if (this.v != null) {
            Editable text = this.v.getText();
            a b = b(text);
            if (b != null) {
                text.delete(text.getSpanStart(b), text.getSpanEnd(b));
            }
            if (this.b != null) {
                Object string = getString(2131695808, new Object[]{this.b.replier});
                text.insert(0, string);
                text.setSpan(new a(this), 0, string.length(), 33);
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        Context context = view.getContext();
        if (id == 2131298637) {
            b(context, this.b);
        } else if (id == 2131296521 || id == 2131298957) {
            hfh.a(context, this.b.mid, this.b.replier);
        } else if (id == 2131301210) {
            if (this.z == Integer.parseInt(Constants.VIA_TO_TYPE_QQ_GROUP)) {
                hfh.a(context, this.b.oid);
            } else if (this.z == Integer.parseInt(Constants.VIA_REPORT_TYPE_SET_AVATAR)) {
                hfh.a(context, (long) this.b.oid);
            }
        } else if (id == 2131299749) {
            j();
            this.v.h();
        }
    }

    private void b(final Context context, final UpperComment upperComment) {
        hbk.a(hfh.a(), upperComment.oid, upperComment.type, upperComment.id, 1, new gnb<GeneralResponse<Void>>(this) {
            final /* synthetic */ CommentDetailActivity c;

            public void a(GeneralResponse<Void> generalResponse) {
                if (generalResponse.isSuccess()) {
                    int a = fnd.a(context, 2131100837);
                    TextView c = this.c.h;
                    UpperComment upperComment = upperComment;
                    int i = upperComment.like + 1;
                    upperComment.like = i;
                    c.setText(hfx.a(i, this.c.getString(2131695849)));
                    this.c.h.setTextColor(a);
                    this.c.i.setImageDrawable(fnd.a(context, context.getResources().getDrawable(2131233996), 2131100837));
                    upperComment.isParised = 1;
                    return;
                }
                esu.b(context, generalResponse.message);
            }

            public void a(Throwable th) {
                esu.b(context, th.getMessage());
            }
        });
    }

    public void a(Editable editable) {
        a b = b(editable);
        int i = 0;
        if (b != null) {
            i = editable.getSpanEnd(b);
        }
        if (a(editable, i)) {
            this.w = editable.toString().trim();
            if (TextUtils.isEmpty(this.w)) {
                esu.b(getApplicationContext(), getString(2131695805));
            } else {
                a(this.w);
            }
        }
    }

    private void a(String str) {
        if (this.x == null) {
            this.x = c.a((FragmentActivity) this);
        }
        if (!this.x.a() && this.y > 0) {
            this.x.a(this, this.y, this.z, this.B, this.A, str, new b(this, str));
        }
    }

    static a b(Editable editable) {
        a[] aVarArr = (a[]) editable.getSpans(0, editable.length(), a.class);
        if (aVarArr.length > 0) {
            return aVarArr[0];
        }
        return null;
    }

    private boolean a(@NonNull Editable editable, int i) {
        if (editable.length() == 0) {
            esu.b(getApplicationContext(), getString(2131695805));
            return false;
        } else if (editable.length() - i < 1000 && editable.length() - i >= 3) {
            return true;
        } else {
            esu.b(getApplicationContext(), getString(2131695806));
            return false;
        }
    }
}
