package bili3.com.bilibili.bilibililive.im.protobuf.conveyor;

import com.bilibili.bilibililive.im.protobuf.CmdId;
import com.bilibili.bilibililive.im.protobuf.ReqSearch;
import com.bilibili.bilibililive.im.protobuf.RspSearch;
import com.squareup.wire.ProtoAdapter;

/* compiled from: BL */
public abstract class SearchConveyor extends BasePBConveyor<ReqSearch, RspSearch> {
    public ReqSearch getRequestMsg() {
        return null;
    }

    protected void onRecevie(RspSearch rspSearch) {
    }

    protected ProtoAdapter<RspSearch> getParser() {
        return RspSearch.ADAPTER;
    }

    protected CmdId getCmdId() {
        return null;
    }
}
