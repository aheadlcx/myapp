package bili2.bl;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class hua implements htz {
    static hty a;
    static hty b;
    private final huc c;
    private final huk d;

    static {
        a = null;
        b = null;
        a = a("com.facebook.animated.gif.GifImage");
        b = a("com.facebook.animated.webp.WebPImage");
    }

    private static hty a(String str) {
        try {
            return (hty) Class.forName(str).newInstance();
        } catch (Throwable th) {
            return null;
        }
    }

    public hua(huc bl_huc, huk bl_huk) {
        this.c = bl_huc;
        this.d = bl_huk;
    }

    public hwq a(hws bl_hws, hvm bl_hvm, Config config) {
        if (a == null) {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
        Object c = bl_hws.c();
        hpd.a(c);
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) c.a();
            hwq a = a(bl_hvm, a.decode(pooledByteBuffer.b(), pooledByteBuffer.a()), config);
            return a;
        } finally {
            hpw.c(c);
        }
    }

    public hwq b(hws bl_hws, hvm bl_hvm, Config config) {
        if (b == null) {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
        Object c = bl_hws.c();
        hpd.a(c);
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) c.a();
            hwq a = a(bl_hvm, b.decode(pooledByteBuffer.b(), pooledByteBuffer.a()), config);
            return a;
        } finally {
            hpw.c(c);
        }
    }

    private hwq a(hvm bl_hvm, hts bl_hts, Config config) {
        Throwable th;
        hpw bl_hpw = null;
        Iterable a;
        try {
            hwq bl_hwr;
            int frameCount = bl_hvm.c ? bl_hts.getFrameCount() - 1 : 0;
            if (bl_hvm.e) {
                bl_hwr = new hwr(a(bl_hts, config, frameCount), hwu.a, 0);
                hpw.c(null);
                hpw.a(null);
            } else {
                if (bl_hvm.d) {
                    a = a(bl_hts, config);
                    try {
                        bl_hpw = hpw.b((hpw) a.get(frameCount));
                    } catch (Throwable th2) {
                        th = th2;
                        hpw.c(null);
                        hpw.a(a);
                        throw th;
                    }
                }
                a = null;
                if (bl_hvm.b && r1 == null) {
                    bl_hpw = a(bl_hts, config, frameCount);
                }
                bl_hwr = new hwo(htu.b(bl_hts).a(bl_hpw).a(frameCount).a((List) a).e());
                hpw.c(bl_hpw);
                hpw.a(a);
            }
            return bl_hwr;
        } catch (Throwable th3) {
            th = th3;
            a = null;
            hpw.c(null);
            hpw.a(a);
            throw th;
        }
    }

    private hpw<Bitmap> a(hts bl_hts, Config config, int i) {
        hpw<Bitmap> a = a(bl_hts.getWidth(), bl_hts.getHeight(), config);
        new AnimatedImageCompositor(this.c.a(htu.a(bl_hts), null), new a(this) {
            final /* synthetic */ hua a;

            {
                this.a = r1;
            }

            public void a(int i, Bitmap bitmap) {
            }

            public hpw<Bitmap> a(int i) {
                return null;
            }
        }).a(i, (Bitmap) a.a());
        return a;
    }

    private List<hpw<Bitmap>> a(hts bl_hts, Config config) {
        htr a = this.c.a(htu.a(bl_hts), null);
        final List<hpw<Bitmap>> arrayList = new ArrayList(a.a());
        AnimatedImageCompositor animatedImageCompositor = new AnimatedImageCompositor(a, new a(this) {
            final /* synthetic */ hua b;

            public void a(int i, Bitmap bitmap) {
            }

            public hpw<Bitmap> a(int i) {
                return hpw.b((hpw) arrayList.get(i));
            }
        });
        for (int i = 0; i < a.a(); i++) {
            hpw a2 = a(a.c(), a.d(), config);
            animatedImageCompositor.a(i, (Bitmap) a2.a());
            arrayList.add(a2);
        }
        return arrayList;
    }

    @SuppressLint({"NewApi"})
    private hpw<Bitmap> a(int i, int i2, Config config) {
        hpw<Bitmap> a = this.d.a(i, i2, config);
        ((Bitmap) a.a()).eraseColor(0);
        if (VERSION.SDK_INT >= 12) {
            ((Bitmap) a.a()).setHasAlpha(true);
        }
        return a;
    }
}
