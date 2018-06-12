package bili2.bl;

import android.content.Intent;
import android.os.Bundle;
import com.bilibili.boxing.model.config.PickerConfig;
import com.bilibili.boxing.model.config.PickerConfig.Mode;
import tv.danmaku.bili.ui.newpicker.PickerActivity;

/* compiled from: BL */
public class lli implements fit<Intent> {
    public /* synthetic */ Object b(fjg bl_fjg) {
        return a(bl_fjg);
    }

    public Intent a(fjg bl_fjg) {
        return eks.a(new PickerConfig(a(bl_fjg.b))).a(bl_fjg.c, PickerActivity.class).b();
    }

    private Mode a(Bundle bundle) {
        int i = bundle.getInt("mode", Mode.SINGLE_IMG.ordinal());
        if (i == Mode.VIDEO.ordinal()) {
            return Mode.VIDEO;
        }
        if (i == Mode.MULTI_IMG.ordinal()) {
            return Mode.MULTI_IMG;
        }
        return Mode.SINGLE_IMG;
    }
}
