package bili3.com.bilibili.bangumi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import bl.bbx;
import bl.hae;
import com.bilibili.magicasakura.widgets.TintImageView;
import java.util.ArrayList;

/* compiled from: BL */
public class BangumiFilterLayout extends LinearLayout {
    private ArrayList<a> a = new ArrayList();
    private int b;
    private int c;
    private b d;

    /* compiled from: BL */
    public interface b {
        void a(int i, boolean z);
    }

    /* compiled from: BL */
    public static class a {
        public String a;
        public boolean b;
        public boolean c;
    }

    public BangumiFilterLayout(Context context) {
        super(context);
    }

    public BangumiFilterLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BangumiFilterLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setFilterData(ArrayList<a> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            throw new IllegalStateException(hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 105, (byte) 113, (byte) 96, (byte) 119, (byte) 76, (byte) 113, (byte) 96, (byte) 104, (byte) 118, (byte) 37, (byte) 102, (byte) 100, (byte) 107, (byte) 37, (byte) 107, (byte) 106, (byte) 113, (byte) 37, (byte) 103, (byte) 96, (byte) 37, (byte) 75, (byte) 80, (byte) 73, (byte) 73, (byte) 37, (byte) 106, (byte) 119, (byte) 37, (byte) 64, (byte) 72, (byte) 85, (byte) 81, (byte) 92, (byte) 37, (byte) 36}));
        }
        this.a.clear();
        this.a.addAll(arrayList);
        a();
    }

    public void a() {
        removeAllViews();
        this.b = this.a.size();
        for (int i = 0; i < this.b; i++) {
            View inflate = View.inflate(getContext(), 2131427543, null);
            inflate.setTag(Integer.valueOf(i));
            a(i, inflate);
        }
        b();
    }

    private void a(int i, View view) {
        TextView textView = (TextView) bbx.a(view, 2131297694);
        TintImageView tintImageView = (TintImageView) bbx.a(view, 2131296454);
        tintImageView = (TintImageView) bbx.a(view, 2131296449);
        view.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ BangumiFilterLayout a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                int intValue = ((Integer) view.getTag()).intValue();
                if (intValue == this.a.c) {
                    ((a) this.a.a.get(intValue)).b = !((a) this.a.a.get(intValue)).b;
                } else {
                    for (int i = 0; i < this.a.a.size(); i++) {
                        boolean z;
                        a aVar = (a) this.a.a.get(i);
                        if (intValue == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.c = z;
                        aVar = (a) this.a.a.get(i);
                        if (intValue == i) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.b = z;
                    }
                }
                this.a.b();
                if (this.a.d != null) {
                    this.a.d.a(intValue, ((a) this.a.a.get(intValue)).b);
                }
            }
        });
        addView(view, i, new LayoutParams(0, -1, 1.0f));
    }

    private void b() {
        for (int i = 0; i < this.b; i++) {
            View childAt = getChildAt(i);
            TextView textView = (TextView) bbx.a(childAt, 2131297694);
            TintImageView tintImageView = (TintImageView) bbx.a(childAt, 2131296454);
            TintImageView tintImageView2 = (TintImageView) bbx.a(childAt, 2131296449);
            textView.setText(((a) this.a.get(i)).a);
            if (((a) this.a.get(i)).c) {
                boolean z;
                this.c = i;
                textView.setSelected(true);
                if (((a) this.a.get(i)).b) {
                    z = false;
                } else {
                    z = true;
                }
                tintImageView.setSelected(z);
                tintImageView2.setSelected(((a) this.a.get(i)).b);
            } else {
                textView.setSelected(false);
                tintImageView.setSelected(false);
                tintImageView2.setSelected(false);
            }
        }
    }

    public void setOnFilterItemClickListener(b bVar) {
        this.d = bVar;
    }
}
