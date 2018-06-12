package bili.bl;

import android.support.annotation.Nullable;
import bl.dfi.b;
import com.bilibili.bililive.painting.api.entity.Painting;
import com.bilibili.bililive.painting.api.entity.PaintingList;

/* compiled from: BL */
public class dfj extends dbj<b> implements a {
    private static final String e = hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 107, (byte) 113, (byte) 109});

    /* compiled from: BL */
    class a extends gnc<PaintingList> {
        final /* synthetic */ dfj a;
        private int b;

        public /* synthetic */ void b(@Nullable Object obj) {
            a((PaintingList) obj);
        }

        a(dfj bl_dfj, int i) {
            this.a = bl_dfj;
            this.b = i;
        }

        public void a(@Nullable PaintingList paintingList) {
            if (this.a.a != null && !((b) this.a.a).s()) {
                if (paintingList == null || paintingList.items == null || paintingList.items.isEmpty()) {
                    ((b) this.a.a).a(this.b, null);
                } else {
                    ((b) this.a.a).a(this.b, (Painting) paintingList.items.get(0));
                }
            }
        }

        public void a(Throwable th) {
            if (this.a.a != null && !((b) this.a.a).s()) {
                ((b) this.a.a).a(this.b, null);
            }
        }
    }

    public dfj(b bVar) {
        super(bVar);
    }

    public void a(int i, String str, boolean z) {
        a(z);
        int i2 = z ? 0 : this.b;
        if (i == 1) {
            dbb.a(str, "hot", i2, 20, new bl.dbj.a(this, z));
        } else {
            dbb.b(str, "hot", i2, 20, new bl.dbj.a(this, z));
        }
    }

    public void a(int i, String str) {
        dbb.a(i, str, "week", new a(this, 7));
        dbb.a(i, str, hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 107, (byte) 113, (byte) 109}), new a(this, -2));
        dbb.a(i, str, "day", new a(this, -3));
    }
}
