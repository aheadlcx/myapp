package bili2.bl;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;

/* compiled from: BL */
public class llp extends Dialog {
    TextView a = ((TextView) ButterKnife.a(this, 2131298809));
    ImageView b = ((ImageView) ButterKnife.a(this, 2131298111));

    private llp(Context context, CharSequence charSequence, boolean z) {
        super(context);
        Window window = getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.requestFeature(1);
        window.setContentView(LayoutInflater.from(context).inflate(2131428122, null), new LayoutParams(-2, -2));
        this.a.setText(charSequence);
        setCancelable(z);
        setCanceledOnTouchOutside(false);
    }

    public static llp a(Activity activity, CharSequence charSequence, boolean z) {
        llp bl_llp = new llp(activity, charSequence, z);
        bl_llp.show();
        return bl_llp;
    }

    protected void onStart() {
        super.onStart();
        Drawable drawable = this.b.getDrawable();
        if (drawable != null && (drawable instanceof AnimationDrawable)) {
            ((AnimationDrawable) drawable).start();
        }
    }

    protected void onStop() {
        super.onStop();
        Drawable drawable = this.b.getDrawable();
        if (drawable != null && (drawable instanceof AnimationDrawable)) {
            ((AnimationDrawable) drawable).stop();
        }
    }
}
