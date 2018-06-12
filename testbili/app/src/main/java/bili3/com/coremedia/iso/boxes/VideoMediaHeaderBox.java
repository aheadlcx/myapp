package bili3.com.coremedia.iso.boxes;

import bl.koy.a;
import bl.kpf;
import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.b;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;

/* compiled from: BL */
public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "vmhd";
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    private static final a ajc$tjp_4 = null;
    private int graphicsmode = 0;
    private int[] opcolor = new int[3];

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("VideoMediaHeaderBox.java", VideoMediaHeaderBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 39);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "[I"), 43);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "toString", "com.coremedia.iso.boxes.VideoMediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 71);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setOpcolor", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "[I", "opcolor", Constants.STR_EMPTY, "void"), 75);
        ajc$tjp_4 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setGraphicsmode", "com.coremedia.iso.boxes.VideoMediaHeaderBox", "int", "graphicsmode", Constants.STR_EMPTY, "void"), 79);
    }

    public VideoMediaHeaderBox() {
        super(TYPE);
        setFlags(1);
    }

    public int getGraphicsmode() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.graphicsmode;
    }

    public int[] getOpcolor() {
        b.a().a(kph.a(ajc$tjp_1, this, this));
        return this.opcolor;
    }

    protected long getContentSize() {
        return 12;
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.graphicsmode = IsoTypeReader.readUInt16(byteBuffer);
        this.opcolor = new int[3];
        for (int i = 0; i < 3; i++) {
            this.opcolor[i] = IsoTypeReader.readUInt16(byteBuffer);
        }
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.b(byteBuffer, this.graphicsmode);
        for (int b : this.opcolor) {
            IsoTypeWriter.b(byteBuffer, b);
        }
    }

    public String toString() {
        b.a().a(kph.a(ajc$tjp_2, this, this));
        return "VideoMediaHeaderBox[graphicsmode=" + getGraphicsmode() + ";opcolor0=" + getOpcolor()[0] + ";opcolor1=" + getOpcolor()[1] + ";opcolor2=" + getOpcolor()[2] + "]";
    }

    public void setOpcolor(int[] iArr) {
        b.a().a(kph.a(ajc$tjp_3, this, this, iArr));
        this.opcolor = iArr;
    }

    public void setGraphicsmode(int i) {
        b.a().a(kph.a(ajc$tjp_4, this, this, kpf.a(i)));
        this.graphicsmode = i;
    }
}
