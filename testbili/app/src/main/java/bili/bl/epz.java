package bili.bl;

import android.net.Uri;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.column.ui.upper.ColumnArticleEditActivity;

/* compiled from: BL */
public class epz extends fml {
    public epz(ColumnArticleEditActivity columnArticleEditActivity) {
        super(columnArticleEditActivity);
    }

    public void y_() {
        super.y_();
        e();
    }

    public void a(int i, int i2) {
        if (this.e instanceof ColumnArticleEditActivity) {
            ((ColumnArticleEditActivity) this.e).a(i, i2);
        }
    }

    public void ac_() {
        if (this.e instanceof ColumnArticleEditActivity) {
            ((ColumnArticleEditActivity) this.e).k();
        }
    }

    public void a(boolean z) {
        if (this.e instanceof ColumnArticleEditActivity) {
            ((ColumnArticleEditActivity) this.e).a(z);
        }
    }

    public void c() {
        if (this.e instanceof ColumnArticleEditActivity) {
            ((ColumnArticleEditActivity) this.e).l();
        }
    }

    public void a(Uri uri, boolean z) {
        if (this.e instanceof ColumnArticleEditActivity) {
            ((ColumnArticleEditActivity) this.e).a(uri, z);
        }
    }

    private void e() {
        if (this.e instanceof ColumnArticleEditActivity) {
            ((ColumnArticleEditActivity) this.e).n();
        }
    }

    public JSONObject ad_() {
        JSONObject ad_ = super.ad_();
        ad_.a(hae.a(new byte[]{(byte) 103, (byte) 112, (byte) 108, (byte) 105, (byte) 97}), Integer.valueOf(ams.c()));
        return ad_;
    }
}
