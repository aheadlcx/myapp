package bili4.tv.danmaku.bili.ui.author;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageButton;
import bl.hae;
import bl.lam;
import bl.lod;
import com.tencent.stat.common.DeviceInfo;
import tv.danmaku.bili.ui.favorite.api.BiliFavoriteBox;
import tv.danmaku.bili.ui.search.BaseSearchActivity;

/* compiled from: BL */
public class FavoriteSearchActivity extends BaseSearchActivity {
    private static final String e = hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125});
    protected String a;
    private BiliFavoriteBox f;

    public static Intent a(String str, BiliFavoriteBox biliFavoriteBox, Context context) {
        Intent intent = new Intent(context, FavoriteSearchActivity.class);
        intent.setAction(hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 86, (byte) 64, (byte) 68, (byte) 87, (byte) 70, (byte) 77}));
        intent.setFlags(536870912);
        intent.putExtra(hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 116, (byte) 112, (byte) 96, (byte) 119, (byte) 124}), str);
        Bundle bundle = new Bundle();
        if (biliFavoriteBox != null) {
            bundle.putLong(DeviceInfo.TAG_MID, biliFavoriteBox.mMid);
            bundle.putLong(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 108, (byte) 97}), biliFavoriteBox.mId);
            bundle.putString(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), biliFavoriteBox.mName);
            intent.putExtra(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125}), bundle);
        }
        return intent;
    }

    protected void n() {
        ((ImageButton) this.mImageButton.get(0)).setVisibility(8);
        this.d.setHint(2131693681);
        this.f = new BiliFavoriteBox();
        Bundle bundleExtra = getIntent().getBundleExtra(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125}));
        if (bundleExtra != null) {
            this.f.mMid = bundleExtra.getLong(DeviceInfo.TAG_MID);
            this.f.mId = bundleExtra.getLong(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 108, (byte) 97}));
            this.f.mName = bundleExtra.getString(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}));
        }
    }

    protected lod o() {
        lod a = lam.a(this);
        if (a == null) {
            return new lam();
        }
        return a;
    }

    protected void p() {
    }

    protected boolean c(Intent intent) {
        CharSequence charSequence = this.a;
        if (hae.a(new byte[]{(byte) 100, (byte) 107, (byte) 97, (byte) 119, (byte) 106, (byte) 108, (byte) 97, (byte) 43, (byte) 108, (byte) 107, (byte) 113, (byte) 96, (byte) 107, (byte) 113, (byte) 43, (byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 43, (byte) 86, (byte) 64, (byte) 68, (byte) 87, (byte) 70, (byte) 77}).equals(intent.getAction())) {
            this.a = intent.getStringExtra(hae.a(new byte[]{(byte) 116, (byte) 112, (byte) 96, (byte) 119, (byte) 124}));
            if (this.a == null) {
                this.a = intent.getStringExtra(hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 116, (byte) 112, (byte) 96, (byte) 119, (byte) 124}));
            }
        }
        this.d.setText(this.a);
        if (TextUtils.equals(charSequence, this.a)) {
            return false;
        }
        getSupportFragmentManager().beginTransaction().replace(2131297097, FavoriteBoxVideosFragment.a(this.f, this.a), hae.a(new byte[]{(byte) 67, (byte) 100, (byte) 115, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 96, (byte) 71, (byte) 106, (byte) 125, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 118, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113})).commit();
        return true;
    }

    protected String q() {
        return this.a;
    }
}
