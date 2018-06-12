package bili4.tv.danmaku.bili.ui.danmakufilter;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.f;
import android.view.ViewGroup;
import bl.eva;
import bl.kyo;
import bl.ldm;
import bl.mhu;
import butterknife.ButterKnife;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tv.danmaku.bili.ui.login.LoginActivity;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;
import u.aly.dd;

/* compiled from: BL */
public class DanmakuBlockActivity extends kyo {
    PagerSlidingTabStrip b;
    ViewPager c;

    /* compiled from: BL */
    public static class a extends FragmentPagerAdapter {
        private static final int[] a = new int[]{2131691071};
        private Context b;

        public a(@NonNull FragmentManager fragmentManager, @NonNull Context context) {
            super(fragmentManager);
            this.b = context;
        }

        public Fragment getItem(int i) {
            switch (i) {
                case dd.a /*0*/:
                    return ldm.m();
                default:
                    return null;
            }
        }

        public int getCount() {
            return a.length;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        public CharSequence getPageTitle(int i) {
            return this.b.getString(a[i]);
        }
    }

    /* compiled from: BL */
    public static class b extends AsyncTask<Integer, Void, Object> {
        private Context a;
        private bl.ldl.a b;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return a((Integer[]) objArr);
        }

        public b(Context context, bl.ldl.a aVar) {
            this.a = context;
            this.b = aVar;
        }

        protected Object a(Integer... numArr) {
            switch (numArr[0].intValue()) {
                case dd.c /*2*/:
                    return mhu.l(this.a);
                default:
                    return null;
            }
        }

        protected void onPostExecute(Object obj) {
            super.onPostExecute(obj);
            if (this.b != null || obj == null) {
                List arrayList = new ArrayList();
                if (obj instanceof HashSet) {
                    arrayList.addAll((HashSet) obj);
                }
                if (obj instanceof List) {
                    obj = (List) obj;
                } else {
                    List list = arrayList;
                }
                this.b.a(obj);
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427581);
        this.b = (PagerSlidingTabStrip) ButterKnife.a(this, 2131300497);
        this.c = (ViewPager) ButterKnife.a(this, 2131299183);
        o();
        p();
        if (eva.a(this).a()) {
            q();
            return;
        }
        startActivity(LoginActivity.a((Context) this));
        finish();
    }

    public void q() {
        this.c.setAdapter(new a(getSupportFragmentManager(), this));
        this.b.setOnPageChangeListener(new f(this) {
            final /* synthetic */ DanmakuBlockActivity a;

            {
                this.a = r1;
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                this.a.supportInvalidateOptionsMenu();
            }

            public void onPageScrollStateChanged(int i) {
            }
        });
        this.b.setViewPager(this.c);
    }
}
