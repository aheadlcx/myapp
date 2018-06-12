package bili3.com.bilibili.userfeedback.widget;

import android.content.Context;
import android.net.Uri;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import bl.hje;
import com.bilibili.magicasakura.widgets.TintTextView;

public class ClickableSpanTextView extends TintTextView {
    public ClickableSpanTextView(Context context) {
        super(context);
    }

    public ClickableSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickableSpanTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean a(MotionEvent motionEvent) {
        CharSequence text = getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) text;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
            int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
            Layout layout = getLayout();
            x = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(x, x, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    try {
                        if (clickableSpanArr[0] instanceof a) {
                            clickableSpanArr[0].onClick(this);
                        } else if (clickableSpanArr[0] instanceof URLSpan) {
                            hje.a(getContext(), Uri.parse(((URLSpan) clickableSpanArr[0]).getURL()), false);
                        } else {
                            clickableSpanArr[0].onClick(this);
                        }
                        playSoundEffect(0);
                    } catch (Exception e) {
                    }
                } else if (spanned instanceof Spannable) {
                    Selection.setSelection((Spannable) spanned, spanned.getSpanStart(clickableSpanArr[0]), spanned.getSpanEnd(clickableSpanArr[0]));
                }
                return true;
            } else if (spanned instanceof Spannable) {
                Selection.removeSelection((Spannable) spanned);
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (isEnabled() && a(motionEvent)) ? true : super.onTouchEvent(motionEvent);
    }
}
