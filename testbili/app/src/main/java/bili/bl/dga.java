package bili.bl;

import com.bilibili.bilibililive.im.protobuf.conveyor.priority.PriorityID;
import com.bilibili.upper.videoup.model.TaskStep;
import tv.danmaku.frontia.SyncPluginManager.Mode;

/* compiled from: BL */
public class dga {
    public static String a(String str) {
        int i = -1;
        switch (str.hashCode()) {
            case 98695:
                if (str.equals("cos")) {
                    i = 3;
                    break;
                }
                break;
            case 3091780:
                if (str.equals("draw")) {
                    i = 2;
                    break;
                }
                break;
            case 3530149:
                if (str.equals("sifu")) {
                    i = 4;
                    break;
                }
                break;
            case 94843483:
                if (str.equals(hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 108, (byte) 102}))) {
                    i = 1;
                    break;
                }
                break;
            case 95346201:
                if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 108, (byte) 105, (byte) 124}))) {
                    i = 5;
                    break;
                }
                break;
            case 891970896:
                if (str.equals(hae.a(new byte[]{(byte) 108, (byte) 105, (byte) 105, (byte) 112, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}))) {
                    i = 0;
                    break;
                }
                break;
        }
        switch (i) {
            case PriorityID.PRIORITY_LOW /*0*/:
                return hae.a(new byte[]{(byte) 108, (byte) 105, (byte) 105, (byte) 112, (byte) 118, (byte) 113, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107});
            case Mode.UPDATE /*1*/:
                return hae.a(new byte[]{(byte) 102, (byte) 106, (byte) 104, (byte) 108, (byte) 102});
            case TaskStep.TASK_STEP_TWO /*2*/:
                return hae.a(new byte[]{(byte) 106, (byte) 113, (byte) 109, (byte) 96, (byte) 119});
            case TaskStep.TASK_STEP_THREE /*3*/:
                return "cos";
            case TaskStep.TASK_STEP_FOUR /*4*/:
                return "sifu";
            case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                return hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 108, (byte) 105, (byte) 124});
            default:
                return str;
        }
    }
}
