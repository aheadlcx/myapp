package bili2.bl;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: BL */
public class ibh extends FilterOutputStream {
    private long a = 0;

    public ibh(OutputStream outputStream) {
        super(outputStream);
    }

    public long a() {
        return this.a;
    }

    public void write(int i) throws IOException {
        this.a++;
        this.out.write(i);
    }

    public void write(byte[] bArr) throws IOException {
        this.a += (long) bArr.length;
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.a += (long) i2;
        this.out.write(bArr, i, i2);
    }
}
