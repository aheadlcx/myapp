package bili3.com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import bl.hsd;
import bl.hse;
import bl.hsf;
import bl.hsp;
import javax.annotation.Nullable;

/* compiled from: BL */
public class GenericDraweeView extends hsp<hsd> {
    public GenericDraweeView(Context context, hsd bl_hsd) {
        super(context);
        setHierarchy(bl_hsd);
    }

    public GenericDraweeView(Context context) {
        super(context);
        a(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    protected void a(Context context, @Nullable AttributeSet attributeSet) {
        hse a = hsf.a(context, attributeSet);
        setAspectRatio(a.c());
        setHierarchy(a.s());
    }
}
