package bili.tv.danmaku.bili.report.startup;

import android.util.Pair;
import bl.fcz;
import bl.fdh;
import bl.hae;
import bl.ktx;
import bl.kvi.a;
import bl.zy;
import java.util.Stack;

/* compiled from: BL */
public enum TrackType {
    STARTUP(hae.a(new byte[]{(byte) 86, (byte) 113, (byte) 100, (byte) 119, (byte) 113, (byte) 80, (byte) 117})) {
        boolean a() {
            return ktx.a().f().indexOf(58) == -1 && ktx.a().d();
        }
    },
    VIDEODETAIL(hae.a(new byte[]{(byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 65, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105, (byte) 118})) {
        boolean a() {
            return ktx.a().f().indexOf(58) == -1;
        }
    };
    
    public String name;

    public abstract boolean a();

    private TrackType(String str) {
        this.name = str;
    }

    public String b() {
        return hae.a(new byte[]{(byte) 81, (byte) 108, (byte) 104, (byte) 96, (byte) 73, (byte) 106, (byte) 98, (byte) 40}) + this.name + hae.a(new byte[]{(byte) 43, (byte) 113, (byte) 119, (byte) 100, (byte) 102, (byte) 96});
    }

    public void a(a aVar) {
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(currentTimeMillis);
        Pair[] pairArr = new Pair[aVar.e.size()];
        Stack stack = aVar.e;
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            a aVar2 = (a) stack.get(i);
            pairArr[i] = Pair.create(fdh.a(currentTimeMillis), new String[]{"type", this.name, hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 118, (byte) 118, (byte) 108, (byte) 106, (byte) 107, (byte) 90, (byte) 108, (byte) 97}), valueOf, hae.a(new byte[]{(byte) 118, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), aVar2.a, "time", String.valueOf(aVar2.c), hae.a(new byte[]{(byte) 102, (byte) 119, (byte) 100, (byte) 118, (byte) 109}), String.valueOf(aVar.d), hae.a(new byte[]{(byte) 97, (byte) 96, (byte) 113, (byte) 100, (byte) 108, (byte) 105}), zy.a(aVar2.e)});
        }
        fcz.a().a(true, hae.a(new byte[]{(byte) 100, (byte) 117, (byte) 117, (byte) 90, (byte) 118, (byte) 117, (byte) 100, (byte) 107, (byte) 90, (byte) 113, (byte) 108, (byte) 104, (byte) 96}), pairArr);
    }
}
