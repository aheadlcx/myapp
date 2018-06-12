package bili3.com.bilibili.bilibililive.im.protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;

/* compiled from: BL */
public enum RelationLogType implements WireEnum {
    EN_INVALID_LOG_TYPE(0),
    EN_ADD_FRIEND(1),
    EN_REMOVE_FRIEND(2),
    EN_JOIN_GROUP(3),
    EN_EXIT_GROUP(4);
    
    public static final ProtoAdapter<RelationLogType> ADAPTER = null;
    private final int value;

    static {
        ADAPTER = ProtoAdapter.newEnumAdapter(RelationLogType.class);
    }

    private RelationLogType(int i) {
        this.value = i;
    }

    public static RelationLogType fromValue(int i) {
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_GEO /*0*/:
                return EN_INVALID_LOG_TYPE;
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                return EN_ADD_FRIEND;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                return EN_REMOVE_FRIEND;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                return EN_JOIN_GROUP;
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                return EN_EXIT_GROUP;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
