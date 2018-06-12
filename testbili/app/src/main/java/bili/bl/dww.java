package bili.bl;

import android.content.Context;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveMedal;
import com.bilibili.magicasakura.widgets.TintCheckBox;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class dww extends android.support.v7.widget.RecyclerView.a<u> {
    boolean a = false;
    private final int b = 1;
    private List<BiliLiveMedal> c = new ArrayList();
    private int d;
    private int e;
    private int f;
    private c g;
    private List<BiliLiveMedal> h = new ArrayList();

    /* compiled from: BL */
    public class a extends u {
        final /* synthetic */ dww n;

        public a(dww bl_dww, View view) {
            this.n = bl_dww;
            super(view);
        }
    }

    /* compiled from: BL */
    class b extends u {
        TextView n;
        TextView o;
        TextView p;
        TextView q;
        TextView r;
        ImageView s;
        TintCheckBox t;
        final /* synthetic */ dww u;

        public b(dww bl_dww, View view) {
            this.u = bl_dww;
            super(view);
            this.n = (TextView) view.findViewById(2131296275);
            this.o = (TextView) view.findViewById(2131296276);
            this.p = (TextView) view.findViewById(2131296277);
            this.q = (TextView) view.findViewById(2131296278);
            this.t = (TintCheckBox) view.findViewById(2131296926);
            this.r = (TextView) view.findViewById(2131297967);
            this.s = (ImageView) view.findViewById(2131298124);
        }

        public void a(final BiliLiveMedal biliLiveMedal, boolean z, int i, int i2, int i3, int i4) {
            int i5 = 8;
            int i6 = 0;
            if (biliLiveMedal != null) {
                int i7;
                dxi.a(this.n, biliLiveMedal.mColor, biliLiveMedal.mMedalName, biliLiveMedal.mLevel, ecc.e, ecc.f);
                this.o.setText(biliLiveMedal.mUname);
                this.p.setText(String.format(hae.a(new byte[]{(byte) 32, (byte) 118, (byte) 42, (byte) 32, (byte) 118}), new Object[]{com.a(biliLiveMedal.mIntimacy, "0"), com.a(biliLiveMedal.mNextIntimacy, "0")}));
                this.q.setText(biliLiveMedal.mStatus == 1 ? 2131690542 : 2131696157);
                this.q.setBackgroundResource(biliLiveMedal.mStatus == 1 ? 2131231033 : 2131231034);
                TextView textView = this.q;
                if (biliLiveMedal.mStatus != 1) {
                    i4 = i3;
                }
                textView.setTextColor(i4);
                this.q.setTag(biliLiveMedal);
                this.t.setTag(Integer.valueOf(i));
                TextView textView2 = this.q;
                if (z) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                textView2.setVisibility(i7);
                TintCheckBox tintCheckBox = this.t;
                if (z) {
                    i7 = 0;
                } else {
                    i7 = 8;
                }
                tintCheckBox.setVisibility(i7);
                this.t.setChecked(biliLiveMedal.mIsChecked);
                this.q.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ b a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.u.g.a(view);
                    }
                });
                this.t.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        biliLiveMedal.mIsChecked = !biliLiveMedal.mIsChecked;
                        if (biliLiveMedal.mIsChecked) {
                            this.b.u.h.add(biliLiveMedal);
                        } else {
                            this.b.u.h.remove(biliLiveMedal);
                        }
                        this.b.u.g.b(view);
                    }
                });
                boolean isEmpty = TextUtils.isEmpty(biliLiveMedal.mBuffMsg);
                textView = this.p;
                if (!isEmpty) {
                    i2 = i3;
                }
                textView.setTextColor(i2);
                this.r.setText(isEmpty ? BuildConfig.VERSION_NAME : biliLiveMedal.mBuffMsg);
                textView = this.r;
                if (!isEmpty) {
                    i5 = 0;
                }
                textView.setVisibility(i5);
                ImageView imageView = this.s;
                if (isEmpty) {
                    i6 = 4;
                }
                imageView.setVisibility(i6);
            }
        }
    }

    /* compiled from: BL */
    public interface c {
        void a(View view);

        void b(View view);
    }

    public dww(Context context) {
        this.d = context.getResources().getColor(2131100013);
        this.f = context.getResources().getColor(2131100784);
        this.e = fnd.a(context, 2131100837);
    }

    public u b(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131428053, viewGroup, false));
        }
        return new b(this, LayoutInflater.from(viewGroup.getContext()).inflate(2131428347, viewGroup, false));
    }

    public int a() {
        if (this.c == null || this.c.size() == 0) {
            return 0;
        }
        return this.c.size() + 1;
    }

    public int b(int i) {
        if (i == this.c.size()) {
            return 1;
        }
        return super.b(i);
    }

    public void a(u uVar, int i) {
        if (uVar instanceof b) {
            ((b) uVar).a(c(i), this.a, i, this.d, this.e, this.f);
        }
    }

    public BiliLiveMedal c(int i) {
        return (BiliLiveMedal) this.c.get(i);
    }

    public void a(List<BiliLiveMedal> list) {
        if (list != null) {
            this.c.clear();
            this.c.addAll(list);
            f();
        }
    }

    public void b() {
        this.a = true;
        f();
    }

    public void c() {
        this.a = false;
        for (BiliLiveMedal biliLiveMedal : this.c) {
            biliLiveMedal.mIsChecked = false;
        }
        this.h.clear();
        f();
    }

    public void g() {
        this.c.removeAll(this.h);
        c();
    }

    public void a(BiliLiveMedal biliLiveMedal) {
        for (BiliLiveMedal biliLiveMedal2 : this.c) {
            if (biliLiveMedal2.mId != biliLiveMedal.mId && biliLiveMedal2.mStatus == 1) {
                biliLiveMedal2.mStatus = 0;
                break;
            }
        }
        biliLiveMedal.mStatus = 1;
        f();
    }

    public void b(BiliLiveMedal biliLiveMedal) {
        biliLiveMedal.mStatus = 0;
        f();
    }

    public void a(boolean z) {
        for (BiliLiveMedal biliLiveMedal : this.c) {
            biliLiveMedal.mIsChecked = z;
        }
        f();
        if (z) {
            this.h.clear();
            this.h.addAll(this.c);
            return;
        }
        this.h.clear();
    }

    public boolean h() {
        return this.h.size() == this.c.size();
    }

    public int i() {
        return this.h.size();
    }

    public String j() {
        if (this.h == null || this.h.size() == 0) {
            return BuildConfig.VERSION_NAME;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (BiliLiveMedal biliLiveMedal : this.h) {
            stringBuilder.append(biliLiveMedal.mId).append(",");
        }
        return stringBuilder.substring(0, stringBuilder.length() - 1);
    }

    public void a(c cVar) {
        this.g = cVar;
    }
}
