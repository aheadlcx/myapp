package bili3.com.bilibili.lib.media.resolver.exception;

import com.tencent.connect.common.Constants;

/* compiled from: BL */
public class ResolveJsonException extends ResolveException {
    private int mCode;

    public ResolveJsonException(Throwable th, int i) {
        super(th);
        this.mCode = i;
    }

    public ResolveJsonException(String str, int i) {
        super(str);
        this.mCode = i;
    }

    public int a() {
        return this.mCode;
    }

    public String getMessage() {
        String message = super.getMessage();
        StringBuilder append = new StringBuilder().append(this.mCode).append(":");
        if (message == null) {
            message = Constants.STR_EMPTY;
        }
        return append.append(message).toString();
    }
}
