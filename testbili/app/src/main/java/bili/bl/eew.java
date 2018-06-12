package bili.bl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import tv.danmaku.videoplayer.basic.adapter.PlayerScreenMode;

/* compiled from: BL */
public class eew {
    private PopupWindow a;

    public void a(Context context, View view, PlayerScreenMode playerScreenMode, eev bl_eev, OnDismissListener onDismissListener) {
        if (this.a == null) {
            View inflate = LayoutInflater.from(context).inflate(2131428711, null);
            this.a = new PopupWindow(inflate);
            this.a.setWidth(-2);
            this.a.setHeight(-2);
            this.a.setFocusable(true);
            this.a.setOutsideTouchable(true);
            this.a.setBackgroundDrawable(new ColorDrawable(0));
            this.a.setOnDismissListener(onDismissListener);
            View findViewById = inflate.findViewById(2131298872);
            View findViewById2 = inflate.findViewById(2131298863);
            View findViewById3 = inflate.findViewById(2131299688);
            inflate = inflate.findViewById(2131299946);
            findViewById.setOnClickListener(new eex(this));
            findViewById2.setOnClickListener(new eey(this));
            findViewById3.setOnClickListener(new eez(this, bl_eev));
            inflate.setOnClickListener(new efa(this, bl_eev));
            if (playerScreenMode == PlayerScreenMode.VERTICAL_FULLSCREEN) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            } else {
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
            }
        }
        int a = (int) ejq.a(blg.a(), 4.0f);
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        view.getLocationOnScreen(iArr);
        if (playerScreenMode == PlayerScreenMode.VERTICAL_FULLSCREEN) {
            this.a.showAtLocation(view, 51, iArr[0] - a, iArr[1] - rect.height());
        } else {
            this.a.showAtLocation(view, 51, iArr[0] - a, iArr[1] - rect.height());
        }
    }

    final /* synthetic */ void b(View view) {
        this.a.dismiss();
    }

    final /* synthetic */ void a(View view) {
        this.a.dismiss();
    }

    final /* synthetic */ void b(eev bl_eev, View view) {
        if (bl_eev != null) {
            bl_eev.a(this.a, view);
        }
    }

    final /* synthetic */ void a(eev bl_eev, View view) {
        if (bl_eev != null) {
            bl_eev.a(this.a, view);
        }
    }
}
