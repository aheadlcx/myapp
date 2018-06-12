package bili3.com.bilibili.app.comm.bh;

import java.io.IOException;

/* compiled from: BL */
public class BHException extends IOException {
    private final int mCode;

    public BHException(int i, String str) {
        super(str);
        this.mCode = i;
    }

    public int a() {
        return this.mCode;
    }
}
