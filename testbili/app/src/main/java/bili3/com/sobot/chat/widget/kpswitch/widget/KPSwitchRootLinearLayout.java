package bili3.com.sobot.chat.widget.kpswitch.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import bl.itb;

/* compiled from: BL */
public class KPSwitchRootLinearLayout extends LinearLayout {
    private itb a;

    public KPSwitchRootLinearLayout(Context context) {
        super(context);
        a();
    }

    public KPSwitchRootLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @TargetApi(11)
    public KPSwitchRootLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @TargetApi(21)
    public KPSwitchRootLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        this.a = new itb(this);
    }

    protected void onMeasure(int i, int i2) {
        this.a.a(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }
}
