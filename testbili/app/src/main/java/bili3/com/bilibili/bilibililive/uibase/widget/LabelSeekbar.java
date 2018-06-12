package bili3.com.bilibili.bilibililive.uibase.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import bl.cpd;

/* compiled from: BL */
public class LabelSeekbar extends LinearLayout implements OnSeekBarChangeListener {
    private SeekBar a;
    private TextView b;
    private OnSeekBarChangeListener c;
    private boolean d;

    public LabelSeekbar(Context context) {
        super(context);
        a(context, null, 0);
    }

    public LabelSeekbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet, 0);
    }

    public LabelSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        setOrientation(0);
        this.a = new cpd(new ContextThemeWrapper(context, 2131755530), attributeSet, 2131755530);
        this.a.setId(2131300630);
        this.a.setMax(100);
        this.a.setProgress(0);
        this.a.setFocusable(true);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        addView(this.a, layoutParams);
        this.a.setOnSeekBarChangeListener(this);
    }

    public void setSeekbarVisibility(int i) {
        this.a.setVisibility(i);
    }

    public void setProgress(float f) {
        if (f <= 0.0f) {
            this.a.setProgress(0);
            if (!this.d) {
                onProgressChanged(this.a, 0, true);
                this.d = true;
                return;
            }
            return;
        }
        this.a.setProgress((int) (((float) this.a.getMax()) * f));
        this.d = true;
    }

    public void setMax(int i) {
        if (this.a != null) {
            this.a.setMax(i);
        }
    }

    public int getMax() {
        if (this.a != null) {
            return this.a.getMax();
        }
        return 0;
    }

    public void setProgress(int i) {
        if (i <= 0) {
            this.a.setProgress(0);
            if (!this.d) {
                onProgressChanged(this.a, 0, true);
                this.d = true;
            }
        } else if (i >= this.a.getMax()) {
            this.a.setProgress(100);
            if (!this.d) {
                onProgressChanged(this.a, 0, true);
                this.d = true;
            }
        } else {
            this.a.setProgress(i);
            this.d = true;
        }
    }

    public int getProgress() {
        return this.a.getProgress();
    }

    public void setLableText(String str) {
        this.b.setText(str);
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.c = onSeekBarChangeListener;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.c != null) {
            this.c.onProgressChanged(seekBar, i, z);
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (this.c != null) {
            this.c.onStartTrackingTouch(seekBar);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (this.c != null) {
            this.c.onStopTrackingTouch(seekBar);
        }
    }

    public float getPercentage() {
        if (this.a == null || this.a.getProgress() == 0) {
            return 0.0f;
        }
        return ((float) this.a.getProgress()) / ((float) this.a.getMax());
    }

    public void setLabelTextGravity(int i) {
        this.b.setGravity(i);
    }
}
