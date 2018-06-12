package bili3.bl;

import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.r;
import android.view.View;

/* compiled from: BL */
public class ok {
    public static int a(r rVar, oc ocVar, View view, View view2, LayoutManager layoutManager, boolean z, boolean z2) {
        if (layoutManager.y() == 0 || rVar.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max;
        int min = Math.min(layoutManager.d(view), layoutManager.d(view2));
        int max2 = Math.max(layoutManager.d(view), layoutManager.d(view2));
        if (z2) {
            max = Math.max(0, (rVar.e() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(ocVar.b(view2) - ocVar.a(view))) / ((float) (Math.abs(layoutManager.d(view) - layoutManager.d(view2)) + 1)))) + ((float) (ocVar.c() - ocVar.a(view))));
    }

    public static int a(r rVar, oc ocVar, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (layoutManager.y() == 0 || rVar.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(layoutManager.d(view) - layoutManager.d(view2)) + 1;
        }
        return Math.min(ocVar.f(), ocVar.b(view2) - ocVar.a(view));
    }

    public static int b(r rVar, oc ocVar, View view, View view2, LayoutManager layoutManager, boolean z) {
        if (layoutManager.y() == 0 || rVar.e() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return rVar.e();
        }
        return (int) ((((float) (ocVar.b(view2) - ocVar.a(view))) / ((float) (Math.abs(layoutManager.d(view) - layoutManager.d(view2)) + 1))) * ((float) rVar.e()));
    }
}
