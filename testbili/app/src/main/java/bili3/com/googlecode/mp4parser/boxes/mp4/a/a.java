package bili3.com.googlecode.mp4parser.boxes.mp4.a;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.util.f;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: BL */
public class a extends b {
    private boolean a;
    private byte b;
    private UUID c;

    public String a() {
        return "seig";
    }

    public void a(ByteBuffer byteBuffer) {
        boolean z = true;
        if (IsoTypeReader.readUInt24(byteBuffer) != 1) {
            z = false;
        }
        this.a = z;
        this.b = (byte) IsoTypeReader.readUInt8(byteBuffer);
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.c = f.a(bArr);
    }

    public ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        IsoTypeWriter.a(allocate, this.a ? 1 : 0);
        if (this.a) {
            IsoTypeWriter.c(allocate, this.b);
            allocate.put(f.a(this.c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.a + ", ivSize=" + this.b + ", kid=" + this.c + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a) {
            return false;
        }
        if (this.b != aVar.b) {
            return false;
        }
        if (this.c != null) {
            if (this.c.equals(aVar.c)) {
                return true;
            }
        } else if (aVar.c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c != null ? this.c.hashCode() : 0) + ((((this.a ? 7 : 19) * 31) + this.b) * 31);
    }
}
