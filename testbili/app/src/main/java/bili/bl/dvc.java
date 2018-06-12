package bili.bl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.GridLayoutManager.c;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import bl.dva.a;
import bl.dva.b;
import com.bilibili.bililive.videoliveplayer.ui.StubSingleFragmentActivity;
import com.bilibili.bililive.videoliveplayer.ui.base.placeholderview.ContentViewSwitcher;
import com.bilibili.bililive.videoliveplayer.ui.live.attention.items.LiveAttention;
import com.bilibili.bililive.videoliveplayer.ui.live.attention.items.LiveAttentionClose;
import com.bilibili.bililive.videoliveplayer.ui.live.center.LiveAttentionAnchorFragment;
import java.util.List;
import tv.danmaku.bili.widget.swiperefresh.SwipeRefreshLayout;

/* compiled from: BL */
public class dvc extends drr implements b {
    private RecyclerView a;
    private drp b;
    private a c;
    private dvs.a d = new dvd(this);
    private dvn.a e = new dve(this);
    private dvp.a f = new dvf(this);

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            dqo.a(new dqv.a().a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 99, (byte) 106, (byte) 105, (byte) 105, (byte) 106, (byte) 114, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114})).a());
        }
        if (getActivity() != null && (getActivity() instanceof cma)) {
            getActivity().setTitle(2131692310);
            ViewGroup m = ((cma) getActivity()).m();
            Button button = (Button) LayoutInflater.from(getContext()).inflate(2131427765, m, false);
            button.setText(2131692481);
            button.setOnClickListener(new dvg(this));
            button.setVisibility(0);
            m.addView(button);
        }
        if (this.b == null) {
            this.b = new drp();
            this.b.a(dvm.class, new dvr.a(), null);
            this.b.a(LiveAttention.class, new dvs.b(false), this.d);
            this.b.a(LiveAttentionClose.class, new dvn.b(), this.e);
            this.b.a(dvl.class, new dvp.b(), this.f);
        }
        if (this.c == null) {
            this.c = new dvh(this);
        }
    }

    final /* synthetic */ void b(View view) {
        getActivity().startActivity(LiveAttentionAnchorFragment.a(getActivity()));
    }

    protected View a(LayoutInflater layoutInflater, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(2131428726, null);
        this.a = (RecyclerView) inflate.findViewById(2131299639);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(2131300465);
        swipeRefreshLayout.setColorSchemeResources(new int[]{2131100837});
        a(swipeRefreshLayout);
        a((ContentViewSwitcher) inflate.findViewById(2131297116));
        return inflate;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        LayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        this.a.setLayoutManager(gridLayoutManager);
        gridLayoutManager.a(new c(this) {
            final /* synthetic */ dvc b;

            {
                this.b = r1;
            }

            public int a(int i) {
                if (this.b.b.b().get(i) instanceof LiveAttention) {
                    return 1;
                }
                return 2;
            }
        });
        this.a.setAdapter(this.b);
        this.a.addOnScrollListener(new l(this) {
            final /* synthetic */ dvc a;

            {
                this.a = r1;
            }

            public void a(RecyclerView recyclerView, int i, int i2) {
                int childCount = recyclerView.getChildCount();
                if (childCount > 0 && recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) >= this.a.b.a() - 5) {
                    this.a.c.a(false);
                }
            }
        });
        this.a.addItemDecoration(new dvb(getContext()));
        this.a.addOnScrollListener(new fcj());
        i();
        this.c.d();
    }

    public void a(List<Object> list) {
        j();
        k();
        this.b.a((List) list);
    }

    public void a(List<Object> list, boolean z) {
        a(z, false);
        if (list != null && !list.isEmpty()) {
            this.b.a((List) list, this.b.a() - 1);
        }
    }

    public void a() {
        j();
        a(2131233044, 2131692350);
    }

    public void b() {
        j();
        b(2131234254, 2131692685);
    }

    public void c() {
        a(false, true);
    }

    protected void n() {
        super.n();
        this.c.d();
    }

    final /* synthetic */ void a(LiveAttention liveAttention, int i) {
        if (getActivity() != null) {
            getActivity().startActivity(drb.a(getActivity(), liveAttention.mRoomId, 21001));
            return;
        }
        blg.a().startActivity(drb.a(blg.a(), liveAttention.mRoomId, 21001));
    }

    final /* synthetic */ void a(LiveAttentionClose liveAttentionClose, int i) {
        if (getActivity() != null) {
            getActivity().startActivity(drb.a(getActivity(), liveAttentionClose.mRoomId, 21002));
            return;
        }
        blg.a().startActivity(drb.a(blg.a(), liveAttentionClose.mRoomId, 21002));
    }

    final /* synthetic */ void a(dvl bl_dvl, int i) {
        a(true, false);
        this.c.a(false);
    }

    private void a(boolean z, boolean z2) {
        int a = this.b.a() - 1;
        if (this.b.b().get(a) instanceof dvl) {
            dvl bl_dvl = (dvl) this.b.b().get(a);
            bl_dvl.a = z;
            bl_dvl.b = z2;
            this.b.d(a);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.c.c();
    }

    public static Intent b(Context context) {
        return StubSingleFragmentActivity.a(context, dvc.class, null);
    }
}
