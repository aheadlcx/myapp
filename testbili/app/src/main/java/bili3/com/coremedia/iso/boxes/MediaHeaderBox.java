package bili3.com.coremedia.iso.boxes;

import bl.koy.a;
import bl.kpf;
import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.b;
import com.googlecode.mp4parser.util.Logger;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: BL */
public class MediaHeaderBox extends AbstractFullBox {
    private static Logger LOG = Logger.a(MediaHeaderBox.class);
    public static final String TYPE = "mdhd";
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_10 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    private static final a ajc$tjp_4 = null;
    private static final a ajc$tjp_5 = null;
    private static final a ajc$tjp_6 = null;
    private static final a ajc$tjp_7 = null;
    private static final a ajc$tjp_8 = null;
    private static final a ajc$tjp_9 = null;
    private Date creationTime = new Date();
    private long duration;
    private String language = "eng";
    private Date modificationTime = new Date();
    private long timescale;

    private static void ajc$preClinit() {
        kph bl_kph = new kph("MediaHeaderBox.java", MediaHeaderBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.util.Date"), 48);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.util.Date"), 52);
        ajc$tjp_10 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "toString", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 125);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "long"), 56);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "long"), 60);
        ajc$tjp_4 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.lang.String"), 64);
        ajc$tjp_5 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", Constants.STR_EMPTY, "void"), 81);
        ajc$tjp_6 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", Constants.STR_EMPTY, "void"), 85);
        ajc$tjp_7 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "timescale", Constants.STR_EMPTY, "void"), 89);
        ajc$tjp_8 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "long", "duration", Constants.STR_EMPTY, "void"), 93);
        ajc$tjp_9 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", Constants.STR_EMPTY, "void"), 97);
    }

    static {
        ajc$preClinit();
    }

    public MediaHeaderBox() {
        super(TYPE);
    }

    public Date getCreationTime() {
        b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public Date getModificationTime() {
        b.a().a(kph.a(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTimescale() {
        b.a().a(kph.a(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public long getDuration() {
        b.a().a(kph.a(ajc$tjp_3, this, this));
        return this.duration;
    }

    public String getLanguage() {
        b.a().a(kph.a(ajc$tjp_4, this, this));
        return this.language;
    }

    protected long getContentSize() {
        long j;
        if (getVersion() == 1) {
            j = 4 + 28;
        } else {
            j = 4 + 16;
        }
        return (j + 2) + 2;
    }

    public void setCreationTime(Date date) {
        b.a().a(kph.a(ajc$tjp_5, this, this, date));
        this.creationTime = date;
    }

    public void setModificationTime(Date date) {
        b.a().a(kph.a(ajc$tjp_6, this, this, date));
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        b.a().a(kph.a(ajc$tjp_7, this, this, kpf.a(j)));
        this.timescale = j;
    }

    public void setDuration(long j) {
        b.a().a(kph.a(ajc$tjp_8, this, this, kpf.a(j)));
        this.duration = j;
    }

    public void setLanguage(String str) {
        b.a().a(kph.a(ajc$tjp_9, this, this, str));
        this.language = str;
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = com.googlecode.mp4parser.util.b.a(IsoTypeReader.readUInt64(byteBuffer));
            this.modificationTime = com.googlecode.mp4parser.util.b.a(IsoTypeReader.readUInt64(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = com.googlecode.mp4parser.util.b.a(IsoTypeReader.readUInt32(byteBuffer));
            this.modificationTime = com.googlecode.mp4parser.util.b.a(IsoTypeReader.readUInt32(byteBuffer));
            this.timescale = IsoTypeReader.readUInt32(byteBuffer);
            this.duration = (long) byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.b("mdhd duration is not in expected range");
        }
        this.language = IsoTypeReader.readIso639(byteBuffer);
        IsoTypeReader.readUInt16(byteBuffer);
    }

    public String toString() {
        b.a().a(kph.a(ajc$tjp_10, this, this));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaHeaderBox[");
        stringBuilder.append("creationTime=").append(getCreationTime());
        stringBuilder.append(";");
        stringBuilder.append("modificationTime=").append(getModificationTime());
        stringBuilder.append(";");
        stringBuilder.append("timescale=").append(getTimescale());
        stringBuilder.append(";");
        stringBuilder.append("duration=").append(getDuration());
        stringBuilder.append(";");
        stringBuilder.append("language=").append(getLanguage());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            IsoTypeWriter.a(byteBuffer, com.googlecode.mp4parser.util.b.a(this.creationTime));
            IsoTypeWriter.a(byteBuffer, com.googlecode.mp4parser.util.b.a(this.modificationTime));
            IsoTypeWriter.b(byteBuffer, this.timescale);
            byteBuffer.putLong(this.duration);
        } else {
            IsoTypeWriter.b(byteBuffer, com.googlecode.mp4parser.util.b.a(this.creationTime));
            IsoTypeWriter.b(byteBuffer, com.googlecode.mp4parser.util.b.a(this.modificationTime));
            IsoTypeWriter.b(byteBuffer, this.timescale);
            byteBuffer.putInt((int) this.duration);
        }
        IsoTypeWriter.a(byteBuffer, this.language);
        IsoTypeWriter.b(byteBuffer, 0);
    }
}
