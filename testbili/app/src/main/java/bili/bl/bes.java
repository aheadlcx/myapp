package bili.bl;

import android.content.Context;
import android.support.annotation.Nullable;
import com.bilibili.bangumi.player.BangumiPlayerDBData;
import com.bilibili.playerdb.basic.PlayerDBEntity;
import java.util.concurrent.Callable;

/* compiled from: BL */
public class bes {
    private Context a;
    private gza<BangumiPlayerDBData> b = new gza(this.a, new beu(this.a), this.c);
    private beq c = new beq(this.a);

    public bes(Context context) {
        this.a = context.getApplicationContext();
    }

    public boolean a(long j) {
        return this.b.b(beq.a(this.a, j));
    }

    public void a(final PlayerDBEntity<BangumiPlayerDBData> playerDBEntity) {
        ps.a(new Callable<Void>(this) {
            final /* synthetic */ bes b;

            public /* synthetic */ Object call() throws Exception {
                return a();
            }

            public Void a() throws Exception {
                this.b.b.a(150);
                this.b.b.a(playerDBEntity);
                return null;
            }
        });
    }

    @Nullable
    public PlayerDBEntity<BangumiPlayerDBData> b(long j) {
        return this.b.a(beq.a(this.a, j), BangumiPlayerDBData.class);
    }

    public long a(String str) {
        PlayerDBEntity a = this.b.a(this.c.c(null), beq.a(str), BangumiPlayerDBData.class);
        if (a != null) {
            return ((BangumiPlayerDBData) a.f).g;
        }
        return 0;
    }
}
