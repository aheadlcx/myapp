package bili2.bl;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso.LoadedFrom;

/* compiled from: BL */
class iva extends iuq<ImageView> {
    iuu m;

    iva(Picasso picasso, ImageView imageView, ivg bl_ivg, int i, int i2, int i3, Drawable drawable, String str, Object obj, iuu bl_iuu, boolean z) {
        super(picasso, imageView, bl_ivg, i, i2, i3, drawable, str, obj, z);
        this.m = bl_iuu;
    }

    public void a(Bitmap bitmap, LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            Bitmap bitmap2 = bitmap;
            LoadedFrom loadedFrom2 = loadedFrom;
            ive.a(imageView, this.a.c, bitmap2, loadedFrom2, this.d, this.a.k);
            if (this.m != null) {
                this.m.a();
            }
        }
    }

    public void a() {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView != null) {
            if (this.g != 0) {
                imageView.setImageResource(this.g);
            } else if (this.h != null) {
                imageView.setImageDrawable(this.h);
            }
            if (this.m != null) {
                this.m.b();
            }
        }
    }

    void b() {
        super.b();
        if (this.m != null) {
            this.m = null;
        }
    }
}
