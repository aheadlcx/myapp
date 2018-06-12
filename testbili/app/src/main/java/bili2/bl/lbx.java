package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.author.AuthorSpaceActivity;
import tv.danmaku.bili.ui.author.api.BiliSpaceArchiveVideo;
import tv.danmaku.bili.ui.author.api.BiliSpaceVideo;

/* compiled from: BL */
class lbx {

    /* compiled from: BL */
    public static abstract class a extends bl.mee.a {
        protected ImageView n;
        protected TextView o;
        protected TextView p;
        protected TextView q;
        protected TextView r;
        protected TextView s;
        protected View t;

        public a(View view) {
            super(view);
            this.n = (ImageView) ButterKnife.a(view, 2131298111);
            this.o = (TextView) ButterKnife.a(view, 2131297464);
            this.p = (TextView) ButterKnife.a(view, 2131300682);
            this.q = (TextView) ButterKnife.a(view, 2131299343);
            this.r = (TextView) ButterKnife.a(view, 2131297262);
            this.s = (TextView) ButterKnife.a(view, 2131300499);
            this.t = ButterKnife.a(view, 2131298861);
        }
    }

    /* compiled from: BL */
    static class b extends a {
        private OnClickListener c = new OnClickListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Context a = fnd.a(view.getContext());
                lat.a(b.a(view.getContext()), hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 102, (byte) 109, (byte) 96, (byte) 102, (byte) 110, (byte) 104, (byte) 106, (byte) 119, (byte) 96, (byte) 103, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                lap a2 = this.a.b();
                lbg.a(a, this.a.b.C(), a2.b, (BiliSpaceArchiveVideo) a2.a, 1);
                law.a(bl.law.a.a("1", "11", null, "4"));
            }
        };

        b(Context context, lao bl_lao) {
            super(context, bl_lao);
        }

        public bl.mee.a a(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return d.b(viewGroup);
            }
            if (i == 4) {
                return f.a(viewGroup);
            }
            return null;
        }

        public Object a(int i) {
            boolean z = true;
            lap b = b();
            if (f(i) == 0) {
                if (b.b || !b.a(this.a)) {
                    z = false;
                }
                return new c(2131689994, ((BiliSpaceArchiveVideo) b.a).count, z, this.c);
            }
            return new Object[]{((BiliSpaceArchiveVideo) b.a).videos.get(f(i) - 1), Integer.valueOf(2)};
        }

        public int a() {
            lap b = b();
            if (b == null || b.d || b.c || b.a == null || ((BiliSpaceArchiveVideo) b.a).isEmpty() || (!b.b && !b.a(this.a))) {
                return 0;
            }
            return Math.min(((BiliSpaceArchiveVideo) b.a).videos.size(), 2) + 1;
        }

        public int b(int i) {
            if (f(i) == 0) {
                return 1;
            }
            return 4;
        }

        private lap<BiliSpaceArchiveVideo> b() {
            return this.b.t();
        }
    }

    /* compiled from: BL */
    public static class c extends a implements OnClickListener {
        public c(View view) {
            super(view);
            view.setOnClickListener(this);
            this.t.setOnClickListener(this);
        }

        public void b(Object obj) {
            if (obj != null && (obj instanceof laz)) {
                laz bl_laz = (laz) obj;
                fci.g().a(bl_laz.c, this.n);
                if (bl_laz.j > 0) {
                    this.o.setVisibility(0);
                    this.o.setText(lns.b(bl_laz.j * 1000));
                } else {
                    this.o.setVisibility(4);
                }
                this.p.setText(bl_laz.b);
                this.s.setVisibility(8);
                this.q.setText(mbw.a(bl_laz.k, "0"));
                this.r.setText(mbw.a(bl_laz.o, "0"));
                this.t.setVisibility(0);
                this.t.setTag(bl_laz);
                this.a.setTag(bl_laz);
            }
        }

        public static c a(ViewGroup viewGroup) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(2131428236, viewGroup, false));
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case 2131298861:
                    a(view);
                    return;
                default:
                    b(view);
                    return;
            }
        }

        private void a(View view) {
            Object tag = view.getTag();
            if (tag instanceof laz) {
                Context context = view.getContext();
                List arrayList = new ArrayList();
                laz bl_laz = (laz) tag;
                arrayList.add(gyn.a(context, hae.a(new byte[]{(byte) 80, (byte) 85, (byte) -21, (byte) -73, (byte) -76, (byte) -24, (byte) -90, (byte) -75, (byte) -26, (byte) -104, (byte) -69, (byte) -23, (byte) -123, (byte) -102, (byte) -24, (byte) -89, (byte) -80, (byte) -26, (byte) -82, (byte) -70}), bl_laz.f));
                fle a = gyn.a(context, bl_laz.f, hae.a(new byte[]{(byte) 80, (byte) 85, (byte) -21, (byte) -73, (byte) -76, (byte) -24, (byte) -90, (byte) -75, (byte) -26, (byte) -104, (byte) -69, (byte) -23, (byte) -123, (byte) -102, (byte) -24, (byte) -89, (byte) -80, (byte) -26, (byte) -82, (byte) -70}), 661);
                if (a != null) {
                    arrayList.add(a);
                }
                gyn.a(context, view, arrayList);
            }
        }

        private void b(View view) {
            Object tag = view.getTag();
            if (tag instanceof laz) {
                laz bl_laz = (laz) tag;
                if (lvl.a().c() && lvl.a().a(Integer.parseInt(bl_laz.f))) {
                    lvl.a().d();
                } else {
                    try {
                        kyq.a(view.getContext(), Integer.parseInt(bl_laz.f), 66);
                    } catch (NumberFormatException e) {
                        kyq.a(view.getContext(), Uri.parse(((laz) tag).e));
                    }
                }
                law.a(bl.law.a.a("3", "3", null, bl.law.b.a(bl_laz.f)));
            }
        }
    }

    /* compiled from: BL */
    static class d extends a {
        private OnClickListener c = new OnClickListener(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                lat.a(b.a(view.getContext()), hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 118, (byte) 112, (byte) 103, (byte) 104, (byte) 108, (byte) 113, (byte) 102, (byte) 109, (byte) 96, (byte) 102, (byte) 110, (byte) 104, (byte) 106, (byte) 119, (byte) 96, (byte) 103, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                hal.a(view.getContext(), hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 90, Byte.MAX_VALUE, (byte) 106, (byte) 107, (byte) 96, (byte) 90, (byte) 118, (byte) 112, (byte) 103, (byte) 104, (byte) 108, (byte) 113, (byte) 90, (byte) 104, (byte) 106, (byte) 119, (byte) 96}));
                ((AuthorSpaceActivity) fnd.a(view.getContext())).a(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 119, (byte) 108, (byte) 103, (byte) 112, (byte) 113, (byte) 96, (byte) 90, (byte) 100, (byte) 115}));
                law.a(bl.law.a.a("1", "3", null, "4"));
            }
        };

        d(Context context, lao bl_lao) {
            super(context, bl_lao);
        }

        public bl.mee.a a(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return d.b(viewGroup);
            }
            if (i == 4) {
                return f.a(viewGroup);
            }
            return null;
        }

        public Object a(int i) {
            lap b = b();
            if (f(i) == 0) {
                return new c(2131690000, ((BiliSpaceArchiveVideo) b.a).count, this.c);
            }
            return new Object[]{((BiliSpaceArchiveVideo) b.a).videos.get(f(i) - 1), Integer.valueOf(1)};
        }

        public int a() {
            lap b = b();
            if (b == null || b.d || b.c || b.a == null || ((BiliSpaceArchiveVideo) b.a).isEmpty()) {
                return 0;
            }
            return Math.min(((BiliSpaceArchiveVideo) b.a).videos.size(), 4) + 1;
        }

        public int b(int i) {
            if (f(i) == 0) {
                return 1;
            }
            return 4;
        }

        private lap<BiliSpaceArchiveVideo> b() {
            return this.b.q();
        }
    }

    /* compiled from: BL */
    static class e extends a {
        private OnClickListener c = new OnClickListener(this) {
            final /* synthetic */ e a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Context a = fnd.a(view.getContext());
                lap a2 = this.a.b();
                lbm.a(a, this.a.b.C(), a2.b, (BiliSpaceArchiveVideo) a2.a);
                law.a(bl.law.a.a("1", "12", null, "4"));
            }
        };

        e(Context context, lao bl_lao) {
            super(context, bl_lao);
        }

        public bl.mee.a a(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return d.b(viewGroup);
            }
            if (i == 4) {
                return f.a(viewGroup);
            }
            return null;
        }

        public Object a(int i) {
            boolean z = true;
            lap b = b();
            if (f(i) == 0) {
                if (b.b || !b.a(this.a)) {
                    z = false;
                }
                return new c(b.a(this.a) ? 2131694620 : 2131694619, ((BiliSpaceArchiveVideo) b.a).count, z, this.c);
            }
            return new Object[]{((BiliSpaceArchiveVideo) b.a).videos.get(f(i) - 1), Integer.valueOf(3)};
        }

        public int a() {
            lap b = b();
            if (b == null || b.d || b.c || b.a == null || ((BiliSpaceArchiveVideo) b.a).isEmpty() || (!b.b && !b.a(this.a))) {
                return 0;
            }
            return Math.min(((BiliSpaceArchiveVideo) b.a).videos.size(), 2) + 1;
        }

        public int b(int i) {
            if (f(i) == 0) {
                return 1;
            }
            return 4;
        }

        private lap<BiliSpaceArchiveVideo> b() {
            return this.b.u();
        }
    }

    /* compiled from: BL */
    public static class f extends b {
        protected ImageView n;
        protected TextView o;
        protected TextView p;
        protected TextView q;
        protected TextView r;
        private int s;
        private OnClickListener t = new OnClickListener(this) {
            final /* synthetic */ f a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                BiliSpaceVideo biliSpaceVideo = (BiliSpaceVideo) view.getTag();
                if (biliSpaceVideo != null && !ert.a(biliSpaceVideo.param)) {
                    int i = 6;
                    if (this.a.s == 1) {
                        i = 66;
                        lat.a(b.a(this.a.a.getContext()), hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 118, (byte) 112, (byte) 103, (byte) 104, (byte) 108, (byte) 113, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                        law.a(bl.law.a.a("1", "3", null, bl.law.b.a(biliSpaceVideo.param)));
                    } else if (this.a.s == 2) {
                        i = 62;
                        lat.a(b.a(this.a.a.getContext()), hae.a(new byte[]{(byte) 118, (byte) 117, (byte) 100, (byte) 102, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
                        law.a(bl.law.a.a("1", "11", "1", bl.law.b.a(biliSpaceVideo.param)));
                        fcz.a(hae.a(new byte[]{Byte.MAX_VALUE, (byte) 106, (byte) 107, (byte) 96, (byte) 90, (byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 102, (byte) 106, (byte) 108, (byte) 107, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[]{"a1", String.valueOf(1)});
                    } else if (this.a.s == 3) {
                        i = 65;
                        law.a(bl.law.a.a("1", "12", "1", bl.law.b.a(biliSpaceVideo.param)));
                    }
                    kyq.a(view.getContext(), Integer.parseInt(biliSpaceVideo.param), i);
                }
            }
        };

        public f(View view) {
            super(view);
            this.n = (ImageView) ButterKnife.a(view, 2131297178);
            this.o = (TextView) ButterKnife.a(view, 2131297464);
            this.p = (TextView) ButterKnife.a(view, 2131300682);
            this.q = (TextView) ButterKnife.a(view, 2131301258);
            this.r = (TextView) ButterKnife.a(view, 2131297262);
            view.setOnClickListener(this.t);
        }

        public void b(Object obj) {
            if (obj != null && (obj instanceof Object[])) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length >= 2 && (objArr[0] instanceof BiliSpaceVideo)) {
                    BiliSpaceVideo biliSpaceVideo = (BiliSpaceVideo) objArr[0];
                    this.s = ((Integer) objArr[1]).intValue();
                    fci.g().a(biliSpaceVideo.cover, this.n);
                    this.p.setText(biliSpaceVideo.title);
                    this.q.setText(mbw.a(biliSpaceVideo.play, "0"));
                    this.r.setText(mbw.a(biliSpaceVideo.danmaku, "0"));
                    if (biliSpaceVideo.duration > 0) {
                        this.o.setVisibility(0);
                        this.o.setText(lns.b(biliSpaceVideo.duration * 1000));
                    } else {
                        this.o.setVisibility(4);
                    }
                    this.a.setTag(biliSpaceVideo);
                }
            }
        }

        public static f a(ViewGroup viewGroup) {
            return new f(LayoutInflater.from(viewGroup.getContext()).inflate(2131428235, viewGroup, false));
        }
    }
}
