package bili3.com.bilibili.bililive.videoliveplayer.net.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Keep;
import android.text.TextUtils;
import bl.egb;
import bl.hae;
import com.alibaba.fastjson.annotation.JSONField;
import com.tencent.connect.common.Constants;
import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveV2 implements Parcelable {
    public static final Creator<BiliLiveV2> CREATOR = new Creator<BiliLiveV2>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public BiliLiveV2 a(Parcel parcel) {
            return new BiliLiveV2(parcel);
        }

        public BiliLiveV2[] a(int i) {
            return new BiliLiveV2[i];
        }
    };
    @JSONField(name = "accept_quality")
    public String mAcceptQuality;
    @JSONField(name = "accept_quality_v2")
    public List<String> mAcceptQualityV2;
    @JSONField(name = "area_name")
    public String mArea;
    @JSONField(name = "area_id")
    public int mAreaId;
    @JSONField(name = "corner")
    public String mCorner;
    @JSONField(name = "cover_size")
    public CoverSize mCoverSize;
    @JSONField(name = "current_quality")
    public int mCurrentQuality;
    @JSONField(name = "face")
    public String mFace;
    @JSONField(name = "index")
    public int mIndex;
    @JSONField(name = "is_clip")
    public int mIsClip;
    public boolean mIsRound;
    @JSONField(name = "is_tv")
    public int mIsTv;
    @JSONField(name = "link")
    public String mLink;
    @JSONField(name = "online")
    public long mOnline;
    @JSONField(name = "parent_id")
    public int mParentAreaId;
    @JSONField(name = "parent_name")
    public String mParentAreaName;
    public long mParsedTime;
    @JSONField(name = "pendent")
    public String mPendent;
    @JSONField(name = "play_url")
    public String mPlayUrl;
    @JSONField(name = "realurl")
    public String mRealUrl;
    @JSONField(name = "roomid")
    public int mRoomId;
    @JSONField(name = "round_status")
    public int mRoundStatus;
    public int mSectionPosition;
    @JSONField(name = "show_cover")
    public String mShowCover;
    @JSONField(name = "system_cover")
    public String mSystemCover;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "uname")
    public String mUname;
    @JSONField(name = "user_cover")
    public String mUserCover;
    @JSONField(name = "user_cover_flag")
    public int mUserCoverFlag;
    @JSONField(name = "pendent_ru")
    public String pendentRightTop;

    /* compiled from: BL */
    public static class CoverSize implements Parcelable {
        public static final Creator<CoverSize> CREATOR = new Creator<CoverSize>() {
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }

            public CoverSize a(Parcel parcel) {
                return new CoverSize(parcel);
            }

            public CoverSize[] a(int i) {
                return new CoverSize[i];
            }
        };
        public int a;
        public int b;

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        protected CoverSize(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }
    }

    public boolean hasPlayUrl() {
        return !TextUtils.isEmpty(this.mPlayUrl);
    }

    public boolean hasPlayUrlResolved() {
        return !TextUtils.isEmpty(this.mRealUrl);
    }

    public String getCover() {
        if (this.mUserCoverFlag == 1) {
            return this.mUserCover;
        }
        return this.mSystemCover;
    }

    public String getDisplayAreaName() {
        String str;
        if (TextUtils.isEmpty(this.mArea)) {
            str = this.mParentAreaName;
        } else {
            str = this.mArea;
        }
        return egb.a(str, 5, Constants.STR_EMPTY);
    }

    public String toString() {
        return hae.a(new byte[]{(byte) 71, (byte) 108, (byte) 105, (byte) 108, (byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 126, (byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 76, (byte) 97, (byte) 56}) + this.mRoomId + hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96, (byte) 56, (byte) 34}) + this.mTitle + '\'' + '}';
    }

    public String getReportMessage(int i) {
        return new StringBuffer("{").append(this.mParentAreaId).append(";").append(this.mAreaId).append(";").append(i).append("}").toString();
    }

    public BiliLiveV2() {
        this.mParsedTime = System.currentTimeMillis();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mRoomId);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mUname);
        parcel.writeLong(this.mOnline);
        parcel.writeString(this.mUserCover);
        parcel.writeString(this.mSystemCover);
        parcel.writeString(this.mPendent);
        parcel.writeString(this.mShowCover);
        parcel.writeInt(this.mUserCoverFlag);
        parcel.writeString(this.mLink);
        parcel.writeString(this.mFace);
        parcel.writeParcelable(this.mCoverSize, i);
        parcel.writeInt(this.mParentAreaId);
        parcel.writeString(this.mParentAreaName);
        parcel.writeInt(this.mAreaId);
        parcel.writeString(this.mArea);
        parcel.writeString(this.mPlayUrl);
        parcel.writeString(this.mAcceptQuality);
        parcel.writeInt(this.mIsTv);
        parcel.writeString(this.mCorner);
        parcel.writeString(this.mRealUrl);
        parcel.writeInt(this.mIsClip);
        parcel.writeInt(this.mRoundStatus);
        parcel.writeInt(this.mCurrentQuality);
        parcel.writeStringList(this.mAcceptQualityV2);
        parcel.writeLong(this.mParsedTime);
        parcel.writeByte(this.mIsRound ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mSectionPosition);
        parcel.writeString(this.pendentRightTop);
    }

    protected BiliLiveV2(Parcel parcel) {
        this.mIndex = parcel.readInt();
        this.mRoomId = parcel.readInt();
        this.mTitle = parcel.readString();
        this.mUname = parcel.readString();
        this.mOnline = parcel.readLong();
        this.mUserCover = parcel.readString();
        this.mSystemCover = parcel.readString();
        this.mPendent = parcel.readString();
        this.mShowCover = parcel.readString();
        this.mUserCoverFlag = parcel.readInt();
        this.mLink = parcel.readString();
        this.mFace = parcel.readString();
        this.mCoverSize = (CoverSize) parcel.readParcelable(CoverSize.class.getClassLoader());
        this.mParentAreaId = parcel.readInt();
        this.mParentAreaName = parcel.readString();
        this.mAreaId = parcel.readInt();
        this.mArea = parcel.readString();
        this.mPlayUrl = parcel.readString();
        this.mAcceptQuality = parcel.readString();
        this.mIsTv = parcel.readInt();
        this.mCorner = parcel.readString();
        this.mRealUrl = parcel.readString();
        this.mIsClip = parcel.readInt();
        this.mRoundStatus = parcel.readInt();
        this.mCurrentQuality = parcel.readInt();
        this.mAcceptQualityV2 = parcel.createStringArrayList();
        this.mParsedTime = parcel.readLong();
        this.mIsRound = parcel.readByte() != (byte) 0;
        this.mSectionPosition = parcel.readInt();
        this.pendentRightTop = parcel.readString();
    }
}
