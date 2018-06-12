package bili4.tv.danmaku.bili.ui.search.api;

import android.support.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

@Keep
/* compiled from: BL */
public class SearchEasterEggItem implements Serializable {
    private static final long serialVersionUID = 9849461564894L;
    @JSONField(name = "hash")
    public String hash;
    @JSONField(name = "sid")
    public int id;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "size")
    public long size;
    @JSONField(name = "type")
    public String type;
    @JSONField(name = "url")
    public String url;

    public boolean equals(Object obj) {
        if ((obj instanceof SearchEasterEggItem) && this.id == ((SearchEasterEggItem) obj).id && this.name.equals(((SearchEasterEggItem) obj).name) && this.type.equals(((SearchEasterEggItem) obj).type) && this.url.equals(((SearchEasterEggItem) obj).url) && this.hash.equals(((SearchEasterEggItem) obj).hash) && this.size == ((SearchEasterEggItem) obj).size) {
            return true;
        }
        return false;
    }
}
