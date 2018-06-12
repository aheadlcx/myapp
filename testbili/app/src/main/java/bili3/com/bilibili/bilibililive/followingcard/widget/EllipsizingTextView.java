package bili3.com.bilibili.bilibililive.followingcard.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import bl.cai;
import bl.cas;
import bl.cbv;
import bl.cbw;
import bl.cbz;
import bl.ccs;
import bl.ej;
import bl.hae;
import com.bilibili.ad.adview.feed.model.AdTag;
import com.bilibili.bilibililive.followingcard.api.entity.AtIndex;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.tencent.connect.common.Constants;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* compiled from: BL */
public class EllipsizingTextView extends TintTextView {
    private static final String b = hae.a(new byte[]{(byte) 43, (byte) 43, (byte) 43, (byte) -22, (byte) -66, (byte) -102, (byte) -22, (byte) -77, (byte) -113});
    protected CharSequence a;
    private a c;
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;

    /* compiled from: BL */
    public interface a {
        void a();

        void b();
    }

    public EllipsizingTextView(Context context) {
        this(context, null);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.g = -1;
        this.h = -1;
        setHighlightColor(ej.c(context, 17170445));
        setMovementMethod(new cbz());
        setFocusable(false);
        setClickable(false);
        setLongClickable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.aY);
        this.h = obtainStyledAttributes.getInt(0, 4);
        obtainStyledAttributes.recycle();
    }

    public int getMaxLines() {
        return this.g;
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.g = i;
        this.f = true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f) {
            super.setEllipsize(null);
            a();
        }
    }

    protected void a() {
        if (!this.d || getLineCount() <= this.h) {
            setText(this.a);
        } else if (this.e) {
            b(c(this.a));
        } else {
            a(new SpannableStringBuilder(this.a).append("  \u6536\u8d77"));
        }
        this.f = false;
    }

    private void a(CharSequence charSequence) {
        this.e = false;
        setMaxLines(AdTag.INVALID_ID);
        CharSequence spannableString = new SpannableString(new SpannableStringBuilder(this.a).append("  \u6536\u8d77"));
        spannableString.setSpan(new ccs(getContext(), new cbv(this, charSequence)), charSequence.length() - 2, charSequence.length(), 33);
        setText(spannableString);
    }

    public final /* synthetic */ void b(CharSequence charSequence, Object obj) {
        b(charSequence);
        if (this.c != null) {
            this.c.b();
        }
    }

    private void b(CharSequence charSequence) {
        this.e = true;
        setMaxLines(this.h);
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new ccs(getContext(), new cbw(this, charSequence)), charSequence.length() - 2, charSequence.length(), 33);
        setText(spannableString);
    }

    public final /* synthetic */ void a(CharSequence charSequence, Object obj) {
        a(charSequence);
        if (this.c != null) {
            this.c.a();
        }
    }

    private CharSequence c(@NonNull CharSequence charSequence) {
        int i = this.h;
        Layout layout = getLayout();
        if (i == -1 || layout.getLineCount() <= i) {
            return charSequence;
        }
        int lineStart = layout.getLineStart(i - 1);
        i = layout.getLineEnd(i - 1);
        TextPaint paint = getPaint();
        float measureText = paint.measureText(hae.a(new byte[]{(byte) 43, (byte) 43, (byte) 43, (byte) -22, (byte) -66, (byte) -102, (byte) -22, (byte) -77, (byte) -113, (byte) 37, (byte) 37}));
        do {
            i--;
            if (i < lineStart) {
                break;
            }
        } while (((float) layout.getWidth()) - Layout.getDesiredWidth(charSequence, lineStart, i, paint) < measureText);
        return new SpannableStringBuilder(charSequence.subSequence(0, i)).append(hae.a(new byte[]{(byte) 43, (byte) 43, (byte) 43, (byte) -22, (byte) -66, (byte) -102, (byte) -22, (byte) -77, (byte) -113}));
    }

    public void setExpandListener(a aVar) {
        this.c = aVar;
    }

    public void setEllipsize(TruncateAt truncateAt) {
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception e) {
            BLog.e(e.getMessage());
        }
    }

    public void a(String str, String str2, boolean z, boolean z2, List<AtIndex> list, bl.ccs.a aVar) {
        this.d = z;
        this.e = z2;
        int i = (z && z2) ? this.h : AdTag.INVALID_ID;
        setMaxLines(i);
        this.a = new SpannableStringBuilder(a(str)).append(cas.a(getContext(), this, str2, list, aVar));
        setText(this.a);
    }

    protected CharSequence a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Constants.STR_EMPTY;
        }
        CharSequence spannableString = new SpannableString(str);
        spannableString.setSpan(new cai(getContext()).a(str), 0, str.length(), 33);
        return spannableString;
    }
}
