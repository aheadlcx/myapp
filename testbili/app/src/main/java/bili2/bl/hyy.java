package bili2.bl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore.Images.Thumbnails;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: BL */
public class hyy extends hza implements hzz<hws> {
    private static final Class<?> a = hyy.class;
    private static final String[] b = new String[]{"_id", "_data"};
    private static final String[] c = new String[]{"_data"};
    private static final Rect d = new Rect(0, 0, 512, 384);
    private static final Rect e = new Rect(0, 0, 96, 96);
    private final ContentResolver f;

    public hyy(Executor executor, hps bl_hps, ContentResolver contentResolver) {
        super(executor, bl_hps);
        this.f = contentResolver;
    }

    public boolean a(hvo bl_hvo) {
        return iaa.a(d.width(), d.height(), bl_hvo);
    }

    protected hws a(ImageRequest imageRequest) throws IOException {
        Uri b = imageRequest.b();
        if (hqh.f(b)) {
            hws a = a(b, imageRequest.g());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    @Nullable
    private hws a(Uri uri, hvo bl_hvo) throws IOException {
        Cursor query = this.f.query(uri, b, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (bl_hvo != null) {
                hws a = a(bl_hvo, query.getInt(query.getColumnIndex("_id")));
                if (a != null) {
                    a.c(b(string));
                    query.close();
                    return a;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    private hws a(hvo bl_hvo, int i) throws IOException {
        Cursor queryMiniThumbnail;
        Throwable th;
        hws bl_hws = null;
        int b = b(bl_hvo);
        if (b != 0) {
            try {
                queryMiniThumbnail = Thumbnails.queryMiniThumbnail(this.f, (long) i, b, c);
                if (queryMiniThumbnail != null) {
                    try {
                        queryMiniThumbnail.moveToFirst();
                        if (queryMiniThumbnail.getCount() > 0) {
                            String string = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data"));
                            if (new File(string).exists()) {
                                bl_hws = b(new FileInputStream(string), a(string));
                                if (queryMiniThumbnail != null) {
                                    queryMiniThumbnail.close();
                                }
                            }
                        }
                        if (queryMiniThumbnail != null) {
                            queryMiniThumbnail.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (queryMiniThumbnail != null) {
                            queryMiniThumbnail.close();
                        }
                        throw th;
                    }
                } else if (queryMiniThumbnail != null) {
                    queryMiniThumbnail.close();
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                queryMiniThumbnail = null;
                th = th4;
                if (queryMiniThumbnail != null) {
                    queryMiniThumbnail.close();
                }
                throw th;
            }
        }
        return bl_hws;
    }

    private static int b(hvo bl_hvo) {
        if (iaa.a(e.width(), e.height(), bl_hvo)) {
            return 3;
        }
        if (iaa.a(d.width(), d.height(), bl_hvo)) {
            return 1;
        }
        return 0;
    }

    private static int a(String str) {
        return str == null ? -1 : (int) new File(str).length();
    }

    protected String a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    private static int b(String str) {
        int i = 0;
        if (str != null) {
            try {
                i = iai.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (Throwable e) {
                hpi.b(a, e, "Unable to retrieve thumbnail rotation for %s", new Object[]{str});
            }
        }
        return i;
    }
}
