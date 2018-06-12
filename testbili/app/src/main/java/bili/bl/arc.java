package bili.bl;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

/* compiled from: BL */
public final class arc extends fkt implements OnClickListener {
    public static final String a = hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96});
    private TextView b;
    private View c;
    private Fragment d;
    private aqt e;

    public static arc a(String str) {
        arc bl_arc = new arc();
        Bundle bundle = new Bundle();
        bundle.putString(hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96}), str);
        bl_arc.setArguments(bundle);
        return bl_arc;
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(2131427969, viewGroup, false);
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setOnClickListener(this);
        this.b = (TextView) view.findViewById(2131300682);
        this.c = view.findViewById(2131296986);
        this.c.setOnClickListener(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.b.setText(arguments.getString(hae.a(new byte[]{(byte) 113, (byte) 108, (byte) 113, (byte) 105, (byte) 96})));
        }
        if (this.d != null) {
            getChildFragmentManager().beginTransaction().replace(2131297060, this.d, getTag()).commitAllowingStateLoss();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.e);
    }

    public void onClick(View view) {
        if (view == this.c) {
            a();
        }
    }

    public boolean a(FragmentActivity fragmentActivity, FragmentManager fragmentManager, Fragment fragment, String str, @IdRes int i) {
        fragmentManager.executePendingTransactions();
        if (isAdded()) {
            return false;
        }
        if (fragmentActivity != null && (fragmentActivity instanceof fks) && ((fks) fragmentActivity).ae()) {
            return false;
        }
        this.d = fragment;
        fragmentManager.beginTransaction().setCustomAnimations(2130771988, 0).add(i, this, str).commitAllowingStateLoss();
        return true;
    }

    public boolean a() {
        FragmentActivity activity = getActivity();
        if (activity == null || !isAdded()) {
            return false;
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null) {
            return false;
        }
        fragmentManager.executePendingTransactions();
        if (isRemoving()) {
            return false;
        }
        if ((activity instanceof fks) && ((fks) activity).ae()) {
            return false;
        }
        fragmentManager.beginTransaction().setCustomAnimations(0, 2130771989).remove(this).commitAllowingStateLoss();
        return true;
    }

    public void a(aqt bl_aqt) {
        this.e = bl_aqt;
        Object tag = getTag();
        if (this.e != null && !TextUtils.isEmpty(tag) && isAdded()) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            if (childFragmentManager != null) {
                Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(tag);
                if (findFragmentByTag instanceof aqu) {
                    ((aqu) findFragmentByTag).a(bl_aqt);
                }
            }
        }
    }
}
