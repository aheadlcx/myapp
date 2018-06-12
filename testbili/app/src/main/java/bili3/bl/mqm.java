package bili3.bl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.r;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tv.danmaku.biliplayer.features.danmaku.filter.api.UserKeywordItem;

/* compiled from: BL */
public class mqm {
    private View a;
    private TextView b;
    private RecyclerView c;
    private List<UserKeywordItem> d;
    private List<UserKeywordItem> e;
    private a f;
    private mfd g;
    private b h;
    private Runnable i = new Runnable(this) {
        final /* synthetic */ mqm a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.h != null) {
                this.a.h.a(0, this.a.d.size());
            }
        }
    };

    /* compiled from: BL */
    public interface a {
        void a(int i, UserKeywordItem userKeywordItem, bl.mhy.a aVar);

        void a(int i, UserKeywordItem userKeywordItem, bl.mhy.c cVar);

        void a(List<UserKeywordItem> list, bl.mhy.b bVar);
    }

    /* compiled from: BL */
    class b extends android.support.v7.widget.RecyclerView.a<d> {
        final /* synthetic */ mqm a;

        private b(mqm bl_mqm) {
            this.a = bl_mqm;
        }

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        public d a(ViewGroup viewGroup, int i) {
            return new d(this.a, LayoutInflater.from(viewGroup.getContext()).inflate(2131428362, viewGroup, false));
        }

        public void a(d dVar, int i) {
            if (i >= 0 && i < this.a.d.size()) {
                UserKeywordItem userKeywordItem = (UserKeywordItem) this.a.d.get(i);
                dVar.r.setText(userKeywordItem.d);
                dVar.r.requestLayout();
                if (userKeywordItem.b == -2024) {
                    dVar.o.setVisibility(0);
                    if (this.a.e == null || !this.a.e.contains(userKeywordItem)) {
                        dVar.b();
                        dVar.p.setText(2131695088);
                        return;
                    }
                    dVar.a();
                    dVar.p.setText(2131695090);
                    return;
                }
                dVar.o.setVisibility(4);
            }
        }

        public int a() {
            return this.a.d == null ? 0 : this.a.d.size();
        }
    }

    /* compiled from: BL */
    class c extends g {
        final /* synthetic */ mqm a;
        private Paint b;
        private float c;
        private float d;

        private c(mqm bl_mqm) {
            this.a = bl_mqm;
            this.c = 0.0f;
            this.d = 0.0f;
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
            super.a(rect, view, recyclerView, rVar);
            if (this.c <= 0.0f) {
                this.c = (recyclerView.getResources().getDimension(2131165823) * 2.0f) + 1.0f;
            }
            if (this.d <= 0.0f) {
                this.d = recyclerView.getResources().getDimension(2131165824);
            }
            int f = ((h) view.getLayoutParams()).f();
            int a = recyclerView.getAdapter().a();
            if (f % 2 == 0) {
                rect.right = (int) (this.c / 2.0f);
            } else {
                rect.left = (int) (this.c / 2.0f);
            }
            if (f >= 0) {
                if (f < a - (a % 2 == 0 ? 2 : 1)) {
                    rect.bottom = (int) this.d;
                }
            }
        }

        public void a(Canvas canvas, RecyclerView recyclerView, r rVar) {
            super.a(canvas, recyclerView, rVar);
            if (this.b == null) {
                this.b = new Paint(1);
                this.b.setColor(recyclerView.getResources().getColor(2131101031));
            }
            View childAt = recyclerView.getChildAt(0);
            if (childAt != null) {
                int right = (int) (((float) childAt.getRight()) + (this.c / 2.0f));
                Canvas canvas2 = canvas;
                canvas2.drawRect((float) right, (float) recyclerView.getTop(), (float) (right + 1), (float) recyclerView.getBottom(), this.b);
            }
        }
    }

    /* compiled from: BL */
    class d extends u implements OnClickListener {
        public View n;
        public ViewGroup o;
        public TextView p = ((TextView) this.o.getChildAt(0));
        public ImageView q = ((ImageView) this.o.getChildAt(1));
        public TextView r;
        public Animation s;
        final /* synthetic */ mqm t;

        public d(mqm bl_mqm, View view) {
            this.t = bl_mqm;
            super(view);
            this.n = view.findViewById(2131297304);
            this.o = (ViewGroup) view.findViewById(2131299709);
            this.r = (TextView) view.findViewById(2131298409);
            this.s = AnimationUtils.loadAnimation(this.q.getContext(), 2130772002);
            if (this.n != null) {
                this.n.setOnClickListener(this);
            }
            if (this.o != null) {
                this.o.setOnClickListener(this);
            }
        }

        public void onClick(View view) {
            int g = g();
            if (view == this.n) {
                this.t.c(g);
            } else if (view == this.o || view == this.p) {
                this.o.setEnabled(false);
                this.p.setEnabled(false);
                this.p.setText(2131695090);
                a();
                this.t.a(g, new bl.mhy.a(this) {
                    final /* synthetic */ d a;

                    {
                        this.a = r1;
                    }

                    public void a(UserKeywordItem userKeywordItem) {
                        this.a.b();
                        mny.b(this.a.t.g, 2131689661);
                        this.a.p.setVisibility(4);
                        this.a.p.setEnabled(true);
                        this.a.o.setEnabled(true);
                        this.a.p.setText(2131695088);
                    }

                    public void a(int i, String str, UserKeywordItem userKeywordItem) {
                        this.a.b();
                        if (TextUtils.isEmpty(str)) {
                            mny.b(this.a.t.g, 2131689670);
                        } else {
                            mny.c(this.a.t.g, str);
                        }
                        this.a.p.setEnabled(true);
                        this.a.o.setEnabled(true);
                        this.a.p.setText(2131695088);
                    }
                });
            }
        }

        public void a() {
            this.q.startAnimation(this.s);
        }

        public void b() {
            this.q.clearAnimation();
        }
    }

    public mqm(@NonNull Context context, ViewGroup viewGroup, a aVar, mfd bl_mfd) {
        this.a = LayoutInflater.from(context).inflate(2131427977, viewGroup, false);
        this.c = (RecyclerView) this.a.findViewById(2131298410);
        this.b = (TextView) this.a.findViewById(2131297527);
        this.d = new ArrayList();
        this.f = aVar;
        this.g = bl_mfd;
        b();
    }

    public void a(@StringRes int i) {
        if (this.b != null) {
            this.b.setText(i);
        }
    }

    public View a(@NonNull List<UserKeywordItem> list) {
        this.d = list;
        a();
        return this.a;
    }

    public void a(UserKeywordItem userKeywordItem) {
        if (userKeywordItem != null && !TextUtils.isEmpty(userKeywordItem.d)) {
            this.d.add(0, userKeywordItem);
            b(0);
            this.c.scrollToPosition(0);
            c();
        }
    }

    public void b(int i) {
        if (this.d != null && i >= 0 && i < this.d.size()) {
            this.h.e(i);
            this.h.a(i, this.d.size() - i);
        }
    }

    public void a() {
        if (this.h != null) {
            this.h.f();
        }
        c();
    }

    public void a(Context context) {
        if (this.d != null && !this.d.isEmpty() && this.f != null) {
            if (this.e == null) {
                this.e = new CopyOnWriteArrayList();
            }
            this.e.clear();
            for (int i = 0; i < this.d.size(); i++) {
                UserKeywordItem userKeywordItem = (UserKeywordItem) this.d.get(i);
                if (userKeywordItem.b == -2024) {
                    this.e.add(userKeywordItem);
                }
            }
            a();
            if (!this.e.isEmpty()) {
                this.f.a(this.e, new bl.mhy.b(this) {
                    final /* synthetic */ mqm a;

                    {
                        this.a = r1;
                    }

                    public void a(int i, int i2) {
                        this.a.e.clear();
                        if (this.a.c != null) {
                            this.a.c.removeCallbacks(this.a.i);
                            this.a.c.postDelayed(this.a.i, 1000);
                        }
                    }

                    public void a(UserKeywordItem userKeywordItem) {
                        this.a.e.remove(userKeywordItem);
                        if (this.a.c != null) {
                            this.a.c.removeCallbacks(this.a.i);
                            this.a.c.postDelayed(this.a.i, 1000);
                        }
                    }

                    public void a(int i, String str, UserKeywordItem userKeywordItem) {
                        this.a.e.remove(userKeywordItem);
                        if (this.a.c != null) {
                            this.a.c.removeCallbacks(this.a.i);
                            this.a.c.postDelayed(this.a.i, 1000);
                        }
                    }
                });
            }
        }
    }

    private void b() {
        if (this.c != null) {
            this.c.setLayoutManager(new GridLayoutManager(this.c.getContext(), 2));
            this.h = new b();
            this.c.setAdapter(this.h);
            this.c.addItemDecoration(new c());
        }
    }

    private void c() {
        if (this.d == null || this.d.isEmpty()) {
            this.c.setVisibility(4);
            this.b.setVisibility(0);
            return;
        }
        this.b.setVisibility(8);
        this.c.setVisibility(0);
    }

    private void c(final int i) {
        if (i >= 0 && i < this.d.size() && this.f != null) {
            this.f.a(i, (UserKeywordItem) this.d.get(i), new bl.mhy.c(this) {
                final /* synthetic */ mqm a;

                {
                    this.a = r1;
                }

                public void a(boolean z) {
                }
            });
            this.d.remove(i);
            this.h.f(i);
            this.c.post(new Runnable(this) {
                final /* synthetic */ mqm b;

                public void run() {
                    this.b.h.a(i, this.b.d.size() - i);
                }
            });
            c();
        }
    }

    private void a(int i, bl.mhy.a aVar) {
        if (i >= 0 && i < this.d.size() && this.f != null) {
            this.f.a(i, (UserKeywordItem) this.d.get(i), aVar);
        }
    }
}
