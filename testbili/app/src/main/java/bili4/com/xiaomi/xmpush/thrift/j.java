package bili4.com.xiaomi.xmpush.thrift;

import u.aly.dd;
import u.aly.q;

public enum j {
    Baidu(0),
    Tencent(1),
    AutoNavi(2),
    Google(3),
    GPS(4);
    
    private final int f;

    private j(int i) {
        this.f = i;
    }

    public static j a(int i) {
        switch (i) {
            case dd.a /*0*/:
                return Baidu;
            case q.a /*1*/:
                return Tencent;
            case dd.c /*2*/:
                return AutoNavi;
            case dd.d /*3*/:
                return Google;
            case dd.e /*4*/:
                return GPS;
            default:
                return null;
        }
    }

    public int a() {
        return this.f;
    }
}
