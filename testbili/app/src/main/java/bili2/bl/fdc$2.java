package bili2.bl;

import com.bilibili.lib.infoeyes.InfoEyesEvent;

/* compiled from: BL */
class fdc$2 implements Runnable {
    final /* synthetic */ InfoEyesEvent a;
    final /* synthetic */ fdc b;

    fdc$2(fdc bl_fdc, InfoEyesEvent infoEyesEvent) {
        this.b = bl_fdc;
        this.a = infoEyesEvent;
    }

    public void run() {
        fdc.a(this.b).a(new String[]{this.a.b()});
    }
}
