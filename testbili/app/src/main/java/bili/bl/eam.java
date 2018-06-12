package bili.bl;

import android.support.annotation.DrawableRes;
import android.text.style.ImageSpan;
import com.bilibili.bilibililive.im.protobuf.conveyor.priority.PriorityID;
import com.bilibili.upper.videoup.model.TaskMessage;
import com.bilibili.upper.videoup.model.TaskStep;
import tv.danmaku.frontia.SyncPluginManager.Mode;
import tv.danmaku.videoplayer.basic.adapter.PlayerScreenMode;

/* compiled from: BL */
class eam {
    static ImageSpan a(String str) {
        int i = -1;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    i = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    i = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    i = 2;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    i = 3;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    i = 4;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    i = 5;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    i = 6;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    i = 7;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    i = 8;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    i = 9;
                    break;
                }
                break;
        }
        switch (i) {
            case PriorityID.PRIORITY_LOW /*0*/:
                return new ImageSpan(blg.a(), 2131233305, 1);
            case Mode.UPDATE /*1*/:
                return new ImageSpan(blg.a(), 2131233306, 1);
            case TaskStep.TASK_STEP_TWO /*2*/:
                return new ImageSpan(blg.a(), 2131233307, 1);
            case TaskStep.TASK_STEP_THREE /*3*/:
                return new ImageSpan(blg.a(), 2131233308, 1);
            case TaskStep.TASK_STEP_FOUR /*4*/:
                return new ImageSpan(blg.a(), 2131233309, 1);
            case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                return new ImageSpan(blg.a(), 2131233310, 1);
            case TaskMessage.UPLOAD_MSG_TASK_COMPLETE /*6*/:
                return new ImageSpan(blg.a(), 2131233311, 1);
            case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                return new ImageSpan(blg.a(), 2131233312, 1);
            case TaskMessage.UPLOAD_MSG_TASK_RESUME /*8*/:
                return new ImageSpan(blg.a(), 2131233313, 1);
            case TaskMessage.UPLOAD_MSG_TASK_START /*9*/:
                return new ImageSpan(blg.a(), 2131233314, 1);
            default:
                return null;
        }
    }

    @DrawableRes
    static int a(int i) {
        switch (i) {
            case Mode.UPDATE /*1*/:
                return 2131233342;
            case TaskStep.TASK_STEP_TWO /*2*/:
                return 2131233336;
            case TaskStep.TASK_STEP_THREE /*3*/:
                return 2131233334;
            default:
                return -1;
        }
    }

    static String a(eal bl_eal, PlayerScreenMode playerScreenMode) {
        if (bl_eal.j) {
            return hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 118, (byte) 112, (byte) 117, (byte) 96, (byte) 119, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
        }
        if (bl_eal.k <= 0) {
            return playerScreenMode == PlayerScreenMode.VERTICAL_THUMB ? hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 52, (byte) 90, (byte) 109, (byte) 100, (byte) 105, (byte) 99, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107}) : hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 52, (byte) 90, (byte) 99, (byte) 112, (byte) 105, (byte) 105, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
        } else {
            if (bl_eal.k == 1) {
                return hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 55, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
            }
            if (bl_eal.k == 2) {
                return hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 54, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
            }
            return hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 49, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
        }
    }

    static String a(eal bl_eal, PlayerScreenMode playerScreenMode, int i) {
        if (bl_eal.j) {
            return hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 124, (byte) 102, (byte) 105, (byte) 96, (byte) 90, (byte) 118, (byte) 112, (byte) 117, (byte) 96, (byte) 119, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
        }
        if (bl_eal.k <= 0) {
            return playerScreenMode == PlayerScreenMode.VERTICAL_THUMB ? hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 52, (byte) 90, (byte) 109, (byte) 100, (byte) 105, (byte) 99, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107}) : hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 100, (byte) 117, (byte) 117, (byte) 96, (byte) 100, (byte) 119, (byte) 90, (byte) 52, (byte) 90, (byte) 99, (byte) 112, (byte) 105, (byte) 105, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
        } else {
            if (bl_eal.k != 1) {
                return bl_eal.k == 2 ? i == bl_eal.k ? hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 124, (byte) 102, (byte) 105, (byte) 96, (byte) 90, (byte) 54, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107}) : hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 112, (byte) 117, (byte) 98, (byte) 119, (byte) 100, (byte) 97, (byte) 96, (byte) 90, (byte) 55, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 54, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107}) : i <= 2 ? hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 112, (byte) 117, (byte) 98, (byte) 119, (byte) 100, (byte) 97, (byte) 96, (byte) 90, (byte) 54, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 49, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107}) : hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 124, (byte) 102, (byte) 105, (byte) 96, (byte) 90, (byte) 49, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
            } else {
                if (i == bl_eal.k) {
                    return hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 119, (byte) 96, (byte) 102, (byte) 124, (byte) 102, (byte) 105, (byte) 96, (byte) 90, (byte) 55, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
                }
                return playerScreenMode == PlayerScreenMode.VERTICAL_THUMB ? hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 112, (byte) 117, (byte) 98, (byte) 119, (byte) 100, (byte) 97, (byte) 96, (byte) 90, (byte) 52, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 55, (byte) 90, (byte) 109, (byte) 100, (byte) 105, (byte) 99, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107}) : hae.a(new byte[]{(byte) 105, (byte) 108, (byte) 115, (byte) 96, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 117, (byte) 90, (byte) 112, (byte) 117, (byte) 98, (byte) 119, (byte) 100, (byte) 97, (byte) 96, (byte) 90, (byte) 52, (byte) 90, (byte) 113, (byte) 106, (byte) 90, (byte) 55, (byte) 90, (byte) 99, (byte) 112, (byte) 105, (byte) 105, (byte) 43, (byte) 111, (byte) 118, (byte) 106, (byte) 107});
            }
        }
    }
}
