package bili.bl;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bilibili.bilibililive.uibase.widget.MeasurableMinWidthTextView;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveFansRank.a;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveFeedRank.BiliLiveFeedRankUser;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveOperationRank.BiliLiveOperation;
import com.bilibili.lib.image.ScalableImageView;
import com.bilibili.lib.ui.CircleImageView;
import java.util.Locale;

/* compiled from: BL */
public class egl extends FrameLayout {
    CircleImageView a;
    ImageView b;
    TextView c;
    MeasurableMinWidthTextView d;
    ScalableImageView e;
    Context f;
    int[] g = new int[]{2131232932, 2131232934, 2131232933};
    int[] h = new int[]{Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 67, (byte) 67, (byte) 70, (byte) 70, (byte) 53, (byte) 53})), Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 65, (byte) 60, (byte) 65, (byte) 60, (byte) 65, (byte) 60})), Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 64, (byte) 51, (byte) 61, (byte) 53, (byte) 49, (byte) 51}))};

    public egl(@NonNull Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        this.f = context;
        View inflate = LayoutInflater.from(context).inflate(2131428536, null);
        addView(inflate);
        this.a = (CircleImageView) inflate.findViewById(2131296504);
        this.b = (ImageView) inflate.findViewById(2131298392);
        this.c = (TextView) inflate.findViewById(2131298957);
        this.d = (MeasurableMinWidthTextView) inflate.findViewById(2131301129);
        this.e = (ScalableImageView) inflate.findViewById(2131298112);
    }

    public void setTopRankView(BiliLiveFeedRankUser biliLiveFeedRankUser) {
        fci.g().a(biliLiveFeedRankUser.mFace, this.a);
        this.c.setText(biliLiveFeedRankUser.mUname);
        if (biliLiveFeedRankUser.mRank >= 1 && biliLiveFeedRankUser.mRank <= 3) {
            this.b.setImageResource(this.g[biliLiveFeedRankUser.mRank - 1]);
            this.a.a(this.h[biliLiveFeedRankUser.mRank - 1], (float) getResources().getDimensionPixelSize(2131165558));
        }
        this.d.setText(String.format(Locale.getDefault(), "%d", new Object[]{Long.valueOf(biliLiveFeedRankUser.mCoin)}));
        this.d.setStaffStr(String.format(Locale.getDefault(), "%d", new Object[]{Long.valueOf(biliLiveFeedRankUser.mCoin)}));
        this.e.setImageResource(2131233761);
    }

    public void setTopRankView(a aVar) {
        fci.g().a(aVar.e, this.a);
        this.c.setText(aVar.c);
        if (aVar.f >= 1 && aVar.f <= 3) {
            this.b.setImageResource(this.g[aVar.f - 1]);
            this.a.a(this.h[aVar.f - 1], (float) getResources().getDimensionPixelSize(2131165558));
        }
        dxi.a(this.d, aVar.d, aVar.a, aVar.b, ecc.e, ecc.f);
        this.e.setVisibility(8);
    }

    public void setTopRankView(BiliLiveOperation biliLiveOperation) {
        fci.g().a(biliLiveOperation.mFace, this.a);
        this.c.setText(biliLiveOperation.mUname);
        if (biliLiveOperation.mRank >= 1 && biliLiveOperation.mRank <= 3) {
            this.b.setImageResource(this.g[biliLiveOperation.mRank - 1]);
            this.a.a(this.h[biliLiveOperation.mRank - 1], (float) getResources().getDimensionPixelSize(2131165558));
        }
        this.d.setText(String.format(Locale.getDefault(), "%d", new Object[]{Long.valueOf(biliLiveOperation.mScore)}));
        this.d.setStaffStr(String.format(Locale.getDefault(), "%d", new Object[]{Long.valueOf(biliLiveOperation.mScore)}));
        fci.g().a(biliLiveOperation.mImg2.mSrc, this.e);
    }
}
