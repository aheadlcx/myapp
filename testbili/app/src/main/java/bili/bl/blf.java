package bili.bl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bilibili.bangumi.widget.viewpager.PullToRefreshBase.Mode;
import com.bilibili.bangumi.widget.viewpager.PullToRefreshBase.Orientation;
import com.bilibili.upper.videoup.model.TaskStep;
import tv.danmaku.frontia.SyncPluginManager;

@SuppressLint({"ViewConstructor"})
/* compiled from: BL */
public class blf extends FrameLayout {
    static final Interpolator a = new LinearInterpolator();
    protected final ImageView b;
    protected float c;
    protected final Mode d;
    protected final Orientation e;
    private FrameLayout f;

    /* compiled from: BL */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Mode.values().length];
        static final /* synthetic */ int[] b = new int[Orientation.values().length];

        static {
            try {
                b[Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[Mode.PULL_FROM_START.ordinal()] = 1;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[Mode.PULL_FROM_END.ordinal()] = 2;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public blf(Context context, Mode mode, Orientation orientation) {
        super(context);
        this.d = mode;
        this.e = orientation;
        if (orientation == Orientation.HORIZONTAL) {
            switch (AnonymousClass1.a[mode.ordinal()]) {
                case TaskStep.TASK_STEP_TWO /*2*/:
                    LayoutInflater.from(context).inflate(2131428169, this);
                    break;
                default:
                    LayoutInflater.from(context).inflate(2131428168, this);
                    break;
            }
        }
        this.f = (FrameLayout) findViewById(2131297732);
        this.b = (ImageView) this.f.findViewById(2131300655);
        this.c = (float) (bbx.a(getContext(), 24.0f) + this.b.getWidth());
        LayoutParams layoutParams = (LayoutParams) this.f.getLayoutParams();
        switch (AnonymousClass1.a[mode.ordinal()]) {
            case TaskStep.TASK_STEP_TWO /*2*/:
                layoutParams.gravity = orientation == Orientation.VERTICAL ? 48 : 3;
                break;
            default:
                layoutParams.gravity = orientation == Orientation.VERTICAL ? 80 : 5;
                break;
        }
        a();
    }

    public final void setHeight(int i) {
        getLayoutParams().height = i;
        requestLayout();
    }

    public final void setWidth(int i) {
        getLayoutParams().width = i;
        requestLayout();
    }

    public final int getContentSize() {
        switch (AnonymousClass1.b[this.e.ordinal()]) {
            case SyncPluginManager.Mode.UPDATE /*1*/:
                return this.f.getWidth();
            default:
                return this.f.getHeight();
        }
    }

    public final void a(float f) {
        float width = ((((float) this.f.getWidth()) * f) - ((float) bbx.a(getContext(), 24.0f))) - ((float) this.b.getWidth());
        if (width > 0.0f) {
            this.b.setTranslationX(((float) (this.d == Mode.PULL_FROM_START ? -1 : 1)) * width);
        } else {
            this.b.setTranslationX(0.0f);
        }
    }

    public final void a() {
        this.b.setVisibility(0);
    }
}
