package bili.bl;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bilibili.bililive.videoliveplayer.net.BiliLiveApiV2Service.Type;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRoomInfo;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveSearchResult;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveSearchResult.Room;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.widget.RoundCardFrameLayout;

/* compiled from: BL */
public class efs extends drl<BiliLiveSearchResult> {
    private a e;
    private doc f;
    private String g;

    /* compiled from: BL */
    class a extends android.support.v7.widget.RecyclerView.a<u> {
        List<Room> a = new ArrayList();
        final /* synthetic */ efs b;

        public a(efs bl_efs) {
            this.b = bl_efs;
        }

        public u b(ViewGroup viewGroup, int i) {
            return new b(viewGroup);
        }

        public void a(u uVar, int i) {
            ((b) uVar).b(this.a.get(i));
        }

        public int a() {
            return this.a.size();
        }

        public long f_(int i) {
            return (long) ((Room) this.a.get(i)).mRoomid;
        }
    }

    /* compiled from: BL */
    static class b extends bl.ehl.a {
        ImageView n = ((ImageView) ButterKnife.a(this.a, 2131297178));
        TextView o = ((TextView) ButterKnife.a(this.a, 2131300682));
        TextView p = ((TextView) ButterKnife.a(this.a, 2131301037));
        TextView q = ((TextView) ButterKnife.a(this.a, 2131298262));
        TintImageView r = ((TintImageView) ButterKnife.a(this.a, 2131298861));
        OnClickListener s = new OnClickListener(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Object tag = view.getTag();
                if (tag instanceof Room) {
                    Context a = fnd.a(view.getContext());
                    if (a != null) {
                        Room room = (Room) tag;
                        BiliLiveRoomInfo biliLiveRoomInfo = new BiliLiveRoomInfo();
                        biliLiveRoomInfo.mRoomId = room.mRoomid;
                        biliLiveRoomInfo.mAttention = room.mOnline;
                        biliLiveRoomInfo.mFace = room.mFace;
                        biliLiveRoomInfo.mUname = room.mName;
                        a.startActivity(drb.a(a, biliLiveRoomInfo, 23001));
                        this.a.g();
                    }
                }
            }
        };

        public b(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(2131428667, viewGroup, false));
        }

        public void b(Object obj) {
            if (obj instanceof Room) {
                final Room room = (Room) obj;
                fci.g().a(room.mCover, this.n);
                this.o.setText(room.mTitle);
                if (room.mName != null) {
                    this.p.setText(room.mName);
                } else {
                    this.p.setText("...");
                }
                this.q.setText(com.a(room.mOnline, "0"));
                this.a.setTag(room);
                this.r.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ b b;

                    public void onClick(View view) {
                        new egg().a(view.getContext(), view, room.mRoomid, 0);
                    }
                });
            } else {
                this.a.setTag(null);
            }
            this.a.setOnClickListener(this.s);
        }
    }

    protected /* synthetic */ void b(dof bl_dof) {
        a((BiliLiveSearchResult) bl_dof);
    }

    protected void k() {
        this.f = doc.a();
    }

    protected void a(RecyclerView recyclerView) {
        LayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 2);
        gridLayoutManager.d(true);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    protected void b(RecyclerView recyclerView) {
        recyclerView.addItemDecoration(new mds(recyclerView.getResources().getDimensionPixelSize(2131165508) - RoundCardFrameLayout.a(recyclerView.getContext()), 2));
    }

    protected void l() {
        this.e = new a(this);
        this.e.b(true);
    }

    protected android.support.v7.widget.RecyclerView.a m() {
        return this.e;
    }

    protected void a(Bundle bundle) {
        this.g = getArguments().getString(hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 114, (byte) 106, (byte) 119, (byte) 97}));
        String string = getArguments().getString(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}));
        if (string != null) {
            a((dof) (BiliLiveSearchResult) ang.a(string, BiliLiveSearchResult.class));
        } else if (!t()) {
            A();
            b(1);
        }
    }

    protected void a(BiliLiveSearchResult biliLiveSearchResult) {
        if (biliLiveSearchResult == null || biliLiveSearchResult.mRooms == null) {
            n();
            return;
        }
        if (biliLiveSearchResult.mRooms.mList == null) {
            biliLiveSearchResult.mRooms.mList = new ArrayList();
        }
        List list = biliLiveSearchResult.mRooms.mList;
        c(biliLiveSearchResult.mRooms.getTotalPage());
        if (u() == 1) {
            this.e.a.clear();
        }
        this.e.a.addAll(list);
        this.e.f();
        if (u() == 1) {
            if (list.isEmpty()) {
                a(2131234245, false);
            } else {
                r();
            }
        }
        if (!(j() || (u() == 1 && list.isEmpty()))) {
            f();
        }
        if (u() == 1) {
            b().b(biliLiveSearchResult.mRooms);
        }
    }

    protected void b(int i) {
        this.f.a(new com.bilibili.bililive.videoliveplayer.net.BiliLiveApiV2Service.b(this.g, Type.ROOM, i, 20), new gnc<BiliLiveSearchResult>(this) {
            final /* synthetic */ efs a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(Object obj) {
                a((BiliLiveSearchResult) obj);
            }

            public void a(BiliLiveSearchResult biliLiveSearchResult) {
                this.a.a((dof) biliLiveSearchResult);
            }

            public void a(Throwable th) {
                this.a.n();
            }
        });
    }

    protected boolean v() {
        return false;
    }

    public static efs a(String str, BiliLiveSearchResult biliLiveSearchResult) {
        efs bl_efs = new efs();
        Bundle bundle = new Bundle();
        bundle.putString(hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 114, (byte) 106, (byte) 119, (byte) 97}), str);
        bundle.putString(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), zy.a((Object) biliLiveSearchResult));
        bl_efs.setArguments(bundle);
        return bl_efs;
    }
}
