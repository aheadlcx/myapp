package bili2.bl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: BL */
class fna implements fmx {
    static final int[] a = new int[]{16843181, 16843182, 16843183, 16843184, 16842960};

    fna() {
    }

    public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws IOException, XmlPullParserException {
        Drawable a;
        int depth = xmlPullParser.getDepth() + 1;
        int i = 0;
        int i2 = 0;
        Object obj = new Drawable[2];
        Object obj2 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{2, a.length});
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                Object obj3;
                Object obj4;
                Drawable a2;
                if (i >= obj2.length) {
                    obj3 = (int[][]) Array.newInstance(Integer.TYPE, new int[]{obj.length + 1, a.length});
                    System.arraycopy(obj2, 0, obj3, 0, obj2.length);
                    obj4 = obj3;
                } else {
                    obj4 = obj2;
                }
                a(context, attributeSet, obj4[i]);
                i++;
                a = fmy.a(context, attributeSet, 16843161);
                if (a == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + hae.a(new byte[]{(byte) 63, (byte) 37, (byte) 57, (byte) 108, (byte) 113, (byte) 96, (byte) 104, (byte) 59, (byte) 37, (byte) 113, (byte) 100, (byte) 98, (byte) 37, (byte) 119, (byte) 96, (byte) 116, (byte) 112, (byte) 108, (byte) 119, (byte) 96, (byte) 118, (byte) 37, (byte) 100, (byte) 37, (byte) 34, (byte) 97, (byte) 119, (byte) 100, (byte) 114, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 34, (byte) 37, (byte) 100, (byte) 113, (byte) 113, (byte) 119, (byte) 108, (byte) 103, (byte) 112, (byte) 113, (byte) 96, (byte) 37, (byte) 106, (byte) 119, (byte) 37}) + hae.a(new byte[]{(byte) 102, (byte) 109, (byte) 108, (byte) 105, (byte) 97, (byte) 37, (byte) 113, (byte) 100, (byte) 98, (byte) 37, (byte) 97, (byte) 96, (byte) 99, (byte) 108, (byte) 107, (byte) 108, (byte) 107, (byte) 98, (byte) 37, (byte) 100, (byte) 37, (byte) 97, (byte) 119, (byte) 100, (byte) 114, (byte) 100, (byte) 103, (byte) 105, (byte) 96}));
                    }
                    a2 = fmy.a(context, xmlPullParser, attributeSet);
                } else {
                    ColorStateList b = fmy.b(context, attributeSet, 2130968788);
                    if (b != null) {
                        a2 = fnd.a(a, b, fmy.c(context, attributeSet, 2130968789));
                    } else {
                        a2 = a;
                    }
                }
                if (a2 != null) {
                    if (i2 >= obj.length) {
                        obj3 = new Drawable[(obj.length + 1)];
                        System.arraycopy(obj, 0, obj3, 0, obj.length);
                        obj = obj3;
                    }
                    obj[i2] = a2;
                    i2++;
                    obj3 = obj;
                } else {
                    obj3 = obj;
                }
                obj = obj3;
                obj2 = obj4;
            }
        }
        if (obj[0] == null || i2 != i) {
            return null;
        }
        a = new LayerDrawable(obj);
        for (depth2 = 0; depth2 < obj.length; depth2++) {
            int[] iArr = obj2[depth2];
            if (!(iArr[0] == 0 && iArr[1] == 0 && iArr[2] == 0 && iArr[3] == 0)) {
                a.setLayerInset(depth2, iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            if (iArr[4] != 0) {
                a.setId(depth2, iArr[4]);
            }
        }
        return a;
    }

    void a(Context context, AttributeSet attributeSet, int[] iArr) {
        iArr[0] = fmy.e(context, attributeSet, a[0]);
        iArr[1] = fmy.e(context, attributeSet, a[1]);
        iArr[2] = fmy.e(context, attributeSet, a[2]);
        iArr[3] = fmy.e(context, attributeSet, a[3]);
        iArr[4] = fmy.g(context, attributeSet, a[4], 0);
    }
}
