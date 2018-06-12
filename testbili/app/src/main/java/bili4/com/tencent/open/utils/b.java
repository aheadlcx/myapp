package bili4.com.tencent.open.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import bl.ibn;
import com.tencent.open.a.f;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import u.aly.bj;

/* compiled from: BL */
public class b {
    private static String c;
    private String a;
    private c b;
    private long d;
    private Handler e;
    private Runnable f = new Runnable(this) {
        final /* synthetic */ b a;

        {
            this.a = r1;
        }

        public void run() {
            f.a("AsynLoadImg", "saveFileRunnable:");
            String str = "share_qq_" + i.f(this.a.a) + ".jpg";
            String str2 = b.c + str;
            File file = new File(str2);
            Message obtainMessage = this.a.e.obtainMessage();
            if (file.exists()) {
                obtainMessage.arg1 = 0;
                obtainMessage.obj = str2;
                f.a("AsynLoadImg", "file exists: time:" + (System.currentTimeMillis() - this.a.d));
            } else {
                boolean a;
                Bitmap a2 = b.a(this.a.a);
                if (a2 != null) {
                    a = this.a.a(a2, str);
                } else {
                    f.a("AsynLoadImg", "saveFileRunnable:get bmp fail---");
                    a = false;
                }
                if (a) {
                    obtainMessage.arg1 = 0;
                    obtainMessage.obj = str2;
                } else {
                    obtainMessage.arg1 = 1;
                }
                f.a("AsynLoadImg", "file not exists: download time:" + (System.currentTimeMillis() - this.a.d));
            }
            this.a.e.sendMessage(obtainMessage);
        }
    };

    public b(Activity activity) {
        this.e = new Handler(this, activity.getMainLooper()) {
            final /* synthetic */ b a;

            public void handleMessage(Message message) {
                f.a("AsynLoadImg", "handleMessage:" + message.arg1);
                if (message.arg1 == 0) {
                    this.a.b.a(message.arg1, (String) message.obj);
                } else {
                    this.a.b.a(message.arg1, null);
                }
            }
        };
    }

    public void a(String str, c cVar) {
        f.a("AsynLoadImg", "--save---");
        if (str == null || str.equals(bj.b)) {
            cVar.a(1, null);
        } else if (i.b()) {
            c = Environment.getExternalStorageDirectory() + "/tmp/";
            this.d = System.currentTimeMillis();
            this.a = str;
            this.b = cVar;
            new Thread(this.f).start();
        } else {
            cVar.a(2, null);
        }
    }

    public boolean a(Bitmap bitmap, String str) {
        Throwable e;
        OutputStream outputStream;
        String str2 = c;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdir();
            }
            str2 = str2 + str;
            f.a("AsynLoadImg", "saveFile:" + str);
            OutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(new File(str2)));
            try {
                bitmap.compress(CompressFormat.JPEG, 80, bufferedOutputStream2);
                bufferedOutputStream2.flush();
                if (bufferedOutputStream2 != null) {
                    try {
                        bufferedOutputStream2.close();
                    } catch (Throwable e2) {
                        ibn.a(e2);
                    }
                }
                return true;
            } catch (IOException e3) {
                e2 = e3;
                outputStream = bufferedOutputStream2;
                try {
                    ibn.a(e2);
                    f.b("AsynLoadImg", "saveFile bmp fail---", e2);
                    if (bufferedOutputStream != null) {
                        return false;
                    }
                    try {
                        bufferedOutputStream.close();
                        return false;
                    } catch (Throwable e4) {
                        ibn.a(e4);
                        return false;
                    }
                } catch (Throwable th) {
                    e2 = th;
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable e42) {
                            ibn.a(e42);
                        }
                    }
                    throw e2;
                }
            } catch (Throwable th2) {
                e2 = th2;
                outputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw e2;
            }
        } catch (IOException e5) {
            e2 = e5;
            ibn.a(e2);
            f.b("AsynLoadImg", "saveFile bmp fail---", e2);
            if (bufferedOutputStream != null) {
                return false;
            }
            bufferedOutputStream.close();
            return false;
        }
    }

    public static Bitmap a(String str) {
        f.a("AsynLoadImg", "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            f.a("AsynLoadImg", "image download finished." + str);
            return decodeStream;
        } catch (Throwable e) {
            ibn.a(e);
            f.a("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        } catch (Throwable e2) {
            ibn.a(e2);
            f.a("AsynLoadImg", "getbitmap bmp fail---");
            return null;
        }
    }
}
