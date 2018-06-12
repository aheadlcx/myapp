package bili3.com.bilibili.api;

import com.mall.domain.order.OrderResultCode;

/* compiled from: BL */
public class BiliApiException extends Exception {
    public int mCode = -1;

    public BiliApiException(String str) {
        super(str);
    }

    public BiliApiException(int i) {
        this.mCode = i;
    }

    public BiliApiException(int i, String str) {
        super(str);
        this.mCode = i;
    }

    public BiliApiException(Throwable th) {
        super(th);
    }

    public boolean a() {
        return this.mCode == -2 || this.mCode == OrderResultCode.CODE_EXPRESS_ERROR;
    }
}
