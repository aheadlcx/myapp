package bili3.com.bilibili.bilibililive.bililivefollowing.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.u;
import android.util.AttributeSet;
import bl.bss;
import bl.bss.c;
import bl.hae;
import bl.pe;

/* compiled from: BL */
public class GragRecyclerView extends RecyclerView {
    private pe H;
    private bss I;

    /* compiled from: BL */
    class a extends bl.pe.a {
        final /* synthetic */ GragRecyclerView a;
        private bss b;

        public a(GragRecyclerView gragRecyclerView, bss bl_bss) {
            this.a = gragRecyclerView;
            this.b = bl_bss;
        }

        public void a(RecyclerView recyclerView, u uVar, int i, u uVar2, int i2, int i3, int i4) {
            super.a(recyclerView, uVar, i, uVar2, i2, i3, i4);
        }

        public void b(u uVar, int i) {
            if (i != 0) {
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{1.0f, 1.2f});
                PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{1.0f, 1.2f});
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{1.0f, 0.5f});
                ObjectAnimator.ofPropertyValuesHolder(uVar.a, new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3}).setDuration(200).start();
            }
        }

        public void d(RecyclerView recyclerView, u uVar) {
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 93}), new float[]{1.2f, 1.0f});
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(hae.a(new byte[]{(byte) 118, (byte) 102, (byte) 100, (byte) 105, (byte) 96, (byte) 92}), new float[]{1.2f, 1.0f});
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(hae.a(new byte[]{(byte) 100, (byte) 105, (byte) 117, (byte) 109, (byte) 100}), new float[]{0.5f, 1.0f});
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(uVar.a, new PropertyValuesHolder[]{ofFloat, ofFloat2, ofFloat3}).setDuration(200);
            duration.addListener(new AnimatorListenerAdapter(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    this.a.a.I.c();
                }
            });
            duration.start();
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return true;
        }

        public int a(RecyclerView recyclerView, u uVar) {
            int i;
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                i = 15;
            } else {
                i = 3;
            }
            return bl.pe.a.b(i, 0);
        }

        public boolean b(RecyclerView recyclerView, u uVar, u uVar2) {
            this.b.e(uVar.g(), uVar2.g());
            return true;
        }

        public void a(u uVar, int i) {
            this.b.c(uVar.g());
        }
    }

    public GragRecyclerView(Context context) {
        this(context, null);
    }

    public GragRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GragRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAdapter(android.support.v7.widget.RecyclerView.a aVar) {
        super.setAdapter(aVar);
        if (aVar instanceof bss) {
            this.I = (bss) aVar;
            this.H = new pe(new a(this, this.I));
            this.H.a((RecyclerView) this);
            this.I.a(new c(this) {
                final /* synthetic */ GragRecyclerView a;

                {
                    this.a = r1;
                }

                public void a(bl.bss.a aVar, int i) {
                    this.a.H.b((u) aVar);
                }
            });
        }
    }
}
