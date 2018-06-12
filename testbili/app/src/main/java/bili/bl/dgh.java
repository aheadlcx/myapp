package bili.bl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import bl.dbg.a;
import bl.dge.b;
import com.bilibili.bilibililive.im.entity.User;
import com.bilibili.bilibililive.uibase.widget.LoadingImageView;
import com.bilibili.bililive.painting.api.entity.PaintingItem;
import com.bilibili.bililive.painting.home.model.RefreshLikeEvent;
import com.bilibili.bililive.painting.rank.ui.PaintingRankListActivity;
import com.bilibili.bililive.painting.tag.ui.PaintingCampaignActivity;
import com.bilibili.bililive.painting.tag.ui.TaggedPaintingActivity;
import com.bilibili.bililive.painting.utils.PaintingAnimHelper;
import com.bilibili.upper.videoup.model.TaskMessage;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import tv.danmaku.frontia.SyncPluginManager.Mode;

/* compiled from: BL */
public class dgh extends dbl implements b {
    private static final String e = hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124});
    private static final String f = hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 81, (byte) 124, (byte) 117, (byte) 96});
    private static final String g = hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 72, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 117, (byte) 105, (byte) 96});
    private String h;
    private String i;
    private int j;
    private int k;
    private int l;
    private boolean m = false;
    private dgg n;
    private dgf o;
    private List<dbd> p;
    private int q;

    public static dgh a(int i, int i2, String str, String str2, int i3, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        bundle.putInt("biz", i);
        bundle.putString(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124}), str);
        bundle.putString("tag", str2);
        bundle.putInt(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 81, (byte) 124, (byte) 117, (byte) 96}), i3);
        bundle.putBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 72, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 117, (byte) 105, (byte) 96}), z);
        dgh bl_dgh = new dgh();
        bl_dgh.setArguments(bundle);
        return bl_dgh;
    }

    public static dgh a(int i, String str, String str2, int i2) {
        return a(i, 0, str, str2, i2, true);
    }

    public static dgh a(int i, String str, int i2) {
        return a(i, 1, str, null, i2, true);
    }

    public static dgh a(int i, String str, String str2) {
        return a(i, 2, str, str2, 2, false);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View inflate = layoutInflater.inflate(2131428930, viewGroup, false);
        this.h = getArguments().getString(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 113, (byte) 96, (byte) 98, (byte) 106, (byte) 119, (byte) 124}), BuildConfig.VERSION_NAME);
        this.i = getArguments().getString("tag");
        this.j = getArguments().getInt("biz");
        this.l = getArguments().getInt(hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 96, (byte) 118, (byte) 113, (byte) 81, (byte) 124, (byte) 117, (byte) 96}), 2);
        this.k = getArguments().getInt("type", 2);
        this.a = (RecyclerView) inflate.findViewById(2131298556);
        this.b = (LoadingImageView) inflate.findViewById(2131298656);
        return inflate;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        EventBus.getDefault().register(this);
        this.p = new ArrayList();
        this.o = new dgf(this);
        b();
    }

    private void b(boolean z) {
        if (this.k == 0) {
            this.o.a(this.i, this.l, z);
            this.q = 11;
        } else if (this.k == 1) {
            this.o.a(this.j, this.k, this.h, this.i, this.l, z);
            this.q = 12;
        } else if (this.k == 2) {
            this.o.a(this.j, this.k, this.h, this.i, this.l, z);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ dgh a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.b(false);
            }
        });
        if (!getArguments().getBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 72, (byte) 112, (byte) 105, (byte) 113, (byte) 108, (byte) 117, (byte) 105, (byte) 96}), false)) {
            b(false);
        }
    }

    protected void x() {
        super.x();
        if (this.n == null || this.n.a() <= 0) {
            b(false);
        }
        if (this.l == 7) {
            b(hae.a(new byte[]{(byte) 124, (byte) 114, (byte) 109, (byte) 90, (byte) 113, (byte) 100, (byte) 103, (byte) 90, (byte) 114, (byte) 96, (byte) 96, (byte) 110}));
        } else if (this.l == -2) {
            b(hae.a(new byte[]{(byte) 124, (byte) 114, (byte) 109, (byte) 90, (byte) 113, (byte) 100, (byte) 103, (byte) 90, (byte) 104, (byte) 106, (byte) 107, (byte) 113, (byte) 109}));
        } else if (this.l == -3) {
            b(hae.a(new byte[]{(byte) 124, (byte) 114, (byte) 109, (byte) 90, (byte) 113, (byte) 100, (byte) 103, (byte) 90, (byte) 107, (byte) 96, (byte) 114, (byte) 96, (byte) 118, (byte) 113}));
        }
    }

    public void K_() {
        super.K_();
        b(true);
    }

    public void a(int i, List<dbd> list, boolean z) {
        if (z) {
            this.d.setRefreshing(false);
            this.n.b_(list);
            this.p.clear();
            a((List) list);
        } else {
            this.n.a((List) list);
            a((List) list);
        }
        if (list != null && list.size() < 20 && this.n.a() > 0) {
            this.m = true;
            this.n.a(true);
        } else if ((list == null || list.isEmpty()) && this.n.a() > 0) {
            this.m = true;
            this.n.a(true);
        } else if ((list == null || list.isEmpty()) && this.n.a() <= 0) {
            this.m = false;
            q();
        } else {
            this.m = false;
            this.n.a(false);
        }
        if (getActivity() instanceof PaintingCampaignActivity) {
            ((PaintingCampaignActivity) getActivity()).a(i);
        }
    }

    public void a(List<dbd> list, boolean z) {
        if (z) {
            this.d.setRefreshing(false);
            this.n.b_(list);
            this.p.clear();
            a((List) list);
        } else {
            this.n.a((List) list);
            a((List) list);
        }
        if ((list == null || list.size() < 20) && this.n.a() > 0) {
            this.m = true;
            this.n.a(true);
        } else if ((list == null || list.isEmpty()) && this.n.a() <= 0) {
            this.m = false;
            q();
        } else {
            this.m = false;
            this.n.a(false);
        }
    }

    private void a(List<dbd> list) {
        if (list != null && list.size() > 0) {
            this.p.addAll(list);
        }
    }

    public void a(ImageView imageView, PaintingItem paintingItem) {
        imageView.setImageResource(dgc.a(paintingItem.like));
        PaintingAnimHelper.a(imageView);
    }

    public void a(int i) {
        esu.b(getContext(), i);
    }

    public void a(String str) {
        esu.b(getContext(), str);
    }

    @Subscribe
    public void onLikeResultEvent(RefreshLikeEvent refreshLikeEvent) {
        if (refreshLikeEvent != null && refreshLikeEvent.getPageType() != this.l) {
            this.n.a(this.p, refreshLikeEvent.getDocId(), refreshLikeEvent.getLikeStatus(), refreshLikeEvent.getLikeSumTotal());
        }
    }

    protected void b() {
        super.b();
        this.n = new dgg(getContext(), null, 2, this.l);
        a bl_dbh = new dbh(getContext(), f(), this.o);
        bl_dbh.a_(this.i);
        bl_dbh.a(this.q);
        this.n.a(bl_dbh);
        this.a.setAdapter(this.n);
    }

    private String f() {
        String str = BuildConfig.VERSION_NAME;
        FragmentActivity activity = getActivity();
        if (activity instanceof PaintingRankListActivity) {
            str = "1800";
            if (hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 108, (byte) 105, (byte) 124}).equals(this.h)) {
                switch (this.l) {
                    case User.VERIFY_TYPE_NONE /*-1*/:
                    case Mode.UPDATE /*1*/:
                    case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                        return str;
                    default:
                        return BuildConfig.VERSION_NAME;
                }
            } else if ("cos".equals(this.h)) {
                switch (this.l) {
                    case User.VERIFY_TYPE_NONE /*-1*/:
                    case Mode.UPDATE /*1*/:
                    case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                        return str;
                    default:
                        return BuildConfig.VERSION_NAME;
                }
            } else if (!"draw".equals(this.h)) {
                return str;
            } else {
                switch (this.l) {
                    case User.VERIFY_TYPE_NONE /*-1*/:
                    case Mode.UPDATE /*1*/:
                    case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                        return str;
                    default:
                        return BuildConfig.VERSION_NAME;
                }
            }
        } else if (activity instanceof PaintingCampaignActivity) {
            if (this.l == 2) {
                return "1300";
            }
            return "1300";
        } else if (activity instanceof TaggedPaintingActivity) {
            return "1600";
        } else {
            return str;
        }
    }

    protected int c() {
        return this.n.a();
    }

    protected void d() {
        if (!this.m) {
            b(false);
        }
    }

    protected void e() {
        b(false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        EventBus.getDefault().unregister(this);
    }

    private void b(String str) {
        dfl.a(str, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "rank", this.i);
    }
}
