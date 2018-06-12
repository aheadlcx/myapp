package bili3.com.bilibili.bililive.painting.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import bl.cnn;
import bl.coa;
import bl.fnd;
import com.bilibili.bililive.painting.api.entity.PaintingTag;
import com.tencent.connect.common.Constants;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.util.Collections;
import java.util.List;
import tv.danmaku.bili.widget.FlowLayout;

/* compiled from: BL */
public class PaintingTagFlowLayout extends FlowLayout {
    private a b;

    /* compiled from: BL */
    public interface a {
        void a(View view, PaintingTag paintingTag);

        void b(View view, PaintingTag paintingTag);
    }

    public PaintingTagFlowLayout(Context context) {
        super(context);
    }

    public PaintingTagFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PaintingTagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTagClickListener(a aVar) {
        this.b = aVar;
    }

    public void a(List<PaintingTag> list) {
        Collections.sort(list);
        a((List) list, false, false);
    }

    public void a(List<PaintingTag> list, boolean z, boolean z2) {
        if (list != null) {
            removeAllViews();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null) {
                    addView(b((PaintingTag) list.get(i), z, z2));
                }
            }
            requestLayout();
        }
    }

    public void a(PaintingTag paintingTag, boolean z, boolean z2) {
        addView(b(paintingTag, z, z2), getChildCount());
    }

    private View b(final PaintingTag paintingTag, boolean z, boolean z2) {
        View inflate = LayoutInflater.from(getContext()).inflate(z2 ? 2131429578 : 2131429579, this, false);
        if (inflate != null && (inflate instanceof TagTextView)) {
            TagTextView tagTextView = (TagTextView) inflate;
            tagTextView.setText(paintingTag.text);
            switch (paintingTag.type) {
                case Constants.ERROR_PARAM /*-5*/:
                case Constants.ERROR_JSON /*-4*/:
                    inflate.setBackgroundResource(2131235485);
                    ((TextView) inflate).setTextColor(getResources().getColor(2131101023));
                    break;
                case Constants.UI_NONE /*-1*/:
                    tagTextView.setBackgroundResource(2131235487);
                    if (!cnn.g()) {
                        tagTextView.setTextColor(cnn.a());
                        break;
                    }
                    tagTextView.setTextColor(getResources().getColor(2131100837));
                    break;
                case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                    tagTextView.setBackgroundResource(2131235486);
                    tagTextView.setTextColor(getResources().getColor(2131100842));
                    break;
                case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    tagTextView.setBackgroundResource(2131235484);
                    tagTextView.setTextColor(fnd.a(getContext(), 2131100837));
                    break;
                default:
                    tagTextView.setBackgroundResource(2131235486);
                    tagTextView.setTextColor(getResources().getColor(2131100842));
                    break;
            }
            if (z) {
                tagTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 2131232888, 0);
                tagTextView.setCompoundDrawablePadding(coa.a(getContext(), 4.0f));
                tagTextView.setPadding(tagTextView.getPaddingLeft(), tagTextView.getPaddingTop(), coa.a(getContext(), 8.0f), tagTextView.getPaddingBottom());
                if (this.b != null) {
                    tagTextView.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ PaintingTagFlowLayout a;

                        {
                            this.a = r1;
                        }

                        public void onClick(View view) {
                        }
                    });
                    tagTextView.setDrawableRightListener(new com.bilibili.bililive.painting.widget.TagTextView.a(this) {
                        final /* synthetic */ PaintingTagFlowLayout b;

                        public void a(View view) {
                            this.b.b.b(this.b, paintingTag);
                        }
                    });
                }
            } else {
                tagTextView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                if (this.b != null) {
                    inflate.setOnClickListener(new OnClickListener(this) {
                        final /* synthetic */ PaintingTagFlowLayout b;

                        public void onClick(View view) {
                            this.b.b.a(this.b, paintingTag);
                        }
                    });
                }
            }
        }
        return inflate;
    }
}
