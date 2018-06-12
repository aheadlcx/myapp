package bili.bl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bilibili.bilibililive.im.entity.ChatMessage;
import com.bilibili.column.api.Column;
import com.bilibili.column.api.Column.Category;
import com.bilibili.column.api.ColumnBanner;
import com.bilibili.column.api.ColumnHomeTab;
import com.bilibili.column.api.ColumnHotspot;
import com.bilibili.column.widget.RankTextView;
import com.bilibili.upper.videoup.model.TaskStep;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: BL */
public class eop extends meo implements bl.enq.a, bl.enq.b {
    private List<Column> a;
    boolean b = true;
    boolean c = false;
    a d;
    private List<Column> g;
    private List<ColumnBanner> h;
    private List<ColumnHotspot> i;
    private Context j;
    private enq k;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private int o = 0;
    private OnClickListener p = new OnClickListener(this) {
        final /* synthetic */ eop a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            this.a.a(view);
        }
    };

    /* compiled from: BL */
    static class a extends epo<ColumnBanner> {
        public a(View view, mel bl_mel) {
            super(view, bl_mel);
        }

        public static a a(ViewGroup viewGroup, mel bl_mel) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131428565, viewGroup, false), bl_mel);
        }

        protected epl<ColumnBanner> a(List<ColumnBanner> list, int i) {
            return new epl<ColumnBanner>(this, (ColumnBanner) list.get(i)) {
                final /* synthetic */ a a;

                public String a() {
                    return ((ColumnBanner) this.b).image;
                }

                public String b() {
                    return ((ColumnBanner) this.b).url;
                }
            };
        }

        protected void onClick(epl<ColumnBanner> bl_epl_com_bilibili_column_api_ColumnBanner) {
            if (bl_epl_com_bilibili_column_api_ColumnBanner != null) {
                try {
                    if (bl_epl_com_bilibili_column_api_ColumnBanner.b != null) {
                        ColumnBanner columnBanner = (ColumnBanner) bl_epl_com_bilibili_column_api_ColumnBanner.b;
                        eof.a(columnBanner.isAdLoc, columnBanner.isAd, columnBanner.adCb, columnBanner.srcId, columnBanner.index, columnBanner.ip, columnBanner.serverType, columnBanner.resourceId, columnBanner.id);
                        eog.b(this.a.getContext(), bl_epl_com_bilibili_column_api_ColumnBanner.b());
                    }
                } catch (Throwable e) {
                    ibn.a(e);
                }
            }
        }

        public void a(tv.danmaku.bili.widget.Banner.a aVar) {
            super.a(aVar);
            if (aVar instanceof epl) {
                epl bl_epl = (epl) aVar;
                if (bl_epl.b instanceof ColumnBanner) {
                    ColumnBanner columnBanner = (ColumnBanner) bl_epl.b;
                    eof.a(columnBanner.isAdLoc, columnBanner.isAd, columnBanner.adCb, columnBanner.srcId, columnBanner.index, columnBanner.ip, columnBanner.serverType, columnBanner.resourceId, columnBanner.id, columnBanner.requestId);
                }
            }
        }
    }

    /* compiled from: BL */
    static class b extends epp {
        private enq D;
        private Column E;
        private String F;

        public b(View view, mel bl_mel, enq bl_enq, String str) {
            super(view, bl_mel);
            if (this.w != null) {
                this.w.setVisibility(8);
            }
            this.D = bl_enq;
            this.F = str;
        }

        public void a(Column column) {
            super.a(column);
            this.E = column;
            if (this.r != null) {
                if (column.getReplyCount() <= 0) {
                    this.r.setText("\u8bc4\u8bba");
                } else {
                    this.r.setText(aou.a(column.getReplyCount()));
                }
            }
            if (this.s != null) {
                CharSequence categoryName;
                String str = BuildConfig.VERSION_NAME;
                if (column.getViewCount() <= 0) {
                    categoryName = column.getCategoryName();
                } else {
                    categoryName = column.getCategoryName() + " \u00b7 " + aou.a(column.getViewCount()) + "\u9605\u8bfb";
                }
                this.s.setText(categoryName);
            }
            if (this.q != null) {
                this.q.setText(aou.a(column.getViewCount()));
            }
            if (this.x != null) {
                if (column.getLikeCount() <= 0) {
                    this.x.setText("\u559c\u6b22");
                } else {
                    this.x.setText(aou.a(column.getLikeCount()));
                }
            }
            if (column.isMyLike()) {
                b();
            } else {
                a();
            }
        }

        public void onClick(View view) {
            super.onClick(view);
            if (view.getId() == 2131298533 || view.getId() == 2131298531 || view.getId() == 2131298532) {
                if (this.D.a()) {
                    if (this.E.isMyLike()) {
                        a();
                        if (this.E.getLikeCount() - 1 <= 0) {
                            this.x.setText("\u559c\u6b22");
                        } else {
                            this.x.setText(String.valueOf(aou.a(this.E.getLikeCount() - 1)));
                        }
                    } else {
                        eoi.a(this.A);
                        b();
                        this.x.setText(String.valueOf(aou.a(this.E.getLikeCount() + 1)));
                    }
                    this.D.a(this.E, this.E.id);
                }
            } else if (view.getId() == 2131297079) {
                eog.a(view.getContext(), this.D.a, this.E, 0, -2, this.F);
            } else if (view.getId() == 2131296849 && this.E != null && this.E.categories != null && this.E.categories.size() == 2) {
                eog.a(view.getContext(), ((Category) this.E.categories.get(0)).id, ((Category) this.E.categories.get(1)).id);
            }
        }

        private void a() {
            this.A.setImageResource(2131232902);
            this.x.setTextColor(this.x.getContext().getResources().getColor(2131100035));
        }

        private void b() {
            this.A.setImageResource(2131232900);
            this.x.setTextColor(this.x.getContext().getResources().getColor(2131099918));
        }

        public static b a(ViewGroup viewGroup, mel bl_mel, enq bl_enq, String str) {
            return new b(ept.b(2, viewGroup), bl_mel, bl_enq, str);
        }
    }

    /* compiled from: BL */
    static class c extends meq implements OnClickListener {
        TextView n;
        TextView o;
        RankTextView p;
        RankTextView q;
        RankTextView r;

        public c(View view, mel bl_mel) {
            super(view, bl_mel);
            this.n = (TextView) view.findViewById(2131300709);
            this.o = (TextView) view.findViewById(2131300718);
            this.p = (RankTextView) view.findViewById(2131296826);
            this.q = (RankTextView) view.findViewById(2131296827);
            this.r = (RankTextView) view.findViewById(2131296828);
            a(this.p, this.q, this.r, this.o);
        }

        private void a(View... viewArr) {
            for (View onClickListener : viewArr) {
                onClickListener.setOnClickListener(this);
            }
        }

        public static c a(ViewGroup viewGroup, mel bl_mel) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(2131428581, viewGroup, false), bl_mel);
        }

        public void a(List<Column> list) {
            if (list != null && list.size() != 0) {
                this.n.getPaint().setFakeBoldText(true);
                this.p.setVisibility(8);
                this.q.setVisibility(8);
                this.r.setVisibility(8);
                int size = list.size() > 3 ? 3 : list.size();
                for (int i = 0; i < size; i++) {
                    Column column = (Column) list.get(i);
                    if (column != null) {
                        if (i == 0) {
                            a(this.p, column);
                        } else if (i == 1) {
                            a(this.q, column);
                        } else if (i == 2) {
                            a(this.r, column);
                        }
                    }
                }
            }
        }

        private void a(RankTextView rankTextView, Column column) {
            rankTextView.setVisibility(0);
            rankTextView.a(column.getTitle(), aou.a(column.getViewCount()) + "\u9605\u8bfb");
            rankTextView.setTag(column);
        }

        public void onClick(View view) {
            if (view.getId() == 2131300718) {
                eog.b(view.getContext(), 2, hae.a(new byte[]{(byte) 119, (byte) 100, (byte) 107, (byte) 110, (byte) 70, (byte) 100, (byte) 119, (byte) 97}));
            } else if (view instanceof RankTextView) {
                Object tag = view.getTag();
                if (tag instanceof Column) {
                    eog.a(view.getContext(), (Column) tag, 0, 0, hae.a(new byte[]{(byte) 119, (byte) 100, (byte) 107, (byte) 110, (byte) 70, (byte) 100, (byte) 119, (byte) 97}));
                }
            }
        }
    }

    /* compiled from: BL */
    static class d extends meq implements OnClickListener {
        TextView n;
        RankTextView o;
        RankTextView p;
        RankTextView q;
        RankTextView r;

        public d(View view, mel bl_mel) {
            super(view, bl_mel);
            this.n = (TextView) view.findViewById(2131296820);
            this.o = (RankTextView) view.findViewById(2131296816);
            this.p = (RankTextView) view.findViewById(2131296817);
            this.q = (RankTextView) view.findViewById(2131296818);
            this.r = (RankTextView) view.findViewById(2131296819);
            a(this.o, this.p, this.q, this.r);
        }

        private void a(View... viewArr) {
            for (View view : viewArr) {
                if (view != null) {
                    view.setOnClickListener(this);
                }
            }
        }

        public void onClick(View view) {
            if (view instanceof RankTextView) {
                Object tag = view.getTag();
                if (tag instanceof ColumnHotspot) {
                    eog.c(view.getContext(), (int) ((ColumnHotspot) tag).id, hae.a(new byte[]{(byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 81, (byte) 100, (byte) 103}));
                }
            }
        }

        public void a(List<ColumnHotspot> list) {
            int i = 0;
            if (list != null && list.size() != 0) {
                this.n.getPaint().setFakeBoldText(true);
                a(8, this.o, this.p, this.q, this.r);
                int size = list.size() > 4 ? 4 : list.size();
                while (i < size) {
                    ColumnHotspot columnHotspot = (ColumnHotspot) list.get(i);
                    if (columnHotspot != null) {
                        if (i == 0) {
                            a(this.o, columnHotspot);
                        } else if (i == 1) {
                            a(this.p, columnHotspot);
                        } else if (i == 2) {
                            a(this.q, columnHotspot);
                        } else if (i == 3) {
                            a(this.r, columnHotspot);
                        }
                    }
                    i++;
                }
            }
        }

        private void a(int i, View... viewArr) {
            for (View visibility : viewArr) {
                visibility.setVisibility(i);
            }
        }

        private void a(RankTextView rankTextView, ColumnHotspot columnHotspot) {
            rankTextView.setVisibility(0);
            a((TextView) rankTextView, columnHotspot.icon);
            rankTextView.b(columnHotspot.title, columnHotspot.stats == null ? BuildConfig.VERSION_NAME : enl.a(columnHotspot.stats.read) + "\u9605\u8bfb");
            rankTextView.setTag(columnHotspot);
        }

        private void a(TextView textView, boolean z) {
            if (z) {
                Drawable drawable = textView.getContext().getResources().getDrawable(2131233201);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                textView.setCompoundDrawables(drawable, null, null, null);
                return;
            }
            textView.setCompoundDrawables(null, null, null, null);
        }

        public static d a(ViewGroup viewGroup, mel bl_mel) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(2131428582, viewGroup, false), bl_mel);
        }
    }

    /* compiled from: BL */
    static class e extends meq {
        public e(View view, mel bl_mel) {
            super(view, bl_mel);
        }
    }

    /* compiled from: BL */
    static class f extends epq {
        private enq B;
        private Column C;
        private String D;

        public f(View view, mel bl_mel, enq bl_enq, String str) {
            super(view, bl_mel);
            this.B = bl_enq;
            this.D = str;
        }

        public static f a(ViewGroup viewGroup, mel bl_mel, enq bl_enq, String str) {
            return new f(ept.g(2, viewGroup), bl_mel, bl_enq, str);
        }

        public void a(Column column) {
            if (column != null) {
                super.a(column);
                this.C = column;
                if (column.isMyLike()) {
                    b();
                } else {
                    a();
                }
            }
        }

        public void onClick(View view) {
            super.onClick(view);
            if (view.getId() == 2131298533 || view.getId() == 2131298531 || view.getId() == 2131298532) {
                if (this.B.a()) {
                    if (this.C.isMyLike()) {
                        a();
                        if (this.C.getLikeCount() - 1 <= 0) {
                            this.v.setText("\u559c\u6b22");
                        } else {
                            this.v.setText(String.valueOf(aou.a(this.C.getLikeCount() - 1)));
                        }
                    } else {
                        eoi.a(this.y);
                        b();
                        this.v.setText(String.valueOf(aou.a(this.C.getLikeCount() + 1)));
                    }
                    this.B.a(this.C, this.C.id);
                }
            } else if (view.getId() == 2131297079) {
                eog.a(view.getContext(), this.B.a, this.C, 0, -2, this.D);
            } else if (view.getId() == 2131296849 && this.C != null && this.C.categories != null && this.C.categories.size() == 2) {
                eog.a(view.getContext(), ((Category) this.C.categories.get(0)).id, ((Category) this.C.categories.get(1)).id);
            }
        }

        private void a() {
            this.y.setImageResource(2131232902);
            this.v.setTextColor(this.v.getContext().getResources().getColor(2131100035));
        }

        private void b() {
            this.y.setImageResource(2131232900);
            this.v.setTextColor(this.v.getContext().getResources().getColor(2131099918));
        }
    }

    /* compiled from: BL */
    static class g extends epr {
        private enq D;
        private Column E;
        private String F;

        public g(View view, mel bl_mel, enq bl_enq, String str) {
            super(view, bl_mel);
            if (this.q != null) {
                this.q.setVisibility(8);
            }
            this.D = bl_enq;
            this.F = str;
        }

        public void a(Column column) {
            super.a(column);
            this.E = column;
            if (this.w != null) {
                if (column.getReplyCount() <= 0) {
                    this.w.setText("\u8bc4\u8bba");
                } else {
                    this.w.setText(aou.a(column.getReplyCount()));
                }
            }
            if (this.y != null) {
                CharSequence categoryName;
                String str = BuildConfig.VERSION_NAME;
                if (column.getViewCount() <= 0) {
                    categoryName = column.getCategoryName();
                } else {
                    categoryName = column.getCategoryName() + " \u00b7 " + aou.a(column.getViewCount()) + "\u9605\u8bfb";
                }
                this.y.setText(categoryName);
            }
            if (this.x != null) {
                this.x.setText(aou.a(column.getViewCount()));
            }
            if (this.z != null) {
                if (column.getLikeCount() <= 0) {
                    this.z.setText("\u559c\u6b22");
                } else {
                    this.z.setText(aou.a(column.getLikeCount()));
                }
            }
            if (column.isMyLike()) {
                b();
            } else {
                a();
            }
        }

        public void onClick(View view) {
            super.onClick(view);
            if (view.getId() == 2131298533 || view.getId() == 2131298531 || view.getId() == 2131298532) {
                if (this.D.a()) {
                    if (this.E.isMyLike()) {
                        a();
                        if (this.E.getLikeCount() - 1 <= 0) {
                            this.z.setText("\u559c\u6b22");
                        } else {
                            this.z.setText(String.valueOf(aou.a(this.E.getLikeCount() - 1)));
                        }
                    } else {
                        eoi.a(this.A);
                        b();
                        this.z.setText(String.valueOf(aou.a(this.E.getLikeCount() + 1)));
                    }
                    this.D.a(this.E, this.E.id);
                }
            } else if (view.getId() == 2131297079) {
                eog.a(view.getContext(), this.D.a, this.E, 0, -2, this.F);
            } else if (view.getId() == 2131296849 && this.E != null && this.E.categories != null && this.E.categories.size() == 2) {
                eog.a(view.getContext(), ((Category) this.E.categories.get(0)).id, ((Category) this.E.categories.get(1)).id);
            }
        }

        private void a() {
            this.A.setImageResource(2131232902);
            this.z.setTextColor(this.z.getContext().getResources().getColor(2131100035));
        }

        private void b() {
            this.A.setImageResource(2131232900);
            this.z.setTextColor(this.z.getContext().getResources().getColor(2131099918));
        }

        public static g a(ViewGroup viewGroup, mel bl_mel, enq bl_enq, String str) {
            return new g(ept.e(2, viewGroup), bl_mel, bl_enq, str);
        }
    }

    /* compiled from: BL */
    static class h extends meq {
        TextView n;
        TextView o;

        public h(View view, mel bl_mel) {
            super(view, bl_mel);
            this.n = (TextView) view.findViewById(2131299536);
            this.o = (TextView) view.findViewById(2131299602);
            this.n.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ h a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    eog.b(view.getContext(), 0, hae.a(new byte[]{(byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 81, (byte) 100, (byte) 103}));
                    eny.a(bl.eny.b.t);
                }
            });
        }

        public void a(int i) {
            if (i > 0) {
                this.a.setVisibility(0);
                this.o.getPaint().setFakeBoldText(true);
            }
        }

        public static h a(ViewGroup viewGroup, mel bl_mel) {
            return new h(LayoutInflater.from(viewGroup.getContext()).inflate(2131428601, viewGroup, false), bl_mel);
        }
    }

    public /* synthetic */ void a(u uVar) {
        d((meq) uVar);
    }

    public /* synthetic */ void c(u uVar) {
        b((meq) uVar);
    }

    public /* synthetic */ void d(u uVar) {
        c((meq) uVar);
    }

    public eop(Context context, Fragment fragment) {
        this.j = context;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        this.k = new enq(this, fragment, this);
    }

    public void a(View view) {
        Object tag = view.getTag();
        if (tag instanceof Column) {
            eog.a(view.getContext(), this.k.a, (Column) tag, 0, 0, g());
        }
    }

    public void a(boolean z) {
        this.c = z;
    }

    public List<Column> h() {
        return this.a;
    }

    public boolean i() {
        return (this.i == null || this.i.isEmpty()) ? false : true;
    }

    public String g() {
        return "0";
    }

    public void a(ColumnHomeTab columnHomeTab, boolean z) {
        this.h.clear();
        if (!(columnHomeTab.banners == null || columnHomeTab.banners.isEmpty())) {
            this.h.addAll(columnHomeTab.banners);
        }
        this.i.clear();
        if (!(columnHomeTab.hotspots == null || columnHomeTab.hotspots.isEmpty())) {
            this.i.addAll(columnHomeTab.hotspots);
        }
        this.a.clear();
        if (!(columnHomeTab.articles == null || columnHomeTab.articles.isEmpty())) {
            this.a.addAll(columnHomeTab.articles);
        }
        this.g.clear();
        if (!(!z || columnHomeTab.ranks == null || columnHomeTab.ranks.isEmpty())) {
            this.g.addAll(columnHomeTab.ranks);
        }
        k();
    }

    public void j() {
        this.h.clear();
        this.i.clear();
        this.a.clear();
        this.g.clear();
        k();
    }

    public void a(List<Column> list, boolean z) {
        if (list != null) {
            if (!z) {
                this.a.clear();
            }
            this.a.addAll(list);
            k();
        }
    }

    public String c(int i) {
        if (this.a == null || this.a.isEmpty()) {
            return BuildConfig.VERSION_NAME;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.a.size();
        int i2;
        if (size >= i) {
            for (i2 = size - 1; i2 >= size - i; i2--) {
                stringBuilder.append(String.valueOf(((Column) this.a.get(i2)).id));
                stringBuilder.append(",");
            }
        } else {
            for (i2 = size - 1; i2 >= 0; i2--) {
                stringBuilder.append(String.valueOf(((Column) this.a.get(i2)).id));
                stringBuilder.append(",");
            }
        }
        if (stringBuilder.length() < 1) {
            return BuildConfig.VERSION_NAME;
        }
        stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        return stringBuilder.toString();
    }

    protected void a(bl.mem.b bVar) {
        int i = this.h.size() > 0 ? 1 : 0;
        bVar.a(i, 100);
        this.l = i;
        if (this.i.size() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        bVar.a(i, 101);
        this.m = i;
        if (this.g.size() >= 3) {
            i = 1;
        } else {
            i = 0;
        }
        bVar.a(i, 102);
        this.n = i;
        int size = this.a.size();
        if (size > 0) {
            i = 1;
        } else {
            i = 0;
        }
        this.o = i;
        bVar.a(this.o, 103);
        for (int i2 = 0; i2 < size; i2++) {
            Column column = (Column) this.a.get(i2);
            if (column != null) {
                if (TextUtils.isEmpty(column.recImage)) {
                    switch (column.templateId) {
                        case TaskStep.TASK_STEP_THREE /*3*/:
                            bVar.a(1, 3);
                            break;
                        case TaskStep.TASK_STEP_FOUR /*4*/:
                            bVar.a(1, 4);
                            break;
                        default:
                            bVar.a(0, -2233);
                            break;
                    }
                }
                bVar.a(1, 999);
            }
        }
    }

    public void a(long j, int i) {
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                Column column = (Column) this.a.get(i2);
                if (j == column.id && i != column.getLikeCount()) {
                    if (i > column.getLikeCount()) {
                        column.likeState = 1;
                        column.changeMyLikeState(true);
                    } else {
                        column.likeState = 0;
                        column.changeMyLikeState(false);
                    }
                    f();
                }
            }
        }
    }

    protected meq a_(ViewGroup viewGroup, int i) {
        switch (i) {
            case -2233:
                return new e(viewGroup, this);
            case TaskStep.TASK_STEP_THREE /*3*/:
                return g.a(viewGroup, this, this.k, g());
            case TaskStep.TASK_STEP_FOUR /*4*/:
                return b.a(viewGroup, this, this.k, g());
            case ChatMessage.TYPE_SYSTEM /*100*/:
                return a.a(viewGroup, (mel) this);
            case 101:
                return d.a(viewGroup, (mel) this);
            case 102:
                return c.a(viewGroup, (mel) this);
            case 103:
                return h.a(viewGroup, this);
            case 999:
                return f.a(viewGroup, this, this.k, g());
            default:
                return null;
        }
    }

    protected void a_(meq bl_meq, int i, View view) {
        int i2;
        if (bl_meq instanceof a) {
            ((a) bl_meq).a(this.h);
        }
        if (bl_meq instanceof d) {
            ((d) bl_meq).a(this.i);
        }
        if (bl_meq instanceof c) {
            ((c) bl_meq).a(this.g);
        }
        if (bl_meq instanceof h) {
            ((h) bl_meq).a(this.a == null ? 0 : this.a.size());
        }
        int i3 = ((this.l + this.o) + this.n) + this.m;
        if (bl_meq instanceof b) {
            i2 = i - i3;
            int size = this.a.size();
            if (i2 >= 0 && i2 < size) {
                Column column = (Column) this.a.get(i2);
                ((b) bl_meq).a(column);
                ((b) bl_meq).a.setOnClickListener(this.p);
                ((b) bl_meq).a.setTag(column);
            } else {
                return;
            }
        }
        if (bl_meq instanceof g) {
            i2 = i - i3;
            size = this.a.size();
            if (i2 >= 0 && i2 < size) {
                column = (Column) this.a.get(i2);
                ((g) bl_meq).a(column);
                ((g) bl_meq).a.setOnClickListener(this.p);
                ((g) bl_meq).a.setTag(column);
            } else {
                return;
            }
        }
        if (bl_meq instanceof f) {
            i2 = i - i3;
            size = this.a.size();
            if (i2 >= 0 && i2 < size) {
                column = (Column) this.a.get(i2);
                ((f) bl_meq).a(column);
                ((f) bl_meq).a.setOnClickListener(this.p);
                ((f) bl_meq).a.setTag(column);
            }
        }
    }

    public void b(meq bl_meq) {
        super.c(bl_meq);
        if (bl_meq instanceof a) {
            if (this.d == null) {
                this.d = (a) bl_meq;
            }
            if (this.b) {
                a(this.d);
                this.b = false;
                this.d.b();
            }
            if (this.c) {
                this.d.b();
            }
        }
    }

    private void a(a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.a() == 1) {
            aVar.a(10000);
        } else if (aVar.a() > 1) {
            aVar.a(aVar.a() * 10);
        }
    }

    public void c(meq bl_meq) {
        super.d(bl_meq);
        if (bl_meq instanceof a) {
            ((a) bl_meq).A();
            this.d = null;
        }
    }

    public void d(meq bl_meq) {
        super.a(bl_meq);
        bl_meq.a.setOnClickListener(null);
        if (bl_meq instanceof a) {
            ((a) bl_meq).A();
        }
    }

    public void c(boolean z) {
        if (this.d != null) {
            if (z) {
                this.d.b();
            } else {
                this.d.A();
            }
        }
    }

    public boolean b() {
        return r();
    }

    private boolean r() {
        boolean a = eva.a(blg.a()).a();
        if (!a) {
            eog.a(this.j, 100);
        }
        return a;
    }

    public void c() {
        ps.a(new Callable<Void>(this) {
            final /* synthetic */ eop a;

            {
                this.a = r1;
            }

            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public Void a() throws Exception {
                eva.a(this.a.j).b();
                return null;
            }
        });
    }

    public void a(boolean z, Column column, boolean z2) {
        if (z != column.isMyLike()) {
            column.likeState = z ? 1 : 0;
            column.changeMyLikeState(z);
        }
    }
}
