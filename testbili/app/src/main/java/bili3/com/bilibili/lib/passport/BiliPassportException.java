package bili3.com.bilibili.lib.passport;

import com.mall.domain.order.OrderResultCode;

/* compiled from: BL */
public class BiliPassportException extends Exception {
    public int code;
    public String payLoad;

    public BiliPassportException(int i) {
        this(i, (Throwable) null);
    }

    public BiliPassportException(Throwable th) {
        this(-1, th);
    }

    public BiliPassportException(int i, Throwable th) {
        this(i, null, th);
    }

    public BiliPassportException(int i, String str) {
        this(i, str, null);
    }

    public BiliPassportException(int i, String str, Throwable th) {
        super(str, th);
        this.code = i;
    }

    public boolean a() {
        return this.code == OrderResultCode.CODE_EXPRESS_ERROR || this.code == -2;
    }
}
