package bili.bl;

import android.support.graphics.drawable.animated.BuildConfig;
import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: BL */
public class dfu implements InputFilter {
    private a a;

    /* compiled from: BL */
    public interface a {
        void a();
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            int type = Character.getType(charSequence.charAt(i));
            if (type == 19 || type == 28) {
                if (this.a != null) {
                    this.a.a();
                }
                return BuildConfig.VERSION_NAME;
            }
            i++;
        }
        return null;
    }
}
