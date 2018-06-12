package bili2.bl;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.List;
import tv.danmaku.bili.ui.category.api.CategoryBannerList.CategoryBanner;
import tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b;
import tv.danmaku.bili.widget.Banner;

/* compiled from: BL */
class lhv extends b<CategoryBanner> {
    private List<CategoryBanner> n;

    /* compiled from: BL */
    class a extends tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b.a<CategoryBanner> {
        final /* synthetic */ lhv b;

        private a(lhv bl_lhv, CategoryBanner categoryBanner) {
            this.b = bl_lhv;
            super(categoryBanner);
        }

        public View a(ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131427945, viewGroup, false);
            b(inflate);
            return inflate;
        }

        public String a() {
            return ((CategoryBanner) this.a).image;
        }

        public String b() {
            return ((CategoryBanner) this.a).uri;
        }

        protected void b(View view) {
            if (((CategoryBanner) this.a).isAdLoc && ((CategoryBanner) this.a).isAd) {
                view.findViewById(2131300505).setVisibility(0);
            } else {
                view.findViewById(2131300505).setVisibility(8);
            }
            super.b(view);
        }
    }

    private lhv(View view) {
        super(view);
    }

    protected kup a() {
        return kup.a(2, 0);
    }

    static lhv a(ViewGroup viewGroup) {
        Banner banner = (Banner) LayoutInflater.from(viewGroup.getContext()).inflate(2131427942, viewGroup, false);
        banner.setRadius(TypedValue.applyDimension(1, 4.0f, Resources.getSystem().getDisplayMetrics()));
        LayoutParams layoutParams = banner.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            ((MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
        }
        return new lhv(banner);
    }

    protected tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b.a<CategoryBanner> a(Object obj, int i) {
        this.n = (List) obj;
        return new a((CategoryBanner) this.n.get(i));
    }

    public void onClick(tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b.a<CategoryBanner> aVar) {
        int indexOf = this.o.indexOf(aVar);
        if (aVar.a != null && indexOf >= 0) {
            kvq.a(((CategoryBanner) aVar.a).isAdLoc, ((CategoryBanner) aVar.a).isAd, ((CategoryBanner) aVar.a).adCb, ((CategoryBanner) aVar.a).srcId, ((CategoryBanner) aVar.a).index, ((CategoryBanner) aVar.a).ip, ((CategoryBanner) aVar.a).serverType, ((CategoryBanner) aVar.a).resourceId, ((CategoryBanner) aVar.a).id, ((CategoryBanner) aVar.a).cardIndex);
            kvq.a(((CategoryBanner) aVar.a).isAdLoc, ((CategoryBanner) aVar.a).clickUrl, ((CategoryBanner) aVar.a).uri, ((CategoryBanner) aVar.a).srcId, ((CategoryBanner) aVar.a).ip, ((CategoryBanner) aVar.a).requestId, ((CategoryBanner) aVar.a).extra);
            kvq.a(((CategoryBanner) aVar.a).isAdLoc, ((CategoryBanner) aVar.a).isAd, ((CategoryBanner) aVar.a).adCb, ((CategoryBanner) aVar.a).srcId, ((CategoryBanner) aVar.a).index, ((CategoryBanner) aVar.a).ip, ((CategoryBanner) aVar.a).serverType, ((CategoryBanner) aVar.a).resourceId, ((CategoryBanner) aVar.a).id);
            if (!TextUtils.isEmpty(((CategoryBanner) aVar.a).uri)) {
                Uri parse = Uri.parse(((CategoryBanner) aVar.a).uri);
                if ("game".equals(parse.getHost())) {
                    Object path = parse.getPath();
                    if (!TextUtils.isEmpty(path)) {
                        kuv.a(2, path.replace("/", gmy.d), 0, gmy.d, 0, parse.toString(), "1");
                    }
                }
                if (hae.a(new byte[]{(byte) 103, (byte) 100, (byte) 107, (byte) 98, (byte) 112, (byte) 104, (byte) 108}).equals(parse.getHost())) {
                    bcc.a(this.a.getContext(), ((CategoryBanner) aVar.a).uri, 2);
                } else {
                    kyq.a(this.a.getContext(), lac.a(parse, hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124})), false);
                }
            }
            lhn.a(((CategoryBanner) aVar.a).categoryName, ((CategoryBanner) aVar.a).uri);
        }
    }

    public void a(tv.danmaku.bili.widget.Banner.a aVar) {
        super.a(aVar);
        tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b.a aVar2 = (tv.danmaku.bili.ui.main.category.BaseCategorySectionFragment.b.a) aVar;
        kvq.a(((CategoryBanner) aVar2.a).isAdLoc, ((CategoryBanner) aVar2.a).isAd, ((CategoryBanner) aVar2.a).adCb, ((CategoryBanner) aVar2.a).srcId, ((CategoryBanner) aVar2.a).index, ((CategoryBanner) aVar2.a).ip, ((CategoryBanner) aVar2.a).serverType, ((CategoryBanner) aVar2.a).resourceId, ((CategoryBanner) aVar2.a).id, ((CategoryBanner) aVar2.a).requestId, ((CategoryBanner) aVar2.a).creativeId, ((CategoryBanner) aVar2.a).cardIndex);
        kvq.a(((CategoryBanner) aVar2.a).isAdLoc, ((CategoryBanner) aVar2.a).showUrl, ((CategoryBanner) aVar2.a).srcId, ((CategoryBanner) aVar2.a).ip, ((CategoryBanner) aVar2.a).requestId, ((CategoryBanner) aVar2.a).creativeId, ((CategoryBanner) aVar2.a).extra);
        kvq.a(((CategoryBanner) aVar2.a).isAdLoc, ((CategoryBanner) aVar2.a).isAd, ((CategoryBanner) aVar2.a).adCb, ((CategoryBanner) aVar2.a).srcId, ((CategoryBanner) aVar2.a).index, ((CategoryBanner) aVar2.a).ip, ((CategoryBanner) aVar2.a).serverType, ((CategoryBanner) aVar2.a).resourceId, ((CategoryBanner) aVar2.a).id, ((CategoryBanner) aVar2.a).requestId);
    }
}
