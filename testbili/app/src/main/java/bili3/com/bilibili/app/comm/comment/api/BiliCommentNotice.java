package bili3.com.bilibili.app.comm.comment.api;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BiliCommentNotice {
    @JSONField(name = "content")
    public String content;
    @JSONField(name = "id")
    public int id;
    @JSONField(name = "link")
    public String link;
}
