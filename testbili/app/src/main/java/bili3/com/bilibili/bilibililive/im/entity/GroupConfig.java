package bili3.com.bilibili.bilibililive.im.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class GroupConfig implements Parcelable {
    public static final Creator<GroupConfig> CREATOR = new Creator<GroupConfig>() {
        public GroupConfig createFromParcel(Parcel parcel) {
            return new GroupConfig(parcel);
        }

        public GroupConfig[] newArray(int i) {
            return new GroupConfig[i];
        }
    };
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "level")
    public int mLevel;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "notice")
    public String mNotice;
    @JSONField(name = "pass")
    public boolean mPass;
    @JSONField(name = "remark")
    public String mRemark;
    @JSONField(name = "type")
    public int mType;

    protected GroupConfig(Parcel parcel) {
        this.mPass = parcel.readByte() != (byte) 0;
        this.mNotice = parcel.readString();
        this.mName = parcel.readString();
        this.mRemark = parcel.readString();
        this.mFace = parcel.readString();
        this.mType = parcel.readInt();
        this.mLevel = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (this.mPass ? 1 : 0));
        parcel.writeString(this.mNotice);
        parcel.writeString(this.mName);
        parcel.writeString(this.mRemark);
        parcel.writeString(this.mFace);
        parcel.writeInt(this.mType);
        parcel.writeInt(this.mLevel);
    }
}
