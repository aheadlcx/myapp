package bili.bl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.bilibili.bilibililive.im.protobuf.conveyor.priority.PriorityID;
import com.bilibili.upper.videoup.model.TaskMessage;
import com.bilibili.upper.videoup.model.TaskStep;
import tv.danmaku.frontia.SyncPluginManager.Mode;

/* compiled from: BL */
public class blj {
    private static final String a = hae.a(new byte[]{(byte) 70, (byte) 106, (byte) 107, (byte) 107, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124});
    private static final int[] b = new int[0];
    private static final int[] c = new int[]{2, 3, 4, 5};
    private static final a[] d = new a[]{new a(0, false, hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107}), 4), new a(1, false, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 52, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 22), new a(2, false, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 48, (byte) 53, (byte) 40, (byte) 52, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 22), new a(3, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 49, (byte) 53, (byte) 53, (byte) 40, (byte) 50, (byte) 53, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 32), new a(4, false, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 52, (byte) 49, (byte) 40, (byte) 51, (byte) 49, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 22), new a(5, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 49, (byte) 53, (byte) 53, (byte) 40, (byte) 52, (byte) 53, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 32), new a(6, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 51, (byte) 53, (byte) 53, (byte) 40, (byte) 52, (byte) 49, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 32), new a(7, false, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 48, (byte) 53, (byte) 37, (byte) 40, (byte) 37, (byte) 52, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 22), new a(8, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 55, (byte) 40, (byte) 52, (byte) 49, (byte) 37, (byte) 72, (byte) 103, (byte) 117, (byte) 118}), 32), new a(9, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 52, (byte) 40, (byte) 55, (byte) 54, (byte) 37, (byte) 72, (byte) 103, (byte) 117, (byte) 118}), 32), new a(10, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 50, (byte) 53, (byte) 53, (byte) 40, (byte) 52, (byte) 50, (byte) 53, (byte) 53, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 32), new a(11, false, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 55, (byte) 48, (byte) 37, (byte) 110, (byte) 103, (byte) 117, (byte) 118}), 22), new a(12, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 48, (byte) 37, (byte) 72, (byte) 103, (byte) 117, (byte) 118}), 32), new a(13, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 52, (byte) 53, (byte) 46, (byte) 37, (byte) 72, (byte) 103, (byte) 117, (byte) 118}), 42), new a(14, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 52, (byte) 40, (byte) 55, (byte) 37, (byte) 72, (byte) 103, (byte) 117, (byte) 118}), 32), new a(15, true, hae.a(new byte[]{(byte) 53, (byte) 37, (byte) 123, (byte) 37, (byte) 52, (byte) 53, (byte) 40, (byte) 55, (byte) 53, (byte) 37, (byte) 72, (byte) 103, (byte) 117, (byte) 118}), 32)};

    /* compiled from: BL */
    static class a {
        final int a;
        final boolean b;
        final String c;
        final int d;

        a(int i, boolean z, String str, int i2) {
            this.a = i;
            this.b = z;
            this.c = str;
            this.d = i2;
        }
    }

    public static NetworkInfo a(Context context, int i) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 107, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}));
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getNetworkInfo(i);
            } catch (Exception e) {
                return null;
            }
        }
        networkInfo = null;
        return networkInfo;
    }

    public static NetworkInfo a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 107, (byte) 107, (byte) 96, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}));
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static NetworkInfo b(Context context) {
        return a(context, 0, c);
    }

    public static boolean a(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean b(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnectedOrConnecting();
    }

    public static boolean c(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected() && 9 == networkInfo.getType();
    }

    public static boolean d(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected() && b(networkInfo.getType());
    }

    public static boolean e(NetworkInfo networkInfo) {
        return networkInfo != null && networkInfo.isConnected() && a(networkInfo.getType());
    }

    public static String a(int i, int i2) {
        switch (i) {
            case Mode.UPDATE /*1*/:
            case TaskMessage.UPLOAD_MSG_TASK_START /*9*/:
                return "Fast";
            default:
                if (i != 0) {
                    return hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});
                }
                for (a aVar : d) {
                    if (aVar.a == i2) {
                        return aVar.c;
                    }
                }
                return hae.a(new byte[]{(byte) 80, (byte) 107, (byte) 110, (byte) 107, (byte) 106, (byte) 114, (byte) 107});
        }
    }

    public static int b(int i, int i2) {
        switch (i) {
            case Mode.UPDATE /*1*/:
                return 1;
            case TaskMessage.UPLOAD_MSG_TASK_START /*9*/:
                return 5;
            default:
                if (i != 0) {
                    return 4;
                }
                for (a aVar : d) {
                    if (aVar.a == i2) {
                        return aVar.d;
                    }
                }
                return 4;
        }
    }

    private static boolean a(int i) {
        switch (i) {
            case PriorityID.PRIORITY_LOW /*0*/:
            case TaskStep.TASK_STEP_TWO /*2*/:
            case TaskStep.TASK_STEP_THREE /*3*/:
            case TaskStep.TASK_STEP_FOUR /*4*/:
            case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                return true;
            default:
                return false;
        }
    }

    private static boolean b(int i) {
        switch (i) {
            case Mode.UPDATE /*1*/:
                return true;
            default:
                return false;
        }
    }

    private static NetworkInfo a(Context context, int i, int[] iArr) {
        NetworkInfo a = a(context, i);
        if (a(a)) {
            return a;
        }
        for (int a2 : iArr) {
            NetworkInfo a3 = a(context, a2);
            if (a(a3)) {
                return a3;
            }
        }
        return a;
    }
}
