package bili3.com.bilibili.app.comm.comment2.model;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

@Keep
/* compiled from: BL */
public final class BiliCommentCursorList {
    @JSONField(name = "assist")
    public int assistant;
    @JSONField(name = "blacklist")
    public int blackList;
    @JSONField(name = "config")
    public BiliCommentConfig config;
    @JSONField(name = "cursor")
    public Cursor cursor;
    @JSONField(name = "hots")
    public List<BiliComment> hots;
    @JSONField(name = "notice")
    public BiliCommentNotice notice;
    @JSONField(name = "replies")
    public List<BiliComment> replies;
    @JSONField(name = "top")
    public BiliCommentTop top;
    @JSONField(name = "upper")
    public Upper upper;

    @Keep
    /* compiled from: BL */
    public static class Cursor {
        @JSONField(name = "all_count")
        public int allCount;
        @JSONField(name = "max_id")
        public long maxId;
        @JSONField(name = "min_id")
        public long minId;
        @JSONField(name = "size")
        public int size;
    }

    @Keep
    /* compiled from: BL */
    public static class Upper {
        @JSONField(name = "mid")
        public long mid;
    }

    public boolean isInBlackList() {
        return this.blackList == 1;
    }

    public boolean isAssistant() {
        return this.assistant == 1;
    }
}
