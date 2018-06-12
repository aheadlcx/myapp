package bili3.com.bilibili.bilibililive.im.protobuf;

import bl.hae;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.io.IOException;
import okio.ByteString;

/* compiled from: BL */
public final class ReqMsgSync extends Message<ReqMsgSync, Builder> {
    public static final ProtoAdapter<ReqMsgSync> ADAPTER = new ProtoAdapter_ReqMsgSync();
    public static final Long DEFAULT_CLIENT_SEQNO = Long.valueOf(0);
    public static final Integer DEFAULT_MSG_COUNT = Integer.valueOf(20);
    public static final Long DEFAULT_UID = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = Label.REQUIRED, tag = 1)
    public final Long client_seqno;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer msg_count;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 3)
    public final Long uid;

    /* compiled from: BL */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReqMsgSync, Builder> {
        public Long client_seqno;
        public Integer msg_count;
        public Long uid;

        public Builder client_seqno(Long l) {
            this.client_seqno = l;
            return this;
        }

        public Builder msg_count(Integer num) {
            this.msg_count = num;
            return this;
        }

        public Builder uid(Long l) {
            this.uid = l;
            return this;
        }

        public ReqMsgSync build() {
            if (this.client_seqno != null) {
                return new ReqMsgSync(this.client_seqno, this.msg_count, this.uid, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(this.client_seqno, hae.a(new byte[]{(byte) 102, (byte) 105, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 118, (byte) 96, (byte) 116, (byte) 107, (byte) 106}));
        }
    }

    /* compiled from: BL */
    static final class ProtoAdapter_ReqMsgSync extends ProtoAdapter<ReqMsgSync> {
        ProtoAdapter_ReqMsgSync() {
            super(FieldEncoding.LENGTH_DELIMITED, ReqMsgSync.class);
        }

        public int encodedSize(ReqMsgSync reqMsgSync) {
            int encodedSizeWithTag;
            int i = 0;
            int encodedSizeWithTag2 = ProtoAdapter.UINT64.encodedSizeWithTag(1, reqMsgSync.client_seqno);
            if (reqMsgSync.msg_count != null) {
                encodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(2, reqMsgSync.msg_count);
            } else {
                encodedSizeWithTag = 0;
            }
            encodedSizeWithTag += encodedSizeWithTag2;
            if (reqMsgSync.uid != null) {
                i = ProtoAdapter.UINT64.encodedSizeWithTag(3, reqMsgSync.uid);
            }
            return (encodedSizeWithTag + i) + reqMsgSync.unknownFields().h();
        }

        public void encode(ProtoWriter protoWriter, ReqMsgSync reqMsgSync) throws IOException {
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, reqMsgSync.client_seqno);
            if (reqMsgSync.msg_count != null) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, reqMsgSync.msg_count);
            }
            if (reqMsgSync.uid != null) {
                ProtoAdapter.UINT64.encodeWithTag(protoWriter, 3, reqMsgSync.uid);
            }
            protoWriter.writeBytes(reqMsgSync.unknownFields());
        }

        public ReqMsgSync decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                            builder.client_seqno((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                            builder.msg_count((Integer) ProtoAdapter.UINT32.decode(protoReader));
                            break;
                        case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                            builder.uid((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                }
                protoReader.endMessage(beginMessage);
                return builder.build();
            }
        }

        public ReqMsgSync redact(ReqMsgSync reqMsgSync) {
            Builder newBuilder = reqMsgSync.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public ReqMsgSync(Long l, Integer num, Long l2) {
        this(l, num, l2, ByteString.EMPTY);
    }

    public ReqMsgSync(Long l, Integer num, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.client_seqno = l;
        this.msg_count = num;
        this.uid = l2;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.client_seqno = this.client_seqno;
        builder.msg_count = this.msg_count;
        builder.uid = this.uid;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReqMsgSync)) {
            return false;
        }
        ReqMsgSync reqMsgSync = (ReqMsgSync) obj;
        if (unknownFields().equals(reqMsgSync.unknownFields()) && this.client_seqno.equals(reqMsgSync.client_seqno) && Internal.equals(this.msg_count, reqMsgSync.msg_count) && Internal.equals(this.uid, reqMsgSync.uid)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.client_seqno.hashCode()) * 37;
        if (this.msg_count != null) {
            i2 = this.msg_count.hashCode();
        } else {
            i2 = 0;
        }
        i2 = (i2 + hashCode) * 37;
        if (this.uid != null) {
            i = this.uid.hashCode();
        }
        i2 += i;
        this.hashCode = i2;
        return i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 102, (byte) 105, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 90, (byte) 118, (byte) 96, (byte) 116, (byte) 107, (byte) 106, (byte) 56})).append(this.client_seqno);
        if (this.msg_count != null) {
            stringBuilder.append(hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 104, (byte) 118, (byte) 98, (byte) 90, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 56})).append(this.msg_count);
        }
        if (this.uid != null) {
            stringBuilder.append(hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 112, (byte) 108, (byte) 97, (byte) 56})).append(this.uid);
        }
        return stringBuilder.replace(0, 2, hae.a(new byte[]{(byte) 87, (byte) 96, (byte) 116, (byte) 72, (byte) 118, (byte) 98, (byte) 86, (byte) 124, (byte) 107, (byte) 102, (byte) 126})).append('}').toString();
    }
}
