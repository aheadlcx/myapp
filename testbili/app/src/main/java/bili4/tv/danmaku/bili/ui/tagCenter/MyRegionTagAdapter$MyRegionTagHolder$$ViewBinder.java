package bili4.tv.danmaku.bili.ui.tagCenter;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl.hae;
import bl.py;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import tv.danmaku.bili.widget.FlowLayout;

/* compiled from: BL */
public class MyRegionTagAdapter$MyRegionTagHolder$$ViewBinder<T extends MyRegionTagHolder> implements py<T> {

    /* compiled from: BL */
    public static class a<T extends MyRegionTagHolder> implements Unbinder {
        protected T b;

        protected a(T t, Finder finder, Object obj) {
            this.b = t;
            t.count = (TextView) finder.a(obj, 2131300574, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 34}), TextView.class);
            t.refresh = (ViewGroup) finder.a(obj, 2131298552, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 119, (byte) 96, (byte) 99, (byte) 119, (byte) 96, (byte) 118, (byte) 109, (byte) 34}), ViewGroup.class);
            t.imgRefresh = (ImageView) finder.a(obj, 2131298131, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 108, (byte) 104, (byte) 98, (byte) 87, (byte) 96, (byte) 99, (byte) 119, (byte) 96, (byte) 118, (byte) 109, (byte) 34}), ImageView.class);
            t.tagHint = (TextView) finder.a(obj, 2131300515, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 113, (byte) 100, (byte) 98, (byte) 77, (byte) 108, (byte) 107, (byte) 113, (byte) 34}), TextView.class);
            t.title = (TextView) finder.a(obj, 2131300589, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96, (byte) 34}), TextView.class);
            t.flowLayout = (FlowLayout) finder.a(obj, 2131297744, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 99, (byte) 105, (byte) 106, (byte) 114, (byte) 73, (byte) 100, (byte) 124, (byte) 106, (byte) 112, (byte) 113, (byte) 34}), FlowLayout.class);
        }

        public void a() {
            MyRegionTagHolder myRegionTagHolder = this.b;
            if (myRegionTagHolder == null) {
                throw new IllegalStateException(hae.a(new byte[]{(byte) 71, (byte) 108, (byte) 107, (byte) 97, (byte) 108, (byte) 107, (byte) 98, (byte) 118, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 96, (byte) 97, (byte) 43}));
            }
            myRegionTagHolder.count = null;
            myRegionTagHolder.refresh = null;
            myRegionTagHolder.imgRefresh = null;
            myRegionTagHolder.tagHint = null;
            myRegionTagHolder.title = null;
            myRegionTagHolder.flowLayout = null;
            this.b = null;
        }
    }

    public Unbinder a(Finder finder, T t, Object obj) {
        return new a(t, finder, obj);
    }
}
