package bili.bl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import bl.awb.a;

/* compiled from: BL */
public final class arp extends arf {
    private TextView n;
    private ProgressBar o;
    private a p;
    private v.a q = new v.a(this) {
        final /* synthetic */ arp a;

        {
            this.a = r1;
        }

        public void a(v vVar, int i) {
            this.a.b();
        }
    };

    public arp(View view) {
        super(view);
        this.o = (ProgressBar) view.findViewById(2131298656);
        this.n = (TextView) view.findViewById(2131300554);
        E();
        view.setOnClickListener(new arq(this));
    }

    final /* synthetic */ void a(View view) {
        this.p.b.a(null);
    }

    public void a() {
        super.a();
        this.p.a.a.a(this.q);
        this.p.a.b.a(this.q);
        this.p.a.c.a(this.q);
    }

    public void A() {
        super.A();
        this.p.a.a.b(this.q);
        this.p.a.b.b(this.q);
        this.p.a.c.b(this.q);
    }

    public void a(a aVar) {
        this.p = aVar;
        this.p.a.a.a(this.q);
        b();
    }

    private void b() {
        if (this.p.a.a()) {
            B();
            return;
        }
        boolean c = this.p.a.c();
        boolean b = this.p.a.b();
        if (!c) {
            C();
        } else if (b) {
            E();
        } else {
            D();
        }
    }

    private void B() {
        this.a.setVisibility(0);
        this.o.setVisibility(0);
        this.n.setText(2131692764);
        this.a.setClickable(false);
    }

    private void C() {
        this.a.setVisibility(0);
        this.o.setVisibility(8);
        this.n.setText(2131692762);
        this.a.setClickable(true);
    }

    private void D() {
        this.a.setVisibility(0);
        this.o.setVisibility(8);
        this.n.setText(2131693749);
        this.a.setClickable(false);
    }

    private void E() {
        this.a.setVisibility(8);
        this.a.setClickable(false);
    }

    public static arp a(ViewGroup viewGroup) {
        return new arp(LayoutInflater.from(viewGroup.getContext()).inflate(2131428097, viewGroup, false));
    }
}
