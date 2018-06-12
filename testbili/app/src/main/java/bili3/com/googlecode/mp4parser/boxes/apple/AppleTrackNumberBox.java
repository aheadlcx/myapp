package bili3.com.googlecode.mp4parser.boxes.apple;

import bl.koy.a;
import bl.kpf;
import bl.kph;
import com.googlecode.mp4parser.b;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;

/* compiled from: BL */
public class AppleTrackNumberBox extends AppleDataBox {
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    int a;
    int b;

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("AppleTrackNumberBox.java", AppleTrackNumberBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 16);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "a", Constants.STR_EMPTY, "void"), 20);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 24);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "int", "b", Constants.STR_EMPTY, "void"), 28);
    }

    public AppleTrackNumberBox() {
        super("trkn", 0);
    }

    public int getA() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.a;
    }

    public void setA(int i) {
        b.a().a(kph.a(ajc$tjp_1, this, this, kpf.a(i)));
        this.a = i;
    }

    public int getB() {
        b.a().a(kph.a(ajc$tjp_2, this, this));
        return this.b;
    }

    public void setB(int i) {
        b.a().a(kph.a(ajc$tjp_3, this, this, kpf.a(i)));
        this.b = i;
    }

    protected byte[] writeData() {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putInt(this.a);
        allocate.putInt(this.b);
        return allocate.array();
    }

    protected void parseData(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }

    protected int getDataLength() {
        return 8;
    }
}
