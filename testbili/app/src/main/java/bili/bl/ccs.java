package bili.bl;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: BL */
public class ccs extends ClickableSpan {
    protected a a;
    private boolean b;
    private Context c;
    private String d;

    /* compiled from: BL */
    public interface a<E> {
        void a(E e);
    }

    public ccs(Context context, a aVar) {
        this.c = context;
        this.a = aVar;
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void onClick(View view) {
        if (this.a != null && view != null) {
            this.a.a(view);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        int parseColor;
        textPaint.setColor(fnd.a(this.c, 2131099976));
        if (this.b) {
            parseColor = Color.parseColor(hae.a(new byte[]{(byte) 38, (byte) 71, (byte) 51, (byte) 70, (byte) 48, (byte) 65, (byte) 48}));
        } else {
            parseColor = 0;
        }
        textPaint.bgColor = parseColor;
        textPaint.setUnderlineText(false);
    }

    public String b() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }
}
