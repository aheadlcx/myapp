package bili2.bl;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bilibili.bangumi.player.BangumiPlayerDBData;
import com.bilibili.playerdb.basic.PlayerDBEntity;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.history.model.PlayHistory;
import tv.danmaku.bili.ui.history.model.PlayHistory.Bangumi;
import tv.danmaku.bili.ui.history.model.PlayHistory.Page;
import tv.danmaku.bili.ui.history.model.PlayHistory.Season;
import tv.danmaku.biliplayer.features.breakpoint.AvPlayerDBData;

/* compiled from: BL */
public class lnn {
    private Context a;
    private mgx b = new mgx(this.a);
    private gza<AvPlayerDBData> c = new gza(this.a, new beu(this.a), this.b);
    private beq d = new beq(this.a);
    private gza<BangumiPlayerDBData> e = new gza(this.a, new beu(this.a), this.d);
    private final String f = beu.b();

    public lnn(Context context) {
        this.a = context.getApplicationContext();
    }

    public lfm a(int i, int i2) throws SQLiteException {
        erv.a(i >= 1);
        int i3 = (i - 1) * i2;
        lfm bl_lfm = new lfm();
        bl_lfm.e = 1;
        bl_lfm.a(b(i3, i2));
        bl_lfm.a(c(i3, i2));
        return bl_lfm;
    }

    private lfm b(int i, int i2) {
        gyx a = this.c.a(this.f, this.b.c(null), i, i2, AvPlayerDBData.class);
        if (a.a()) {
            return null;
        }
        lfm bl_lfm = new lfm();
        for (PlayerDBEntity a2 : a.a) {
            PlayHistory a3 = a(a2);
            if (a3 != null) {
                bl_lfm.a(a3);
            }
        }
        return bl_lfm;
    }

    private lfm c(int i, int i2) {
        gyx a = this.e.a(this.f, this.d.c(null), i, i2, BangumiPlayerDBData.class);
        if (a.a()) {
            return null;
        }
        lfm bl_lfm = new lfm();
        for (PlayerDBEntity b : a.a) {
            PlayHistory b2 = b(b);
            if (b2 != null) {
                bl_lfm.a(b2);
            }
        }
        return bl_lfm;
    }

    public boolean a() {
        gza bl_gza = this.c;
        gza.a(this.a, this.f, this.b.c(null));
        bl_gza = this.e;
        gza.a(this.a, this.f, this.d.c(null));
        return true;
    }

    public boolean a(@NonNull lfm bl_lfm) {
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        for (PlayHistory playHistory : bl_lfm.a) {
            if (playHistory.selected) {
                if (playHistory.isBangumi()) {
                    arrayList2.add(b(playHistory));
                } else {
                    arrayList.add(a(playHistory));
                }
            }
        }
        return this.c.a(arrayList) && this.e.a(arrayList2);
    }

    @Nullable
    private static PlayHistory a(PlayerDBEntity<AvPlayerDBData> playerDBEntity) {
        if (playerDBEntity != null) {
            AvPlayerDBData avPlayerDBData = (AvPlayerDBData) playerDBEntity.f;
            if (avPlayerDBData != null && avPlayerDBData.a > 0) {
                PlayHistory playHistory = new PlayHistory();
                playHistory.type = -1;
                playHistory.aid = avPlayerDBData.a;
                playHistory.cover = avPlayerDBData.e;
                playHistory.duration = playerDBEntity.b;
                playHistory.progress = playerDBEntity.a;
                playHistory.timestamp = playerDBEntity.d / 1000;
                playHistory.title = avPlayerDBData.d;
                playHistory.page = new Page();
                playHistory.page.page = avPlayerDBData.f;
                playHistory.page.part = avPlayerDBData.g;
                playHistory.page.cid = avPlayerDBData.b;
                playHistory.pageCount = avPlayerDBData.h;
                return playHistory;
            }
        }
        return null;
    }

    private static AvPlayerDBData a(PlayHistory playHistory) {
        AvPlayerDBData avPlayerDBData = new AvPlayerDBData();
        if (playHistory != null && playHistory.aid > 0) {
            avPlayerDBData.a = playHistory.aid;
            if (playHistory.page != null) {
                avPlayerDBData.b = playHistory.page.cid;
            }
        }
        return avPlayerDBData;
    }

    @Nullable
    private static PlayHistory b(PlayerDBEntity<BangumiPlayerDBData> playerDBEntity) {
        if (playerDBEntity != null) {
            BangumiPlayerDBData bangumiPlayerDBData = (BangumiPlayerDBData) playerDBEntity.f;
            if (bangumiPlayerDBData != null && bangumiPlayerDBData.d > 0) {
                PlayHistory playHistory = new PlayHistory();
                playHistory.type = 1;
                playHistory.aid = bangumiPlayerDBData.d;
                playHistory.cover = bangumiPlayerDBData.j;
                playHistory.duration = playerDBEntity.b;
                playHistory.progress = playerDBEntity.a;
                playHistory.timestamp = playerDBEntity.d / 1000;
                playHistory.bangumi = new Bangumi();
                playHistory.bangumi.season = new Season();
                playHistory.bangumi.season.title = bangumiPlayerDBData.a;
                playHistory.bangumi.season.seasonId = kri.b(bangumiPlayerDBData.b);
                playHistory.bangumi.title = bangumiPlayerDBData.h;
                playHistory.bangumi.longTitle = bangumiPlayerDBData.i;
                playHistory.bangumi.epId = bangumiPlayerDBData.g;
                playHistory.page = new Page();
                playHistory.page.cid = bangumiPlayerDBData.e;
                return playHistory;
            }
        }
        return null;
    }

    private static BangumiPlayerDBData b(PlayHistory playHistory) {
        BangumiPlayerDBData bangumiPlayerDBData = new BangumiPlayerDBData();
        if (playHistory != null && playHistory.aid > 0) {
            bangumiPlayerDBData.d = playHistory.aid;
            if (playHistory.page != null) {
                bangumiPlayerDBData.e = playHistory.page.cid;
            }
            if (playHistory.bangumi != null) {
                bangumiPlayerDBData.g = playHistory.bangumi.epId;
                if (playHistory.bangumi.season != null) {
                    bangumiPlayerDBData.b = playHistory.bangumi.season.seasonId + gmy.d;
                }
            }
        }
        return bangumiPlayerDBData;
    }
}
