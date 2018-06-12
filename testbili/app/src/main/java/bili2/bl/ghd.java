package bili2.bl;

import android.graphics.Rect;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.music.app.domain.song.VideoBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: BL */
public class ghd extends gmd<gmq<List<VideoBean>>> {
    public static final int n = 2131429391;
    private final ImageView[] p;
    private final TextView[] q;
    private final TextView[] r;
    private final TextView[] s;
    private final TextView[] t;

    public ghd(View view) {
        super(view);
        this.p = new ImageView[]{(hsp) view.findViewById(2131297179), (hsp) view.findViewById(2131297180)};
        this.q = new TextView[]{(TextView) view.findViewById(2131299307), (TextView) view.findViewById(2131299308)};
        this.r = new TextView[]{(TextView) view.findViewById(2131297267), (TextView) view.findViewById(2131297268)};
        this.s = new TextView[]{(TextView) view.findViewById(2131300683), (TextView) view.findViewById(2131300684)};
        this.t = new TextView[]{(TextView) view.findViewById(2131297465), (TextView) view.findViewById(2131297466)};
    }

    public void a(gmq<List<VideoBean>> bl_gmq_java_util_List_com_bilibili_music_app_domain_song_VideoBean) {
        int i = 0;
        while (i < ((List) bl_gmq_java_util_List_com_bilibili_music_app_domain_song_VideoBean.c).size()) {
            final VideoBean videoBean = (VideoBean) ((List) bl_gmq_java_util_List_com_bilibili_music_app_domain_song_VideoBean.c).get(i);
            fci.g().a(ftb.b(this.a.getContext(), videoBean.cover), this.p[i]);
            this.s[i].setText(videoBean.title);
            this.q[i].setText(ftd.a(videoBean.playCount));
            this.r[i].setText(ftd.a(videoBean.commentCount));
            this.t[i].setText(fsq.c((long) (videoBean.duration * 1000)));
            this.p[i].setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ ghd b;

                public void onClick(View view) {
                    foc.a(view.getContext(), videoBean.aid + gmy.d);
                    fsb.a().b(hae.a(new byte[]{(byte) 109, (byte) 106, (byte) 104, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 90, (byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 90, (byte) 108, (byte) 113, (byte) 96, (byte) 104}));
                }
            });
            this.p[i].setVisibility(0);
            this.s[i].setVisibility(0);
            this.r[i].setVisibility(0);
            this.q[i].setVisibility(0);
            this.t[i].setVisibility(0);
            this.p[i].setEnabled(true);
            i++;
        }
        while (i < 2) {
            this.p[i].setVisibility(4);
            this.s[i].setVisibility(4);
            this.r[i].setVisibility(4);
            this.q[i].setVisibility(4);
            this.t[i].setVisibility(4);
            this.p[i].setEnabled(false);
            i++;
        }
        this.a.post(new Runnable(this) {
            final /* synthetic */ ghd a;

            {
                this.a = r1;
            }

            public void run() {
                List arrayList = new ArrayList();
                arrayList.add(new Rect(0, 0, this.a.a.getWidth() / 2, this.a.a.getHeight()));
                arrayList.add(new Rect(this.a.a.getWidth() / 2, 0, this.a.a.getWidth(), this.a.a.getHeight()));
                this.a.a.setTouchDelegate(new glw(arrayList, Arrays.asList(this.a.p)));
            }
        });
    }
}
