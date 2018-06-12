package bili3.bl;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.connect.share.QQShare;
import com.tencent.map.geolocation.TencentLocationRequest;
import java.lang.ref.WeakReference;

@RequiresApi(9)
/* compiled from: BL */
public class nb {
    final TextView a;
    private os b;
    private os c;
    private os d;
    private os e;
    @NonNull
    private final nd f;
    private int g = 0;
    private Typeface h;
    private boolean i;

    public static nb a(TextView textView) {
        if (VERSION.SDK_INT >= 17) {
            return new nc(textView);
        }
        return new nb(textView);
    }

    nb(TextView textView) {
        this.a = textView;
        this.f = new nd(this.a);
    }

    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i) {
        ou a;
        ColorStateList colorStateList;
        Context context = this.a.getContext();
        mq a2 = mq.a();
        ou a3 = ou.a(context, attributeSet, a.aG, i, 0);
        int g = a3.g(0, -1);
        if (a3.g(3)) {
            this.b = a(context, a2, a3.g(3, 0));
        }
        if (a3.g(1)) {
            this.c = a(context, a2, a3.g(1, 0));
        }
        if (a3.g(4)) {
            this.d = a(context, a2, a3.g(4, 0));
        }
        if (a3.g(2)) {
            this.e = a(context, a2, a3.g(2, 0));
        }
        a3.a();
        boolean z = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z2 = false;
        Object obj = null;
        ColorStateList colorStateList2 = null;
        ColorStateList colorStateList3 = null;
        if (g != -1) {
            a = ou.a(context, g, a.bU);
            if (!z && a.g(12)) {
                obj = 1;
                z2 = a.a(12, false);
            }
            a(context, a);
            if (VERSION.SDK_INT < 23) {
                if (a.g(3)) {
                    colorStateList2 = a.e(3);
                }
                if (a.g(4)) {
                    colorStateList3 = a.e(4);
                }
                if (a.g(5)) {
                    colorStateList = colorStateList2;
                    colorStateList2 = a.e(5);
                } else {
                    colorStateList = colorStateList2;
                    colorStateList2 = null;
                }
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            a.a();
        } else {
            colorStateList = null;
            colorStateList2 = null;
        }
        a = ou.a(context, attributeSet, a.bU, i, 0);
        if (!z && a.g(12)) {
            obj = 1;
            z2 = a.a(12, false);
        }
        if (VERSION.SDK_INT < 23) {
            if (a.g(3)) {
                colorStateList = a.e(3);
            }
            if (a.g(4)) {
                colorStateList3 = a.e(4);
            }
            if (a.g(5)) {
                colorStateList2 = a.e(5);
            }
        }
        a(context, a);
        a.a();
        if (colorStateList != null) {
            this.a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.a.setLinkTextColor(colorStateList2);
        }
        if (!(z || r0 == null)) {
            a(z2);
        }
        if (this.h != null) {
            this.a.setTypeface(this.h, this.g);
        }
        this.f.a(attributeSet, i);
        if (iv.a && this.f.a() != 0) {
            int[] e = this.f.e();
            if (e.length <= 0) {
                return;
            }
            if (((float) this.a.getAutoSizeStepGranularity()) != -1.0f) {
                this.a.setAutoSizeTextTypeUniformWithConfiguration(this.f.c(), this.f.d(), this.f.b(), 0);
            } else {
                this.a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
            }
        }
    }

    private void a(Context context, ou ouVar) {
        int i = 11;
        this.g = ouVar.a(2, this.g);
        if (ouVar.g(10) || ouVar.g(11)) {
            this.h = null;
            if (!ouVar.g(11)) {
                i = 10;
            }
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.a);
                try {
                    this.h = ouVar.a(i, this.g, new eq.a(this) {
                        final /* synthetic */ nb b;

                        public void a(@NonNull Typeface typeface) {
                            this.b.a(weakReference, typeface);
                        }

                        public void a(int i) {
                        }
                    });
                    this.i = this.h == null;
                } catch (UnsupportedOperationException e) {
                } catch (NotFoundException e2) {
                }
            }
            if (this.h == null) {
                String d = ouVar.d(i);
                if (d != null) {
                    this.h = Typeface.create(d, this.g);
                }
            }
        } else if (ouVar.g(1)) {
            this.i = false;
            switch (ouVar.a(1, 1)) {
                case TencentLocationRequest.REQUEST_LEVEL_NAME /*1*/:
                    this.h = Typeface.SANS_SERIF;
                    return;
                case QQShare.SHARE_TO_QQ_TYPE_AUDIO /*2*/:
                    this.h = Typeface.SERIF;
                    return;
                case TencentLocationRequest.REQUEST_LEVEL_ADMIN_AREA /*3*/:
                    this.h = Typeface.MONOSPACE;
                    return;
                default:
                    return;
            }
        }
    }

    private void a(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.i) {
            this.h = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.g);
            }
        }
    }

    public void a(Context context, int i) {
        ou a = ou.a(context, i, a.bU);
        if (a.g(12)) {
            a(a.a(12, false));
        }
        if (VERSION.SDK_INT < 23 && a.g(3)) {
            ColorStateList e = a.e(3);
            if (e != null) {
                this.a.setTextColor(e);
            }
        }
        a(context, a);
        a.a();
        if (this.h != null) {
            this.a.setTypeface(this.h, this.g);
        }
    }

    void a(boolean z) {
        this.a.setAllCaps(z);
    }

    public void a() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
    }

    final void a(Drawable drawable, os osVar) {
        if (drawable != null && osVar != null) {
            mq.a(drawable, osVar, this.a.getDrawableState());
        }
    }

    protected static os a(Context context, mq mqVar, int i) {
        ColorStateList b = mqVar.b(context, i);
        if (b == null) {
            return null;
        }
        os osVar = new os();
        osVar.d = true;
        osVar.a = b;
        return osVar;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void a(boolean z, int i, int i2, int i3, int i4) {
        if (!iv.a) {
            b();
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void a(int i, float f) {
        if (!iv.a && !c()) {
            b(i, f);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public void b() {
        this.f.f();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean c() {
        return this.f.g();
    }

    private void b(int i, float f) {
        this.f.a(i, f);
    }

    public void a(int i) {
        this.f.a(i);
    }

    public void a(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f.a(i, i2, i3, i4);
    }

    public void a(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.f.a(iArr, i);
    }

    public int d() {
        return this.f.a();
    }

    public int e() {
        return this.f.b();
    }

    public int f() {
        return this.f.c();
    }

    public int g() {
        return this.f.d();
    }

    public int[] h() {
        return this.f.e();
    }
}
