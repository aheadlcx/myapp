package bili2.bl;

import com.xiaomi.channel.commonutils.misc.h;
import com.xiaomi.channel.commonutils.misc.h.a;
import com.xiaomi.channel.commonutils.misc.h.b;

public class iwh extends b {
    final /* synthetic */ String b;
    final /* synthetic */ h c;

    public iwh(h hVar, a aVar, String str) {
        this.c = hVar;
        this.b = str;
        super(aVar);
    }

    void a() {
        super.a();
    }

    void b() {
        h.a(this.c).edit().putLong(this.b, System.currentTimeMillis()).commit();
    }
}
