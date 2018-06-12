package bili.bl;

import com.bilibili.bangumi.widget.PriorityLinearLayout;
import java.util.Comparator;

public final /* synthetic */ class bkq implements Comparator {
    public static final Comparator a = new bkq();

    private bkq() {
    }

    public int compare(Object obj, Object obj2) {
        return PriorityLinearLayout.a((Integer) obj, (Integer) obj2);
    }
}
