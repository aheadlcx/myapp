package bili3.com.coremedia.iso.boxes;

import bl.koy.a;
import bl.kpf;
import bl.kph;
import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.coremedia.iso.b;
import com.coremedia.iso.c;
import com.googlecode.mp4parser.AbstractFullBox;
import com.tencent.connect.common.Constants;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

/* compiled from: BL */
public class ItemLocationBox extends AbstractFullBox {
    public static final String TYPE = "iloc";
    private static final a ajc$tjp_0 = null;
    private static final a ajc$tjp_1 = null;
    private static final a ajc$tjp_10 = null;
    private static final a ajc$tjp_11 = null;
    private static final a ajc$tjp_2 = null;
    private static final a ajc$tjp_3 = null;
    private static final a ajc$tjp_4 = null;
    private static final a ajc$tjp_5 = null;
    private static final a ajc$tjp_6 = null;
    private static final a ajc$tjp_7 = null;
    private static final a ajc$tjp_8 = null;
    private static final a ajc$tjp_9 = null;
    public int baseOffsetSize = 8;
    public int indexSize = 0;
    public List<Item> items = new LinkedList();
    public int lengthSize = 8;
    public int offsetSize = 8;

    /* compiled from: BL */
    public class Extent {
        public long extentIndex;
        public long extentLength;
        public long extentOffset;

        public Extent(long j, long j2, long j3) {
            this.extentOffset = j;
            this.extentLength = j2;
            this.extentIndex = j3;
        }

        public Extent(ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                this.extentIndex = b.a(byteBuffer, ItemLocationBox.this.indexSize);
            }
            this.extentOffset = b.a(byteBuffer, ItemLocationBox.this.offsetSize);
            this.extentLength = b.a(byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public void getContent(ByteBuffer byteBuffer) {
            if (ItemLocationBox.this.getVersion() == 1 && ItemLocationBox.this.indexSize > 0) {
                c.a(this.extentIndex, byteBuffer, ItemLocationBox.this.indexSize);
            }
            c.a(this.extentOffset, byteBuffer, ItemLocationBox.this.offsetSize);
            c.a(this.extentLength, byteBuffer, ItemLocationBox.this.lengthSize);
        }

        public int getSize() {
            return ((ItemLocationBox.this.indexSize > 0 ? ItemLocationBox.this.indexSize : 0) + ItemLocationBox.this.offsetSize) + ItemLocationBox.this.lengthSize;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Extent extent = (Extent) obj;
            if (this.extentIndex != extent.extentIndex) {
                return false;
            }
            if (this.extentLength != extent.extentLength) {
                return false;
            }
            if (this.extentOffset != extent.extentOffset) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((int) (this.extentOffset ^ (this.extentOffset >>> 32))) * 31) + ((int) (this.extentLength ^ (this.extentLength >>> 32)))) * 31) + ((int) (this.extentIndex ^ (this.extentIndex >>> 32)));
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Extent");
            stringBuilder.append("{extentOffset=").append(this.extentOffset);
            stringBuilder.append(", extentLength=").append(this.extentLength);
            stringBuilder.append(", extentIndex=").append(this.extentIndex);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    /* compiled from: BL */
    public class Item {
        public long baseOffset;
        public int constructionMethod;
        public int dataReferenceIndex;
        public List<Extent> extents = new LinkedList();
        public int itemId;

        public Item(ByteBuffer byteBuffer) {
            this.itemId = IsoTypeReader.readUInt16(byteBuffer);
            if (ItemLocationBox.this.getVersion() == 1) {
                this.constructionMethod = IsoTypeReader.readUInt16(byteBuffer) & 15;
            }
            this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer);
            if (ItemLocationBox.this.baseOffsetSize > 0) {
                this.baseOffset = b.a(byteBuffer, ItemLocationBox.this.baseOffsetSize);
            } else {
                this.baseOffset = 0;
            }
            int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
            for (int i = 0; i < readUInt16; i++) {
                this.extents.add(new Extent(byteBuffer));
            }
        }

        public Item(int i, int i2, int i3, long j, List<Extent> list) {
            this.itemId = i;
            this.constructionMethod = i2;
            this.dataReferenceIndex = i3;
            this.baseOffset = j;
            this.extents = list;
        }

        public int getSize() {
            int i = 2;
            if (ItemLocationBox.this.getVersion() == 1) {
                i = 4;
            }
            i = ((i + 2) + ItemLocationBox.this.baseOffsetSize) + 2;
            int i2 = i;
            for (Extent size : this.extents) {
                i2 = size.getSize() + i2;
            }
            return i2;
        }

        public void setBaseOffset(long j) {
            this.baseOffset = j;
        }

        public void getContent(ByteBuffer byteBuffer) {
            IsoTypeWriter.b(byteBuffer, this.itemId);
            if (ItemLocationBox.this.getVersion() == 1) {
                IsoTypeWriter.b(byteBuffer, this.constructionMethod);
            }
            IsoTypeWriter.b(byteBuffer, this.dataReferenceIndex);
            if (ItemLocationBox.this.baseOffsetSize > 0) {
                c.a(this.baseOffset, byteBuffer, ItemLocationBox.this.baseOffsetSize);
            }
            IsoTypeWriter.b(byteBuffer, this.extents.size());
            for (Extent content : this.extents) {
                content.getContent(byteBuffer);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            if (this.baseOffset != item.baseOffset) {
                return false;
            }
            if (this.constructionMethod != item.constructionMethod) {
                return false;
            }
            if (this.dataReferenceIndex != item.dataReferenceIndex) {
                return false;
            }
            if (this.itemId != item.itemId) {
                return false;
            }
            if (this.extents != null) {
                if (this.extents.equals(item.extents)) {
                    return true;
                }
            } else if (item.extents == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.extents != null ? this.extents.hashCode() : 0) + (((((((this.itemId * 31) + this.constructionMethod) * 31) + this.dataReferenceIndex) * 31) + ((int) (this.baseOffset ^ (this.baseOffset >>> 32)))) * 31);
        }

        public String toString() {
            return "Item{baseOffset=" + this.baseOffset + ", itemId=" + this.itemId + ", constructionMethod=" + this.constructionMethod + ", dataReferenceIndex=" + this.dataReferenceIndex + ", extents=" + this.extents + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    private static void ajc$preClinit() {
        kph bl_kph = new kph("ItemLocationBox.java", ItemLocationBox.class);
        ajc$tjp_0 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 119);
        ajc$tjp_1 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "offsetSize", Constants.STR_EMPTY, "void"), 123);
        ajc$tjp_10 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "createItem", "com.coremedia.iso.boxes.ItemLocationBox", "int:int:int:long:java.util.List", "itemId:constructionMethod:dataReferenceIndex:baseOffset:extents", Constants.STR_EMPTY, "com.coremedia.iso.boxes.ItemLocationBox$Item"), 160);
        ajc$tjp_11 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "createExtent", "com.coremedia.iso.boxes.ItemLocationBox", "long:long:long", "extentOffset:extentLength:extentIndex", Constants.STR_EMPTY, "com.coremedia.iso.boxes.ItemLocationBox$Extent"), 285);
        ajc$tjp_2 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 127);
        ajc$tjp_3 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setLengthSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "lengthSize", Constants.STR_EMPTY, "void"), 131);
        ajc$tjp_4 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 135);
        ajc$tjp_5 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setBaseOffsetSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "baseOffsetSize", Constants.STR_EMPTY, "void"), 139);
        ajc$tjp_6 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "int"), 143);
        ajc$tjp_7 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setIndexSize", "com.coremedia.iso.boxes.ItemLocationBox", "int", "indexSize", Constants.STR_EMPTY, "void"), 147);
        ajc$tjp_8 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "getItems", "com.coremedia.iso.boxes.ItemLocationBox", Constants.STR_EMPTY, Constants.STR_EMPTY, Constants.STR_EMPTY, "java.util.List"), 151);
        ajc$tjp_9 = bl_kph.a("method-execution", bl_kph.a(Constants.VIA_TO_TYPE_QQ_GROUP, "setItems", "com.coremedia.iso.boxes.ItemLocationBox", "java.util.List", "items", Constants.STR_EMPTY, "void"), 155);
    }

    public ItemLocationBox() {
        super(TYPE);
    }

    protected long getContentSize() {
        long j = 8;
        for (Item size : this.items) {
            j = ((long) size.getSize()) + j;
        }
        return j;
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        IsoTypeWriter.c(byteBuffer, (this.offsetSize << 4) | this.lengthSize);
        if (getVersion() == 1) {
            IsoTypeWriter.c(byteBuffer, (this.baseOffsetSize << 4) | this.indexSize);
        } else {
            IsoTypeWriter.c(byteBuffer, this.baseOffsetSize << 4);
        }
        IsoTypeWriter.b(byteBuffer, this.items.size());
        for (Item content : this.items) {
            content.getContent(byteBuffer);
        }
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.offsetSize = readUInt8 >>> 4;
        this.lengthSize = readUInt8 & 15;
        readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        this.baseOffsetSize = readUInt8 >>> 4;
        if (getVersion() == 1) {
            this.indexSize = readUInt8 & 15;
        }
        int readUInt16 = IsoTypeReader.readUInt16(byteBuffer);
        for (readUInt8 = 0; readUInt8 < readUInt16; readUInt8++) {
            this.items.add(new Item(byteBuffer));
        }
    }

    public int getOffsetSize() {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_0, this, this));
        return this.offsetSize;
    }

    public void setOffsetSize(int i) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_1, this, this, kpf.a(i)));
        this.offsetSize = i;
    }

    public int getLengthSize() {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_2, this, this));
        return this.lengthSize;
    }

    public void setLengthSize(int i) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_3, this, this, kpf.a(i)));
        this.lengthSize = i;
    }

    public int getBaseOffsetSize() {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_4, this, this));
        return this.baseOffsetSize;
    }

    public void setBaseOffsetSize(int i) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_5, this, this, kpf.a(i)));
        this.baseOffsetSize = i;
    }

    public int getIndexSize() {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_6, this, this));
        return this.indexSize;
    }

    public void setIndexSize(int i) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_7, this, this, kpf.a(i)));
        this.indexSize = i;
    }

    public List<Item> getItems() {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_8, this, this));
        return this.items;
    }

    public void setItems(List<Item> list) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_9, this, this, list));
        this.items = list;
    }

    public Item createItem(int i, int i2, int i3, long j, List<Extent> list) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_10, this, this, new Object[]{kpf.a(i), kpf.a(i2), kpf.a(i3), kpf.a(j), list}));
        return new Item(i, i2, i3, j, list);
    }

    Item createItem(ByteBuffer byteBuffer) {
        return new Item(byteBuffer);
    }

    public Extent createExtent(long j, long j2, long j3) {
        com.googlecode.mp4parser.b.a().a(kph.a(ajc$tjp_11, this, this, new Object[]{kpf.a(j), kpf.a(j2), kpf.a(j3)}));
        return new Extent(j, j2, j3);
    }

    Extent createExtent(ByteBuffer byteBuffer) {
        return new Extent(byteBuffer);
    }
}
