package bili3.com.bilibili.app.live.core.api;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

@Keep
/* compiled from: BL */
public class BiliCommentList {
    public static final int OID_TYPE_ARTICLE = 12;
    public static final int OID_TYPE_AV = 1;
    public static final int OID_TYPE_MUSIC = 14;
    public static final int OID_TYPE_PAINTING = 11;
    public static final int OID_TYPE_REVIEW = 15;
    public static final int OID_TYPE_TOPIC = 2;
    @JSONField(name = "assist")
    public int mAssistant;
    @JSONField(name = "blacklist")
    public int mBlackList;
    @JSONField(name = "config")
    public Config mConfig;
    public boolean mHasMoreData;
    @JSONField(name = "hots")
    public List<BiliComment> mHotList;
    @JSONField(name = "replies")
    public List<BiliComment> mList;
    @JSONField(name = "notice")
    public BiliCommentNotice mNotice;
    @JSONField(name = "page")
    public Page mPage;
    @JSONField(name = "top")
    public BiliComment mTop;
    @JSONField(name = "upper")
    public UpperInfo mUpperInfo;

    @Keep
    /* compiled from: BL */
    public static class Config {
        @JSONField(name = "showadmin")
        public int mShowAdmin;
        @JSONField(name = "showentry")
        public int mShowEntry;

        public boolean isShowEntry() {
            return this.mShowEntry == BiliCommentList.OID_TYPE_AV;
        }

        public boolean isShowDeleteInfo() {
            return this.mShowAdmin == BiliCommentList.OID_TYPE_AV;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Page {
        @JSONField(name = "acount")
        public int mAmount;
        @JSONField(name = "count")
        public int mCount;
        @JSONField(name = "num")
        public int mPage;
        @JSONField(name = "size")
        public int mSize;
    }

    @Keep
    /* compiled from: BL */
    public static class UpperInfo {
        @JSONField(name = "mid")
        public long mid;
        @JSONField(name = "top")
        public BiliComment top;
    }

    public boolean showLogEntry() {
        return this.mConfig != null && this.mConfig.mShowEntry == OID_TYPE_AV;
    }

    public int getFeedbackNum() {
        if (this.mPage == null) {
            return 0;
        }
        return this.mPage.mCount;
    }

    public int getFeedbackAmount() {
        return this.mPage == null ? 0 : this.mPage.mAmount;
    }

    public boolean checkUserInBlackList() {
        return this.mBlackList == OID_TYPE_AV;
    }

    public boolean checkUserAssistant() {
        return this.mAssistant == OID_TYPE_AV;
    }

    public int getPageTotalNum() {
        int i = 0;
        if (this.mPage == null) {
            return 0;
        }
        int i2 = this.mPage.mCount / 20;
        if (this.mPage.mCount % 20 != 0) {
            i = OID_TYPE_AV;
        }
        return i + i2;
    }
}
