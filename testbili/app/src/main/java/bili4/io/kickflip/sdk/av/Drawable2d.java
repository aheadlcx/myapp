package bili4.io.kickflip.sdk.av;

import bl.jbx;
import java.nio.FloatBuffer;
import u.aly.dd;
import u.aly.q;

/* compiled from: BL */
public class Drawable2d {
    private static final float[] a = new float[]{0.0f, 0.62200844f, -0.5f, -0.31100425f, 0.5f, -0.31100425f};
    private static final FloatBuffer b = jbx.a(a);
    private static final float[] c = new float[]{-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
    private static final FloatBuffer d = jbx.a(c);
    private static final float[] e = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private static final FloatBuffer f = jbx.a(e);
    private FloatBuffer g;
    private int h;
    private int i;
    private int j;
    private Prefab k;

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Prefab.values().length];

        static {
            try {
                a[Prefab.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[Prefab.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Prefab.FULL_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    /* compiled from: BL */
    public enum Prefab {
        TRIANGLE,
        RECTANGLE,
        FULL_RECTANGLE
    }

    public Drawable2d(Prefab prefab) {
        switch (AnonymousClass1.a[prefab.ordinal()]) {
            case q.a /*1*/:
                this.g = b;
                this.i = 2;
                this.j = this.i * 4;
                this.h = a.length / this.i;
                break;
            case dd.c /*2*/:
                this.g = d;
                this.i = 2;
                this.j = this.i * 4;
                this.h = c.length / this.i;
                break;
            case dd.d /*3*/:
                this.g = f;
                this.i = 2;
                this.j = this.i * 4;
                this.h = e.length / this.i;
                break;
            default:
                throw new RuntimeException("Unknown shape " + prefab);
        }
        this.k = prefab;
    }

    public FloatBuffer a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.j;
    }

    public int d() {
        return this.i;
    }

    public String toString() {
        if (this.k != null) {
            return "[Drawable2d: " + this.k + "]";
        }
        return "[Drawable2d: ...]";
    }
}
