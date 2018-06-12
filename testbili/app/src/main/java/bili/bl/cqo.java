package bili.bl;

import android.util.Log;
import bl.cqq.a;
import com.bilibili.bilibililive.videoclip.ui.videoimport.mediaplayer.MediaPlayer.SeekMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class cqo {
    private static final String a = cqo.class.getSimpleName();
    private List<cqq> b = new ArrayList();
    private cqr c;
    private cqp d;

    public void a(cqq bl_cqq) {
        this.b.add(bl_cqq);
        if (bl_cqq instanceof cqr) {
            this.c = (cqr) bl_cqq;
        } else if (bl_cqq instanceof cqp) {
            this.d = (cqp) bl_cqq;
        }
    }

    public List<cqq> a() {
        return this.b;
    }

    public cqr b() {
        return this.c;
    }

    public a a(boolean z) {
        boolean z2 = false;
        while (!z2) {
            a aVar = null;
            int i = 0;
            for (cqq bl_cqq : this.b) {
                a h;
                int i2;
                while (true) {
                    h = bl_cqq.h();
                    if (h == null) {
                        break;
                    } else if (bl_cqq == this.c) {
                        break;
                    } else {
                        bl_cqq.a(h, 0);
                    }
                }
                h = aVar;
                do {
                } while (bl_cqq.a(false));
                if (bl_cqq.d()) {
                    i2 = i + 1;
                } else {
                    i2 = i;
                }
                aVar = h;
                i = i2;
            }
            if (aVar != null) {
                return aVar;
            }
            if (!z) {
                return null;
            }
            z2 = i == this.b.size();
        }
        Log.d(a, hae.a(new byte[]{(byte) 64, (byte) 74, (byte) 86, (byte) 37, (byte) 75, (byte) 80, (byte) 73, (byte) 73}));
        return null;
    }

    public void c() {
        for (cqq n : this.b) {
            try {
                n.n();
            } catch (Throwable e) {
                Log.e(a, hae.a(new byte[]{(byte) 119, (byte) 96, (byte) 105, (byte) 96, (byte) 100, (byte) 118, (byte) 96, (byte) 37, (byte) 99, (byte) 100, (byte) 108, (byte) 105, (byte) 96, (byte) 97}), e);
            }
        }
        this.b.clear();
    }

    public void a(SeekMode seekMode, long j) throws IOException {
        for (cqq a : this.b) {
            a.a(seekMode, j);
        }
    }

    public void d() {
        for (cqq l : this.b) {
            l.l();
        }
    }

    public void e() {
        for (cqq m : this.b) {
            m.m();
        }
    }

    public long f() {
        long j = Long.MAX_VALUE;
        for (cqq i : this.b) {
            long i2 = i.i();
            if (i2 == Long.MIN_VALUE || j <= i2) {
                i2 = j;
            }
            j = i2;
        }
        return j;
    }

    public boolean g() {
        int i = 0;
        for (cqq d : this.b) {
            int i2;
            if (d.d()) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            i = i2;
        }
        if (i == this.b.size()) {
            return true;
        }
        return false;
    }

    public long h() {
        long j = Long.MAX_VALUE;
        for (cqq j2 : this.b) {
            j = Math.min(j2.j(), j);
        }
        if (j == Long.MAX_VALUE) {
            return -1;
        }
        return j;
    }

    public boolean i() {
        for (cqq k : this.b) {
            if (!k.k()) {
                return false;
            }
        }
        return true;
    }
}
