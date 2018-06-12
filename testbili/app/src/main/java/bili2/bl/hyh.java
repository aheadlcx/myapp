package bili2.bl;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;

/* compiled from: BL */
public class hyh extends hzf<Pair<hns, RequestLevel>, hpw<hwq>> {
    private final hur b;

    protected /* synthetic */ Object b(hzm bl_hzm) {
        return a(bl_hzm);
    }

    public hyh(hur bl_hur, hzl bl_hzl) {
        super(bl_hzl);
        this.b = bl_hur;
    }

    protected Pair<hns, RequestLevel> a(hzm bl_hzm) {
        return Pair.create(this.b.a(bl_hzm.a(), bl_hzm.d()), bl_hzm.e());
    }

    public hpw<hwq> a(hpw<hwq> bl_hpw_bl_hwq) {
        return hpw.b(bl_hpw_bl_hwq);
    }
}
