package bili2.bl;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import java.util.Map;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail.Stat;
import tv.danmaku.bili.ui.video.api.VideoApiService;
import tv.danmaku.bili.ui.video.api.VideoRecommend;

/* compiled from: BL */
public class lwm {
    private Context a;
    private lwi b;

    /* compiled from: BL */
    public interface a {
        void a(boolean z);
    }

    public lwm(Context context, @NonNull lwi bl_lwi) {
        this.a = context;
        this.b = bl_lwi;
    }

    public void a(final BiliVideoDetail biliVideoDetail, String str, final a aVar) {
        final Context applicationContext = this.a.getApplicationContext();
        if (!blk.a().g()) {
            esu.b(applicationContext, this.a.getString(2131694200));
        } else if (this.b.a()) {
            String j = eva.a(applicationContext).j();
            if (biliVideoDetail.isRecommend()) {
                gxv.d(biliVideoDetail.mTitle, String.valueOf(biliVideoDetail.mAvid));
            } else {
                gxv.c(biliVideoDetail.mTitle, String.valueOf(biliVideoDetail.mAvid));
            }
            lue.a();
            a(j, biliVideoDetail.mAvid, biliVideoDetail.getLike(), lua.a(str), new gnc<VideoRecommend>(this) {
                final /* synthetic */ lwm d;

                public /* synthetic */ void b(@Nullable Object obj) {
                    a((VideoRecommend) obj);
                }

                public void a(@Nullable VideoRecommend videoRecommend) {
                    String string;
                    if (biliVideoDetail.isRecommend()) {
                        string = this.d.a.getResources().getString(2131695964);
                    } else {
                        string = this.d.a.getResources().getString(2131695966);
                    }
                    esu.b(applicationContext, string);
                    if (biliVideoDetail.mStat != null) {
                        Stat stat;
                        if (biliVideoDetail.isRecommend()) {
                            stat = biliVideoDetail.mStat;
                            stat.mLikes--;
                        } else {
                            stat = biliVideoDetail.mStat;
                            stat.mLikes++;
                        }
                    }
                    if (biliVideoDetail.mRequestUser != null) {
                        biliVideoDetail.setRecommendStatus(!biliVideoDetail.isRecommend());
                        if (aVar != null) {
                            aVar.a(biliVideoDetail.isRecommend());
                        }
                    }
                }

                public void a(Throwable th) {
                    esu.b(applicationContext, this.d.a.getResources().getString(2131695965));
                }
            });
        }
    }

    public static void a(String str, int i, int i2, @Nullable String str2, gnc<VideoRecommend> bl_gnc_tv_danmaku_bili_ui_video_api_VideoRecommend) {
        Map grVar = new gr();
        if (!TextUtils.isEmpty(str)) {
            grVar.put(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 90, (byte) 110, (byte) 96, (byte) 124}), str);
        }
        if (i != 0) {
            grVar.put("aid", Integer.valueOf(i));
        }
        if (str2 != null) {
            grVar.put("from", str2);
        }
        grVar.put("like", Integer.valueOf(i2));
        ((VideoApiService) gnd.a(VideoApiService.class)).like(grVar).a((kqk) bl_gnc_tv_danmaku_bili_ui_video_api_VideoRecommend);
    }
}
