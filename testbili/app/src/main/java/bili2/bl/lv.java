package bili2.bl;

import android.content.Context;
import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;
import bl.hi.b;

@RequiresApi(16)
@RestrictTo({Scope.LIBRARY_GROUP})
/* compiled from: BL */
class lv extends lu {

    /* compiled from: BL */
    class a extends a implements VisibilityListener {
        b c;
        final /* synthetic */ lv d;

        public a(lv lvVar, Context context, ActionProvider actionProvider) {
            this.d = lvVar;
            super(lvVar, context, actionProvider);
        }

        public View a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public boolean b() {
            return this.a.overridesItemVisibility();
        }

        public boolean c() {
            return this.a.isVisible();
        }

        public void a(b bVar) {
            VisibilityListener visibilityListener;
            this.c = bVar;
            ActionProvider actionProvider = this.a;
            if (bVar == null) {
                visibilityListener = null;
            }
            actionProvider.setVisibilityListener(visibilityListener);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.c != null) {
                this.c.a(z);
            }
        }
    }

    lv(Context context, fh fhVar) {
        super(context, fhVar);
    }

    a a(ActionProvider actionProvider) {
        return new a(this, this.a, actionProvider);
    }
}
