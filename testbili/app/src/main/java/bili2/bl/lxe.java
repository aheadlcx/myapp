package bili2.bl;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail.Audio;

/* compiled from: BL */
public final class lxe extends mef {
    private int a;
    private Audio b;
    private int c;

    /* compiled from: BL */
    public static final class a extends bl.mee.a implements OnClickListener {
        public ImageView n;
        public TextView o;
        public TextView p;
        public TextView q;
        public TextView r;
        public Audio s;
        private int t;

        private a(View view, int i) {
            super(view);
            this.n = (ImageView) view.findViewById(2131298159);
            this.o = (TextView) view.findViewById(2131300554);
            this.p = (TextView) view.findViewById(2131300555);
            this.q = (TextView) view.findViewById(2131300556);
            this.r = (TextView) view.findViewById(2131297551);
            this.t = i;
        }

        public void b(Object obj) {
            this.s = (Audio) obj;
            if (this.s != null) {
                fci.g().a(this.s.cover, this.n);
                this.o.setText(this.s.title);
                this.p.setText(mbw.a(this.s.play));
                this.q.setText(mbw.a(this.s.reply));
                this.r.setText(this.s.entranceName);
                this.a.setOnClickListener(this);
            }
        }

        public void onClick(View view) {
            if (this.s != null) {
                try {
                    fji.a().a(view.getContext()).b(Uri.parse(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 42, (byte) 97, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 42}) + this.s.songId).buildUpon().appendQueryParameter("name", this.s.title).appendQueryParameter(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 112, (byte) 119, (byte) 105}), this.s.cover).appendQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 90, (byte) 100, (byte) 113, (byte) 113, (byte) 119}), String.valueOf(this.s.songAttr)).build());
                    lue.h(this.t);
                } catch (Exception e) {
                }
            }
        }

        public static a a(ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131427851, viewGroup, false), i);
        }
    }

    public lxe(int i) {
        this.a = i;
    }

    public bl.mee.a a(ViewGroup viewGroup, int i) {
        if (i == this.a) {
            return a.a(viewGroup, this.c);
        }
        return null;
    }

    public Object a(int i) {
        return this.b;
    }

    public int a() {
        if (this.b == null) {
            return 0;
        }
        return 1;
    }

    public int b(int i) {
        return this.a;
    }

    public void a(Audio audio, int i) {
        this.b = audio;
        this.c = i;
    }
}
