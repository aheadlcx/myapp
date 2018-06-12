package bili.bl;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

/* compiled from: BL */
public class cwi extends DialogFragment implements OnClickListener {
    a a;
    RadioButton b;
    RadioButton c;
    RadioButton d;
    private Context e;

    /* compiled from: BL */
    public interface a {
        void a(int i);
    }

    public void a(a aVar) {
        this.a = aVar;
    }

    public static cwi a(Context context) {
        cwi bl_cwi = new cwi();
        bl_cwi.e = context;
        return bl_cwi;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        bl.jp.a aVar = new bl.jp.a(this.e, 2131755904);
        View inflate = LayoutInflater.from(this.e).inflate(2131428858, null);
        this.b = (RadioButton) inflate.findViewById(2131299023);
        this.c = (RadioButton) inflate.findViewById(2131299643);
        this.d = (RadioButton) inflate.findViewById(2131298985);
        int i = ceh.c().b;
        if (i == 2) {
            this.b.setChecked(true);
        } else if (i == 1) {
            this.c.setChecked(true);
        } else if (i == 3) {
            this.d.setChecked(true);
        }
        inflate.findViewById(2131296799).setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ cwi a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.dismiss();
            }
        });
        inflate.findViewById(2131296620).setOnClickListener(this);
        inflate.findViewById(2131296621).setOnClickListener(this);
        inflate.findViewById(2131296622).setOnClickListener(this);
        setCancelable(true);
        aVar.b(inflate);
        return aVar.b();
    }

    public void onClick(View view) {
        if (this.a != null) {
            if (view.getId() == 2131296621) {
                this.a.a(2);
            } else if (view.getId() == 2131296622) {
                this.a.a(1);
            } else if (view.getId() == 2131296620) {
                this.a.a(3);
            }
        }
        dismiss();
    }
}
