package bili.bl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.u;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import bl.atg.b;
import bl.awx.c;
import com.bilibili.app.comm.comment2.CommentContext;
import com.bilibili.app.comm.comment2.model.BiliComment;
import com.bilibili.lib.account.subscribe.Topic;

/* compiled from: BL */
public class aqp extends aqd implements bl.awx.a, evl, bl.mep.a {
    private RecyclerView c;
    private ayr d;
    @Nullable
    private awx e;
    @Nullable
    private aqy f;
    private long g;
    private int h;
    private int i;
    private long j;
    private boolean k;
    private boolean l;
    private CommentContext m;
    private asz n;
    private atg o;
    private aqq p;
    private fcj q = new fcj(this) {
        final /* synthetic */ aqp a;

        {
            this.a = r1;
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
            int childCount = recyclerView.getChildCount();
            if (childCount > 0) {
                childCount = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1));
                if (childCount > 0 && childCount >= recyclerView.getAdapter().a() - 1) {
                    this.a.n.h();
                }
            }
        }
    };
    private b r = new bl.atg.a(this) {
        final /* synthetic */ aqp a;

        {
            this.a = r1;
        }

        public void a(boolean z) {
            boolean z2 = true;
            if (z) {
                this.a.b();
                return;
            }
            boolean z3;
            this.a.z();
            boolean z4 = !this.a.n.d.c();
            if (this.a.n.j()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z4) {
                if (z3) {
                    z2 = false;
                }
                e(z2);
            } else if (!this.a.n.k()) {
                if (z3) {
                    esu.b(this.a.getActivity(), 2131690847);
                } else {
                    this.a.d_();
                }
            }
            this.a.o();
        }

        public void b(boolean z) {
            int i = 0;
            if (!z) {
                this.a.z();
                this.a.c.scrollToPosition(0);
                if (!this.a.n.e.c()) {
                    i = 1;
                }
                if (i != 0) {
                    esu.b(this.a.getActivity(), 2131690847);
                }
            }
        }

        public void c(boolean z) {
            if (!z) {
                this.a.z();
            }
        }

        public void d(boolean z) {
            boolean z2 = true;
            super.d(z);
            if (z) {
                this.a.b();
                return;
            }
            boolean z3;
            this.a.p();
            this.a.z();
            boolean z4 = !this.a.n.g.c();
            if (this.a.n.j()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z4) {
                if (z3) {
                    z2 = false;
                }
                e(z2);
            } else if (!this.a.n.k()) {
                if (z3) {
                    esu.b(this.a.getActivity(), 2131690847);
                } else {
                    this.a.d_();
                }
            }
        }

        public void e(boolean z) {
            if (z) {
                this.a.c();
            } else {
                this.a.d();
            }
        }

        public void f(boolean z) {
            if (z) {
                this.a.m();
                if (this.a.b != null) {
                    this.a.b.a();
                }
            } else {
                this.a.n();
            }
            this.a.o();
        }

        public void g(boolean z) {
            super.g(z);
            if (this.a.b != null) {
                this.a.b.a(z);
            }
        }

        public void a(int i) {
            super.a(i);
            if (this.a.b != null) {
                this.a.b.a(i);
            }
        }
    };

    /* compiled from: BL */
    public static final class a implements fit<Fragment> {
        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public Fragment a(fjg bl_fjg) {
            return aqp.a(bl_fjg.b);
        }
    }

    public static aqp a(Bundle bundle) {
        aqp bl_aqp = new aqp();
        bl_aqp.setArguments(bundle);
        return bl_aqp;
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 108, (byte) 118, (byte) 113, (byte) 63, (byte) 37, (byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 37, (byte) 100, (byte) 119, (byte) 98, (byte) 112, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 118, (byte) 43}));
        }
        this.g = arguments.getLong("oid");
        this.h = arguments.getInt("type");
        this.i = arguments.getInt(hae.a(new byte[]{(byte) 118, (byte) 112, (byte) 103, (byte) 81, (byte) 124, (byte) 117, (byte) 96}));
        this.j = arguments.getLong(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 102, (byte) 109, (byte) 106, (byte) 119}));
        String string = arguments.getString(hae.a(new byte[]{(byte) 112, (byte) 117, (byte) 117, (byte) 96, (byte) 119, (byte) 65, (byte) 96, (byte) 118, (byte) 102}));
        this.l = arguments.getBoolean(hae.a(new byte[]{(byte) 118, (byte) 124, (byte) 107, (byte) 102, (byte) 67, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 108, (byte) 107, (byte) 98}));
        this.k = arguments.getBoolean(hae.a(new byte[]{(byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 76, (byte) 107, (byte) 117, (byte) 112, (byte) 113}), true);
        boolean z = arguments.getBoolean(hae.a(new byte[]{(byte) 99, (byte) 105, (byte) 106, (byte) 100, (byte) 113, (byte) 76, (byte) 107, (byte) 117, (byte) 112, (byte) 113}), true);
        String string2 = arguments.getString("from");
        if (this.g <= 0) {
            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 37, (byte) 102, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 102, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 125, (byte) 113}));
        }
        this.m = new CommentContext(this.g, this.h, this.i);
        this.m.a(string);
        this.m.a(this.l);
        this.m.b(z);
        this.m.b(string2);
        this.n = new asz(getActivity(), this.m);
        this.o = new atg(this.n, this.r);
        if (!this.k) {
            this.m.b(true);
        }
        this.e = new awx(getActivity(), this.m);
        this.e.a(this.n);
        this.e.a((bl.awx.a) this);
        this.e.a();
        this.f = new aqy(getActivity(), this.m, new arb(true, this.m.e()), this.e);
    }

    public void a(FrameLayout frameLayout, RecyclerView recyclerView, FrameLayout frameLayout2, @Nullable Bundle bundle) {
        this.n.a();
        super.a(frameLayout, recyclerView, frameLayout2, bundle);
        this.c = recyclerView;
        b((ViewGroup) frameLayout2);
        recyclerView.addOnScrollListener(this.q);
        recyclerView.setBackgroundResource(2131099880);
        this.p = new aqq(this.n, this.j, h());
        LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), 1, false);
        recyclerView.addItemDecoration(new mec(this, 2131099888, awo.a(getContext(), 1.0f) / 2) {
            final /* synthetic */ aqp a;

            protected boolean a(u uVar) {
                return this.a.p.e(uVar);
            }
        });
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.p);
        eva.a(getActivity()).a((evl) this, Topic.SIGN_IN, Topic.SIGN_OUT);
    }

    private void b(ViewGroup viewGroup) {
        if (this.k && this.f != null) {
            this.f.a(viewGroup);
        }
    }

    public void a(BiliComment biliComment, c cVar) {
        if (this.f != null) {
            this.f.a(biliComment, cVar);
        }
        b(biliComment);
        if (this.b != null) {
            this.b.b(new ash(getActivity(), this.m, this.n.e(), biliComment));
        }
    }

    private void b(BiliComment biliComment) {
        if (biliComment.mRpId > 0 && getUserVisibleHint()) {
            int a = this.p.a(biliComment.mRpId);
            if (a >= 0) {
                this.c.scrollToPosition(a);
            }
        }
    }

    private void l() {
        if (this.d == null || this.d.getParent() == null) {
            FrameLayout e = e();
            this.d = new ayr(getActivity());
            LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            layoutParams.topMargin = (int) (getResources().getDisplayMetrics().density * 72.0f);
            e.addView(this.d, layoutParams);
        }
    }

    private void m() {
        l();
        this.d.a(2131234241, 2131691953);
    }

    private void n() {
        if (this.d != null) {
            this.d.a();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        A();
        i();
    }

    protected void setUserVisibleCompat(boolean z) {
        super.setUserVisibleCompat(z);
        if (z) {
            p();
        }
    }

    public void i() {
        boolean a;
        super.i();
        if (this.j > 0) {
            a = this.n.a(this.j);
        } else {
            a = this.n.i();
            if (!a) {
                a = this.n.g();
            }
        }
        if (!a) {
            z();
        }
    }

    public void j() {
        if (isAdded() && this.c != null) {
            A();
            if (!this.n.g()) {
                z();
            }
        }
    }

    public void k() {
        if (isAdded() && this.c != null && this.n.j()) {
            A();
            i();
        }
    }

    private void o() {
        if (this.n != null && this.f != null) {
            if (this.n.d().i()) {
                this.f.a();
            } else if (this.n.k()) {
                this.f.d();
            } else {
                this.f.c();
            }
        }
    }

    private void p() {
        if (this.j > 0 && getUserVisibleHint() && !this.n.j()) {
            long j = this.j;
            if (this.n.g.c()) {
                this.j = -1;
            }
            int a = this.p.a(j);
            if (a < 0) {
                esu.b(getApplicationContext(), 2131690850);
            } else {
                this.c.scrollToPosition(a);
            }
        }
    }

    public void onDestroyView() {
        this.n.b();
        super.onDestroyView();
        eva.a(getActivity()).b((evl) this, Topic.SIGN_IN, Topic.SIGN_OUT);
    }

    public void onDestroy() {
        super.onDestroy();
        this.o.a();
        if (this.e != null) {
            this.e.b();
        }
    }

    public Fragment a() {
        return this;
    }

    public void a(Topic topic) {
        if (topic == Topic.SIGN_IN || topic == Topic.SIGN_OUT) {
            A();
            if (!this.n.g()) {
                z();
            }
        }
    }

    public void a(BiliComment biliComment) {
        super.a(biliComment);
        if (this.n != null) {
            this.n.a(biliComment);
            b(biliComment);
        }
    }

    public void g() {
        if (this.m != null && this.m.i()) {
            return;
        }
        if ((this.n == null || !this.n.k()) && this.f != null) {
            this.f.a(false);
        }
    }
}
