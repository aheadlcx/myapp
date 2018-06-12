package bili3.com.bilibili.bilibililive.bililivefollowing.api.entity.response;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class FollowingUploadImageResponse {
    @JSONField(name = "image_height")
    public String imageHeight;
    public float imageSize;
    @JSONField(name = "image_url")
    public String imageUrl;
    @JSONField(name = "image_width")
    public String imageWidth;
    @JSONField(name = "pos")
    public int pos;
}
