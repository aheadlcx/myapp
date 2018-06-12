package bili2.bl;

import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils.TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import bl.ilx.a;
import com.bilibili.lib.image.ScalableImageView;
import com.mall.domain.order.bean.OrderExtraData;
import com.mall.domain.order.bean.OrderExtraDataObj;
import com.mall.domain.order.list.bean.OrderListBean;
import com.mall.domain.order.list.bean.OrderListItemBean;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BL */
public class ima extends iog implements ikx {
    private ScalableImageView A;
    private TextView B;
    private TextView n;
    private TextView o;
    private RecyclerView p;
    private ikw q;
    private a r;
    private View s;
    private ScalableImageView t = ((ScalableImageView) this.s.findViewById(2131297907));
    private TextView u = ((TextView) this.s.findViewById(2131297913));
    private TextView v = ((TextView) this.s.findViewById(2131297919));
    private LinearLayout w = ((LinearLayout) this.s.findViewById(2131297921));
    private ily x;
    private Activity y;
    private long z;

    public ima(View view, Activity activity, a aVar) {
        super(view);
        this.y = activity;
        this.r = aVar;
        this.n = (TextView) view.findViewById(2131299116);
        this.o = (TextView) view.findViewById(2131299135);
        this.A = (ScalableImageView) view.findViewById(2131299100);
        this.B = (TextView) view.findViewById(2131299114);
        this.p = (RecyclerView) view.findViewById(2131299095);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        linearLayoutManager.b(0);
        this.p.setLayoutManager(linearLayoutManager);
        this.s = view.findViewById(2131299094);
    }

    public void a(OrderListBean orderListBean, a aVar) {
        this.r = aVar;
        if (orderListBean != null) {
            CharSequence a;
            this.z = orderListBean.order_id;
            d(orderListBean);
            e(orderListBean);
            if (orderListBean.status == 1) {
                this.n.setSelected(true);
                a = orderListBean.extra_data != null ? a(orderListBean, orderListBean.payTimeLimit) : ieb.a().h().getResources().getString(2131692952, new Object[]{iop.b(orderListBean.payTimeLimit)});
            } else {
                this.n.setSelected(false);
                a = orderListBean.status_name == null ? gmy.d : orderListBean.status_name;
            }
            this.n.setText(a);
            a(orderListBean.count, orderListBean.pay_money, orderListBean.order_type);
            this.q = new ikw(this.y, this.a, orderListBean.order_type, this.r);
            this.q.a(orderListBean.orderButton, orderListBean.order_id);
            this.q.a((ikx) this);
            a(orderListBean);
        }
    }

    private String a(OrderListBean orderListBean, long j) {
        String str = gmy.d;
        OrderExtraData orderExtraData = orderListBean.extra_data;
        if (orderExtraData.cartOrderType != 2 && orderExtraData.cartOrderType != 3) {
            return ieb.a().h().getResources().getString(2131692952, new Object[]{iop.b(j)});
        } else if (orderExtraData.extDataObj == null) {
            return str;
        } else {
            OrderExtraDataObj orderExtraDataObj = orderExtraData.extDataObj;
            if (orderExtraData.subStatus == 1) {
                if (orderExtraData.cartOrderType == 3) {
                    return iop.b(2131692949);
                }
                return ieb.a().h().getResources().getString(2131692955, new Object[]{iop.b(orderListBean.payTimeLimit)});
            } else if (orderExtraData.subStatus == 2) {
                return ieb.a().h().getResources().getString(2131692950, new Object[]{iop.a(orderExtraDataObj.frontMoney, 2)});
            } else if (orderExtraData.subStatus == 3) {
                return ieb.a().h().getResources().getString(2131692951, new Object[]{iop.b(orderListBean.payTimeLimit)});
            } else if (orderExtraData.subStatus == 4) {
                return ieb.a().h().getResources().getString(2131692956, new Object[]{iop.b(orderListBean.payTimeLimit)});
            } else if (orderExtraData.subStatus == 5) {
                return iop.b(2131692948);
            } else {
                return str;
            }
        }
    }

    private void a(int i, double d, int i2) {
        String str;
        if (i2 == 1) {
            str = i + "\u5f20\u7968 \u5408\u8ba1\uff1a\u00a5";
        } else {
            str = i + "\u4ef6\u5546\u54c1 \u5408\u8ba1\uff1a\u00a5";
        }
        String b = iop.b(d);
        CharSequence charSequence = str + iop.a(d, 2);
        if (d < 1.0E-6d) {
            charSequence = str + "0.00";
        }
        int b2 = ioo.b(ieb.a().h(), 16.0f);
        CharSequence spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new AbsoluteSizeSpan(b2), str.length(), str.length() + b.length(), 34);
        this.o.setText(spannableString);
    }

    private void a(OrderListBean orderListBean) {
        if (orderListBean != null && orderListBean.items != null) {
            if (orderListBean.order_type != 2) {
                this.s.setVisibility(0);
                this.p.setVisibility(8);
                b(orderListBean);
            } else if (orderListBean.items.size() == 1) {
                this.s.setVisibility(0);
                this.p.setVisibility(8);
                b(orderListBean);
            } else {
                this.s.setVisibility(8);
                this.p.setVisibility(0);
                c(orderListBean);
            }
        }
    }

    private void b(final OrderListBean orderListBean) {
        List list = orderListBean.items;
        final String str = orderListBean.order_detail_url;
        if (list != null && list.size() != 0) {
            CharSequence charSequence;
            OrderListItemBean orderListItemBean = (OrderListItemBean) list.get(0);
            idu.a(orderListItemBean.item_logo, this.t);
            this.u.setText(orderListItemBean.item_name == null ? gmy.d : orderListItemBean.item_name);
            if (this.w != null) {
                this.w.removeAllViews();
            }
            if (orderListItemBean.extra_data == null || orderListItemBean.extra_data.labels == null || orderListItemBean.extra_data.labels.size() <= 0) {
                this.w.setVisibility(8);
            } else {
                this.u.setMaxLines(1);
                this.u.setEllipsize(TruncateAt.END);
                List list2 = orderListItemBean.extra_data.labels;
                if (list2 != null && list2.size() > 0) {
                    for (int i = 0; i < list2.size(); i++) {
                        View inflate = LayoutInflater.from(this.y).inflate(2131429208, null, false);
                        ((TextView) inflate.findViewById(2131299173)).setText((CharSequence) list2.get(i));
                        if (i == 0) {
                            this.w.addView(inflate);
                        } else {
                            LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            layoutParams.setMargins(10, 0, 0, 0);
                            inflate.setLayoutParams(layoutParams);
                            this.w.addView(inflate);
                        }
                    }
                }
                this.w.setVisibility(0);
            }
            String str2 = gmy.d;
            if (orderListItemBean.extra_data == null || orderListItemBean.extra_data.skuSpec == null) {
                Object obj = str2;
            } else {
                charSequence = orderListItemBean.extra_data.skuSpec;
            }
            this.v.setText(charSequence);
            this.s.setOnClickListener(new OnClickListener(this) {
                final /* synthetic */ ima c;

                public void onClick(View view) {
                    Map hashMap = new HashMap();
                    hashMap.put("id", gmy.d + orderListBean.order_id);
                    if (orderListBean.order_type == 1) {
                        hashMap.put("source", "1");
                    } else {
                        hashMap.put("source", "0");
                    }
                    ien.c(2131693142, hashMap);
                    this.c.r.c(str);
                }
            });
        }
    }

    private void c(OrderListBean orderListBean) {
        List list = orderListBean.items;
        String str = orderListBean.order_detail_url;
        if (this.y != null) {
            if (this.x == null) {
                this.x = new ily(this.y.getLayoutInflater(), this.r);
            }
            this.p.setAdapter(this.x);
            this.x.a(list, str);
            this.x.f();
        }
    }

    public boolean a(View view, String str) {
        if (str == null || !str.equals("HANDLE_QUERY_EXPRESS")) {
            return false;
        }
        this.r.e(this.z);
        return true;
    }

    private void d(final OrderListBean orderListBean) {
        this.B.setText(orderListBean.shopName);
        this.B.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ima b;

            public void onClick(View view) {
                Map hashMap = new HashMap();
                hashMap.put("id", gmy.d + orderListBean.order_id);
                if (orderListBean.order_type == 1) {
                    hashMap.put("source", "1");
                } else {
                    hashMap.put("source", "0");
                }
                ien.c(2131693147, hashMap);
                this.b.r.c(orderListBean.shopUrl);
            }
        });
    }

    private void e(final OrderListBean orderListBean) {
        idu.a(orderListBean.shopLogo, this.A);
        this.A.setOnClickListener(new OnClickListener(this) {
            final /* synthetic */ ima b;

            public void onClick(View view) {
                Map hashMap = new HashMap();
                hashMap.put("id", gmy.d + orderListBean.order_id);
                if (orderListBean.order_type == 1) {
                    hashMap.put("source", "1");
                } else {
                    hashMap.put("source", "0");
                }
                ien.c(2131693147, hashMap);
                this.b.r.c(orderListBean.shopUrl);
            }
        });
    }
}
