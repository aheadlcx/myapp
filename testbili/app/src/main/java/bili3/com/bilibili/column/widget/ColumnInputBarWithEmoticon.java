package bili3.com.bilibili.column.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bilibili.app.comm.comment.widget.input.InputBarWithEmoticon;

/* compiled from: BL */
public class ColumnInputBarWithEmoticon extends InputBarWithEmoticon {
    public ColumnInputBarWithEmoticon(Context context) {
        super(context);
    }

    public ColumnInputBarWithEmoticon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ColumnInputBarWithEmoticon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void c() {
        this.f.setImageDrawable(getResources().getDrawable(2131231251));
        this.f.setImageTintList(2131100837);
    }

    protected void b() {
        this.f.setImageDrawable(getResources().getDrawable(2131231250));
        this.f.setImageTintList(2131100837);
    }
}
