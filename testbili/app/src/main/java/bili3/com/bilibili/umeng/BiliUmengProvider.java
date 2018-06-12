package bili3.com.bilibili.umeng;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import bl.hae;
import bl.hal;

/* compiled from: BL */
public class BiliUmengProvider extends ContentProvider {
    public boolean onCreate() {
        return true;
    }

    @Nullable
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Nullable
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Nullable
    public Bundle call(String str, String str2, Bundle bundle) {
        if (hae.a(new byte[]{(byte) 106, (byte) 107, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113}).equalsIgnoreCase(str)) {
            bundle.setClassLoader(UmengEvent.class.getClassLoader());
            hal.a(getContext(), (UmengEvent) bundle.getParcelable(hae.a(new byte[]{(byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113})));
        }
        return Bundle.EMPTY;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
