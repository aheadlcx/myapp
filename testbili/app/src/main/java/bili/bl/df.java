package bili.bl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import bl.cg.d;

/* compiled from: BL */
public abstract class df extends cg {
    private static final String[] g = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    private int h = 3;

    /* compiled from: BL */
    static class a extends AnimatorListenerAdapter implements a, d {
        boolean a = false;
        private final View b;
        private final int c;
        private final ViewGroup d;
        private final boolean e;
        private boolean f;

        a(View view, int i, boolean z) {
            this.b = view;
            this.c = i;
            this.d = (ViewGroup) view.getParent();
            this.e = z;
            a(true);
        }

        public void onAnimationPause(Animator animator) {
            if (!this.a) {
                cy.a(this.b, this.c);
            }
        }

        public void onAnimationResume(Animator animator) {
            if (!this.a) {
                cy.a(this.b, 0);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        public void d(@NonNull cg cgVar) {
        }

        public void a(@NonNull cg cgVar) {
            a();
            cgVar.removeListener(this);
        }

        public void b(@NonNull cg cgVar) {
            a(false);
        }

        public void c(@NonNull cg cgVar) {
            a(true);
        }

        private void a() {
            if (!this.a) {
                cy.a(this.b, this.c);
                if (this.d != null) {
                    this.d.invalidate();
                }
            }
            a(false);
        }

        private void a(boolean z) {
            if (this.e && this.f != z && this.d != null) {
                this.f = z;
                cr.a(this.d, z);
            }
        }
    }

    /* compiled from: BL */
    static class b {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        private b() {
        }
    }

    public void a(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.h = i;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return g;
    }

    private void b(cm cmVar) {
        cmVar.a.put("android:visibility:visibility", Integer.valueOf(cmVar.b.getVisibility()));
        cmVar.a.put("android:visibility:parent", cmVar.b.getParent());
        Object obj = new int[2];
        cmVar.b.getLocationOnScreen(obj);
        cmVar.a.put("android:visibility:screenLocation", obj);
    }

    public void captureStartValues(@NonNull cm cmVar) {
        b(cmVar);
    }

    public void captureEndValues(@NonNull cm cmVar) {
        b(cmVar);
    }

    private b a(cm cmVar, cm cmVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.b = false;
        if (cmVar == null || !cmVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) cmVar.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) cmVar.a.get("android:visibility:parent");
        }
        if (cmVar2 == null || !cmVar2.a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f = null;
        } else {
            bVar.d = ((Integer) cmVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f = (ViewGroup) cmVar2.a.get("android:visibility:parent");
        }
        if (cmVar == null || cmVar2 == null) {
            if (cmVar == null && bVar.d == 0) {
                bVar.b = true;
                bVar.a = true;
            } else if (cmVar2 == null && bVar.c == 0) {
                bVar.b = false;
                bVar.a = true;
            }
        } else if (bVar.c == bVar.d && bVar.e == bVar.f) {
            return bVar;
        } else {
            if (bVar.c != bVar.d) {
                if (bVar.c == 0) {
                    bVar.b = false;
                    bVar.a = true;
                } else if (bVar.d == 0) {
                    bVar.b = true;
                    bVar.a = true;
                }
            } else if (bVar.f == null) {
                bVar.b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.b = true;
                bVar.a = true;
            }
        }
        return bVar;
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable cm cmVar, @Nullable cm cmVar2) {
        b a = a(cmVar, cmVar2);
        if (!a.a || (a.e == null && a.f == null)) {
            return null;
        }
        if (a.b) {
            return a(viewGroup, cmVar, a.c, cmVar2, a.d);
        }
        return b(viewGroup, cmVar, a.c, cmVar2, a.d);
    }

    public Animator a(ViewGroup viewGroup, cm cmVar, int i, cm cmVar2, int i2) {
        if ((this.h & 1) != 1 || cmVar2 == null) {
            return null;
        }
        if (cmVar == null) {
            View view = (View) cmVar2.b.getParent();
            if (a(a(view, false), getTransitionValues(view, false)).a) {
                return null;
            }
        }
        return a(viewGroup, cmVar2.b, cmVar, cmVar2);
    }

    public Animator a(ViewGroup viewGroup, View view, cm cmVar, cm cmVar2) {
        return null;
    }

    public Animator b(ViewGroup viewGroup, cm cmVar, int i, cm cmVar2, int i2) {
        Animator animator = null;
        if ((this.h & 2) == 2) {
            View view;
            int id;
            View view2 = cmVar != null ? cmVar.b : null;
            if (cmVar2 != null) {
                view = cmVar2.b;
            } else {
                view = null;
            }
            if (view == null || view.getParent() == null) {
                if (view != null) {
                    view2 = view;
                    view = null;
                } else {
                    if (view2 != null) {
                        if (view2.getParent() == null) {
                            view = null;
                        } else if (view2.getParent() instanceof View) {
                            view = (View) view2.getParent();
                            if (a(getTransitionValues(view, true), a(view, true)).a) {
                                if (view.getParent() == null) {
                                    id = view.getId();
                                    if (!(id == -1 || viewGroup.findViewById(id) == null || !this.e)) {
                                        view = view2;
                                    }
                                }
                                view = null;
                            } else {
                                view = cl.a(viewGroup, view2, view);
                            }
                            view2 = view;
                            view = null;
                        }
                    }
                    view = null;
                    view2 = null;
                }
            } else if (i2 == 4) {
                view2 = null;
            } else if (view2 == view) {
                view2 = null;
            } else {
                view = null;
            }
            if (view2 != null && cmVar != null) {
                int[] iArr = (int[]) cmVar.a.get("android:visibility:screenLocation");
                int i3 = iArr[0];
                id = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view2.offsetLeftAndRight((i3 - iArr2[0]) - view2.getLeft());
                view2.offsetTopAndBottom((id - iArr2[1]) - view2.getTop());
                final cq a = cr.a(viewGroup);
                a.a(view2);
                animator = b(viewGroup, view2, cmVar, cmVar2);
                if (animator == null) {
                    a.b(view2);
                } else {
                    animator.addListener(new AnimatorListenerAdapter(this) {
                        final /* synthetic */ df c;

                        public void onAnimationEnd(Animator animator) {
                            a.b(view2);
                        }
                    });
                }
            } else if (view != null) {
                int visibility = view.getVisibility();
                cy.a(view, 0);
                animator = b(viewGroup, view, cmVar, cmVar2);
                if (animator != null) {
                    d aVar = new a(view, i2, true);
                    animator.addListener(aVar);
                    bm.a(animator, aVar);
                    addListener(aVar);
                } else {
                    cy.a(view, visibility);
                }
            }
        }
        return animator;
    }

    public Animator b(ViewGroup viewGroup, View view, cm cmVar, cm cmVar2) {
        return null;
    }

    public boolean isTransitionRequired(cm cmVar, cm cmVar2) {
        if (cmVar == null && cmVar2 == null) {
            return false;
        }
        if (cmVar != null && cmVar2 != null && cmVar2.a.containsKey("android:visibility:visibility") != cmVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b a = a(cmVar, cmVar2);
        if (!a.a) {
            return false;
        }
        if (a.c == 0 || a.d == 0) {
            return true;
        }
        return false;
    }
}
