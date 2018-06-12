package bili3.com.coremedia.iso.boxes;

import bl.koy.a;
import bl.kpf;
import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.b;
import com.googlecode.mp4parser.util.CastUtils;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: BL */
public class SampleToChunkBox extends AbstractFullBox {
    public static final String TYPE = "stsc";
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    List<Entry> entries = Collections.emptyList();

    /* compiled from: BL */
    public static class Entry {
        long firstChunk;
        long sampleDescriptionIndex;
        long samplesPerChunk;

        public Entry(long j, long j2, long j3) {
            this.firstChunk = j;
            this.samplesPerChunk = j2;
            this.sampleDescriptionIndex = j3;
        }

        public long getFirstChunk() {
            return this.firstChunk;
        }

        public void setFirstChunk(long j) {
            this.firstChunk = j;
        }

        public long getSamplesPerChunk() {
            return this.samplesPerChunk;
        }

        public void setSamplesPerChunk(long j) {
            this.samplesPerChunk = j;
        }

        public long getSampleDescriptionIndex() {
            return this.sampleDescriptionIndex;
        }

        public void setSampleDescriptionIndex(long j) {
            this.sampleDescriptionIndex = j;
        }

        public String toString() {
            return "Entry{firstChunk=" + this.firstChunk + ", samplesPerChunk=" + this.samplesPerChunk + ", sampleDescriptionIndex=" + this.sampleDescriptionIndex + '}';
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.firstChunk != entry.firstChunk) {
                return false;
            }
            if (this.sampleDescriptionIndex != entry.sampleDescriptionIndex) {
                return false;
            }
            if (this.samplesPerChunk != entry.samplesPerChunk) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((int) (this.firstChunk ^ (this.firstChunk >>> 32))) * 31) + ((int) (this.samplesPerChunk ^ (this.samplesPerChunk >>> 32)))) * 31) + ((int) (this.sampleDescriptionIndex ^ (this.sampleDescriptionIndex >>> 32)));
        }
    }

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("SampleToChunkBox.java", SampleToChunkBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.util.List"), 47);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", "entries", Constants.STR_EMPTY, "void"), 51);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "toString", "com.coremedia.iso.boxes.SampleToChunkBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 84);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", "int", "chunkCount", Constants.STR_EMPTY, "[J"), 95);
    }

    public SampleToChunkBox() {
        super(TYPE);
    }

    public List<Entry> getEntries() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<Entry> list) {
        b.a().a(kph.a(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    protected long getContentSize() {
        return (long) ((this.entries.size() * 12) + 8);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = CastUtils.a(IsoTypeReader.readUInt32(byteBuffer));
        this.entries = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            this.entries.add(new Entry(IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer), IsoTypeReader.readUInt32(byteBuffer)));
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.b(byteBuffer, (long) this.entries.size());
        for (Entry entry : this.entries) {
            IsoTypeWriter.b(byteBuffer, entry.getFirstChunk());
            IsoTypeWriter.b(byteBuffer, entry.getSamplesPerChunk());
            IsoTypeWriter.b(byteBuffer, entry.getSampleDescriptionIndex());
        }
    }

    public String toString() {
        b.a().a(kph.a(ajc$tjp_2, this, this));
        return "SampleToChunkBox[entryCount=" + this.entries.size() + "]";
    }

    public long[] blowup(int i) {
        b.a().a(kph.a(ajc$tjp_3, this, this, kpf.a(i)));
        long[] jArr = new long[i];
        List linkedList = new LinkedList(this.entries);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        Entry entry = (Entry) it.next();
        for (int length = jArr.length; length > 1; length--) {
            jArr[length - 1] = entry.getSamplesPerChunk();
            if (((long) length) == entry.getFirstChunk()) {
                entry = (Entry) it.next();
            }
        }
        jArr[0] = entry.getSamplesPerChunk();
        return jArr;
    }
}
