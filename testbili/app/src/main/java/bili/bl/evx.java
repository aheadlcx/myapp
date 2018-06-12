package bili.bl;

import android.app.Activity;
import android.content.Context;
import com.alipay.sdk.app.PayTask;
import com.bilibili.lib.bilipay.domain.bean.cashier.ChannelPayInfo;
import com.bilibili.lib.bilipay.domain.cashier.channel.PaymentChannel.PayStatus;
import java.util.concurrent.Callable;

/* compiled from: BL */
public class evx extends evy {
    protected boolean a = false;

    /* compiled from: BL */
    public static class a {
        public ps<fhk> a(final String str, final Activity activity) {
            return ps.a(new Callable<fhk>(this) {
                final /* synthetic */ a c;

                public /* synthetic */ Object call() throws Exception {
                    return a();
                }

                public fhk a() throws Exception {
                    fhk bl_fhk = new fhk(new PayTask(activity).pay(str, true));
                    bl_fhk.b();
                    return bl_fhk;
                }
            });
        }
    }

    public evx(Context context) {
        super(context);
    }

    public synchronized void a(ChannelPayInfo channelPayInfo, final ewc bl_ewc) {
        if (this.a) {
            if (bl_ewc != null) {
                bl_ewc.a(PayStatus.FAIL_REENTRANT, null, Integer.MIN_VALUE, null);
            }
        } else if (!a()) {
            new a().a(channelPayInfo.payChannelParam, (Activity) this.b).a(new pr<fhk, Void>(this) {
                final /* synthetic */ evx b;

                public /* synthetic */ Object a(ps psVar) throws Exception {
                    return b(psVar);
                }

                public Void b(ps<fhk> psVar) throws Exception {
                    this.b.a = false;
                    if (bl_ewc != null) {
                        if (psVar.e() || psVar.d()) {
                            bl_ewc.a(PayStatus.FAIL_BILIPAY_ERROR, null, Integer.MIN_VALUE, null);
                        } else {
                            PayStatus payStatus;
                            fhk bl_fhk = (fhk) psVar.f();
                            if (!bl_fhk.d) {
                                switch (bl_fhk.e) {
                                    case 4000:
                                        payStatus = PayStatus.FAIL_CHANNEL_ERROR;
                                        break;
                                    case 4001:
                                        payStatus = PayStatus.FAIL_ILLEGAL_ARGUMENT;
                                        break;
                                    case 6001:
                                        payStatus = PayStatus.FAIL_USER_CANCEL;
                                        break;
                                    case 6002:
                                        payStatus = PayStatus.FAIL_NET_ERROR;
                                        break;
                                    case 9000:
                                        payStatus = null;
                                        break;
                                    default:
                                        payStatus = null;
                                        break;
                                }
                            }
                            payStatus = PayStatus.SUC;
                            bl_ewc.a(payStatus, bl_fhk.b, bl_fhk.e, bl_fhk.a);
                        }
                    }
                    return null;
                }
            }, ps.b);
        } else if (bl_ewc != null) {
            bl_ewc.a(PayStatus.FAIL_BILIPAY_ERROR, null, Integer.MIN_VALUE, null);
        }
    }
}
