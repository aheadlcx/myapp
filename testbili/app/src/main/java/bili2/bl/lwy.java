package bili2.bl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail.Page;
import tv.danmaku.bili.ui.watchlater.api.WatchLaterItem;

/* compiled from: BL */
public class lwy extends android.support.v7.widget.RecyclerView.a {
    private List<Object> a;
    private int b;
    private int c;
    private b d;
    private WatchLaterItem e;
    private c f;
    private a g;
    private boolean h;
    private boolean i = true;
    private OnClickListener j = new OnClickListener(this) {
        final /* synthetic */ lwy a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            b bVar = (b) view.getTag();
            Object obj = bVar.w;
            if (bVar.w.isInvalidVideo()) {
                esu.a(view.getContext(), "\u5df2\u5931\u6548", 0);
                return;
            }
            int a = this.a.a(obj);
            if (a == 0) {
                return;
            }
            if (a == this.a.a()) {
                this.a.a(view, -180);
                this.a.b(a, obj.pages);
                bVar.t.setVisibility(0);
                return;
            }
            Object h = this.a.h(a);
            if (h instanceof WatchLaterItem) {
                this.a.a(view, -180);
                this.a.b(a, obj.pages);
                bVar.t.setVisibility(0);
            } else if (h instanceof Page) {
                this.a.a(view, 0);
                this.a.a(a, obj.pages);
                bVar.t.setVisibility(8);
            }
        }
    };
    private OnClickListener k = new OnClickListener(this) {
        final /* synthetic */ lwy a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            b bVar = (b) view.getTag();
            if (this.a.b != bVar.w.avid) {
                if (bVar.w.isInvalidVideo()) {
                    esu.a(view.getContext(), "\u5df2\u5931\u6548", 0);
                    this.a.a(true);
                } else if (this.a.h) {
                    lvl.a().h();
                    if (this.a.e != null && this.a.e.isPageVideo()) {
                        int a = this.a.a(this.a.e);
                        int b = this.a.b(a + 1);
                        if (b == 2 || b == 3) {
                            this.a.a(a, this.a.e.pages);
                        }
                    }
                    this.a.b(this.a.d);
                    this.a.a(bVar);
                    this.a.b = bVar.w.avid;
                    this.a.d = bVar;
                    this.a.e = bVar.w;
                    this.a.f = null;
                    this.a.i = false;
                    if (this.a.g != null) {
                        this.a.g.a(bVar.w);
                    }
                }
            }
        }
    };
    private OnClickListener l = new OnClickListener(this) {
        final /* synthetic */ lwy a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            c cVar = (c) view.getTag();
            boolean z = this.a.i && !bl.ktc.c.a(blg.a());
            if (z || this.a.c != cVar.s.mCid) {
                if (this.a.f != null) {
                    this.a.f(this.a.f);
                }
                this.a.e((u) cVar);
                this.a.c = cVar.s.mCid;
                this.a.f = cVar;
                this.a.i = false;
                if (this.a.g != null) {
                    this.a.g.a(cVar.s);
                }
            }
        }
    };

    /* compiled from: BL */
    public interface a {
        void a(Page page);

        void a(WatchLaterItem watchLaterItem);
    }

    /* compiled from: BL */
    static class b extends u {
        ImageView n;
        TextView o;
        TextView p;
        TextView q;
        ImageView r;
        LinearLayout s;
        View t;
        View u;
        TextView v;
        WatchLaterItem w;
        int x;

        private b(View view) {
            super(view);
            this.n = (ImageView) view.findViewById(2131297178);
            this.o = (TextView) view.findViewById(2131300554);
            this.p = (TextView) view.findViewById(2131300682);
            this.q = (TextView) view.findViewById(2131299433);
            this.r = (ImageView) view.findViewById(2131296453);
            this.s = (LinearLayout) view.findViewById(2131297324);
            this.t = view.findViewById(2131299956);
            this.u = view.findViewById(2131301160);
            this.v = (TextView) view.findViewById(2131301159);
        }

        public static b a(ViewGroup viewGroup) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(2131428416, viewGroup, false));
        }
    }

    /* compiled from: BL */
    static class c extends u {
        TintImageView n;
        TextView o;
        TextView p;
        View q;
        int r;
        Page s;

        private c(View view) {
            super(view);
            this.o = (TextView) view.findViewById(2131299182);
            this.p = (TextView) view.findViewById(2131299181);
            this.n = (TintImageView) view.findViewById(2131298127);
            this.q = view.findViewById(2131297424);
        }

        public static c a(ViewGroup viewGroup) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(2131428417, viewGroup, false));
        }
    }

    public lwy(int i) {
        this.b = i;
        this.c = -1;
        this.a = new ArrayList(50);
    }

    public void c(int i) {
        this.b = i;
        this.d = null;
        this.i = false;
    }

    public void g(int i) {
        this.c = i;
        this.i = false;
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public void a(BiliVideoDetail biliVideoDetail) {
        ArrayList arrayList = (ArrayList) biliVideoDetail.mPageList;
        if (arrayList != null) {
            for (int i = 0; i < this.a.size(); i++) {
                if (this.a.get(i) instanceof WatchLaterItem) {
                    Object obj = (WatchLaterItem) this.a.get(i);
                    if (obj.pages == null) {
                        obj.pages = new ArrayList();
                    }
                    if (obj.avid == biliVideoDetail.mAvid && arrayList.size() > 1) {
                        obj.pages.clear();
                        obj.pages.addAll(arrayList);
                        int a = a(obj);
                        d(a - 1);
                        b(a, arrayList);
                    }
                }
            }
        }
    }

    public void b() {
        if (this.d == null) {
            return;
        }
        if (b(this.d.x + 1) == 1) {
            a(this.d.r, 0);
        } else {
            a(this.d.r, -180);
        }
    }

    private void b(int i, ArrayList<Page> arrayList) {
        if (arrayList != null && arrayList.size() > 1 && !this.a.containsAll(arrayList)) {
            this.a.addAll(i, arrayList);
            c(i, arrayList.size());
        }
    }

    public void a(int i, ArrayList<Page> arrayList) {
        if (arrayList != null && arrayList.size() > 1 && this.a.containsAll(arrayList)) {
            this.a.removeAll(arrayList);
            d(i, arrayList.size());
        }
    }

    public u b(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return b.a(viewGroup);
        }
        if (i == 2 || i == 3) {
            return c.a(viewGroup);
        }
        return null;
    }

    public void a(u uVar, int i) {
        if (uVar instanceof b) {
            a(i, uVar);
        } else if (uVar instanceof c) {
            b(i, uVar);
        }
    }

    private void a(int i, u uVar) {
        Object obj = this.a.get(i);
        if ((uVar instanceof b) && (obj instanceof WatchLaterItem)) {
            WatchLaterItem watchLaterItem = (WatchLaterItem) obj;
            b bVar = (b) uVar;
            bVar.w = watchLaterItem;
            bVar.r.setTag(bVar);
            bVar.a.setTag(bVar);
            fci.g().a(watchLaterItem.cover, bVar.n);
            bVar.q.setVisibility(0);
            bVar.p.setText(watchLaterItem.title);
            if (watchLaterItem.isPageVideo()) {
                bVar.u.setVisibility(0);
                bVar.v.setText(watchLaterItem.count < 999 ? watchLaterItem.count + "P" : "999+");
            } else {
                bVar.u.setVisibility(8);
            }
            if (watchLaterItem.avid == this.b) {
                int i2;
                a(bVar);
                this.d = bVar;
                this.e = bVar.w;
                this.d.x = i;
                if (bVar.w.pages != null && bVar.w.pages.size() > 0 && this.f == null && this.c == -1) {
                    this.c = ((Page) bVar.w.pages.get(0)).mCid;
                }
                if (!this.i || bl.ktc.c.a(blg.a())) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if (i2 != 0) {
                    bVar.q.setVisibility(8);
                }
            } else {
                b(bVar);
            }
            if (watchLaterItem.isInvalidVideo()) {
                bVar.o.setVisibility(0);
            } else {
                bVar.o.setVisibility(8);
            }
            bVar.r.setOnClickListener(this.j);
            bVar.a.setOnClickListener(this.k);
        }
    }

    private void b(int i, u uVar) {
        Object obj = this.a.get(i);
        if ((uVar instanceof c) && (obj instanceof Page)) {
            int i2;
            Page page = (Page) obj;
            u uVar2 = (c) uVar;
            uVar2.s = page;
            uVar.a.setTag(uVar);
            int i3 = i - 1;
            while (i3 > 0) {
                if (this.a.get(i3) instanceof WatchLaterItem) {
                    break;
                }
                i3--;
            }
            i3 = 0;
            uVar2.p.setText("P" + (i - i3));
            uVar2.o.setText(page.mTitle);
            if (!this.i || bl.ktc.c.a(blg.a())) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            if (i2 == 0 && uVar2.s.mCid == this.c) {
                this.f = uVar2;
                this.f.r = i;
                e(uVar2);
            } else {
                f(uVar2);
            }
            if (b(i) == 3) {
                uVar2.q.setVisibility(8);
                i2 = uVar.a.getContext().getResources().getDimensionPixelOffset(2131165459);
            } else {
                uVar2.q.setVisibility(0);
                i2 = 0;
            }
            uVar2.a.setPadding(0, 0, 0, i2);
            uVar.a.setOnClickListener(this.l);
        }
    }

    public WatchLaterItem a(Page page) {
        if (this.e == null || page == null) {
            return null;
        }
        WatchLaterItem watchLaterItem = (WatchLaterItem) i(this.b);
        if (watchLaterItem == null) {
            return null;
        }
        if (watchLaterItem.pages == null || watchLaterItem.page == null) {
            return null;
        }
        int i = 0;
        while (i < watchLaterItem.pages.size()) {
            if (((Page) watchLaterItem.pages.get(i)).mCid == page.mCid) {
                break;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            watchLaterItem.page.pageNumber = 1;
            return watchLaterItem;
        }
        watchLaterItem.page.pageNumber = i + 1;
        return watchLaterItem;
    }

    public void a(final View view, final int i) {
        view.animate().rotation((float) i).setDuration(200).setListener(new AnimatorListenerAdapter(this) {
            final /* synthetic */ lwy c;

            public void onAnimationEnd(Animator animator) {
                view.setRotation((float) i);
            }
        }).start();
    }

    private void e(u uVar) {
        if (uVar instanceof c) {
            c cVar = (c) uVar;
            Context context = uVar.a.getContext();
            cVar.n.setVisibility(0);
            cVar.n.setImageTintList(2131101005);
            cVar.o.setTextColor(ej.c(context, 2131101005));
            cVar.p.setTextColor(ej.c(context, 2131101005));
        }
    }

    private void f(u uVar) {
        c cVar = (c) uVar;
        Context context = uVar.a.getContext();
        cVar.n.setVisibility(8);
        cVar.o.setTextColor(ej.c(context, 2131100037));
        cVar.p.setTextColor(ej.c(context, 2131100037));
    }

    private void a(b bVar) {
        WatchLaterItem watchLaterItem = bVar.w;
        Context context = bVar.a.getContext();
        bVar.a.setBackgroundResource(2131100051);
        bVar.n.setAlpha(1.0f);
        bVar.p.setTextColor(ej.c(context, 2131101038));
        bVar.q.setVisibility(0);
        bVar.q.setTextColor(ej.c(context, 2131101029));
        if (watchLaterItem.count <= 1 || watchLaterItem.page == null) {
            bVar.q.setText("\u6b63\u5728\u64ad\u653e");
        } else {
            CharSequence charSequence;
            String str = gmy.d;
            if (this.f == null || bVar.w.pages == null || (bVar.w.pages.size() > 0 && this.c == ((Page) bVar.w.pages.get(0)).mCid)) {
                charSequence = context.getString(2131696151, new Object[]{Integer.valueOf(1)}) + hae.a(new byte[]{(byte) 37, (byte) -23, (byte) -94, (byte) -84, (byte) -22, (byte) -109, (byte) -89, (byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79});
            } else {
                charSequence = context.getString(2131696151, new Object[]{Integer.valueOf(watchLaterItem.page.pageNumber)}) + hae.a(new byte[]{(byte) 37, (byte) -23, (byte) -94, (byte) -84, (byte) -22, (byte) -109, (byte) -89, (byte) -23, (byte) -99, (byte) -94, (byte) -23, (byte) -101, (byte) -79});
            }
            bVar.q.setText(charSequence);
        }
        if (watchLaterItem.isPageVideo()) {
            bVar.r.setVisibility(0);
            LayoutParams layoutParams = (LayoutParams) bVar.s.getLayoutParams();
            layoutParams.rightMargin = 0;
            bVar.s.setLayoutParams(layoutParams);
            return;
        }
        bVar.r.setVisibility(8);
        layoutParams = (LayoutParams) bVar.s.getLayoutParams();
        layoutParams.rightMargin = context.getResources().getDimensionPixelOffset(2131165531);
        bVar.s.setLayoutParams(layoutParams);
    }

    private void b(b bVar) {
        if (bVar != null) {
            WatchLaterItem watchLaterItem = bVar.w;
            Context context = bVar.a.getContext();
            bVar.a.setBackgroundResource(2131099757);
            bVar.n.setAlpha(0.8f);
            bVar.p.setTextColor(ej.c(context, watchLaterItem.isInvalidVideo() ? 2131100037 : 2131101029));
            if (watchLaterItem.isVideoWatched()) {
                bVar.q.setVisibility(0);
                bVar.q.setTextColor(ej.c(context, 2131101029));
                if (watchLaterItem.progress == -1) {
                    bVar.q.setText(context.getString(2131696148));
                } else if (watchLaterItem.count <= 1 || watchLaterItem.page == null) {
                    bVar.q.setText(context.getString(2131696155, new Object[]{watchLaterItem.getReadableProgress()}));
                } else {
                    bVar.q.setText(context.getString(2131696151, new Object[]{Integer.valueOf(watchLaterItem.page.pageNumber)}) + " " + context.getString(2131696155, new Object[]{watchLaterItem.getReadableProgress()}));
                }
            } else {
                bVar.q.setVisibility(8);
            }
            bVar.r.setVisibility(8);
        }
    }

    public int a(Object obj) {
        if (this.a == null || this.a.indexOf(obj) == -1) {
            return 0;
        }
        return this.a.indexOf(obj) + 1;
    }

    public Object h(int i) {
        if (this.a == null || this.a.size() == 0 || i < 0 || this.a.size() <= i) {
            return null;
        }
        return this.a.get(i);
    }

    public Object i(int i) {
        if (this.a == null || this.a.size() == 0) {
            return null;
        }
        if (this.a != null) {
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                Object obj = this.a.get(i2);
                if (obj instanceof WatchLaterItem) {
                    if (((WatchLaterItem) obj).avid == i) {
                        return obj;
                    }
                } else if ((obj instanceof Page) && ((Page) obj).mCid == i) {
                    return obj;
                }
            }
        }
        return null;
    }

    public int a() {
        return this.a == null ? 0 : this.a.size();
    }

    public int c() {
        int i = 0;
        int i2 = 0;
        while (i < this.a.size()) {
            if (this.a.get(i) instanceof WatchLaterItem) {
                i2++;
            }
            i++;
        }
        return i2;
    }

    public int b(int i) {
        if (i >= this.a.size()) {
            return -1;
        }
        if (this.a.get(i) instanceof WatchLaterItem) {
            return 1;
        }
        if (i == this.a.size() - 1 || !(this.a.get(i + 1) instanceof WatchLaterItem)) {
            return 2;
        }
        return 3;
    }

    public void a(ArrayList<WatchLaterItem> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                if (!(((WatchLaterItem) arrayList.get(size)).isWebLinkVideo() || ((WatchLaterItem) arrayList.get(size)).isInvalidVideo() || i(((WatchLaterItem) arrayList.get(size)).avid) != null)) {
                    this.a.add(0, arrayList.get(size));
                    e(0);
                }
                size--;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                WatchLaterItem watchLaterItem = (WatchLaterItem) arrayList.get(i);
                for (int i2 = 0; i2 < this.a.size(); i2++) {
                    if (this.a.get(i2) instanceof WatchLaterItem) {
                        WatchLaterItem watchLaterItem2 = (WatchLaterItem) this.a.get(i2);
                        if (watchLaterItem2.avid == watchLaterItem.avid) {
                            watchLaterItem2.update(watchLaterItem);
                            break;
                        }
                    }
                }
            }
        }
    }

    public int g() {
        return this.b;
    }

    public int h() {
        if (this.c == -1) {
            return -1;
        }
        for (int i = 0; i < this.a.size(); i++) {
            Object obj = this.a.get(i);
            if ((obj instanceof Page) && this.c == ((Page) obj).mCid) {
                return i;
            }
        }
        return -1;
    }

    public int i() {
        for (int i = 0; i < this.a.size(); i++) {
            Object obj = this.a.get(i);
            if ((obj instanceof WatchLaterItem) && this.b == ((WatchLaterItem) obj).avid) {
                return i;
            }
        }
        return -1;
    }

    public boolean b(Object obj) {
        boolean z = true;
        if (this.a == null) {
            return false;
        }
        boolean z2;
        Object obj2 = this.a.get(this.a.size() - 1);
        if (obj2 instanceof Page) {
            z2 = ((Page) obj).mCid == ((Page) obj2).mCid;
        } else {
            WatchLaterItem watchLaterItem = (WatchLaterItem) obj2;
            if (watchLaterItem.page == null || watchLaterItem.page.cid != ((Page) obj).mCid) {
                z = false;
            }
            z2 = z;
        }
        return z2;
    }

    public boolean j() {
        return this.i;
    }
}
