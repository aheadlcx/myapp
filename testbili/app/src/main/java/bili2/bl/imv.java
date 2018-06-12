package bili2.bl;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bilibili.lib.image.ScalableImageView;
import com.mall.domain.shop.home.ShopHomeAdvBean;
import com.mall.ui.widget.AutoScrollBanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tv.danmaku.bili.widget.Banner.d;

/* compiled from: BL */
public class imv extends iog {
    private bl.imw.a n;
    private AutoScrollBanner o;
    private ScalableImageView p;
    private View q;
    private View r;
    private int s = -1;
    private int t = 0;

    /* compiled from: BL */
    static class a implements tv.danmaku.bili.widget.Banner.a {
        ShopHomeAdvBean a;
        int b;

        a(ShopHomeAdvBean shopHomeAdvBean, int i) {
            this.a = shopHomeAdvBean;
            this.b = i;
        }

        public View a_(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131429214, viewGroup, false);
            ImageView imageView = (ScalableImageView) inflate.findViewById(2131296582);
            View findViewById = inflate.findViewById(2131296585);
            if (flg.b(ieb.a().h())) {
                findViewById.setVisibility(0);
                imageView.setBackgroundDrawable(ieb.a().h().getResources().getDrawable(2131234468));
            } else {
                findViewById.setVisibility(8);
            }
            if (this.a != null) {
                idu.a(this.a.img, imageView);
            }
            return inflate;
        }
    }

    public imv(View view, bl.imw.a aVar) {
        super(view);
        this.n = aVar;
        WindowManager windowManager = (WindowManager) ieb.a().h().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.s = displayMetrics.widthPixels;
        this.o = (AutoScrollBanner) view.findViewById(2131299987);
        a();
        a(this.o);
        this.p = (ScalableImageView) view.findViewById(2131299988);
        a(this.p);
        this.q = view.findViewById(2131299040);
        this.r = view.findViewById(2131299039);
        a(this.r);
    }

    public void a(List<ShopHomeAdvBean> list) {
        if (list == null || list.size() < 1) {
            idw.a(null);
            idw.c(null);
            return;
        }
        if (flg.b(ieb.a().h())) {
            this.r.setVisibility(0);
            this.p.setBackgroundDrawable(ieb.a().h().getResources().getDrawable(2131234444));
        } else {
            this.r.setVisibility(8);
        }
        if (list.size() == 1) {
            this.o.setVisibility(8);
            this.q.setVisibility(0);
            if (flg.b(ieb.a().h())) {
                this.r.setVisibility(0);
            } else {
                this.r.setVisibility(8);
            }
            final ShopHomeAdvBean shopHomeAdvBean = (ShopHomeAdvBean) list.get(0);
            if (shopHomeAdvBean == null) {
                this.a.setVisibility(8);
                return;
            }
            if (TextUtils.isEmpty(shopHomeAdvBean.img)) {
                idu.a(null, this.p);
            } else {
                idu.a(shopHomeAdvBean.img, this.p);
            }
            this.q.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ imv b;

                public void onClick(View view) {
                    Map hashMap = new HashMap();
                    hashMap.put("index", "0");
                    ien.j(2131693176, hashMap);
                    this.b.n.a(shopHomeAdvBean.url);
                }
            });
            return;
        }
        this.o.setVisibility(0);
        this.q.setVisibility(8);
        this.r.setVisibility(8);
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new a((ShopHomeAdvBean) list.get(i), i));
        }
        this.o.setBannerItems(arrayList);
        this.o.setOnBannerClickListener(new d(this) {
            final /* synthetic */ imv a;

            {
                this.a = r1;
            }

            public void onClick(tv.danmaku.bili.widget.Banner.a aVar) {
                ShopHomeAdvBean shopHomeAdvBean = ((a) aVar).a;
                Map hashMap = new HashMap();
                hashMap.put("index", gmy.d + ((a) aVar).b);
                ien.j(2131693176, hashMap);
                if (shopHomeAdvBean != null) {
                    this.a.n.a(shopHomeAdvBean.url);
                }
            }
        });
        this.o.a(5000);
    }

    private void a(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.width = (this.s - ioo.d(2131165652)) - ioo.d(2131165652);
        layoutParams.height = (int) ((((double) (this.s * 110)) * 1.0d) / 351.0d);
        this.t = layoutParams.height;
        view.setLayoutParams(layoutParams);
    }

    private void a() {
        if (this.o != null) {
            LayoutParams indicatorParams = this.o.getIndicatorParams();
            if (indicatorParams != null) {
                indicatorParams.gravity = 81;
                indicatorParams.bottomMargin = ioo.d(2131165651);
                this.o.setIndicatorParams(indicatorParams);
            }
        }
    }
}
