package bili.bl;

import com.bilibili.bilibililive.followingcard.widget.SingleGifView;

/* compiled from: BL */
public class cbc {
    public long a;
    public SingleGifView b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h = false;

    /* compiled from: BL */
    public static final class a {
        public SingleGifView a;
        public String b;
        public int c;
        public int d;
        public int e;
        private long f;
        private int g;
        private boolean h = false;

        public a a(long j) {
            this.f = j;
            return this;
        }

        public a a(SingleGifView singleGifView) {
            this.a = singleGifView;
            return this;
        }

        public a a(String str) {
            this.b = str;
            return this;
        }

        public a a(int i) {
            this.c = i;
            return this;
        }

        public a b(int i) {
            this.d = i;
            return this;
        }

        public a c(int i) {
            this.e = i;
            return this;
        }

        public a d(int i) {
            this.g = i;
            return this;
        }

        public a a(boolean z) {
            this.h = z;
            return this;
        }

        public cbc a() {
            return new cbc(this.f, this.a, this.b, this.c, this.d, this.e, this.h, this.g);
        }
    }

    public cbc(long j, SingleGifView singleGifView, String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = j;
        this.b = singleGifView;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.h = z;
        this.g = i4;
    }
}
