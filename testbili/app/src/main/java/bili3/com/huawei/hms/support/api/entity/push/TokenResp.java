package bili3.com.huawei.hms.support.api.entity.push;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.a.a;
import com.tencent.connect.common.Constants;

/* compiled from: BL */
public class TokenResp implements IMessageEntity {
    @a
    private int retCode = 0;
    @a
    private String token = Constants.STR_EMPTY;

    public int getRetCode() {
        return this.retCode;
    }
}
