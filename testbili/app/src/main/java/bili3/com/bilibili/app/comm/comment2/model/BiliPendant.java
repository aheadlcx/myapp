package bili3.com.bilibili.app.comm.comment2.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;

@Keep
/* compiled from: BL */
public final class BiliPendant implements Parcelable {
    public static final Creator<BiliPendant> CREATOR = new Creator<BiliPendant>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public BiliPendant a(Parcel parcel) {
            return new BiliPendant(parcel);
        }

        public BiliPendant[] a(int i) {
            return new BiliPendant[i];
        }
    };
    public String expire;
    public String image;
    public String name;
    public String pid;

    protected BiliPendant(Parcel parcel) {
        this.pid = parcel.readString();
        this.name = parcel.readString();
        this.image = parcel.readString();
        this.expire = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pid);
        parcel.writeString(this.name);
        parcel.writeString(this.image);
        parcel.writeString(this.expire);
    }
}
