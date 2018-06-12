package bili4.tv.danmaku.bili.ui.author;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import bl.fcz;
import bl.hae;
import bl.kyx;
import bl.lam;
import bl.lvh;
import com.tencent.stat.common.DeviceInfo;
import tv.danmaku.bili.ui.StubSingleFragmentActivity;
import tv.danmaku.bili.ui.favorite.api.BiliFavoriteBox;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

/* compiled from: BL */
public class FavoriteBoxVideosActivity extends kyx {
    private static final String c = hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125});
    int b = 0;
    private lam d;
    private BiliFavoriteBox e;

    public static Intent a(Context context, BiliFavoriteBox biliFavoriteBox) {
        return a(context, biliFavoriteBox, 0);
    }

    public static Intent a(Context context, BiliFavoriteBox biliFavoriteBox, int i) {
        Intent intent = new Intent(context, FavoriteBoxVideosActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong(DeviceInfo.TAG_MID, biliFavoriteBox.mMid);
        bundle.putLong(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 108, (byte) 97}), biliFavoriteBox.mId);
        bundle.putString(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), biliFavoriteBox.mName);
        bundle.putInt(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}), biliFavoriteBox.mState);
        bundle.putInt("from", i);
        intent.putExtra(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125}), bundle);
        return intent;
    }

    public static Intent a(Context context, BiliFavoriteBox biliFavoriteBox, boolean z) {
        Intent intent = new Intent(context, FavoriteBoxVideosActivity.class);
        Bundle bundle = new Bundle();
        bundle.putLong(DeviceInfo.TAG_MID, biliFavoriteBox.mMid);
        bundle.putLong(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 108, (byte) 97}), biliFavoriteBox.mId);
        bundle.putString(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), biliFavoriteBox.mName);
        bundle.putBoolean(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 107, (byte) 90, (byte) 96, (byte) 97, (byte) 108, (byte) 113}), z);
        bundle.putInt(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}), biliFavoriteBox.mState);
        intent.putExtra(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125}), bundle);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427608);
        o();
        p();
        Bundle bundleExtra = getIntent().getBundleExtra(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 107, (byte) 97, (byte) 105, (byte) 96, (byte) 90, (byte) 103, (byte) 106, (byte) 125}));
        this.e = new BiliFavoriteBox();
        this.e.mMid = bundleExtra.getLong(DeviceInfo.TAG_MID);
        this.e.mId = bundleExtra.getLong(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 108, (byte) 97}));
        this.e.mName = bundleExtra.getString(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}));
        this.e.mState = bundleExtra.getInt(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 118, (byte) 113, (byte) 100, (byte) 113, (byte) 96}));
        int i = bundleExtra.getInt("from");
        B_().a(this.e.mName);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Fragment fragment = (FavoriteBoxVideosFragment) supportFragmentManager.findFragmentByTag(hae.a(new byte[]{(byte) 67, (byte) 100, (byte) 115, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 96, (byte) 71, (byte) 106, (byte) 125, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 118, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113}));
        if (fragment == null) {
            fragment = FavoriteBoxVideosFragment.a(this.e, bundleExtra.getBoolean(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 107, (byte) 90, (byte) 96, (byte) 97, (byte) 108, (byte) 113}), false), i);
        }
        supportFragmentManager.beginTransaction().replace(2131297107, fragment, hae.a(new byte[]{(byte) 67, (byte) 100, (byte) 115, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 96, (byte) 71, (byte) 106, (byte) 125, (byte) 83, (byte) 108, (byte) 97, (byte) 96, (byte) 106, (byte) 118, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113})).commit();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131492880, menu);
        return true;
    }

    public boolean onMenuOpened(int i, Menu menu) {
        this.b++;
        if (this.b % 2 == 0) {
            fcz.a(hae.a(new byte[]{(byte) 104, (byte) 124, (byte) 113, (byte) 109, (byte) 90, (byte) 99, (byte) 100, (byte) 115, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 96, (byte) 90, (byte) 104, (byte) 106, (byte) 119, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
        }
        return super.onMenuOpened(i, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131297475:
                u();
                fcz.a(hae.a(new byte[]{(byte) 104, (byte) 124, (byte) 113, (byte) 109, (byte) 90, (byte) 99, (byte) 100, (byte) 115, (byte) 106, (byte) 119, (byte) 108, (byte) 113, (byte) 96, (byte) 90, (byte) 96, (byte) 97, (byte) 108, (byte) 113, (byte) 90, (byte) 99, (byte) 106, (byte) 105, (byte) 97, (byte) 96, (byte) 119, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
                return true;
            case 2131297958:
                t();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    private void v() {
        if (this.d == null) {
            lam a = lam.a(this);
            this.d = a;
            if (a == null) {
                this.d = new lam();
                this.d.a(this.e);
                this.d.a(true);
            }
        }
    }

    public boolean s() {
        return this.d != null && this.d.f();
    }

    public void t() {
        if (!s()) {
            v();
            this.d.b(this);
        }
    }

    public void u() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 97, (byte) 96, (byte) 99, (byte) 100, (byte) 112, (byte) 105, (byte) 113}), this.e.isDefault());
        bundle.putLong(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 108, (byte) 97}), this.e.mId);
        bundle.putString(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 107, (byte) 100, (byte) 104, (byte) 96}), this.e.mName);
        bundle.putBoolean(hae.a(new byte[]{(byte) 103, (byte) 106, (byte) 125, (byte) 90, (byte) 117, (byte) 119, (byte) 108, (byte) 115, (byte) 100, (byte) 113, (byte) 96}), !this.e.isPublic());
        startActivityForResult(StubSingleFragmentActivity.a(this, lvh.class, bundle), IjkMediaCodecInfo.RANK_SOFTWARE);
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        super.onActivityResult(i, i2, intent);
        if (i == IjkMediaCodecInfo.RANK_SOFTWARE) {
            if (i2 == -100) {
                setResult(-1);
                finish();
            } else if (i2 == -1) {
                boolean z2;
                setResult(-1);
                Object stringExtra = intent.getStringExtra("name");
                String a = hae.a(new byte[]{(byte) 108, (byte) 118, (byte) 90, (byte) 117, (byte) 119, (byte) 108, (byte) 115, (byte) 100, (byte) 113, (byte) 96});
                if (this.e.isPublic()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                z2 = intent.getBooleanExtra(a, z2);
                B_().a(stringExtra);
                this.e.mName = stringExtra;
                BiliFavoriteBox biliFavoriteBox = this.e;
                if (z2) {
                    z = false;
                }
                biliFavoriteBox.setPublic(z);
            }
        }
    }
}
