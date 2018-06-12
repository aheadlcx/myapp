package bili3.com.bilibili.bililive.xplayer.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import bl.ekk;
import bl.hae;
import bl.krh;

/* compiled from: BL */
public class GestureView extends View {
    private static final String a = hae.a(new byte[]{(byte) 66, (byte) 96, (byte) 118, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114});
    private a b;
    private ekk c;
    private boolean d = true;
    private boolean e = true;
    private b f;
    private bl.ekk.b g = new bl.ekk.b(this) {
        final /* synthetic */ GestureView a;

        {
            this.a = r1;
        }

        public void a(MotionEvent motionEvent) {
            krh.d(hae.a(new byte[]{(byte) 66, (byte) 96, (byte) 118, (byte) 113, (byte) 112, (byte) 119, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114}), hae.a(new byte[]{(byte) 65, (byte) 106, (byte) 112, (byte) 103, (byte) 105, (byte) 96, (byte) 37, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110, (byte) 37, (byte) 114, (byte) 108, (byte) 113, (byte) 109, (byte) 37, (byte) 113, (byte) 114, (byte) 106, (byte) 37, (byte) 99, (byte) 108, (byte) 107, (byte) 98, (byte) 96, (byte) 119, (byte) 118}));
            if (this.a.f != null) {
                this.a.f.w();
            }
        }
    };

    /* compiled from: BL */
    static class a extends GestureDetector {
        private final a a;
        private boolean b = true;

        /* compiled from: BL */
        public static class a extends SimpleOnGestureListener {
            private final int a;
            private final int b;
            private boolean c;
            private boolean d;
            private boolean e;
            private b f;
            private float g = 0.0f;
            private int h = -1;
            private boolean i = true;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            public boolean a(MotionEvent motionEvent) {
                boolean z;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x >= ((float) this.a) * 0.1f || y >= ((float) this.b) * 0.3f) {
                    z = false;
                } else {
                    z = true;
                }
                if (x > ((float) this.a) * 0.9f && y < ((float) this.b) * 0.3f) {
                    z = true;
                }
                b(z);
                if (this.d) {
                    this.d = false;
                }
                if (this.c) {
                    this.c = false;
                }
                return false;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (this.f != null) {
                    return this.f.q();
                }
                return super.onSingleTapConfirmed(motionEvent);
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (this.f != null) {
                    return this.f.r();
                }
                return super.onDoubleTap(motionEvent);
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (a(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }

            public void onLongPress(MotionEvent motionEvent) {
                if (this.f != null) {
                    this.f.c(motionEvent);
                }
            }

            private final boolean a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                float x = motionEvent.getX();
                if (x < ((float) this.a) * 0.01f || x > ((float) this.a) * 0.95f) {
                    return true;
                }
                x = motionEvent.getY();
                if (x < ((float) this.b) * 0.1f || x > ((float) this.b) * 0.95f) {
                    return true;
                }
                x = Math.abs(f2) - Math.abs(f);
                boolean c = x > 0.0f ? c(motionEvent, motionEvent2, f, f2) : x < 0.0f ? b(motionEvent, motionEvent2, f, f2) : false;
                if (c) {
                    return true;
                }
                return false;
            }

            private final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!this.c && this.i) {
                    float a = a(motionEvent, motionEvent2);
                    if (Math.abs(a) >= 0.02f || this.e) {
                        boolean z;
                        int max = Math.max(motionEvent.getPointerCount(), motionEvent2.getPointerCount());
                        if (!this.e) {
                            a(a);
                        }
                        float x = motionEvent2.getX();
                        float y = motionEvent2.getY();
                        if (x >= ((float) this.a) * 0.1f || y >= ((float) this.b) * 0.3f) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (x > ((float) this.a) * 0.9f && y < ((float) this.b) * 0.3f) {
                            z = true;
                        }
                        a(a, max, z);
                        if (!this.d) {
                            this.d = true;
                        }
                    }
                }
                return false;
            }

            private void a(float f) {
                this.g = f;
                this.e = true;
                a(1);
            }

            private void a(float f, int i, boolean z) {
                this.g = f;
                a(1, f, true, i, z);
                b();
            }

            private void b(boolean z) {
                if (this.d || this.c) {
                    this.e = false;
                    a(this.h, this.g, z);
                    a();
                }
            }

            private void b() {
                this.e = true;
            }

            public void a() {
                this.e = false;
            }

            public void a(b bVar) {
                this.f = bVar;
            }

            private void a(int i) {
                if (this.f != null) {
                    this.f.b(i);
                }
            }

            private void a(int i, float f, boolean z, int i2, boolean z2) {
                this.h = i;
                if (this.f != null) {
                    this.f.a(i, f, i2, z2);
                }
            }

            private void a(int i, float f, boolean z) {
                if (this.f != null) {
                    this.f.a(i, f, z);
                }
            }

            private final boolean c(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (!this.d) {
                    int max = Math.max(motionEvent.getPointerCount(), motionEvent2.getPointerCount());
                    float x = motionEvent.getX();
                    float x2 = motionEvent2.getX();
                    float f3 = (float) (this.a / 3);
                    float f4 = 2.0f * f3;
                    if (x < f3 && x2 < f3) {
                        x2 = b(motionEvent, motionEvent2);
                        if (!this.c) {
                            this.c = true;
                            a(5);
                        }
                        a(5, x2, true, max, false);
                    } else if (x > f4 && x2 > f4) {
                        x2 = b(motionEvent, motionEvent2);
                        if (!this.c) {
                            this.c = true;
                            a(6);
                        }
                        a(6, x2, true, max, false);
                    }
                }
                return false;
            }

            private final float a(MotionEvent motionEvent, MotionEvent motionEvent2) {
                int i = this.a;
                if (i <= 0) {
                    return 0.0f;
                }
                return (motionEvent2.getX() - motionEvent.getX()) / ((float) i);
            }

            private final float b(MotionEvent motionEvent, MotionEvent motionEvent2) {
                int i = this.b;
                if (i <= 0) {
                    return 0.0f;
                }
                return (motionEvent2.getY() - motionEvent.getY()) / ((float) i);
            }

            public void b(MotionEvent motionEvent) {
                if (this.f != null) {
                    this.f.b(motionEvent);
                }
            }

            public void a(boolean z) {
                this.i = z;
            }
        }

        public a(Context context, a aVar, b bVar) {
            super(context, aVar);
            this.a = aVar;
            aVar.a(bVar);
        }

        public void a(boolean z) {
            this.b = z;
        }

        public void b(boolean z) {
            if (this.a != null) {
                this.a.a(z);
            }
        }

        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.a != null) {
                this.a.b(motionEvent);
            }
            if (motionEvent.getAction() == 1 && this.a != null && this.a.a(motionEvent)) {
                return true;
            }
            if (motionEvent.getAction() != 2 || this.b) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* compiled from: BL */
    public interface b {
        void a(int i, float f, int i2, boolean z);

        void a(int i, float f, boolean z);

        void b(int i);

        void b(MotionEvent motionEvent);

        void c(MotionEvent motionEvent);

        boolean q();

        boolean r();

        void w();
    }

    public GestureView(Context context) {
        super(context);
    }

    public GestureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GestureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setGestureEnabled(boolean z) {
        this.d = z;
        if (this.b != null) {
            this.b.a(z);
        }
    }

    public void setHorizontalGestureEnabled(boolean z) {
        this.e = z;
        if (this.b != null) {
            this.b.b(z);
        }
    }

    public void setTouchGestureListener(b bVar) {
        this.f = bVar;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            this.b = new a(getContext().getApplicationContext(), new a(width, height), bVar);
            this.b.a(this.d);
            this.b.b(this.e);
            this.c = new ekk(getContext(), this.g);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.b = new a(getContext().getApplicationContext(), new a(getWidth(), getHeight()), this.f);
            this.b.a(this.d);
            this.b.b(this.e);
            this.c = new ekk(getContext(), this.g);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        if (this.b != null) {
            onTouchEvent = this.b.onTouchEvent(motionEvent);
        } else {
            onTouchEvent = false;
        }
        if (this.c.a(motionEvent) || r0) {
            onTouchEvent = true;
        } else {
            onTouchEvent = false;
        }
        if (onTouchEvent || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
