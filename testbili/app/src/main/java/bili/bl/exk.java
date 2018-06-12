package bili.bl;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.bilibili.lib.bilipay.domain.bean.recharge.RechargeUserDefineInfo;
import com.bilibili.lib.bilipay.ui.recharge.RechargeBpayActivity;

public final /* synthetic */ class exk implements OnFocusChangeListener {
    private final RechargeBpayActivity a;
    private final RechargeUserDefineInfo b;

    public exk(RechargeBpayActivity rechargeBpayActivity, RechargeUserDefineInfo rechargeUserDefineInfo) {
        this.a = rechargeBpayActivity;
        this.b = rechargeUserDefineInfo;
    }

    public void onFocusChange(View view, boolean z) {
        this.a.a(this.b, view, z);
    }
}
