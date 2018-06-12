package bili.bl;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.bilibili.comm.charge.api.ChargeRankItem;
import com.bilibili.comm.charge.api.ChargeRankResult;
import com.bilibili.lib.account.model.VipExtraUserInfo;
import com.bilibili.lib.ui.CircleImageView;
import com.bilibili.lib.ui.StubSingleFragmentWithToolbarActivity;
import com.facebook.drawee.generic.RoundingParams;
import java.util.List;

/* compiled from: BL */
public class ere extends fkv {
    long a;
    a b;
    View c;

    /* compiled from: BL */
    public static class a extends android.support.v7.widget.RecyclerView.a<b> {
        ChargeRankItem a;
        protected List<ChargeRankItem> b;
        Context c;

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public a(Context context) {
            this.c = context;
        }

        public void a(ChargeRankResult chargeRankResult) {
            this.b = chargeRankResult.rankList;
            this.a = chargeRankResult.mine;
            if (this.a != null && this.a.rankOrder > this.b.size()) {
                this.b.add(c());
            }
        }

        public b a(ViewGroup viewGroup, int i) {
            return b.a(viewGroup, 2131428369);
        }

        public void a(b bVar, int i) {
            ChargeRankItem chargeRankItem = (ChargeRankItem) this.b.get(i);
            bVar.r = chargeRankItem;
            if (chargeRankItem != null) {
                Context context = bVar.a.getContext();
                context.getResources();
                int i2 = chargeRankItem.rankOrder;
                if (!TextUtils.isEmpty(chargeRankItem.avatar)) {
                    float applyDimension;
                    float applyDimension2;
                    int color;
                    bVar.o.setImageURI(Uri.parse(chargeRankItem.avatar));
                    hsd bl_hsd = (hsd) bVar.o.getHierarchy();
                    RoundingParams c = bl_hsd == null ? null : bl_hsd.c();
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    bVar.n.setTextColor(context.getResources().getColor(2131100035));
                    if (i2 == 1) {
                        applyDimension = TypedValue.applyDimension(1, 42.0f, displayMetrics);
                        applyDimension2 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
                        color = context.getResources().getColor(2131101068);
                        bVar.n.setTextColor(color);
                    } else if (i2 == 2) {
                        applyDimension = TypedValue.applyDimension(1, 42.0f, displayMetrics);
                        applyDimension2 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
                        color = context.getResources().getColor(2131100078);
                        bVar.n.setTextColor(color);
                    } else if (i2 == 3) {
                        applyDimension = TypedValue.applyDimension(1, 42.0f, displayMetrics);
                        applyDimension2 = TypedValue.applyDimension(1, 2.0f, displayMetrics);
                        color = context.getResources().getColor(2131099777);
                        bVar.n.setTextColor(color);
                    } else {
                        applyDimension = TypedValue.applyDimension(1, 34.0f, displayMetrics);
                        applyDimension2 = TypedValue.applyDimension(1, 0.7f, displayMetrics);
                        color = context.getResources().getColor(2131100048);
                    }
                    if (c != null) {
                        c.a(color, applyDimension2);
                    }
                    LayoutParams layoutParams = bVar.o.getLayoutParams();
                    int i3 = (int) applyDimension;
                    layoutParams.height = i3;
                    layoutParams.width = i3;
                    bVar.o.requestLayout();
                }
                bVar.q.setVisibility(8);
                bVar.n.setText(String.valueOf(i2));
                bVar.p.setText(chargeRankItem.name);
                bVar.a.setBackgroundDrawable(null);
                if (a(chargeRankItem)) {
                    int a = fnd.a(context, 2131100837);
                    bVar.p.setTextColor(a);
                    bVar.n.setTextColor(a);
                    bVar.p.setText(chargeRankItem.name + "\uff08\u6211\uff09");
                } else {
                    bVar.p.setTextColor(fnd.c(context, 16842806));
                }
                if (erh.a(chargeRankItem.vipInfo)) {
                    bVar.p.setTypeface(erh.a());
                    bVar.p.setTextColor(erh.a(bVar.a.getContext()));
                    return;
                }
                bVar.p.setTypeface(Typeface.DEFAULT);
            }
        }

        public int a() {
            return this.b == null ? 0 : this.b.size();
        }

        private boolean a(ChargeRankItem chargeRankItem) {
            evf b = b();
            if (b == null || b.a != chargeRankItem.payMid) {
                return false;
            }
            return true;
        }

        private evf b() {
            return eva.a(this.c).c();
        }

        private ChargeRankItem c() {
            ChargeRankItem chargeRankItem = new ChargeRankItem();
            chargeRankItem.rankOrder = this.a.rankOrder;
            chargeRankItem.mid = this.a.mid;
            chargeRankItem.payMid = this.a.payMid;
            evf b = b();
            if (b != null) {
                chargeRankItem.avatar = b.c;
                chargeRankItem.name = b.b;
                chargeRankItem.payMid = b.a;
                evj bl_evj = b.s;
                if (bl_evj != null) {
                    VipExtraUserInfo vipExtraUserInfo = new VipExtraUserInfo();
                    vipExtraUserInfo.a = bl_evj.a;
                    vipExtraUserInfo.b = bl_evj.b;
                    vipExtraUserInfo.c = bl_evj.d;
                    chargeRankItem.vipInfo = vipExtraUserInfo;
                }
            }
            return chargeRankItem;
        }
    }

    /* compiled from: BL */
    public static class b extends u implements OnClickListener {
        public TextView n;
        public CircleImageView o;
        public TextView p;
        public TextView q;
        ChargeRankItem r;

        public b(View view) {
            super(view);
            this.n = (TextView) view.findViewById(2131299536);
            this.o = (CircleImageView) view.findViewById(2131296504);
            this.p = (TextView) view.findViewById(2131298903);
            this.q = (TextView) view.findViewById(2131298809);
            view.setOnClickListener(this);
        }

        public static b a(ViewGroup viewGroup, int i) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
        }

        public void onClick(View view) {
            if (this.r != null && eva.a(view.getContext()).i() != this.r.payMid && this.r.payMid > 0) {
                erm.a(view.getContext(), this.r.payMid, this.r.name);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.a = getArguments().getLong("mid");
        this.b = new a(getActivity());
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.a(recyclerView, bundle);
        LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.d(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new mec(this, recyclerView.getContext()) {
            final /* synthetic */ ere a;

            protected boolean a(u uVar) {
                return uVar.a != this.a.c;
            }
        });
        this.c = LayoutInflater.from(getActivity()).inflate(2131428097, recyclerView, false);
        men bl_men = new men(this.b);
        bl_men.b(this.c);
        recyclerView.setAdapter(bl_men);
        this.c.setVisibility(8);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getActivity().setTitle(hae.a(new byte[]{(byte) -22, (byte) -118, (byte) -118, (byte) -24, (byte) -101, (byte) -70, (byte) -23, (byte) -127, (byte) -99, (byte) -25, (byte) -82, (byte) -125, (byte) -23, (byte) -87, (byte) -109}));
        n();
        eqr.a(eva.a(getApplicationContext()).i(), this.a, new gnc<ChargeRankResult>(this) {
            final /* synthetic */ ere a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(Object obj) {
                a((ChargeRankResult) obj);
            }

            public boolean a() {
                return this.a.getActivity() == null;
            }

            public void a(Throwable th) {
                this.a.p();
            }

            public void a(ChargeRankResult chargeRankResult) {
                this.a.o();
                if (chargeRankResult.rankList == null || chargeRankResult.rankList.isEmpty()) {
                    this.a.c.setVisibility(0);
                    this.a.c.findViewById(2131298656).setVisibility(8);
                    ((TextView) this.a.c.findViewById(2131300554)).setText(2131690609);
                    return;
                }
                this.a.c.setVisibility(8);
                this.a.b.a(chargeRankResult);
                this.a.b.f();
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        this.b.c = null;
        this.b = null;
    }

    public static Intent a(Context context, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("mid", j);
        return StubSingleFragmentWithToolbarActivity.a(context, ere.class, bundle);
    }
}
