package bili.bl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.net.Uri;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* compiled from: BL */
public class cpa {
    private static final String a = hae.a(new byte[]{(byte) 42, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 42});

    public static File a(Context context, Bitmap bitmap, int i) {
        FileOutputStream fileOutputStream;
        Throwable e;
        Throwable e2;
        File a = a(context);
        if (bitmap == null || bitmap.isRecycled() || a == null) {
            return null;
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        File file = new File(a, UUID.randomUUID().toString());
        if (file.exists()) {
            return null;
        }
        byte[] a2 = a(bitmap, i, true);
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(a2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Throwable e3) {
                        ibn.a(e3);
                    }
                }
                return file;
            } catch (Throwable e22) {
                try {
                    ibn.a(e22);
                    if (fileOutputStream == null) {
                        return null;
                    }
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return null;
                    } catch (Throwable e222) {
                        ibn.a(e222);
                        return null;
                    }
                } catch (FileNotFoundException e4) {
                    e222 = e4;
                    try {
                        ibn.a(e222);
                        if (fileOutputStream != null) {
                            return null;
                        }
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            return null;
                        } catch (Throwable e2222) {
                            ibn.a(e2222);
                            return null;
                        }
                    } catch (Throwable th) {
                        e3 = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable e22222) {
                                ibn.a(e22222);
                            }
                        }
                        throw e3;
                    }
                }
            }
        } catch (FileNotFoundException e5) {
            e22222 = e5;
            fileOutputStream = null;
            ibn.a(e22222);
            if (fileOutputStream != null) {
                return null;
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            return null;
        } catch (Throwable e222222) {
            fileOutputStream = null;
            e3 = e222222;
            if (fileOutputStream != null) {
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            throw e3;
        }
    }

    private static File a(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            return null;
        }
        return new File(externalCacheDir.getAbsolutePath() + hae.a(new byte[]{(byte) 42, (byte) 119, (byte) 96, (byte) 117, (byte) 106, (byte) 119, (byte) 113, (byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 42}));
    }

    public static byte[] a(Bitmap bitmap, int i, boolean z) {
        int i2 = i * 1024;
        if (bitmap == null) {
            return null;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 95;
        bitmap.compress(CompressFormat.JPEG, 95, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        while (length > i2) {
            if (length > i2 * 10) {
                length = i3 - 50;
            } else if (length > i2 * 2) {
                length = i3 - 20;
            } else {
                length = i3 - 5;
            }
            if (length <= 0) {
                break;
            }
            byteArrayOutputStream.reset();
            bitmap.compress(CompressFormat.JPEG, length, byteArrayOutputStream);
            i3 = byteArrayOutputStream.toByteArray().length;
            Log.d("zjb", hae.a(new byte[]{(byte) 116, (byte) 112, (byte) 100, (byte) 105, (byte) 108, (byte) 113, (byte) 124, (byte) 95, (byte) 108, (byte) 117, (byte) 37}) + length + "%");
            Log.d("zjb", hae.a(new byte[]{(byte) 85, (byte) 108, (byte) 102, (byte) 67, (byte) 108, (byte) 105, (byte) 96, (byte) 86, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 37}) + (i3 / 1024) + " Kb");
            int i4 = i3;
            i3 = length;
            length = i4;
        }
        if (z) {
            bitmap.recycle();
        }
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return toByteArray;
        } catch (Throwable e) {
            ibn.a(e);
            return toByteArray;
        }
    }

    public static File a(Context context, Uri uri, int i) {
        return a(context, a(a(context, uri), i), i);
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        double d = 500.0d;
        if (bitmap == null) {
            return bitmap;
        }
        double d2 = (double) (i * 2);
        if (d2 <= 500.0d) {
            d = d2;
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        d2 = (double) (byteArrayOutputStream.toByteArray().length / 1024);
        Log.d("zjb", hae.a(new byte[]{(byte) 85, (byte) 108, (byte) 102, (byte) 86, (byte) 108, Byte.MAX_VALUE, (byte) 96, (byte) 71, (byte) 96, (byte) 99, (byte) 106, (byte) 119, (byte) 96, (byte) 95, (byte) 108, (byte) 117, (byte) 37}) + d2 + " KB");
        if (d2 <= d) {
            return bitmap;
        }
        d = d2 / d;
        return a(bitmap, ((double) bitmap.getWidth()) / Math.sqrt(d), ((double) bitmap.getHeight()) / Math.sqrt(d));
    }

    public static Bitmap a(Bitmap bitmap, double d, double d2) {
        if (d < 470.0d) {
            d = 470.0d;
        }
        if (d2 < 293.0d) {
            d2 = 293.0d;
        }
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        Log.d("zjb", hae.a(new byte[]{(byte) 85, (byte) 108, (byte) 102, (byte) 70, (byte) 119, (byte) 106, (byte) 117, (byte) 37}) + width + "X" + height + hae.a(new byte[]{(byte) 85, (byte) 108, (byte) 102, (byte) 67, (byte) 108, (byte) 107, (byte) 100, (byte) 105}) + d + "X" + d2);
        Matrix matrix = new Matrix();
        matrix.postScale(((float) d) / width, ((float) d2) / height);
        try {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, true);
        } catch (OutOfMemoryError e) {
            ana.c(hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 71, (byte) 108, (byte) 113, (byte) 104, (byte) 100, (byte) 117, (byte) 80, (byte) 113, (byte) 108, (byte) 105, (byte) 43, Byte.MAX_VALUE, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 43, (byte) 74, (byte) 112, (byte) 113, (byte) 74, (byte) 99, (byte) 72, (byte) 96, (byte) 104, (byte) 106, (byte) 119, (byte) 124, (byte) 64, (byte) 119, (byte) 119, (byte) 106, (byte) 119}), e.getMessage().toLowerCase());
        }
        return bitmap;
    }

    public static boolean a(Context context, Uri uri, int i, int i2) {
        boolean z = true;
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            options.inDither = true;
            options.inPreferredConfig = Config.RGB_565;
            BitmapFactory.decodeStream(openInputStream, null, options);
            openInputStream.close();
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            Log.d("zjb", hae.a(new byte[]{(byte) 85, (byte) 108, (byte) 102, (byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 100, (byte) 105, (byte) 82, (byte) 108, (byte) 97, (byte) 113, (byte) 109}) + i3);
            Log.d("zjb", hae.a(new byte[]{(byte) 85, (byte) 108, (byte) 102, (byte) 106, (byte) 119, (byte) 108, (byte) 98, (byte) 108, (byte) 107, (byte) 100, (byte) 105, (byte) 77, (byte) 96, (byte) 108, (byte) 98, (byte) 109, (byte) 113}) + i4);
            if (i3 < i || i4 < i2) {
                z = false;
            }
            return z;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e2) {
            return false;
        } catch (NullPointerException e3) {
            ana.a("Uri", uri + ":" + e3.getMessage());
            return false;
        } catch (IllegalArgumentException e4) {
            ana.a("Uri", uri + ":" + e4.getMessage());
            return false;
        }
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (!(bitmap == null || bitmap.equals(createBitmap) || bitmap.isRecycled())) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    @TargetApi(18)
    public static Bitmap a(Context context, Bitmap bitmap) {
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap, MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius(10.0f);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(copy);
        createFromBitmap.destroy();
        createTyped.destroy();
        create.destroy();
        create2.destroy();
        return copy;
    }

    public static void a(Context context, Bitmap bitmap, String str) {
        OutputStream fileOutputStream;
        Throwable e;
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bitmap.compress(CompressFormat.PNG, 100, fileOutputStream);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable e2) {
                        ibn.a(e2);
                    }
                }
            } catch (FileNotFoundException e3) {
                e2 = e3;
                try {
                    ibn.a(e2);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable e22) {
                            ibn.a(e22);
                        }
                    }
                } catch (Throwable th) {
                    e22 = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable e4) {
                            ibn.a(e4);
                        }
                    }
                    throw e22;
                }
            }
        } catch (FileNotFoundException e5) {
            e22 = e5;
            fileOutputStream = null;
            ibn.a(e22);
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (Throwable th2) {
            e22 = th2;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw e22;
        }
    }

    public static Bitmap a(Context context, Uri uri) {
        Bitmap decodeStream;
        FileNotFoundException e;
        IOException e2;
        try {
            Options options = new Options();
            options.inSampleSize = 1;
            options.inDither = true;
            options.inPreferredConfig = Config.RGB_565;
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
            try {
                openInputStream.close();
            } catch (FileNotFoundException e3) {
                e = e3;
                Log.d("zjb", hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 71, (byte) 108, (byte) 113, (byte) 104, (byte) 100, (byte) 117, (byte) 67, (byte) 106, (byte) 119, (byte) 104, (byte) 80, (byte) 119, (byte) 108}) + e.getMessage().toString());
                return decodeStream;
            } catch (IOException e4) {
                e2 = e4;
                Log.d("zjb", hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 71, (byte) 108, (byte) 113, (byte) 104, (byte) 100, (byte) 117, (byte) 67, (byte) 106, (byte) 119, (byte) 104, (byte) 80, (byte) 119, (byte) 108}) + e2.getMessage().toString());
                return decodeStream;
            }
        } catch (FileNotFoundException e5) {
            FileNotFoundException fileNotFoundException = e5;
            decodeStream = null;
            e = fileNotFoundException;
            Log.d("zjb", hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 71, (byte) 108, (byte) 113, (byte) 104, (byte) 100, (byte) 117, (byte) 67, (byte) 106, (byte) 119, (byte) 104, (byte) 80, (byte) 119, (byte) 108}) + e.getMessage().toString());
            return decodeStream;
        } catch (IOException e6) {
            IOException iOException = e6;
            decodeStream = null;
            e2 = iOException;
            Log.d("zjb", hae.a(new byte[]{(byte) 98, (byte) 96, (byte) 113, (byte) 71, (byte) 108, (byte) 113, (byte) 104, (byte) 100, (byte) 117, (byte) 67, (byte) 106, (byte) 119, (byte) 104, (byte) 80, (byte) 119, (byte) 108}) + e2.getMessage().toString());
            return decodeStream;
        }
        return decodeStream;
    }
}
