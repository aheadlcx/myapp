package bili.bl;

import android.content.Context;
import android.text.TextUtils;
import com.bilibili.bililive.xplayer.view.Stage;

/* compiled from: BL */
public class ekn {
    public boolean a;
    public boolean b;
    public Stage c;
    public String d;
    public String e;

    public ekn(Stage stage, boolean z, String str) {
        this.c = stage;
        this.a = z;
        this.d = str;
    }

    public ekn(Stage stage, boolean z, boolean z2, String str) {
        this.c = stage;
        this.a = z;
        this.b = z2;
        this.d = str;
    }

    public final StringBuilder a(Context context, StringBuilder stringBuilder) {
        stringBuilder.append(this.d);
        if (!this.a) {
            stringBuilder.append(context.getString(2131689627));
            if (this.b && !TextUtils.isEmpty(this.e)) {
                stringBuilder.append(this.e);
            }
        } else if (!TextUtils.isEmpty(this.e)) {
            stringBuilder.append(context.getString(2131689627));
            stringBuilder.append(this.e);
        }
        stringBuilder.append('\n');
        return stringBuilder;
    }
}
