package bili.bl;

import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v7.widget.RecyclerView.u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLive;
import com.bilibili.bililive.videoliveplayer.ui.live.LiveAllActivity;
import com.bilibili.magicasakura.widgets.TintImageView;

/* compiled from: BL */
public class duc extends android.support.v7.widget.RecyclerView.a<u> {
    public la<BiliLive> b = new la(BiliLive.class, new b(this));

    /* compiled from: BL */
    public static class a extends bl.ehl.a {
        ImageView n = ((ImageView) ButterKnife.a(this.a, 2131297178));
        TextView o = ((TextView) ButterKnife.a(this.a, 2131300682));
        TextView p = ((TextView) ButterKnife.a(this.a, 2131301037));
        TextView q = ((TextView) ButterKnife.a(this.a, 2131298262));
        TextView r = ((TextView) ButterKnife.a(this.a, 2131300448));
        public TintImageView s = ((TintImageView) ButterKnife.a(this.a, 2131298861));

        public a(ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(2131428667, viewGroup, false));
        }

        public void b(Object obj) {
            if (obj instanceof BiliLive) {
                int i;
                final BiliLive biliLive = (BiliLive) obj;
                if (!(biliLive.mCover == null || TextUtils.isEmpty(biliLive.mCover.mSrc))) {
                    fci.g().a(biliLive.mCover.mSrc, this.n);
                }
                this.o.setText(biliLive.mTitle);
                if (biliLive.mOwner != null) {
                    this.p.setText(biliLive.mOwner.b);
                } else {
                    this.p.setText("...");
                }
                this.q.setText(com.a(biliLive.mOnline));
                TextView textView = this.q;
                if (biliLive.mIsRound) {
                    i = 4;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
                this.a.setTag(biliLive);
                this.o.setText(biliLive.mTitle);
                if (TextUtils.isEmpty(biliLive.mAreaNameV2)) {
                    this.r.setText(BuildConfig.VERSION_NAME);
                } else {
                    this.r.setText(biliLive.getDisplayAreaName());
                    this.r.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ a b;

                        public void onClick(View view) {
                            if (this.b.a.getContext() instanceof LiveAllActivity) {
                                drb.b(view.getContext(), biliLive.mParentAreaId, biliLive.mParentAreaName, biliLive.mAreaIdV2);
                            }
                        }
                    });
                }
                if (biliLive.mIsRound || biliLive.mRoundStatus == 1) {
                    this.q.setVisibility(8);
                    this.r.setVisibility(8);
                    this.s.setVisibility(8);
                    return;
                }
                this.q.setVisibility(0);
                this.r.setVisibility(0);
                this.s.setVisibility(0);
            }
        }
    }

    /* compiled from: BL */
    static class b extends ph<BiliLive> {
        public /* synthetic */ boolean a(Object obj, Object obj2) {
            return b((BiliLive) obj, (BiliLive) obj2);
        }

        public /* synthetic */ boolean b(Object obj, Object obj2) {
            return c((BiliLive) obj, (BiliLive) obj2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((BiliLive) obj, (BiliLive) obj2);
        }

        public b(android.support.v7.widget.RecyclerView.a aVar) {
            super(aVar);
        }

        public int a(BiliLive biliLive, BiliLive biliLive2) {
            if (biliLive.mRoomId == biliLive2.mRoomId) {
                return 0;
            }
            return biliLive.mIndex - biliLive2.mIndex;
        }

        public boolean b(BiliLive biliLive, BiliLive biliLive2) {
            return biliLive.mRoomId == biliLive2.mRoomId && biliLive.mOnline == biliLive2.mOnline && TextUtils.equals(biliLive.mTitle, biliLive2.mTitle);
        }

        public boolean c(BiliLive biliLive, BiliLive biliLive2) {
            return biliLive.mRoomId == biliLive2.mRoomId;
        }
    }

    public int b(int i) {
        return 1;
    }

    public u b(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(viewGroup);
        }
        return null;
    }

    public void a(u uVar, int i) {
        if (uVar instanceof a) {
            ((a) uVar).b(this.b.a(i));
        }
    }

    public int a() {
        return this.b.a();
    }

    public long f_(int i) {
        return (long) ((BiliLive) this.b.a(i)).mRoomId;
    }
}
