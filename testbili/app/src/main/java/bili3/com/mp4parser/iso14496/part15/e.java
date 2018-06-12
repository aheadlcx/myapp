package bili3.com.mp4parser.iso14496.part15;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.boxes.mp4.a.b;
import java.nio.ByteBuffer;

/* compiled from: BL */
public class e extends b {
    int a;
    int b;

    public void a(ByteBuffer byteBuffer) {
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.a = (readUInt8 & 192) >> 6;
        this.b = readUInt8 & 63;
    }

    public ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        IsoTypeWriter.c(allocate, this.b + (this.a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.b != eVar.b) {
            return false;
        }
        if (this.a != eVar.a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String a() {
        return "sync";
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.a + ", nalUnitType=" + this.b + '}';
    }
}
