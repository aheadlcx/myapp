package bili.bl;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bilibili.bilibililive.im.protobuf.conveyor.priority.PriorityID;
import com.bilibili.upper.videoup.model.TaskMessage;
import com.bilibili.upper.videoup.model.TaskStep;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import tv.danmaku.frontia.SyncPluginManager.Mode;

/* compiled from: BL */
public class ad {
    private static final int[] a = new int[]{0, 4, 8};
    private static SparseIntArray c = new SparseIntArray();
    private HashMap<Integer, a> b = new HashMap();

    /* compiled from: BL */
    static class a {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public float R;
        public boolean S;
        public float T;
        public float U;
        public float V;
        public float W;
        public float X;
        public float Y;
        public float Z;
        boolean a;
        public float aa;
        public float ab;
        public float ac;
        public int ad;
        public int ae;
        public int af;
        public int ag;
        public int ah;
        public int ai;
        public int b;
        public int c;
        int d;
        public int e;
        public int f;
        public float g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public float u;
        public float v;
        public String w;
        public int x;
        public int y;
        public int z;

        private a() {
            this.a = false;
            this.e = -1;
            this.f = -1;
            this.g = -1.0f;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 0.5f;
            this.v = 0.5f;
            this.w = null;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = 0;
            this.H = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = 0.0f;
            this.O = 0.0f;
            this.P = 0;
            this.Q = 0;
            this.R = 1.0f;
            this.S = false;
            this.T = 0.0f;
            this.U = 0.0f;
            this.V = 0.0f;
            this.W = 1.0f;
            this.X = 1.0f;
            this.Y = 0.0f;
            this.Z = 0.0f;
            this.aa = 0.0f;
            this.ab = 0.0f;
            this.ac = 0.0f;
            this.ad = -1;
            this.ae = -1;
            this.af = -1;
            this.ag = -1;
            this.ah = -1;
            this.ai = -1;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return a();
        }

        public a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            aVar.c = this.c;
            aVar.e = this.e;
            aVar.f = this.f;
            aVar.g = this.g;
            aVar.h = this.h;
            aVar.i = this.i;
            aVar.j = this.j;
            aVar.k = this.k;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.n = this.n;
            aVar.o = this.o;
            aVar.p = this.p;
            aVar.q = this.q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.z = this.z;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.aa = this.aa;
            aVar.ab = this.ab;
            aVar.ac = this.ac;
            aVar.ad = this.ad;
            aVar.ae = this.ae;
            aVar.af = this.af;
            aVar.ag = this.ag;
            aVar.ah = this.ah;
            aVar.ai = this.ai;
            return aVar;
        }

        private void a(int i, android.support.constraint.ConstraintLayout.a aVar) {
            this.d = i;
            this.h = aVar.d;
            this.i = aVar.e;
            this.j = aVar.f;
            this.k = aVar.g;
            this.l = aVar.h;
            this.m = aVar.i;
            this.n = aVar.j;
            this.o = aVar.k;
            this.p = aVar.l;
            this.q = aVar.m;
            this.r = aVar.n;
            this.s = aVar.o;
            this.t = aVar.p;
            this.u = aVar.w;
            this.v = aVar.x;
            this.w = aVar.y;
            this.x = aVar.L;
            this.y = aVar.M;
            this.z = aVar.N;
            this.g = aVar.c;
            this.e = aVar.a;
            this.f = aVar.b;
            this.b = aVar.width;
            this.c = aVar.height;
            this.A = aVar.leftMargin;
            this.B = aVar.rightMargin;
            this.C = aVar.topMargin;
            this.D = aVar.bottomMargin;
            this.N = aVar.C;
            this.O = aVar.B;
            this.Q = aVar.E;
            this.P = aVar.D;
            this.ad = aVar.F;
            this.ae = aVar.G;
            this.af = aVar.J;
            this.ag = aVar.K;
            this.ah = aVar.H;
            this.ai = aVar.I;
            if (VERSION.SDK_INT >= 17) {
                this.E = aVar.getMarginEnd();
                this.F = aVar.getMarginStart();
            }
        }

        public void a(android.support.constraint.ConstraintLayout.a aVar) {
            aVar.d = this.h;
            aVar.e = this.i;
            aVar.f = this.j;
            aVar.g = this.k;
            aVar.h = this.l;
            aVar.i = this.m;
            aVar.j = this.n;
            aVar.k = this.o;
            aVar.l = this.p;
            aVar.m = this.q;
            aVar.n = this.r;
            aVar.o = this.s;
            aVar.p = this.t;
            aVar.leftMargin = this.A;
            aVar.rightMargin = this.B;
            aVar.topMargin = this.C;
            aVar.bottomMargin = this.D;
            aVar.u = this.M;
            aVar.v = this.L;
            aVar.w = this.u;
            aVar.x = this.v;
            aVar.y = this.w;
            aVar.L = this.x;
            aVar.M = this.y;
            aVar.C = this.N;
            aVar.B = this.O;
            aVar.E = this.Q;
            aVar.D = this.P;
            aVar.F = this.ad;
            aVar.G = this.ae;
            aVar.J = this.af;
            aVar.K = this.ag;
            aVar.H = this.ah;
            aVar.I = this.ai;
            aVar.N = this.z;
            aVar.c = this.g;
            aVar.a = this.e;
            aVar.b = this.f;
            aVar.width = this.b;
            aVar.height = this.c;
            if (VERSION.SDK_INT >= 17) {
                aVar.setMarginStart(this.F);
                aVar.setMarginEnd(this.E);
            }
            aVar.a();
        }
    }

    static {
        c.append(40, 25);
        c.append(41, 26);
        c.append(43, 29);
        c.append(44, 30);
        c.append(49, 36);
        c.append(48, 35);
        c.append(26, 4);
        c.append(25, 3);
        c.append(23, 1);
        c.append(56, 6);
        c.append(57, 7);
        c.append(30, 17);
        c.append(31, 18);
        c.append(32, 19);
        c.append(0, 27);
        c.append(45, 32);
        c.append(46, 33);
        c.append(29, 10);
        c.append(28, 9);
        c.append(60, 13);
        c.append(63, 16);
        c.append(61, 14);
        c.append(58, 11);
        c.append(62, 15);
        c.append(59, 12);
        c.append(52, 40);
        c.append(38, 39);
        c.append(37, 41);
        c.append(51, 42);
        c.append(36, 20);
        c.append(50, 37);
        c.append(27, 5);
        c.append(39, 60);
        c.append(47, 60);
        c.append(42, 60);
        c.append(24, 60);
        c.append(22, 60);
        c.append(5, 24);
        c.append(7, 28);
        c.append(18, 31);
        c.append(19, 8);
        c.append(6, 34);
        c.append(8, 2);
        c.append(3, 23);
        c.append(4, 21);
        c.append(2, 22);
        c.append(9, 43);
        c.append(21, 44);
        c.append(16, 45);
        c.append(17, 46);
        c.append(14, 47);
        c.append(15, 48);
        c.append(10, 49);
        c.append(11, 50);
        c.append(12, 51);
        c.append(13, 52);
        c.append(20, 53);
        c.append(53, 54);
        c.append(33, 55);
        c.append(54, 56);
        c.append(34, 57);
        c.append(55, 58);
        c.append(35, 59);
        c.append(1, 38);
    }

    public void a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.b.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            android.support.constraint.ConstraintLayout.a aVar = (android.support.constraint.ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.b.containsKey(Integer.valueOf(id))) {
                this.b.put(Integer.valueOf(id), new a());
            }
            a aVar2 = (a) this.b.get(Integer.valueOf(id));
            aVar2.a(id, aVar);
            aVar2.G = childAt.getVisibility();
            if (VERSION.SDK_INT >= 17) {
                aVar2.R = childAt.getAlpha();
                aVar2.U = childAt.getRotationX();
                aVar2.V = childAt.getRotationY();
                aVar2.W = childAt.getScaleX();
                aVar2.X = childAt.getScaleY();
                aVar2.Y = childAt.getPivotX();
                aVar2.Z = childAt.getPivotY();
                aVar2.aa = childAt.getTranslationX();
                aVar2.ab = childAt.getTranslationY();
                if (VERSION.SDK_INT >= 21) {
                    aVar2.ac = childAt.getTranslationZ();
                    if (aVar2.S) {
                        aVar2.T = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
    }

    public void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.b.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (this.b.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                a aVar = (a) this.b.get(Integer.valueOf(id));
                android.support.constraint.ConstraintLayout.a aVar2 = (android.support.constraint.ConstraintLayout.a) childAt.getLayoutParams();
                aVar.a(aVar2);
                childAt.setLayoutParams(aVar2);
                childAt.setVisibility(aVar.G);
                if (VERSION.SDK_INT >= 17) {
                    childAt.setAlpha(aVar.R);
                    childAt.setRotationX(aVar.U);
                    childAt.setRotationY(aVar.V);
                    childAt.setScaleX(aVar.W);
                    childAt.setScaleY(aVar.X);
                    childAt.setPivotX(aVar.Y);
                    childAt.setPivotY(aVar.Z);
                    childAt.setTranslationX(aVar.aa);
                    childAt.setTranslationY(aVar.ab);
                    if (VERSION.SDK_INT >= 21) {
                        childAt.setTranslationZ(aVar.ac);
                        if (aVar.S) {
                            childAt.setElevation(aVar.T);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.b.get(num);
            if (aVar3.a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                LayoutParams b = constraintLayout.b();
                aVar3.a(b);
                constraintLayout.addView(guideline, b);
            }
        }
    }

    public void a(int i, int i2, int i3, int i4, int i5) {
        if (!this.b.containsKey(Integer.valueOf(i))) {
            this.b.put(Integer.valueOf(i), new a());
        }
        a aVar = (a) this.b.get(Integer.valueOf(i));
        switch (i2) {
            case Mode.UPDATE /*1*/:
                if (i4 == 1) {
                    aVar.h = i3;
                    aVar.i = -1;
                } else if (i4 == 2) {
                    aVar.i = i3;
                    aVar.h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + a(i4) + " undefined");
                }
                aVar.A = i5;
                return;
            case TaskStep.TASK_STEP_TWO /*2*/:
                if (i4 == 1) {
                    aVar.j = i3;
                    aVar.k = -1;
                } else if (i4 == 2) {
                    aVar.k = i3;
                    aVar.j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
                aVar.B = i5;
                return;
            case TaskStep.TASK_STEP_THREE /*3*/:
                if (i4 == 3) {
                    aVar.l = i3;
                    aVar.m = -1;
                    aVar.p = -1;
                } else if (i4 == 4) {
                    aVar.m = i3;
                    aVar.l = -1;
                    aVar.p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
                aVar.C = i5;
                return;
            case TaskStep.TASK_STEP_FOUR /*4*/:
                if (i4 == 4) {
                    aVar.o = i3;
                    aVar.n = -1;
                    aVar.p = -1;
                } else if (i4 == 3) {
                    aVar.n = i3;
                    aVar.o = -1;
                    aVar.p = -1;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
                aVar.D = i5;
                return;
            case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                if (i4 == 5) {
                    aVar.p = i3;
                    aVar.o = -1;
                    aVar.n = -1;
                    aVar.l = -1;
                    aVar.m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + a(i4) + " undefined");
            case TaskMessage.UPLOAD_MSG_TASK_COMPLETE /*6*/:
                if (i4 == 6) {
                    aVar.r = i3;
                    aVar.q = -1;
                } else if (i4 == 7) {
                    aVar.q = i3;
                    aVar.r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
                aVar.F = i5;
                return;
            case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                if (i4 == 7) {
                    aVar.t = i3;
                    aVar.s = -1;
                } else if (i4 == 6) {
                    aVar.s = i3;
                    aVar.t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
                aVar.E = i5;
                return;
            default:
                throw new IllegalArgumentException(a(i2) + " to " + a(i4) + " unknown");
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        if (!this.b.containsKey(Integer.valueOf(i))) {
            this.b.put(Integer.valueOf(i), new a());
        }
        a aVar = (a) this.b.get(Integer.valueOf(i));
        switch (i2) {
            case Mode.UPDATE /*1*/:
                if (i4 == 1) {
                    aVar.h = i3;
                    aVar.i = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.i = i3;
                    aVar.h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + a(i4) + " undefined");
                }
            case TaskStep.TASK_STEP_TWO /*2*/:
                if (i4 == 1) {
                    aVar.j = i3;
                    aVar.k = -1;
                    return;
                } else if (i4 == 2) {
                    aVar.k = i3;
                    aVar.j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
            case TaskStep.TASK_STEP_THREE /*3*/:
                if (i4 == 3) {
                    aVar.l = i3;
                    aVar.m = -1;
                    aVar.p = -1;
                    return;
                } else if (i4 == 4) {
                    aVar.m = i3;
                    aVar.l = -1;
                    aVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
            case TaskStep.TASK_STEP_FOUR /*4*/:
                if (i4 == 4) {
                    aVar.o = i3;
                    aVar.n = -1;
                    aVar.p = -1;
                    return;
                } else if (i4 == 3) {
                    aVar.n = i3;
                    aVar.o = -1;
                    aVar.p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
            case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                if (i4 == 5) {
                    aVar.p = i3;
                    aVar.o = -1;
                    aVar.n = -1;
                    aVar.l = -1;
                    aVar.m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + a(i4) + " undefined");
            case TaskMessage.UPLOAD_MSG_TASK_COMPLETE /*6*/:
                if (i4 == 6) {
                    aVar.r = i3;
                    aVar.q = -1;
                    return;
                } else if (i4 == 7) {
                    aVar.q = i3;
                    aVar.r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
            case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                if (i4 == 7) {
                    aVar.t = i3;
                    aVar.s = -1;
                    return;
                } else if (i4 == 6) {
                    aVar.s = i3;
                    aVar.t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + a(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(a(i2) + " to " + a(i4) + " unknown");
        }
    }

    public void a(int i, int i2) {
        if (this.b.containsKey(Integer.valueOf(i))) {
            a aVar = (a) this.b.get(Integer.valueOf(i));
            switch (i2) {
                case Mode.UPDATE /*1*/:
                    aVar.i = -1;
                    aVar.h = -1;
                    aVar.A = -1;
                    aVar.H = -1;
                    return;
                case TaskStep.TASK_STEP_TWO /*2*/:
                    aVar.k = -1;
                    aVar.j = -1;
                    aVar.B = -1;
                    aVar.J = -1;
                    return;
                case TaskStep.TASK_STEP_THREE /*3*/:
                    aVar.m = -1;
                    aVar.l = -1;
                    aVar.C = -1;
                    aVar.I = -1;
                    return;
                case TaskStep.TASK_STEP_FOUR /*4*/:
                    aVar.n = -1;
                    aVar.o = -1;
                    aVar.D = -1;
                    aVar.K = -1;
                    return;
                case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                    aVar.p = -1;
                    return;
                case TaskMessage.UPLOAD_MSG_TASK_COMPLETE /*6*/:
                    aVar.q = -1;
                    aVar.r = -1;
                    aVar.F = -1;
                    aVar.M = -1;
                    return;
                case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                    aVar.s = -1;
                    aVar.t = -1;
                    aVar.E = -1;
                    aVar.L = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    private String a(int i) {
        switch (i) {
            case Mode.UPDATE /*1*/:
                return "left";
            case TaskStep.TASK_STEP_TWO /*2*/:
                return "right";
            case TaskStep.TASK_STEP_THREE /*3*/:
                return "top";
            case TaskStep.TASK_STEP_FOUR /*4*/:
                return "bottom";
            case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                return "baseline";
            case TaskMessage.UPLOAD_MSG_TASK_COMPLETE /*6*/:
                return "start";
            case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                return "end";
            default:
                return "undefined";
        }
    }

    public void a(Context context, int i) {
        XmlPullParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case PriorityID.PRIORITY_LOW /*0*/:
                        xml.getName();
                        break;
                    case TaskStep.TASK_STEP_TWO /*2*/:
                        String name = xml.getName();
                        a a = a(context, Xml.asAttributeSet(xml));
                        if (name.equalsIgnoreCase("Guideline")) {
                            a.a = true;
                        }
                        this.b.put(Integer.valueOf(a.d), a);
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable e) {
            ibn.a(e);
        } catch (Throwable e2) {
            ibn.a(e2);
        }
    }

    private static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    private a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.a.bu);
        a(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private void a(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (c.get(index)) {
                case Mode.UPDATE /*1*/:
                    aVar.p = a(typedArray, index, aVar.p);
                    break;
                case TaskStep.TASK_STEP_TWO /*2*/:
                    aVar.D = typedArray.getDimensionPixelSize(index, aVar.D);
                    break;
                case TaskStep.TASK_STEP_THREE /*3*/:
                    aVar.o = a(typedArray, index, aVar.o);
                    break;
                case TaskStep.TASK_STEP_FOUR /*4*/:
                    aVar.n = a(typedArray, index, aVar.n);
                    break;
                case TaskStep.TASK_STEP_UNKNOWN /*5*/:
                    aVar.w = typedArray.getString(index);
                    break;
                case TaskMessage.UPLOAD_MSG_TASK_COMPLETE /*6*/:
                    aVar.x = typedArray.getDimensionPixelOffset(index, aVar.x);
                    break;
                case TaskMessage.UPLOAD_MSG_TASK_PAUSE /*7*/:
                    aVar.y = typedArray.getDimensionPixelOffset(index, aVar.y);
                    break;
                case TaskMessage.UPLOAD_MSG_TASK_RESUME /*8*/:
                    aVar.E = typedArray.getDimensionPixelSize(index, aVar.E);
                    break;
                case TaskMessage.UPLOAD_MSG_TASK_START /*9*/:
                    aVar.n = a(typedArray, index, aVar.t);
                    break;
                case TaskMessage.UPLOAD_MSG_TASK_CANCLE /*10*/:
                    aVar.s = a(typedArray, index, aVar.s);
                    break;
                case TaskMessage.UPLOAD_MSG_TASK_ERROR /*11*/:
                    aVar.K = typedArray.getDimensionPixelSize(index, aVar.K);
                    break;
                case TaskMessage.UPLOAD_MSG_NET_ERROR /*12*/:
                    aVar.L = typedArray.getDimensionPixelSize(index, aVar.L);
                    break;
                case 13:
                    aVar.H = typedArray.getDimensionPixelSize(index, aVar.H);
                    break;
                case 14:
                    aVar.J = typedArray.getDimensionPixelSize(index, aVar.J);
                    break;
                case 15:
                    aVar.M = typedArray.getDimensionPixelSize(index, aVar.M);
                    break;
                case Mode.LOAD /*16*/:
                    aVar.I = typedArray.getDimensionPixelSize(index, aVar.I);
                    break;
                case 17:
                    aVar.e = typedArray.getDimensionPixelOffset(index, aVar.e);
                    break;
                case 18:
                    aVar.f = typedArray.getDimensionPixelOffset(index, aVar.f);
                    break;
                case 19:
                    aVar.g = typedArray.getFloat(index, aVar.g);
                    break;
                case 20:
                    aVar.u = typedArray.getFloat(index, aVar.u);
                    break;
                case 21:
                    aVar.c = typedArray.getLayoutDimension(index, aVar.c);
                    break;
                case 22:
                    aVar.G = typedArray.getInt(index, aVar.G);
                    aVar.G = a[aVar.G];
                    break;
                case 23:
                    aVar.b = typedArray.getLayoutDimension(index, aVar.b);
                    break;
                case 24:
                    aVar.A = typedArray.getDimensionPixelSize(index, aVar.A);
                    break;
                case 25:
                    aVar.h = a(typedArray, index, aVar.h);
                    break;
                case 26:
                    aVar.i = a(typedArray, index, aVar.i);
                    break;
                case 27:
                    aVar.z = typedArray.getInt(index, aVar.z);
                    break;
                case 28:
                    aVar.B = typedArray.getDimensionPixelSize(index, aVar.B);
                    break;
                case 29:
                    aVar.j = a(typedArray, index, aVar.j);
                    break;
                case 30:
                    aVar.k = a(typedArray, index, aVar.k);
                    break;
                case 31:
                    aVar.F = typedArray.getDimensionPixelSize(index, aVar.F);
                    break;
                case 32:
                    aVar.q = a(typedArray, index, aVar.q);
                    break;
                case 33:
                    aVar.r = a(typedArray, index, aVar.r);
                    break;
                case 34:
                    aVar.C = typedArray.getDimensionPixelSize(index, aVar.C);
                    break;
                case 35:
                    aVar.m = a(typedArray, index, aVar.m);
                    break;
                case 36:
                    aVar.l = a(typedArray, index, aVar.l);
                    break;
                case 37:
                    aVar.v = typedArray.getFloat(index, aVar.v);
                    break;
                case 38:
                    aVar.d = typedArray.getResourceId(index, aVar.d);
                    break;
                case 39:
                    aVar.O = typedArray.getFloat(index, aVar.O);
                    break;
                case 40:
                    aVar.N = typedArray.getFloat(index, aVar.N);
                    break;
                case 41:
                    aVar.P = typedArray.getInt(index, aVar.P);
                    break;
                case 42:
                    aVar.Q = typedArray.getInt(index, aVar.Q);
                    break;
                case 43:
                    aVar.R = typedArray.getFloat(index, aVar.R);
                    break;
                case 44:
                    aVar.S = true;
                    aVar.T = typedArray.getFloat(index, aVar.T);
                    break;
                case 45:
                    aVar.U = typedArray.getFloat(index, aVar.U);
                    break;
                case 46:
                    aVar.V = typedArray.getFloat(index, aVar.V);
                    break;
                case 47:
                    aVar.W = typedArray.getFloat(index, aVar.W);
                    break;
                case 48:
                    aVar.X = typedArray.getFloat(index, aVar.X);
                    break;
                case 49:
                    aVar.Y = typedArray.getFloat(index, aVar.Y);
                    break;
                case 50:
                    aVar.Z = typedArray.getFloat(index, aVar.Z);
                    break;
                case 51:
                    aVar.aa = typedArray.getFloat(index, aVar.aa);
                    break;
                case 52:
                    aVar.ab = typedArray.getFloat(index, aVar.ab);
                    break;
                case 53:
                    aVar.ac = typedArray.getFloat(index, aVar.ac);
                    break;
                case 60:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
            }
        }
    }
}
