package bili3.com.bilibili.bangumi.ui.detail;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bilibili.bangumi.api.BiliBangumiSeason.Actor;
import com.bilibili.bangumi.api.BiliBangumiTag;
import java.util.Date;
import java.util.List;

/* compiled from: BL */
public class BangumiIntroduce implements Parcelable {
    public static final Creator<BangumiIntroduce> CREATOR = new Creator<BangumiIntroduce>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public BangumiIntroduce a(Parcel parcel) {
            return new BangumiIntroduce(parcel);
        }

        public BangumiIntroduce[] a(int i) {
            return new BangumiIntroduce[i];
        }
    };
    public String a;
    public String b;
    public Date c;
    public String d;
    public List<BiliBangumiTag> e;
    public String f;
    public List<Actor> g;
    public String h;
    public String i;

    protected BangumiIntroduce(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        long readLong = parcel.readLong();
        this.c = readLong == -1 ? null : new Date(readLong);
        this.d = parcel.readString();
        this.e = parcel.createTypedArrayList(BiliBangumiTag.CREATOR);
        this.f = parcel.readString();
        this.g = parcel.createTypedArrayList(Actor.CREATOR);
        this.h = parcel.readString();
        this.i = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c == null ? -1 : this.c.getTime());
        parcel.writeString(this.d);
        parcel.writeTypedList(this.e);
        parcel.writeString(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
    }

    public int describeContents() {
        return 0;
    }
}
