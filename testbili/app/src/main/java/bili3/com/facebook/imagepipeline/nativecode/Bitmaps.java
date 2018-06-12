package bili3.com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import bl.hpa;
import bl.hpd;
import bl.hxr;
import bl.iah;
import java.nio.ByteBuffer;

@hpa
/* compiled from: BL */
public class Bitmaps {
    @hpa
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    @hpa
    private static native ByteBuffer nativeGetByteBuffer(Bitmap bitmap, long j, long j2);

    @hpa
    private static native void nativePinBitmap(Bitmap bitmap);

    @hpa
    private static native void nativeReleaseByteBuffer(Bitmap bitmap);

    static {
        hxr.a();
    }

    public static void pinBitmap(Bitmap bitmap) {
        hpd.a(bitmap);
        nativePinBitmap(bitmap);
    }

    public static ByteBuffer getByteBuffer(Bitmap bitmap, long j, long j2) {
        hpd.a(bitmap);
        return nativeGetByteBuffer(bitmap, j, j2);
    }

    public static void releaseByteBuffer(Bitmap bitmap) {
        hpd.a(bitmap);
        nativeReleaseByteBuffer(bitmap);
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2 = true;
        hpd.a(bitmap2.getConfig() == bitmap.getConfig());
        hpd.a(bitmap.isMutable());
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z = true;
        } else {
            z = false;
        }
        hpd.a(z);
        if (bitmap.getHeight() != bitmap2.getHeight()) {
            z2 = false;
        }
        hpd.a(z2);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @TargetApi(19)
    public static void reconfigureBitmap(Bitmap bitmap, int i, int i2, Config config) {
        hpd.a(bitmap.getAllocationByteCount() >= (i * i2) * iah.a(config));
        bitmap.reconfigure(i, i2, config);
    }
}
