package bili3.com.bilibili.bililive.videoliveplayer.ui.live.roomv2.buyguard.widget;

import android.content.Context;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl.fnd;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveGuardOrderInfo;

/* compiled from: BL */
public class GuardHeadGroup extends LinearLayout implements OnClickListener {
    private ShimmerLayout a;
    private ShimmerLayout b;
    private ShimmerLayout c;
    private ShimmerImageView d;
    private ShimmerImageView e;
    private ShimmerImageView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private BiliLiveGuardOrderInfo k;
    private a l;
    private int m = 0;

    /* compiled from: BL */
    public interface a {
        void a(int i);
    }

    public void setOnHeaderClickedListener(a aVar) {
        this.l = aVar;
    }

    public GuardHeadGroup(Context context) {
        super(context);
        a(context);
    }

    public GuardHeadGroup(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        setOrientation(1);
        inflate(context, 2131428653, this);
        this.a = (ShimmerLayout) findViewById(2131299983);
        this.a.setOnClickListener(this);
        this.b = (ShimmerLayout) findViewById(2131299984);
        this.b.setOnClickListener(this);
        this.c = (ShimmerLayout) findViewById(2131299985);
        this.c.setOnClickListener(this);
        this.d = (ShimmerImageView) findViewById(2131298096);
        this.e = (ShimmerImageView) findViewById(2131298097);
        this.f = (ShimmerImageView) findViewById(2131298098);
        this.g = (TextView) findViewById(2131300881);
        this.h = (TextView) findViewById(2131300882);
        this.i = (TextView) findViewById(2131300883);
        this.j = (TextView) findViewById(2131300971);
    }

    public void onClick(View view) {
        int i = -1;
        if (view.getId() == 2131299983) {
            i = 1;
        } else if (view.getId() == 2131299984) {
            i = 2;
        } else if (view.getId() == 2131299985) {
            i = 3;
        }
        if (i > 0 && i != this.m && this.l != null) {
            this.l.a(i);
        }
    }

    public void setGuardOrderInfo(BiliLiveGuardOrderInfo biliLiveGuardOrderInfo) {
        this.k = biliLiveGuardOrderInfo;
    }

    public void a(int i) {
        b(this.m);
        c(this.m);
        d(this.m);
        if (this.k == null || this.k.canBuy(i)) {
            this.j.setVisibility(8);
        } else {
            this.j.setVisibility(0);
        }
        if (i == 1) {
            this.d.a();
            this.g.setTextColor(getBrightTextColor());
            this.a.a();
        } else if (i == 2) {
            this.e.a();
            this.h.setTextColor(getBrightTextColor());
            this.b.a();
        } else if (i == 3) {
            this.f.a();
            this.i.setTextColor(getBrightTextColor());
            this.c.a();
        }
        this.m = i;
    }

    private void b(int i) {
        if (i == 1) {
            this.a.b();
        } else if (i == 2) {
            this.b.b();
        } else if (i == 3) {
            this.c.b();
        }
    }

    private void c(int i) {
        if (i == 1) {
            this.d.b();
        } else if (i == 2) {
            this.e.b();
        } else if (i == 3) {
            this.f.b();
        }
    }

    private void d(int i) {
        if (i == 1) {
            this.g.setTextColor(getDimTextColor());
        } else if (i == 2) {
            this.h.setTextColor(getDimTextColor());
        } else if (i == 3) {
            this.i.setTextColor(getDimTextColor());
        }
    }

    @ColorInt
    private int getDimTextColor() {
        return fnd.a(getContext(), 2131100175);
    }

    @ColorInt
    private int getBrightTextColor() {
        return fnd.a(getContext(), 2131100178);
    }
}
