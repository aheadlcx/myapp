package bili4.tv.danmaku.biliplayer.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import bl.hae;

/* compiled from: BL */
public class SidePanel extends LinearLayout {
    private LinearLayout a;
    private TextView b;

    public SidePanel(Context context) {
        super(context);
        a(context);
    }

    public SidePanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    @SuppressLint({"NewApi"})
    public SidePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    private void a(Context context) {
        a();
    }

    private void a() {
        if (this.a == null) {
            this.a = (LinearLayout) ((LayoutInflater) getContext().getSystemService(hae.a(new byte[]{(byte) 105, (byte) 100, (byte) 124, (byte) 106, (byte) 112, (byte) 113, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 105, (byte) 100, (byte) 113, (byte) 96, (byte) 119}))).inflate(2131428508, this, false);
            addViewInLayout(this.a, 0, new LayoutParams(-1, -2));
            this.b = (TextView) this.a.findViewById(2131300682);
        }
    }

    public void setTilte(String str) {
        this.b.setText(str);
    }

    public void setTilte(int i) {
        this.b.setText(getResources().getString(i));
    }
}
