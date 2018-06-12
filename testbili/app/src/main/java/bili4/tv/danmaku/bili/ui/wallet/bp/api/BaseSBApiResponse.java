package bili4.tv.danmaku.bili.ui.wallet.bp.api;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

@Keep
/* compiled from: BL */
public class BaseSBApiResponse {
    @JSONField(name = "code")
    public int code;
    @JSONField(name = "message")
    public String message;

    public boolean isSuccess() {
        return this.code == 0;
    }
}
