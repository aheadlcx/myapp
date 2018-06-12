package bili3.com.bilibili.column.ui.articlelist;

import android.os.Bundle;
import bl.fky;
import bl.hae;

/* compiled from: BL */
public class ColumnArticleListActivity extends fky {
    ColumnArticleListFragment a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131428546);
        String stringExtra = getIntent().getStringExtra(hae.a(new byte[]{(byte) 100, (byte) 119, (byte) 113, (byte) 108, (byte) 102, (byte) 105, (byte) 96, (byte) 73, (byte) 108, (byte) 118, (byte) 113, (byte) 76, (byte) 97}));
        this.a = (ColumnArticleListFragment) getSupportFragmentManager().findFragmentById(2131296458);
        this.a.a(stringExtra);
        this.a.h();
    }
}
