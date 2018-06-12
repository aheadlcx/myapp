package bili3.com.bilibili.column.api.response;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.column.api.ColumnHomeTab;
import com.bilibili.okretro.GeneralResponse;

@Keep
/* compiled from: BL */
public class ColumnHomeTabData extends GeneralResponse<ColumnHomeTab> {
    @JSONField(name = "aids_len")
    public int aidsLength;
}
