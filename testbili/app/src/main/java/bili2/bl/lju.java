package bili2.bl;

import android.content.Context;
import com.bilibili.api.BiliApiException;
import com.bilibili.okretro.BiliApiParseException;
import java.io.IOException;
import tv.danmaku.bili.ui.main2.api.AccountMine;

/* compiled from: BL */
public class lju {
    private static ljv a;

    public static AccountMine a(Context context) throws IOException, BiliApiParseException, BiliApiException {
        return (AccountMine) gnt.b(a().getMine(eva.a(context).j()).g());
    }

    private static ljv a() {
        if (a == null) {
            a = (ljv) gnd.a(ljv.class);
        }
        return a;
    }
}
