package bili.bl;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* compiled from: BL */
public abstract class ats extends ClickableSpan {
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
