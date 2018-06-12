package bili3.com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.nio.ByteBuffer;

/* compiled from: BL */
public class c {
    static final /* synthetic */ boolean c = (!c.class.desiredAssertionStatus());
    int a;
    int b = 0;
    private ByteBuffer d;

    public c(ByteBuffer byteBuffer) {
        this.d = byteBuffer;
        this.a = byteBuffer.position();
    }

    public void a(boolean z) {
        a(z ? 1 : 0, 1);
    }

    public void a(int i, int i2) {
        if (c || i <= (1 << i2) - 1) {
            int i3;
            ByteBuffer byteBuffer;
            int i4;
            int i5 = 8 - (this.b % 8);
            if (i2 <= i5) {
                i3 = this.d.get(this.a + (this.b / 8));
                if (i3 < 0) {
                    i3 += 256;
                }
                i3 += i << (i5 - i2);
                byteBuffer = this.d;
                i4 = this.a + (this.b / 8);
                if (i3 > 127) {
                    i3 -= 256;
                }
                byteBuffer.put(i4, (byte) i3);
                this.b += i2;
            } else {
                i3 = i2 - i5;
                a(i >> i3, i5);
                a(((1 << i3) - 1) & i, i3);
            }
            byteBuffer = this.d;
            i4 = (this.b / 8) + this.a;
            if (this.b % 8 > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            byteBuffer.position(i3 + i4);
            return;
        }
        throw new AssertionError(String.format("Trying to write a value bigger (%s) than the number bits (%s) allows. Please mask the value before writing it and make your code is really working as intended.", new Object[]{Integer.valueOf(i), Integer.valueOf((1 << i2) - 1)}));
    }
}
