package bili2.bl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: BL */
public class ibi {
    private boolean a = true;
    private int b = 32768;
    private int c = 32768;
    private Inflater d = null;
    private boolean e = false;

    public void a(boolean z) {
        if (z != this.a) {
            c();
            this.a = z;
        }
    }

    public boolean a() {
        return this.e;
    }

    public void b(boolean z) {
        this.e = z;
    }

    protected Inflater b() {
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater(this.a);
            if (this.e) {
                this.d = inflater;
            }
        } else {
            inflater.reset();
        }
        return inflater;
    }

    public void c() {
        if (this.d != null) {
            this.d.end();
            this.d = null;
        }
    }

    public void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        InflaterInputStream inflaterInputStream = new InflaterInputStream(inputStream, b(), this.b);
        byte[] bArr = new byte[this.c];
        while (true) {
            int read = inflaterInputStream.read(bArr);
            if (read < 0) {
                break;
            }
            outputStream.write(bArr, 0, read);
        }
        if (!a()) {
            c();
        }
    }
}
