package bili4.tv.danmaku.bili.ui.game.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import bl.fcz;
import bl.hae;
import bl.kyo;
import bl.lfh;

/* compiled from: BL */
public class GameMessageActivity extends kyo {
    private lfh b;

    public static Intent a(Context context) {
        return new Intent(context, GameMessageActivity.class);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427623);
        o();
        p();
        B_().a(2131693717);
        q();
        fcz.a(hae.a(new byte[]{(byte) 104, (byte) 96, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106, (byte) 90, (byte) 102, (byte) 105, (byte) 108, (byte) 102, (byte) 110}), new String[0]);
    }

    private void q() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.b = (lfh) supportFragmentManager.findFragmentByTag(lfh.b);
        if (this.b == null) {
            this.b = lfh.a();
            supportFragmentManager.beginTransaction().add(2131297107, this.b, lfh.b).commit();
        }
    }
}
