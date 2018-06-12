package bili3.com.mall.ui.home.main;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import bl.ezs;
import bl.ezs.a;
import bl.fal;
import bl.fas;
import bl.fji;
import bl.gob;
import bl.grd;
import bl.gss;
import bl.ieb;
import bl.ien;
import com.bilibili.opd.app.bizcommon.context.StatusBarMode;
import com.mall.base.context.MallFragmentLoaderActivity;
import com.mall.ui.home.HomeFragment;

/* compiled from: BL */
public class HomeMainFragment extends HomeFragment implements fas {
    private grd j;
    private boolean k;
    private int o = 3;
    private a p = new a(this) {
        final /* synthetic */ HomeMainFragment a;

        {
            this.a = r1;
        }

        public void aB_() {
            this.a.a(this.a.E());
            this.a.V();
        }
    };

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (aO_() != null) {
            this.o = 0;
            aO_().a(activity);
        }
        if (activity.getIntent() != null) {
            activity.getIntent().putExtra("_page_start", SystemClock.elapsedRealtime());
        }
    }

    public void onResume() {
        super.onResume();
        if (aO_() != null && getActivity() != null && this.o != 1) {
            this.o = 1;
            aO_().b(getActivity());
        }
    }

    public void onPause() {
        super.onPause();
        if (aO_() != null && getActivity() != null && this.o != 2) {
            this.o = 2;
            aO_().c(getActivity());
        }
    }

    public void onDetach() {
        super.onDetach();
        if (aO_() != null && getActivity() != null) {
            this.o = 3;
            aO_().d(getActivity());
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        ezs.a().a(this.p);
        super.onViewCreated(view, bundle);
        if (!this.k && !TextUtils.isEmpty(Y())) {
            if (gss.a(getActivity())) {
                X().a();
            }
            this.k = true;
        }
    }

    public void al_() {
        super.al_();
        X().b();
    }

    public void onStop() {
        super.onStop();
        X().c();
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        a(StatusBarMode.NONE);
    }

    public boolean n() {
        return false;
    }

    public void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        bundle.putInt("bili_only", 1);
        fji.a().a(getActivity()).a(bundle).a("action://main/uri-resolver/");
    }

    public void onDestroyView() {
        ezs.a().b(this.p);
        super.onDestroyView();
    }

    protected boolean S() {
        return true;
    }

    @Nullable
    public fal a() {
        return new fal(this) {
            final /* synthetic */ HomeMainFragment a;

            {
                this.a = r1;
            }

            public void b() {
                super.T();
                if (this.a.aO_() != null && this.a.getActivity() != null && this.a.o != 1) {
                    this.a.o = 1;
                    this.a.aO_().b(this.a.getActivity());
                }
            }

            public void c() {
                super.U();
                if (this.a.aO_() != null && this.a.getActivity() != null && this.a.o != 2) {
                    this.a.o = 2;
                    this.a.aO_().c(this.a.getActivity());
                }
            }

            public void v_() {
                if (this.a.J() != null) {
                    this.a.J().scrollToPosition(0);
                }
                ien.e(2131693101, null);
            }
        };
    }

    public gob aO_() {
        return ieb.a();
    }

    protected grd X() {
        if (this.j == null) {
            synchronized (MallFragmentLoaderActivity.class) {
                this.j = grd.a(Y(), ieb.a().b().h(), getView(), getActivity() == null ? null : getActivity().getIntent(), ieb.a().h(), 0);
            }
        }
        return this.j;
    }

    private String Y() {
        return getClass().getName();
    }
}
