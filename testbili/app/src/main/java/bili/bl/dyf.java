package bili.bl;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import bl.jp.a;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveJoinStormBeats;

/* compiled from: BL */
public class dyf extends DialogFragment {
    public static final String a = hae.a(new byte[]{(byte) 73, (byte) 108, (byte) 115, (byte) 96, (byte) 71, (byte) 96, (byte) 100, (byte) 113, (byte) 118, (byte) 87, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113, (byte) 65, (byte) 108, (byte) 100, (byte) 105, (byte) 106, (byte) 98, (byte) 67, (byte) 119, (byte) 100, (byte) 98, (byte) 104, (byte) 96, (byte) 107, (byte) 113});
    private static final String b = hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113});
    private static final String c = hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 106, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107});
    private int d;
    private int e;
    private boolean f;

    public static dyf a(BiliLiveJoinStormBeats biliLiveJoinStormBeats, boolean z) {
        dyf bl_dyf = new dyf();
        Bundle bundle = new Bundle();
        bundle.putParcelable(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}), biliLiveJoinStormBeats);
        bundle.putBoolean(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 106, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), z);
        bl_dyf.setArguments(bundle);
        return bl_dyf;
    }

    public Dialog onCreateDialog(Bundle bundle) {
        BiliLiveJoinStormBeats biliLiveJoinStormBeats = (BiliLiveJoinStormBeats) getArguments().getParcelable(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 119, (byte) 96, (byte) 118, (byte) 112, (byte) 105, (byte) 113}));
        this.f = getArguments().getBoolean(hae.a(new byte[]{(byte) 96, (byte) 125, (byte) 113, (byte) 119, (byte) 100, (byte) 90, (byte) 106, (byte) 119, (byte) 108, (byte) 96, (byte) 107, (byte) 113, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), false);
        View inflate = LayoutInflater.from(getActivity()).inflate(2131427689, null);
        ImageView imageView = (ImageView) inflate.findViewById(2131297881);
        TextView textView = (TextView) inflate.findViewById(2131297886);
        TextView textView2 = (TextView) inflate.findViewById(2131297888);
        ((TextView) inflate.findViewById(2131299708)).setText(biliLiveJoinStormBeats.mMobileContent);
        fci.g().a(biliLiveJoinStormBeats.mGiftImg, imageView);
        textView.setText(biliLiveJoinStormBeats.mGiftName);
        textView2.setText("x" + biliLiveJoinStormBeats.mGiftNum);
        a aVar = new a(getActivity());
        aVar.b(inflate);
        aVar.a(2131692261, new OnClickListener(this) {
            final /* synthetic */ dyf a;

            {
                this.a = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.a.dismissAllowingStateLoss();
            }
        });
        return aVar.b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    public void onResume() {
        super.onResume();
        a();
    }

    private void a() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.d = displayMetrics.widthPixels;
        this.e = displayMetrics.heightPixels;
        this.f = this.d > this.e;
        Window window;
        if (this.f) {
            window = getDialog().getWindow();
            window.setLayout((this.d * 3) / 5, -2);
            window.setGravity(17);
        } else {
            window = getDialog().getWindow();
            window.setLayout(-2, -2);
            window.setGravity(17);
        }
        if (getDialog() != null) {
            getDialog().setCanceledOnTouchOutside(false);
        }
    }
}
