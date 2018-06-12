package bili2.bl;

/* compiled from: BL */
public final class iaa {
    public static boolean a(int i, int i2, hvo bl_hvo) {
        if (bl_hvo == null) {
            if (((float) a(i)) < 2048.0f || a(i2) < 2048) {
                return false;
            }
            return true;
        } else if (a(i) < bl_hvo.a || a(i2) < bl_hvo.b) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(hws bl_hws, hvo bl_hvo) {
        if (bl_hws == null) {
            return false;
        }
        switch (bl_hws.f()) {
            case 90:
            case 270:
                return a(bl_hws.i(), bl_hws.h(), bl_hvo);
            default:
                return a(bl_hws.h(), bl_hws.i(), bl_hvo);
        }
    }

    public static int a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }
}
