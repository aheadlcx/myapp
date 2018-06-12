package bili3.bl;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveHomePage;
import com.tencent.bugly.BuglyStrategy.a;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: BL */
class ox implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    private static ox i;
    private static ox j;
    private final View a;
    private final CharSequence b;
    private final Runnable c = new Runnable(this) {
        final /* synthetic */ ox a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.a(false);
        }
    };
    private final Runnable d = new Runnable(this) {
        final /* synthetic */ ox a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.a();
        }
    };
    private int e;
    private int f;
    private oy g;
    private boolean h;

    public static void a(View view, CharSequence charSequence) {
        if (i != null && i.a == view) {
            b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (j != null && j.a == view) {
                j.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        ox oxVar = new ox(view, charSequence);
    }

    private ox(View view, CharSequence charSequence) {
        this.a = view;
        this.b = charSequence;
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public boolean onLongClick(View view) {
        this.e = view.getWidth() / 2;
        this.f = view.getHeight() / 2;
        a(true);
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.g == null || !this.h) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                switch (motionEvent.getAction()) {
                    case a.CRASHTYPE_BLOCK /*7*/:
                        if (this.a.isEnabled() && this.g == null) {
                            this.e = (int) motionEvent.getX();
                            this.f = (int) motionEvent.getY();
                            b(this);
                            break;
                        }
                    case BiliLiveHomePage.MODULE_TYPE_AREA_SQUARE /*10*/:
                        a();
                        break;
                    default:
                        break;
                }
            }
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }

    private void a(boolean z) {
        if (ib.G(this.a)) {
            long j;
            b(null);
            if (j != null) {
                j.a();
            }
            j = this;
            this.h = z;
            this.g = new oy(this.a.getContext());
            this.g.a(this.a, this.e, this.f, this.h, this.b);
            this.a.addOnAttachStateChangeListener(this);
            if (this.h) {
                j = 2500;
            } else if ((ib.u(this.a) & 1) == 1) {
                j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.a.removeCallbacks(this.d);
            this.a.postDelayed(this.d, j);
        }
    }

    private void a() {
        if (j == this) {
            j = null;
            if (this.g != null) {
                this.g.a();
                this.g = null;
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (i == this) {
            b(null);
        }
        this.a.removeCallbacks(this.d);
    }

    private static void b(ox oxVar) {
        if (i != null) {
            i.c();
        }
        i = oxVar;
        if (i != null) {
            i.b();
        }
    }

    private void b() {
        this.a.postDelayed(this.c, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void c() {
        this.a.removeCallbacks(this.c);
    }
}
