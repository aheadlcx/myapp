package bili.bl;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.g;
import android.support.v7.widget.RecyclerView.r;
import android.view.View;
import bl.eek.a;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomRecommendData;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveV2;
import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.recommend.LiveRoomMoreAdapter;
import com.bilibili.bililive.videoliveplayer.ui.live.roomv2.recommend.LiveRoomMoreAdapter.CardViewModel;
import java.util.List;

/* compiled from: BL */
public class eer extends eek {
    List<CardViewModel> j = null;
    LiveRoomMoreAdapter k;
    int l = 0;
    boolean m;
    int n;
    int o;
    a p = new a(this) {
        final /* synthetic */ eer a;

        {
            this.a = r1;
        }

        public void a() {
            this.a.b();
        }
    };
    private gnc<List<BiliLiveV2>> q = new gnc<List<BiliLiveV2>>(this) {
        final /* synthetic */ eer a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(@Nullable Object obj) {
            a((List) obj);
        }

        public void a(@Nullable List<BiliLiveV2> list) {
            if (this.a.isVisible()) {
                if (list == null || list.isEmpty()) {
                    this.a.a(2131692522, 2131233044);
                } else {
                    this.a.a(eeo.a((List) list));
                }
                this.a.z();
            }
        }

        public void a(Throwable th) {
            if (this.a.isVisible()) {
                if (this.a.k == null || this.a.k.a() == 0) {
                    this.a.a(this.a.p);
                }
                this.a.z();
            }
        }

        public boolean a() {
            return this.a.c();
        }
    };
    private gnc<BiliLiveRoomRecommendData> r = new gnc<BiliLiveRoomRecommendData>(this) {
        final /* synthetic */ eer a;

        {
            this.a = r1;
        }

        public /* synthetic */ void b(@Nullable Object obj) {
            a((BiliLiveRoomRecommendData) obj);
        }

        public void a(@Nullable BiliLiveRoomRecommendData biliLiveRoomRecommendData) {
            if (this.a.isVisible()) {
                if (biliLiveRoomRecommendData == null || biliLiveRoomRecommendData.mRooms == null || biliLiveRoomRecommendData.mRooms.isEmpty()) {
                    this.a.a(2131692522, 2131233044);
                } else {
                    this.a.a(eeo.a(biliLiveRoomRecommendData));
                }
                this.a.z();
            }
        }

        public void a(Throwable th) {
            if (this.a.isVisible()) {
                if (this.a.k == null || this.a.k.a() == 0) {
                    this.a.a(this.a.p);
                }
                this.a.z();
            }
        }

        public boolean a() {
            return this.a.c();
        }
    };

    public static eer a(int i, int i2, boolean z) {
        eer bl_eer = new eer();
        Bundle bundle = new Bundle();
        bundle.putInt(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97}), i);
        bundle.putInt(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 119, (byte) 113, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97}), i2);
        bundle.putBoolean(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96}), z);
        bl_eer.setArguments(bundle);
        return bl_eer;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        d();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.n = arguments.getInt(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97}), 0);
            this.o = arguments.getInt(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 119, (byte) 113, (byte) 87, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97}), 0);
            this.m = arguments.getBoolean(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 96}), false);
        }
        this.l = (int) coq.a(getContext(), 6.0f);
        this.k = new LiveRoomMoreAdapter(this.n, this.o);
        this.d.setAdapter(this.k);
        h();
    }

    protected void b() {
        if (eva.a(getContext()).a()) {
            doc.a().b(1, 15, this.r);
        } else {
            doc.a().a(1, 15, this.q);
        }
    }

    public void a(List<CardViewModel> list) {
        this.j = list;
        g();
    }

    private void g() {
        if (this.k != null && this.j != null && !this.j.isEmpty()) {
            e();
            this.k.a(this.j);
        }
    }

    private void h() {
        if (this.k != null) {
            this.k.a(this.m);
            int itemDecorationCount = this.d.getItemDecorationCount();
            for (int i = 0; i < itemDecorationCount; i++) {
                this.d.removeItemDecorationAt(i);
            }
            this.d.addItemDecoration(new g(this) {
                final /* synthetic */ eer a;

                {
                    this.a = r1;
                }

                public void a(Rect rect, View view, RecyclerView recyclerView, r rVar) {
                    super.a(rect, view, recyclerView, rVar);
                    if (recyclerView.getChildAdapterPosition(view) == 0) {
                        rect.top = this.a.l;
                    }
                    if (this.a.m) {
                        rect.bottom = this.a.l;
                    }
                }
            });
        }
    }
}
