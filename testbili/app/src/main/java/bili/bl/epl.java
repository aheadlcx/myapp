package bili.bl;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bilibili.magicasakura.widgets.TintLinearLayout;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.facebook.drawee.view.StaticImageView;
import tv.danmaku.bili.widget.Banner.b;

/* compiled from: BL */
public abstract class epl<T> extends b {
    private int a;
    public T b;

    public abstract String a();

    public epl(T t) {
        this.b = t;
        if (err.a(0, 2) == 0) {
            this.a = 2131234254;
        } else {
            this.a = 2131234254;
        }
    }

    public void a(View view) {
        b(view);
    }

    public View a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131428567, viewGroup, false);
        b(inflate);
        return inflate;
    }

    protected void b(final View view) {
        fci.g().a(a(), (StaticImageView) view.findViewById(2131298159), new fcm(this) {
            final /* synthetic */ epl b;

            public void a(String str, View view, Bitmap bitmap) {
                super.a(str, view, bitmap);
                this.b.d(view);
                view.setClickable(true);
            }

            public void a(String str, View view, String str2) {
                super.a(str, view, str2);
                this.b.c(view);
                view.setClickable(false);
            }
        });
    }

    private void c(final View view) {
        View inflate;
        View findViewById = view.findViewById(2131297565);
        if (findViewById instanceof ViewStub) {
            inflate = ((ViewStub) findViewById).inflate();
        } else {
            inflate = view.findViewById(2131297566);
        }
        ImageView imageView = (ImageView) inflate.findViewById(2131297570);
        TintTextView tintTextView = (TintTextView) inflate.findViewById(2131299709);
        ((TintLinearLayout) inflate).tint();
        inflate.setVisibility(0);
        imageView.setImageResource(this.a);
        tintTextView.tint();
        tintTextView.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ epl b;

            public void onClick(View view) {
                this.b.d(view);
                this.b.b(view);
            }
        });
    }

    private void d(View view) {
        if (!(view.findViewById(2131297565) instanceof ViewStub)) {
            view.findViewById(2131297566).setVisibility(8);
        }
    }

    public String b() {
        return null;
    }
}
