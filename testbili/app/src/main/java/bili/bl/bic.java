package bili.bl;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.widget.FrameLayout.LayoutParams;
import bl.bbw.f;
import bl.bce.a;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.bangumi.api.BangumiApiService;
import com.bilibili.bangumi.api.BangumiBriefPlus;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class bic extends fkv {
    public static final String a = hae.a(new byte[]{(byte) 71, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108, (byte) 87, (byte) 96, (byte) 102, (byte) 106, (byte) 104, (byte) 104, (byte) 96, (byte) 107, (byte) 97, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    bib b;
    List<BangumiBriefPlus> c = new ArrayList();
    private String d = BuildConfig.VERSION_NAME;
    private String e = BuildConfig.VERSION_NAME;
    private boolean f = false;
    private BangumiApiService g;

    public void onResume() {
        super.onResume();
        if (bce.a().c() && this.b != null) {
            a(this.d, this.e);
        }
    }

    private void a(String str, String str2) {
        if (this.c != null && this.b != null) {
            int i;
            BangumiBriefPlus bangumiBriefPlus;
            if (!TextUtils.isEmpty(str)) {
                for (i = 0; i < this.c.size(); i++) {
                    bangumiBriefPlus = (BangumiBriefPlus) this.c.get(i);
                    if (bangumiBriefPlus != null && TextUtils.equals(bangumiBriefPlus.seasonId, str)) {
                        this.b.a(i, true);
                        this.d = BuildConfig.VERSION_NAME;
                    }
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                for (i = 0; i < this.c.size(); i++) {
                    bangumiBriefPlus = (BangumiBriefPlus) this.c.get(i);
                    if (bangumiBriefPlus != null && TextUtils.equals(bangumiBriefPlus.seasonId, str2)) {
                        this.b.a(i, false);
                        this.e = BuildConfig.VERSION_NAME;
                    }
                }
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        bce.a().b();
        bce.a().a(new a(this) {
            final /* synthetic */ bic a;

            {
                this.a = r1;
            }

            public void a(String str) {
                this.a.d = str;
            }

            public void b(String str) {
                this.a.e = str;
            }
        });
    }

    public void a(RecyclerView recyclerView, @Nullable Bundle bundle) {
        super.a(recyclerView, bundle);
        getActivity().setTitle(2131690175);
        recyclerView.setBackgroundColor(fnd.a(getContext(), 2131099920));
        LayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.d(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(new mec());
        this.b = new bib(this);
        recyclerView.setAdapter(this.b);
        recyclerView.addOnScrollListener(new fcj());
        LayoutParams layoutParams = (LayoutParams) this.j.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.topMargin = 0;
        recyclerView.setHasFixedSize(true);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.b.a() == 0) {
            n();
            b();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        bce.a().a(null);
        bce.a().b();
    }

    private void b() {
        a().getFollowRecommend().a(new bbi<List<BangumiBriefPlus>>(this) {
            final /* synthetic */ bic a;

            {
                this.a = r1;
            }

            public /* synthetic */ void b(Object obj) {
                a((List) obj);
            }

            public void a(List<BangumiBriefPlus> list) {
                this.a.o();
                if (list != null) {
                    this.a.c.clear();
                    this.a.c.addAll(list);
                }
                this.a.b.a(this.a.c);
                this.a.b.f();
            }

            public void a(Throwable th) {
                this.a.o();
                this.a.p();
            }

            public boolean a() {
                return this.a.activityDie();
            }
        });
    }

    public void a(BangumiBriefPlus bangumiBriefPlus, SparseBooleanArray sparseBooleanArray, int i) {
        if (!this.f) {
            final Context context = getContext();
            final BangumiBriefPlus bangumiBriefPlus2;
            final SparseBooleanArray sparseBooleanArray2;
            final int i2;
            if (sparseBooleanArray.get(i)) {
                f.c(bangumiBriefPlus);
                this.f = true;
                bangumiBriefPlus2 = bangumiBriefPlus;
                sparseBooleanArray2 = sparseBooleanArray;
                i2 = i;
                a().unfollow(bbx.b(context), bangumiBriefPlus.seasonId).a(new bbi<JSONObject>(this) {
                    final /* synthetic */ bic e;

                    public /* synthetic */ void b(Object obj) {
                        a((JSONObject) obj);
                    }

                    public void a(JSONObject jSONObject) {
                        this.e.f = false;
                        bce.a().b(bangumiBriefPlus2.seasonId);
                        esu.b(context, 2131690033);
                        sparseBooleanArray2.put(i2, false);
                        this.e.b.d(i2);
                    }

                    public void a(Throwable th) {
                        this.e.f = false;
                        esu.b(context, 2131690032);
                    }

                    public boolean a() {
                        return this.e.activityDie();
                    }
                });
                return;
            }
            f.b(bangumiBriefPlus);
            this.f = true;
            bangumiBriefPlus2 = bangumiBriefPlus;
            sparseBooleanArray2 = sparseBooleanArray;
            i2 = i;
            a().follow(bbx.b(getContext()), bangumiBriefPlus.seasonId).a(new bbi<JSONObject>(this) {
                final /* synthetic */ bic e;

                public /* synthetic */ void b(Object obj) {
                    a((JSONObject) obj);
                }

                public void a(JSONObject jSONObject) {
                    this.e.f = false;
                    bce.a().a(bangumiBriefPlus2.seasonId);
                    esu.b(context, 2131690030);
                    sparseBooleanArray2.put(i2, true);
                    this.e.b.d(i2);
                }

                public void a(Throwable th) {
                    this.e.f = false;
                    esu.b(context, 2131690029);
                }

                public boolean a() {
                    return this.e.activityDie();
                }
            });
        }
    }

    public BangumiApiService a() {
        if (this.g == null) {
            this.g = (BangumiApiService) gnd.a(BangumiApiService.class);
        }
        return this.g;
    }
}
