package bili3.com.bilibili.bilibililive.im.protobuf.conveyor;

import com.bilibili.bilibililive.im.protobuf.CmdId;
import com.bilibili.bilibililive.im.protobuf.ReqSyncAck;
import com.bilibili.bilibililive.im.protobuf.ReqSyncAck.Builder;
import com.bilibili.bilibililive.im.protobuf.RspSyncAck;
import com.squareup.wire.ProtoAdapter;

/* compiled from: BL */
public class SyncAckConveyor extends BasePBConveyor<ReqSyncAck, RspSyncAck> {
    ReqSyncAck req;

    public SyncAckConveyor(long j) {
        this.req = new Builder().client_seqno(Long.valueOf(j)).build();
    }

    protected CmdId getCmdId() {
        return CmdId.EN_CMD_ID_SYNC_ACK;
    }

    public ReqSyncAck getRequestMsg() {
        return this.req;
    }

    protected void onRecevie(RspSyncAck rspSyncAck) {
    }

    public void onFailed(int i) {
    }

    protected ProtoAdapter<RspSyncAck> getParser() {
        return RspSyncAck.ADAPTER;
    }

    public int getPriority() {
        return 1;
    }
}
