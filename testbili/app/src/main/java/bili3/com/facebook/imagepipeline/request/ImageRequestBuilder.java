package bili3.com.facebook.imagepipeline.request;

import android.net.Uri;
import bl.hpd;
import bl.hqh;
import bl.hvl;
import bl.hvm;
import bl.hvo;
import bl.hvp;
import bl.hvx;
import bl.hwx;
import bl.iad;
import bl.iae;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import javax.annotation.Nullable;

/* compiled from: BL */
public class ImageRequestBuilder {
    private Uri a = null;
    private RequestLevel b = RequestLevel.FULL_FETCH;
    @Nullable
    private hvo c = null;
    @Nullable
    private hvp d = null;
    private hvm e = hvm.a();
    private CacheChoice f = CacheChoice.DEFAULT;
    private boolean g = hvx.f().a();
    private boolean h = false;
    private Priority i = Priority.HIGH;
    @Nullable
    private iae j = null;
    private boolean k = true;
    @Nullable
    private hwx l;
    @Nullable
    private iad m = null;
    @Nullable
    private hvl n = null;

    /* compiled from: BL */
    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    public static ImageRequestBuilder a(Uri uri) {
        return new ImageRequestBuilder().b(uri);
    }

    public static ImageRequestBuilder a(ImageRequest imageRequest) {
        return a(imageRequest.b()).a(imageRequest.j()).a(imageRequest.i()).a(imageRequest.a()).b(imageRequest.l()).a(imageRequest.n()).a(imageRequest.d()).a(imageRequest.q()).a(imageRequest.k()).a(imageRequest.m()).a(imageRequest.g()).a(imageRequest.r()).a(imageRequest.h());
    }

    private ImageRequestBuilder() {
    }

    public ImageRequestBuilder b(Uri uri) {
        hpd.a(uri);
        this.a = uri;
        return this;
    }

    public Uri a() {
        return this.a;
    }

    public ImageRequestBuilder a(iad bl_iad) {
        this.m = bl_iad;
        return this;
    }

    @Nullable
    public iad b() {
        return this.m;
    }

    public ImageRequestBuilder a(RequestLevel requestLevel) {
        this.b = requestLevel;
        return this;
    }

    public RequestLevel c() {
        return this.b;
    }

    public ImageRequestBuilder a(@Nullable hvo bl_hvo) {
        this.c = bl_hvo;
        return this;
    }

    @Nullable
    public hvo d() {
        return this.c;
    }

    public ImageRequestBuilder a(@Nullable hvp bl_hvp) {
        this.d = bl_hvp;
        return this;
    }

    @Nullable
    public hvp e() {
        return this.d;
    }

    public ImageRequestBuilder a(@Nullable hvl bl_hvl) {
        this.n = bl_hvl;
        return this;
    }

    @Nullable
    public hvl f() {
        return this.n;
    }

    public ImageRequestBuilder a(hvm bl_hvm) {
        this.e = bl_hvm;
        return this;
    }

    public hvm g() {
        return this.e;
    }

    public ImageRequestBuilder a(CacheChoice cacheChoice) {
        this.f = cacheChoice;
        return this;
    }

    public CacheChoice h() {
        return this.f;
    }

    public ImageRequestBuilder a(boolean z) {
        this.g = z;
        return this;
    }

    public boolean i() {
        return this.g;
    }

    public ImageRequestBuilder b(boolean z) {
        this.h = z;
        return this;
    }

    public boolean j() {
        return this.h;
    }

    public boolean k() {
        return this.k && hqh.b(this.a);
    }

    public ImageRequestBuilder a(Priority priority) {
        this.i = priority;
        return this;
    }

    public Priority l() {
        return this.i;
    }

    public ImageRequestBuilder a(iae bl_iae) {
        this.j = bl_iae;
        return this;
    }

    @Nullable
    public iae m() {
        return this.j;
    }

    public ImageRequestBuilder a(hwx bl_hwx) {
        this.l = bl_hwx;
        return this;
    }

    @Nullable
    public hwx n() {
        return this.l;
    }

    public ImageRequest o() {
        p();
        return new ImageRequest(this);
    }

    protected void p() {
        if (this.a == null) {
            throw new BuilderException("Source must be set!");
        }
        if (hqh.h(this.a)) {
            if (!this.a.isAbsolute()) {
                throw new BuilderException("Resource URI path must be absolute.");
            } else if (this.a.getPath().isEmpty()) {
                throw new BuilderException("Resource URI must not be empty");
            } else {
                try {
                    Integer.parseInt(this.a.getPath().substring(1));
                } catch (NumberFormatException e) {
                    throw new BuilderException("Resource URI path must be a resource id.");
                }
            }
        }
        if (hqh.g(this.a) && !this.a.isAbsolute()) {
            throw new BuilderException("Asset URI path must be absolute.");
        }
    }
}
