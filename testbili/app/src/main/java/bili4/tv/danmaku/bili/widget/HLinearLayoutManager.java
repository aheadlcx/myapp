package bili4.tv.danmaku.bili.widget;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.r;
import android.util.AttributeSet;
import bl.nv;

/* compiled from: BL */
public class HLinearLayoutManager extends LinearLayoutManager {
    public HLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    public HLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context);
    }

    public void a(RecyclerView recyclerView, r rVar, int i) {
        AnonymousClass1 anonymousClass1 = new nv(this, recyclerView.getContext()) {
            final /* synthetic */ HLinearLayoutManager f;

            protected int c() {
                return -1;
            }

            public PointF c(int i) {
                return this.f.d(i);
            }
        };
        anonymousClass1.d(i);
        a(anonymousClass1);
    }
}
