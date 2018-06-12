package bili.bl;

import android.net.Uri;
import android.support.graphics.drawable.animated.BuildConfig;

@jds(a = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, b = {"Lcom/bilibili/bangumi/helper/MenuClick;", "Lcom/bilibili/bangumi/helper/ILogEvent;", "eventId", "", "eventType", "arg1", "arg2", "arg3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "asArgs", "", "()[Ljava/lang/String;", "getLogId", "bilibangumi_release"})
/* compiled from: BL */
public final class bck implements bcj {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public bck() {
        this(null, null, null, null, null, 31, null);
    }

    public bck(String str, String str2, String str3, String str4, String str5) {
        jgp.b(str, hae.a(new byte[]{(byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 97}));
        jgp.b(str2, hae.a(new byte[]{(byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 81, (byte) 124, (byte) 117, (byte) 96}));
        jgp.b(str3, "arg1");
        jgp.b(str4, "arg2");
        jgp.b(str5, "arg3");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public /* synthetic */ bck(String str, String str2, String str3, String str4, String str5, int i, jgo bl_jgo) {
        String a;
        String a2;
        String str6;
        String str7;
        if ((i & 1) != 0) {
            a = hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 90, (byte) 104, (byte) 106, (byte) 119, (byte) 96});
        } else {
            a = str;
        }
        if ((i & 2) != 0) {
            a2 = hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110});
        } else {
            a2 = str2;
        }
        if ((i & 4) != 0) {
            str6 = "2";
        } else {
            str6 = str3;
        }
        if ((i & 8) != 0) {
            str7 = BuildConfig.VERSION_NAME;
        } else {
            str7 = str4;
        }
        this(a, a2, str6, str7, (i & 16) != 0 ? BuildConfig.VERSION_NAME : str5);
    }

    public String[] a() {
        String[] strArr = new String[5];
        Object encode = Uri.encode(this.a);
        jgp.a(encode, hae.a(new byte[]{(byte) 80, (byte) 119, (byte) 108, (byte) 43, (byte) 96, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 45, (byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 76, (byte) 97, (byte) 44}));
        strArr[0] = encode;
        encode = Uri.encode(this.b);
        jgp.a(encode, hae.a(new byte[]{(byte) 80, (byte) 119, (byte) 108, (byte) 43, (byte) 96, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 45, (byte) 96, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 81, (byte) 124, (byte) 117, (byte) 96, (byte) 44}));
        strArr[1] = encode;
        encode = Uri.encode(this.c);
        jgp.a(encode, hae.a(new byte[]{(byte) 80, (byte) 119, (byte) 108, (byte) 43, (byte) 96, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 45, (byte) 100, (byte) 119, (byte) 98, (byte) 52, (byte) 44}));
        strArr[2] = encode;
        encode = Uri.encode(this.d);
        jgp.a(encode, hae.a(new byte[]{(byte) 80, (byte) 119, (byte) 108, (byte) 43, (byte) 96, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 45, (byte) 100, (byte) 119, (byte) 98, (byte) 55, (byte) 44}));
        strArr[3] = encode;
        encode = Uri.encode(this.e);
        jgp.a(encode, hae.a(new byte[]{(byte) 80, (byte) 119, (byte) 108, (byte) 43, (byte) 96, (byte) 107, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 45, (byte) 100, (byte) 119, (byte) 98, (byte) 54, (byte) 44}));
        strArr[4] = encode;
        return strArr;
    }

    public String b() {
        return hae.a(new byte[]{(byte) 53, (byte) 53, (byte) 53, (byte) 55, (byte) 55, (byte) 48});
    }
}
