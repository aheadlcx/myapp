package bili3.com.bilibili.bililive.videoclipplayer.core.api.entity;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

@Keep
/* compiled from: BL */
public class ClipVideoCollect {
    @JSONField(name = "cover")
    public ClipCover mCover;
    @JSONField(name = "damaku_num")
    public long mDanmuNum;
    @JSONField(name = "description")
    public String mDesc;
    @JSONField(name = "video_time")
    public long mDuration;
    @JSONField(name = "head_url")
    public String mHeadUrl;
    @JSONField(name = "is_vip")
    public boolean mIsVip;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "watched_num")
    public long mPlayNum;
    @JSONField(name = "uri")
    public String mSchema;
    @JSONField(name = "goto")
    public String mSchemaKey;
    @JSONField(name = "param")
    public String mSchemaValue;
    @JSONField(name = "tags")
    public List<String> mTags;
    @JSONField(name = "uid")
    public long mUid;
    @JSONField(name = "upload_time_text")
    public String mUploadTimeText;
    @JSONField(name = "id")
    public long mVideoId;
}
