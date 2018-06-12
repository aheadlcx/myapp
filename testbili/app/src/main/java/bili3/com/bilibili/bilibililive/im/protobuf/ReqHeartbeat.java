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
public final class ReqHeartbeat extends Message<ReqHeartbeat, Builder> {
    public static final ProtoAdapter<ReqHeartbeat> ADAPTER = new ProtoAdapter_ReqHeartbeat();
    public static final Integer DEFAULT_BACKGROUND = Integer.valueOf(0);
    public static final Long DEFAULT_MSG_SEQNO = Long.valueOf(0);
    public static final Long DEFAULT_OP_SEQNO = Long.valueOf(0);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer background;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = Label.REQUIRED, tag = 1)
    public final Long msg_seqno;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = Label.REQUIRED, tag = 2)
    public final Long op_seqno;

    /* compiled from: BL */
    public static final class Builder extends com.squareup.wire.Message.Builder<ReqHeartbeat, Builder> {
        public Integer background;
        public Long msg_seqno;
        public Long op_seqno;

        public Builder msg_seqno(Long l) {
            this.msg_seqno = l;
            return this;
        }

        public Builder op_seqno(Long l) {
            this.op_seqno = l;
            return this;
        }

        public Builder background(Integer num) {
            this.background = num;
            return this;
        }

        public ReqHeartbeat build() {
            if (this.msg_seqno != null && this.op_seqno != null) {
                return new ReqHeartbeat(this.msg_seqno, this.op_seqno, this.background, super.buildUnknownFields());
            }
            throw Internal.missingRequiredFields(this.msg_seqno, hae.a(new byte[]{(byte) 104, (byte) 118, (byte) 98, (byte) 90, (byte) 118, (byte) 96, (byte) 116, (byte) 107, (byte) 106}), this.op_seqno, hae.a(new byte[]{(byte) 106, (byte) 117, (byte) 90, (byte) 118, (byte) 96, (byte) 116, (byte) 107, (byte) 106}));
        }
    }

    /* compiled from: BL */
    static final class ProtoAdapter_ReqHeartbeat extends ProtoAdapter<ReqHeartbeat> {
        ProtoAdapter_ReqHeartbeat() {
            super(FieldEncoding.LENGTH_DELIMITED, ReqHeartbeat.class);
        }

        public int encodedSize(ReqHeartbeat reqHeartbeat) {
            return ((reqHeartbeat.background != null ? ProtoAdapter.INT32.encodedSizeWithTag(3, reqHeartbeat.background) : 0) + (ProtoAdapter.UINT64.encodedSizeWithTag(2, reqHeartbeat.op_seqno) + ProtoAdapter.UINT64.encodedSizeWithTag(1, reqHeartbeat.msg_seqno))) + reqHeartbeat.unknownFields().h();
        }

        public void encode(ProtoWriter protoWriter, ReqHeartbeat reqHeartbeat) throws IOException {
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 1, reqHeartbeat.msg_seqno);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 2, reqHeartbeat.op_seqno);
            if (reqHeartbeat.background != null) {
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, reqHeartbeat.background);
            }
            protoWriter.writeBytes(reqHeartbeat.unknownFields());
        }

        public ReqHeartbeat decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                            builder.msg_seqno((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                            builder.op_seqno((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                            builder.background((Integer) ProtoAdapter.INT32.decode(protoReader));
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

        public ReqHeartbeat redact(ReqHeartbeat reqHeartbeat) {
            Builder newBuilder = reqHeartbeat.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public ReqHeartbeat(Long l, Long l2, Integer num) {
        this(l, l2, num, ByteString.EMPTY);
    }

    public ReqHeartbeat(Long l, Long l2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_seqno = l;
        this.op_seqno = l2;
        this.background = num;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.msg_seqno = this.msg_seqno;
        builder.op_seqno = this.op_seqno;
        builder.background = this.background;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReqHeartbeat)) {
            return false;
        }
        ReqHeartbeat reqHeartbeat = (ReqHeartbeat) obj;
        if (unknownFields().equals(reqHeartbeat.unknownFields()) && this.msg_seqno.equals(reqHeartbeat.msg_seqno) && this.op_seqno.equals(reqHeartbeat.op_seqno) && Internal.equals(this.background, reqHeartbeat.background)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        i = (this.background != null ? this.background.hashCode() : 0) + (((((unknownFields().hashCode() * 37) + this.msg_seqno.hashCode()) * 37) + this.op_seqno.hashCode()) * 37);
        this.hashCode = i;
        return i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 104, (byte) 118, (byte) 98, (byte) 90, (byte) 118, (byte) 96, (byte) 116, (byte) 107, (byte) 106, (byte) 56})).append(this.msg_seqno);
        stringBuilder.append(hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 106, (byte) 117, (byte) 90, (byte) 118, (byte) 96, (byte) 116, (byte) 107, (byte) 106, (byte) 56})).append(this.op_seqno);
        if (this.background != null) {
            stringBuilder.append(hae.a(new byte[]{(byte) 41, (byte) 37, (byte) 103, (byte) 100, (byte) 102, (byte) 110, (byte) 98, (byte) 119, (byte) 106, (byte) 112, (byte) 107, (byte) 97, (byte) 56})).append(this.background);
        }
        return stringBuilder.replace(0, 2, hae.a(new byte[]{(byte) 87, (byte) 96, (byte) 116, (byte) 77, (byte) 96, (byte) 100, (byte) 119, (byte) 113, (byte) 103, (byte) 96, (byte) 100, (byte) 113, (byte) 126})).append('}').toString();
    }
}
