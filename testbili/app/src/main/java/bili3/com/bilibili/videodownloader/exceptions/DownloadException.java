package bili3.com.bilibili.videodownloader.exceptions;

/* compiled from: BL */
public abstract class DownloadException extends Exception {
    public final int mErrorCode;

    public DownloadException(int i, String str) {
        super(str);
        this.mErrorCode = i;
    }

    public DownloadException(int i, Throwable th) {
        super(th);
        this.mErrorCode = i;
    }

    public DownloadException(int i, String str, Throwable th) {
        super(str, th);
        this.mErrorCode = i;
    }

    public int a() {
        return this.mErrorCode;
    }
}
