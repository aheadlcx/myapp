package bili3.com.bilibili.bilibililive.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;

/* compiled from: BL */
public class BaseLiveArea implements Parcelable {
    public static final Creator<BaseLiveArea> CREATOR = new Creator<BaseLiveArea>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public BaseLiveArea a(Parcel parcel) {
            return new BaseLiveArea(parcel);
        }

        public BaseLiveArea[] a(int i) {
            return new BaseLiveArea[i];
        }
    };
    @JSONField(name = "id")
    public int a;
    @JSONField(name = "name")
    public String b;
    @JSONField(name = "parent_name")
    public String c;

    public BaseLiveArea(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public String a() {
        return TextUtils.isEmpty(this.c) ? this.b : this.c + "\u00b7" + this.b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
