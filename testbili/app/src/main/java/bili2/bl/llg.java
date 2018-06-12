package bili2.bl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bilibili.boxing.model.config.PickerConfig;
import com.bilibili.boxing.model.config.PickerConfig.Mode;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import java.util.ArrayList;
import java.util.List;
import tv.danmaku.bili.ui.newpicker.MediaItemLayout;

/* compiled from: BL */
public class llg extends android.support.v7.widget.RecyclerView.a {
    private List<BaseMedia> a = new ArrayList();
    private List<BaseMedia> b = new ArrayList();
    private LayoutInflater c;
    private PickerConfig d = ekx.a().b();
    private int e;
    private boolean f;
    private OnClickListener g;
    private OnClickListener h;
    private b i;
    private c j;
    private Drawable k;

    /* compiled from: BL */
    public static class a extends u {
        View n;

        public a(View view) {
            super(view);
            this.n = view.findViewById(2131296797);
        }
    }

    /* compiled from: BL */
    final class b implements OnClickListener {
        final /* synthetic */ llg a;

        private b(llg bl_llg) {
            this.a = bl_llg;
        }

        public void onClick(View view) {
            MediaItemLayout mediaItemLayout = (MediaItemLayout) view.getTag(2131298192);
            BaseMedia baseMedia = (BaseMedia) view.getTag();
            if (this.a.d.c() == Mode.MULTI_IMG && this.a.j != null) {
                this.a.j.a(mediaItemLayout, baseMedia);
            }
        }
    }

    /* compiled from: BL */
    public interface c {
        void a(View view, BaseMedia baseMedia);
    }

    /* compiled from: BL */
    static class d extends u {
        public MediaItemLayout n;
        public View o;

        public d(View view) {
            super(view);
            this.n = (MediaItemLayout) view.findViewById(2131298192);
            this.o = view.findViewById(2131298749);
        }
    }

    public llg(Context context) {
        int i;
        boolean z = true;
        this.c = LayoutInflater.from(context);
        if (this.d.a()) {
            i = 1;
        } else {
            i = 0;
        }
        this.e = i;
        if (this.d.c() != Mode.MULTI_IMG) {
            z = false;
        }
        this.f = z;
        this.i = new b();
        this.k = context.getResources().getDrawable(2131231107);
    }

    public void a(OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public int b(int i) {
        if (i == 0 && this.d.a()) {
            return 0;
        }
        return 1;
    }

    public u b(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new a(this.c.inflate(2131428618, viewGroup, false));
        }
        return new d(this.c.inflate(2131428619, viewGroup, false));
    }

    public void a(u uVar, int i) {
        int i2 = 0;
        if (uVar instanceof a) {
            ((a) uVar).n.setOnClickListener(this.g);
            return;
        }
        int i3 = i - this.e;
        BaseMedia baseMedia = (BaseMedia) this.a.get(i3);
        d dVar = (d) uVar;
        if (this.f) {
            dVar.o.setVisibility(0);
            dVar.o.setTag(2131298192, dVar.n);
            dVar.o.setTag(baseMedia);
            dVar.o.setOnClickListener(this.i);
        } else {
            dVar.o.setVisibility(8);
        }
        dVar.n.setDrawable(this.k);
        dVar.n.setTag(baseMedia);
        dVar.n.setOnClickListener(this.h);
        dVar.n.setTag(2131298748, Integer.valueOf(i3));
        dVar.n.setMedia(baseMedia);
        View view = dVar.o;
        if (!this.f) {
            i2 = 8;
        }
        view.setVisibility(i2);
        if (this.f && (baseMedia instanceof ImageMedia)) {
            dVar.n.setChecked(((ImageMedia) baseMedia).a());
        }
    }

    public long f_(int i) {
        return (long) i;
    }

    public int a() {
        return this.a.size() + this.e;
    }

    public void b(OnClickListener onClickListener) {
        this.g = onClickListener;
    }

    public void a(c cVar) {
        this.j = cVar;
    }

    public List<BaseMedia> b() {
        return this.b;
    }

    public void a(List<BaseMedia> list) {
        if (list != null) {
            this.b.clear();
            this.b.addAll(list);
        }
    }

    public void b(List<BaseMedia> list) {
        this.a.clear();
        if (list != null) {
            this.a.addAll(list);
        }
        f();
    }

    public void c() {
        this.a.clear();
        f();
    }

    public List<BaseMedia> g() {
        return this.a;
    }
}
