package bili.bl;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* compiled from: BL */
public class cys extends msz {
    private boolean c;
    private ViewGroup d;
    private ImageView e;
    private TextView f;
    private ImageView g;
    private ProgressBar h;
    private a i;

    /* compiled from: BL */
    interface a {
        boolean a();

        String b();

        int c();

        int d();

        void e();

        void f();
    }

    protected ViewGroup a(Context context, ViewGroup viewGroup) {
        this.d = (ViewGroup) LayoutInflater.from(context).inflate(2131428085, viewGroup, false);
        return this.d;
    }

    protected void a(ViewGroup viewGroup) {
    }

    protected void a() {
        super.a();
        d();
    }

    private void d() {
        if (!this.c) {
            this.e = (ImageView) this.d.findViewById(2131297588);
            this.h = (ProgressBar) this.d.findViewById(2131299436);
            this.f = (TextView) this.d.findViewById(2131300682);
            this.g = (ImageView) this.d.findViewById(2131299300);
            this.c = true;
            this.g.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ cys a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.i != null) {
                        this.a.i.e();
                    }
                }
            });
            this.e.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ cys a;

                {
                    this.a = r1;
                }

                public void onClick(View view) {
                    if (this.a.i != null) {
                        this.a.i.f();
                    }
                }
            });
        }
    }

    protected void a(int i, long j, boolean z) {
        super.a(i, j, z);
        if (this.i != null) {
            a(this.i.d(), this.i.c());
            e();
            a(-1);
        }
    }

    private void a(int i, int i2) {
        if (i >= 0 && i2 > 0) {
            if (i > i2) {
                i = i2;
            }
            if (this.h != null) {
                this.h.setMax(i2);
                this.h.setProgress(i);
            }
        }
    }

    void a(a aVar) {
        Object obj = this.i == aVar ? 1 : null;
        this.i = aVar;
        if (obj == null) {
            o();
        }
    }

    private void e() {
        if (this.i != null) {
            CharSequence b = this.i.b();
            if (b != null && !TextUtils.equals(b.toString(), this.f.getText().toString())) {
                this.f.setText(b);
            }
        }
    }

    private void a(int i) {
        if (this.i != null) {
            int i2 = i == -1 ? this.i.a() ? 1 : 0 : i;
            if (this.g != null) {
                this.g.setImageLevel(i2);
            }
        }
    }
}
