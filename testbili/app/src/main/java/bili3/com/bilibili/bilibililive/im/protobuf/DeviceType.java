package bili3.com.bilibili.bilibililive.im.protobuf;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;

/* compiled from: BL */
public enum DeviceType implements WireEnum {
    EN_DEV_TYPE_IOS(1),
    EN_DEV_TYPE_ANDROID(2),
    EN_DEV_TYPE_H5(3),
    EN_DEV_TYPE_PC(4);
    
    public static final ProtoAdapter<DeviceType> ADAPTER = null;
    private final int value;

    static {
        ADAPTER = ProtoAdapter.newEnumAdapter(DeviceType.class);
    }

    private DeviceType(int i) {
        this.value = i;
    }

    public static DeviceType fromValue(int i) {
        switch (i) {
            case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                return EN_DEV_TYPE_IOS;
            case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                return EN_DEV_TYPE_ANDROID;
            case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                return EN_DEV_TYPE_H5;
            case TencentLocationRequest.REQUEST_LEVEL_POI /*4*/:
                return EN_DEV_TYPE_PC;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
