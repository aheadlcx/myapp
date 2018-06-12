package bili.bl;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.provider.SearchRecentSuggestions;
import android.support.v4.app.FragmentActivity;
import com.bilibili.bililive.videoliveplayer.provider.BiliLiveSearchSuggestionProvider;
import com.bilibili.bililive.videoliveplayer.ui.live.search.LiveSearchActivity;

/* compiled from: BL */
public class eft extends efw {
    public static final String a = eft.class.getSimpleName();

    public static eft a(FragmentActivity fragmentActivity) {
        return (eft) fragmentActivity.getSupportFragmentManager().findFragmentByTag(a);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof LiveSearchActivity) {
            b(false);
        }
    }

    public void a(String str, final Uri uri) {
        if (!g()) {
            if (str != null) {
                b(str);
            }
            j();
            a(new Runnable(this) {
                final /* synthetic */ eft b;

                public void run() {
                    drb.b(this.b.getActivity(), uri.buildUpon().appendQueryParameter(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 111, (byte) 112, (byte) 104, (byte) 117, (byte) 90, (byte) 99, (byte) 119, (byte) 106, (byte) 104}), String.valueOf(23003)).build().toString());
                }
            });
        }
    }

    public void a(final String str) {
        if (!g()) {
            if (str != null) {
                b(str);
            }
            j();
            a(new Runnable(this) {
                final /* synthetic */ eft b;

                public void run() {
                    this.b.startActivity(LiveSearchActivity.a(str, this.b.getActivity()));
                    int b = kri.b(str);
                    if (b > 0) {
                        this.b.a(this.b.getActivity(), b);
                    }
                }
            });
        }
    }

    private void a(FragmentActivity fragmentActivity, int i) {
        if (fragmentActivity != null) {
            fragmentActivity.startActivity(drb.a((Context) fragmentActivity, i, 23003));
        }
    }

    public void b(String str) {
        int a = egr.a(str);
        if (getActivity() != null && a != 1 && a <= 50) {
            new SearchRecentSuggestions(getActivity(), BiliLiveSearchSuggestionProvider.a, 1).saveRecentQuery(str, null);
        }
    }

    protected CharSequence a() {
        return getString(2131692671);
    }

    protected boolean b() {
        return false;
    }

    protected void c() {
    }

    protected void d() {
    }
}
