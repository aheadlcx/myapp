package bili2.bl;

import android.graphics.PointF;

/* compiled from: BL */
public class kvn {
    public static float a(PointF pointF, PointF pointF2, PointF pointF3) {
        if (pointF == null || pointF2 == null || pointF3 == null) {
            return 0.0f;
        }
        if (pointF2.equals(pointF3)) {
            return a(pointF, pointF2);
        }
        float f = pointF3.y - pointF2.y;
        float f2 = pointF2.x - pointF3.x;
        return (float) (((double) Math.abs(((pointF3.x * pointF2.y) - (pointF2.x * pointF3.y)) + ((pointF.x * f) + (pointF.y * f2)))) / Math.sqrt(Math.pow((double) f2, 2.0d) + Math.pow((double) f, 2.0d)));
    }

    public static float a(PointF pointF, PointF pointF2) {
        if (pointF == null || pointF2 == null || pointF.equals(pointF2)) {
            return 0.0f;
        }
        return (float) Math.sqrt(Math.pow((double) (pointF.x - pointF2.x), 2.0d) + Math.pow((double) (pointF.y - pointF2.y), 2.0d));
    }
}
