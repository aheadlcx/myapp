package bili.bl;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;

/* compiled from: BL */
public abstract class clv extends clt {
    private boolean a = true;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
    }

    protected void onResume() {
        super.onResume();
        aa();
    }

    public void aa() {
        if (!ab() || !this.a) {
            getWindow().setFlags(1024, 1024);
        } else if (this.a) {
            h();
        }
    }

    @TargetApi(19)
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (ab() && z && this.a) {
            h();
        }
    }

    @TargetApi(19)
    private void h() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
        Window window = getWindow();
        window.setFlags(67108864, 67108864);
        window.setFlags(134217728, 134217728);
    }

    public boolean ab() {
        return VERSION.SDK_INT >= 19;
    }
}
