package bili3.com.bilibili.lib.media.resource;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bl.ffg;
import bl.ffi;
import bl.hae;
import com.bilibili.music.app.ui.menus.detail.MenuDetailPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BL */
public final class PlayIndex implements Parcelable, ffg {
    public static final Creator<PlayIndex> CREATOR = new Creator<PlayIndex>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public PlayIndex a(Parcel parcel) {
            return new PlayIndex(parcel);
        }

        public PlayIndex[] a(int i) {
            return new PlayIndex[i];
        }
    };
    public static final String a = hae.a(new byte[]{(byte) 124, (byte) 106, (byte) 112, (byte) 110, (byte) 112});
    public static final String b = hae.a(new byte[]{(byte) 113, (byte) 112, (byte) 97, (byte) 106, (byte) 112});
    public static final String c = hae.a(new byte[]{(byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105});
    public static final String d = hae.a(new byte[]{(byte) 109, (byte) 113, (byte) 104, (byte) 105, (byte) 48});
    public static final String e = hae.a(new byte[]{(byte) 112, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});
    public static final String f = hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97});
    public static final String g = hae.a(new byte[]{(byte) 108, (byte) 116, (byte) 108, (byte) 124, (byte) 108});
    public static final String h = hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 108, (byte) 100, (byte) 118});
    public static final String i = hae.a(new byte[]{(byte) 104, (byte) 106, (byte) 115, (byte) 108, (byte) 96});
    public static final String j = hae.a(new byte[]{(byte) 109, (byte) 112, (byte) 107, (byte) 100, (byte) 107});
    public static final String k = hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 124, (byte) 90, (byte) 100, (byte) 115, (byte) 54});
    public static final String l = hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 124, (byte) 90, (byte) 100, (byte) 115, (byte) 55});
    public static final String m = hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 124, (byte) 90, (byte) 100, (byte) 115, (byte) 52});
    public static final String n = hae.a(new byte[]{(byte) 108, (byte) 116, (byte) 108, (byte) 124, (byte) 108, (byte) 90, (byte) 100, (byte) 115, (byte) 49});
    public static final String o = hae.a(new byte[]{(byte) 108, (byte) 116, (byte) 108, (byte) 124, (byte) 108, (byte) 90, (byte) 100, (byte) 115, (byte) 54});
    public static final String p = hae.a(new byte[]{(byte) 108, (byte) 116, (byte) 108, (byte) 124, (byte) 108, (byte) 90, (byte) 100, (byte) 115, (byte) 55});
    public static final String q = hae.a(new byte[]{(byte) 108, (byte) 116, (byte) 108, (byte) 124, (byte) 108, (byte) 90, (byte) 100, (byte) 115, (byte) 52});
    public static final String r = hae.a(new byte[]{(byte) 108, (byte) 116, (byte) 108, (byte) 124, (byte) 108, (byte) 90, (byte) 100, (byte) 107, (byte) 124});
    public static final String s = hae.a(new byte[]{(byte) 118, (byte) 113, (byte) 119, (byte) 96, (byte) 100, (byte) 104});
    public static final String t = hae.a(new byte[]{(byte) 105, (byte) 96, (byte) 113, (byte) 115, (byte) 90, (byte) 115, (byte) 108, (byte) 97});
    public static final String u = hae.a(new byte[]{(byte) 105, (byte) 96, (byte) 113, (byte) 115, (byte) 90, (byte) 115, (byte) 113, (byte) 124, (byte) 117, (byte) 96});
    public ArrayList<Segment> A = new ArrayList();
    public long B = -1;
    public long C = -1;
    public String D;
    public int E = 0;
    public String F;
    public boolean G;
    public List<PlayerCodecConfig> H = new ArrayList();
    public boolean I = true;
    public long J;
    public String K;
    public String v;
    public String w;
    public String x;
    public boolean y;
    public long z;

    /* compiled from: BL */
    public interface a {
        void a() throws InterruptedException;
    }

    public PlayIndex(String str, String str2) {
        this.v = str;
        this.w = str2;
    }

    public Segment a() {
        if (this.A.size() >= 1) {
            return (Segment) this.A.get(0);
        }
        return null;
    }

    public String c() {
        Segment a = a();
        if (a == null || TextUtils.isEmpty(a.a)) {
            return null;
        }
        return a.a;
    }

    public Segment a(int i) throws IndexOutOfBoundsException {
        if (this.A != null) {
            return (Segment) this.A.get(i);
        }
        throw new IndexOutOfBoundsException(hae.a(new byte[]{(byte) 107, (byte) 112, (byte) 105, (byte) 105, (byte) 37, (byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 37, (byte) 105, (byte) 108, (byte) 118, (byte) 113}));
    }

    public long d() {
        Iterator it = this.A.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = ((long) ((Segment) it.next()).b) + j;
        }
        return j;
    }

    public long e() {
        return this.J;
    }

    public int a(long j) {
        Object obj = null;
        if (this.A == null || this.A.isEmpty()) {
            return -1;
        }
        Iterator it = this.A.iterator();
        long j2 = 0;
        int i = 0;
        while (it.hasNext()) {
            long j3 = ((long) ((Segment) it.next()).b) + j2;
            if (j < j3) {
                obj = 1;
                break;
            }
            i++;
            j2 = j3;
        }
        if (obj == null) {
            return this.A.size() - 1;
        }
        return i;
    }

    public boolean f() {
        return this.A == null || this.A.isEmpty();
    }

    public boolean g() {
        long j = this.C;
        if (j == 0) {
            return true;
        }
        if (j < 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.B;
        if (currentTimeMillis < 0 || currentTimeMillis > j) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        return !TextUtils.isEmpty(this.D);
    }

    public final boolean i() {
        return !(this.A == null || this.A.isEmpty()) || h();
    }

    private long b(JSONObject jSONObject) {
        long optLong = jSONObject.optLong(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118, (byte) 113, (byte) 100, (byte) 104, (byte) 117, (byte) 90, (byte) 104, (byte) 108, (byte) 105, (byte) 105, (byte) 108}), -1);
        if (optLong == -1) {
            return jSONObject.optLong(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 97, (byte) 90, (byte) 104, (byte) 108, (byte) 105, (byte) 105, (byte) 108}), -1);
        }
        return optLong;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.v = jSONObject.optString(MenuDetailPager.FROM);
        this.w = jSONObject.optString(hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 113, (byte) 100, (byte) 98}));
        this.x = jSONObject.optString(hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107}));
        this.y = jSONObject.optBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 118, (byte) 113, (byte) 112, (byte) 103}));
        this.z = jSONObject.optLong(hae.a(new byte[]{(byte) 117, (byte) 118, (byte) 96, (byte) 97, (byte) 106, (byte) 90, (byte) 103, (byte) 108, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 96}));
        this.A = ffi.a(jSONObject.optJSONArray(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113})), Segment.class);
        this.B = b(jSONObject);
        this.C = jSONObject.optLong(hae.a(new byte[]{(byte) 100, (byte) 115, (byte) 100, (byte) 108, (byte) 105, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 96, (byte) 119, (byte) 108, (byte) 106, (byte) 97, (byte) 90, (byte) 104, (byte) 108, (byte) 105, (byte) 105, (byte) 108}), -1);
        String str = (this.A == null || this.A.size() != 1) ? null : ((Segment) this.A.get(0)).a;
        this.D = str;
        this.E = jSONObject.optInt(hae.a(new byte[]{(byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 125, (byte) 124, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), 0);
        this.F = jSONObject.optString(hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 98, (byte) 96, (byte) 107, (byte) 113}));
        this.G = jSONObject.optBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}));
        this.I = jSONObject.optBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 97}), true);
        this.H = ffi.a(jSONObject.optJSONArray(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 102, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113})), PlayerCodecConfig.class);
        this.J = (long) jSONObject.optInt(hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 90, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109}));
        this.K = jSONObject.optString(hae.a(new byte[]{(byte) 104, (byte) 100, (byte) 119, (byte) 105, (byte) 108, (byte) 107, (byte) 90, (byte) 113, (byte) 106, (byte) 110, (byte) 96, (byte) 107}));
    }

    public JSONObject b() throws JSONException {
        return new JSONObject().put(MenuDetailPager.FROM, this.v).put(hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 113, (byte) 100, (byte) 98}), this.w).put(hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 118, (byte) 102, (byte) 119, (byte) 108, (byte) 117, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), this.x).put(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 118, (byte) 113, (byte) 112, (byte) 103}), this.y).put(hae.a(new byte[]{(byte) 117, (byte) 118, (byte) 96, (byte) 97, (byte) 106, (byte) 90, (byte) 103, (byte) 108, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 96}), this.z).put(hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113}), ffi.a(this.A)).put(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 119, (byte) 118, (byte) 96, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 118, (byte) 113, (byte) 100, (byte) 104, (byte) 117, (byte) 90, (byte) 104, (byte) 108, (byte) 105, (byte) 105, (byte) 108}), this.B).put(hae.a(new byte[]{(byte) 100, (byte) 115, (byte) 100, (byte) 108, (byte) 105, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 117, (byte) 96, (byte) 119, (byte) 108, (byte) 106, (byte) 97, (byte) 90, (byte) 104, (byte) 108, (byte) 105, (byte) 105, (byte) 108}), this.C).put(hae.a(new byte[]{(byte) 105, (byte) 106, (byte) 102, (byte) 100, (byte) 105, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 125, (byte) 124, (byte) 90, (byte) 113, (byte) 124, (byte) 117, (byte) 96}), this.E).put(hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 100, (byte) 98, (byte) 96, (byte) 107, (byte) 113}), this.F).put(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 97}), this.G).put(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 106, (byte) 105, (byte) 115, (byte) 96, (byte) 97}), this.I).put(hae.a(new byte[]{(byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 106, (byte) 97, (byte) 96, (byte) 102, (byte) 90, (byte) 102, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 90, (byte) 105, (byte) 108, (byte) 118, (byte) 113}), ffi.a(this.H)).put(hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 104, (byte) 96, (byte) 90, (byte) 105, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109}), this.J).put(hae.a(new byte[]{(byte) 104, (byte) 100, (byte) 119, (byte) 105, (byte) 108, (byte) 107, (byte) 90, (byte) 113, (byte) 106, (byte) 110, (byte) 96, (byte) 107}), this.K);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte b;
        byte b2 = (byte) 1;
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.z);
        parcel.writeTypedList(this.A);
        parcel.writeLong(this.B);
        parcel.writeLong(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeString(this.F);
        if (this.G) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        parcel.writeTypedList(this.H);
        if (!this.I) {
            b2 = (byte) 0;
        }
        parcel.writeByte(b2);
        parcel.writeLong(this.J);
        parcel.writeString(this.K);
    }

    protected PlayIndex(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readByte() != (byte) 0;
        this.z = parcel.readLong();
        this.A = parcel.createTypedArrayList(Segment.CREATOR);
        this.B = parcel.readLong();
        this.C = parcel.readLong();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.F = parcel.readString();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.G = z;
        this.H = parcel.createTypedArrayList(PlayerCodecConfig.CREATOR);
        if (parcel.readByte() == (byte) 0) {
            z2 = false;
        }
        this.I = z2;
        this.J = parcel.readLong();
        this.K = parcel.readString();
    }
}
