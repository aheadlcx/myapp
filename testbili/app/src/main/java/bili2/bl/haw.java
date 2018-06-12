package bili2.bl;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.TextUtils;

/* compiled from: BL */
public class haw extends FragmentStatePagerAdapter {
    int a = 2;
    Fragment b;
    Fragment c;
    private String[] d = new String[]{"\u89c6\u9891\u622a\u53d6", "\u76f8\u518c\u9009\u62e9"};

    public haw(FragmentManager fragmentManager, String str) {
        super(fragmentManager);
        if (TextUtils.isEmpty(str)) {
            this.b = new hcg();
            this.a = 1;
            return;
        }
        this.b = hfl.a(str);
        this.c = new hcg();
        this.a = 2;
    }

    public CharSequence getPageTitle(int i) {
        return this.d[i];
    }

    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return this.b;
            case 1:
                return this.c;
            default:
                return this.b;
        }
    }

    public int getCount() {
        return this.a;
    }
}
