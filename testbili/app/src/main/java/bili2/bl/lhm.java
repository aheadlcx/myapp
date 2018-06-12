package bili2.bl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import tv.danmaku.bili.category.CategoryMeta;
import tv.danmaku.bili.widget.RecyclerView;

/* compiled from: BL */
public abstract class lhm extends fkw {
    protected static final String a = hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 113, (byte) 108, (byte) 97});
    protected static final String b = hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 104, (byte) 96, (byte) 113, (byte) 100});

    public abstract void a(RecyclerView recyclerView, @Nullable Bundle bundle);

    public abstract void e();

    protected static Bundle b(CategoryMeta categoryMeta) {
        Bundle bundle = new Bundle();
        bundle.putInt(hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 113, (byte) 108, (byte) 97}), categoryMeta.mTid);
        bundle.putParcelable(hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 98, (byte) 90, (byte) 104, (byte) 96, (byte) 113, (byte) 100}), categoryMeta);
        return bundle;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView, @Nullable Bundle bundle) {
        recyclerView.addOnScrollListener(new fcj());
        a((RecyclerView) recyclerView, bundle);
    }

    public void i() {
        e();
        super.i();
    }
}
