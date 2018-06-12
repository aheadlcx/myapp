package bili2.bl;

import java.lang.ref.WeakReference;

/* compiled from: BL */
public class gmj<T> extends gmq<T> {
    public final WeakReference<goe> a;

    public gmj(T t, int i, goe bl_goe) {
        super(t, i);
        this.a = new WeakReference(bl_goe);
    }
}
