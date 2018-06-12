package bili4.u.aly;

import bl.ibn;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: BL */
public class da extends dc {
    protected InputStream a = null;
    protected OutputStream b = null;

    protected da() {
    }

    public da(InputStream inputStream) {
        this.a = inputStream;
    }

    public da(OutputStream outputStream) {
        this.b = outputStream;
    }

    public da(InputStream inputStream, OutputStream outputStream) {
        this.a = inputStream;
        this.b = outputStream;
    }

    public boolean a() {
        return true;
    }

    public void b() throws dd {
    }

    public void c() {
        if (this.a != null) {
            try {
                this.a.close();
            } catch (Throwable e) {
                ibn.a(e);
            }
            this.a = null;
        }
        if (this.b != null) {
            try {
                this.b.close();
            } catch (Throwable e2) {
                ibn.a(e2);
            }
            this.b = null;
        }
    }

    public int a(byte[] bArr, int i, int i2) throws dd {
        if (this.a == null) {
            throw new dd(1, "Cannot read from null inputStream");
        }
        try {
            int read = this.a.read(bArr, i, i2);
            if (read >= 0) {
                return read;
            }
            throw new dd(4);
        } catch (Throwable e) {
            throw new dd(0, e);
        }
    }

    public void b(byte[] bArr, int i, int i2) throws dd {
        if (this.b == null) {
            throw new dd(1, "Cannot write to null outputStream");
        }
        try {
            this.b.write(bArr, i, i2);
        } catch (Throwable e) {
            throw new dd(0, e);
        }
    }

    public void d() throws dd {
        if (this.b == null) {
            throw new dd(1, "Cannot flush null outputStream");
        }
        try {
            this.b.flush();
        } catch (Throwable e) {
            throw new dd(0, e);
        }
    }
}
