package bili2.bl;

import com.bilibili.lib.infoeyes.InfoEyesEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BL */
class fdc$3 implements Runnable {
    final /* synthetic */ fcy a;
    final /* synthetic */ fdc b;

    fdc$3(fdc bl_fdc, fcy bl_fcy) {
        this.b = bl_fdc;
        this.a = bl_fcy;
    }

    public void run() {
        if (this.a.d() != null && this.a.d().size() != 0) {
            Map hashMap = new HashMap((this.a.d().size() / 2) + 1);
            for (InfoEyesEvent b : this.a.d()) {
                String b2 = b.b();
                Integer num = (Integer) hashMap.get(b2);
                hashMap.put(b2, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
            }
            hashMap.put(hae.a(new byte[]{(byte) 90, (byte) 90, (byte) 70, (byte) 106, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 40, (byte) 73, (byte) 96, (byte) 107, (byte) 98, (byte) 113, (byte) 109, (byte) 90, (byte) 90}), Integer.valueOf(this.a.c()));
            fdc.a(this.b).a(this.a.b(), hashMap);
        }
    }
}
