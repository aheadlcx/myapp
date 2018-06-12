package bili2.bl;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bilibili.lib.ui.menu.FloatMenuWindow.MenuType;
import com.bilibili.magicasakura.widgets.TintImageView;

/* compiled from: BL */
public class fle implements fld {
    @DrawableRes
    private int a;
    private String b;
    private a c;
    private PopupWindow d;

    /* compiled from: BL */
    public interface a {
        void a(View view);
    }

    public fle(@DrawableRes int i, String str, @Nullable a aVar) {
        this.a = i;
        this.b = str;
        this.c = aVar;
    }

    public View a(@Nullable View view, @NonNull ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(2131428054, viewGroup, false);
            view.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ fle a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.d != null && this.a.d.isShowing()) {
                        this.a.d.dismiss();
                    }
                    if (this.a.c != null) {
                        this.a.c.a(view);
                    }
                }
            });
        }
        TintImageView tintImageView = (TintImageView) view.findViewById(2131298784);
        tintImageView.setImageResource(this.a);
        tintImageView.setImageTintList(2131100837);
        ((TextView) view.findViewById(2131298799)).setText(this.b);
        return view;
    }

    public int a() {
        return MenuType.TYPE_NORMAL.ordinal();
    }

    public void a(PopupWindow popupWindow) {
        this.d = popupWindow;
    }
}
