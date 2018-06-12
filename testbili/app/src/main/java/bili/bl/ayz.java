package bili.bl;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.LinearLayout;
import bl.ays.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BL */
public class ayz extends jp implements OnClickListener {
    private LinearLayout b;
    private ayw c;
    private List<ayu> d = new ArrayList();
    private a e;
    private String f;
    private a g = new a(this) {
        final /* synthetic */ ayz a;

        {
            this.a = r1;
        }

        public boolean a(ayv bl_ayv) {
            this.a.dismiss();
            if (this.a.e != null) {
                return this.a.e.a(bl_ayv);
            }
            return false;
        }
    };

    public ayz(@NonNull Context context) {
        super(context);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427697);
        this.b = (LinearLayout) findViewById(2131299628);
        this.c = new ayw();
        this.c.a(this.g);
        this.c.a(this.d);
        a();
        findViewById(2131296799).setOnClickListener(this);
    }

    private void a() {
        this.b.removeAllViews();
        int a = this.c.a();
        int i = 0;
        while (i < a) {
            b(i);
            if (a > 1 && i != a - 1) {
                b();
            }
            i++;
        }
    }

    private void b(int i) {
        a a = this.c.a(this.b, this.c.b(i));
        this.b.addView(a.a);
        this.c.a(a, i);
    }

    private void b() {
        int i = (int) (this.b.getResources().getDisplayMetrics().density / 2.0f);
        View view = new View(this.b.getContext());
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
        view.setBackgroundResource(2131099888);
        this.b.addView(view, layoutParams);
    }

    protected void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(2131755952);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
    }

    public void a(List<ayu> list, a aVar) {
        this.d = list;
        this.e = aVar;
        show();
    }

    public void onClick(View view) {
        if (view.getId() == 2131296799) {
            if (!TextUtils.isEmpty(this.f)) {
                azb.a(azb.a.a(null, "0", this.f));
            }
            dismiss();
        }
    }

    public void a(String str) {
        this.f = str;
    }
}
