package bili.bl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.l;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import bl.deh.d;
import com.bilibili.bililive.painting.album.picker.PaintingGalleryPickerActivity;
import com.bilibili.bililive.painting.edit.media.MediaChooserActivity;
import com.bilibili.boxing.model.entity.AlbumEntity;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.bilibili.boxing.model.entity.impl.ImageMedia;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class ded extends ekr implements OnClickListener, bl.dec.b, bl.deh.c {
    public static final String a = hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 86, (byte) 64, (byte) 73, (byte) 64, (byte) 70, (byte) 81, (byte) 90, (byte) 76, (byte) 72, (byte) 68, (byte) 66, (byte) 64});
    public static final String b = hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 86, (byte) 64, (byte) 75, (byte) 65, (byte) 90, (byte) 74, (byte) 87, (byte) 76, (byte) 66, (byte) 76, (byte) 75, (byte) 68, (byte) 73, (byte) 90, (byte) 85, (byte) 76, (byte) 70});
    public static final String c = hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 86, (byte) 64, (byte) 75, (byte) 65, (byte) 90, (byte) 75, (byte) 74, (byte) 82});
    public static final String d = hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 71, (byte) 76, (byte) 95});
    public static final String e = hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 74, (byte) 87, (byte) 76, (byte) 66, (byte) 76, (byte) 75, (byte) 68, (byte) 73, (byte) 90, (byte) 85, (byte) 76, (byte) 70});
    public static final String f = hae.a(new byte[]{(byte) 81, (byte) 76, (byte) 81, (byte) 73, (byte) 64, (byte) 90, (byte) 76, (byte) 75, (byte) 65, (byte) 64, (byte) 93});
    public static final String g = hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 118});
    public static final String h = hae.a(new byte[]{(byte) 72, (byte) 96, (byte) 97, (byte) 108, (byte) 100, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    private bl.dec.a k;
    private RecyclerView l;
    private deh m;
    private deg n;
    private boolean o;
    private boolean p;
    private View q;
    private fnt r;
    private RelativeLayout s;
    private TextView t;
    private TextView u;
    private PopupWindow v;
    private SwipeRefreshLayout w;
    private boolean x;
    private int y = 3;
    private boolean z = false;

    /* compiled from: BL */
    class a implements bl.deg.b {
        final /* synthetic */ ded a;

        private a(ded bl_ded) {
            this.a = bl_ded;
        }

        public void onClick(View view, int i) {
            deg e = this.a.n;
            if (!(e == null || e.c() == i)) {
                List<AlbumEntity> b = e.b();
                e.c(i);
                AlbumEntity albumEntity = (AlbumEntity) b.get(i);
                this.a.k.a(0, albumEntity.c);
                this.a.t.setText(albumEntity.d);
                for (AlbumEntity albumEntity2 : b) {
                    albumEntity2.b = false;
                }
                albumEntity.b = true;
                e.f();
            }
            this.a.t();
        }
    }

    /* compiled from: BL */
    class b implements d {
        final /* synthetic */ ded a;

        private b(ded bl_ded) {
            this.a = bl_ded;
        }
    }

    /* compiled from: BL */
    class c extends l {
        final /* synthetic */ ded a;

        private c(ded bl_ded) {
            this.a = bl_ded;
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
            int childCount = recyclerView.getChildCount();
            if (childCount > 0 && this.a.m() && this.a.n()) {
                if (recyclerView.getChildAdapterPosition(recyclerView.getChildAt(childCount - 1)) == recyclerView.getAdapter().a() - 1) {
                    this.a.k.c();
                }
            }
        }
    }

    public static ded a(int i, boolean z) {
        ded bl_ded = new ded();
        Bundle bundle = new Bundle();
        bundle.putInt(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 71, (byte) 76, (byte) 95}), i);
        bundle.putBoolean(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 74, (byte) 87, (byte) 76, (byte) 66, (byte) 76, (byte) 75, (byte) 68, (byte) 73, (byte) 90, (byte) 85, (byte) 76, (byte) 70}), z);
        bl_ded.setArguments(bundle);
        return bl_ded;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.y = arguments.getInt(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 71, (byte) 76, (byte) 95}), 3);
            this.z = arguments.getBoolean(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 74, (byte) 87, (byte) 76, (byte) 66, (byte) 76, (byte) 75, (byte) 68, (byte) 73, (byte) 90, (byte) 85, (byte) 76, (byte) 70}), this.y != 3);
        }
        return layoutInflater.inflate(2131428924, viewGroup, false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        a(view);
        b();
        super.onViewCreated(view, bundle);
    }

    private void a(View view) {
        this.q = view.findViewById(2131297096);
        this.s = (RelativeLayout) view.findViewById(2131297531);
        this.l = (RecyclerView) view.findViewById(2131298753);
        this.w = (SwipeRefreshLayout) view.findViewById(2131300463);
        this.w.setColorSchemeColors(fnd.a(getContext(), 2131100837));
        a();
    }

    private void a() {
        LayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 3);
        gridLayoutManager.d(true);
        this.l.setLayoutManager(gridLayoutManager);
        this.l.getItemAnimator().c(0);
        this.l.addItemDecoration(new dgi(getResources().getDimensionPixelSize(2131165785), getResources().getColor(2131100441), 3, getResources().getColor(2131100436)));
        this.m.a(new b());
        this.m.a((bl.deh.c) this);
        this.m.a((OnClickListener) this);
        this.l.setAdapter(this.m);
        this.l.addOnScrollListener(new c());
        this.l.getItemAnimator().d(0);
    }

    private void b() {
        a(new dej(this));
        List parcelableArrayListExtra = getActivity().getIntent().getParcelableArrayListExtra(hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 108, (byte) 104, (byte) 100, (byte) 98, (byte) 96, (byte) 118}));
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() > 0) {
            this.m.a(parcelableArrayListExtra);
        }
        e(this.m.b());
    }

    public void a(boolean z) {
        this.z = z;
    }

    public void a(Bundle bundle, @Nullable List<BaseMedia> list) {
        this.m = new deh(getContext());
        this.m.a((List) list);
        this.n = new deg(getContext());
    }

    public void a(BaseMedia baseMedia) {
        g();
        this.p = false;
        if (baseMedia != null) {
            List b = this.m.b();
            b.add(baseMedia);
            if (j()) {
                a(baseMedia, 9087);
            } else {
                c(b);
            }
        }
    }

    public void d() {
        this.p = false;
        if (!this.x) {
            Toast.makeText(getContext(), 2131693922, 0).show();
        }
        g();
    }

    private void c() {
        this.r = new fnt(getActivity());
        this.r.a(true);
        this.r.a(getResources().getString(2131693951));
        this.r.setCancelable(false);
        this.r.show();
    }

    private void g() {
        if (this.r != null && this.r.isShowing()) {
            this.r.hide();
            this.r.dismiss();
        }
    }

    public void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (strArr[0].equals(i[0])) {
            e();
        } else if (strArr[0].equals(j[0])) {
            a(getActivity(), (Fragment) this, null);
        }
    }

    public void a(String[] strArr, Exception exception) {
        this.p = false;
        if (strArr.length <= 0) {
            return;
        }
        if (strArr[0].equals(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 117, (byte) 96, (byte) 119, (byte) 104, (byte) 108, (byte) 118, (byte) 118, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 82, (byte) 87, (byte) 76, (byte) 81, (byte) 64, (byte) 90, (byte) 64, (byte) 93, (byte) 81, (byte) 64, (byte) 87, (byte) 75, (byte) 68, (byte) 73, (byte) 90, (byte) 86, (byte) 81, (byte) 74, (byte) 87, (byte) 68, (byte) 66, (byte) 64}))) {
            this.w.setEnabled(false);
            Toast.makeText(getContext(), 2131691252, 0).show();
        } else if (strArr[0].equals(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 117, (byte) 96, (byte) 119, (byte) 104, (byte) 108, (byte) 118, (byte) 118, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 70, (byte) 68, (byte) 72, (byte) 64, (byte) 87, (byte) 68}))) {
            Toast.makeText(getContext(), 2131693882, 0).show();
        }
    }

    public void a(List<BaseMedia> list, int i) {
        r();
        q();
        this.q.setVisibility(0);
        this.m.b((List) list);
        if (list == null || (b((List) list) && b(this.m.g()))) {
            p();
            return;
        }
        this.s.setVisibility(8);
        a(this.k.a(list), this.m.b());
    }

    private boolean b(List<BaseMedia> list) {
        return list.isEmpty();
    }

    private void p() {
        if (this.s != null) {
            this.s.setVisibility(0);
        }
    }

    private void q() {
        this.w.post(new Runnable(this) {
            final /* synthetic */ ded a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.w.setEnabled(false);
            }
        });
    }

    private void r() {
        this.w.post(new Runnable(this) {
            final /* synthetic */ ded a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.w.setRefreshing(false);
            }
        });
    }

    public void d(List<AlbumEntity> list) {
        if (list.isEmpty()) {
            this.t.setCompoundDrawables(null, null, null, null);
            this.t.setOnClickListener(null);
            return;
        }
        this.n.a((List) list);
    }

    public void e() {
        s();
        this.k.a(0, BuildConfig.VERSION_NAME);
        l();
    }

    private void s() {
        this.w.post(new Runnable(this) {
            final /* synthetic */ ded a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.w.setRefreshing(true);
            }
        });
    }

    public void f() {
        this.m.c();
    }

    private void e(List<BaseMedia> list) {
        int i;
        CharSequence string;
        if (list == null || list.size() <= 0 || list.size() > def.b()) {
            i = 0;
        } else {
            i = 1;
        }
        TextView textView = this.u;
        if (i != 0) {
            string = getString(2131693931, String.valueOf(list.size()));
        } else {
            string = getString(2131693930);
        }
        textView.setText(string);
    }

    public void onDetach() {
        super.onDetach();
        if (this.r != null && this.r.isShowing()) {
            this.r.dismiss();
        }
    }

    public void onClick(View view) {
        if (view.getTag() instanceof BaseMedia) {
            BaseMedia baseMedia = (BaseMedia) view.getTag();
            if (baseMedia instanceof ImageMedia) {
                b(baseMedia);
            }
        }
    }

    public void a(int i, int i2) {
        this.p = false;
        this.x = true;
        c();
        super.a(i, i2);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 9086) {
            this.o = false;
            boolean booleanExtra = intent.getBooleanExtra(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 86, (byte) 64, (byte) 75, (byte) 65, (byte) 90, (byte) 75, (byte) 74, (byte) 82}), false);
            boolean booleanExtra2 = intent.getBooleanExtra(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 86, (byte) 64, (byte) 75, (byte) 65, (byte) 90, (byte) 74, (byte) 87, (byte) 76, (byte) 66, (byte) 76, (byte) 75, (byte) 68, (byte) 73, (byte) 90, (byte) 85, (byte) 76, (byte) 70}), false);
            List parcelableArrayListExtra = intent.getParcelableArrayListExtra(hae.a(new byte[]{(byte) 64, (byte) 93, (byte) 81, (byte) 87, (byte) 68, (byte) 90, (byte) 86, (byte) 64, (byte) 73, (byte) 64, (byte) 70, (byte) 81, (byte) 90, (byte) 76, (byte) 72, (byte) 68, (byte) 66, (byte) 64}));
            if (booleanExtra) {
                a(parcelableArrayListExtra, booleanExtra2);
            } else {
                a(this.k.a(this.m.g()), parcelableArrayListExtra);
                this.m.a(parcelableArrayListExtra);
                this.m.f();
            }
            e(parcelableArrayListExtra);
        }
    }

    public void a(int i, int i2, @NonNull Intent intent) {
        if (i == 9087) {
            super.a(i, i2, intent);
        }
    }

    public void a(TextView textView) {
        this.u = textView;
        this.u.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ded a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.c(this.a.m.b());
            }
        });
    }

    public void b(TextView textView) {
        this.t = textView;
        this.t.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ded a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                if (this.a.v == null) {
                    int applyDimension = (int) TypedValue.applyDimension(1, 300.0f, this.a.getResources().getDisplayMetrics());
                    this.a.v = new PopupWindow(view, -1, -1, false);
                    this.a.v.setFocusable(true);
                    this.a.v.setOutsideTouchable(true);
                    View a = a(view.getContext(), applyDimension);
                    a(a);
                    this.a.v.setContentView(a);
                }
                this.a.a(0.5f);
                this.a.v.showAsDropDown(view, 0, 0);
                this.a.v.setOnDismissListener(new OnDismissListener(this) {
                    final /* synthetic */ AnonymousClass5 a;

                    {
                        this.a = r1;
                    }

                    public void onDismiss() {
                        this.a.a.a(1.0f);
                    }
                });
            }

            private void a(View view) {
                view.findViewById(2131296386).setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ AnonymousClass5 a;

                    {
                        this.a = r1;
                    }

                    public void onClick(View view) {
                        this.a.a.t();
                    }
                });
            }

            @NonNull
            private View a(Context context, int i) {
                View inflate = LayoutInflater.from(this.a.getContext()).inflate(2131429594, null);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131296388);
                LayoutParams layoutParams = recyclerView.getLayoutParams();
                layoutParams.height = i;
                recyclerView.setLayoutParams(layoutParams);
                recyclerView.setBackgroundColor(fnd.b(this.a.getContext(), ej.c(this.a.getActivity(), 2131100433)));
                recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                recyclerView.addItemDecoration(new mec(recyclerView.getContext(), 2131100440));
                this.a.n.a(new a());
                recyclerView.setAdapter(this.a.n);
                return inflate;
            }
        });
    }

    public void a(float f) {
        WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.alpha = f;
        getActivity().getWindow().setAttributes(attributes);
    }

    private void t() {
        if (this.v != null && this.v.isShowing()) {
            this.v.dismiss();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        a(bundle, (ArrayList) this.m.b());
    }

    public void a(bl.dec.a aVar) {
        this.k = aVar;
    }

    private void b(BaseMedia baseMedia) {
        if (!this.o) {
            this.o = true;
            Intent a = PaintingGalleryPickerActivity.a(getContext(), null, this.z, this.y, this.m.g(), baseMedia, this.m.b());
            a.putExtra(hae.a(new byte[]{(byte) 81, (byte) 76, (byte) 81, (byte) 73, (byte) 64, (byte) 90, (byte) 76, (byte) 75, (byte) 65, (byte) 64, (byte) 93}), true);
            startActivityForResult(a, 9086);
        }
    }

    public void a(View view, BaseMedia baseMedia) {
        if (this.k != null) {
            this.k.a(view, baseMedia, this.m, this.y);
        }
    }

    public void a(List<BaseMedia> list) {
        e((List) list);
    }

    public void c(@NonNull List<BaseMedia> list) {
        super.c(list);
        FragmentActivity activity = getActivity();
        if (activity instanceof MediaChooserActivity) {
            ((MediaChooserActivity) activity).a(list);
        }
    }

    public void a(@NonNull List<BaseMedia> list, boolean z) {
        super.c(list);
        FragmentActivity activity = getActivity();
        if (activity instanceof MediaChooserActivity) {
            ((MediaChooserActivity) activity).a(list, z);
        }
    }
}
