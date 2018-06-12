package bili2.bl;

import android.net.Uri;

/* compiled from: BL */
public class ine {
    private static Uri b() {
        return Uri.EMPTY.buildUpon().scheme(ieb.a().i().d()).authority("mall").build();
    }

    public static String a() {
        return b().buildUpon().path("ticket/list").build().toString();
    }

    public static String a(long j, int i) {
        return b().buildUpon().path("ticket/alertdetail/{screenId}").appendQueryParameter("screenId", String.valueOf(j)).appendQueryParameter("detailType", String.valueOf(i)).build().toString();
    }
}
