package bili2.bl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import bl.mfa.a;

/* compiled from: BL */
public abstract class mff<P extends mso> extends mfe<P> {
    private mfa i;
    private a j;
    private View k;

    public mff(boolean z, msi.a aVar) {
        super(z, aVar);
    }

    public void a(View view, @Nullable Bundle bundle) {
        boolean z = this.i != null && this.i.c;
        if (z) {
            l();
        } else {
            Intent intent;
            h();
            Intent e = e();
            if (e == null || bundle == null) {
                intent = e;
            } else {
                intent = new Intent(e);
                intent.putExtras(bundle);
            }
            a(view, intent);
        }
        if (this.c == null || this.d == null) {
            Activity x = x();
            if (x != null) {
                x.finish();
                return;
            }
        }
        if (this.e == null) {
            this.e = b(view, this.f);
        }
        this.e.a(this.c, z);
        this.e.a(this.d, z);
        this.e.a(this.b);
        this.e.a(this.g);
        this.e.a(view, bundle);
        this.k = view;
    }

    public void p_() {
        super.p_();
        if (this.i != null && this.j != null) {
            this.i.b(this.j);
        }
    }

    public void a(mfa bl_mfa) {
        d(bl_mfa);
        a(this.k, null);
        a(null);
        s();
    }

    public void d(mfa bl_mfa) {
        if (bl_mfa != null) {
            if (this.j == null) {
                this.j = new a(this) {
                    final /* synthetic */ mff a;

                    {
                        this.a = r1;
                    }

                    public void a() {
                        this.a.f();
                    }
                };
            }
            bl_mfa.a(this.j);
            this.c = bl_mfa.a;
            this.d = bl_mfa.b;
            this.i = bl_mfa;
        }
    }

    protected void l() {
        mst.a(p()).a(hae.a(new byte[]{(byte) 117, (byte) 119, (byte) 96, (byte) 99, (byte) 90, (byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119, (byte) 90, (byte) 96, (byte) 107, (byte) 100, (byte) 103, (byte) 105, (byte) 96, (byte) 90, (byte) 115, (byte) 96, (byte) 119, (byte) 113, (byte) 108, (byte) 102, (byte) 100, (byte) 105, (byte) 90, (byte) 117, (byte) 105, (byte) 100, (byte) 124, (byte) 96, (byte) 119}), Boolean.valueOf(this.h));
    }

    private void f() {
        if (this.i != null) {
            this.e.a(this.i.a, this.i.c);
            this.e.a(this.i.b, this.i.c);
        }
    }
}
