package bili.bl;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bilibili.bililive.videoliveplayer.ui.live.attention.items.LiveAttention;
import com.bilibili.lib.image.ScalableImageView;
import com.bilibili.lib.ui.CircleImageView;
import com.bilibili.magicasakura.widgets.TintTextView;

/* compiled from: BL */
public class dvs extends drx<LiveAttention, a> {
    private final ScalableImageView n;
    private final TintTextView o;
    private final TintTextView p;
    private final TintTextView q;
    private CircleImageView r;
    private ImageView s;
    private boolean t;
    private OnClickListener u = new dvt(this);

    /* compiled from: BL */
    public interface a extends bl.drx.a<dvs> {
        void a(LiveAttention liveAttention, int i);
    }

    /* compiled from: BL */
    public static class b implements bl.drx.b<LiveAttention, dvs> {
        private boolean a;

        public /* synthetic */ drx a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return b(layoutInflater, viewGroup);
        }

        public b(boolean z) {
            this.a = z;
        }

        public dvs b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return new dvs(layoutInflater.inflate(2131428682, viewGroup, false), this.a);
        }
    }

    dvs(View view, boolean z) {
        super(view);
        this.n = (ScalableImageView) view.findViewById(2131297178);
        this.o = (TintTextView) view.findViewById(2131300682);
        this.p = (TintTextView) view.findViewById(2131301037);
        this.q = (TintTextView) view.findViewById(2131298262);
        this.r = (CircleImageView) view.findViewById(2131297612);
        this.s = (ImageView) view.findViewById(2131296488);
        this.t = z;
    }

    public void a(LiveAttention liveAttention, int i) {
        super.a(liveAttention, i);
        fci.g().a(liveAttention.mFace, this.r);
        this.p.setText(liveAttention.mName);
        this.q.setText(com.a(liveAttention.mOnline, "0"));
        if (TextUtils.isEmpty(liveAttention.mCover)) {
            fci.g().a(liveAttention.mKeyFrame, this.n);
        } else {
            fci.g().a(liveAttention.mCover, this.n);
        }
        this.o.setText(liveAttention.mTitle);
        if (liveAttention.mOfficalVerify == 0) {
            this.s.setVisibility(0);
            this.s.setImageResource(2131234333);
        } else if (liveAttention.mOfficalVerify == 1) {
            this.s.setVisibility(0);
            this.s.setImageResource(2131234332);
        } else {
            this.s.setVisibility(8);
        }
        this.a.setOnClickListener(this.u);
        if (this.t && !liveAttention.hasReportedCardShow) {
            liveAttention.hasReportedCardShow = true;
            a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 102, (byte) 100, (byte) 119, (byte) 97, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114}));
        }
    }

    final /* synthetic */ void a(View view) {
        if (a() != null) {
            ((a) a()).a((LiveAttention) b(), g());
            if (this.t) {
                a(hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 102, (byte) 100, (byte) 119, (byte) 97, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}));
            }
        }
    }

    private void a(String str) {
        LiveAttention liveAttention = (LiveAttention) b();
        bl.dqu.a aVar = new bl.dqu.a();
        aVar.a(str).b(hae.a(new byte[]{(byte) 108, (byte) 107, (byte) 97, (byte) 96, (byte) 125})).a(liveAttention.moduleId).c(liveAttention.moduleName).d(liveAttention.mRoomId).b(liveAttention.mAreaV2ParentId).c(liveAttention.mAreaV2Id).f(0).g(0).e(liveAttention.reportPosition).a();
        dqo.a(aVar.b());
    }
}
