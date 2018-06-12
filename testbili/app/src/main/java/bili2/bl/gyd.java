package bili2.bl;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;

/* compiled from: BL */
public class gyd {
    public static int a(RecyclerView recyclerView) {
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).o();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return -1;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
        int[] iArr = new int[staggeredGridLayoutManager.h()];
        staggeredGridLayoutManager.b(iArr);
        int length = iArr.length;
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < length) {
            int min = Math.min(i, iArr[i2]);
            i2++;
            i = min;
        }
        return i;
    }
}
