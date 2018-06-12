package bili.bl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: BL */
public class ekh implements eki {
    private ViewGroup a;
    private TextView b;
    private LottieAnimationView c;

    public void a(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (TextView) this.a.findViewById(2131296738);
        if (this.a.findViewById(2131296739) instanceof LottieAnimationView) {
            this.c = (LottieAnimationView) this.a.findViewById(2131296739);
        }
    }

    public void a() {
        if (this.a != null && this.a.getVisibility() != 0) {
            if (this.c != null) {
                this.c.d();
            }
            this.b.setText(2131689768);
            this.a.setVisibility(0);
        }
    }

    public void b() {
        if (this.a != null && this.a.getVisibility() == 0) {
            if (this.c != null) {
                this.c.g();
            }
            this.a.setVisibility(4);
        }
    }

    public boolean c() {
        return this.a != null && this.a.getVisibility() == 0;
    }
}
