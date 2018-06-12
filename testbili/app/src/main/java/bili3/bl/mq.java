package bili3.bl;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: BL */
public final class mq {
    private static final Mode a = Mode.SRC_IN;
    private static mq b;
    private static final b c = new b(6);
    private static final int[] d = new int[]{2131230808, 2131230806, 2131230726};
    private static final int[] e = new int[]{2131230750, 2131230790, 2131230757, 2131230752, 2131230753, 2131230756, 2131230755};
    private static final int[] f = new int[]{2131230805, 2131230807, 2131230741, 2131230798, 2131230799, 2131230801, 2131230803, 2131230800, 2131230802, 2131230804};
    private static final int[] g = new int[]{2131230780, 2131230739, 2131230779};
    private static final int[] h = new int[]{2131230796, 2131230809};
    private static final int[] i = new int[]{2131230729, 2131230734};
    private WeakHashMap<Context, hf<ColorStateList>> j;
    private gr<String, c> k;
    private hf<String> l;
    private final Object m = new Object();
    private final WeakHashMap<Context, gx<WeakReference<ConstantState>>> n = new WeakHashMap(0);
    private TypedValue o;
    private boolean p;

    /* compiled from: BL */
    interface c {
        Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme);
    }

    @RequiresApi(11)
    /* compiled from: BL */
    static class a implements c {
        a() {
        }

        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return AnimatedVectorDrawableCompat.createFromXmlInner(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* compiled from: BL */
    static class b extends gy<Integer, PorterDuffColorFilter> {
        public b(int i) {
            super(i);
        }

        PorterDuffColorFilter a(int i, Mode mode) {
            return (PorterDuffColorFilter) a(Integer.valueOf(b(i, mode)));
        }

        PorterDuffColorFilter a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) a(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
        }

        private static int b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* compiled from: BL */
    static class d implements c {
        d() {
        }

        public Drawable a(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Theme theme) {
            try {
                return VectorDrawableCompat.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static mq a() {
        if (b == null) {
            b = new mq();
            a(b);
        }
        return b;
    }

    private static void a(@NonNull mq mqVar) {
        if (VERSION.SDK_INT < 24) {
            mqVar.a("vector", new d());
            mqVar.a("animated-vector", new a());
        }
    }

    public Drawable a(@NonNull Context context, @DrawableRes int i) {
        return a(context, i, false);
    }

    Drawable a(@NonNull Context context, @DrawableRes int i, boolean z) {
        f(context);
        Drawable d = d(context, i);
        if (d == null) {
            d = c(context, i);
        }
        if (d == null) {
            d = ej.a(context, i);
        }
        if (d != null) {
            d = a(context, i, z, d);
        }
        if (d != null) {
            no.b(d);
        }
        return d;
    }

    public void a(@NonNull Context context) {
        synchronized (this.m) {
            gx gxVar = (gx) this.n.get(context);
            if (gxVar != null) {
                gxVar.c();
            }
        }
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable c(@NonNull Context context, @DrawableRes int i) {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        context.getResources().getValue(i, typedValue, true);
        long a = a(typedValue);
        Drawable a2 = a(context, a);
        if (a2 == null) {
            if (i == 2131230740) {
                a2 = new LayerDrawable(new Drawable[]{a(context, 2131230739), a(context, 2131230741)});
            }
            if (a2 != null) {
                a2.setChangingConfigurations(typedValue.changingConfigurations);
                a(context, a, a2);
            }
        }
        return a2;
    }

    private Drawable a(@NonNull Context context, @DrawableRes int i, boolean z, @NonNull Drawable drawable) {
        ColorStateList b = b(context, i);
        if (b != null) {
            if (no.c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = fa.g(drawable);
            fa.a(drawable, b);
            Mode a = a(i);
            if (a == null) {
                return drawable;
            }
            fa.a(drawable, a);
            return drawable;
        } else if (i == 2131230791) {
            r0 = (LayerDrawable) drawable;
            a(r0.findDrawableByLayerId(16908288), op.a(context, 2130968716), a);
            a(r0.findDrawableByLayerId(16908303), op.a(context, 2130968716), a);
            a(r0.findDrawableByLayerId(16908301), op.a(context, 2130968714), a);
            return drawable;
        } else if (i == 2131230782 || i == 2131230781 || i == 2131230783) {
            r0 = (LayerDrawable) drawable;
            a(r0.findDrawableByLayerId(16908288), op.c(context, 2130968716), a);
            a(r0.findDrawableByLayerId(16908303), op.a(context, 2130968714), a);
            a(r0.findDrawableByLayerId(16908301), op.a(context, 2130968714), a);
            return drawable;
        } else if (a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable d(@android.support.annotation.NonNull android.content.Context r10, @android.support.annotation.DrawableRes int r11) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 2;
        r7 = 1;
        r0 = r9.k;
        if (r0 == 0) goto L_0x00c5;
    L_0x0007:
        r0 = r9.k;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00c5;
    L_0x000f:
        r0 = r9.l;
        if (r0 == 0) goto L_0x0030;
    L_0x0013:
        r0 = r9.l;
        r0 = r0.a(r11);
        r0 = (java.lang.String) r0;
        r2 = "appcompat_skip_skip";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x002e;
    L_0x0024:
        if (r0 == 0) goto L_0x0037;
    L_0x0026:
        r2 = r9.k;
        r0 = r2.get(r0);
        if (r0 != 0) goto L_0x0037;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = new bl.hf;
        r0.<init>();
        r9.l = r0;
    L_0x0037:
        r0 = r9.o;
        if (r0 != 0) goto L_0x0042;
    L_0x003b:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r9.o = r0;
    L_0x0042:
        r2 = r9.o;
        r0 = r10.getResources();
        r0.getValue(r11, r2, r7);
        r4 = a(r2);
        r1 = r9.a(r10, r4);
        if (r1 == 0) goto L_0x0057;
    L_0x0055:
        r0 = r1;
        goto L_0x002f;
    L_0x0057:
        r3 = r2.string;
        if (r3 == 0) goto L_0x008f;
    L_0x005b:
        r3 = r2.string;
        r3 = r3.toString();
        r6 = ".xml";
        r3 = r3.endsWith(r6);
        if (r3 == 0) goto L_0x008f;
    L_0x006a:
        r3 = r0.getXml(r11);	 Catch:{ Exception -> 0x0085 }
        r6 = android.util.Xml.asAttributeSet(r3);	 Catch:{ Exception -> 0x0085 }
    L_0x0072:
        r0 = r3.next();	 Catch:{ Exception -> 0x0085 }
        if (r0 == r8) goto L_0x007a;
    L_0x0078:
        if (r0 != r7) goto L_0x0072;
    L_0x007a:
        if (r0 == r8) goto L_0x009b;
    L_0x007c:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0085 }
        r2 = "No start tag found";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0085 }
        throw r0;	 Catch:{ Exception -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        r2 = "AppCompatDrawableManag";
        r3 = "Exception while inflating drawable";
        android.util.Log.e(r2, r3, r0);
    L_0x008f:
        r0 = r1;
    L_0x0090:
        if (r0 != 0) goto L_0x002f;
    L_0x0092:
        r1 = r9.l;
        r2 = "appcompat_skip_skip";
        r1.c(r11, r2);
        goto L_0x002f;
    L_0x009b:
        r0 = r3.getName();	 Catch:{ Exception -> 0x0085 }
        r7 = r9.l;	 Catch:{ Exception -> 0x0085 }
        r7.c(r11, r0);	 Catch:{ Exception -> 0x0085 }
        r7 = r9.k;	 Catch:{ Exception -> 0x0085 }
        r0 = r7.get(r0);	 Catch:{ Exception -> 0x0085 }
        r0 = (bl.mq.c) r0;	 Catch:{ Exception -> 0x0085 }
        if (r0 == 0) goto L_0x00b6;
    L_0x00ae:
        r7 = r10.getTheme();	 Catch:{ Exception -> 0x0085 }
        r1 = r0.a(r10, r3, r6, r7);	 Catch:{ Exception -> 0x0085 }
    L_0x00b6:
        if (r1 == 0) goto L_0x00c3;
    L_0x00b8:
        r0 = r2.changingConfigurations;	 Catch:{ Exception -> 0x0085 }
        r1.setChangingConfigurations(r0);	 Catch:{ Exception -> 0x0085 }
        r0 = r9.a(r10, r4, r1);	 Catch:{ Exception -> 0x0085 }
        if (r0 == 0) goto L_0x00c3;
    L_0x00c3:
        r0 = r1;
        goto L_0x0090;
    L_0x00c5:
        r0 = r1;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.mq.d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable a(@android.support.annotation.NonNull android.content.Context r5, long r6) {
        /*
        r4 = this;
        r2 = 0;
        r3 = r4.m;
        monitor-enter(r3);
        r0 = r4.n;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002b }
        r0 = (bl.gx) r0;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r0.a(r6);	 Catch:{ all -> 0x002b }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0031;
    L_0x0019:
        r1 = r1.get();	 Catch:{ all -> 0x002b }
        r1 = (android.graphics.drawable.Drawable.ConstantState) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r5.getResources();	 Catch:{ all -> 0x002b }
        r0 = r1.newDrawable(r0);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0010;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r0.b(r6);	 Catch:{ all -> 0x002b }
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.mq.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    private boolean a(@NonNull Context context, long j, @NonNull Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.m) {
            gx gxVar = (gx) this.n.get(context);
            if (gxVar == null) {
                gxVar = new gx();
                this.n.put(context, gxVar);
            }
            gxVar.b(j, new WeakReference(constantState));
        }
        return true;
    }

    Drawable a(@NonNull Context context, @NonNull oz ozVar, @DrawableRes int i) {
        Drawable d = d(context, i);
        if (d == null) {
            d = ozVar.a(i);
        }
        if (d != null) {
            return a(context, i, false, d);
        }
        return null;
    }

    static boolean a(@NonNull Context context, @DrawableRes int i, @NonNull Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = a;
        if (a(d, i)) {
            i2 = 2130968716;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(f, i)) {
            i2 = 2130968714;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(g, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == 2131230768) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == 2131230743) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (no.c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(op.a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private void a(@NonNull String str, @NonNull c cVar) {
        if (this.k == null) {
            this.k = new gr();
        }
        this.k.put(str, cVar);
    }

    private static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    static Mode a(int i) {
        if (i == 2131230794) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    ColorStateList b(@NonNull Context context, @DrawableRes int i) {
        ColorStateList e = e(context, i);
        if (e == null) {
            if (i == 2131230744) {
                e = kh.a(context, 2131099675);
            } else if (i == 2131230795) {
                e = kh.a(context, 2131099678);
            } else if (i == 2131230794) {
                e = e(context);
            } else if (i == 2131230733) {
                e = b(context);
            } else if (i == 2131230728) {
                e = c(context);
            } else if (i == 2131230732) {
                e = d(context);
            } else if (i == 2131230792 || i == 2131230793) {
                e = kh.a(context, 2131099677);
            } else if (a(e, i)) {
                e = op.b(context, 2130968716);
            } else if (a(h, i)) {
                e = kh.a(context, 2131099674);
            } else if (a(i, i)) {
                e = kh.a(context, 2131099673);
            } else if (i == 2131230789) {
                e = kh.a(context, 2131099676);
            }
            if (e != null) {
                a(context, i, e);
            }
        }
        return e;
    }

    private ColorStateList e(@NonNull Context context, @DrawableRes int i) {
        if (this.j == null) {
            return null;
        }
        hf hfVar = (hf) this.j.get(context);
        if (hfVar != null) {
            return (ColorStateList) hfVar.a(i);
        }
        return null;
    }

    private void a(@NonNull Context context, @DrawableRes int i, @NonNull ColorStateList colorStateList) {
        if (this.j == null) {
            this.j = new WeakHashMap();
        }
        hf hfVar = (hf) this.j.get(context);
        if (hfVar == null) {
            hfVar = new hf();
            this.j.put(context, hfVar);
        }
        hfVar.c(i, colorStateList);
    }

    private ColorStateList b(@NonNull Context context) {
        return f(context, op.a(context, 2130968713));
    }

    private ColorStateList c(@NonNull Context context) {
        return f(context, 0);
    }

    private ColorStateList d(@NonNull Context context) {
        return f(context, op.a(context, 2130968711));
    }

    private ColorStateList f(@NonNull Context context, @ColorInt int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int a = op.a(context, 2130968715);
        int c = op.c(context, 2130968713);
        r0[0] = op.a;
        r1[0] = c;
        r0[1] = op.d;
        r1[1] = es.a(a, i);
        r0[2] = op.b;
        r1[2] = es.a(a, i);
        r0[3] = op.h;
        r1[3] = i;
        return new ColorStateList(r0, r1);
    }

    private ColorStateList e(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b = op.b(context, 2130968721);
        if (b == null || !b.isStateful()) {
            iArr[0] = op.a;
            iArr2[0] = op.c(context, 2130968721);
            iArr[1] = op.e;
            iArr2[1] = op.a(context, 2130968714);
            iArr[2] = op.h;
            iArr2[2] = op.a(context, 2130968721);
        } else {
            iArr[0] = op.a;
            iArr2[0] = b.getColorForState(iArr[0], 0);
            iArr[1] = op.e;
            iArr2[1] = op.a(context, 2130968714);
            iArr[2] = op.h;
            iArr2[2] = b.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    static void a(Drawable drawable, os osVar, int[] iArr) {
        if (!no.c(drawable) || drawable.mutate() == drawable) {
            if (osVar.d || osVar.c) {
                drawable.setColorFilter(a(osVar.d ? osVar.a : null, osVar.c ? osVar.b : a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static PorterDuffColorFilter a(int i, Mode mode) {
        PorterDuffColorFilter a = c.a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        c.a(i, mode, a);
        return a;
    }

    private static void a(Drawable drawable, int i, Mode mode) {
        if (no.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter(a(i, mode));
    }

    private void f(@NonNull Context context) {
        if (!this.p) {
            this.p = true;
            Drawable a = a(context, 2131230810);
            if (a == null || !a(a)) {
                this.p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private static boolean a(@NonNull Drawable drawable) {
        return (drawable instanceof VectorDrawableCompat) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
}
