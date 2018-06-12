package bili3.com.bilibili.music.app.ui.business.payment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import bl.frm;
import bl.hae;

@Keep
/* compiled from: BL */
public class PaymentPager implements frm<MusicPaymentFragment> {
    public static final String SHOW_TYPE = hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 81, (byte) 124, (byte) 117, (byte) 96});
    public static final String SONG_ATTR = hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 113, (byte) 113, (byte) 119});
    public static final String SONG_AUTHOR = hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119});
    public static final String SONG_COVER = hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 70, (byte) 106, (byte) 115, (byte) 96, (byte) 119});
    public static final String SONG_SID = hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 86, (byte) 108, (byte) 97});
    public static final String SONG_TITLE = hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 81, (byte) 108, (byte) 113, (byte) 105, (byte) 96});
    public int showType;
    public int songAttr;
    public String songAuthor;
    public String songCover;
    public long songSid;
    public String songTitle;

    public PaymentPager(int i, String str, String str2, long j, int i2, String str3) {
        this.showType = i;
        this.songAuthor = str;
        this.songCover = str2;
        this.songSid = j;
        this.songAttr = i2;
        this.songTitle = str3;
    }

    public static void saveInstance(@NonNull MusicPaymentFragment musicPaymentFragment, @NonNull Bundle bundle) {
        bundle.putInt(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 81, (byte) 124, (byte) 117, (byte) 96}), musicPaymentFragment.a);
        bundle.putString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119}), musicPaymentFragment.b);
        bundle.putString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 70, (byte) 106, (byte) 115, (byte) 96, (byte) 119}), musicPaymentFragment.c);
        bundle.putLong(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 86, (byte) 108, (byte) 97}), musicPaymentFragment.d);
        bundle.putInt(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 113, (byte) 113, (byte) 119}), musicPaymentFragment.e);
        bundle.putString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 81, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), musicPaymentFragment.f);
    }

    public static void restoreInstance(@NonNull MusicPaymentFragment musicPaymentFragment, @NonNull Bundle bundle) {
        new PaymentPager().bind(musicPaymentFragment, bundle);
    }

    public void bind(@NonNull MusicPaymentFragment musicPaymentFragment, @NonNull Bundle bundle) {
        musicPaymentFragment.a = bundle.getInt(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 81, (byte) 124, (byte) 117, (byte) 96}));
        musicPaymentFragment.b = bundle.getString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119}));
        musicPaymentFragment.c = bundle.getString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 70, (byte) 106, (byte) 115, (byte) 96, (byte) 119}));
        musicPaymentFragment.d = bundle.getLong(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 86, (byte) 108, (byte) 97}));
        musicPaymentFragment.e = bundle.getInt(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 113, (byte) 113, (byte) 119}));
        musicPaymentFragment.f = bundle.getString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 81, (byte) 108, (byte) 113, (byte) 105, (byte) 96}));
    }

    public void bind(@NonNull MusicPaymentFragment musicPaymentFragment, @NonNull Uri uri) {
        String queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 81, (byte) 124, (byte) 117, (byte) 96}));
        if (queryParameter != null) {
            musicPaymentFragment.a = Integer.valueOf(queryParameter).intValue();
        }
        queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119}));
        if (queryParameter != null) {
            musicPaymentFragment.b = queryParameter;
        }
        queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 70, (byte) 106, (byte) 115, (byte) 96, (byte) 119}));
        if (queryParameter != null) {
            musicPaymentFragment.c = queryParameter;
        }
        queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 86, (byte) 108, (byte) 97}));
        if (queryParameter != null) {
            musicPaymentFragment.d = Long.valueOf(queryParameter).longValue();
        }
        queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 113, (byte) 113, (byte) 119}));
        if (queryParameter != null) {
            musicPaymentFragment.e = Integer.valueOf(queryParameter).intValue();
        }
        queryParameter = uri.getQueryParameter(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 81, (byte) 108, (byte) 113, (byte) 105, (byte) 96}));
        if (queryParameter != null) {
            musicPaymentFragment.f = queryParameter;
        }
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 81, (byte) 124, (byte) 117, (byte) 96}), this.showType);
        bundle.putString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 112, (byte) 113, (byte) 109, (byte) 106, (byte) 119}), this.songAuthor);
        bundle.putString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 70, (byte) 106, (byte) 115, (byte) 96, (byte) 119}), this.songCover);
        bundle.putLong(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 86, (byte) 108, (byte) 97}), this.songSid);
        bundle.putInt(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 68, (byte) 113, (byte) 113, (byte) 119}), this.songAttr);
        bundle.putString(hae.a(new byte[]{(byte) 118, (byte) 106, (byte) 107, (byte) 98, (byte) 81, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), this.songTitle);
        return bundle;
    }

    public String getName() {
        return hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 43, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 43, (byte) 104, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 43, (byte) 100, (byte) 117, (byte) 117, (byte) 43, (byte) 112, (byte) 108, (byte) 43, (byte) 103, (byte) 112, (byte) 118, (byte) 108, (byte) 107, (byte) 96, (byte) 118, (byte) 118, (byte) 43, (byte) 117, (byte) 100, (byte) 124, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 72, (byte) 112, (byte) 118, (byte) 108, (byte) 102, (byte) 85, (byte) 100, (byte) 124, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    }

    public boolean needLogin() {
        return true;
    }
}
