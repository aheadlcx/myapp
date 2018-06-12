package bili3.com.googlecode.mp4parser.boxes.mp4.a;

import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.b;
import com.googlecode.mp4parser.util.CastUtils;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* compiled from: BL */
public class f extends AbstractFullBox {
    private static final bl.koy.a d = null;
    private static final bl.koy.a e = null;
    private static final bl.koy.a f = null;
    private static final bl.koy.a g = null;
    private static final bl.koy.a h = null;
    private static final bl.koy.a i = null;
    List<a> a = new LinkedList();
    private String b;
    private String c;

    /* compiled from: BL */
    public static class a {
        private long a;
        private int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public long a() {
            return this.a;
        }

        public void a(long j) {
            this.a = j;
        }

        public int b() {
            return this.b;
        }

        public String toString() {
            return "Entry{sampleCount=" + this.a + ", groupDescriptionIndex=" + this.b + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            if (this.a != aVar.a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((int) (this.a ^ (this.a >>> 32))) * 31) + this.b;
        }
    }

    static {
        c();
    }

    private static void c() {
        kph bl_kph = new kph("SampleToGroupBox.java", f.class);
        d = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 150);
        e = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", Constants.STR_EMPTY, "void"), 154);
        f = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 158);
        g = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", Constants.STR_EMPTY, "void"), 162);
        h = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.util.List"), 166);
        i = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", Constants.STR_EMPTY, "void"), 170);
    }

    public f() {
        super("sbgp");
    }

    protected long getContentSize() {
        return (long) (getVersion() == 1 ? (this.a.size() * 8) + 16 : (this.a.size() * 8) + 12);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.b.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.c.getBytes());
        }
        IsoTypeWriter.b(byteBuffer, (long) this.a.size());
        for (a aVar : this.a) {
            IsoTypeWriter.b(byteBuffer, aVar.a());
            IsoTypeWriter.b(byteBuffer, (long) aVar.b());
        }
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.b = IsoTypeReader.read4cc(byteBuffer);
        if (getVersion() == 1) {
            this.c = IsoTypeReader.read4cc(byteBuffer);
        }
        long readUInt32 = IsoTypeReader.readUInt32(byteBuffer);
        while (true) {
            long j = readUInt32 - 1;
            if (readUInt32 > 0) {
                this.a.add(new a((long) CastUtils.a(IsoTypeReader.readUInt32(byteBuffer)), CastUtils.a(IsoTypeReader.readUInt32(byteBuffer))));
                readUInt32 = j;
            } else {
                return;
            }
        }
    }

    public String a() {
        b.a().a(kph.a(d, this, this));
        return this.b;
    }

    public void a(String str) {
        b.a().a(kph.a(e, this, this, str));
        this.b = str;
    }

    public List<a> b() {
        b.a().a(kph.a(h, this, this));
        return this.a;
    }
}
