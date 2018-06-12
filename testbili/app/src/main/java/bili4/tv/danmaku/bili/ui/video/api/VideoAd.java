package bili4.tv.danmaku.bili.ui.video.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class VideoAd implements Parcelable {
    public static final Creator<VideoAd> CREATOR = new Creator<VideoAd>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public VideoAd a(Parcel parcel) {
            return new VideoAd(parcel);
        }

        public VideoAd[] a(int i) {
            return new VideoAd[i];
        }
    };
    public static final int TYPE_FOR_LOGIN = 1;
    @JSONField(name = "cid")
    public int cid;
    @JSONField(name = "duration")
    public long duration;
    @JSONField(name = "type")
    public int type;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.cid);
        parcel.writeLong(this.duration);
    }

    protected VideoAd(Parcel parcel) {
        this.type = parcel.readInt();
        this.cid = parcel.readInt();
        this.duration = parcel.readLong();
    }
}
