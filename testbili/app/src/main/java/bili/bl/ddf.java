package bili.bl;

import android.os.Bundle;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import bl.fjv.b;
import com.bilibili.bililive.painting.api.entity.Painting;
import com.bilibili.lib.sharewrapper.selector.ISharePlatformSelector.Style;
import com.bilibili.lib.sharewrapper.selector.SharePlatform;

/* compiled from: BL */
public class ddf {
    private FragmentActivity a;
    private fjv b;
    private Painting c;
    private ddg d;
    private a e;
    private bl.fjv.a f = new b(this) {
        final /* synthetic */ ddf a;

        {
            this.a = r1;
        }

        public Bundle a(String str) {
            return this.a.a(str);
        }

        public void a(String str, final fjw bl_fjw) {
            super.a(str, bl_fjw);
            if (!(this.a.c == null || this.a.e == null)) {
                this.a.e.a(str);
            }
            if (TextUtils.equals(str, hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 76, (byte) 104}))) {
                ViewGroup viewGroup = (ViewGroup) this.a.a.findViewById(16908290);
                this.a.d = new ddg(this.a.a);
                this.a.d.a(viewGroup, 80);
                this.a.d.setOnClickListener(new OnClickListener(this) {
                    final /* synthetic */ AnonymousClass1 b;

                    public void onClick(View view) {
                        ddd.a(this.b.a.a, bl_fjw.a);
                    }
                });
                return;
            }
            esu.a(this.a.a, 2131695277);
        }

        public void b(String str, fjw bl_fjw) {
            super.b(str, bl_fjw);
            String str2 = null;
            Bundle bundle = bl_fjw.a;
            if (bundle != null) {
                str2 = bundle.getString(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 100, (byte) 119, (byte) 96, (byte) 90, (byte) 104, (byte) 96, (byte) 118, (byte) 118, (byte) 100, (byte) 98, (byte) 96}));
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = this.a.a.getString(2131695274);
            }
            esu.a(this.a.a, str2);
        }

        public void c(String str, fjw bl_fjw) {
            super.c(str, bl_fjw);
        }
    };

    /* compiled from: BL */
    public interface a {
        void a(String str);
    }

    public ddf(FragmentActivity fragmentActivity, a aVar) {
        this.a = fragmentActivity;
        this.b = new fjv(fragmentActivity, this.f);
        this.e = aVar;
    }

    public void a(Painting painting) {
        this.c = painting;
        if (this.c == null || this.c.getShareTitle(false) == null) {
            esu.b(this.a, 2131693952);
        } else {
            this.b.a(this.a.getString(2131690455), Style.BOTTOM_V2, SharePlatform.c());
        }
    }

    private Bundle a(String str) {
        if (this.c == null) {
            return null;
        }
        String shareDesc = this.c.getShareDesc();
        String shareUrl = this.c.getShareUrl();
        String str2 = BuildConfig.VERSION_NAME;
        if (TextUtils.equals(str, "SINA")) {
            shareDesc = this.c.getShareTitle(false) + " " + this.c.getShareDesc();
        } else if (TextUtils.equals(str, hae.a(new byte[]{(byte) 66, (byte) 64, (byte) 75, (byte) 64, (byte) 87, (byte) 76, (byte) 70}))) {
            shareDesc = this.c.getShareTitle(false) + ", " + shareUrl;
        } else if (TextUtils.equals(str, "COPY")) {
            shareDesc = shareUrl;
        }
        if (TextUtils.equals(str, hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 76, (byte) 104})) || TextUtils.equals(str, hae.a(new byte[]{(byte) 103, (byte) 108, (byte) 105, (byte) 108, (byte) 65, (byte) 124, (byte) 107, (byte) 100, (byte) 104, (byte) 108, (byte) 102}))) {
            str2 = this.c.getShareTitle(true);
        } else {
            str2 = this.c.getShareTitle(false);
        }
        String shareImage = this.c.getShareImage();
        if (fjx.b(str)) {
            return new fjy().c(shareImage).b((long) this.c.user.uid).f(this.c.user.name).a(str2).a(this.c.getPaintingId()).a(2).e(this.c.getShareDesc()).d(shareImage).a();
        }
        return new fkf().a(str2).b(shareDesc).c(shareUrl).d(shareImage).f(hae.a(new byte[]{(byte) 113, (byte) 124, (byte) 117, (byte) 96, (byte) 90, (byte) 114, (byte) 96, (byte) 103})).a();
    }
}
