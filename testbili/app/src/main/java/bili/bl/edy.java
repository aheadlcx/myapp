package bili.bl;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.ranks.LiveRoomOpValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* compiled from: BL */
public class edy {
    b a;
    a b;
    c c;
    d d;
    private int e;
    private long f;
    private int g;
    private mep h;
    private PagerSlidingTabStrip i;
    private Map<String, e> j = new HashMap();
    private boolean k;

    /* compiled from: BL */
    static class a implements bl.mep.b {
        int a;
        eea b;
        boolean c;

        public /* synthetic */ CharSequence a(Context context) {
            return b(context);
        }

        public a(int i, boolean z) {
            this.a = i;
            this.c = z;
        }

        public String b(Context context) {
            return context.getString(2131691553);
        }

        public int a() {
            return 19;
        }

        public bl.mep.a b() {
            if (this.b == null) {
                this.b = eea.a(this.a, true, this.c);
            }
            return this.b;
        }
    }

    /* compiled from: BL */
    static class b implements bl.mep.b {
        int a;
        eeb b;
        boolean c;

        public /* synthetic */ CharSequence a(Context context) {
            return b(context);
        }

        public b(int i, boolean z) {
            this.a = i;
            this.c = z;
        }

        public String b(Context context) {
            return context.getString(2131691577);
        }

        public int a() {
            return 18;
        }

        public bl.mep.a b() {
            if (this.b == null) {
                this.b = eeb.a(this.a, true, this.c);
            }
            return this.b;
        }
    }

    /* compiled from: BL */
    public static class c implements bl.mep.b {
        eec a;
        boolean b;
        bl.eec.d c;
        private int d;
        private long e;
        private int f;

        public /* synthetic */ CharSequence a(Context context) {
            return b(context);
        }

        public c(int i, long j, int i2, boolean z, bl.eec.d dVar) {
            this.d = i;
            this.e = j;
            this.f = i2;
            this.b = z;
            this.c = dVar;
        }

        public String b(Context context) {
            return context.getString(2131691612);
        }

        public int a() {
            return 22;
        }

        public bl.mep.a b() {
            if (this.a == null) {
                this.a = eec.a(this.d, this.e, true, this.b);
            }
            this.a.a(this.c);
            return this.a;
        }
    }

    /* compiled from: BL */
    public static class d implements bl.mep.b {
        int a;
        boolean b;
        eei c;

        public /* synthetic */ CharSequence a(Context context) {
            return b(context);
        }

        public d(int i, boolean z) {
            this.b = z;
            this.a = i;
        }

        public String b(Context context) {
            return context.getString(2131692778);
        }

        public int a() {
            return 24;
        }

        public bl.mep.a b() {
            if (this.c == null) {
                this.c = eei.a(this.a, true);
            }
            return this.c;
        }
    }

    /* compiled from: BL */
    static class e implements bl.mep.b {
        int a;
        eed b;
        LiveRoomOpValue c;
        int d;
        boolean e;

        public /* synthetic */ CharSequence a(Context context) {
            return b(context);
        }

        public e(LiveRoomOpValue liveRoomOpValue, int i, int i2, boolean z) {
            this.c = liveRoomOpValue;
            this.a = i;
            this.d = i2;
            this.e = z;
        }

        public String b(Context context) {
            return this.c.getmOpTitle();
        }

        public int a() {
            return 16 - this.d;
        }

        public bl.mep.a b() {
            if (this.b == null) {
                this.b = eed.a(this.c.getmOpType(), this.a, true, this.e);
            }
            return this.b;
        }
    }

    public edy(int i, long j) {
        this.e = i;
        this.f = j;
        this.g = 0;
    }

    public void a(FragmentManager fragmentManager, mep bl_mep, PagerSlidingTabStrip pagerSlidingTabStrip, boolean z, bl.eec.d dVar) {
        this.h = bl_mep;
        this.i = pagerSlidingTabStrip;
        this.k = z;
        this.a = new b(this.e, z);
        this.a.b = (eeb) fragmentManager.findFragmentByTag(mep.b(2131299547, this.a));
        this.b = new a(this.e, z);
        this.b.b = (eea) fragmentManager.findFragmentByTag(mep.b(2131299547, this.b));
        this.c = new c(this.e, this.f, this.g, z, dVar);
        this.c.a = (eec) fragmentManager.findFragmentByTag(mep.b(2131299547, this.c));
        this.d = new d(this.e, z);
        this.d.c = (eei) fragmentManager.findFragmentByTag(mep.b(2131299547, this.d));
        this.h.a(this.a);
        this.h.a(this.b);
        this.h.a(this.c);
        this.h.a(this.d);
        this.i.a();
        this.h.notifyDataSetChanged();
    }

    public void a() {
        int count = this.h.getCount();
        for (int i = 0; i < count; i++) {
            Fragment item = this.h.getItem(i);
            if (item != null && (item instanceof bl.dyd.a)) {
                ((bl.dyd.a) item).ab_();
            }
        }
    }

    public void a(FragmentManager fragmentManager, ArrayList<LiveRoomOpValue> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            int i = 0;
            int i2 = 2;
            while (i < arrayList.size()) {
                Object obj;
                int i3;
                LiveRoomOpValue liveRoomOpValue = (LiveRoomOpValue) arrayList.get(i);
                if (this.j.get(liveRoomOpValue.getmOpType()) != null) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj == null) {
                    e eVar = new e(liveRoomOpValue, this.e, i, this.k);
                    eVar.b = (eed) fragmentManager.findFragmentByTag(mep.b(2131299547, eVar));
                    this.h.a(i2, eVar);
                    i3 = i2 + 1;
                    this.j.put(liveRoomOpValue.getmOpType(), eVar);
                } else {
                    i3 = i2;
                }
                i++;
                i2 = i3;
            }
            this.i.a();
            this.h.notifyDataSetChanged();
        }
    }
}
