package bili3.com.bilibili.bililive.videoliveplayer.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import bl.ecc;
import bl.ege;
import com.bilibili.magicasakura.widgets.TintTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: BL */
public class MultiSelectTagsView extends ege {
    private int b;
    private int c;
    private int d;
    private boolean e;
    private ImageView f;
    private a g;
    private c h;
    private OnClickListener i;

    /* compiled from: BL */
    public static abstract class a<T> extends BaseAdapter {
        private List<T> a;

        public abstract boolean a(T t);

        public abstract boolean b(T t);

        public abstract CharSequence c(T t);

        public /* synthetic */ Object getItem(int i) {
            return a(i);
        }

        public a(List<T> list) {
            if (list == null || list.isEmpty()) {
                this.a = new ArrayList();
            } else {
                this.a = list;
            }
        }

        public int getCount() {
            return this.a.size();
        }

        public CharSequence a(int i) {
            return c(this.a.get(i));
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return a(i, viewGroup);
        }

        public TextView a(int i, ViewGroup viewGroup) {
            TextView tintTextView = new TintTextView(viewGroup.getContext());
            tintTextView.setText(a(i));
            if (b(this.a.get(i))) {
                Drawable drawable = viewGroup.getContext().getResources().getDrawable(2131233163);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                tintTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
                tintTextView.setCompoundDrawablePadding(ecc.f);
            } else {
                tintTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            tintTextView.setSelected(a(this.a.get(i)));
            return tintTextView;
        }
    }

    /* compiled from: BL */
    public interface b extends OnClickListener {
    }

    /* compiled from: BL */
    public interface c {
        void a(View view, Object obj, boolean z);
    }

    /* compiled from: BL */
    class d extends bl.ege.b {
        final /* synthetic */ MultiSelectTagsView k;

        d(MultiSelectTagsView multiSelectTagsView) {
            this.k = multiSelectTagsView;
            super(multiSelectTagsView);
        }

        void a(int i, View view) {
            bl.ege.a aVar = (bl.ege.a) view.getLayoutParams();
            b(i, view);
            this.c = this.e + aVar.d();
            this.e = (this.c + aVar.g()) + this.k.getSpacing();
            this.f = Math.max(this.f, aVar.e() + aVar.h());
            this.d = Math.max(this.d, aVar.e());
        }

        boolean b(View view) {
            if (this.k.f != null && this.k.f == view) {
                return true;
            }
            int measuredWidth;
            if (this.k.getOrientation() == 0) {
                measuredWidth = view.getMeasuredWidth();
            } else {
                measuredWidth = view.getMeasuredHeight();
            }
            return measuredWidth + this.e <= this.b;
        }

        protected void f() {
            int i = 0;
            if (this.k.f == null) {
                super.f();
                return;
            }
            for (int i2 = 0; i2 < this.i - 1; i2++) {
                if (this.a[i2] == this.k.f) {
                    View view = this.a[i2 + 1];
                    this.a[i2 + 1] = this.k.f;
                    this.a[i2] = view;
                }
            }
            int i3 = this.d;
            int i4 = 0;
            while (i < this.i) {
                bl.ege.a aVar = (bl.ege.a) this.a[i].getLayoutParams();
                i3 = Math.max(this.d, aVar.e());
                aVar.a(i4);
                i++;
                i4 = ((aVar.g() + aVar.d()) + this.k.getSpacing()) + i4;
            }
            ((bl.ege.a) this.k.f.getLayoutParams()).c(i3);
        }
    }

    public MultiSelectTagsView(Context context) {
        this(context, null);
    }

    public MultiSelectTagsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiSelectTagsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.i = new OnClickListener(this) {
            final /* synthetic */ MultiSelectTagsView a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                Object tag = view.getTag(1593835521);
                boolean isSelected = view.isSelected();
                if (this.a.h != null) {
                    this.a.h.a(view, tag, isSelected);
                }
            }
        };
        setGravity(119);
        setWeightDefault(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.D);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        this.c = obtainStyledAttributes.getResourceId(2, 2131755554);
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            this.f = new ImageView(context);
            this.f.setImageResource(resourceId);
            this.f.setClickable(true);
            this.f.setPadding(getSpacing() / 2, 0, getSpacing() / 2, 0);
            this.f.setScaleType(ScaleType.CENTER_INSIDE);
            bl.ege.a a = a();
            a.c = 0.0f;
            addViewInLayout(this.f, 0, a, true);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < this.a.size(); i5++) {
            bl.ege.b bVar = (bl.ege.b) this.a.get(i5);
            for (int i6 = 0; i6 < bVar.i; i6++) {
                View view = bVar.a[i6];
                bl.ege.a aVar = (bl.ege.a) view.getLayoutParams();
                view.layout(aVar.d + aVar.leftMargin, aVar.e + aVar.topMargin, (aVar.d + aVar.leftMargin) + view.getMeasuredWidth(), (aVar.topMargin + aVar.e) + view.getMeasuredHeight());
            }
        }
    }

    protected bl.ege.b a(int i, int i2) {
        if (i != 0 || this.f == null) {
            return super.a(i, i2);
        }
        d dVar;
        if (this.a.isEmpty()) {
            dVar = new d(this);
            this.a.add(dVar);
        } else {
            dVar = (d) this.a.get(i);
            dVar.e();
        }
        dVar.b = i2;
        return dVar;
    }

    public void setOnCollapseClickListener(b bVar) {
        if (this.f != null) {
            this.f.setOnClickListener(bVar);
        }
    }

    void c(int i, int i2) {
        if (i2 > this.a.size()) {
            i2 = this.a.size();
        }
        ListIterator listIterator = this.a.listIterator();
        while (i < i2 && listIterator.hasNext()) {
            ((bl.ege.b) listIterator.next()).e();
            listIterator.remove();
            i++;
        }
    }

    public void setTagsAdapter(a aVar) {
        int i = 0;
        if (this.g != aVar) {
            if (this.g != null) {
                if (this.f == null) {
                    removeAllViewsInLayout();
                } else {
                    removeViewsInLayout(1, getChildCount() - 1);
                }
            }
            if (aVar == null) {
                if (this.f == null) {
                    c(0, this.a.size());
                } else {
                    c(1, this.a.size());
                }
                this.g = null;
            } else {
                this.g = aVar;
                while (i < aVar.getCount()) {
                    View a = aVar.a(i, this);
                    a.setTag(1593835520, Integer.valueOf(i));
                    a.setTag(1593835521, aVar.a.get(i));
                    a.setOnClickListener(this.i);
                    a.setGravity(17);
                    if (this.c != 0) {
                        a.setTextAppearance(getContext(), this.c);
                    }
                    if (this.b != 0) {
                        a.setBackgroundResource(this.b);
                    }
                    if (this.d != 0) {
                        a.setTextColor(this.d);
                    }
                    addViewInLayout(a, -1, a(), true);
                    i++;
                }
            }
            requestLayout();
            invalidate();
        }
    }

    public void setTagBackground(@DrawableRes int i) {
        this.b = i;
    }

    public void setTextColor(int i) {
        this.d = i;
    }

    public void setOnTagSelectedListener(c cVar) {
        this.h = cVar;
    }

    public Drawable getCollapseIcon() {
        return this.f.getDrawable();
    }

    public ImageView getCollapseView() {
        return this.f;
    }

    public void setTagSelectable(boolean z) {
        this.e = z;
    }
}
