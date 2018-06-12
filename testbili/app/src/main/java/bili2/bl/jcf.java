package bili2.bl;

import android.view.Surface;

/* compiled from: BL */
public class jcf extends jbw {
    private Surface b;

    public jcf(jbu bl_jbu, Surface surface) {
        super(bl_jbu);
        a((Object) surface);
        this.b = surface;
    }

    public void d() {
        a();
        if (this.b != null) {
            this.b.release();
            this.b = null;
        }
    }

    public void a(jbu bl_jbu) {
        if (this.b == null) {
            throw new RuntimeException("not yet implemented for SurfaceTexture");
        }
        this.a = bl_jbu;
        a((Object) this.b);
    }
}
