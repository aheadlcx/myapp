package bili2.bl;

import com.bilibili.playerdb.basic.IPlayerDBData;
import com.bilibili.playerdb.basic.PlayerDBEntity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class gyx<DATA extends IPlayerDBData> {
    public final List<PlayerDBEntity<DATA>> a = new ArrayList();

    public void a(PlayerDBEntity<DATA> playerDBEntity) {
        this.a.add(playerDBEntity);
    }

    public boolean a() {
        return this.a.isEmpty();
    }
}
