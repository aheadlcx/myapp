package bili3.com.bilibili.lib.bilipay.ui.wallet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.i;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bl.ewx;
import bl.exv;
import bl.fji;
import bl.hae;
import bl.zy;
import com.bilibili.lib.bilipay.domain.bean.wallet.QueryWalletPanelParam;
import com.bilibili.lib.bilipay.domain.bean.wallet.QueryWalletRecordParam;
import tv.danmaku.bili.widget.PagerSlidingTabStrip;

/* compiled from: BL */
public class BcoinRecordActivity extends ewx {
    public static final String d = hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 76, (byte) 107, (byte) 99, (byte) 106});
    public static final String e = hae.a(new byte[]{(byte) 113, (byte) 100, (byte) 103, (byte) 76, (byte) 107, (byte) 97, (byte) 96, (byte) 125});
    private View f;
    private PagerSlidingTabStrip g;
    private ViewPager h;
    private QueryWalletRecordParam i;
    private int j = 0;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = new QueryWalletRecordParam();
        if (getIntent() != null) {
            Object stringExtra = getIntent().getStringExtra(hae.a(new byte[]{(byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 76, (byte) 107, (byte) 99, (byte) 106}));
            this.j = getIntent().getIntExtra(hae.a(new byte[]{(byte) 113, (byte) 100, (byte) 103, (byte) 76, (byte) 107, (byte) 97, (byte) 96, (byte) 125}), 0);
            if (!TextUtils.isEmpty(stringExtra)) {
                QueryWalletPanelParam queryWalletPanelParam = (QueryWalletPanelParam) zy.a(stringExtra, QueryWalletPanelParam.class);
                this.i.accessKey = queryWalletPanelParam.accessKey;
                this.i.traceId = queryWalletPanelParam.traceId;
            }
            if (getIntent().getData() == null || this.j != 0) {
                this.j = 0;
            } else {
                this.j = Integer.valueOf(getIntent().getData().getQueryParameter(LogBuilder.KEY_TYPE)).intValue();
                if (this.j == 0 && bundle != null) {
                    this.j = bundle.getInt(LogBuilder.KEY_TYPE);
                }
            }
        }
        if (TextUtils.isEmpty(this.i.accessKey)) {
            this.i.accessKey = (String) fji.a().c(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 106, (byte) 107, (byte) 63, (byte) 42, (byte) 42, (byte) 104, (byte) 100, (byte) 108, (byte) 107, (byte) 42, (byte) 100, (byte) 102, (byte) 102, (byte) 106, (byte) 112, (byte) 107, (byte) 113, (byte) 42, (byte) 100, (byte) 102, (byte) 102, (byte) 96, (byte) 118, (byte) 118, (byte) 40, (byte) 110, (byte) 96, (byte) 124, (byte) 42}));
        }
        this.i.platformType = 2;
        this.i.sdkVersion = hae.a(new byte[]{(byte) 52, (byte) 43, (byte) 53, (byte) 43, (byte) 49});
        this.i.timestamp = System.currentTimeMillis();
        this.i.currentPage = 1;
        this.i.pageSize = 20;
        this.g = (PagerSlidingTabStrip) this.f.findViewById(2131300497);
        this.h = (ViewPager) this.f.findViewById(2131299183);
        this.h.setAdapter(new exv(this, getSupportFragmentManager(), this.i));
        this.h.setCurrentItem(this.j);
        this.g.setViewPager(this.h);
        this.g.setOnPageChangeListener(new i(this) {
            final /* synthetic */ BcoinRecordActivity a;

            {
                this.a = r1;
            }

            public void onPageSelected(int i) {
            }
        });
    }

    protected View a(@NonNull ViewGroup viewGroup) {
        this.f = getLayoutInflater().inflate(2131428796, viewGroup);
        return this.f;
    }

    protected String m() {
        return getString(2131694104);
    }
}
