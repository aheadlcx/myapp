package bili.bl;

import android.content.Context;
import android.support.v7.widget.RecyclerView.u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: BL */
public abstract class cty {
    private int a = 2;
    private View b;
    private View c;
    private Context d;
    protected a e;
    private b f;
    private boolean g = true;

    /* compiled from: BL */
    class a extends FrameLayout {
        protected int a = 2;
        final /* synthetic */ cty b;
        private jl c;
        private View d;
        private View e;
        private int f;
        private int g;
        private int h = 2;
        private float i = 0.2f;

        /* compiled from: BL */
        class a extends bl.jl.a {
            final /* synthetic */ a a;

            public a(a aVar) {
                this.a = aVar;
            }

            public boolean a(View view, int i) {
                return view == this.a.d;
            }

            public void b(int i, int i2) {
                this.a.c.a(this.a.d, i2);
                if (this.a.g != 0) {
                    this.a.e.setVisibility(8);
                }
            }

            public void a(View view, int i, int i2, int i3, int i4) {
                if (i != this.a.f) {
                    if (this.a.e.getVisibility() == 8) {
                        this.a.e.setVisibility(0);
                    }
                } else if (this.a.e.getVisibility() == 0) {
                    this.a.e.setVisibility(8);
                }
                this.a.invalidate();
            }

            public void a(View view, float f, float f2) {
                super.a(view, f, f2);
                if (view == this.a.d) {
                    int e;
                    if (this.a.h == 1) {
                        if (this.a.d.getLeft() < ((int) (((float) this.a.g) * this.a.i)) || this.a.a == 1) {
                            e = this.a.f;
                            this.a.a = 2;
                        } else {
                            e = this.a.g;
                            this.a.a = 1;
                        }
                    } else if (this.a.d.getLeft() > (-((int) (((float) this.a.g) * this.a.i))) || this.a.a == 1) {
                        e = this.a.f;
                        this.a.a = 2;
                    } else {
                        e = this.a.g * -1;
                        this.a.a = 1;
                    }
                    if (this.a.c.a(this.a.d, e, 0)) {
                        ib.c(this.a);
                    }
                    this.a.invalidate();
                }
            }

            public int b(View view, int i, int i2) {
                if (this.a.h == 1) {
                    if (i > this.a.g && i2 > 0) {
                        return this.a.g;
                    }
                    if (i >= 0 || i2 >= 0) {
                        return i;
                    }
                    return 0;
                } else if (i > 0 && i2 > 0) {
                    return 0;
                } else {
                    if (i >= (-this.a.g) || i2 >= 0) {
                        return i;
                    }
                    return -this.a.g;
                }
            }

            public int b(View view) {
                return this.a.d == view ? view.getWidth() : 0;
            }

            public int a(View view) {
                return this.a.d == view ? view.getHeight() : 0;
            }
        }

        public a(cty bl_cty, Context context) {
            this.b = bl_cty;
            super(context);
            c();
        }

        public void a(View view, View view2) {
            this.d = view;
            this.e = view2;
            this.f = 0;
            addView(a(view2));
            addView(view);
        }

        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (i != 0) {
                this.g = this.e.getWidth();
            }
        }

        private View a(View view) {
            View linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new LayoutParams(-1, -2));
            linearLayout.setGravity(this.h == 2 ? 8388613 : 8388611);
            linearLayout.addView(view);
            return linearLayout;
        }

        private void c() {
            int i = 2;
            this.c = jl.a((ViewGroup) this, 1.0f, new a(this));
            jl jlVar = this.c;
            if (this.h != 2) {
                i = 1;
            }
            jlVar.a(i);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.a == 2) {
                this.e.setVisibility(8);
            }
            if (this.b.g) {
                return this.c.a(motionEvent);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.b.g) {
                this.c.b(motionEvent);
            }
            return true;
        }

        public void computeScroll() {
            super.computeScroll();
            if (this.c.a(true)) {
                ib.c(this);
            }
        }

        public void a(int i) {
            int i2 = 2;
            this.h = i;
            jl jlVar = this.c;
            if (i != 2) {
                i2 = 1;
            }
            jlVar.a(i2);
        }

        public void a() {
            int i = this.h == 1 ? this.g : this.g * -1;
            this.a = 1;
            if (this.c.a(this.d, i, 0)) {
                ib.c(this);
            }
            invalidate();
        }

        public void b() {
            this.a = 2;
            if (this.c.a(this.d, this.f, 0)) {
                ib.c(this);
            }
            invalidate();
        }
    }

    /* compiled from: BL */
    public class b extends u {
        public cty n;
        final /* synthetic */ cty o;

        public b(cty bl_cty, cty bl_cty2, View view) {
            this.o = bl_cty;
            super(view);
            this.n = bl_cty2;
            bl_cty.a(view);
        }
    }

    public abstract void a(View view);

    public cty(Context context, View view, View view2) {
        this.b = view;
        this.c = view2;
        this.d = context;
        f();
    }

    private void f() {
        this.e = new a(this, this.d);
        this.e.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.e.a(this.a);
        this.e.a(this.c, this.b);
        this.f = new b(this, this, this.e);
    }

    public void a() {
        this.g = true;
    }

    public void b() {
        this.g = false;
    }

    public void c() {
        this.e.b();
    }

    public void d() {
        this.e.a();
    }

    public b e() {
        return this.f;
    }

    public static cty a(u uVar) {
        return ((b) uVar).n;
    }
}
