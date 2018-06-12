package bili.bl;

import com.bilibili.bililive.painting.api.entity.ExtraUserInfo;
import com.bilibili.bililive.painting.api.entity.Painting;
import com.bilibili.bililive.painting.api.repost.PaintingRepostListData;

/* compiled from: BL */
public interface dbs {

    /* compiled from: BL */
    public interface a extends bl.dbo.a {
        void a(long j);

        void a(long j, int i, boolean z);

        void a(boolean z, long j);

        void b(long j);

        void c(long j);

        void d();

        void d(long j);

        long e(long j);
    }

    /* compiled from: BL */
    public interface b extends bl.dbo.b {
        void a(long j);

        void a(ExtraUserInfo extraUserInfo);

        void a(Painting painting);

        void a(PaintingRepostListData paintingRepostListData, boolean z);

        void a(boolean z);

        void b(Painting painting);

        void b(boolean z);

        void l();

        void m();

        boolean o();

        void p();
    }
}
