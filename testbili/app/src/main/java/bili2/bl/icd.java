package bili2.bl;

import com.google.zxing.NotFoundException;

/* compiled from: BL */
public final class icd extends icg {
    public ica a(ica bl_ica, int i, int i2, ici bl_ici) throws NotFoundException {
        if (i <= 0 || i2 <= 0) {
            throw NotFoundException.a();
        }
        ica bl_ica2 = new ica(i, i2);
        float[] fArr = new float[(i << 1)];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4;
            int length = fArr.length;
            float f = ((float) i3) + 0.5f;
            for (i4 = 0; i4 < length; i4 += 2) {
                fArr[i4] = ((float) (i4 >> 1)) + 0.5f;
                fArr[i4 + 1] = f;
            }
            bl_ici.a(fArr);
            icg.a(bl_ica, fArr);
            i4 = 0;
            while (i4 < length) {
                try {
                    if (bl_ica.a((int) fArr[i4], (int) fArr[i4 + 1])) {
                        bl_ica2.b(i4 >> 1, i3);
                    }
                    i4 += 2;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw NotFoundException.a();
                }
            }
        }
        return bl_ica2;
    }
}
