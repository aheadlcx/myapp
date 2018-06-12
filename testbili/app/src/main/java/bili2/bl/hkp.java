package bili2.bl;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;

/* compiled from: BL */
public class hkp extends Thread {
    private static final String a = hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 70, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119});
    private BlockingQueue<hkn> b;
    private volatile boolean c;
    private volatile boolean d;

    public hkp(BlockingQueue<hkn> blockingQueue) {
        super(hae.a(new byte[]{(byte) 115, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 40, (byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 40, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119}));
        this.b = blockingQueue;
        hlg.c(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 70, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119, (byte) 37, (byte) 102, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96}));
    }

    public boolean a() {
        return (this.b == null || this.b.size() != 0 || this.d) ? false : true;
    }

    public void a(Collection<hkn> collection) {
        this.b.addAll(collection);
    }

    public void b() {
        hlg.c(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 70, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119, (byte) 37, (byte) 116, (byte) 112, (byte) 108, (byte) 113}));
        this.c = true;
        this.b.clear();
        if (!isInterrupted()) {
            interrupt();
        }
    }

    public void run() {
        while (!this.c) {
            try {
                hkn bl_hkn = (hkn) this.b.take();
                this.d = true;
                bl_hkn.c();
                this.d = false;
                hlg.b(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 70, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119, (byte) 37, (byte) 97, (byte) 96, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 124, (byte) 63, (byte) 37, (byte) 32, (byte) 118}), bl_hkn.e());
            } catch (InterruptedException e) {
                hlg.d(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 96, (byte) 119, (byte) 70, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119}), hae.a(new byte[]{(byte) 97, (byte) 106, (byte) 114, (byte) 107, (byte) 105, (byte) 106, (byte) 100, (byte) 97, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 107, (byte) 96, (byte) 119, (byte) 37, (byte) 97, (byte) 96, (byte) 118, (byte) 113, (byte) 119, (byte) 106, (byte) 124, (byte) 37, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 119, (byte) 119, (byte) 112, (byte) 117, (byte) 113}));
                if (this.c) {
                    return;
                }
            }
        }
    }
}
