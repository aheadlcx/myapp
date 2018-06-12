package bili3.com.bilibili.upper.contribute.up.entity.preview;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

@Keep
/* compiled from: BL */
public class Myinfo implements Serializable {
    public boolean activated;
    public boolean banned;
    public int commercial;
    public long deftime;
    public long deftime_end;
    public String deftime_msg;
    public String face;
    @JSONField(name = "identify_check")
    public IdentifyCheck identifyCheck;
    public int level;
    public int mid;
    public String uname;

    @Keep
    /* compiled from: BL */
    public static class IdentifyCheck implements Serializable {
        public int code;
        public String msg;
    }
}
