package bili3.bl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.TextView;
import bl.mix.c;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.api.BiliApiException;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.SortedMap;
import tv.danmaku.biliplayer.api.BaseMsgApiResponse;
import tv.danmaku.biliplayer.event.DemandPlayerEvent.DemandPopupWindows;
import tv.danmaku.biliplayer.features.danmaku.view.expandable.VerticalExpandableView;
import tv.danmaku.biliplayer.features.toast.PlayerToast;
import tv.danmaku.videoplayer.basic.context.PlayerParams;
import tv.danmaku.videoplayer.core.danmaku.IDanmakuParams;
import tv.danmaku.videoplayer.core.danmaku.IDanmakuPlayer.DanmakuOptionName;

/* compiled from: BL */
public class mis extends tv.danmaku.biliplayer.features.danmaku.view.SectionNestedScrollView.a implements OnClickListener, c, a {
    private static final String c = hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 107, (byte) 96, (byte) 105, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 103, (byte) 124, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96});
    private static int d;
    private static int e;
    public c a = new c(this) {
        final /* synthetic */ mis a;

        {
            this.a = r1;
        }

        public void a(int i) {
            this.a.b(i);
        }
    };
    private Context f;
    private mht g;
    private ViewGroup h;
    private VerticalExpandableView i;
    private TextView j;
    private View k;
    private TextView l;
    private TextView m;
    private TextView n;
    private ImageView o;
    private View p;
    private RecyclerView q;
    private View r;
    private mim s;
    private miw t;
    private miv u;
    private a v;
    private int w = 0;
    private List<mvs> x;
    private mfd y;
    private gx<mew<BaseMsgApiResponse>> z;

    /* compiled from: BL */
    class a extends gnc<String> {
        final /* synthetic */ mis a;

        private a(mis bl_mis) {
            this.a = bl_mis;
        }

        public /* synthetic */ void b(Object obj) {
            a((String) obj);
        }

        public boolean a() {
            return this.a.f == null || this.a.s == null;
        }

        public void a(String str) {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = (JSONObject) JSONObject.a(str);
                for (mvs bl_mvs : this.a.x) {
                    Object obj = jSONObject.get(bl_mvs.u);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        boolean z = jSONObject2.g(hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 105, (byte) 108, (byte) 110, (byte) 96})).intValue() == 1;
                        int intValue = jSONObject2.g(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 110, (byte) 96, (byte) 118})).intValue();
                        if (intValue < 0) {
                            intValue = -1;
                        }
                        bl_mvs.F = intValue;
                        bl_mvs.E = z;
                    } else {
                        return;
                    }
                }
                if (this.a.s != null) {
                    this.a.s.f();
                }
            }
        }

        public void a(Throwable th) {
        }
    }

    /* compiled from: BL */
    class b extends gnc<Void> {
        mvs a;
        final /* synthetic */ mis b;

        private b(mis bl_mis) {
            this.b = bl_mis;
        }

        public /* synthetic */ void b(Object obj) {
            a((Void) obj);
        }

        public boolean a() {
            return this.b.f == null || this.b.s == null || this.b.y == null;
        }

        public void a(Throwable th) {
            if (th instanceof BiliApiException) {
                mny.c(this.b.y, ((BiliApiException) th).getMessage());
                return;
            }
            mny.b(this.b.y, 2131694225);
        }

        public void a(Void voidR) {
            if (this.a == null) {
                mny.b(this.b.y, 2131694225);
                return;
            }
            this.a.E = !this.a.E;
            mvs bl_mvs;
            if (this.a.E) {
                bl_mvs = this.a;
                bl_mvs.F++;
            } else {
                bl_mvs = this.a;
                bl_mvs.F--;
            }
            int indexOf = this.b.x.indexOf(this.a);
            if (indexOf >= 0) {
                this.b.s.d(indexOf);
            }
        }
    }

    public mis(Context context, mht bl_mht, mfd bl_mfd) {
        this.f = context;
        this.g = bl_mht;
        this.y = bl_mfd;
        this.v = new a();
    }

    public View a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        final View inflate = LayoutInflater.from(context).inflate(2131428455, viewGroup, false);
        this.i = (VerticalExpandableView) inflate.findViewById(2131299635);
        this.o = (ImageView) this.i.findViewById(2131300474);
        this.n = (TextView) this.i.findViewById(2131297249);
        this.j = (TextView) this.i.findViewById(2131296641);
        this.k = this.i.findViewById(2131296640);
        this.l = (TextView) this.i.findViewById(2131297247);
        this.m = (TextView) this.i.findViewById(2131297248);
        this.j.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.q = (RecyclerView) inflate.findViewById(2131299628);
        this.r = inflate.findViewById(2131297527);
        final int c = esx.c(context);
        this.i.b();
        this.p = inflate.findViewById(2131299632);
        d = inflate.getResources().getColor(2131100035);
        e = inflate.getResources().getColor(2131100457);
        this.i.setOnSizeChangedListener(new tv.danmaku.biliplayer.features.danmaku.view.expandable.VerticalExpandableView.a(this) {
            final /* synthetic */ mis c;

            public void a(VerticalExpandableView verticalExpandableView, int i, int i2, int i3, int i4) {
                if (verticalExpandableView.d()) {
                    this.c.j.setText(2131691610);
                    this.c.j.setTextColor(mis.e);
                } else {
                    this.c.j.setText(2131693258);
                    this.c.j.setTextColor(mis.d);
                }
                LayoutParams layoutParams = this.c.p.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LayoutParams(-2, -2);
                }
                layoutParams.height = ((((c - i2) - verticalExpandableView.getPaddingTop()) - verticalExpandableView.getPaddingBottom()) - inflate.getPaddingTop()) - inflate.getPaddingBottom();
                this.c.p.setLayoutParams(layoutParams);
                this.c.p.post(new Runnable(this) {
                    final /* synthetic */ AnonymousClass2 a;

                    {
                        this.a = r1;
                    }

                    public void run() {
                        this.a.c.p.requestLayout();
                    }
                });
            }
        });
        this.h = (ViewGroup) inflate;
        return inflate;
    }

    public void a(View view, int i) {
    }

    public void a(int i) {
        boolean z = true;
        boolean z2 = i == 1;
        if (this.k != null) {
            View view = this.k;
            if (!(this.b && z2)) {
                z = false;
            }
            view.setEnabled(z);
        }
        msr p = p();
        if (p != null) {
            p.b(this.f, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 107, (byte) 96, (byte) 105, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 103, (byte) 124, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}), Integer.valueOf(i));
        }
    }

    public int c() {
        msr p = p();
        if (p != null) {
            return p.a(this.f, hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 117, (byte) 100, (byte) 107, (byte) 96, (byte) 105, (byte) 90, (byte) 103, (byte) 105, (byte) 106, (byte) 102, (byte) 110, (byte) 90, (byte) 103, (byte) 124, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}), Integer.valueOf(1)).intValue();
        }
        return 1;
    }

    public void a() {
        super.a();
        if (this.p != null) {
            this.p.setVisibility(8);
        }
        if (this.j != null) {
            this.j.setVisibility(8);
        }
        if (this.i != null && this.i.d()) {
            this.i.b();
        }
    }

    public void b() {
        super.b();
        if (this.p != null) {
            this.p.setVisibility(0);
        }
        if (this.j != null) {
            this.j.setVisibility(0);
        }
    }

    public boolean a(List<mvs> list, int i, boolean z) {
        int i2 = 3;
        int i3 = 2;
        int i4 = -1;
        boolean z2 = false;
        if (!eva.a(this.f).a()) {
            a(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 73, (byte) 106, (byte) 98, (byte) 108, (byte) 107}), Integer.valueOf(2337));
            return false;
        } else if (this.s == null) {
            return false;
        } else {
            if (list != null && !list.isEmpty() && i >= 0 && i < list.size()) {
                mvs bl_mvs = (mvs) list.get(i);
                this.i.a();
                int i5;
                Drawable drawable;
                TextView textView;
                if (this.w == 0) {
                    if (z && mhp.b(bl_mvs)) {
                        this.l.setText(2131689729);
                    } else {
                        this.l.setText(2131689659);
                    }
                    Drawable drawable2 = this.l.getCompoundDrawables()[1];
                    if (z) {
                        i5 = 2;
                    } else {
                        i5 = 0;
                    }
                    drawable2.setLevel(i5);
                    this.l.setTextColor(z ? -1 : d);
                    drawable = this.m.getCompoundDrawables()[1];
                    if (!z) {
                        i3 = 0;
                    }
                    drawable.setLevel(i3);
                    textView = this.m;
                    if (!z) {
                        i4 = d;
                    }
                    textView.setTextColor(i4);
                } else {
                    List c = this.s.c();
                    int b = mhp.b(c);
                    i3 = c.size();
                    boolean z3;
                    if (z) {
                        if (b == i3 && mhp.e(bl_mvs)) {
                            i5 = 1;
                        } else {
                            z3 = false;
                        }
                    } else if (i3 > 1) {
                        b = i3 - b;
                        if (b <= 0 || (b == 1 && !mhp.e(bl_mvs))) {
                            i5 = 1;
                        } else {
                            z3 = false;
                        }
                    } else {
                        z3 = false;
                    }
                    if (i5 != 0) {
                        this.m.setText(2131695648);
                    } else {
                        this.m.setText(2131695646);
                    }
                    if (z || i3 > 1) {
                        z2 = true;
                    }
                    Drawable drawable3 = this.l.getCompoundDrawables()[1];
                    if (z2) {
                        i5 = 3;
                    } else {
                        i5 = 1;
                    }
                    drawable3.setLevel(i5);
                    drawable = this.m.getCompoundDrawables()[1];
                    if (!z2) {
                        i2 = 1;
                    }
                    drawable.setLevel(i2);
                    this.l.setTextColor(z2 ? -1 : d);
                    textView = this.m;
                    if (!z2) {
                        i4 = d;
                    }
                    textView.setTextColor(i4);
                }
            }
            return true;
        }
    }

    private void b(mvs bl_mvs) {
        this.t.a(bl_mvs);
    }

    private void c(mvs bl_mvs) {
        this.t.b(bl_mvs);
    }

    public void a(final mvs bl_mvs) {
        if (!TextUtils.isEmpty(bl_mvs.u)) {
            mew anonymousClass3 = new mew<BaseMsgApiResponse>(this) {
                final /* synthetic */ mis b;

                public boolean a() {
                    return this.b.f == null;
                }

                public void a(Throwable th) {
                    if (th instanceof BiliApiException) {
                        this.b.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 81, (byte) 106, (byte) 100, (byte) 118, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114}), PlayerToast.obtain(th.getMessage()));
                    }
                }

                public void b(BaseMsgApiResponse baseMsgApiResponse) {
                    this.b.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 81, (byte) 106, (byte) 100, (byte) 118, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114}), PlayerToast.obtain(baseMsgApiResponse.message));
                    this.b.x.remove(bl_mvs);
                    if (!(this.b.j() || this.b.s == null)) {
                        this.b.s.f();
                    }
                    this.b.d(bl_mvs);
                }
            };
            if (bl_mvs.u.startsWith(hae.a(new byte[]{(byte) 99, (byte) 100, (byte) 110, (byte) 96, (byte) 40}))) {
                h();
                this.z.b(bl_mvs.y, anonymousClass3);
                return;
            }
            this.t.a(bl_mvs, anonymousClass3);
        }
    }

    public void a(View view, mvs bl_mvs) {
        if (eva.a(view.getContext()).a()) {
            long currentTimeMillis = System.currentTimeMillis();
            Object tag = view.getTag(2131296975);
            long longValue = tag instanceof Long ? ((Long) tag).longValue() : 0;
            if (o() != null && currentTimeMillis - longValue > 300) {
                if (bl_mvs.E) {
                    this.g.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 112, (byte) 105, (byte) 105, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 64, (byte) 124, (byte) 96, (byte) 118, (byte) 83, (byte) 55}), hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 51}), hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 105, (byte) 108, (byte) 110, (byte) 96, (byte) 90, (byte) 102, (byte) 100, (byte) 107, (byte) 102, (byte) 96, (byte) 105}), hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), bl_mvs.u, "[" + bl_mvs.D + "]");
                } else {
                    this.g.a(hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 118, (byte) 96, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 112, (byte) 105, (byte) 105, (byte) 76, (byte) 107, (byte) 99, (byte) 106, (byte) 64, (byte) 124, (byte) 96, (byte) 118, (byte) 83, (byte) 55}), hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 51}), hae.a(new byte[]{(byte) 115, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 90, (byte) 105, (byte) 108, (byte) 110, (byte) 96}), hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), bl_mvs.u, "[" + bl_mvs.D + "]");
                }
                String str = bl_mvs.E ? Constants.VIA_SSO_LOGIN : Constants.VIA_TO_TYPE_QQ_GROUP;
                b bVar = new b();
                bVar.a = bl_mvs;
                mhn.a(this.f, o().i(), bl_mvs.u, str, bVar);
                view.setTag(2131296975, Long.valueOf(currentTimeMillis));
                return;
            }
            return;
        }
        a(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 87, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 73, (byte) 106, (byte) 98, (byte) 108, (byte) 107}), Integer.valueOf(2337));
    }

    private void d(mvs bl_mvs) {
        mvb q = q();
        if (q != null && bl_mvs != null) {
            q.a(DanmakuOptionName.BLOCK_DANMAKU_ON_SCREEN, bl_mvs);
            bl_mvs.G.putBoolean(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 102, (byte) 100, (byte) 105, (byte) 105, (byte) 96, (byte) 97}), true);
        }
    }

    private void h() {
        if (this.z == null) {
            this.z = new gx();
        }
    }

    public void b(final int i) {
        if (this.s != null) {
            this.q.post(new Runnable(this) {
                final /* synthetic */ mis b;

                public void run() {
                    this.b.s.c(i);
                    this.b.s.f();
                }
            });
        }
    }

    public void onClick(View view) {
        if (view == this.j) {
            this.i.c();
            if (this.s != null) {
                this.s.b();
                this.s.f();
            }
            if (this.w == 1) {
                this.l.getCompoundDrawables()[1].setLevel(1);
                this.m.getCompoundDrawables()[1].setLevel(1);
            } else {
                this.l.getCompoundDrawables()[1].setLevel(0);
                this.m.getCompoundDrawables()[1].setLevel(0);
            }
            this.l.setTextColor(d);
            this.m.setTextColor(d);
        } else if (view == this.l) {
            List c = this.s.c();
            if (c != null && !c.isEmpty()) {
                if (c.get(0) == null || !mhp.a(this.l.getContext(), (mvs) c.get(0))) {
                    if (this.w == 0) {
                        j(c);
                        this.l.getCompoundDrawables()[1].setLevel(0);
                        this.m.getCompoundDrawables()[1].setLevel(0);
                    } else {
                        g(c);
                        this.l.getCompoundDrawables()[1].setLevel(1);
                        this.m.getCompoundDrawables()[1].setLevel(1);
                    }
                    this.l.setTextColor(d);
                    this.m.setTextColor(d);
                    return;
                }
                mny.c(this.y, this.l.getContext().getString(2131690508));
            }
        } else if (view == this.m) {
            List c2 = this.s.c();
            if (c2 != null && !c2.isEmpty()) {
                if (this.w == 0) {
                    i(c2);
                    this.l.getCompoundDrawables()[1].setLevel(0);
                    this.m.getCompoundDrawables()[1].setLevel(0);
                } else {
                    h(c2);
                    this.l.getCompoundDrawables()[1].setLevel(1);
                    this.m.getCompoundDrawables()[1].setLevel(1);
                }
                this.l.setTextColor(d);
                this.m.setTextColor(d);
            }
        } else if (view == this.o) {
            d(this.w == 0 ? 1 : 0);
        }
    }

    public void a(List<mvs> list) {
        if (this.s != null) {
            if (!(this.x == null || list == null)) {
                this.x.removeAll(list);
            }
            if (!j()) {
                this.s.f();
            }
        }
    }

    public void b(List<mvs> list) {
        if (this.x != null && !this.x.isEmpty() && list != null && !list.isEmpty()) {
            for (mvs bl_mvs : list) {
                for (mvs bl_mvs2 : this.x) {
                    if (TextUtils.equals(bl_mvs.v, bl_mvs2.v)) {
                        mhp.a(bl_mvs2, 3);
                    }
                }
            }
            if (this.s != null) {
                this.s.f();
            }
        }
    }

    public void c(List<mvs> list) {
        if (this.x != null && !this.x.isEmpty() && list != null && !list.isEmpty()) {
            for (mvs bl_mvs : list) {
                for (mvs bl_mvs2 : this.x) {
                    if (TextUtils.equals(bl_mvs.v, bl_mvs2.v)) {
                        mhp.a(bl_mvs2, 0);
                    }
                }
            }
            if (this.s != null) {
                this.s.f();
            }
        }
    }

    public void d(List<String> list) {
        if (this.x != null && !this.x.isEmpty() && list != null && !list.isEmpty()) {
            for (String str : list) {
                for (mvs bl_mvs : this.x) {
                    if (TextUtils.equals(str, bl_mvs.v)) {
                        mhp.a(bl_mvs, 3);
                    }
                }
            }
            if (this.s != null) {
                this.s.f();
            }
        }
    }

    public void a(boolean z, boolean z2) {
        if (this.j != null) {
            this.j.setVisibility(z ? 0 : 8);
        }
        if (this.i == null) {
            return;
        }
        if (z2) {
            this.i.a();
        } else {
            this.i.b();
        }
    }

    public void c(final int i) {
        if (this.h != null) {
            final View view = this.h;
            view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                final /* synthetic */ mis c;

                public void onGlobalLayout() {
                    view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    LayoutParams layoutParams = this.c.h.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new MarginLayoutParams(-1, i);
                    }
                    layoutParams.height = i;
                    view.setLayoutParams(layoutParams);
                }
            });
        }
    }

    public void bw_() {
        e(null);
    }

    public void e(List<mvs> list) {
        f((List) list);
    }

    public void e() {
        if (this.t != null) {
            this.t.a();
        }
        if (this.u != null) {
            this.u.b();
        }
    }

    private void f(List<mvs> list) {
        int i = 8;
        PlayerParams o = o();
        if (o != null) {
            boolean a = mhp.a(this.f, o);
            this.n.setVisibility(a ? 0 : 8);
            ImageView imageView = this.o;
            if (a) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (this.t == null) {
                this.t = new miw(this.f, this.g);
            }
            if (this.u == null) {
                this.u = new miv(this.f, this.g);
            }
            if (a) {
                this.u.a((a) this);
                this.u.a();
            }
            if (list != null) {
                this.x = list;
            } else {
                l();
            }
            this.l.getCompoundDrawables()[1].setLevel(0);
            this.l.setTextColor(d);
            this.m.getCompoundDrawables()[1].setLevel(0);
            this.m.setTextColor(d);
            j();
            a(o.i(), this.x, this.v);
            this.q.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {
                final /* synthetic */ mis a;

                {
                    this.a = r1;
                }

                public void onGlobalLayout() {
                    this.a.q.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    this.a.i();
                }
            });
        }
    }

    private void i() {
        if (this.s == null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f);
            this.s = new mim(this.x, o());
            this.q.setLayoutManager(linearLayoutManager);
            this.q.setAdapter(this.s);
            this.q.setOverScrollMode(2);
        } else {
            this.s.a(this.x);
        }
        this.s.a((c) this);
    }

    private boolean j() {
        if (this.x.isEmpty()) {
            this.r.setVisibility(0);
            this.q.setVisibility(8);
            return true;
        }
        this.r.setVisibility(8);
        this.q.setVisibility(0);
        return false;
    }

    private void d(int i) {
        boolean z = true;
        if (i == 1) {
            if (k()) {
                this.n.setText(2131695645);
            } else {
                this.n.setText(2131692160);
            }
            this.o.getDrawable().setLevel(1);
            this.l.getCompoundDrawables()[1].setLevel(1);
            this.m.getCompoundDrawables()[1].setLevel(1);
            this.l.setText(2131691096);
            this.m.setText(2131695646);
        } else {
            this.n.setText(2131694152);
            this.o.getDrawable().setLevel(0);
            this.l.getCompoundDrawables()[1].setLevel(0);
            this.m.getCompoundDrawables()[1].setLevel(0);
            this.l.setText(2131689659);
            this.m.setText(2131694676);
        }
        this.l.setTextColor(d);
        this.m.setTextColor(d);
        this.w = i;
        if (this.s != null) {
            this.s.b();
            this.s.f();
            mim bl_mim = this.s;
            if (i != 1) {
                z = false;
            }
            bl_mim.a(z);
        }
    }

    private boolean k() {
        if (o() == null) {
            return false;
        }
        mst a = mst.a(o());
        evf c = eva.a(this.f).c();
        boolean z = c != null && ((Long) a.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 100, (byte) 119, (byte) 100, (byte) 104, (byte) 118, (byte) 90, (byte) 100, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119, (byte) 90, (byte) 104, (byte) 108, (byte) 97}), Long.valueOf(0))).longValue() == c.a;
        return z;
    }

    private void g(List<mvs> list) {
        if (this.u != null) {
            this.u.a((List) list);
        }
        if (this.s != null) {
            this.s.b();
            this.s.f();
        }
    }

    private void h(List<mvs> list) {
        if (this.u != null) {
            if (mhp.a(list)) {
                this.u.c((List) list);
            } else {
                List arrayList = new ArrayList();
                for (mvs bl_mvs : list) {
                    if (!mhp.e(bl_mvs)) {
                        arrayList.add(bl_mvs);
                    }
                }
                this.u.b(arrayList);
            }
            if (this.s != null) {
                this.s.b();
                this.s.f();
            }
        }
    }

    private void i(List<mvs> list) {
        mvs bl_mvs = (mvs) list.get(0);
        a(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 65, (byte) 108, (byte) 118, (byte) 104, (byte) 108, (byte) 118, (byte) 118, (byte) 68, (byte) 105, (byte) 105, (byte) 85, (byte) 106, (byte) 117, (byte) 112, (byte) 117, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114}), new Object[0]);
        a(hae.a(new byte[]{(byte) 65, (byte) 96, (byte) 104, (byte) 100, (byte) 107, (byte) 97, (byte) 85, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 86, (byte) 109, (byte) 106, (byte) 114, (byte) 85, (byte) 106, (byte) 117, (byte) 112, (byte) 117, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114}), DemandPopupWindows.DanmakuReportPanel, bl_mvs);
    }

    private void j(List<mvs> list) {
        mvs bl_mvs = (mvs) list.get(0);
        if (mhp.b(bl_mvs)) {
            c(bl_mvs);
        } else {
            b(bl_mvs);
        }
        this.l.setText(2131689659);
        this.s.b();
        this.s.f();
    }

    private void l() {
        Collection m = m();
        Collection arrayList = new ArrayList();
        SortedMap a = mhp.a(n());
        if (a != null) {
            long s = (long) q().s();
            for (Collection<mvs> it : a.subMap(Long.valueOf(Math.max(0, s - 6000)), Long.valueOf(s + 1000)).values()) {
                for (mvs bl_mvs : it) {
                    mhp.b(bl_mvs, true);
                    arrayList.add(bl_mvs);
                }
            }
        }
        this.x = new ArrayList();
        this.x.addAll(m);
        this.x.addAll(arrayList);
    }

    private List<mvs> m() {
        List<mvs> J = q().J();
        if (J == null || J.isEmpty()) {
            return new ArrayList();
        }
        Iterator it = J.iterator();
        while (it.hasNext()) {
            mvs bl_mvs = (mvs) it.next();
            if (mhp.a(bl_mvs)) {
                it.remove();
            } else {
                mhp.b(bl_mvs, false);
            }
        }
        return J;
    }

    private IDanmakuParams n() {
        return this.g.b();
    }

    private PlayerParams o() {
        return this.g.a();
    }

    private void a(String str, Object... objArr) {
        this.g.a(str, objArr);
    }

    private msr p() {
        return this.g.c();
    }

    private mvb q() {
        return this.g.d();
    }

    public void a(int i, List<mvs> list, gnc<String> bl_gnc_java_lang_String) {
        if (list != null && !list.isEmpty()) {
            mhn.a(this.f, i, list, bl_gnc_java_lang_String);
        }
    }
}
