package bili.bl;

import android.os.Handler;
import android.os.Looper;
import android.support.graphics.drawable.animated.BuildConfig;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: BL */
public class bvc implements OnClickListener {
    private EditText a;
    private View b;
    private View c;
    private b d;
    private a e;

    /* compiled from: BL */
    public interface b {
        void a(CharSequence charSequence);
    }

    /* compiled from: BL */
    public interface a {
        void a();
    }

    public bvc(EditText editText, View view, View view2) {
        this.a = editText;
        this.b = view;
        this.c = view2;
        b();
    }

    public void a(b bVar) {
        this.d = bVar;
    }

    public void a(a aVar) {
        this.e = aVar;
    }

    private void b() {
        if (this.a != null) {
            this.a.addTextChangedListener(new TextWatcher(this) {
                final /* synthetic */ bvc a;

                {
                    this.a = r1;
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (this.a.b == null) {
                        return;
                    }
                    if (TextUtils.isEmpty(charSequence)) {
                        this.a.b.setVisibility(8);
                    } else {
                        this.a.b.setVisibility(0);
                    }
                }

                public void afterTextChanged(Editable editable) {
                    if (this.a.d != null) {
                        this.a.d.a(editable);
                    }
                }
            });
            this.a.setOnEditorActionListener(new bvd(this));
            new Handler(Looper.getMainLooper()).postDelayed(new bve(this), 200);
        }
        if (this.c != null) {
            this.c.setOnClickListener(this);
        }
        if (this.b != null) {
            this.b.setOnClickListener(this);
        }
    }

    final /* synthetic */ boolean a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        cog.a((View) textView);
        if (this.d != null) {
            this.d.a(this.a.getText());
        }
        return true;
    }

    final /* synthetic */ void a() {
        cog.a(this.a);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == 2131299839) {
            this.a.setText(BuildConfig.VERSION_NAME);
        } else if (id == 2131296803 && this.e != null) {
            this.e.a();
        }
    }
}
