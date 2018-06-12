package bili3.com.bilibili.music.app.context;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import bl.frl;
import bl.fso;
import bl.fuz;
import bl.fvb;
import bl.gob;
import bl.gof;
import bl.goq;
import bl.grd;
import bl.hae;
import com.bilibili.music.app.ui.view.LoadingErrorEmptyView;
import com.bilibili.music.app.ui.view.LoadingErrorEmptyView.a;

/* compiled from: BL */
public class MusicFragmentLoaderActivity extends gof {
    private grd d;
    private boolean e = false;
    private boolean f = false;

    @NonNull
    public gob j() {
        return fuz.a();
    }

    protected void a(Fragment fragment) {
        Bundle extras = getIntent().getExtras();
        Uri data = getIntent().getData();
        if (extras != null) {
            frl.a(fragment, extras);
        }
        if (data != null) {
            frl.a(fragment, data);
        }
        this.f = ((fso) fragment.getClass().getAnnotation(fso.class)) != null;
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    protected void onPostResume() {
        super.onPostResume();
    }

    protected void onResumeFragments() {
        super.onResumeFragments();
        if (!this.e && !this.f) {
            View findViewById = findViewById(16908290);
            this.d = grd.a(m(), fuz.a().b().h(), findViewById, getIntent(), this, 0);
            Looper.myQueue().addIdleHandler(new fvb(this));
            final LoadingErrorEmptyView loadingErrorEmptyView = (LoadingErrorEmptyView) ((ViewGroup) findViewById).findViewWithTag(hae.a(new byte[]{(byte) 73, (byte) 106, (byte) 100, (byte) 97, (byte) 108, (byte) 107, (byte) 98, (byte) 64, (byte) 119, (byte) 119, (byte) 106, (byte) 119, (byte) 64, (byte) 104, (byte) 117, (byte) 113, (byte) 124, (byte) 83, (byte) 108, (byte) 96, (byte) 114}));
            if (loadingErrorEmptyView != null) {
                loadingErrorEmptyView.a(new a(this) {
                    final /* synthetic */ MusicFragmentLoaderActivity b;

                    public void a() {
                    }

                    public void b() {
                        loadingErrorEmptyView.setTag(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 96, (byte) 119, (byte) 119, (byte) 106, (byte) 119}));
                    }

                    public void c() {
                        loadingErrorEmptyView.setTag(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 107, (byte) 97, (byte) 96, (byte) 119, (byte) 96, (byte) 97}));
                    }

                    public void d() {
                        loadingErrorEmptyView.setTag(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 107, (byte) 97, (byte) 96, (byte) 119, (byte) 96, (byte) 97}));
                    }

                    public void e() {
                        loadingErrorEmptyView.setTag(hae.a(new byte[]{(byte) 117, (byte) 100, (byte) 98, (byte) 96, (byte) 90, (byte) 119, (byte) 96, (byte) 107, (byte) 97, (byte) 96, (byte) 119, (byte) 96, (byte) 97}));
                    }
                });
            }
            this.e = true;
        }
    }

    public final /* synthetic */ boolean k() {
        if (goq.a(this) && this.d != null) {
            this.d.a();
        }
        return false;
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (!this.f && this.d != null) {
            this.d.b();
        }
    }

    protected void onStop() {
        super.onStop();
        if (!this.f && this.d != null) {
            this.d.b();
        }
    }

    public grd h() {
        return this.d;
    }
}
