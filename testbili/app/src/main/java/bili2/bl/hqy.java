package bili2.bl;

import android.content.res.Resources;
import com.facebook.common.internal.ImmutableList;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: BL */
public class hqy {
    private Resources a;
    private hrd b;
    private hwn c;
    private Executor d;
    private hvd<hns, hwq> e;
    @Nullable
    private ImmutableList<hwn> f;
    @Nullable
    private hpf<Boolean> g;

    public void a(Resources resources, hrd bl_hrd, hwn bl_hwn, Executor executor, hvd<hns, hwq> bl_hvd_bl_hns__bl_hwq, @Nullable ImmutableList<hwn> immutableList, @Nullable hpf<Boolean> bl_hpf_java_lang_Boolean) {
        this.a = resources;
        this.b = bl_hrd;
        this.c = bl_hwn;
        this.d = executor;
        this.e = bl_hvd_bl_hns__bl_hwq;
        this.f = immutableList;
        this.g = bl_hpf_java_lang_Boolean;
    }

    public hqv a(hpf<hqm<hpw<hwq>>> bl_hpf_bl_hqm_bl_hpw_bl_hwq, String str, hns bl_hns, Object obj, @Nullable ImmutableList<hwn> immutableList) {
        hpd.b(this.a != null, "init() not called");
        hqv a = a(this.a, this.b, this.c, this.d, this.e, this.f, immutableList, bl_hpf_bl_hqm_bl_hpw_bl_hwq, str, bl_hns, obj);
        if (this.g != null) {
            a.a(((Boolean) this.g.a()).booleanValue());
        }
        return a;
    }

    protected hqv a(Resources resources, hrd bl_hrd, hwn bl_hwn, Executor executor, hvd<hns, hwq> bl_hvd_bl_hns__bl_hwq, @Nullable ImmutableList<hwn> immutableList, @Nullable ImmutableList<hwn> immutableList2, hpf<hqm<hpw<hwq>>> bl_hpf_bl_hqm_bl_hpw_bl_hwq, String str, hns bl_hns, Object obj) {
        hqv bl_hqv = new hqv(resources, bl_hrd, bl_hwn, executor, bl_hvd_bl_hns__bl_hwq, bl_hpf_bl_hqm_bl_hpw_bl_hwq, str, bl_hns, obj, immutableList);
        bl_hqv.a((ImmutableList) immutableList2);
        return bl_hqv;
    }
}
