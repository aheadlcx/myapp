package bili3.com.bilibili.music.app.domain.menus;

import android.support.annotation.Keep;
import com.bilibili.music.app.domain.menus.MenuCategory.MenuSubCategory;
import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class MenuInfo {
    public String coverUrl;
    public String intro;
    public boolean isOff;
    public String mbnames;
    public int menuAttr;
    public long menuId;
    public String originalWorks;
    public long pubTime;
    public String publisher;
    public List<MenuSubCategory> tags = new ArrayList();
    public String title;
    public int type;
    public int uid;
    public String uname;
}
