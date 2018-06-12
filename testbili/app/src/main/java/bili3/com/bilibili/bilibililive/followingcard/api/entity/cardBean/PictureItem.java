package bili3.com.bilibili.bilibililive.followingcard.api.entity.cardBean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.text.TextUtils;
import bl.cah;
import bl.caq;
import com.alibaba.fastjson.annotation.JSONField;
import com.tencent.connect.common.Constants;

@Keep
/* compiled from: BL */
public class PictureItem implements Parcelable {
    public static final Creator<PictureItem> CREATOR = new Creator<PictureItem>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public PictureItem a(Parcel parcel) {
            return new PictureItem(parcel);
        }

        public PictureItem[] a(int i) {
            return new PictureItem[i];
        }
    };
    @JSONField(name = "img_height")
    public int imgHeight;
    @JSONField(name = "img_size")
    public float imgSize;
    @JSONField(name = "img_src")
    public String imgSrc;
    @JSONField(name = "img_width")
    public int imgWidth;
    @JSONField(serialize = false)
    public int mScreenLocationX;
    @JSONField(serialize = false)
    public int mScreenLocationY;
    @JSONField(serialize = false)
    public String mThumbUri = Constants.STR_EMPTY;
    @JSONField(serialize = false)
    public int mViewHeight;
    @JSONField(serialize = false)
    public int mViewWidth;

    protected PictureItem(Parcel parcel) {
        this.imgSrc = parcel.readString();
        this.imgWidth = parcel.readInt();
        this.imgHeight = parcel.readInt();
        this.imgSize = parcel.readFloat();
        this.mScreenLocationX = parcel.readInt();
        this.mScreenLocationY = parcel.readInt();
        this.mViewWidth = parcel.readInt();
        this.mViewHeight = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imgSrc);
        parcel.writeInt(this.imgWidth);
        parcel.writeInt(this.imgHeight);
        parcel.writeFloat(this.imgSize);
        parcel.writeInt(this.mScreenLocationX);
        parcel.writeInt(this.mScreenLocationY);
        parcel.writeInt(this.mViewWidth);
        parcel.writeInt(this.mViewHeight);
    }

    public void setThumbUri(String str) {
        this.mThumbUri = str;
    }

    public String webpSrc() {
        if (TextUtils.isEmpty(this.imgSrc)) {
            return Constants.STR_EMPTY;
        }
        if (caq.b(this.imgSrc)) {
            return this.imgSrc;
        }
        return cah.a(this.imgSrc);
    }
}
