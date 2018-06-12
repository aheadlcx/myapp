package bili4.tv.danmaku.bili.ui.wallet.bp;

import android.widget.Button;
import android.widget.TextView;
import bl.hae;
import bl.py;
import butterknife.Unbinder;
import butterknife.internal.Finder;

/* compiled from: BL */
public class RechargeOrderDetailFragment$$ViewBinder<T extends RechargeOrderDetailFragment> implements py<T> {

    /* compiled from: BL */
    public static class a<T extends RechargeOrderDetailFragment> implements Unbinder {
        protected T b;

        protected a(T t, Finder finder, Object obj) {
            this.b = t;
            t.mOrderNoView = (TextView) finder.a(obj, 2131299102, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 74, (byte) 119, (byte) 97, (byte) 96, (byte) 119, (byte) 75, (byte) 106, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 34}), TextView.class);
            t.mOrderTitle = (TextView) finder.a(obj, 2131299134, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 74, (byte) 119, (byte) 97, (byte) 96, (byte) 119, (byte) 81, (byte) 108, (byte) 113, (byte) 105, (byte) 96, (byte) 34}), TextView.class);
            t.mCreateTimeView = (TextView) finder.a(obj, 2131297200, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 70, (byte) 119, (byte) 96, (byte) 100, (byte) 113, (byte) 96, (byte) 81, (byte) 108, (byte) 104, (byte) 96, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 34}), TextView.class);
            t.mPayChannelView = (TextView) finder.a(obj, 2131296882, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 85, (byte) 100, (byte) 124, (byte) 70, (byte) 109, (byte) 100, (byte) 107, (byte) 107, (byte) 96, (byte) 105, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 34}), TextView.class);
            t.mPayMoneyView = (TextView) finder.a(obj, 2131299234, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 85, (byte) 100, (byte) 124, (byte) 72, (byte) 106, (byte) 107, (byte) 96, (byte) 124, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 34}), TextView.class);
            t.mPayBpView = (TextView) finder.a(obj, 2131299223, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 85, (byte) 100, (byte) 124, (byte) 71, (byte) 117, (byte) 83, (byte) 108, (byte) 96, (byte) 114, (byte) 34}), TextView.class);
            t.mButton = (Button) finder.a(obj, 2131296745, hae.a(new byte[]{(byte) 99, (byte) 108, (byte) 96, (byte) 105, (byte) 97, (byte) 37, (byte) 34, (byte) 104, (byte) 71, (byte) 112, (byte) 113, (byte) 113, (byte) 106, (byte) 107, (byte) 34}), Button.class);
        }

        public void a() {
            RechargeOrderDetailFragment rechargeOrderDetailFragment = this.b;
            if (rechargeOrderDetailFragment == null) {
                throw new IllegalStateException(hae.a(new byte[]{(byte) 71, (byte) 108, (byte) 107, (byte) 97, (byte) 108, (byte) 107, (byte) 98, (byte) 118, (byte) 37, (byte) 100, (byte) 105, (byte) 119, (byte) 96, (byte) 100, (byte) 97, (byte) 124, (byte) 37, (byte) 102, (byte) 105, (byte) 96, (byte) 100, (byte) 119, (byte) 96, (byte) 97, (byte) 43}));
            }
            rechargeOrderDetailFragment.mOrderNoView = null;
            rechargeOrderDetailFragment.mOrderTitle = null;
            rechargeOrderDetailFragment.mCreateTimeView = null;
            rechargeOrderDetailFragment.mPayChannelView = null;
            rechargeOrderDetailFragment.mPayMoneyView = null;
            rechargeOrderDetailFragment.mPayBpView = null;
            rechargeOrderDetailFragment.mButton = null;
            this.b = null;
        }
    }

    public Unbinder a(Finder finder, T t, Object obj) {
        return new a(t, finder, obj);
    }
}
