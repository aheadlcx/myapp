package bili3.bl;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import android.provider.MediaStore.Images.Media;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.View;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Callable;
import tv.danmaku.biliplayer.features.screenshot.TrashScreenshot;

/* compiled from: BL */
public class mmw {
    public static final String a = hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 86, (byte) 109, (byte) 106, (byte) 113, (byte) 81, (byte) 96, (byte) 104, (byte) 117});
    private static mmw b;
    private NotificationManager c;
    private int d;
    private boolean e;
    private Bitmap f;

    /* compiled from: BL */
    public interface c {
        void a();

        void a(String str);

        void b();
    }

    /* compiled from: BL */
    public interface a {
        void a();
    }

    /* compiled from: BL */
    static class b {
        Context a;
        Bitmap b;
        int c;
        int d;
        Uri e;

        private b() {
        }

        void a() {
            this.b = null;
            this.c = 0;
            this.e = null;
        }

        void b() {
            this.a = null;
        }
    }

    /* compiled from: BL */
    static class d extends AsyncTask<b, Void, b> {
        private static final String a = hae.a(new byte[]{(byte) 118, (byte) 107, (byte) 100, (byte) 117, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 90, (byte) 32, (byte) 118, (byte) 43, (byte) 117, (byte) 107, (byte) 98});
        private static final String b = hae.a(new byte[]{(byte) 118, (byte) 107, (byte) 100, (byte) 117, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 37, (byte) 45, (byte) 32, (byte) 118, (byte) 44});
        private static final DateFormat c = new SimpleDateFormat(hae.a(new byte[]{(byte) 124, (byte) 124, (byte) 124, (byte) 124, (byte) 40, (byte) 72, (byte) 72, (byte) 40, (byte) 97, (byte) 97, (byte) 40, (byte) 77, (byte) 77, (byte) 40, (byte) 104, (byte) 104, (byte) 40, (byte) 118, (byte) 118}), Locale.US);
        private static boolean i;
        private final long d = System.currentTimeMillis();
        private final String e;
        private final String f;
        private final int g;
        private final int h;
        private final boolean j;
        private final boolean k;
        private int l;
        private NotificationManager m;
        private bl.dw.d n;
        private bl.dw.b o;
        private c p;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((b[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            a((b) obj);
        }

        d(Context context, b bVar, NotificationManager notificationManager, int i, String str, boolean z, boolean z2, c cVar) {
            this.p = cVar;
            Resources resources = context.getResources();
            String format = c.format(new Date(this.d));
            this.e = String.format(hae.a(new byte[]{(byte) 118, (byte) 107, (byte) 100, (byte) 117, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 90, (byte) 32, (byte) 118, (byte) 43, (byte) 117, (byte) 107, (byte) 98}), new Object[]{format});
            this.f = str;
            this.g = bVar.b.getWidth();
            this.h = bVar.b.getHeight();
            int i2 = bVar.c;
            this.j = z;
            this.k = z2;
            if (this.j) {
                int i3 = this.g < this.h ? this.g : this.h;
                Bitmap createBitmap = Bitmap.createBitmap(i3, i3, bVar.b.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                Matrix matrix = new Matrix();
                matrix.postTranslate((float) ((i3 - this.g) / 2), (float) ((i3 - this.h) / 2));
                canvas.drawBitmap(bVar.b, matrix, paint);
                canvas.drawColor(1090519039);
                canvas.setBitmap(null);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i2, i2, true);
                i = !i;
                this.l = i;
                this.m = notificationManager;
                this.n = new bl.dw.d(context, mmw.d(context)).d(resources.getString(2131694834) + (i ? " " : Constants.STR_EMPTY)).a(resources.getString(2131694835)).b(resources.getString(2131694833)).a(2131233527).a(System.currentTimeMillis());
                this.o = new bl.dw.b().a(createBitmap);
                this.n.a(this.o);
                Notification a = this.n.a();
                a.flags |= 32;
                this.m.notify(i, a);
                this.n.a(createScaledBitmap);
                this.o.b(null);
            }
        }

        protected void onPreExecute() {
            a();
        }

        protected b a(b... bVarArr) {
            if (bVarArr.length != 1) {
                b();
                return null;
            }
            if (isCancelled()) {
                bVarArr[0].a();
                bVarArr[0].b();
            }
            java.lang.Process.setThreadPriority(-2);
            Context context = bVarArr[0].a;
            Bitmap bitmap = bVarArr[0].b;
            String str = this.f;
            if (bitmap == null || bitmap.isRecycled() || !mmv.a(bitmap, str)) {
                bVarArr[0].d = 1;
            } else if (this.k) {
                long j = this.d / 1000;
                ContentValues contentValues = new ContentValues();
                ContentResolver contentResolver = context.getContentResolver();
                contentValues.put(hae.a(new byte[]{(byte) 90, (byte) 97, (byte) 100, (byte) 113, (byte) 100}), this.f);
                contentValues.put(hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), this.e);
                contentValues.put(hae.a(new byte[]{(byte) 90, (byte) 97, (byte) 108, (byte) 118, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), this.e);
                contentValues.put(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 113, (byte) 100, (byte) 110, (byte) 96, (byte) 107}), Long.valueOf(this.d));
                contentValues.put(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 90, (byte) 100, (byte) 97, (byte) 97, (byte) 96, (byte) 97}), Long.valueOf(j));
                contentValues.put(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 113, (byte) 96, (byte) 90, (byte) 104, (byte) 106, (byte) 97, (byte) 108, (byte) 99, (byte) 108, (byte) 96, (byte) 97}), Long.valueOf(j));
                contentValues.put(hae.a(new byte[]{(byte) 104, (byte) 108, (byte) 104, (byte) 96, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 42, (byte) 117, (byte) 107, (byte) 98}));
                try {
                    bVarArr[0].e = contentResolver.insert(Media.EXTERNAL_CONTENT_URI, contentValues);
                } catch (Exception e) {
                }
            }
            return bVarArr[0];
        }

        protected void a(b bVar) {
            if (isCancelled()) {
                bVar.a();
                bVar.b();
                b();
                this.p = null;
                return;
            }
            if (bVar.d > 0) {
                if (this.j) {
                    mmw.b(bVar.a, this.m);
                }
                b();
            } else {
                if (this.j) {
                    Context context = bVar.a;
                    Resources resources = context.getResources();
                    Uri uri = bVar.e;
                    if (uri == null) {
                        b();
                        bVar.b();
                        this.p = null;
                        return;
                    }
                    String format = DateFormat.getDateTimeInstance().format(new Date(this.d));
                    format = String.format(hae.a(new byte[]{(byte) 118, (byte) 107, (byte) 100, (byte) 117, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 37, (byte) 45, (byte) 32, (byte) 118, (byte) 44}), new Object[]{format});
                    Intent intent = new Intent(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 86, (byte) 64, (byte) 75, (byte) 65}));
                    intent.setType(hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 42, (byte) 117, (byte) 107, (byte) 98}));
                    intent.putExtra(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 43, (byte) 86, (byte) 81, (byte) 87, (byte) 64, (byte) 68, (byte) 72}), uri);
                    intent.putExtra(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 43, (byte) 86, (byte) 80, (byte) 71, (byte) 79, (byte) 64, (byte) 70, (byte) 81}), format);
                    Intent createChooser = Intent.createChooser(intent, resources.getString(2131694838));
                    createChooser.addFlags(268468224);
                    this.n.a(17301586, "\u5206\u4eab", PendingIntent.getActivity(context, 0, createChooser, 268435456));
                    createChooser = new Intent();
                    createChooser.setClass(context, TrashScreenshot.class);
                    createChooser.putExtra(hae.a(new byte[]{(byte) 113, (byte) 115, (byte) 43, (byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 100, (byte) 110, (byte) 112, (byte) 43, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 43, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 43, (byte) 113, (byte) 119, (byte) 100, (byte) 118, (byte) 109, (byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 43, (byte) 86, (byte) 75, (byte) 68, (byte) 85, (byte) 86, (byte) 77, (byte) 74, (byte) 81, (byte) 90, (byte) 80, (byte) 87, (byte) 76}), uri.toString());
                    this.n.a(17301564, "\u5220\u9664", PendingIntent.getBroadcast(context, 0, createChooser, 268435456));
                    Intent intent2 = new Intent(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 83, (byte) 76, (byte) 64, (byte) 82}));
                    intent2.setDataAndType(uri, hae.a(new byte[]{(byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 42, (byte) 117, (byte) 107, (byte) 98}));
                    intent2.setFlags(268435456);
                    this.n.a(resources.getString(2131694831)).b(resources.getString(2131694830)).a(PendingIntent.getActivity(bVar.a, 0, intent2, 0)).a(System.currentTimeMillis()).c(true);
                    Notification a = this.n.a();
                    a.flags &= -33;
                    this.m.notify(this.l, a);
                }
                a(this.f);
            }
            bVar.b();
            this.p = null;
        }

        private void a() {
            if (this.p != null) {
                this.p.a();
            }
        }

        private void a(String str) {
            if (this.p != null) {
                this.p.a(str);
            }
        }

        private void b() {
            if (this.p != null) {
                this.p.b();
            }
        }
    }

    /* compiled from: BL */
    public interface e {
        Bitmap a(Bitmap bitmap);
    }

    public static mmw a(Context context) {
        if (b == null) {
            b = new mmw(context);
        }
        return b;
    }

    public static void a() {
        b = null;
    }

    public void a(Bitmap bitmap) {
        this.f = bitmap;
    }

    public static void b(final Context context) {
        if (context != null) {
            ps.a(new Callable<Void>() {
                public /* synthetic */ Object call() throws Exception {
                    return a();
                }

                public Void a() throws Exception {
                    erx.c(new File(context.getApplicationContext().getExternalCacheDir(), hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 119, (byte) 96, (byte) 96, (byte) 107, (byte) 86, (byte) 109, (byte) 106, (byte) 113, (byte) 81, (byte) 96, (byte) 104, (byte) 117})));
                    return null;
                }
            });
        }
    }

    private mmw(Context context) {
        if (context != null) {
            this.c = (NotificationManager) context.getSystemService(hae.a(new byte[]{(byte) 107, (byte) 106, (byte) 113, (byte) 108, (byte) 99, (byte) 108, (byte) 102, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}));
            this.d = context.getResources().getDimensionPixelSize(17104902);
        }
    }

    public Bitmap a(View view, View view2, Drawable drawable, String str, DisplayMetrics displayMetrics, e eVar, boolean z) {
        return a(view.getContext(), mmv.a(view, view2, drawable, str, displayMetrics), eVar, z);
    }

    private Bitmap a(Context context, Bitmap bitmap, e eVar, boolean z) {
        if (bitmap == null) {
            if (!z) {
                b(context, this.c);
            }
            return null;
        }
        this.e = true;
        if (eVar != null) {
            bitmap = eVar.a(bitmap);
        }
        this.f = bitmap;
        if (this.f == null) {
            throw new IllegalArgumentException(hae.a(new byte[]{(byte) 76, (byte) 107, (byte) 115, (byte) 100, (byte) 105, (byte) 108, (byte) 97, (byte) 37, (byte) 86, (byte) 107, (byte) 100, (byte) 117, (byte) 118, (byte) 109, (byte) 106, (byte) 113, (byte) 81, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 37, (byte) 75, (byte) 112, (byte) 105, (byte) 105, (byte) 37, (byte) 119, (byte) 96, (byte) 113, (byte) 112, (byte) 119, (byte) 107, (byte) 96, (byte) 97, (byte) 37, (byte) 108, (byte) 107, (byte) 37, (byte) 113, (byte) 119, (byte) 100, (byte) 107, (byte) 118, (byte) 99, (byte) 106, (byte) 119, (byte) 104, (byte) 45, (byte) 71, (byte) 108, (byte) 113, (byte) 104, (byte) 100, (byte) 117, (byte) 44, (byte) 43}));
        }
        this.f.setHasAlpha(false);
        this.f.prepareToDraw();
        return this.f;
    }

    public void a(Context context, String str, c cVar, boolean z, boolean z2) {
        if (this.f != null && !this.f.isRecycled()) {
            b bVar = new b();
            bVar.a = context.getApplicationContext();
            bVar.b = this.f;
            bVar.c = this.d;
            new d(context.getApplicationContext(), bVar, this.c, 789, str, z, z2, cVar).execute(new b[]{bVar});
        }
    }

    private static void b(Context context, NotificationManager notificationManager) {
        Resources resources = context.getResources();
        notificationManager.notify(789, new bl.dw.c(new bl.dw.d(context, d(context)).d(resources.getString(2131694825)).a(resources.getString(2131694826)).b(resources.getString(2131694824)).a(2131233527).a(System.currentTimeMillis()).c(true)).b(resources.getString(2131694824)).a());
    }

    @NonNull
    private static String d(Context context) {
        return gmz.a(context);
    }
}
