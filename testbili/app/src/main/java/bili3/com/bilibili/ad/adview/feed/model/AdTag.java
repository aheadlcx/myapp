package bili3.com.bilibili.ad.adview.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

@Keep
/* compiled from: BL */
public class AdTag implements Parcelable {
    public static final Creator<AdTag> CREATOR = new Creator<AdTag>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public AdTag a(Parcel parcel) {
            return new AdTag(parcel);
        }

        public AdTag[] a(int i) {
            return new AdTag[i];
        }
    };
    public static final int INVALID_ID = Integer.MAX_VALUE;
    @JSONField(name = "atten")
    public int attenNumber;
    @JSONField(name = "is_atten")
    public int attention;
    @JSONField(name = "tag_id")
    public int tagId;
    @JSONField(name = "tag_name")
    public String tagName;

    @Keep
    /* compiled from: BL */
    public static class TagMeta {
        public int rid;
        public List<AdTag> tags;
    }

    public AdTag(int i, String str) {
        this.tagId = i;
        this.tagName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.tagId != ((AdTag) obj).tagId) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.tagId;
    }

    private AdTag(Parcel parcel) {
        this.tagId = parcel.readInt();
        this.tagName = parcel.readString();
        this.attention = parcel.readInt();
        this.attenNumber = parcel.readInt();
    }

    public boolean isFollowed() {
        return this.attention == 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tagId);
        parcel.writeString(this.tagName);
        parcel.writeInt(this.attention);
        parcel.writeInt(this.attenNumber);
    }

    public int describeContents() {
        return 0;
    }
}
