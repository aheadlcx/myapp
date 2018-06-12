package bili2.bl;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.main2.api.AccountMine;

/* compiled from: BL */
public final class ljg {
    private static ljg a;
    private List<a> b = new ArrayList();
    private AccountMine c;

    /* compiled from: BL */
    public interface a {
        void a(@Nullable AccountMine accountMine);
    }

    public static ljg a() {
        if (a == null) {
            synchronized (ljg.class) {
                if (a == null) {
                    a = new ljg();
                }
            }
        }
        return a;
    }

    public synchronized void a(a aVar) {
        if (aVar != null) {
            aVar.a(this.c);
            if (!this.b.contains(aVar)) {
                this.b.add(aVar);
            }
        }
    }

    public synchronized void b(a aVar) {
        if (aVar != null) {
            this.b.remove(aVar);
        }
    }

    public synchronized void a(AccountMine accountMine) {
        this.c = accountMine;
        b();
    }

    private void b() {
        for (a a : this.b) {
            a.a(this.c);
        }
    }
}
