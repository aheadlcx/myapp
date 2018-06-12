package bili4.tv.danmaku.bili.ui.category;

import android.widget.ImageView;
import android.widget.TextView;
import bl.hae;
import bl.py;
import butterknife.Unbinder;
import butterknife.internal.Finder;

/* compiled from: BL */
public class VideoHolder$$ViewBinder<T extends VideoHolder> implements py<T> {

    /* compiled from: BL */
    public static class a<T extends VideoHolder> implements Unbinder {
        protected T b;

        protected a(T t, Finder finder, Object obj) {
            this.b = t;
            t.cover = (ImageView) finder.a(obj, 2131297178, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 34}), ImageView.class);
            t.title = (TextView) finder.a(obj, 2131300682, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96, (byte) 34}), TextView.class);
            t.views = (TextView) finder.a(obj, 2131301258, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 115, (byte) 108, (byte) 96, (byte) 114, (byte) 118, (byte) 34}), TextView.class);
            t.danmakus = (TextView) finder.a(obj, 2131297262, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 118, (byte) 34}), TextView.class);
            t.duration = (TextView) finder.a(obj, 2131297464, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 97, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 34}), TextView.class);
            t.region = (TextView) finder.a(obj, 2131299658, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 119, (byte) 96, (byte) 98, (byte) 108, (byte) 106, (byte) 107, (byte) 34}), TextView.class);
            t.more = finder.a(obj, 2131298861, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 106, (byte) 119, (byte) 96, (byte) 34}));
        }

        public void a() {
            VideoHolder videoHolder = this.b;
            if (videoHolder == null) {
                throw new IllegalStateException(hae.a(new byte[]{(byte) 71, (byte) 108, (byte) 107, (byte) 97, (byte) 108, (byte) 107, (byte) 98, (byte) 118, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 96, (byte) 97, (byte) 43}));
            }
            videoHolder.cover = null;
            videoHolder.title = null;
            videoHolder.views = null;
            videoHolder.danmakus = null;
            videoHolder.duration = null;
            videoHolder.region = null;
            videoHolder.more = null;
            this.b = null;
        }
    }

    public Unbinder a(Finder finder, T t, Object obj) {
        return new a(t, finder, obj);
    }
}
