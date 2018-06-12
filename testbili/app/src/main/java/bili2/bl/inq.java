package bili2.bl;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bilibili.boxing.model.entity.BaseMedia;
import com.mall.ui.widget.media.album.subscaleview.SubSamplingScaleImageView;
import java.io.File;
import java.util.List;

/* compiled from: BL */
public class inq extends hw {
    private Context a;
    private List<BaseMedia> b;
    private a c;

    /* compiled from: BL */
    public interface a {
        void a(View view);
    }

    public inq(Context context, List<BaseMedia> list) {
        this.a = context;
        this.b = list;
    }

    public int getCount() {
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = View.inflate(this.a, 2131429230, null);
        SubSamplingScaleImageView subSamplingScaleImageView = (SubSamplingScaleImageView) inflate.findViewById(2131298422);
        subSamplingScaleImageView.setImage(inw.a(Uri.fromFile(new File(((BaseMedia) this.b.get(i)).d()))));
        subSamplingScaleImageView.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ inq a;

            {
                this.a = r1;
            }

            public void onClick(View view) {
                this.a.c.a(view);
            }
        });
        viewGroup.addView(inflate);
        return inflate;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public void a(a aVar) {
        this.c = aVar;
    }
}
