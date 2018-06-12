package bili3.com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@f(a = {4})
/* compiled from: BL */
public class d extends BaseDescriptor {
    private static Logger k = Logger.getLogger(d.class.getName());
    int a;
    int b;
    int c;
    int d;
    long e;
    long f;
    e g;
    a h;
    List<k> i;
    byte[] j;

    public d() {
        this.i = new ArrayList();
        this.Y = 4;
    }

    public void a(ByteBuffer byteBuffer) throws IOException {
        this.a = IsoTypeReader.readUInt8(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.b = readUInt8 >>> 2;
        this.c = (readUInt8 >> 1) & 1;
        this.d = IsoTypeReader.readUInt24(byteBuffer);
        this.e = IsoTypeReader.readUInt32(byteBuffer);
        this.f = IsoTypeReader.readUInt32(byteBuffer);
        while (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            BaseDescriptor a = j.a(this.a, byteBuffer);
            int position2 = byteBuffer.position() - position;
            k.finer(a + " - DecoderConfigDescr1 read: " + position2 + ", size: " + (a != null ? Integer.valueOf(a.d()) : null));
            if (a != null) {
                position = a.d();
                if (position2 < position) {
                    this.j = new byte[(position - position2)];
                    byteBuffer.get(this.j);
                }
            }
            if (a instanceof e) {
                this.g = (e) a;
            } else if (a instanceof a) {
                this.h = (a) a;
            } else if (a instanceof k) {
                this.i.add((k) a);
            }
        }
    }

    int a() {
        int i = 0;
        int d = (this.h == null ? 0 : this.h.d()) + 13;
        if (this.g != null) {
            i = this.g.d();
        }
        d += i;
        i = d;
        for (k d2 : this.i) {
            i = d2.d() + i;
        }
        return i;
    }

    public ByteBuffer b() {
        ByteBuffer allocate = ByteBuffer.allocate(d());
        IsoTypeWriter.c(allocate, this.Y);
        a(allocate, a());
        IsoTypeWriter.c(allocate, this.a);
        IsoTypeWriter.c(allocate, ((this.b << 2) | (this.c << 1)) | 1);
        IsoTypeWriter.a(allocate, this.d);
        IsoTypeWriter.b(allocate, this.e);
        IsoTypeWriter.b(allocate, this.f);
        if (this.g != null) {
            allocate.put(this.g.b());
        }
        if (this.h != null) {
            allocate.put(this.h.b());
        }
        for (k b : this.i) {
            allocate.put(b.b());
        }
        return (ByteBuffer) allocate.rewind();
    }

    public e e() {
        return this.g;
    }

    public void a(e eVar) {
        this.g = eVar;
    }

    public a f() {
        return this.h;
    }

    public List<k> g() {
        return this.i;
    }

    public int h() {
        return this.a;
    }

    public void a(int i) {
        this.a = i;
    }

    public int i() {
        return this.b;
    }

    public void b(int i) {
        this.b = i;
    }

    public int j() {
        return this.c;
    }

    public int k() {
        return this.d;
    }

    public long l() {
        return this.e;
    }

    public void a(long j) {
        this.e = j;
    }

    public long m() {
        return this.f;
    }

    public void b(long j) {
        this.f = j;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DecoderConfigDescriptor");
        stringBuilder.append("{objectTypeIndication=").append(this.a);
        stringBuilder.append(", streamType=").append(this.b);
        stringBuilder.append(", upStream=").append(this.c);
        stringBuilder.append(", bufferSizeDB=").append(this.d);
        stringBuilder.append(", maxBitRate=").append(this.e);
        stringBuilder.append(", avgBitRate=").append(this.f);
        stringBuilder.append(", decoderSpecificInfo=").append(this.g);
        stringBuilder.append(", audioSpecificInfo=").append(this.h);
        stringBuilder.append(", configDescriptorDeadBytes=").append(Hex.a(this.j != null ? this.j : new byte[0]));
        stringBuilder.append(", profileLevelIndicationDescriptors=").append(this.i == null ? "null" : Arrays.asList(new List[]{this.i}).toString());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
