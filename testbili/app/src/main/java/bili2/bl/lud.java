package bili2.bl;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.TextView;
import tv.danmaku.bili.ui.video.api.BiliVideoDetail.Tag;
import tv.danmaku.bili.ui.video.widgets.TagExpressView;

/* compiled from: BL */
public class lud extends jp implements OnClickListener {
    private static final String b = hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114});
    private Tag c;
    private View d;
    private TextView e;
    private TextView f;
    private TagExpressView[] g = new TagExpressView[4];
    private a h;
    private TagExpressView i;
    private TagExpressView j;

    /* compiled from: BL */
    public interface a {
        void a(Tag tag);

        void a(Tag tag, TagExpressView tagExpressView, TagExpressView tagExpressView2);

        void b(Tag tag);

        void b(Tag tag, TagExpressView tagExpressView, TagExpressView tagExpressView2);
    }

    public lud(Context context) {
        super(context);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131428161);
        this.d = findViewById(2131296986);
        this.f = (TextView) findViewById(2131300667);
        this.i = (TagExpressView) findViewById(2131298529);
        this.g[0] = this.i;
        this.e = (TextView) findViewById(2131300682);
        this.j = (TagExpressView) findViewById(2131297984);
        this.g[1] = this.j;
        this.g[2] = (TagExpressView) findViewById(2131297304);
        this.g[3] = (TagExpressView) findViewById(2131299688);
    }

    public void a() {
        TagExpressView tagExpressView;
        String str;
        evf c = eva.a(getContext()).c();
        if (c != null) {
            boolean z;
            this.g[0].a(c.r.a >= 1, this.c.hasLike);
            tagExpressView = this.g[1];
            if (c.r.a >= 1) {
                z = true;
            } else {
                z = false;
            }
            tagExpressView.a(z, this.c.hasHate);
            this.g[2].a(true, false);
            tagExpressView = this.g[3];
            if (c.r.a >= 1) {
                z = true;
            } else {
                z = false;
            }
            tagExpressView.a(z, this.c.hasReport);
        } else {
            dismiss();
        }
        this.e.setText(this.c.name.length() > 14 ? this.c.name.substring(0, 14) + "..." : this.c.name);
        tagExpressView = this.g[0];
        int i = this.c.likeNum == 0 ? 2131695119 : 2131695118;
        Object[] objArr = new Object[1];
        if (this.c.likeNum == 0) {
            str = null;
        } else {
            str = mbw.a(this.c.likeNum);
        }
        objArr[0] = str;
        tagExpressView.a(i, objArr);
        tagExpressView = this.g[1];
        i = this.c.hateNum == 0 ? 2131695116 : 2131695115;
        objArr = new Object[1];
        if (this.c.hateNum == 0) {
            str = null;
        } else {
            str = mbw.a(this.c.hateNum);
        }
        objArr[0] = str;
        tagExpressView.a(i, objArr);
        this.g[3].a(this.c.hasReport ? 2131695121 : 2131695122, new Object[0]);
        this.g[0].setOnClickListener(this);
        this.g[1].setOnClickListener(this);
        this.g[2].setOnClickListener(this);
        this.g[3].setOnClickListener(this);
        this.d.setOnClickListener(this);
        if (ktc.a(getContext(), hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114}), true)) {
            ktc.b(getContext(), hae.a(new byte[]{(byte) 110, (byte) 96, (byte) 124, (byte) 90, (byte) 99, (byte) 108, (byte) 119, (byte) 118, (byte) 113, (byte) 90, (byte) 118, (byte) 109, (byte) 106, (byte) 114}), false);
            this.f.setVisibility(0);
            return;
        }
        this.f.setVisibility(8);
    }

    public void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(2131755816);
            window.setGravity(80);
            window.setLayout(-1, -2);
        }
        a();
    }

    public void onDetachedFromWindow() {
        this.g[0].c();
        this.g[1].c();
        this.g[2].c();
        this.g[3].c();
        super.onDetachedFromWindow();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case 2131296986:
                dismiss();
                return;
            default:
                b(view);
                return;
        }
    }

    private void b(View view) {
        if ((view instanceof TagExpressView) && this.h != null) {
            TagExpressView tagExpressView = (TagExpressView) view;
            int id = tagExpressView.getId();
            Resources resources = getContext().getResources();
            switch (id) {
                case 2131297304:
                    if (!tagExpressView.b()) {
                        this.h.a(this.c);
                        return;
                    }
                    return;
                case 2131297984:
                    if (tagExpressView.a()) {
                        this.h.b(this.c, this.i, this.j);
                        return;
                    }
                    esu.b(getContext(), resources.getString(2131695112, new Object[]{Integer.valueOf(1), resources.getString(2131695116)}));
                    return;
                case 2131298529:
                    if (tagExpressView.a()) {
                        this.h.a(this.c, this.i, this.j);
                        return;
                    }
                    esu.b(getContext(), resources.getString(2131695112, new Object[]{Integer.valueOf(1), resources.getString(2131695119)}));
                    return;
                case 2131299688:
                    if (!tagExpressView.a()) {
                        esu.b(getContext(), resources.getString(2131695112, new Object[]{Integer.valueOf(1), resources.getString(2131695122)}));
                        return;
                    } else if (!tagExpressView.b()) {
                        this.h.b(this.c);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public void a(Tag tag) {
        this.c = tag;
    }

    public void a(a aVar) {
        this.h = aVar;
    }
}
