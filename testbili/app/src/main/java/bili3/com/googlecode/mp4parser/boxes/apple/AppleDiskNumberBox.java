package bili3.com.googlecode.mp4parser.boxes.apple;

import bl.koy.a;
import bl.kpf;
import bl.kph;
import com.googlecode.mp4parser.b;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;

/* compiled from: BL */
public class AppleDiskNumberBox extends AppleDataBox {
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    int a;
    short b;

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("AppleDiskNumberBox.java", AppleDiskNumberBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 16);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "int", "a", Constants.STR_EMPTY, "void"), 20);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "short"), 24);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "short", "b", Constants.STR_EMPTY, "void"), 28);
    }

    public AppleDiskNumberBox() {
        super("disk", 0);
    }

    public int getA() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.a;
    }

    public void setA(int i) {
        b.a().a(kph.a(ajc$tjp_1, this, this, kpf.a(i)));
        this.a = i;
    }

    public short getB() {
        b.a().a(kph.a(ajc$tjp_2, this, this));
        return this.b;
    }

    public void setB(short s) {
        b.a().a(kph.a(ajc$tjp_3, this, this, kpf.a(s)));
        this.b = s;
    }

    protected byte[] writeData() {
        ByteBuffer allocate = ByteBuffer.allocate(6);
        allocate.putInt(this.a);
        allocate.putShort(this.b);
        return allocate.array();
    }

    protected void parseData(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getShort();
    }

    protected int getDataLength() {
        return 6;
    }
}
