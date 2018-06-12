package bili2.bl;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import tv.danmaku.bili.widget.LoadingImageView;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout.b;

/* compiled from: BL */
public abstract class lhh extends lhg implements b {
    protected LoadingImageView a;
    protected Toolbar b;
    Runnable c = new Runnable(this) {
        final /* synthetic */ lhh a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.e != null) {
                this.a.e.setRefreshing(true);
            }
            this.a.g = SystemClock.elapsedRealtime();
        }
    };
    Runnable d = new Runnable(this) {
        final /* synthetic */ lhh a;

        {
            this.a = r1;
        }

        public void run() {
            if (this.a.e != null) {
                this.a.e.setRefreshing(false);
            }
        }
    };
    private SwipeRefreshLayout e;
    private RecyclerView f;
    private long g;

    public void i() {
        this.g = SystemClock.elapsedRealtime();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131427808, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a = (LoadingImageView) view.findViewById(2131298656);
        this.e = (SwipeRefreshLayout) view.findViewById(2131300463);
        this.e.setColorSchemeResources(new int[]{2131100837});
        this.e.setOnRefreshListener(this);
        this.f = (RecyclerView) view.findViewById(2131299628);
        this.b = (Toolbar) view.findViewById(2131298932);
        a(this.f, bundle);
    }

    public void a(RecyclerView recyclerView, Bundle bundle) {
    }

    public Toolbar e() {
        return this.b;
    }

    protected Toolbar b() {
        return this.b;
    }

    public final void f() {
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.g);
        if (elapsedRealtime < 0 || elapsedRealtime >= 500) {
            this.e.post(this.d);
        } else {
            this.e.postDelayed(this.d, (long) (500 - elapsedRealtime));
        }
    }

    public void onPause() {
        super.onPause();
        if (this.e != null) {
            this.e.setRefreshing(false);
            this.e.destroyDrawingCache();
            this.e.clearAnimation();
        }
    }

    public final RecyclerView g() {
        return this.f;
    }

    public void h() {
        if (this.a != null) {
            this.a.setVisibility(0);
            this.a.a();
        }
    }

    public void l() {
        if (this.a != null) {
            this.a.b();
            this.a.setVisibility(8);
        }
    }

    public void m() {
        if (this.a != null) {
            if (!this.a.isShown()) {
                this.a.setVisibility(0);
            }
            this.a.c();
        }
    }
}
