package bili3.com.bilibili.column.api.response;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.column.api.Column;
import com.bilibili.okretro.GeneralResponse;
import java.util.List;

@Keep
/* compiled from: BL */
public class ColumnRecommendData extends GeneralResponse<List<Column>> {
    @JSONField(name = "aids_len")
    public int aidsLen;
}
