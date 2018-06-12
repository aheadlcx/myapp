package bili.bl;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.graphics.drawable.animated.BuildConfig;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.bilibililive.followingcard.trace.util.FollowingDuration;
import com.bilibili.bilibililive.followingcard.trace.util.FollowingTraceStatus;
import com.bilibili.lib.account.subscribe.Topic;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class brm extends fkt implements fal, fas {
    private int a = -1;
    private bqo b;
    private Fragment c;
    private long d;
    private evl e;

    /* compiled from: BL */
    public static class a extends far {
        private ezt a = bro.a;

        public /* synthetic */ Object b(fjg bl_fjg) {
            return a(bl_fjg);
        }

        public fat a(fjg bl_fjg) {
            Context context = bl_fjg.c;
            List arrayList = new ArrayList(1);
            arrayList.add(new bsc(context));
            return new bl.fat.a().a(brm.class).a(this.a).a(arrayList).a(true).a();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131428905, viewGroup, false);
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(null);
        FollowingTraceStatus.INSTANCE.a(eva.a(getContext()).a());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.e = new brn(this);
        eva.a(getContext()).a(Topic.SIGN_OUT, this.e);
    }

    final /* synthetic */ void a(Topic topic) {
        if (topic == Topic.SIGN_OUT && this.b != null) {
            this.b.a(getApplicationContext());
        }
    }

    public void onResume() {
        super.onResume();
        FollowingTraceStatus.INSTANCE.a(eva.a(getContext()).a());
        if (this.a == -1) {
            if (eva.a(getContext()).a()) {
                a(1);
                this.a = 1;
                return;
            }
            a(0);
            this.a = 0;
        } else if ((this.a == 0 && eva.a(getContext()).a()) || (this.a == 1 && this.d != eva.a(getContext()).i() && eva.a(getContext()).i() > 0)) {
            a(1);
            this.a = 1;
        } else if (this.a == 1 && !eva.a(getContext()).a()) {
            a(0);
            this.a = 0;
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.e != null) {
            eva.a(getContext()).b(Topic.SIGN_OUT, this.e);
            this.e = null;
        }
    }

    private void a(int i) {
        btd.a().g();
        if (i == 0) {
            this.c = bsd.a(false, this.d, 30);
            if (this.b == null) {
                this.b = new bqo();
            }
        } else {
            this.d = eva.a(getContext()).i();
            this.c = bry.a();
            cbk.a(new cbj(hae.a(new byte[]{(byte) 97, (byte) 113, (byte) 90, (byte) 105, (byte) 106, (byte) 98, (byte) 108, (byte) 107, (byte) 90, (byte) 118, (byte) 112, (byte) 102, (byte) 102, (byte) 96, (byte) 96, (byte) 97})).a("sum", BuildConfig.VERSION_NAME));
        }
        getChildFragmentManager().beginTransaction().replace(2131297830, this.c).commit();
    }

    public void c() {
        brc.b(getContext());
        FollowingDuration.INSTANCE.b();
    }

    public void b() {
        if (eva.a(getContext()).a() && getActivity().getWindow() != null) {
            brc.a(getContext());
        }
        if (eva.a(getContext()).a()) {
            cbk.a(new cbj(hae.a(new byte[]{(byte) 97, (byte) 113, (byte) 90, (byte) 113, (byte) 100, (byte) 103, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114})).a("sum", BuildConfig.VERSION_NAME));
        } else {
            cbk.a(new cbj(hae.a(new byte[]{(byte) 97, (byte) 113, (byte) 90, (byte) 113, (byte) 100, (byte) 103, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114})).a("off", BuildConfig.VERSION_NAME));
        }
        brf.b();
        FollowingDuration.INSTANCE.a();
        FollowingDuration.INSTANCE.e();
    }

    public void v_() {
        brf.b();
        if (this.c != null && (this.c instanceof bry)) {
            ((bry) this.c).b();
        }
        cbk.a(hae.a(new byte[]{(byte) 97, (byte) 113, (byte) 90, (byte) 103, (byte) 106, (byte) 113, (byte) 113, (byte) 106, (byte) 104, (byte) 90, (byte) 97, (byte) 106, (byte) 112, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), null);
    }

    @Nullable
    public fal a() {
        return this;
    }

    public void onStart() {
        super.onStart();
        FollowingDuration.INSTANCE.e();
    }

    public void onStop() {
        super.onStop();
        FollowingDuration.INSTANCE.d();
    }
}
