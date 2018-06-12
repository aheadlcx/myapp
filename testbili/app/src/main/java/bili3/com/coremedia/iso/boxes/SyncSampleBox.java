package bili3.com.coremedia.iso.boxes;

import bl.koy.a;
import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.b;
import com.googlecode.mp4parser.util.CastUtils;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;

/* compiled from: BL */
public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = "stss";
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("SyncSampleBox.java", SyncSampleBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "[J"), 46);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "toString", "com.coremedia.iso.boxes.SyncSampleBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 77);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", Constants.STR_EMPTY, "void"), 81);
    }

    public SyncSampleBox() {
        super(TYPE);
    }

    public long[] getSampleNumber() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.sampleNumber;
    }

    protected long getContentSize() {
        return (long) ((this.sampleNumber.length * 4) + 8);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int a = CastUtils.a(IsoTypeReader.readUInt32(byteBuffer));
        this.sampleNumber = new long[a];
        for (int i = 0; i < a; i++) {
            this.sampleNumber[i] = IsoTypeReader.readUInt32(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.b(byteBuffer, (long) this.sampleNumber.length);
        for (long b : this.sampleNumber) {
            IsoTypeWriter.b(byteBuffer, b);
        }
    }

    public String toString() {
        b.a().a(kph.a(ajc$tjp_1, this, this));
        return "SyncSampleBox[entryCount=" + this.sampleNumber.length + "]";
    }

    public void setSampleNumber(long[] jArr) {
        b.a().a(kph.a(ajc$tjp_2, this, this, jArr));
        this.sampleNumber = jArr;
    }
}
