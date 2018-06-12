package bili2.bl;

import com.bilibili.music.app.domain.menus.MenuInfo;
import java.util.List;
import rx.functions.Func2;

final /* synthetic */ class gin implements Func2 {
    private final gil a;

    gin(gil bl_gil) {
        this.a = bl_gil;
    }

    public Object call(Object obj, Object obj2) {
        return this.a.a((MenuInfo) obj, (List) obj2);
    }
}
