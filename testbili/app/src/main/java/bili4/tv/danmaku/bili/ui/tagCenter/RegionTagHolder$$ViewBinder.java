package bili4.tv.danmaku.bili.ui.tagCenter;

import android.view.View;
import android.widget.TextView;
import bl.hae;
import bl.pv;
import bl.py;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import com.bilibili.magicasakura.widgets.TintTextView;
import tv.danmaku.bili.widget.FlowLayout;

/* compiled from: BL */
public class RegionTagHolder$$ViewBinder<T extends RegionTagHolder> implements py<T> {

    /* compiled from: BL */
    public static class a<T extends RegionTagHolder> implements Unbinder {
        protected T b;
        private View c;

        protected a(final T t, Finder finder, Object obj) {
            this.b = t;
            t.title = (TextView) finder.a(obj, 2131300589, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96, (byte) 34}), TextView.class);
            t.flowLayout = (FlowLayout) finder.a(obj, 2131297744, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 99, (byte) 105, (byte) 106, (byte) 114, (byte) 73, (byte) 100, (byte) 124, (byte) 106, (byte) 112, (byte) 113, (byte) 34}), FlowLayout.class);
            View a = finder.a(obj, 2131301221, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 102, (byte) 106, (byte) 105, (byte) 105, (byte) 100, (byte) 117, (byte) 118, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 34, (byte) 37, (byte) 100, (byte) 107, (byte) 97, (byte) 37, (byte) 104, (byte) 96, (byte) 113, (byte) 109, (byte) 106, (byte) 97, (byte) 37, (byte) 34, (byte) 106, (byte) 107, (byte) 70, (byte) 106, (byte) 105, (byte) 105, (byte) 100, (byte) 117, (byte) 118, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 70, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 34}));
            t.collapseView = a;
            this.c = a;
            a.setOnClickListener(new pv(this) {
                final /* synthetic */ a c;

                public void a(View view) {
                    t.onCollapseViewClick();
                }
            });
            t.txtCollapse = (TintTextView) finder.a(obj, 2131300571, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 113, (byte) 125, (byte) 113, (byte) 70, (byte) 106, (byte) 105, (byte) 105, (byte) 100, (byte) 117, (byte) 118, (byte) 96, (byte) 34}), TintTextView.class);
        }

        public void a() {
            RegionTagHolder regionTagHolder = this.b;
            if (regionTagHolder == null) {
                throw new IllegalStateException(hae.a(new byte[]{(byte) 71, (byte) 108, (byte) 107, (byte) 97, (byte) 108, (byte) 107, (byte) 98, (byte) 118, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 96, (byte) 97, (byte) 43}));
            }
            regionTagHolder.title = null;
            regionTagHolder.flowLayout = null;
            regionTagHolder.collapseView = null;
            regionTagHolder.txtCollapse = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.b = null;
        }
    }

    public Unbinder a(Finder finder, T t, Object obj) {
        return new a(t, finder, obj);
    }
}
