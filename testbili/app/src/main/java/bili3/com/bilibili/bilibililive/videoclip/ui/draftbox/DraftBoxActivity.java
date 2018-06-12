package bili3.com.bilibili.bilibililive.videoclip.ui.draftbox;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.u;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl.bli;
import bl.cmb;
import bl.cmq;
import bl.cnn;
import bl.cnv;
import bl.cor;
import bl.cos;
import bl.cpk;
import bl.cpu;
import bl.hae;
import com.bilibili.bilibililive.videoclip.ui.data.VideoClipEditSession;
import com.bilibili.bilibililive.videoclip.ui.edit.VideoClipEditActivity;
import java.io.File;
import java.util.List;
import java.util.Locale;

/* compiled from: BL */
public class DraftBoxActivity extends cpu {
    private RecyclerView a;
    private ImageView b;
    private ProgressBar c;
    private a d;

    /* compiled from: BL */
    class a extends android.support.v7.widget.RecyclerView.a<b> {
        final /* synthetic */ DraftBoxActivity a;
        private List<VideoClipEditSession> b;

        public /* synthetic */ u b(ViewGroup viewGroup, int i) {
            return a(viewGroup, i);
        }

        private a(DraftBoxActivity draftBoxActivity, List<VideoClipEditSession> list) {
            this.a = draftBoxActivity;
            this.b = list;
        }

        public b a(ViewGroup viewGroup, int i) {
            return new b(this.a, LayoutInflater.from(this.a).inflate(2131429120, viewGroup, false));
        }

        public void a(b bVar, int i) {
            VideoClipEditSession videoClipEditSession = (VideoClipEditSession) this.b.get(i);
            if (TextUtils.isEmpty(videoClipEditSession.getThumbPath())) {
                cmq.b(this.a, bVar.o, Uri.fromFile(new File(videoClipEditSession.getVideoPath())));
            } else {
                cmq.a(this.a, bVar.o, Uri.parse(videoClipEditSession.getThumbPath()));
            }
            bVar.p.setText(String.format(Locale.getDefault(), hae.a(new byte[]{(byte) 32, (byte) 53, (byte) 55, (byte) 97, (byte) 63, (byte) 32, (byte) 53, (byte) 55, (byte) 97}), new Object[]{Integer.valueOf(videoClipEditSession.getVideoDurationSeconds() / 60), Integer.valueOf(videoClipEditSession.getVideoDurationSeconds() % 60)}));
        }

        public int a() {
            return this.b.size();
        }
    }

    /* compiled from: BL */
    class b extends u implements OnClickListener, OnLongClickListener {
        final /* synthetic */ DraftBoxActivity n;
        private ImageView o;
        private TextView p;
        private ImageView q;

        public b(DraftBoxActivity draftBoxActivity, View view) {
            this.n = draftBoxActivity;
            super(view);
            view.setOnClickListener(this);
            view.setOnLongClickListener(this);
            this.o = (ImageView) view.findViewById(2131300610);
            this.p = (TextView) view.findViewById(2131297464);
            this.q = (ImageView) view.findViewById(2131298159);
        }

        public void onClick(View view) {
            this.n.startActivityForResult(VideoClipEditActivity.a(this.n, (VideoClipEditSession) this.n.d.b.get(g()), "100"), g());
        }

        public boolean onLongClick(View view) {
            new bl.jp.a(this.n).b(2131691022).b(17039360, null).a(17039370, new DialogInterface.OnClickListener(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    int g = this.a.g();
                    ((VideoClipEditSession) this.a.n.d.b.remove(g)).deleteFromDraft(this.a.n);
                    this.a.n.d.f(g);
                    if (this.a.n.d.a() == 0) {
                        this.a.n.a.setVisibility(4);
                        this.a.n.b.setVisibility(0);
                    }
                }
            }).c();
            return false;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427375);
        if (cmb.c()) {
            cor.a(this, cnn.a());
        } else {
            cos.b(this);
        }
        cnv.a(this, 2131300732, getString(2131691343));
        Toolbar toolbar = (Toolbar) findViewById(2131300732);
        toolbar.setTitleTextColor(getResources().getColor(2131099781));
        toolbar.setBackgroundColor(cnn.d());
        toolbar.setTitleTextColor(cnn.e());
        toolbar.setNavigationIcon(cnn.f());
        h();
        k();
        cpk.a(hae.a(new byte[]{(byte) 115, (byte) 102, (byte) 90, (byte) 97, (byte) 119, (byte) 100, (byte) 99, (byte) 113}));
    }

    private void h() {
        this.a = (RecyclerView) findViewById(2131299639);
        this.b = (ImageView) findViewById(2131298159);
        this.c = (ProgressBar) findViewById(2131299433);
        this.a.setLayoutManager(new LinearLayoutManager(this));
        new bli(this, hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96})).b(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 115, (byte) 96, (byte) 119, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), 0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 3) {
            ((VideoClipEditSession) this.d.b.get(i)).reload(this);
            this.d.d(i);
        }
    }

    private void k() {
        new AsyncTask<Void, Void, List<VideoClipEditSession>>(this) {
            final /* synthetic */ DraftBoxActivity a;

            {
                this.a = r1;
            }

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return a((Void[]) objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                a((List) obj);
            }

            protected List<VideoClipEditSession> a(Void... voidArr) {
                List<VideoClipEditSession> readFromDraft = VideoClipEditSession.readFromDraft(this.a);
                for (VideoClipEditSession readVideoDuration : readFromDraft) {
                    readVideoDuration.readVideoDuration();
                }
                return readFromDraft;
            }

            protected void a(List<VideoClipEditSession> list) {
                this.a.c.setVisibility(4);
                if (list.size() == 0) {
                    this.a.b.setVisibility(0);
                    return;
                }
                this.a.d = new a(list);
                this.a.a.setAdapter(this.a.d);
                this.a.a.setVisibility(0);
            }
        }.execute(new Void[0]);
    }
}
