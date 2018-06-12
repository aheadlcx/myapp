package bili2.bl;

import android.net.Uri;

final /* synthetic */ class luf implements Runnable {
    private final String a;
    private final Uri b;
    private final int c;

    luf(String str, Uri uri, int i) {
        this.a = str;
        this.b = uri;
        this.c = i;
    }

    public void run() {
        lue.a(this.a, this.b, this.c);
    }
}
