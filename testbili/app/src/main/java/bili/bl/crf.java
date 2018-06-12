package bili.bl;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: BL */
public abstract class crf extends cma implements clx {
    protected boolean a = false;
    protected AlertDialog b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EventBus.getDefault().register(this);
    }

    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        this.a = false;
    }

    protected void onPause() {
        super.onPause();
        this.a = false;
    }

    public void onResume() {
        super.onResume();
        this.a = true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void a(cmw bl_cmw) {
        if (this.a) {
            ComponentName componentName = ((RunningTaskInfo) ((ActivityManager) getSystemService(hae.a(new byte[]{(byte) 100, (byte) 102, (byte) 113, (byte) 108, (byte) 115, (byte) 108, (byte) 113, (byte) 124}))).getRunningTasks(1).get(0)).topActivity;
            if (!cdn.b().s() && componentName.getClassName().equals(getLocalClassName()) && cem.a().b()) {
                h();
            }
        }
    }

    protected void h() {
        if (!cdn.b().s()) {
            if (this.b == null || !this.b.isShowing()) {
                this.b = new Builder(this).setCancelable(false).setTitle(2131692034).setMessage(2131692033).setPositiveButton(2131692031, new OnClickListener(this) {
                    final /* synthetic */ crf a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        cdn.b().q();
                    }
                }).setNegativeButton(2131690540, new OnClickListener(this) {
                    final /* synthetic */ crf a;

                    {
                        this.a = r1;
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
                this.b.show();
            }
        }
    }

    public void a_(int i) {
        esu.b((Context) this, i);
    }

    public void a(String str) {
        esu.b((Context) this, str);
    }
}
