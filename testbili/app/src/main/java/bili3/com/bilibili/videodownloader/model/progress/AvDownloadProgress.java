package bili3.com.bilibili.videodownloader.model.progress;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bilibili.videodownloader.model.VideoDownloadAVPageEntry;

/* compiled from: BL */
public class AvDownloadProgress extends VideoDownloadProgress<VideoDownloadAVPageEntry> {
    public static final Creator<AvDownloadProgress> CREATOR = new Creator<AvDownloadProgress>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public AvDownloadProgress a(Parcel parcel) {
            return new AvDownloadProgress(parcel);
        }

        public AvDownloadProgress[] a(int i) {
            return new AvDownloadProgress[i];
        }
    };
    public int a;
    public int b;

    public AvDownloadProgress(String str, int i, int i2) {
        super(str);
        this.a = i;
        this.b = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    protected AvDownloadProgress(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
}
