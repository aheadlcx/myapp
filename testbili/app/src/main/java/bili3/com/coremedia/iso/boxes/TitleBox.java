package bili3.com.coremedia.iso.boxes;

import bl.koy.a;
import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.Utf8;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.b;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QzoneShare;
import java.nio.ByteBuffer;

/* compiled from: BL */
public class TitleBox extends AbstractFullBox {
    public static final String TYPE = "titl";
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    private static final a ajc$tjp_4 = null;
    private String language;
    private String title;

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("TitleBox.java", TitleBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getLanguage", "com.coremedia.iso.boxes.TitleBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 46);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getTitle", "com.coremedia.iso.boxes.TitleBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 50);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setLanguage", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", "language", Constants.STR_EMPTY, "void"), 59);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setTitle", "com.coremedia.iso.boxes.TitleBox", "java.lang.String", QzoneShare.SHARE_TO_QQ_TITLE, Constants.STR_EMPTY, "void"), 63);
        ajc$tjp_4 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "toString", "com.coremedia.iso.boxes.TitleBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 86);
    }

    public TitleBox() {
        super(TYPE);
    }

    public String getLanguage() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.language;
    }

    public String getTitle() {
        b.a().a(kph.a(ajc$tjp_1, this, this));
        return this.title;
    }

    public void setLanguage(String str) {
        b.a().a(kph.a(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setTitle(String str) {
        b.a().a(kph.a(ajc$tjp_3, this, this, str));
        this.title = str;
    }

    protected long getContentSize() {
        return (long) (Utf8.b(this.title) + 7);
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.a(byteBuffer, this.language);
        byteBuffer.put(Utf8.a(this.title));
        byteBuffer.put((byte) 0);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = IsoTypeReader.readIso639(byteBuffer);
        this.title = IsoTypeReader.readString(byteBuffer);
    }

    public String toString() {
        b.a().a(kph.a(ajc$tjp_4, this, this));
        return "TitleBox[language=" + getLanguage() + ";title=" + getTitle() + "]";
    }
}
