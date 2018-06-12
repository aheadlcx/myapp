package bili3.com.bilibili.music.app.domain.favorite;

import android.support.annotation.Keep;
import java.util.List;

@Keep
/* compiled from: BL */
public class FavoriteFolderListPage {
    public List<FavoriteFolder> list;
    public int pageNum;
    public int pageSize;
    public int pages;
    public int size;
    public int total;

    public FavoriteFolder MyFavoriteListInstance() {
        return new FavoriteFolder();
    }
}
