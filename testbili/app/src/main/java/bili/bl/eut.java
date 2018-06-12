package bili.bl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import bl.eur.a;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

@TargetApi(16)
/* compiled from: BL */
public class eut extends TextureView implements SurfaceTextureListener, a, euw {
    public static int b = 1;
    public static int c = 2;
    public static int d = 3;
    public static int e = 4;
    public static int f = 5;
    public static int g = 6;
    public static int h = 7;
    public static int i = 13;
    public static int j = 14;
    public static int k = 15;
    public static int l = 16;
    public static int m = 17;
    public static int n = 0;
    public static int o = 1;
    public static int p = 1;
    public static int q = 2;
    protected euu a;
    private final String r = hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114});
    private List<Runnable> s = new ArrayList();
    private boolean t = false;
    private euw u;
    private eur v;
    private euv w;
    private SurfaceTexture x;
    private SurfaceTexture y;
    private int z = 0;

    public eut(Context context) {
        super(context);
        a(context);
    }

    public void b() {
        if (this.a != null) {
            this.a.d();
        }
    }

    public void by_() {
        this.y = this.v.g();
        if (this.u != null) {
            this.u.by_();
        }
    }

    public void b(int i, int i2) {
        this.v.b(i, i2);
    }

    public void c_(int i, int i2) {
        if (this.u != null) {
            this.u.c_(i, i2);
        }
    }

    public boolean c() {
        if (this.u != null) {
            return this.u.c();
        }
        return true;
    }

    public SurfaceTexture getVideoSurfaceTexture() {
        return this.y;
    }

    protected void onAttachedToWindow() {
        if (this.x != null) {
            setSurfaceTexture(this.x);
            this.x = getSurfaceTexture();
        }
        super.onAttachedToWindow();
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 68, (byte) 113, (byte) 113, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 97, (byte) 81, (byte) 106, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114, (byte) 37, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 113, (byte) 100, (byte) 102, (byte) 109, (byte) 37, (byte) 56}) + this.t + hae.a(new byte[]{(byte) 37, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 63}) + this.x);
    }

    protected void onDetachedFromWindow() {
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 102, (byte) 109, (byte) 96, (byte) 97, (byte) 67, (byte) 119, (byte) 106, (byte) 104, (byte) 82, (byte) 108, (byte) 107, (byte) 97, (byte) 106, (byte) 114}));
        super.onDetachedFromWindow();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.v.j()) {
            return this.w.a(motionEvent);
        }
        return false;
    }

    public void d() {
        if (this.a != null) {
            this.a.h();
        }
        if (this.x != null) {
            this.x.release();
            this.x = null;
        }
        this.t = true;
        this.w = null;
    }

    public void setRenderMode(int i) {
        if (this.z != 0 && this.z != 1) {
            Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 37, (byte) 87, (byte) 64, (byte) 75, (byte) 65, (byte) 64, (byte) 87, (byte) 72, (byte) 74, (byte) 65, (byte) 64, (byte) 90, (byte) 82, (byte) 77, (byte) 64, (byte) 75, (byte) 90, (byte) 65, (byte) 76, (byte) 87, (byte) 81, (byte) 92, (byte) 37, (byte) 106, (byte) 119, (byte) 37, (byte) 87, (byte) 64, (byte) 75, (byte) 65, (byte) 64, (byte) 87, (byte) 72, (byte) 74, (byte) 65, (byte) 64, (byte) 90, (byte) 70, (byte) 74, (byte) 75, (byte) 81, (byte) 76, (byte) 75, (byte) 80, (byte) 74, (byte) 80, (byte) 86, (byte) 73, (byte) 92}));
        } else if (this.z != i) {
            this.z = i;
            if (this.a != null) {
                this.a.a(i);
            }
        }
    }

    protected void a(Context context) {
        this.v = new eur(this);
        this.v.a((euw) this);
        super.setSurfaceTextureListener(this);
        this.w = new euv(context, this.v);
    }

    public void e() {
        if (this.a != null) {
            this.a.d();
        }
    }

    protected void f() {
        this.a.f();
    }

    protected void g() {
        this.a.g();
        this.a.h();
        this.a = null;
    }

    protected void c(int i, int i2) {
        this.a.a(i, i2);
    }

    protected void h() {
        if (this.a != null) {
            this.a.e();
        }
    }

    public EGLContext getCurrentEglContext() {
        return this.a == null ? null : this.a.b();
    }

    public void setOnRendererListener(euw bl_euw) {
        this.u = bl_euw;
    }

    protected int getRenderMode() {
        return this.z;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 68, (byte) 115, (byte) 100, (byte) 108, (byte) 105, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 118, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 63}) + surfaceTexture);
        if (surfaceTexture == this.x) {
            Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 68, (byte) 115, (byte) 100, (byte) 108, (byte) 105, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 118, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 37, (byte) 56, (byte) 37, (byte) 104, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96}));
            return;
        }
        this.x = surfaceTexture;
        if (this.a == null) {
            a(surfaceTexture);
            return;
        }
        this.a.a((Object) surfaceTexture);
        d(i, i2);
    }

    protected void a(SurfaceTexture surfaceTexture) {
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 66, (byte) 73, (byte) 81, (byte) 109, (byte) 119, (byte) 96, (byte) 100, (byte) 97}));
        this.a = new euu(this.v, getRenderMode(), surfaceTexture);
        this.a.a(true);
        this.a.start();
        d(getWidth(), getHeight());
        for (Runnable a : this.s) {
            this.a.a(a);
        }
        this.s.clear();
    }

    private void d(int i, int i2) {
        f();
        c(i, i2);
        h();
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 86, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 98, (byte) 96, (byte) 97, (byte) 63, (byte) 37}) + i + "*" + i2 + hae.a(new byte[]{(byte) 37, (byte) 118, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 63}) + surfaceTexture + hae.a(new byte[]{(byte) 37, (byte) 98, (byte) 96, (byte) 113, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 63}) + getSurfaceTexture());
        if (this.t && this.u != null) {
            a(getSurfaceTexture());
        }
        this.t = false;
        c(i, i2);
        h();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 65, (byte) 96, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 124, (byte) 96, (byte) 97}));
        if (this.u == null) {
            return true;
        }
        boolean c = this.u.c();
        Log.d(hae.a(new byte[]{(byte) 66, (byte) 73, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 40, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 86, (byte) 112, (byte) 119, (byte) 99, (byte) 100, (byte) 102, (byte) 96, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 65, (byte) 96, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 124, (byte) 96, (byte) 97, (byte) 37, (byte) 97, (byte) 96, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 124, (byte) 63}) + c);
        if (!c) {
            return c;
        }
        g();
        this.w = null;
        this.x = null;
        this.y = null;
        return c;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setRenderType(int i) {
        this.v.a(i);
        e();
    }

    public void setMotionType(int i) {
        boolean z;
        boolean z2 = true;
        eur bl_eur = this.v;
        if ((p & i) == p) {
            z = true;
        } else {
            z = false;
        }
        bl_eur.a(z);
        eur bl_eur2 = this.v;
        if ((q & i) != q) {
            z2 = false;
        }
        bl_eur2.b(z2);
        e();
    }

    public int getMotionType() {
        int i;
        int i2 = 0;
        if (this.v.h()) {
            i = p;
        } else {
            i = 0;
        }
        if (this.v.i()) {
            i2 = q;
        }
        return i | i2;
    }

    public int getVideoWidth() {
        return this.v.e();
    }

    public int getVideoHeight() {
        return this.v.f();
    }

    public void setSpecifyAspect(float f) {
        this.v.a(f);
    }

    @Deprecated
    public void a(eus bl_eus) {
        bl_eus.a(getBitmap());
    }
}
