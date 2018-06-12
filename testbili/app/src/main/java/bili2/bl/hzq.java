package bili2.bl;

import com.facebook.common.memory.PooledByteBuffer;

/* compiled from: BL */
public class hzq implements hzl<hpw<PooledByteBuffer>> {
    private final hzl<hws> a;

    /* compiled from: BL */
    class a extends hyo<hws, hpw<PooledByteBuffer>> {
        final /* synthetic */ hzq a;

        private a(hzq bl_hzq, hyl<hpw<PooledByteBuffer>> bl_hyl_bl_hpw_com_facebook_common_memory_PooledByteBuffer) {
            this.a = bl_hzq;
            super(bl_hyl_bl_hpw_com_facebook_common_memory_PooledByteBuffer);
        }

        protected void a(hws bl_hws, int i) {
            hpw bl_hpw = null;
            try {
                if (hws.e(bl_hws)) {
                    bl_hpw = bl_hws.c();
                }
                d().b(bl_hpw, i);
            } finally {
                hpw.c(bl_hpw);
            }
        }
    }

    public hzq(hzl<hws> bl_hzl_bl_hws) {
        this.a = bl_hzl_bl_hws;
    }

    public void a(hyl<hpw<PooledByteBuffer>> bl_hyl_bl_hpw_com_facebook_common_memory_PooledByteBuffer, hzm bl_hzm) {
        this.a.a(new a(bl_hyl_bl_hpw_com_facebook_common_memory_PooledByteBuffer), bl_hzm);
    }
}
