package bili.bl;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.u;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public abstract class ckg<I> extends a<u> {
    public static int[] a = new int[]{0, 2131233746, 2131233747, 2131233748, 2131233749, 2131233750, 2131233751, 2131233745};
    protected List<I> b = new ArrayList();

    protected abstract u a(ViewGroup viewGroup);

    protected abstract void a(I i, u uVar);

    protected abstract void a(I i, ImageView imageView, TextView textView, TextView textView2);

    public int b(int i) {
        return i == 0 ? 1 : 2;
    }

    public final int a() {
        int size = this.b.size();
        if (size == 0) {
            return 0;
        }
        if (size <= 3) {
            return 1;
        }
        return size - 2;
    }

    public final void a(u uVar, int i) {
        if (b(i) == 1) {
            ((cjz) uVar).a(this.b);
        } else {
            a(c(i), uVar);
        }
    }

    public final u b(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new cjz<I>(this, viewGroup) {
                final /* synthetic */ ckg n;

                protected void a(I i, ImageView imageView, TextView textView, TextView textView2) {
                    this.n.a(i, imageView, textView, textView2);
                    textView2.setCompoundDrawablePadding(coa.a(textView2.getContext(), 3.0f));
                }
            };
        }
        return a(viewGroup);
    }

    protected final I c(int i) {
        return this.b.get(i + 2);
    }
}
