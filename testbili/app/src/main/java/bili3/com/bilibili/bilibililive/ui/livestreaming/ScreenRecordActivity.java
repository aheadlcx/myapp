package bili3.com.bilibili.bilibililive.ui.livestreaming;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import bl.bll;
import bl.cil;
import bl.cio;
import bl.clt;
import bl.cmf;
import bl.cnl;
import bl.cnn;
import bl.cno;
import bl.cow;
import bl.hae;
import com.bilibili.bilibililive.api.entity.LiveStreamingRoomInfo;
import com.bilibili.bilibililive.ui.common.dialog.BililiveAlertDialog;
import org.greenrobot.eventbus.EventBus;

/* compiled from: BL */
public class ScreenRecordActivity extends clt {
    private static final String c = hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106});
    private static final String d = hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 113, (byte) 106, (byte) 102, (byte) 106, (byte) 105});
    View a;
    TextView b;
    private LiveStreamingRoomInfo e;
    private boolean f = false;
    private OnClickListener g = new OnClickListener(this) {
        final /* synthetic */ ScreenRecordActivity a;

        {
            this.a = r1;
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == 2131300254) {
                this.a.g();
            } else if (id == 2131299299) {
                this.a.onPlayClick(view);
            } else {
                cow.a(view, 1000);
                if (id == 2131299971) {
                    this.a.h();
                } else if (id == 2131299978) {
                    this.a.k();
                } else if (id == 2131299977) {
                    this.a.l();
                } else if (id == 2131299972) {
                    this.a.m();
                } else if (id == 2131299969) {
                    this.a.n();
                }
            }
        }
    };

    /* compiled from: BL */
    class a implements com.bilibili.bilibililive.ui.common.dialog.BililiveAlertDialog.b {
        final /* synthetic */ ScreenRecordActivity a;

        a(ScreenRecordActivity screenRecordActivity) {
            this.a = screenRecordActivity;
        }

        public void onClick(BililiveAlertDialog bililiveAlertDialog) {
            bililiveAlertDialog.dismiss();
            this.a.q();
        }
    }

    /* compiled from: BL */
    class b extends ClickableSpan {
        final /* synthetic */ ScreenRecordActivity a;

        public b(ScreenRecordActivity screenRecordActivity) {
            this.a = screenRecordActivity;
        }

        public void onClick(View view) {
            this.a.startActivity(new Intent(this.a, ProtocolActivity.class));
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(this.a.getResources().getColor(2131099835));
        }
    }

    public static Intent a(Context context, LiveStreamingRoomInfo liveStreamingRoomInfo, boolean z) {
        Intent intent = new Intent(context, ScreenRecordActivity.class);
        intent.putExtra(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106}), liveStreamingRoomInfo);
        intent.putExtra(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 113, (byte) 106, (byte) 102, (byte) 106, (byte) 105}), z);
        return intent;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427414);
        Intent intent = getIntent();
        if (intent != null) {
            this.f = intent.getBooleanExtra(hae.a(new byte[]{(byte) 118, (byte) 109, (byte) 106, (byte) 114, (byte) 90, (byte) 112, (byte) 118, (byte) 96, (byte) 119, (byte) 90, (byte) 117, (byte) 119, (byte) 106, (byte) 113, (byte) 106, (byte) 102, (byte) 106, (byte) 105}), false);
        }
        o();
        p();
        getWindow().setWindowAnimations(2131755315);
        this.e = (LiveStreamingRoomInfo) getIntent().getParcelableExtra(hae.a(new byte[]{(byte) 119, (byte) 106, (byte) 106, (byte) 104, (byte) 90, (byte) 108, (byte) 107, (byte) 99, (byte) 106}));
    }

    private void o() {
        this.a = findViewById(2131299299);
        this.b = (TextView) findViewById(2131300641);
        this.a.setOnClickListener(this.g);
        this.b.setOnClickListener(this.g);
        findViewById(2131300254).setOnClickListener(this.g);
        findViewById(2131299971).setOnClickListener(this.g);
        findViewById(2131299978).setOnClickListener(this.g);
        findViewById(2131299977).setOnClickListener(this.g);
        findViewById(2131299972).setOnClickListener(this.g);
        findViewById(2131299969).setOnClickListener(this.g);
        if (this.f) {
            this.b.setVisibility(0);
            CharSequence spannableStringBuilder = new SpannableStringBuilder(getString(2131695220));
            spannableStringBuilder.setSpan(new b(this), 10, 18, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099835)), 10, 18, 33);
            this.b.setText(spannableStringBuilder);
            this.b.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        this.b.setVisibility(8);
    }

    private void p() {
        cno.a(this.a, cnn.c());
        cno.a(findViewById(2131296658), cnn.g() ? cnn.a() : -1);
    }

    public void onBackPressed() {
        super.onBackPressed();
        EventBus.getDefault().post(new cil());
    }

    public void g() {
        finish();
        EventBus.getDefault().post(new cil());
    }

    public void h() {
        cnl.a(this, this.e.roomId, this.e.face, this.e.title, this.e.uname, 1);
    }

    public void k() {
        cnl.a(this, this.e.roomId, this.e.face, this.e.title, this.e.uname, 3);
    }

    public void l() {
        cnl.a(this, this.e.roomId, this.e.face, this.e.title, this.e.uname, 2);
    }

    public void m() {
        cnl.a(this, this.e.roomId, this.e.face, this.e.title, this.e.uname, 4);
    }

    public void n() {
        cnl.a(this, this.e.roomId, this.e.face, this.e.title, this.e.uname, 5);
    }

    public void onPlayClick(View view) {
        cow.a(view);
        if (r()) {
            s();
        } else {
            q();
        }
    }

    private void q() {
        EventBus.getDefault().post(new cio());
        finish();
    }

    private static boolean r() {
        return cmf.a().c();
    }

    private void s() {
        boolean a = bll.a();
        boolean b = bll.b(this);
        com.bilibili.bilibililive.ui.common.dialog.BililiveAlertDialog.a a2 = new com.bilibili.bilibililive.ui.common.dialog.BililiveAlertDialog.a(this).a();
        int i = (a && b) ? 2131695294 : 2131695293;
        a2.b(i).a(2131690527, new a(this)).b(2131690526, null).b().show();
    }
}
