package bili4.tv.danmaku.bili.ui.game.api;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;

@Keep
/* compiled from: BL */
public class BiliGameGiftSearchCode {
    @JSONField(name = "data")
    public List<Code> codeList;

    @Keep
    /* compiled from: BL */
    public static class Code {
        @JSONField(name = "code")
        public String code;
    }
}
