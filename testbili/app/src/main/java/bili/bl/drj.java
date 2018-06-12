package bili.bl;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: BL */
public abstract class drj extends drn {
    private ksp a = new ksp();

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!a()) {
            return;
        }
        if (activity instanceof ksq) {
            this.a.a((ksq) activity);
            return;
        }
        throw new IllegalArgumentException(hae.a(new byte[]{(byte) 72, (byte) 100, (byte) 110, (byte) 96, (byte) 37, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124, (byte) 37}) + activity.getClass().getName() + hae.a(new byte[]{(byte) 37, (byte) 108, (byte) 104, (byte) 117, (byte) 105, (byte) 96, (byte) 104, (byte) 96, (byte) 107, (byte) 113, (byte) 118, (byte) 37, (byte) 64, (byte) 115, (byte) 96, (byte) 107, (byte) 113, (byte) 71, (byte) 112, (byte) 118, (byte) 77, (byte) 106, (byte) 118, (byte) 113}));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (a()) {
            this.a.a(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (a()) {
            ksp.a(this.a);
        }
    }

    public void onDetach() {
        if (a()) {
            ksp.a(this.a);
        }
        super.onDetach();
    }

    protected boolean a() {
        return true;
    }

    public ksp b() {
        return this.a;
    }
}
